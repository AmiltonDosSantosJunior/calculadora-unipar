package br.unipar.devbackend.calculadoraunipar.controller;

import br.unipar.devbackend.calculadoraunipar.model.Calculadora;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("soma/{n1}/{n2}")
    public ResponseEntity<Calculadora> soma(@PathVariable Double n1, @PathVariable Double n2){
        Calculadora calculadora = new Calculadora(n1, n2);

        calculadora.soma(n1, n2);

        return ResponseEntity.ok(calculadora);
    }
}
