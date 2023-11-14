package People;

public class Test1 {
    public static void main(String[] args) {
        ChinaPeople cp = new ChinaPeople();// new一个对象
        AmericanPeople ap = new AmericanPeople();// new一个对象
        BeijingPeople bp = new BeijingPeople();// new一个对象
        // 调用各个类里面的speakHello方法
        cp.speakHello();
        ap.speakHello();
        bp.speakHello();
        // 调用各个类里面的averageHeight方法
        cp.averageHeight();
        ap.averageHeight();
        bp.averageHeight();
        // 调用各个类里面的averageWeight方法
        cp.averageWeight();
        ap.averageWeight();
        bp.averageWeight();

        cp.chinaGongfu();// 特有方法
        ap.americanBoxing();// 特有方法
        bp.BeijingOpera();// 特有方法
        bp.chinaGongfu();// 特有方法
    }

}
