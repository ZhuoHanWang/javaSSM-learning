package com.cy.javassm.entity;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

@ToString
public class Student {
    @Autowired
    @Qualifier("t1")
    Teacher teacher;
}
