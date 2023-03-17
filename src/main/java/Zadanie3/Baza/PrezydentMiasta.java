package Zadanie3.Baza;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // Jak dziedziczenie ma wplywac na budeowe tabel
@SuperBuilder // zamiast builder, odwoluje sie do pol klasy nadrzednej
@NoArgsConstructor
@AllArgsConstructor
public class PrezydentMiasta extends Prezydent {
    @ManyToOne
    private MiastoWojewodzkie miastoWojewodzkie;
    @OneToMany
    private List<Osiagniecie> osiagniecieList;
}
