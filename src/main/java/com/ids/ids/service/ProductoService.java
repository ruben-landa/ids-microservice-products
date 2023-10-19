package com.ids.ids.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ids.ids.entity.Producto;

@Service
public class ProductoService {
	
	//LISTADO PRODUCTOS
	
	private List<Producto> productos;
	
	public ProductoService() {
		productos = new ArrayList<>();
		productos.add(new Producto(1,"Leche",30.50));
		productos.add(new Producto(2,"Pan",50));
		productos.add(new Producto(3,"Huevo",30));
	}
	
	public List<Producto> list(){
		return productos;
	}
	
	//BUSCAR PRODUCTO ID 
	
	public Producto find(int id) {
		for(Producto producto : productos) {
			if(producto.getId()== id) {
				return producto;
			}
		}
		
		return null;
		
	}
	
	//GUARDAR PRODUCTO
	
	public Producto save(Producto pro) {
		productos.add(pro);
		return pro;
		
	}
	
	//ACTUALIZAR PRODUCTO
	
	public Producto update(int id, Producto pro) {
		int index = 0;
		for (Producto p: productos) {
			if(p.getId()== id) {
				pro.setId(id);
				productos.set(index, pro);
			}
		}
		return pro;
	}
	
	
	//ELIMINAR PRODUCTO
	
	public boolean delete(int id) {
		for (Producto p : productos) {
			if(p.getId() == id) {
				return productos.remove(p);
			}
		}
		return false;
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


