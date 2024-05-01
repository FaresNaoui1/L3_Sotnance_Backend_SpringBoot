package com.SotnanceL3.SotnanceL3Api.controller;

import java.util.List;

import com.SotnanceL3.SotnanceL3Api.service.VehiculeMarqueService;
import com.SotnanceL3.SotnanceL3Api.entity.VehiculeMarque;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/VM")
public class VehiculeMarqueController {
@SuppressWarnings("unused")
private final VehiculeMarqueService vmService;

    public VehiculeMarqueController(VehiculeMarqueService vmService) {
    this.vmService = vmService;
}
    @GetMapping 
    public List<VehiculeMarque> getVM() {
        return vmService.getVM();
    }
@PostMapping
public void AddVM(@RequestBody VehiculeMarque VM)
{
vmService.addVM(VM);

}
@DeleteMapping("/{idVM}")
public void DeletVT(@PathVariable("idVM") Long idVT) {
vmService.deleteVM(idVT);
}
@PutMapping("/{idVM}")
public void UpdateVM (@PathVariable("idVM") Long id,@RequestBody VehiculeMarque VT)
{
    vmService.updateVT(id,VT);

}
}
