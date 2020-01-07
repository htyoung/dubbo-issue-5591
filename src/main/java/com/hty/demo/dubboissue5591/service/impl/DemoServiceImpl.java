package com.hty.demo.dubboissue5591.service.impl;

import com.hty.demo.dubboissue5591.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello() {
        return "hello";
    }
}
