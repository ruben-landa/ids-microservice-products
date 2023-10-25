package com.ids.ids.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ids.ids.models.ProductoModel;

@Repository
public interface IProductoRepository extends JpaRepository<ProductoModel, Long>{

}
