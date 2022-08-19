package com.springboot.vacunacion.Controllers;

import com.springboot.vacunacion.Models.Administrador;
import com.springboot.vacunacion.Models.Empleados;
import com.springboot.vacunacion.Services.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/administrador")
public class AdministradorController {
    @Autowired
    AdministradorService administradorService;

    @GetMapping
    public ArrayList<Administrador> obtenerUsuarios(){

        return administradorService.obtenerUsuarios();
    }

    @PostMapping()
    public Administrador guardarUsuario(@RequestBody Administrador administrador){
        return this.administradorService.guardarUsuario(administrador);
    }
}
