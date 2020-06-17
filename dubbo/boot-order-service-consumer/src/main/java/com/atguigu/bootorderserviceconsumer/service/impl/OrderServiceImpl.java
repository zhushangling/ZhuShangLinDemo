package com.atguigu.bootorderserviceconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class OrderServiceImpl implements OrderService {
    //引用暴露的服务，使用轮询负载均衡机制，2000ms如果还没有调用到就超时
    @Reference(loadbalance = "roundrobin",timeout = 2000)
    UserService userService;

    //指定在方法调用过程中出错时，走的方法
    @HystrixCommand(fallbackMethod = "initOrderFallback")
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id："+userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return userAddressList;
    }

    public List<UserAddress> initOrderFallback(String userId) {
        return Arrays.asList(new UserAddress(10, "测试地址", "1", "测试", "测试", "Y"));
    }



}
