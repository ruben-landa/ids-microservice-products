package com.ids.ids.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ids.ids.entity.Producto;
import com.ids.ids.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	private final ProductoService service;
	
	public ProductoController(ProductoService service) {
		this.service = service;
	}
	
	@GetMapping
	public Iterable<Producto> list(){
		return service.list();
	}
	
	@GetMapping("/{id}")
	public Producto find (@PathVariable("id") int id) {
		return service.find(id);
	}
	
	@PostMapping
	public Producto create(@RequestBody Producto producto) {
		return service.save(producto);
	}
	
	@PutMapping("/{id}")
	public Producto update(@PathVariable("id") int id, @RequestBody Producto producto) {
		return service.update(id, producto);
	}
	
	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable("id") int id) {
		return service.delete(id);
	}

}
