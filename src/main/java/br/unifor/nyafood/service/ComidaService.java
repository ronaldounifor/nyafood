package br.unifor.nyafood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifor.nyafood.model.Comida;
import br.unifor.nyafood.repository.ComidaRepository;

@Service 
public class ComidaService {
    @Autowired 
    private ComidaRepository repository;

    public List<Comida> listarItens() {
        return repository.findAll();
    }

    public Comida listarItem(int id) {
        return repository.findById(id).get();
    }

    public void adicionar(Comida comida) {
        repository.save(comida);
    }

}
