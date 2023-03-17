package Zadanie3.Baza;


import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Obywatel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long Id;
    protected String imie,nazwisko;
    @OneToMany
    protected List<Opinia> opiniaList;
}
