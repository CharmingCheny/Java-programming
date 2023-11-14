public class B extends A {
    public void g(int x, int y) {
        int m = super.f(x, y);// 调用父类方法
        int n = (x * y) / m;// 计算最大公倍数
        System.out.println(x + "和" + y + "的最小公倍数数为：" + n);// 打印
    }

}
