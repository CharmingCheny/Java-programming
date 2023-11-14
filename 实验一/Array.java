import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] a = { 9, 2, 7, 4, 3, 6 };// 一维数组
        int b[][] = { { 1, 2 }, { 3, 5, 8 }, { 9, 5, 4 } };// 二维数组
        int sum = 0;
        System.out.println("数组a的元素个数=" + a.length);// 输出数组a的长度
        System.out.println("数组a的引用=" + a);// 输出a的引用
        System.out.println("a数组元素=");
        for (int i = 0; i < a.length; i++) {// 输出a的元素
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            sum += b[i].length;// 对每一行元素个数求和
        }
        System.out.println("数组b的元素个数=" + sum);// 输出数组b的长度
        System.out.println("数组b的引用=" + b);// 输出b的引用
        System.out.println("b数组元素=");
        for (int i = 0; i < b.length; i++) {// 输出a的元素
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
        }

        // 下面是排序过程
        System.out.println();
        Arrays.sort(a);// 对a进行正向排序
        System.out.println("升序：");
        for (int i = 0; i < a.length; i++) {// 升序序列
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("降序：");
        for (int i = a.length - 1; i >= 0; i--) {// 降序序列
            System.out.print(a[i] + " ");
        }
    }
}
