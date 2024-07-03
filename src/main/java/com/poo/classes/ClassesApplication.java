package com.poo.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassesApplication.class, args);

		Autor sirArthurConanDoyle = new Autor("Sir Arthur Conan Doyle");

		Editora record = new Editora("Record");

		Livro sherlock = new Livro(3, "Um estudo em vermelho", 1885, sirArthurConanDoyle, "Romance Policial", record );

		//id.setId(1);
		System.out.println("------------------------");
		System.out.println("==== Dados do livro ====");
		System.out.println("------------------------");
		System.out.println("Id: " + sherlock.getId() + "\n" + "Edição: " +sherlock.getEdicao() + "\n" + "Título: " + sherlock.getTitulo() + "\n" + 
			"Ano de publicação: " + sherlock.getAno() + "\n" + "Autor: " + sherlock.getAutor().getNome() + "\n" + "Categoria: " + 
			sherlock.getCategoria() + "\n" + "Editora: " + sherlock.getEditora().getNome());
	}


}
