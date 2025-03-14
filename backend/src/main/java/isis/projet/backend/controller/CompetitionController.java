package isis.projet.backend.controller;

import isis.projet.backend.entity.Competition;
import isis.projet.backend.service.CompetitionService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/competitions")
public class CompetitionController {

    private final CompetitionService competitionService;

    public CompetitionController(CompetitionService competitionService) {
        this.competitionService = competitionService;
    }

    @GetMapping
    public List<CompetitionDTO> getAllCompetitions() {
        return competitionService.getAllCompetitions().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Optional<CompetitionDTO> getCompetitionById(@PathVariable Integer id) {
        return competitionService.getCompetitionById(id).map(this::convertToDTO);
    }

    @GetMapping("/lieu/{lieu}")
    public List<CompetitionDTO> getCompetitionsByLieu(@PathVariable String lieu) {
        return competitionService.getCompetitionsByLieu(lieu).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/upcoming")
    public List<CompetitionDTO> getUpcomingCompetitions() {
        return competitionService.getUpcomingCompetitions(new Date()).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @PostMapping
    public CompetitionDTO createCompetition(@RequestBody CompetitionDTO dto) {
        Competition competition = new Competition();
        competition.setNom(dto.nom);
        competition.setLieu(dto.lieu);
        competition.setDate(dto.date);
        return convertToDTO(competitionService.saveCompetition(competition));
    }

    @DeleteMapping("/{id}")
    public void deleteCompetition(@PathVariable Integer id) {
        competitionService.deleteCompetition(id);
    }

    private CompetitionDTO convertToDTO(Competition competition) {
        CompetitionDTO dto = new CompetitionDTO();
        dto.id = competition.getId();
        dto.nom = competition.getNom();
        dto.lieu = competition.getLieu();
        dto.date = competition.getDate();
        return dto;
    }
}
