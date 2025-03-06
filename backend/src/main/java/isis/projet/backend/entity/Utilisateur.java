package isis.projet.backend.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Utilisateur {
    // Identifiant technique (clé primaire, auto-générée)
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // Identifiant métier (code ISO)
    @NotBlank // Validation : ne doit pas contenir uniquement des espaces
    @NotEmpty // Validation : ne doit pas être vide
    @NonNull // Lombok : génère un constructeur avec ce paramètre
    private String nom;

    @NonNull // Lombok : génère un constructeur avec ce paramètre
    @NotBlank // Validation : ne doit pas contenir uniquement des espaces
    @NotEmpty // Validation : ne doit pas être vide
    private String prenom;
    private String email;
    private boolean estMasterAdministrateur;
    private Integer age;
    private boolean sexe;
}
