package 实验七;

import java.io.*;
import java.util.ArrayList;

public class File {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("text2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("text2__ans.txt"));
            int count = 0;// 记录行数
            String str = null;
            ArrayList<String> list = new ArrayList<>();// 定义列表
            while ((str = br.readLine()) != null) {
                list.add(++count + "." + str);// 每次向列表中存入一个字符串
            }
            br.close();

            for (int i = 0; i < list.size(); i++) {// 将新的字符串写入新文件
                bw.write(list.get(i));// 写入列表对应下标的一行
                bw.newLine();// 新一行
                bw.flush();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}