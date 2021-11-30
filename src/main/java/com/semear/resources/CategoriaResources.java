package com.semear.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.semear.dominio.Categoria;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "categorias")
public class CategoriaResources {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> lista() {
		 Categoria cat1 = new Categoria();
		 Categoria cat2 = new Categoria();
		 
		 
		 cat1.setId(1);
		 cat1.setNome("informatica");
		 
		 cat2.setId(2);
		 cat2.setNome("Escritorio");
		 
		 List<Categoria> listaCat = new ArrayList();
		 
		 
		 
		 
		 listaCat.add(cat1);
		 listaCat.add(cat2);
		
		return listaCat;
	}
}
