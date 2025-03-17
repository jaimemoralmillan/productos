package com.digitech.examen.productos.controller;

import com.digitech.examen.productos.models.daos.IProductoDAO;
import com.digitech.examen.productos.models.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class ProductoController {

    @Autowired
    private IProductoDAO productoDAO;

    //métodos

    //crear un producto

    @PostMapping( value = "/productos")
    public Producto createBook(@RequestBody Producto producto) {
        return this.productoDAO.save(producto);
    }

    // Get all productos
    @GetMapping( value = "/productos")
    public List<Producto> getAllProductos() {
        return this.productoDAO.findAll();
    }

    //Get productos cheaper than

    @GetMapping(value = "/productos/{precio}")
    public List<Producto> getProductosCheaperThan(@PathVariable Integer precio) {
        return this.productoDAO.findByPrecioLessThan(precio);
    }

}
