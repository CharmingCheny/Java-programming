package People;

public class BeijingPeople extends ChinaPeople {// 继承ChinaPeople
    public void speakHello() {// 重写父类的speakHello方法
        System.out.println("您好");
    }

    public void averageHeight() {// 重写父类的averageHeight方法
        height = 172.5;// 对People类的成员变量赋值
        System.out.println("北京人的平均身高为:" + height + "厘米");
    }

    public void averageWeight() {// 重写父类的averageWeight方法
        weight = 70.0;// 对People类的成员变量赋值
        System.out.println("北京人的平均体重为:" + weight + "千克");
    }

    public void BeijingOpera() {// 新方法
        System.out.println("花脸、青衣、花旦和老生");
    }
}
