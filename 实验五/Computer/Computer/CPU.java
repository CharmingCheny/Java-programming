package Computer;
public class CPU {// CPU类
    int speed = 0;// 初始化变量

    public void setSpeed(int m) { // 设置速度函数
        speed = m;// 形式参数m赋值给成员变量speed
    }

    public int getSpeed() {
        return speed; // 返回CPU速度
    }
}
