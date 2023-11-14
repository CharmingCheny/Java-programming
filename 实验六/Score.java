import java.util.Scanner;

public class Score {
    public static void main(String args[]) {
        String cost = "数学87分，物理76分，英语96分";
        Scanner sc = new Scanner(cost);//传入值
        sc.useDelimiter("[^0123456789.]+");//设置分隔符
        double sum = 0, aver = 0;//总分；平均分
        while (sc.hasNext()) {//判断字符串是否结束
            double score = sc.nextDouble();//将数字输出给score
            sum += score;//累加求和
        }
        aver = sum / 3;//求平均
        System.out.println("总分:" + sum + "分");
        System.out.println(String.format("平均分：%.2f分", aver));
    }

}
