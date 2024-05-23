package com.cy.javassm.entity;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@ToString
@Component("test")
public class Student {
    @Autowired
    //byname="t1"
    @Qualifier("t1")
    Teacher teacher;
}
