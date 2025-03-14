package isis.projet.backend.dao;

import isis.projet.backend.entity.Resultat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ResultatRepository extends JpaRepository<Resultat, Integer> {
 
    /**
     * Trouve le vainqueur d'une compétition.
     * Cette méthode sera automatiquement implémentée par Spring Data JPA.
     * @param competitionId
     * @return Le résultat du vainqueur de la compétition donnée, ou un Optional vide si non trouvé.
     */
    Optional<Resultat> findTopByCompetitionIdOrderByClassementDesc(Integer competitionId);
    
    /**
     * Trouve les résultats d'une compétition triés par ordre croissant de classement.
     * Cette méthode sera automatiquement implémentée par Spring Data JPA.
     * @param competitionId
     * @return La liste des résultats de la compétition triés par ordre décroissant de classement.
     */
    List<Resultat> findByCompetitionIdOrderByClassementDesc(Integer competitionId);
    
    /**
     * Vérifie si un résultat existe pour une compétition et un utilisateur donnés.
     * Cette méthode sera automatiquement implémentée par Spring Data JPA.
     * @param competitionId
     * @param utilisateurId
     * @return true si un résultat existe pour la compétition et l'utilisateur donnés, false sinon.
     */
    boolean existsByCompetitionIdAndUtilisateurId(Integer competitionId, Integer utilisateurId);
}
