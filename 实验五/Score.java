import java.util.Scanner;

public class Score {
    public static void main(String args[]) {
        String cost = " 数学87分，物理76分，英语96分";
        Scanner sc = new Scanner(cost);
        sc.useDelimiter("[^0123456789.]+");
        double sum = 0, aver = 0;
        while (sc.hasNext()) {
            double score = sc.nextDouble();
            sum += score;
        }
        aver = sum / 3;
        System.out.println("总分:" + sum + "分");
        System.out.println(String.format("平均分：%.2f分", aver));
    }

}
