package only_mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// 自动生成每个属性的get和set方法
@Getter
@Setter
// 全参构造帮我们写
@AllArgsConstructor
public class Student {
    private Integer sid;
    private String name;
    private String sex;
}