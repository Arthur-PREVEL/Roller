package isis.projet.backend.controller;

import isis.projet.backend.entity.Resultat;
import isis.projet.backend.service.ResultatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/resultats")
public class ResultatController {

    private final ResultatService resultatService;

    public ResultatController(ResultatService resultatService) {
        this.resultatService = resultatService;
    }

    @GetMapping
    public List<ResultatDTO> getAllResultats() {
        return resultatService.getAllResultats().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Optional<ResultatDTO> getResultatById(@PathVariable Integer id) {
        return resultatService.getResultatById(id).map(this::convertToDTO);
    }

    @GetMapping("/classement/{competitionId}")
    public List<ResultatDTO> getClassementByCompetition(@PathVariable Integer competitionId) {
        return resultatService.getClassementByCompetition(competitionId).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/winner/{competitionId}")
    public Optional<ResultatDTO> getWinnerOfCompetition(@PathVariable Integer competitionId) {
        return resultatService.getWinnerOfCompetition(competitionId).map(this::convertToDTO);
    }

    @PostMapping
    public ResultatDTO createResultat(@RequestBody ResultatDTO dto) {
        Resultat resultat = new Resultat();
        resultat.setClassement(dto.classement);
        resultat.setUtilisateur(dto.utilisateur);
        resultat.setCompetition(dto.competition);
        return convertToDTO(resultatService.saveResultat(resultat));
    }

    @DeleteMapping("/{id}")
    public void deleteResultat(@PathVariable Integer id) {
        resultatService.deleteResultat(id);
    }

    private ResultatDTO convertToDTO(Resultat resultat) {
        ResultatDTO dto = new ResultatDTO();
        dto.id = resultat.getId();
        dto.competition = resultat.getCompetition();
        dto.utilisateur = resultat.getUtilisateur();
        dto.classement = resultat.getClassement();
        return dto;
    }
}
