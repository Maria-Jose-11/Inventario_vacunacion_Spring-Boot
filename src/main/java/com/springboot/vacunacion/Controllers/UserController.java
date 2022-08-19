package com.springboot.vacunacion.Controllers;

import com.springboot.vacunacion.Models.Administrador;
import com.springboot.vacunacion.Models.UserModel;
import com.springboot.vacunacion.Repositories.UserRepository;
import com.springboot.vacunacion.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;


    @GetMapping
    public ArrayList<UserModel> obtenerUsuarios(){

        return userService.obtenerUsuarios();
    }

    @PostMapping
    public UserModel guardarUsuario(@RequestBody UserModel usuario){
        return this.userService.guardarUsuario(usuario);
    }

    @PutMapping
    public UserModel modificarUsuario(@RequestBody UserModel usuario){
        return this.userService.modificarUsuario(usuario);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminarUsiario(@PathVariable("id") Long id){
        userRepository.deleteById(id);
    }

}
