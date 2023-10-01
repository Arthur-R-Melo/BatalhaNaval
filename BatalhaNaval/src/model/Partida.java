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
    private Jogador jogVitorioso;

    public Partida() {
        this.jogadores = new Jogador[2];
        this.jogadores[0] = new Jogador();
        this.jogadores[1] = new Computador();
    }
    
    
    /*
    Realiza a jogada de um jogador, alterando a respectiva posiçao do ataque
    e retorna caso ocorra uma vitória
    */
    public void realizaRodada(JogadorControl jogControl, int i, int j) {
        int parOrdenado[];

        parOrdenado = this.jogadores[i].realizaAtaque(jogControl);
        
        if(this.jogadores[i] instanceof Computador) {
            while (this.jogadores[j].getTabuleiro().getCoord(parOrdenado) == Tabuleiro.NAVIO_ACERTADO ||
                    this.jogadores[j].getTabuleiro().getCoord(parOrdenado) == Tabuleiro.TIRO_AGUA) {
                parOrdenado = this.jogadores[i].realizaAtaque(jogControl);
            }
        }
        if (this.jogadores[j].getTabuleiro().recebeTiro(parOrdenado)) {
            this.jogadores[j].destroiParte();
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public boolean validaVitoria(Jogador jog) {
        return jog.getParteDestruidas() == TOTAL_DE_PARTES;
    }

    public Jogador getJogVitorioso() {
        return jogVitorioso;
    }

}
