package com.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entity.Editorial;
import com.colegio.repository.EditorialRepository;

@Service
public class EditorialServiceImpl implements EditorialService {

	@Autowired
	private EditorialRepository repository;

	@Override
	public Editorial insertaEditorial(Editorial obj) {
		return repository.save(obj);
	}

	@Override
	public List<Editorial> listaEditorial() {
		return repository.findAll();
	}

}
