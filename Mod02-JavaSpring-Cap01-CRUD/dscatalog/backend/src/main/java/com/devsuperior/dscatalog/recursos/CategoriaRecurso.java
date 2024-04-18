package com.devsuperior.dscatalog.recursos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.entidades.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaRecurso {

	@GetMapping
	public ResponseEntity<List<Categoria>> buscaTodos(){
		List<Categoria> listaTodos = new ArrayList<>();
		listaTodos.add(new Categoria(1L, "Livros"));
		listaTodos.add(new Categoria(2L, "Canetas"));
		listaTodos.add(new Categoria(3L, "Eletrônicos"));
		listaTodos.add(new Categoria(4L, "Brinquedos"));
		listaTodos.add(new Categoria(5L, "Vestimentas"));
		return ResponseEntity.ok().body(listaTodos);
	}
}
