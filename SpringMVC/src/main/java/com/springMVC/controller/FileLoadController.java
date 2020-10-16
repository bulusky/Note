package com.springMVC.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * 文件上传
 * 原理：
 * application/x-www-form-urlencode：文件的传递形式为
 * key-value
 * mutipart/form-data会将文件变为多部分的mime格式
 */
@Controller
@RequestMapping("/fileLoad")
public class FileLoadController {
    /**
     * 传统方式
     * 文件不能上传，原因未知
     */
    @RequestMapping("/one")
    public String one(HttpServletRequest request) throws Exception {
        String path = request.getSession().getServletContext().getRealPath("/upLoads/");//传到upLoads
        File file = new File(path);
        if (!file.exists()) {
            //创建
            file.mkdirs();
        }
        //获取request对象，获取上传文件项
        DiskFileItemFactory factory = new DiskFileItemFactory();

        ServletFileUpload upload = new ServletFileUpload(factory);
        //
        List<FileItem> items = upload.parseRequest(request);

        for (FileItem item : items) {
            if (item.isFormField()) {
                //是普通表单
            } else {
                //上传文件
                String fileName = item.getName();
                String uuid = UUID.randomUUID().toString().replace("-", "");
                fileName = uuid + "_" + fileName;
                item.write(new File(path, fileName));
                item.delete();//临时文件大于10kb，删除
            }
        }
        return "success";
    }

    /**
     * springMVC方式：
     * 原理：传递的文件请求会经过前端控制器，配置一个文件解析器解析request文件，
     * MultipartFile upLoad:必须和表单的名字一样
     */
    @RequestMapping("/two")
    public String two(HttpServletRequest request, MultipartFile upLoad) throws IOException {
        String path = request.getSession().getServletContext().getRealPath("/upLoads/");//传到upLoads
        File file = new File(path);
        if (!file.exists()) {
            //创建
            file.mkdirs();
        }
        String loadName = upLoad.getName();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        loadName = uuid + "_" + loadName;
        upLoad.transferTo(new File(path, loadName));
        return "success";
    }

    /**
     * 跨服务器上传文件：
     * 应用服务器
     * 数据库服务器
     * 缓存和消息服务器
     * 文件服务器
     */
    @RequestMapping("/three")
    public String three(MultipartFile upLoad) throws IOException {
        //定义上传服务器的路径
        String path = "http://localhost:9090/";
        String loadName = upLoad.getName();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        loadName = uuid + "_" + loadName;
        //创建客户端对象
        Client client = Client.create();
        //获取服务器连接
        WebResource webResource = client.resource(path + loadName);
        //上传文件
        webResource.put(upLoad.getBytes());
        return "success";
    }
}
