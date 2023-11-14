import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A num1 = new A();// 定义A类变量num1
        B num2 = new B();// 定义B类变量num2
        int a, b, c, d;

        // 下面是求最大公约数
        System.out.println("请输入两个数求最大公约数：");
        a = sc.nextInt();
        b = sc.nextInt();
        num1.f(a, b);// 求6,8的最大公约数
        System.out.println(num1.x + "和" + num1.y + "的最大公约数为：" + num1.f(a, b));

        // 下面是求最小公倍数
        System.out.println("请输入两个数求最小公倍数：");
        c = sc.nextInt();
        d = sc.nextInt();
        // 测试最小公倍数
        num2.g(c, d);
    }
}
