public class A {
    int x = 1, y = 1; // 初始化

    public int f(int a, int b) {
        x = a;// 赋值
        y = b;
        int t;
        t = a > b ? a : b;// 判断哪个数字大
        while (t > 0) { // 从最大数开始递减就可以知道最大公约数
            if (x % t == 0 && y % t == 0) // 两个数取余都为0就是公约数
                break;
            --t; // 否则就算下一个小1的数字
        }
        return t;
    }
}
