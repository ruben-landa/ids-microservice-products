package com.ids.ids.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ids.ids.models.ProductoModel;
import com.ids.ids.repositories.IProductoRepository;

@Service
public class ProductoService {

	@Autowired
	IProductoRepository productoRepository;

	// LISTADO PRODUCTOS

	public ArrayList<ProductoModel> getProductos(){
		return (ArrayList<ProductoModel>) productoRepository.findAll();
	}

	// BUSCAR PRODUCTO ID

	public Optional<ProductoModel> getById(Long id){
		return productoRepository.findById(id);
	}

	// GUARDAR PRODUCTO

	public ProductoModel saveProducto(ProductoModel producto) {
		return productoRepository.save(producto);
	}

	// ACTUALIZAR PRODUCTO

	public ProductoModel updateById(ProductoModel request, Long id) {
		ProductoModel productoModel = productoRepository.findById(id).get();

		productoModel.setNombreProducto(request.getNombreProducto());
		productoModel.setPrecio(request.getPrecio());
		productoRepository.save(productoModel);

		return productoModel;
	}

	// ELIMINAR PRODUCTO

	public Boolean deleteProduct (Long id) {
		 try {
			 productoRepository.deleteById(id);
			 return true;
		 }catch(Exception e) {
			 return false;
		 }
	}

}
