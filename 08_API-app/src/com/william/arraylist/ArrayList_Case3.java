package com.william.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/* Case 3: 元素搜索
   学生信息系统的数据搜索：后台存储学生信息，然后根据学号搜索学生信息
   学号           姓名    年龄    班级
   "20180302", "叶孤城", 23, "护理一班"
   "20180303", "东方不败", 23, "推拿二班"
   "20180304", "西门吹雪", 26, "中药学四班"
   "20180305", "梅超风", 26, "神经科二班"
*/
public class ArrayList_Case3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("20180302", "叶孤城", 23, "护理一班"));
        students.add(new Student("20180303", "东方不败", 23, "推拿二班"));
        students.add(new Student("20180304", "西门吹雪", 26, "中药学四班"));
        students.add(new Student("20180305", "梅超风", 26, "神经科二班"));

        // 遍历学生信息展示
        System.out.println("学号\t\t\t名称\t\t年龄\t班级");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getStudyNumber() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getClassName());
        }

        // 定义死循环不断调用方法搜索
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入学号查询该学生信息：");
            String studyNumber = sc.next();
            // 调用方法查询
            Student s = getStudentById(students, studyNumber);
            if (s == null){
                System.out.println("查无此人");
            } else {
                System.out.println("您查询的学生信息如下：");
                System.out.println(s.getStudyNumber() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getClassName());
            }
        }

    }

    // 定义方法完成学号的搜索功能，用 /** + enter 自动添加注释
    /**
     * 根据学生的学号查询学生对象并返回
     * @param students: 学生对象的集合
     * @param studyNumber: 搜索学生的学号
     * @return 学生对象 | null
     */
    public static Student getStudentById(ArrayList<Student> students, String studyNumber){
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            // 比对学号
            if (s.getStudyNumber().equals(studyNumber)){
                return s;
            }
        }
        return null;
    }
}
