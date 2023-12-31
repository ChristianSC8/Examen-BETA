package com.examen.venta.venta.controller;

import com.examen.venta.venta.entity.Venta;
import com.examen.venta.venta.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venta")
public class VentaController {
    @Autowired
    private VentaService ventaService;

    @GetMapping()
    public ResponseEntity<List<Venta>> list() {
        return ResponseEntity.ok().body(ventaService.list());
    }

    @PostMapping()
    public ResponseEntity<Venta> save(@RequestBody Venta venta) {
        return ResponseEntity.ok(ventaService.save(venta));
    }

    @PutMapping()
    public ResponseEntity<Venta> update(@RequestBody Venta venta) {
        return ResponseEntity.ok(ventaService.update(venta));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Venta> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(ventaService.listById(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        ventaService.deleteById(id);
        return "Deleted Successfully";
    }

    private ResponseEntity<Venta> fallBackGetCliente(int id, RuntimeException e) {
        return new ResponseEntity("El usuario " + id + " tiene los coches en el taller", HttpStatus.OK);
    }
}
