package graph;

public class Rectangle extends Shape {
    double b;// 自己的变量

    public void Area(double a, double b) {

        setNum(a);// 初始化父类变量
        double ans = num * b;// 进行计算面积
        System.out.println("长方形的面积为：" + ans);

    }
}
