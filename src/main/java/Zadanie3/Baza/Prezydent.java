package Zadanie3.Baza;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // Jak dziedziczenie ma wplywac na budeowe tabel
@SuperBuilder // zamiast builder, odwoluje sie do pol klasy nadrzednej
@NoArgsConstructor
@AllArgsConstructor
public class Prezydent extends Obywatel {
    protected int lataprezydenturyOd;
    protected int getLataprezydenturyDo;

}
