package com.cy.javassm;

import com.cy.javassm.entity.Student;
import com.cy.javassm.entity.Teacher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// 这个注解是一个复合注解，会扫描这个启动项所在的软件包以及其子包，也就是java目录下的所有的注解，说白了有这个注解就无需在config中繁琐地声明bean了
@SpringBootApplication
public class JavassmApplication {

    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(JavassmApplication.class);
        // 通过反射获取bean对象
        System.out.println(context.getBean(Student.class));
        // 通过bean注解设置的bean名称获取bean对象
        System.out.println(context.getBean("test"));
        // 通过反射获取bean对象
        System.out.println(context.getBean("t1"));
    }

}
