package com.R4SC;

import java.util.ArrayList;

public class Embarcacao {

    protected ArrayList<Integer> linhasOcupadas = new ArrayList<Integer>();
    protected ArrayList<Integer> colunasOcupadas = new ArrayList<Integer>();
    protected char orientacao;
    protected Integer linhaInicial;
    protected Integer colunaInicial;
    protected boolean destruido;

    public Embarcacao(char orientacao, int linhaInicial, int colunaInicial) {
        this.orientacao = orientacao;
        this.linhaInicial = linhaInicial;
        this.colunaInicial = colunaInicial;
        this.destruido = false;
    }

    public ArrayList<Integer> getLinhasOcupadas() {
        return linhasOcupadas;
    }

    public ArrayList<Integer> getColunasOcupadas() {
        return colunasOcupadas;
    }

    public void destruir() {
        destruido = true;
    }

    public boolean estaDestruida() {
        return destruido;
    }

    public Integer getLinhaInicial(){
        return linhaInicial;
    }

    public Integer getColunaInicial(){
        return colunaInicial;
    }
}
