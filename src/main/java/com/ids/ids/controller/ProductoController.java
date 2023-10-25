package com.ids.ids.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ids.ids.models.ProductoModel;
import com.ids.ids.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private ProductoService productoService;

	@GetMapping
	public ArrayList<ProductoModel> getProductos(){
		return this.productoService.getProductos();
	}

	@PostMapping
	public ProductoModel saveProducto(@RequestBody ProductoModel producto) {
		return this.productoService.saveProducto(producto);
	}

	@GetMapping(path = "/{id}")
	public Optional<ProductoModel> getProductoById(@PathVariable("id") Long id){
		return this.productoService.getById(id);
	}

	@PutMapping(path = "/{id}")
	public ProductoModel updateProductoById(@RequestBody ProductoModel request, @PathVariable Long id) {
		return this.productoService.updateById(request, id);
	}

	@DeleteMapping(path = "/{id}")
	public String deleteProductoById(@PathVariable("id") Long id) {
		boolean ok = this.productoService.deleteProduct(id);

		if(ok) {
			return " Producto con id " + id + " Eliminado!!! ";
		}else {
			return " Producto con id " + id + "NO Eliminado";
		}
	}
}
