package com.william.inheritance;

/* Case: 教育管理系统 (学生、老师)

Student: 名称、年龄、所在班级、查看课表、填写听课反馈
Teacher: 名称、年龄、部门名称、查看课表、发布问题

==> 定义People类作为父类：名称、年龄、查看课表
*/

public class CaseDemo {
    public static void main(String[] args) {
        Student s = new Student();
        // 调用父类的属性和方法
        s.setName("william");
        s.setAge(999);

        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.queryCourse();

        // 调用自己独有的属性和方法
        s.writeInfo();
    }
}
