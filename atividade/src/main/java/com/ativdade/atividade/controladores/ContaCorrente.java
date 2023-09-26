package com.ativdade.atividade.controladores;

public class ContaCorrente {
    private Float balanco;
    private String nome;

    public ContaCorrente() {
    }

    public ContaCorrente(Float balanco, String nome) {
        this.balanco = balanco;
        this.nome = nome;
    }

    public Float getBalanco() {
        return balanco;
    }

    public void setBalanco(Float balanco) {
        this.balanco = balanco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void deposito(Float valor) {
        this.balanco += valor;
    }

    public boolean saque(Float saque) {

        if (saque > balanco) {
            return false;
        } else {
            this.balanco -= saque;
            return true;
        }
    }

}
