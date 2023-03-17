import java.util.Scanner;

public class Zadanie2a {
    public static void main(String[] args) {

    }
    public static void choinka(int n){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar choinki:");
        int rozmiarChoinki = scanner.nextInt();

        double numer = 0.0;
        do {
            System.out.print("Podaj prawdopodobieństwo wystąpienia bombki:");
            numer = scanner.nextDouble();
        } while (numer < 0.0 || numer > 1.0);

        choinka(rozmiarChoinki, numer);
    }

    public static void choinka(int n, double prawdopodobienstwo) {
        for (int i = 0; i < n; i++) {                                       // wiersz po wierszu
            System.out.println(wypiszWiersz(i, n, prawdopodobienstwo));
        }
    }

    public static String losowosc(double p) {
        if (p <= Math.random()) {
            return "o";
        }
        return "*";
    }

    public static String wypiszWiersz(int obecnyWiersz, int rozmiar, double prawdopodobienstwo) {
        String linia = " ".repeat((rozmiar - 1) - obecnyWiersz);
        for (int j = rozmiar - obecnyWiersz; j < rozmiar; j++) {
            linia = linia + losowosc(prawdopodobienstwo);
        }
        linia += "|";
        for (int j = rozmiar - obecnyWiersz; j < rozmiar; j++) {
            linia = linia + losowosc(prawdopodobienstwo);
        }
        return linia;
    }
}
