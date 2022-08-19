package com.springboot.vacunacion.Services;

import com.springboot.vacunacion.Models.UserModel;
import com.springboot.vacunacion.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> obtenerUsuarios(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel guardarUsuario(UserModel usuario){
        return userRepository.save(usuario);
    }

}
