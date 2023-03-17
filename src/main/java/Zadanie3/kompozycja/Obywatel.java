package Zadanie3.kompozycja;



import Zadanie3.kompozycja.interfaces.iobywatel;

import java.util.List;

public class Obywatel implements iobywatel {
    private String imie,nazwisko;
    private List<Opinia> opiniaList;

    @Override
    public void przedstawSie() {
        System.out.println("Helo i'm " + getImie());
    }

    @Override
    public String getImie() {
        return imie;
    }
}
