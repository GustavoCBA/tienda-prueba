package com.prueba.tienda.service;

import java.util.List;
import java.util.Optional;

import com.prueba.tienda.model.Orden;
import com.prueba.tienda.model.Usuario;

public interface IOrdenService {
	List<Orden> findAll();
	Optional<Orden> findById(Integer id);
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);
}
