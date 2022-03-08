package com.william.branch;

/*
switch (表达式){
	case 值1:
		code;
		break;
	case 值2:
		code;
		break:
	...
	case 值n:
		code;
		break;
	default:
		code;
}
*/
public class Switch_Branch {
    public static void main(String[] args) {
        // Case: 一周备忘录
        String weekday = "周三";
        switch (weekday){
            case "周一":
                System.out.println("写代码");
                break;
            case "周二":
                System.out.println("找大牛帮忙");
                break;
            case "周三":
                System.out.println("吃饭");
                break;
            case "周四":
                System.out.println("吃鸡");
                break;
            case "周五":
                System.out.println("相亲");
                break;
            default:
                System.out.println("数据有误！");
        }
    }
}
