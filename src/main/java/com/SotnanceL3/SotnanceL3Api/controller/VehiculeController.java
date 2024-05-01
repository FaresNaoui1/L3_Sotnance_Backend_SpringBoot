package com.SotnanceL3.SotnanceL3Api.controller;

import java.util.List;


import com.SotnanceL3.SotnanceL3Api.service.PersonService;
import com.SotnanceL3.SotnanceL3Api.service.VehiculeService;
import com.SotnanceL3.SotnanceL3Api.entity.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/vehicule")
public class VehiculeController {
@SuppressWarnings("unused")
private final VehiculeService VService;
public VehiculeController(VehiculeService vService) {
    VService = vService;
}

@Autowired
PersonService personService;
    @GetMapping 
    public List<Vehicule> getV() {
        return VService.getV();
    }
@PostMapping
public void AddV(@RequestBody Vehicule V)
{
VService.addV(V);

}
@DeleteMapping("/{idV}")
public void DeletV(@PathVariable("idV") Long idV) {
VService.deleteV(idV);
}
@PutMapping("/{idV}")
public void UpdateV (@PathVariable("idV") Long id,@RequestBody Vehicule V)
{
    VService.updateV(id,V);

}

}
