package com.ativdade.atividade;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class TestesJunit {

    @Test
    void meuPrimeiroTeste() {
        var name = "Daniel";
        assertEquals(name, "Daniel");

    }

  
}