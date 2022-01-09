package com.devsuperior.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping( value = "/{id}") /* http://localhost:8080/users/id */
	public User findById (@PathVariable Long id){
		
		User result = userRepository.findById(id).get(); /* Retorna um Optional .get() retorna o Objeto dentro do Optional  */
		return result;
		
	}
	
	@PostMapping() /* requisição Post (Para salvar) */
	public User insert(@RequestBody User user){ /* notação para adicionar um objeto/corpo da requisição */
		
		User result = userRepository.save(user);
		return user;
		
	}

}
