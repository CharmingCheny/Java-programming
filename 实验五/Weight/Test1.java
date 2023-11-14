package Weight;

public class Test1 {
    public static void main(String[] args) {
        WeighCargo wc[] = new WeighCargo[4];// 定义WeighCargo类型的数组
        wc[0] = new Roadster();// 接收Roadster重量返回值
        wc[1] = new Helicopter();// 接收Helicopter重量返回值
        wc[2] = new Galleon();// 接收Galleon重量返回值
        wc[3] = new Statue();// 接收Statue重量返回值
        GiantFreighter gf = new GiantFreighter(wc);
        double sum;
        sum = wc[0].weigh() + wc[1].weigh() + wc[2].weigh() + wc[3].weigh();// 四个相加就是总和
        System.out.println("总共重量:" + sum + "吨");
    }
}
