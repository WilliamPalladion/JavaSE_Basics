package com.william.inheritance;

public class Method_Override {
    // 方法重写：
    // 在继承体系中，子类出现了和父类中一模一样的方法声明，我们就称子类这个方法是重写的方法
    // 应用场景：当子类需要父类的功能，但父类的该功能不能完全满足自己的需求时，子类可以重写父类中的方法
    public static void main(String[] args) {
        NewPhone hw = new NewPhone();
        hw.call();
        // 打电话
        // 开始视频通话

        hw.sendMsg();
        // 发短信
        // 发送有趣的图片
    }
}

// Case: 旧手机只能打电话/发信息，新手机需要打电话时支持视频通话，发短信时支持发语音和图片
class Phone {
    public void call(){
        System.out.println("打电话");
    }

    public void sendMsg(){
        System.out.println("发短信");
    }

    // 私有方法不能被重写 (不会报错但不会认为这个是重写方法，而是一个新方法)
    private void note(){
        System.out.println("记笔记");
    }

    // 子类重写父类方法时，访问权限必须大于或等于父类 (缺省(本类/本包的子类) < protected (本类/本包/其他包的子类) < public)
    // 子类不能重写父类的静态方法
    public static void test(){
    }
}

class NewPhone extends Phone {
    // 重写call方法
    // @Override 重写注解：放在重写后的方法上，作为重写是否正确的校验注解 (加上后方法必须是正确重写的，更加安全); 提高代码可读性
    // 重写方法的名称、形参列表必须和被重写方法的名称和参数列表一致
    @Override
    public void call(){
        super.call(); // 调用父类的基本功能
        System.out.println("开始视频通话");
    }

    @Override
    public void sendMsg(){
        super.sendMsg();
        System.out.println("发送有趣的图片");
    }

    public void note(){
        // super.note(); 报错，因为私有化不能被调用
        // 如果不调用父类，虽然不会报错，但不会认为是重写方法
    }

    // 子类不能重写父类的静态方法
    public static void test(){
    }
}