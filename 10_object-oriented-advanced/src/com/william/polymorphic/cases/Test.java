package com.william.polymorphic.cases;

/** Case: 多态综合案例
 设计一个电脑对象，可以安装两个USB设备：
 鼠标：被安装时可以完成接入、调用点击功能、拔出功能；
 键盘：被安装时可以完成接入、调用打字功能、拔出功能；

 分析：定义一个USB的接口，申明USB设备的规范必须是：可以接入和拔出
      提供两个USB的实现类鼠标和键盘，并分别定义独有功能
      创建一个电脑对象，创建USB设备对象，安装启动
 */
public class Test {
    public static void main(String[] args) {
        // 创建电脑对象
        Computer c = new Computer("alien");
        c.start();

        // 创建鼠标/键盘对象
        USB u = new Keyboard("雷蛇");
        c.installUSB(u);
        /*
        alien开机！
        雷蛇成功连接电脑
        雷蛇敲击
        雷蛇成功拔出电脑
        */

        USB u1 = new Mouse("ROG");
        c.installUSB(u1);

        /*
        ROG成功连接电脑
        ROG双击
        ROG成功拔出电脑
        */

    }
}
