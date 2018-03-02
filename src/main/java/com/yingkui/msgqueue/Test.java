package com.yingkui.msgqueue;

import com.yingkui.rabbitmq.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {

   /* @Autowired
    public Producer produce;*/
    @Autowired
    HelloSender sender;
    @RequestMapping("/test")
    public void msg(){

//        produce.sendmessage("msg");
        sender.send();
    }
}
