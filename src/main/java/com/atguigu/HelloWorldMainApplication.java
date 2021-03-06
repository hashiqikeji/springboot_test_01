package com.atguigu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {

        // Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
        System.out.println("第二次提交");
        System.out.println("第三次提交");
        System.out.println("第五次提交");
        System.out.println("第六次提交");
        System.out.println("第七次提交");

        System.out.println("解决冲突");

        System.out.println("第八次提交 副本");
        System.out.println("第九次提交 主");

        System.out.println("第10次 主");

        System.out.println("第11次提交 副本" );

        System.out.println("第12次提交 副本");

        System.out.println("第13 主");

        System.out.println("第14次 副本");

        System.out.println("第15副");

    }
}
