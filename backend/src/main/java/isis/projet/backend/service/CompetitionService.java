package isis.projet.backend.service;

import isis.projet.backend.dao.CompetitionRepository;
import isis.projet.backend.entity.Competition;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CompetitionService {
    
    private final CompetitionRepository competitionRepository;

    // Injection de dépendances par constructeur
    public CompetitionService(CompetitionRepository competitionRepository) {
        this.competitionRepository = competitionRepository;
    }
    
    /**
     * Récupère toutes les compétitions.
     * @return La liste de toutes les compétitions.
     */
    public List<Competition> getAllCompetitions() {
        return competitionRepository.findAll();
    }

    /**
     * Récupère une compétition par son identifiant.
     * @param id
     * @return La compétition correspondant à l'identifiant fourni, ou un Optional vide si non trouvée.
     */
    public Optional<Competition> getCompetitionById(Integer id) {
        return competitionRepository.findById(id);
    }

    /**
     * Récupère les compétitions par leur lieu.
     * @param lieu
     * @return La liste des compétitions correspondant au lieu fourni.
     */
    public List<Competition> getCompetitionsByLieu(String lieu) {
        return competitionRepository.findByLieu(lieu);
    }

    /**
     * Récupère les compétitions par leur date.
     * @param date
     * @return La liste des compétitions correspondant à la date fournie.
     */
    public List<Competition> getCompetitionsByDate(Date date) {
        return competitionRepository.findByDate(date);
    }

    /**
     * Récupère les compétitions à venir.
     * @param today
     * @return La liste des compétitions à venir.
     */
    public List<Competition> getUpcomingCompetitions(Date today) {
        return competitionRepository.findByDateAfter(today);
    }

    /**
     * Récupère les compétitions passées.
     * @param today
     * @return La liste des compétitions passées.
     */
    public List<Competition> getPastCompetitions(Date today) {
        return competitionRepository.findByDateBefore(today);
    }

    /**
     * Enregistre une compétition.
     * @param competition
     * @return La compétition enregistrée.
     */
    public Competition saveCompetition(Competition competition) {
        return competitionRepository.save(competition);
    }

    /**
     * Supprime une compétition par son identifiant.
     * @param id
     */
    public void deleteCompetition(Integer id) {
        competitionRepository.deleteById(id);
    }
}
