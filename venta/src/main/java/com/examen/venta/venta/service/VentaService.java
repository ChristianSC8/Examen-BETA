package com.examen.venta.venta.service;

import com.examen.venta.venta.entity.Venta;

import java.util.List;
import java.util.Optional;

public interface VentaService {
    public List<Venta> list();

    public Venta save(Venta venta);

    public Venta update(Venta venta);

    public Optional<Venta> listById(Integer id);

    public void deleteById(Integer id);
}

