package only_mybatis;

import only_mybatis.entity.Student;

public class Main{
    public static void main(String[] args){
        // 检验下lombook的自动getter和setter
        Student student = new Student(1,"wangzhuohan","男");
        System.out.println(student.getSex());

    }
}
