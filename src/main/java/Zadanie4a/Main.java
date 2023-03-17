package Zadanie4a;

import java.util.Scanner;

public class Main {
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
        int iloscKolumn = (maxWaga-minWaga)+2;
        int iloscPodkreslnikow = iloscKolumn*9;
        final String formatKomorki = " %-6.2f |";
        final String formatNaglowkow = " %-6s |";
      //  final String formatWiersza = formatKomorki.repeat(iloscKolumn);
        String wierszNaglowka = String.format(formatNaglowkow, " ");
        for (int i = minWaga; i <= maxWaga; i++) {
            wierszNaglowka =  wierszNaglowka + String.format( formatNaglowkow,i);
        }
        System.out.println(wierszNaglowka);
        System.out.println("-".repeat(iloscPodkreslnikow));
        for (int wzrost = minWzrost; wzrost < maxWzrost; wzrost++) {
            String wierszTabeli = String.format(formatNaglowkow, wzrost);
            for (int waga = minWaga; waga <= maxWaga; waga++) {
                double wzrostM = wzrost/100.0;
                wierszTabeli = wierszTabeli + String.format(formatKomorki, (waga/(wzrostM*wzrostM)));
            }
            System.out.println(wierszTabeli);
        }

    }
}
