package com.R4SC;

import jdk.swing.interop.SwingInterOpUtils;

import static com.R4SC.Tabuleiro.TAMANHO_X;
import static com.R4SC.Tabuleiro.TAMANHO_Y;

public class BatalhaNaval {

    Tabuleiro tabuleiro;

    public BatalhaNaval(Tabuleiro tabuleiro) {

        this.tabuleiro = tabuleiro;
    }

    public void imprimir() {

        for(int i = 0; i < TAMANHO_X; i++){
            for(int j = 0; j < TAMANHO_Y; j++){
                System.out.print(tabuleiro.getTabu()[i][j]);
            }
            System.out.println();
        }
    }

    public void atirar(Embarcacao atirador, int linhaAlvo, int colunaAlvo) {

        boolean alvoAtingido = false;
        Embarcacao barcoAtingido = new Submarino('v',2,3);

        for (Embarcacao e: tabuleiro.getEmbarcacoes()) {
            for (int i: e.getLinhasOcupadas()) {
                for (int j: e.getColunasOcupadas()) {
                    if(i==linhaAlvo && j==colunaAlvo){
                        alvoAtingido=true;
                        barcoAtingido = e;
                    }
                }
            }
        }

        barcoAtingido.destruir();
        tabuleiro.atualizarNoTabuleiro(barcoAtingido);

        System.out.println("--------------------------------------------------\n");
        System.out.println(atirador.toString() + " atirando  na posição " +
                "("+linhaAlvo+","+colunaAlvo+"):\n" + ((alvoAtingido) ? barcoAtingido.toString() : "Água") + "\n");
    }

}
