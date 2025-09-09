package ngay09092025;
class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double cd, double cr) {
        this.chieuDai = cd;
        this.chieuRong = cr;
    }

    public double chuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public double dienTich() {
        return chieuDai * chieuRong;
    }

    public void hienThi() {
        System.out.println("Hinh chu nhat: CD=" + chieuDai +
                           ", CR=" + chieuRong +
                           ", Chu vi=" + chuVi() +
                           ", Dien tich=" + dienTich());
    }
}

public class Main1 {
    public static void main(String[] args) {
        HinhChuNhat h1 = new HinhChuNhat(5, 3);
        HinhChuNhat h2 = new HinhChuNhat(10, 4);

        h1.hienThi();
        h2.hienThi();
    }
}
