package com.zpain.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjun
 * @date 2021/10/19  15:41
 */
@RestController
@Slf4j
public class OrderController {

    @GetMapping("/order")
    public String getOrder(@RequestParam("name") String name) {
        log.info("[getOrder]:{}",name);
        return "message:" + name;
    }

}
