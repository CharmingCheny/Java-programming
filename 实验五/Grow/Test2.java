package Grow;

public class Test2 {
    public static void main(String[] args) {
        Frog f = new Frog();// new一个Frog对象
        f.setState(new Tadpole());// 传入Tadpole类对象
        f.show();
        f.setState(new Fleg());// 传入Fleg类对象
        f.show();
        f.setState(new Bleg());// 传入Bleg类对象
        f.show();
        f.setState(new BeFrog());// 传入BeFrog类对象
        f.show();
    }
}
