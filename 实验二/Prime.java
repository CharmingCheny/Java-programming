public class Prime {
    public static void main(String[] args) {
        int flag = 0;// 标识符：表示是否为素数
        for (int i = 2; i < 101; i++) { // 对2-100之间每个数进行判断
            for (int j = 2; j < i; j++) { // 某个数对2到它本身-1取余
                if (i % j == 0) { // 余数为0则不为素数
                    flag = 1; // 标识符置1
                    break;
                }
            }
            if (flag == 0) { // 如果循环出来仍是0，就是素数
                System.out.print(i + " ");
            }
            flag = 0;// 重置标识符
        }
    }
}