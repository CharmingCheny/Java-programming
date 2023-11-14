package MVC;

import javax.swing.*;//swing是图形可视包，导入这个包后才能进行GUI图形化软件的开发
import java.awt.*;//awt是java自己用来做界面的包
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMVC extends JFrame implements ActionListener {
    JTextArea ta;// JTextArea类是一个显示纯文本的多行区域
    JTextField tf1, tf2, tf3;// JTextField类的对象是一个文本组件，允许编辑单行文本。
    JButton jButton;// JButton组件是最简单的按钮组件
    Calculate cal;

    public MyMVC() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cal = new Calculate();
        tf1 = new JTextField(4);// 文本框的长度为4
        tf2 = new JTextField(4);// 文本框的长度为4
        tf3 = new JTextField(4);// 文本框的长度为4
        ta = new JTextArea(8, 8);// 显示结果的地方8*8大小
        JPanel jPanel = new JPanel();// JPanel：面板组件，非顶层容器
        jPanel.add(new JLabel("上底"));// 设置标签
        jPanel.add(tf1);// 添加输入框
        jPanel.add(new JLabel("下底"));// 设置标签
        jPanel.add(tf2);// 添加输入框
        jPanel.add(new JLabel("高"));// 设置标签
        jPanel.add(tf3);// 添加输入框
        JButton button = new JButton("按下按钮以计算梯形面积");// 设置按钮上的文字
        button.setBounds(0, 0, 117, 29);// 按钮大小
        jPanel.add(button);
        button.addActionListener(this);// 对上述操作进行响应
        add(jPanel, BorderLayout.NORTH);// 在幕布北面显示
        add(new JScrollPane(ta));
        setVisible(true);
        setBounds(200, 200, 200, 200);
    }

    public void actionPerformed(ActionEvent e) {// 父类方法的抽象类必须在子类重写

        try {
            double shangdi = Double.parseDouble(tf1.getText().trim());// 上底
            double xiadi = Double.parseDouble(tf2.getText().trim());// 下底
            double gao = Double.parseDouble(tf3.getText().trim());// 高
            cal.setShangdi(shangdi);// 初始化上底
            cal.setXiadi(xiadi);// 初始化下底
            cal.setGao(gao);// 初始化高
            double area = cal.getArea();// 计算面积
            ta.append("梯形的面积为：" + area);

        } catch (Exception e1) {
            System.out.println("您输入的数据不合法，请重新输入");
        }
    }
}
