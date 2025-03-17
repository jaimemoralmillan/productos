package com.digitech.examen.productos.models.entities;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "productos")
public class Producto {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="productos_id_gen")
    @SequenceGenerator(name="books_id_gen",initialValue = 1, sequenceName="productos_id_seq",allocationSize=1)
    @Column(name="id",nullable = false)
    private Integer id;
    @Column(name="nombre",nullable = false)
    private String nombre;
    @Column(name="precio",nullable = true)
    private Integer precio;
    @Column(name="stock",nullable = true)
    private Integer stock;




}
