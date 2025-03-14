package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import isis.projet.backend.Enum.*;


@Entity // Une entité JPA 
@Data //(Setter - Getter - ToString - NoArgsConstructor - RequiredArgsConstructor)
@NoArgsConstructor
@RequiredArgsConstructor
public class Utilisateur {

    // Identifiant technique (clé primaire, auto-générée)
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) @Setter(lombok.AccessLevel.NONE)
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
    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Role.class)
    @CollectionTable(name = "utilisateur_roles", joinColumns = @JoinColumn(name = "utilisateur_id"))
    @Column(name = "role")
    private TreeSet<Role> roles = new TreeSet<>();

    @Enumerated(EnumType.STRING)
    // Niveau de l'utilisateur
    private Niveau niveau;

    @Enumerated(EnumType.STRING)
    // Categorie de l'utilisateur
    private Categorie categorie;


   //liens avec les autres entités
    @ToString.Exclude
    @OneToMany(mappedBy = "utilisateur", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Resultat> resultats = new ArrayList<>();
}