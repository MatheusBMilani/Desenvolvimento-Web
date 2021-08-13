package com.R4SC;

import java.util.ArrayList;

public class Tabuleiro {

    private char[][] tabu;
    private ArrayList<Embarcacao> barcos;

    public static final int TAMANHO_X = 11;
    public static final int TAMANHO_Y = 23;

    public Tabuleiro() {

        this.tabu = new char[TAMANHO_X][TAMANHO_Y];
        this.barcos = new ArrayList<>();

        for(int i = 0; i < TAMANHO_X; i++){
            for(int j = 0; j < TAMANHO_Y; j++){

                if(j>2 && i==0){
                    tabu[i][j] = (j%2!=0) ? (char)(48+(j-3)-(j-3)/2) : '|';
                }else if(j==1 && i>0){
                    tabu[i][j] = (char)(i-1+48);
                }else{
                    tabu[i][j] = (j%2!=0) ? ' ' : '|';
                }
            }
        }
    }

    public void adicionar(Embarcacao barco) {

        if (barcos.contains(barco)){
            atualizarNoTabuleiro(barco);
        }else if(posicaoValida(barco) == true) {
            atualizarNoTabuleiro(barco);
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public void atualizarNoTabuleiro(Embarcacao barco) {

        barcos.add(barco);

        ArrayList<Integer> linhasOc = barco.getLinhasOcupadas();
        ArrayList<Integer> colunasOc = barco.getColunasOcupadas();

        for (int i : linhasOc) {
            for (int j: colunasOc) {
                tabu[i][j] = barco.toString().charAt(0);
            }
        }
    }

    public boolean posicaoValida(Embarcacao barco) {

        boolean ehValida = true;

        ArrayList<Integer> linhasOc = barco.getLinhasOcupadas();
        ArrayList<Integer> colunasOc = barco.getColunasOcupadas();

        for (int i : linhasOc) {
            for (int j: colunasOc) {
                ehValida = (tabu[i][j]!=' ') ? false : true;
            }
        }

        return ehValida;
    }

    public ArrayList<Embarcacao> getEmbarcacoes() {
        return barcos;
    }

    public char[][] getTabu(){
        return tabu;
    }
}

