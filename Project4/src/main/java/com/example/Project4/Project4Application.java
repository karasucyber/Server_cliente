package com.example.Project4;

import com.example.Project4.Produtos.Produtos;
import com.example.Project4.Repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;


@SpringBootApplication
public class Project4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Project4Application.class, args);

	}
	@Autowired
	private ProdutosRepository repository;

	@Override
	public void run(String... args) throws Exception{
		 /*Produtos p = new Produtos("BANANA",10,10);
	     repository.save(p);
		Produtos p1 = new Produtos("Maça",10,10);
		repository.save(p1);*/




	}
 }
