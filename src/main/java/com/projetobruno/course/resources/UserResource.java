package com.projetobruno.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetobruno.course.entities.User;
import com.projetobruno.course.services.UserService;

@RestController //Para declarar que a classe é um recurso web e implementado por um controlador REST
@RequestMapping(value = "/users")//Nome do recurso, caminho do recurso
public class UserResource { 
	//Testar se o REST da aplicação esta funcionando

	@Autowired
	private UserService service;
	
	//Endpoint para acessar os usuários, RespEnt -> retorna respostas de requisições web
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
