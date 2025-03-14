package isis.projet.backend.dao;

import isis.projet.backend.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import isis.projet.backend.Enum.Categorie;
import isis.projet.backend.Enum.Niveau;
import isis.projet.backend.Enum.Role;

import java.util.Optional;
import java.util.List;


public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

    /**
     * Trouve un utilisateur par son nom.
     * Cette méthode sera automatiquement implémentée par Spring Data JPA.
     * @param nom Nom de l'utilisateur.
     * @return L'utilisateur correspondant au nom fourni, ou un Optional vide si non trouvé.
     */
    Optional<Utilisateur> findByNom(String nom);

    /**
     * Trouve les utilisateurs par leur catégorie.
     * Cette méthode sera automatiquement implémentée par Spring Data JPA. 
     * @param categorie
     * @return La liste des utilisateurs correspondant à la catégorie fournie.
     */
    List<Utilisateur> findByCategorie(Categorie categorie);

    /**
     * Trouve les utilisateurs par leur niveau.
     * Cette méthode sera automatiquement implémentée par Spring Data JPA. 
     * @param niveau
     * @return La liste des utilisateurs correspondant au niveau fourni.
     */
    List<Utilisateur> findByNiveau(Niveau niveau);

    /**
     * Trouve les utilisateurs par leur rôle.
     * Cette méthode sera automatiquement implémentée par Spring Data JPA. 
     * @param role
     * @return La liste des utilisateurs correspondant au rôle fourni.
     */
    List<Utilisateur> findByRolesContaining(Role role);
}
