package only_mybatis.dao;

import only_mybatis.entity.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selectStudent();
    Student selectOneStudent(int id);

    int insertStudent(Student student);

}
