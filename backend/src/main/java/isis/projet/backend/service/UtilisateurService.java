package isis.projet.backend.service;

import isis.projet.backend.Enum.Categorie;
import isis.projet.backend.Enum.Niveau;
import isis.projet.backend.Enum.Role;

import isis.projet.backend.dao.UtilisateurRepository;
import isis.projet.backend.entity.Utilisateur;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {
    
    private final UtilisateurRepository utilisateurRepository;

    // Injection de dépendances par constructeur
    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    /**
     * Récupère tous les utilisateurs.
     * @return La liste de tous les utilisateurs.
     */
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    /**
     * Récupère un utilisateur par son identifiant.
     * @param id
     * @return L'utilisateur correspondant à l'identifiant fourni, ou un Optional vide si non trouvé.
     */
    public Optional<Utilisateur> getUtilisateurById(Integer id) {
        return utilisateurRepository.findById(id);
    }

    /**
     * Récupère un utilisateur par son nom.
     * @param nom
     * @return L'utilisateur correspondant au nom fourni, ou un Optional vide si non trouvé.
     */
    public Optional<Utilisateur> getUtilisateurByNom(String nom) {
        return utilisateurRepository.findByNom(nom);
    }

    /**
     * Récupère les utilisateurs par leur catégorie.
     * @param categorie
     * @return La liste des utilisateurs correspondant à la catégorie fournie.
     */
    public List<Utilisateur> getUtilisateursByCategorie(Categorie categorie) {
        return utilisateurRepository.findByCategorie(categorie);
    }

    /**
     * Récupère les utilisateurs par leur niveau.
     * @param niveau
     * @return La liste des utilisateurs correspondant au niveau fourni.
     */
    public List<Utilisateur> getUtilisateursByNiveau(Niveau niveau) {
        return utilisateurRepository.findByNiveau(niveau);
    }

    /**
     * Récupère les utilisateurs par leur rôle.
     * @param role
     * @return La liste des utilisateurs correspondant au rôle fourni.
     */
    public List<Utilisateur> getUtilisateursByRole(Role role) {
        return utilisateurRepository.findByRolesContaining(role);
    }

    /**
     * Enregistre un utilisateur.
     * @param utilisateur
     * @return L'utilisateur enregistré.
     */
    public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    /**
     * Supprime un utilisateur.
     * @param id
     */
    public void deleteUtilisateur(Integer id) {
        utilisateurRepository.deleteById(id);
    }
}
