package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.TreeSet;

import isis.projet.backend.Enum.*;


@Entity // Une entité JPA 
@Data //(Setter - Getter - ToString - NoArgsConstructor - RequiredArgsConstructor)
public class Utilisateur {

    // Identifiant technique (clé primaire, auto-générée)
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Nom de l'utilisateur
    @NonNull // Lombok : génère un constructeur avec ce paramètre
    private String nom;

    // Prénom de l'utilisateur
    @NonNull
    private String prenom;

    // Adresse mail de l'utilisateur
    @NonNull
    private String email;

    // master Administrateur ou non
    private boolean estMasterAdministrateur;

    // Age de l'utilisateur
    @NonNull
    private Integer age;

    // Sexe de l'utilisateur
    private boolean homme;

    // Roles de l'utilisateur
    @NonNull
    private TreeSet<Role> roles;

    // Niveau de l'utilisateur
    private Niveau niveau;

    // Categorie de l'utilisateur
    private Categorie categorie;

}