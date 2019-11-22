package com.ebaiyihui.servicefeign.controller;


import com.ebaiyihui.servicefeign.service.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: service-feign
 * @description: 测试fegin调用远程服务接口
 * @author: Liyp
 * @create: 2019-11-22 17:00
 **/
@RestController
public class HiController {
    @Autowired
    ScheduleServiceHi scheduleServiceHi;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
      return scheduleServiceHi.sayHiFromClientOne(name);
    }
}