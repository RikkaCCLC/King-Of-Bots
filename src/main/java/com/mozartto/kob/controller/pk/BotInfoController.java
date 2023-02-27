package com.mozartto.kob.controller.pk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController //返回信息用这个注解
@RequestMapping("/pk/")
public class BotInfoController {
    @GetMapping("getbotinfo/")
    public Map<String,String> getBotInfo() {
        Map<String,String> bot1 = new HashMap<>();
        bot1.put("bot_name","tiger");
        bot1.put("bot_rating","1500");

        return bot1;

    }
}
