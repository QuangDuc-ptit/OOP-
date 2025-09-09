package ngay09092025;
class SinhVien {
    private String maSV;
    private String hoTen;
    private int tuoi;

    private static int tongSoSV = 0;

    public SinhVien(String maSV, String hoTen, int tuoi) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        tongSoSV++;
    }

    public void hienThi() {
        System.out.println("Ma SV: " + maSV + ", Ho ten: " + hoTen + ", Tuoi: " + tuoi);
    }

    public static void hienThiTongSV() {
        System.out.println("Tong so sinh vien hien co: " + tongSoSV);
    }
}

public class Main2 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("SV01", "Nguyen Quang Duc", 20);
        SinhVien sv2 = new SinhVien("SV02", "Tran Duc Ving", 21);
        SinhVien sv3 = new SinhVien("SV03", "Le Van Luyen", 19);

        System.out.println("Danh sach sinh vien:");
        sv1.hienThi();
        sv2.hienThi();
        sv3.hienThi();

        SinhVien.hienThiTongSV();
    }
}
