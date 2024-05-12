package com.SotnanceL3.SotnanceL3Api.controller;

import com.SotnanceL3.SotnanceL3Api.entity.Mecanician;
import com.SotnanceL3.SotnanceL3Api.entity.Person;
import com.SotnanceL3.SotnanceL3Api.service.MecanicianService;
import com.SotnanceL3.SotnanceL3Api.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/mecancian")
public class MecanicianController {

    private final MecanicianService mecanicianService;

    public MecanicianController(MecanicianService mecanicianService) {
        this.mecanicianService = mecanicianService;
    }


    @GetMapping 
    public List<Mecanician> getMecanicians() {
        return mecanicianService.getMecanicians();
    }
@PostMapping
public Mecanician AddMecanician(@RequestBody Mecanician person)
{
return  mecanicianService.AddMecanician(person);

}
@DeleteMapping("/{id}")
public void DeletMecanician(@PathVariable("id") Long idPerson) {
    mecanicianService.DeletMecanician(idPerson);
}
@PutMapping("/{id}")
public void UpdateMecanician (@PathVariable("id") Long id,@RequestBody Mecanician person)
{
    mecanicianService.UpdateMecanician(id,person);
}
    @GetMapping("/{id}")
    public Optional<Mecanician> getMecanician(@PathVariable("id") Long id){return mecanicianService.getMecanician(id);}
}
