package isis.projet.backend.service;

import org.springframework.stereotype.Service;
import isis.projet.backend.dao.ResultatRepository;
import isis.projet.backend.entity.Resultat;

import java.util.List;
import java.util.Optional;

@Service
public class ResultatService {
    
    private final ResultatRepository resultatRepository;

    // Injection de dépendances par constructeur
    public ResultatService(ResultatRepository resultatRepository) {
        this.resultatRepository = resultatRepository;
    }

    /**
     * Récupère tous les résultats.
     * @return La liste de tous les résultats.
     */
    public List<Resultat> getAllResultats() {
        return resultatRepository.findAll();
    }

    /**
     * Récupère un résultat par son identifiant.
     * @param id
     * @return Le résultat correspondant à l'identifiant fourni, ou un Optional vide si non trouvé.
     */
    public Optional<Resultat> getResultatById(Integer id) {
        return resultatRepository.findById(id);
    }

    /**
     * Récupère les résultats d'une compétition triés par ordre croissant de classement.
     * @param competitionId
     * @return La liste des résultats de la compétition triés par ordre décroissant de classement.
     */
    public List<Resultat> getClassementByCompetition(Integer competitionId) {
        return resultatRepository.findByCompetitionIdOrderByClassementDesc(competitionId);
    }

    /**
     * Récupère le vainqueur d'une compétition.
     * @param competitionId
     * @return Le résultat du vainqueur de la compétition donnée, ou un Optional vide si non trouvé.
     */
    public Optional<Resultat> getWinnerOfCompetition(Integer competitionId) {
        return resultatRepository.findTopByCompetitionIdOrderByClassementDesc(competitionId);
    }

    /**
     * Vérifie si un résultat existe pour une compétition et un utilisateur donnés.
     * @param competitionId
     * @param utilisateurId
     * @return true si un résultat existe pour la compétition et l'utilisateur donnés, false sinon.
     */
    public boolean hasUserParticipated(Integer competitionId, Integer utilisateurId) {
        return resultatRepository.existsByCompetitionIdAndUtilisateurId(competitionId, utilisateurId);
    }

    /**
     * Enregistre un résultat.
     * @param resultat
     * @return Le résultat enregistré.
     */
    public Resultat saveResultat(Resultat resultat) {
        return resultatRepository.save(resultat);
    }

    /**
     * Supprime un résultat.
     * @param id
     */
    public void deleteResultat(Integer id) {
        resultatRepository.deleteById(id);
    }
}
