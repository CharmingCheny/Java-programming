package graph;

public abstract class Shape {
    double num;// 成员变量

    public void setNum(double a) {
        num = a;// 初始化
    }

    public void Area() {
        try {// 测试下面代码

        } catch (NotImplementedError e) {// 抓住的错误类型
            e.printStackTrace();// 报出错误
            System.out.println("继承错误");
        }
    }
}
