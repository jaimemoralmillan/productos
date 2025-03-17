package com.digitech.examen.productos.models.daos;

import com.digitech.examen.productos.models.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductoDAO extends JpaRepository<Producto,Integer> {


    // Encuentra productos con precio inferior al valor dado
    List<Producto> findByPrecioLessThan(Integer precio);



}
