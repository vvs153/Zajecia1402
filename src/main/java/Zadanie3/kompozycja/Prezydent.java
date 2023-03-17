package Zadanie3.kompozycja;

import Zadanie3.kompozycja.interfaces.iobywatel;

public class Prezydent implements iobywatel {
    private Obywatel obywatel;
    protected int lataprezydenturyOd;
    protected int getLataprezydenturyDo;

    @Override
    public void przedstawSie() {
        System.out.println("Helo i'm president " + getImie());
    }

    @Override
    public String getImie() {
        return this.obywatel.getImie();
    }
}
