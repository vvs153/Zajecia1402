import java.util.*;

public class zadanie1b {
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
            String imie3 = imie.replaceFirst("[.]","").trim();
            if(IMIONA_DOZWOLONE.contains(imie3)){
                imiona.add(imie3);
            }
        }
        System.out.println("Znaleziono dopasowanie dla: " + imiona);
    }
}
