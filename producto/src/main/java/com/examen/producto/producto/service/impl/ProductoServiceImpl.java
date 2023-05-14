package com.examen.producto.producto.service.impl;

import com.examen.producto.producto.entity.Producto;
import com.examen.producto.producto.repository.ProductoRepository;
import com.examen.producto.producto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public List<Producto> listar() {
        return productoRepository.findAll();
    }
    @Override
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }
    @Override
    public Producto actualizar(Producto producto) {
        return productoRepository.save(producto);
    }
    @Override
    public Optional<Producto> listarPorId(Integer id) {
        return productoRepository.findById(id);
    }
    @Override
    public void eliminarPorId(Integer id) {
        productoRepository.deleteById(id);
    }

}
