import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit;

        System.out.print("Sayı giriniz: ");
        limit = sc.nextInt();

        System.out.println("4'ün kuvvetleri:");
        for (int i = 1; i <= limit; i *= 4) {
            System.out.println(i);
        }

        System.out.println("5'in kuvvetleri:");
        for (int i = 1; i <= limit; i *= 5) {
            System.out.println(i);
        }
    }
}
