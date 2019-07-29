import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhap do dai canh 1: ");
            int a = scanner.nextInt();
            System.out.println("Nhap do dai canh 2: ");
            int b = scanner.nextInt();
            System.out.println("Nhap do dai canh 3: ");
            int c = scanner.nextInt();

            if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
                int temp = 0/0;
            }
            System.out.println("Do dai 3 canh hop le");
        } catch (Exception e){
            System.err.println("Do dai 3 canh khong hop le");
        }
    }
}
