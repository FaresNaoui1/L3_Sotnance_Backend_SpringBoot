package com.SotnanceL3.SotnanceL3Api.controller;

import com.SotnanceL3.SotnanceL3Api.entity.Cheffeur;
import com.SotnanceL3.SotnanceL3Api.entity.Person;
import com.SotnanceL3.SotnanceL3Api.service.CheffeurService;
import com.SotnanceL3.SotnanceL3Api.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/cheffeur")
public class CheffeurController {

    private final CheffeurService cheffeurService;

    public CheffeurController(CheffeurService cheffeurService) {
        this.cheffeurService = cheffeurService;
    }


    @GetMapping
    public List<Cheffeur> getCheffeurs() {
        return cheffeurService.getCheffeurs();
    }
@PostMapping
public Cheffeur AddCheffeur(@RequestBody Cheffeur person)
{
return  cheffeurService.AddCheffeur(person);

}
@DeleteMapping("/{id}")
public void DeletCheffeur(@PathVariable("id") Long idPerson) {
    cheffeurService.DeletCheffeur(idPerson);
}
@PutMapping("/{id}")
public void UpdateCheffeur (@PathVariable("id") Long id,@RequestBody Cheffeur person)
{
    cheffeurService.UpdateCheffeur(id,person);
}
    @GetMapping("/{id}")
    public Optional<Cheffeur> getCheffeur(@PathVariable("id") Long id){return cheffeurService.getCheffeur(id);}
}
