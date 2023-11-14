import java.util.Scanner;

public class Summation {
    public static void Sum(int a, int b) { // 原本的加法函数
        int sum = a + b;// 计算
        System.out.println(a + "+" + b + "=" + sum);// 输出
    }

    private static void Sum(double a, double b) { // 重载函数
        double sum = a + b;// 计算
        System.out.print(a + "+" + b + "=");// 输出
        System.out.println(String.format("%.3f", sum));// 只输出三位小数

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;// 初始值
        double c = 0.0, d = 0.0;// 初始值
        System.out.println("是否提供参数：（Y/N）");// 是否输入参数判断
        char choice = sc.next().charAt(0); // 输入
        if (choice == 'Y' || choice == 'y') {// 要输入参数
            System.out.println("整数加法：");
            a = sc.nextInt(); // 输入语句
            b = sc.nextInt();// 输入语句
            Sum(a, b);// 调用函数求和
            System.out.println("浮点数加法：");
            c = sc.nextDouble();// 输入语句
            d = sc.nextDouble();// 输入语句
            Sum(c, d);// 调用函数求和
        } else {// 默认参数计算
            System.out.println("整数加法：");
            Sum(a, b);
            System.out.println("浮点数加法：");
            Sum(c, d);
        }
    }
}