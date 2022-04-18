package com.william.inner_class.inner_anonymous;

/** Case: 某学校让老师、学生、运动员一起参加游泳比赛
 */
public class SwimCase {
    public static void main(String[] args) {
        Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生自由泳~~");
            }
        };
        go(s);

        System.out.println("-----------------------");

        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师自由泳更快~~");
            }
        };
        go(s1);

        System.out.println("----------------------");

        // 甚至可以直接作为参数送入 -> 匿名内部类可以作为方法的实际参数进行传输
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("运动员游得最快~~");
            }
        });
    }

    // 游泳方法
    public static void go(Swimming s){
        System.out.println("开始~~~~");
        s.swim();
        System.out.println("结束~~~~");
    }
}

//class Student implements Swimming {
//    @Override
//    public void swim() {
//        System.out.println("学生自由泳~~");
//    }
//}


interface Swimming {
    void swim();
}