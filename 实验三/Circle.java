public class Circle {
    private static double x = 0;// 初始值
    private static double y = 0;// 初始值
    private static double r = 1;// 初始值

    public static void setCircle(double a, double b, double c) {// 设置Circle的参数
        x = a;
        y = b;
        r = c;
    }

    public static void showCircle() {// 打印
        System.out.println("圆心位置：(" + x + "," + y + ")");// 圆的圆心位置
        System.out.println("圆的半径：" + r);// 圆的半径
    }

    public static void perimeterAera() {// 计算面积和周长
        double d = 2 * Math.PI * r;// 周长
        double s = Math.PI * r * r;// 面积
        System.out.println(String.format("圆的周长：%.2f", d));// 打印周长
        System.out.println(String.format("圆的面积：%.2f", s));// 打印面积
    }
}
