package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Data //(Setter - Getter - ToString - NoArgsConstructor - RequiredArgsConstructor)
@NoArgsConstructor
@RequiredArgsConstructor
@Entity // Une entité JPA
public class Resultat {

    // Identifiant technique (clé primaire, auto-générée)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(lombok.AccessLevel.NONE)
    private Integer id;

    // Classement de l'utilisateur
    @Column(unique = true)
    @NonNull // Lombok : génère un constructeur avec ce paramètre
    private Integer classement;

    //liens avec les autres entités
    @ToString.Exclude
    @ManyToOne(optional = false)
    @NonNull
    private Competition competition;

    @ToString.Exclude
    @ManyToOne(optional = false)
    @NonNull
    private Utilisateur utilisateur;
}