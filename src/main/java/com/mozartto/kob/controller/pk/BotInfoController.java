package com.mozartto.kob.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController //返回信息用这个注解
@RequestMapping("/pk")
public class BotInfoController {
    @RequestMapping("getBotInfo/")
    public List<String> getBotInfo() {
        List<String> list = new LinkedList<>();
        list.add("sword");
        list.add("tiger");
        list.add("apple");

        return list;

    }
}
