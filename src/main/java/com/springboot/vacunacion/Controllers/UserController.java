package com.springboot.vacunacion.Controllers;

import com.springboot.vacunacion.Models.Administrador;
import com.springboot.vacunacion.Models.UserModel;
import com.springboot.vacunacion.Repositories.UserRepository;
import com.springboot.vacunacion.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
//@RequestMapping("/usuarios")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;


    /*@GetMapping("/usuarios")
    public ArrayList<UserModel> obtenerUsuarios(){
        UserModel userModel = new UserModel();
        userModel.setId(1);
        userModel.setNombre("Majo");
        userModel.setApellido("Chala");
        userModel.setCedula("1234567899");
        userModel.setEmail("majo@gmail.com");
        userModel.setUsuario("maria001");
        userModel.setPassword("maria001");

        return A
    }

     */

    @GetMapping("/usuarios")
    public ArrayList<UserModel> obtenerUsuarios(){

        return userService.obtenerUsuarios();
    }

    @PostMapping("/usuarios")
    public UserModel guardarUsuario(@RequestBody UserModel usuario){
        return this.userService.guardarUsuario(usuario);
    }

    @PutMapping("/usuarios")
    public void actualizarUsuario (@RequestBody UserModel usuario){
        userService.modificarUsuario(usuario);
    }

    /*@DeleteMapping(value = "/{id}")
    public void eliminarUsiario(@PathVariable("id") Long id){
        userRepository.deleteById(id);
    } */

    @DeleteMapping("/usuarios/{id}")
    public void eliminarUsuario(@PathVariable("id") Long id){
        userService.eliminarUsuario(id);
    }

}
