package isis.projet.backend.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Competition {
    // Identifiant technique (clé primaire, auto-générée)
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull // Lombok : génère un constructeur avec ce paramètre
    @NotBlank // Validation : ne doit pas contenir uniquement des espaces
    @NotEmpty // Validation : ne doit pas être vide
    private Date date;

    @NonNull // Lombok : génère un constructeur avec ce paramètre
    @NotBlank // Validation : ne doit pas contenir uniquement des espaces
    @NotEmpty // Validation : ne doit pas être vide
    private String lieu;
}
