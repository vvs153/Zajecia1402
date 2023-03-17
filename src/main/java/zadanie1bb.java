import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class zadanie1bb {
    private static final List<String> IMIONA_DOZWOLONE = List.of(
            "Maria", "Ania", "Katarzyna", "Dawid", "Julia", "Bartosz"
    );
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        String nm = scanner.nextLine();
        int number = Integer.parseInt(nm);
        Set<String> imiona = new HashSet<>();
        for (int j = 0; j < number; j++) {
            System.out.println("Podaj imie");
            String imie = scanner.nextLine();
            String imie3 = imie;
            while (imie3.endsWith(".")){
                imie3=imie3.substring(0,imie3.length()-1);
            }
            if(IMIONA_DOZWOLONE.contains(imie3.strip())){
                imiona.add(imie3);
            }
        }
        System.out.println("Znaleziono dopasowanie dla: " + imiona);
    }
}
