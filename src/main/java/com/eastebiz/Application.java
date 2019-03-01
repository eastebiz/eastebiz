package com.eastebiz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//指定dao接口包所在的位置
@MapperScan("com.eastebiz.dao")
public class Application {
    public static void main(String[] args) {

        // 该方法为启动Springboot项目
        // 参数 1.入口类的类对象  2.主函数的形参列表
        SpringApplication.run(Application.class,args);
    }


}