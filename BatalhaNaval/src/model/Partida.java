package model;

import control.JogadorControl;
import model.jogador.Jogador;
import model.jogador.Computador;

/**
 *
 * @author Arthur
 */
public class Partida {

    private final Jogador jogadores[];
    private final int TOTAL_DE_PARTES = Navio.CRUZADOR.getTam() + Navio.FRAGATA.getTam() + Navio.PORTA_AVIOES.getTam();
    private int[] lastAtk;
    private Jogador jogVitorioso;

    public Partida() {
        this.lastAtk = new int[2];
        this.jogadores = new Jogador[2];
        this.jogadores[0] = new Jogador();
        this.jogadores[1] = new Computador();
    }
    
    
    /*
    Realiza a jogada de um jogador, alterando a respectiva posiçao do ataque
    e retorna caso ocorra uma vitória
    */
    public boolean realizaRodada(JogadorControl jogControl, int i) {
        int parOrdenado[];

        parOrdenado = this.jogadores[i].realizaAtaque(jogControl);
        int temp = i == 0 ? 1 : 0;//Tem como função pegar o indice do outro jogador
        if(this.jogadores[i] instanceof Computador) {
            this.lastAtk = parOrdenado.clone();
        }
        if (this.jogadores[temp].getTabuleiro().recebeTiro(parOrdenado)) {
            this.jogadores[temp].destroiParte();
        }
        if (validaVitoria(this.jogadores[temp])) {
            this.jogVitorioso = this.jogadores[i];
            return true;
        }
        return false;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public boolean validaVitoria(Jogador jog) {
        return jog.getParteDestruidas() == TOTAL_DE_PARTES;
    }

    public int[] getLastAtk() {
        return lastAtk;
    }

    public Jogador getJogVitorioso() {
        return jogVitorioso;
    }

}
