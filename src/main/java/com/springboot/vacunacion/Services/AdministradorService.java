package com.springboot.vacunacion.Services;

import com.springboot.vacunacion.Models.Administrador;
import com.springboot.vacunacion.Repositories.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdministradorService {
    @Autowired
    AdministradorRepository administradorRepository;

    public ArrayList<Administrador> obtenerUsuarios(){
        return (ArrayList<Administrador>) administradorRepository.findAll();
    }

    public Administrador guardarUsuario(Administrador administrador) {
        return administradorRepository.save(administrador);
    }
}
