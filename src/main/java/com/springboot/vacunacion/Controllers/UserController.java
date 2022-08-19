package com.springboot.vacunacion.Controllers;

import com.springboot.vacunacion.Models.Administrador;
import com.springboot.vacunacion.Models.UserModel;
import com.springboot.vacunacion.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ArrayList<UserModel> obtenerUsuarios(){
        return userService.obtenerUsuarios();
    }

    @PostMapping
    public UserModel guardarUsuario(@RequestBody UserModel usuario){
        return this.userService.guardarUsuario(usuario);
    }

}
