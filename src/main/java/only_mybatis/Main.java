package only_mybatis;

import only_mybatis.entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        // 检验下lombook的自动getter和setter
        System.out.println("检验下lombook的自动getter和setter");
        Student student = new Student(1,"wangzhuohan","男");
        System.out.println(student.getSex());

        // 这些套路代码不管，反正通过mybatis的初始xml我们试着成功连接下数据库
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(new FileInputStream("C:\\develop_learning\\JAVA\\javassm\\src\\main\\resources\\mybatis-config.xml"));
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)){
            // 查询stu表的全部，多行查询需要调用sql会话的查询列表
            System.out.println("我是多行查询");
            List<Student> student1 = sqlSession.selectList("selectStudent");
            student1.forEach(System.out::println);
            System.out.println("我是单行查询");
            // 单行查询stu,单行查询需要调用sql会话的单行查询方法
            Student student2 = sqlSession.selectOne("selectOneStudent",1);
            System.out.println(student2);
        }
    }
}
