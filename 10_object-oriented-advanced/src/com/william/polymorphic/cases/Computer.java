package com.william.polymorphic.cases;

public class Computer {
    private String name;

    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println(name + "开机！");
    }

    // 提供安装USB设备的入口 (方法：父类作为入参)
    public void installUSB(USB usb){
        // 多态：usb == keyboard/mouse
        usb.connect();

        // 独有功能: instanceof
        if (usb instanceof Keyboard) {
            Keyboard k = (Keyboard) usb;
            k.keyDown();
        } else if (usb instanceof Mouse){
            Mouse m = (Mouse) usb;
            m.dbClick();
        }

        usb.disconnect();
    }
}
