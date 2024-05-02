package com.SotnanceL3.SotnanceL3Api.controller;

import com.SotnanceL3.SotnanceL3Api.entity.Rapport;
import com.SotnanceL3.SotnanceL3Api.service.RapportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/rapport")
public class RapportController 
{
    private final RapportService rapportService;

    public RapportController(RapportService rapportService) {
        this.rapportService = rapportService;
    }


    @GetMapping
    public List<Rapport> GetRapports()
    {
        return rapportService.getRapports();
    }

    @GetMapping("/{id}")
    public Optional<Rapport> getRapport(@PathVariable("id") Long id){return  rapportService.geRapport(id);}
    @PostMapping
    public void AddRapport(@RequestBody Rapport rapport)
    {
        rapportService.addRapport(rapport);
    }

    @DeleteMapping("/{id}")
    public void DeletRapport( @PathVariable("id") Long ID)
    {
        rapportService.deletRapport(ID);
    }

    @PutMapping("/{id}")
    public void updatedPiece(@PathVariable("id") Long Id , Rapport rapport)
    {
        rapportService.updateRapport(Id, rapport);
    }
}
