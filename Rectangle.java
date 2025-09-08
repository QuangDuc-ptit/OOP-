public class Rectangle {
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getPerimeter() {
        return 2 * (x + y);
    }

    public int getArea() {
        return x * y;
    }

    public void printResult() {
        System.out.println("Chieu dai (x): " + x);
        System.out.println("Chieu rong (y): " + y);
        System.out.println("Chu vi hinh chu nhat: " + getPerimeter());
        System.out.println("Dien tich hinh chu nhat: " + getArea());
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Vui long nhap 2 so nguyen duong (x va y).");
            return;
        }

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            if (x <= 0 || y <= 0) {
                System.out.println("x va y phai la so nguyen duong.");
                return;
            }

            Rectangle rect = new Rectangle(x, y);
            rect.printResult();

        } catch (NumberFormatException e) {
            System.out.println("Tham so nhap vao phai la so nguyen.");
        }
    }
}
