package com.firstdata.gcs.controller;

import com.firstdata.gcs.model.Message;
import com.firstdata.gcs.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @Autowired
    DemoService service;


    @GetMapping("/demo")
    @ResponseBody
    public Message passMessage(@RequestParam(name = "name", defaultValue = "message") String message){
        return service.getMessage(message);
    }


}
