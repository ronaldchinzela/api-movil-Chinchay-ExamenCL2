package com.colegio.service;

import java.util.List;

import com.colegio.entity.Editorial;

public interface EditorialService {

	public abstract Editorial insertaEditorial(Editorial obj);

	public abstract List<Editorial> listaEditorial();

}
