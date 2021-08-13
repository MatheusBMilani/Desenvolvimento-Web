package com.R4SC;


public class Navio extends Embarcacao {

    protected Integer tamanho = 3;
    protected String nome = "Navio";

    public Navio(char orientacao, int linhaInicial, int colunaInicial) {
        super(orientacao, linhaInicial, colunaInicial);

        setPosicoes();
    }

    private void setPosicoes() {

        if(orientacao=='h'){
            linhasOcupadas.add(linhaInicial);
            for(int j = colunaInicial+3; j<colunaInicial+3+ 2*tamanho; j++){
                if(j%2!=0) {
                    colunasOcupadas.add(j);
                }
            }
        }else{
            colunasOcupadas.add(colunaInicial);
            for(int i = linhaInicial; i < linhaInicial+tamanho; i++){
                linhasOcupadas.add(i);
            }
        }
    }

    public void destruir() {
        destruido = true;
        nome = "destruído";
        System.out.println("O navio foi destruído!");
    }

    public String toString() {
        return "Navio";
    }

    public Integer getTamanho(){
        return tamanho;
    }
}

