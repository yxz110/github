package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubApplication.class, args);
        System.out.println("子鼠丑牛寅虎卯兔");
        System.out.println("辰龙巳蛇午马未羊");
        System.out.println("申猴酉鸡戌狗亥猪");
        System.out.println("这就是十二个生肖");
    }
}
