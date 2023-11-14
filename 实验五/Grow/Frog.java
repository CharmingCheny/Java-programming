package Grow;

public class Frog {
    private FrogState state;// 定义FrogState接口申明的变量

    public void show() {// 重写方法
        state.showState();
    }

    public void setState(FrogState fs) {// 设置参数
        state = fs;
    }
}
