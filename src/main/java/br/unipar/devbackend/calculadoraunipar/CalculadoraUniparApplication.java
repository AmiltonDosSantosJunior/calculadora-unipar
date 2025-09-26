package br.unipar.devbackend.calculadoraunipar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraUniparApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculadoraUniparApplication.class, args);
    }

    //criar endpoints de soma, subtração, multiplicação e divisão
    //receber por @param dois números
    //retornar o resultado da operação matemática
    //se der erro, retornar a mensagem de erro

    //endpoint extra: verificar se um numero é primo
    //endpoint extra: sequencia de fibonacci até o numero X

    //@RequestController
    //@RequestMapping("/calculadora")
    //@GetMapping("/soma")

    //Resultado: Postman com 6 GETs

}
