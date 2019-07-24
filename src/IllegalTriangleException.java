import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai canh 1: ");
        int a = scanner.nextInt();
        System.out.println("Nhap do dai canh 2: ");
        int b = scanner.nextInt();
        System.out.println("Nhap do dai canh 3: ");
        int c = scanner.nextInt();

        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            IllegalTriangleException.testCheckedExeption();
        } else {
            System.out.println("Do dai 3 canh hop le");
        }
    }

    public static void testCheckedExeption() {
        System.err.println("Do dai 3 canh khong hop le");
    }
}
