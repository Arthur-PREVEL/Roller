package isis.projet.backend.controller;

import isis.projet.backend.entity.Utilisateur;
import isis.projet.backend.service.UtilisateurService;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/utilisateurs")
@Tag(name = "Utilisateurs", description = "Endpoints de gestion des utilisateurs")
public class UtilisateurController {

    private final UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping
    @Operation(summary = "Lister tous les utilisateurs", description = "Retourner la liste de tous les utilisateurs.")
    public List<UtilisateurDTO> getAllUtilisateurs() {
        return utilisateurService.getAllUtilisateurs().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Optional<UtilisateurDTO> getUtilisateurById(@PathVariable Integer id) {
        return utilisateurService.getUtilisateurById(id).map(this::convertToDTO);
    }

    @PostMapping
    public UtilisateurDTO createUtilisateur(@RequestBody UtilisateurDTO dto) {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(dto.nom);
        utilisateur.setPrenom(dto.prenom);
        utilisateur.setCategorie(dto.categorie);
        utilisateur.setNiveau(dto.niveau);
        return convertToDTO(utilisateurService.saveUtilisateur(utilisateur));
    }

    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable Integer id) {
        utilisateurService.deleteUtilisateur(id);
    }

    private UtilisateurDTO convertToDTO(Utilisateur utilisateur) {
        UtilisateurDTO dto = new UtilisateurDTO();
        dto.id = utilisateur.getId();
        dto.nom = utilisateur.getNom();
        dto.prenom = utilisateur.getPrenom();
        dto.categorie = utilisateur.getCategorie();
        dto.niveau = utilisateur.getNiveau();
        return dto;
    }
}
