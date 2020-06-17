package cn.tedu;

import org.springframework.beans.BeanUtils;

import java.util.Date;

public class TestMain {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.setId(1);
        classA.setName("zhu");
        classA.setAge(12);
        classA.setBirthday(new Date());

        ClassB classB = new ClassB();

        //将对象classA的属性值，拷贝给对象classB（属性相同的拷贝到对应的属性上）
        BeanUtils.copyProperties(classA, classB);
        //classB对象除了phone和email两个属性外，其他属性都是从classA那里拷贝过来的
        classB.setPhone("13929543747");
        classB.setEmail("910060759@qq.com");

        System.out.println("classB:"+classB.toString());

    }
}
