import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokosc choinki");
        String hs = scanner.nextLine();
        int h = Integer.parseInt(hs);

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <=h-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
