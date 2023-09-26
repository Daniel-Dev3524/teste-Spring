package com.ativdade.atividade.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class AtividadeParImpar {
    @GetMapping("/convert")

    public String conversao(@RequestParam Integer numero){
        Integer resto = numero%2;

        String texto=("O número é par?"+ (resto == 0)+"<br> O número é positivo?"+(numero>0));
        return texto;
    }
    
}
