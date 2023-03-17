import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj minimalna wage: ");
        String minW = scanner.nextLine();
        int minWaga = Integer.parseInt(minW);
        System.out.println("Podaj maksymalna wage: ");
        String maxW = scanner.nextLine();
        int maxWaga = Integer.parseInt(maxW);
        System.out.println("Podaj minimalny wzrost: ");
        String minH = scanner.nextLine();
        int minWzrost = Integer.parseInt(minH);
        System.out.println("Podaj maksymalny wzrost: ");
        String maxH = scanner.nextLine();
        int maxWzrost = Integer.parseInt(maxH);
        int[] waga =new int[maxWaga-minWaga+1];
        for (int i = 0; i <= maxWaga-minWaga; i++) {
        waga[i] = minWaga+i;
            System.out.print(" " +waga[i] + " ");
        }
        System.out.println();
        int[] wzrost =new int[maxWzrost-minWzrost+1];
        for (int i = 0; i <= maxWzrost-minWzrost; i++) {
            wzrost[i] = minWzrost + i;
            System.out.println(wzrost[i] + " ");
        }


        double[][] bmi = new double[maxWaga-minWaga+1][maxWzrost-minWzrost+1] ;
        for (int i = 0; i <= maxWaga-minWaga; i++) {

            for (int j = 0; j <=maxWzrost-minWzrost ; j++) {
              bmi[i][j]=(double) (minWaga+i)/(((minWzrost+j)/100d)*((minWzrost+j)/100d));

                System.out.printf("|%5.1f ",bmi[i][j]);

            }
            System.out.println();

        }

    }
}
