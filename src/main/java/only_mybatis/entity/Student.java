package only_mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// 这就包含了很多注解了，Data注解提供类的get、set、equals、hashCode、canEqual、toString方法
@Data
@AllArgsConstructor
public class Student {
    private Integer sid;
    private String name;
    private String sex;
}