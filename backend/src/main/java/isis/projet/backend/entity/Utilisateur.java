package isis.projet.backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Entity // Une entité JPA 
@Data //(Setter - Getter - ToString - NoArgsConstructor - RequiredArgsConstructor)
public class Utilisateur {

    // Identifiant technique (clé primaire, auto-générée)
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty // Validation : ne doit pas être vide
    @NonNull // Lombok : génère un constructeur avec ce paramètre
    private String nom;

    @NonNull // Lombok : génère un constructeur avec ce paramètre
    @NotEmpty // Validation : ne doit pas être vide
    private String prenom;

    private String email;

    private boolean estMasterAdministrateur;

    private Integer age;

    private boolean sexe;
}
