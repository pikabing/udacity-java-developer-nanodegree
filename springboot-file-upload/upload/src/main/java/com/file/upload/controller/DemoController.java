package com.file.upload.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class DemoController {
    Map<String, Object> result = new HashMap<>();
    /// Receive message
    @RequestMapping("/uploadFile")
    public Map<String, Object> upload(@RequestParam("attach")MultipartFile file) throws IOException {
    // File info
    System.out.println("File name = "  + file.getOriginalFilename());
    System.out.println("File type = " + file.getContentType());

    // Save to disk
    // file path example 1) Windows c:/, 3) Mac ~/Documents/
    String filePath = "C:\\Users\\pgcoo\\";
    file.transferTo(new File(filePath + file.getOriginalFilename()));
    result.put("Success", true);
    return result;
}
}