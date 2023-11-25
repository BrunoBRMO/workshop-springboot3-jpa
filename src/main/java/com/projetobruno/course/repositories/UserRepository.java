package com.projetobruno.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobruno.course.entities.User;

//Repository responsavel por operações da entidade User
public interface UserRepository extends JpaRepository<User, Long>  {
	//Não é necessario criar a implementação da interface, pois o Spring Data JPA já tem uma implementação
	//padrão para esta interface
	

}
