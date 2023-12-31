package Word;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Words {
    Vector<String> allWord, noSameWord;
    File file = new File("word.txt");
    Scanner sc = null;
    String regex;

    Words() {
        allWord = new Vector<String>();
        noSameWord = new Vector<String>();
        // regex是由空格、数字和符号(!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)组成的正则表达式
        regex = "[\\s\\d\\p{Punct}]+";
        try {
            sc = new Scanner(file);
            sc.useDelimiter(regex);
        } catch (IOException exp) {
            System.out.println(exp.toString());
        }
    }

    void setFileName(String name) {
        file = new File(name);
        try {
            sc = new Scanner(file);
            sc.useDelimiter(regex);
        } catch (IOException exp) {
            System.out.println(exp.toString());
        }
    }

    public void wordStatistic() {
        try {
            while (sc.hasNext()) {
                String word = sc.next();
                allWord.add(word);
                if (!noSameWord.contains(word))
                    noSameWord.add(word);
            }
        } catch (Exception e) {
        }
    }

    public Vector<String> getAllWord() {
        return allWord;
    }

    public Vector<String> getNoSameWord() {
        return noSameWord;
    }
}