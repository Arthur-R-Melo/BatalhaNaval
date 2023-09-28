/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.Navio;
import model.Partida;
import model.Tabuleiro;
import model.jogador.Jogador;
import view.Janela;

/**
 *
 * @author 0068943
 */
public class PartidaControl {

    private Janela origem;

    public PartidaControl(Janela origem) {
        this.origem = origem;
    }

    public boolean posicionaNavio(Navio navio) {
        Partida partida = this.origem.getPartida();
        int[] parOrdenado;
        boolean direcao;//verdadeiro para horizontal e falso para vertical
        TabuleiroControl tabCtrl;
        JogadorControl jogCtrl = new JogadorControl(origem);
        for (Jogador jog : partida.getJogadores()) {
            tabCtrl = new TabuleiroControl(jog.getTabuleiro());
            parOrdenado = jog.getParNavio(jogCtrl);
            direcao = jog.getDirecaoNavio(jogCtrl);
            if (!tabCtrl.validaPosicionamento(navio, parOrdenado, direcao)) {
                return false;
            } else {
                jog.getTabuleiro().posicionaNavio(navio, parOrdenado, direcao);
            }
        }
        return true;
    }

    public boolean realizaJogada(int i) {
        //TODO
        Partida partida = this.origem.getPartida();
        partida.realizaRodada(new JogadorControl(origem), i);
        int temp = i == 1 ? 0 : 1;
        return true;
    }

    public Tabuleiro getTabuleiro(int indice) {
        Partida partida = this.origem.getPartida();
        return partida.getJogadores()[indice].getTabuleiro();
    }

    public int[] getLastAtk() {
        Partida partida = this.origem.getPartida();
        return partida.getLastAtk();
    }

    public int getValorCoord(int indiceJog, int[] parOrdenado) {
        Partida partida = this.origem.getPartida();
        return partida.getJogadores()[indiceJog].getTabuleiro().getCoord(parOrdenado);
    }
}
