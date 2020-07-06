package com.ruoyi;

import com.ruoyi.system.annotation.EnableRyFeignClients;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author KING
 * @version V1.0
 * @Title: MtmsApp
 * @Package com.ruoyi
 * @Description: mtms启动类(这里用一句话描述这个类的作用)
 * @date 2020/5/25 13:38
 */
@EnableDiscoveryClient
@EnableRyFeignClients
@MapperScan("com.ruoyi.*.mapper")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MtmsApp {

    public static void main(String[] args) {
        SpringApplication.run(MtmsApp.class, args);
    }
}
