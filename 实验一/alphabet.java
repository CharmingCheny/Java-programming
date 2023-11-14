public class alphabet {
    public static void main(String[] args) {
        int j = -1;// 进行计数，方便换行
        for (int i = 945; i <= 969; i++) { // i对应希腊字母对应的值
            j++;
            if (j == 6) {// 六个一行
                System.out.println();// 输出换行
                j = 0;
            }
            System.out.print(String.format("%c ", i));// 输出希腊字母
        }
    }

}
