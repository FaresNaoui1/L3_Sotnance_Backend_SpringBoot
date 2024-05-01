package com.SotnanceL3.SotnanceL3Api.controller;

import java.util.List;
import java.util.Optional;

import com.SotnanceL3.SotnanceL3Api.service.RollService;
import com.SotnanceL3.SotnanceL3Api.entity.Roll;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path = "/api/v1/roll")
public class RollController {
@SuppressWarnings("unused")
private final RollService rollService;


 
    public RollController(RollService rollService) {
    this.rollService = rollService;
}
    @GetMapping 
    public List<Roll> getPersons() {
        return rollService.getRoll();
    }
@PostMapping
public void AddRoll(@RequestBody Roll roll)
{
rollService.addRoll(roll);

}
@DeleteMapping("/{idRoll}")
public void DeletRoll(@PathVariable("idRoll") Long idRoll) {
rollService.deleteRoll(idRoll);
}
@PutMapping("/{idRoll}")
public void UpdateRoll (@PathVariable("idRoll") Long id,@RequestBody Roll roll)
{
    
rollService.updateRoll(id,roll);
}
@GetMapping("/{idRoll}")
public Optional<Roll> getRollById(@PathVariable("idRoll") Long idRoll)
{
    return rollService.getRollById(idRoll);
}
}