package com.example.test;

import com.example.test.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/producto")
public class EndIva {

    @GetMapping("/{id}/{nombre}/{precio}")
    public Map<String, Object> getProducto(@PathVariable Long id, @PathVariable String nombre) {
        // Simulación de datos
        Producto producto = new Producto(); // Aquí deberías buscar el producto en una base de datos
        producto.setId(id);
        producto.setNombre(nombre); // Asigna el nombre recibido
        producto.setPrecio(100.0); // Precio simulado

        Map<String, Object> response = new HashMap<>();
        response.put("id", producto.getId());
        response.put("nombre", producto.getNombre());
        response.put("precio", producto.getPrecio());
        return response;
    }

    @GetMapping("/ivaproducto")
    public Map<String, Object> calcularIva(@RequestBody Producto producto) {
        double iva = producto.getPrecio() * 0.19; // Suponiendo un IVA del 19%
        Map<String, Object> response = new HashMap<>();
        response.put("id", producto.getId());
        response.put("iva", iva);
        return response;
    }

    @PostMapping("/addproduct")
    public Map<String, Object> addProduct(@RequestBody Producto producto) {
        double descuento = producto.getPrecio() * 0.10; // Descuento del 10%
        Map<String, Object> response = new HashMap<>();
        response.put("id", producto.getId());
        response.put("descuento", descuento);
        return response;
    }
}