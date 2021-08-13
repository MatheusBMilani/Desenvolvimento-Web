package com.R4SC;


public class Submarino extends Embarcacao {

    protected Integer tamanho = 2;
    protected String nome = "Submarino";

    public Submarino(char orientacao, int linhaInicial, int colunaInicial) {
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
        System.out.println("O submarino foi destruido!");
    }

    public String toString() {
        return "Submarinos";
    }

    public Integer getTamanho(){
        return tamanho;
    }
}

