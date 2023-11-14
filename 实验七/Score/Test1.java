package Score;

import java.io.*;

public class Test1 {
    public static void main(String args[]) {
        File fRead = new File("score.txt");
        File fWrite = new File("scoreAnalysis.txt");
        try {
            Reader in = new FileReader(fRead); // 创建指向fRead的in流
            Writer out = new FileWriter(fWrite); // 以尾加方式创建指向文件fWrite的out流
            BufferedWriter bw = new BufferedWriter(out); // 创建指向out的bufferedWrite流
            BufferedReader br = new BufferedReader(in); // 创建指向in的bufferRead流
            String line = br.readLine();// 获取第一行
            int i = 0;
            while (line != null) {
                bw.write(line);// 写入第一行
                bw.write("总分:");// 行结尾写上总分
                bw.write(String.valueOf(Total.getTotal(line)));// 写上字符串型的分数
                bw.write("分.");
                bw.newLine();// 换行
                line = br.readLine();// 读取下一行

            }
            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
