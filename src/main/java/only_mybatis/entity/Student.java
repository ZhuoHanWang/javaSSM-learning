package only_mybatis.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.Alias;

// 这就包含了很多注解了，Data注解提供类的get、set、equals、hashCode、canEqual、toString方法
@Data
@AllArgsConstructor
@NoArgsConstructor
// 便于mapper.xml确定返回类型
@Alias("student")
// 让setter和getter可以链式使用
@Accessors(chain = true)
public class Student {
    private Integer sid;
    private String name;
    private String sex;
}