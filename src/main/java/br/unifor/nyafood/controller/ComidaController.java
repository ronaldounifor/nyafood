package br.unifor.nyafood.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.unifor.nyafood.model.Comida;

@RestController 
public class ComidaController {
   private ArrayList<Comida> menu = new ArrayList<>(Arrays.asList(
        new Comida("Petisco", 20),
        new Comida("Ração", 200)
    ));


    @GetMapping ("/itens")
   public ArrayList<String> getMenu() {
        ArrayList<String> opcoes = new ArrayList<>();
        for (Comida comida : menu)
            opcoes.add(comida.getDescricao());

        return opcoes;
   }

   @GetMapping("/itens/{id}")
   public Comida getDetalhes(@PathVariable int id) {
    return menu.get(id);
   }

   @PostMapping("/itens")
   public void criarItem(@RequestBody Comida comida) {
    menu.add(comida);
   }

//    public void atualizarItem(int id, Comida comida) {
//     menu.remove(id);
//     menu.add(comida);
//    }

   @DeleteMapping("/itens/{id}")
   public void deletarItem(@PathVariable int id) {
    menu.remove(id);
   }

   public void deletarTodos() {
    menu = new ArrayList<>();
   }
}
