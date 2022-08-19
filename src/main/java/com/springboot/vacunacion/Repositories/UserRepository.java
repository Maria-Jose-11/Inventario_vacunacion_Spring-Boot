package com.springboot.vacunacion.Repositories;

import java.util.ArrayList;
import java.util.Optional;

import com.springboot.vacunacion.Models.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<UserModel, Long>{

}
