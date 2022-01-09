package com.devsuperior.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.userdept.entities.User;

/* JPA repositories é interface */                   /*Tipo User e o Id é long */
public interface UserRepository extends JpaRepository<User, Long>{ /* Repository - Objetos responsáveis por acessar dados relacionados a entidades do domínio 
 								Objeto específico pra acessar os dados da entidade User  */

}
