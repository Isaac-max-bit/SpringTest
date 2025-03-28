package com.example.test;


public class Producto {
    private Long id;
    private String nombre;
    private String producto;
    private Double precio;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }
    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }
}