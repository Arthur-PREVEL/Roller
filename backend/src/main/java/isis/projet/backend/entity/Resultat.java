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
public class Resultat {
    // Identifiant technique (clé primaire, auto-générée)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // Identifiant métier (code ISO)
    @NotBlank // Validation : ne doit pas contenir uniquement des espaces
    @NotEmpty // Validation : ne doit pas être vide
    @Column(unique = true)
    @NonNull // Lombok : génère un constructeur avec ce paramètre
    private String classement;
}