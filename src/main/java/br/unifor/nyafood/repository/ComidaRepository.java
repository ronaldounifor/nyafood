package br.unifor.nyafood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unifor.nyafood.model.Comida;

public interface ComidaRepository extends JpaRepository<Comida, Integer> {

}
