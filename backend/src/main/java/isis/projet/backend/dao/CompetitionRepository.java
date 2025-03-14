package isis.projet.backend.dao;

import isis.projet.backend.entity.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface CompetitionRepository extends JpaRepository<Competition, Integer> {

    /**
     * Trouve les compétitions par leur lieu.
     * Cette méthode sera automatiquement implémentée par Spring Data JPA.
     * @param lieu
     * @return La liste des compétitions correspondant au lieu fourni.
     */
    List<Competition> findByLieu(String lieu);
        
    /**
     * Trouve les compétitions par leur date.
     * Cette méthode sera automatiquement implémentée par Spring Data JPA.
     * @param date
     * @return La liste des compétitions correspondant à la date fournie.
     */
    List<Competition> findByDate(Date date);
        
    /**
     * Trouve les compétitions par leur date après une date donnée.
     * Cette méthode sera automatiquement implémentée par Spring Data JPA.
     * @param date
     * @return La liste des compétitions dont la date est après la date fournie (futures compétitions).
     */
    List<Competition> findByDateAfter(Date date);
        
    /**
     * Trouve les compétitions par leur date avant une date donnée.
     * Cette méthode sera automatiquement implémentée par Spring Data JPA.
     * @param date
     * @return La liste des compétitions dont la date est avant la date fournie (compétitions passées).
     */
    List<Competition> findByDateBefore(Date date);    
}
