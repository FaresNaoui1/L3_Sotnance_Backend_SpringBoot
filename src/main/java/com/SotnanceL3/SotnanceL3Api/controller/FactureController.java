package com.SotnanceL3.SotnanceL3Api.controller;


import java.util.List;

import com.SotnanceL3.SotnanceL3Api.service.FactureService;
import com.SotnanceL3.SotnanceL3Api.entity.Facture;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/facture")
public class FactureController {
private final FactureService factureService;

public FactureController(FactureService factureService) {
    this.factureService = factureService;
}

@GetMapping
public List<Facture> GetFacture()
{
    return factureService.getFacture();
}

@PostMapping
public void AddFacture(@RequestBody Facture facture)
{
    factureService.addFacture(facture);
}

@DeleteMapping("/{idFacture}")
public void DeletFacture( @PathVariable("idFacture") Long ID)
{
    factureService.deletFacture(ID);
}

@PutMapping("/{idFacture}")
public void updatedFacture(@PathVariable("idFacture") Long Id , Facture facture)
{
    factureService.updateRoll(Id, facture);
}
}
