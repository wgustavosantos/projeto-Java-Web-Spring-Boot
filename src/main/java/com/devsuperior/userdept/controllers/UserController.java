package com.devsuperior.userdept.controllers;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repositories.UserRepository;

@RestController /* Classe que vai ser a controladora e vai responder por requisições*/
@RequestMapping(value="/users") /* Caminho que o controlador vai responder */
public class UserController {
	/*Criando um endpoint */
	
	@Autowired /* Mecanismo de injeção de dependencia */
	private UserRepository userRepository; 
	
	@GetMapping() /* requisição Get */
	public List<User> findAll (){
		
		List<User> result = userRepository.findAll();
		return result;
		
	}

}
