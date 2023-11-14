public class Sum {
    public static void main(String[] args) {
        int sum = 0, product = 1;// sum表示累计求和，product表示每一个阶乘
        for (int i = 1; i <= 10; i++) {// 加十次
            for (int j = 1; j <= i; j++) { // 从1乘到i
                product *= j;
            }
            sum += product;
            product = 1; // 重置
        }
        System.out.println("sum=" + sum);
    }
}