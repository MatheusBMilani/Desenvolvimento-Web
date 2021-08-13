package com.R4SC;

public class Main {

    public static void main(String[] args) {

        // criando tabuleiro
        Tabuleiro tabuleiro = new Tabuleiro();

        // criando os barcos
        Embarcacao submarino = new Submarino('h', 4, 1);
        Embarcacao portaAviao = new PortaAviao('v', 0, 2);
        Embarcacao navio = new Navio('h', 4, 5);

        // adicionando os barcos
        tabuleiro.adicionar(submarino);
        tabuleiro.adicionar(navio);
        tabuleiro.adicionar(portaAviao);

        BatalhaNaval bn = new BatalhaNaval(tabuleiro);

        bn.imprimir();
        //submarino tenta atirar em (3,4)
        bn.atirar(navio, 3, 4);
        // navio tenta atirar em (0,0)
        bn.atirar(submarino, 0, 0);
        // portaAviao tenta atirar em (10 ,0)
        bn.atirar(portaAviao, 10, 0);
        // portaAviao tenta atirar em (4,1)
        bn.atirar(navio, 4, 1);
        bn.imprimir();
        // submarino tenta atirar em (4,1)
        bn.atirar(submarino, 4, 1);
        // portaAviao tenta atirar em (0,2)
        bn.atirar(portaAviao, 0, 2);
        bn.imprimir();
    }
}
