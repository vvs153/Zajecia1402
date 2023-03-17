package Zadanie3.Baza;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MiastoWojewodzkie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long Id;
    private String nazwa;
    private String kodPocztowy;
    private double dlGeorg, szGeorg;
    private  int iloscmieszkancow;
    @ManyToOne
    private Prezydent prezydent;
    @OneToMany
    private List<Osiagniecie> osiagniecielist;
    @OneToMany
    private List<Obywatel> obywatelList;

}
