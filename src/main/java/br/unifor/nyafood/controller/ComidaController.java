package br.unifor.nyafood.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.unifor.nyafood.model.Comida;
import br.unifor.nyafood.service.ComidaService;

@RestController 
public class ComidaController {
   @Autowired 
   private ComidaService service;
   
   @GetMapping ("/itens")
   public List<Comida> getMenu() {
      return service.listarItens();
   }

   @GetMapping("/itens/{id}")
   public Comida getDetalhes(@PathVariable int id) {
      return service.listarItem(id);
   }

   @PostMapping("/itens")
   public void criarItem(@RequestBody Comida comida) {
      service.adicionar(comida);
   }

//    public void atualizarItem(int id, Comida comida) {
//     menu.remove(id);
//     menu.add(comida);
//    }

   // @DeleteMapping("/itens/{id}")
   // public void deletarItem(@PathVariable int id) {
   //  menu.remove(id);
   // }

   // public void deletarTodos() {
   //  menu = new ArrayList<>();
   // }
}
