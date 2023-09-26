package com.ativdade.atividade.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Atividade01 {

    @GetMapping("/atividade")
    public String atividade(@RequestParam(value = "horario") String horario){
        switch (horario.toUpperCase()) {
            case "M":
            return "Bom dia";
            
                
            case "V":
            return  "Boa tarde";
            
                
            case "N":
            return  "Boa noite";
            
                
            default:
            return  "unknown animal";
        
                
        }
  
    
    }

}
