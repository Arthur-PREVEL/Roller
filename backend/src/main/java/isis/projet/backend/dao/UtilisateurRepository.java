
package isis.projet.backend.dao;

import isis.projet.backend.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

    /**
     * Trouve un utilisateur par son nom.
     * Cette méthode sera automatiquement implémentée par Spring Data JPA.
     * @param nom Nom de l'utilisateur.
     * @return L'utilisateur correspondant au nom fourni, ou un Optional vide si non trouvé.
     */
    Optional<Utilisateur> findByNom(String nom);
}
