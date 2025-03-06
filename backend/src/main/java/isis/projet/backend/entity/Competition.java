package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data //(Setter - Getter - ToString - NoArgsConstructor - RequiredArgsConstructor)
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
}
