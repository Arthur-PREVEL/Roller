package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data //(Setter - Getter - ToString - NoArgsConstructor - RequiredArgsConstructor)
@NoArgsConstructor
@RequiredArgsConstructor
@Entity // Une entité JPA
public class Competition {

    // Identifiant technique (clé primaire, auto-générée)
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Date de la compétition
    @NonNull
    private Date date;

    // Lieu de la compétition
    @NonNull
    private String lieu;


    //liens avec les autres entités

    @ToString.Exclude
    @OneToMany(mappedBy = "competition", orphanRemoval = true)
    private List<Resultat> resultats = new ArrayList<>();
}
