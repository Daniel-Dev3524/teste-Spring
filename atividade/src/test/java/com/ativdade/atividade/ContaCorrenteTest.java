package com.ativdade.atividade;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ativdade.atividade.controladores.ContaCorrente;

public class ContaCorrenteTest {

    ContaCorrente contaMaria;
    ContaCorrente contaJose;

    @BeforeEach
    void setUp() {
        contaMaria = new ContaCorrente(200f, "Maria");
        contaJose = new ContaCorrente(100f, "José");
       

    }

    @Test
    void TestConta() {

        assertNotNull(contaMaria);
        assertNotNull(contaJose);

    }

    @Test
    void saldoDiferente(){
        assertNotEquals(contaMaria.getBalanco(), contaJose.getBalanco());
     
    
    }
    @Test
    void saqueMaria(){
        contaMaria.saque(100f);

        assertEquals(contaMaria.getBalanco(), contaJose.getBalanco());

      //cria um metodo saqueMaria  e pega a contaMaria e saca o calor de 100

    }

    @Test
    void depositoContaJose(){
        contaJose.deposito(50f);
        assertEquals(contaJose.getBalanco(),contaMaria.getBalanco()-50);
    }

    @Test
    void sacarValorMaior(){
        assertFalse(contaJose.saque(101f));
        assertEquals(contaJose.getBalanco(), 100f);


    }
    @Test
    void sacarValorValido(){
        assertTrue(contaJose.saque(98f));
        assertEquals(contaJose.getBalanco(), 2f);


    }






}
