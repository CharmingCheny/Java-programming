import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("是否提供参数：（Y/N）");// 是否输入参数判断
        char choice = sc.next().charAt(0); // 输入
        if (choice == 'Y' || choice == 'y') {// 要输入参数
            System.out.println("请输入圆心位置:");
            double x = sc.nextDouble();// 输入x坐标
            double y = sc.nextDouble();// 输入y坐标
            System.out.println("请输入半径：");
            double r = sc.nextDouble();// 输入半径r
            Circle.setCircle(x, y, r);// 设置圆的参数
        }
        Circle.showCircle();// 打印圆的信息
        Circle.perimeterAera();// 计算周长和面积
    }
}
