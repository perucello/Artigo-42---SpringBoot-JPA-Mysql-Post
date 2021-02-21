package com.project.jpa.mysql.SpringBoot.JPA.Mysql.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.jpa.mysql.SpringBoot.JPA.Mysql.Model.Cliente;
import com.project.jpa.mysql.SpringBoot.JPA.Mysql.Repository.Clientes;
 

@RestController
@RequestMapping("api/JPA/Mysql/clientes")
public class ClientesController {
	
	@Autowired
	private Clientes clientes;
		
	@PostMapping("/add")
	public Cliente adicionar(@Valid @RequestBody Cliente cliente) {	
		return clientes.save(cliente);
	}	
}