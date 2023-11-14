package People;

public class ChinaPeople extends People {// 子类
    public void speakHello() {// 重写父类的speakHello方法
        System.out.println("您好");
    }

    public void averageHeight() {// 重写父类的averageHeight方法
        height = 168.78;// 继承父类成员变量
        System.out.println("中国人的平均身高为:" + height + "厘米");
    }

    public void averageWeight() {// 重写父类的averageWeight方法
        weight = 65.0;// 继承父类成员变量
        System.out.println("中国人的平均体重为:" + weight + "千克");
    }

    public void chinaGongfu() {// 新方法
        System.out.println("坐如钟，站如松，睡如弓");
    }
}
