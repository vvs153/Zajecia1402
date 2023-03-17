package Zadanie3.kompozycja;



import Zadanie3.kompozycja.interfaces.iobywatel;

import java.util.List;

public class PrezydentMiasta implements iobywatel {
    private Prezydent prezydent;
    private MiastoWojewodzkie miastoWojewodzkie;
    private List<Osiagniecie> osiagniecieList;

    @Override
    public void przedstawSie() {
        System.out.println("helo i'm president " + getImie());
    }

    @Override
    public String getImie() {
        return this.prezydent.getImie();
    }
}
