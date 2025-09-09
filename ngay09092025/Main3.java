package ngay09092025;
import java.util.*;

class TaiKhoan {
    private String soTK;
    private String chuTK;
    private double soDu;

    private static double laiSuatNam = 0.05;

    public TaiKhoan(String soTK, String chuTK, double soDu) {
        this.soTK = soTK;
        this.chuTK = chuTK;
        this.soDu = soDu;
    }

    public void napTien(double tien) {
        if (tien > 0) {
            soDu += tien;
            System.out.println("Nap tien thanh cong!");
        } else {
            System.out.println("So tien nap khong hop le!");
        }
    }

    public void rutTien(double tien) {
        if (tien > 0 && tien <= soDu) {
            soDu -= tien;
            System.out.println("Rut tien thanh cong!");
        } else {
            System.out.println("So du khong du hoac so tien khong hop le!");
        }
    }

    public void tinhLaiThang() {
        double lai = soDu * (laiSuatNam / 12);
        soDu += lai;
    }

    public void hienThi() {
        System.out.println("STK: " + soTK + ", Chu TK: " + chuTK + ", So du: " + soDu);
    }

    public double getSoDu() {
        return soDu;
    }

    public String getSoTK() {
        return soTK;
    }

    public static void setLaiSuat(double ls) {
        if (ls > 0) {
            laiSuatNam = ls;
        }
    }

    public static void hienThiLaiSuat() {
        System.out.println("Lai suat nam hien tai: " + (laiSuatNam * 100) + "%");
    }
}

public class Main3 {
    public static void main(String[] args) {
        List<TaiKhoan> ds = new ArrayList<>();

        ds.add(new TaiKhoan("1001", "Nguyen Quang Duc", 5000));
        ds.add(new TaiKhoan("1002", "Tran Duc Ving", 3000));
        ds.add(new TaiKhoan("1003", "Le Van Luyen", 10000));

        TaiKhoan tk1 = timTaiKhoan(ds, "1001");
        if (tk1 != null) tk1.napTien(2000);

        TaiKhoan tk2 = timTaiKhoan(ds, "1002");
        if (tk2 != null) tk2.rutTien(500);

        for (TaiKhoan tk : ds) {
            tk.tinhLaiThang();
        }

        System.out.println("Danh sach tai khoan sau khi xu ly:");
        for (TaiKhoan tk : ds) {
            tk.hienThi();
        }

        String stkTim = "1002";
        TaiKhoan tkTim = timTaiKhoan(ds, stkTim);
        if (tkTim != null) {
            System.out.println("Tim thay tai khoan:");
            tkTim.hienThi();
        } else {
            System.out.println("Khong tim thay tai khoan co STK = " + stkTim);
        }

        ds.sort((a, b) -> Double.compare(b.getSoDu(), a.getSoDu()));
        System.out.println("Danh sach tai khoan sau khi sap xep giam dan theo so du:");
        for (TaiKhoan tk : ds) {
            tk.hienThi();
        }

        TaiKhoan.setLaiSuat(0.07);
        TaiKhoan.hienThiLaiSuat();
    }

    private static TaiKhoan timTaiKhoan(List<TaiKhoan> ds, String soTK) {
        for (TaiKhoan tk : ds) {
            if (tk.getSoTK().equals(soTK)) return tk;
        }
        return null;
    }
}
