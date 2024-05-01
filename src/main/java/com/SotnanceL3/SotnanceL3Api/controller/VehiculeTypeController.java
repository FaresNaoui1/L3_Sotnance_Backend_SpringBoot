package com.SotnanceL3.SotnanceL3Api.controller;

import java.util.List;

import com.SotnanceL3.SotnanceL3Api.service.VehiculeTypeService;
import com.SotnanceL3.SotnanceL3Api.entity.VehiculeType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/VT")
public class VehiculeTypeController {
@SuppressWarnings("unused")
private VehiculeTypeService vtService;

public VehiculeTypeController(VehiculeTypeService vtService) {
    this.vtService = vtService;
}


    @GetMapping 
    public List<VehiculeType> getVT() {
        return vtService.getVT();
    }
@PostMapping
public void AddVT(@RequestBody VehiculeType VT)
{
vtService.addVT(VT);

}
@DeleteMapping("/{idVT}")
public void DeletVT(@PathVariable("idVT") Long idVT) {
vtService.deleteVT(idVT);
}
@PutMapping("/{idVT}")
public void UpdateVT (@PathVariable("idVT") Long id,@RequestBody VehiculeType VT)
{
    vtService.updateVT(id,VT);

}
}
