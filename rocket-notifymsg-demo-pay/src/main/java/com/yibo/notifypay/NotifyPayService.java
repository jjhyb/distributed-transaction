package com.yibo.notifypay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: huangyibo
 * @Date: 2020/10/17 19:09
 * @Description:
 */

@MapperScan("com.yibo.notifypay.mapper")//扫描mybatis的指定包下的接口
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class NotifyPayService {

    public static void main(String[] args) {

        SpringApplication.run(NotifyPayService.class,args);
    }
}
