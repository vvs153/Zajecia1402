import java.util.List;
import java.util.Scanner;

public class zadanie1 {
    private static final List<String> IMIONA_DOZWOLONE = List.of(
            "Maria", "Ania", "Katarzyna", "Dawid", "Julia", "Bartosz"
    );
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        String imie = scanner.nextLine();
        //String imie2 = imie.replace(".","").trim();
        String imie3 = imie.replaceFirst("[.]","").trim();
        if (IMIONA_DOZWOLONE.contains(imie3)){
            System.out.println("Znaleziono Dopasowanie");
        }else {
            System.out.println("Nie znaleziono dopasowania");
        }
    }
}
