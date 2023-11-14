package People;

public class AmericanPeople extends People {// 子类
    public void americanBoxing() {// 新方法
        System.out.println("直拳，勾拳，组合拳");
    }

    public void speakHello() {// 重写父类的speakHello方法
        System.out.println("How do you do");
    }

    public void averageHeight() {// 重写父类的averageHeight方法
        height = 176.0;// 继承父类成员变量
        System.out.println("American's average height:" + height + "cm");
    }

    public void averageWeight() {// 重写父类的averageWeight方法
        weight = 75.0;// 继承父类成员变量
        System.out.println("American's average weight:" + weight + "kg");
    }
}
