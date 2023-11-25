package com.projetobruno.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetobruno.course.entities.User;

@RestController //Para declarar que a classe é um recurso web e implementado por um controlador REST
@RequestMapping(value = "/users")//Nome do recurso, caminho do recurso
public class UserResource { //Testar se o REST da aplicação esta funcionando

	//Endpoint para acessar os usuários, RespEnt -> retorna respostas de requisições web
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "12345678", "12345");
		
		return ResponseEntity.ok().body(u);
	}
	
}
