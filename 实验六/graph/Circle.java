package graph;

public class Circle extends Shape {
    public void Area(double r) {// 重写方法
        setNum(r);// 初始化继承父类的num
        double ans = Math.PI * num * num;// 计算面积
        System.out.println("圆的面积为：" + ans);
    }
}
