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
    private Integer id; //ATTENTION : à modifier, devra venir des clés étrangères de Competition.java et Utilisateur.java

    // Classement de l'utilisateur
    @Column(unique = true)
    @NonNull // Lombok : génère un constructeur avec ce paramètre
    private String classement;

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