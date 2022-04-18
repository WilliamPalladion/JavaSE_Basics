package com.william.inner_class.inner_member;

public class CaseDemo {
    public static void main(String[] args) {
        People.Heart heart = new People().new Heart();
        heart.show();
    }
}

class People {
    private int heartBeat = 150;

    public class Heart {
        private int heartBeat = 110;
        public void show() {
            int heartBeat = 78;

            // 多种访问结果
            // 在成员内部类中访问所在外部类对象：外部类.this
            System.out.println(heartBeat); // 78
            System.out.println(this.heartBeat); // 110，访问成员内部类的实例变量
            System.out.println(People.this.heartBeat); // 150，在成员内部类中访问外部类的实例变量：外部类.this.var
        }
    }
}
