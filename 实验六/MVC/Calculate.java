package MVC;

public class Calculate {
    double shangdi, xiadi, gao;

    public double getArea() {// 计算面积
        return (shangdi + xiadi) * gao / 2.0;
    }

    public void setShangdi(double shangdi) {// 初始化上底
        this.shangdi = shangdi;
    }

    public void setXiadi(double xiadi) {// 初始化下底
        this.xiadi = xiadi;
    }

    public void setGao(double gao) {// 初始化高
        this.gao = gao;
    }
}
