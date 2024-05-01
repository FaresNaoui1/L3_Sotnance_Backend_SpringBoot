package com.SotnanceL3.SotnanceL3Api.controller;

import java.util.List;

import com.SotnanceL3.SotnanceL3Api.service.OnpanneService;
import com.SotnanceL3.SotnanceL3Api.entity.Onpanne;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/onpanne")
public class OnpanneController {
private final OnpanneService onpanneService;

public OnpanneController(OnpanneService onpanneService) {
    this.onpanneService = onpanneService;
}


@GetMapping
public List<Onpanne> GetOnpanne()
{
    return onpanneService.getOnpanne();
}
@PostMapping
public void AddOnpanne(@RequestBody Onpanne onpanne )
{
    onpanneService.addOnpanne(onpanne);
}

@DeleteMapping("/{idOnpanne}")
public void DeletOnpanne( @PathVariable("idOnpanne") Long ID)
{
 onpanneService.deletOnpanne(ID);
}

@PutMapping("/{idOnpanne}")
public void updatedOnpanne(@PathVariable("idOnpanne") Long Id , Onpanne onpanne)
{
  onpanneService.updateOnpanne(Id, onpanne);
}

}
