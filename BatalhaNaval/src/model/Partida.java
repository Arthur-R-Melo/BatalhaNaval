/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import control.JogadorControl;
import model.jogador.Jogador;
import model.jogador.Computador;

/**
 *
 * @author 0068943
 */
public class Partida {
    private Jogador jogadores[];
    private final int TOTAL_DE_PARTES = Navio.CRUZADOR.getTam() + Navio.FRAGATA.getTam() + Navio.PORTA_AVIOES.getTam();

    public Partida() {
        this.jogadores = new Jogador[2];
        this.jogadores[0] = new Jogador();
        this.jogadores[1] = new Computador();
    }
    
    public void realizaRodada(JogadorControl jogControl) {
        int parOrdenado[];
        
        for (int i = 0; i < this.jogadores.length; i++) {
            parOrdenado = this.jogadores[i].realizaAtaque(jogControl);
            int temp = i == 0 ? 1:0;
            if(this.jogadores[temp].getTabuleiro().recebeTiro(parOrdenado)) {
                this.jogadores[temp].destroiParte();
            }
            if(validaVitoria(this.jogadores[temp])) {
                return;
            }
        }
    }
    
    public boolean posicionaNavios() {
        for (int i = this.jogadores.length; i >= 0; i--) {
        }
    }
    
    public boolean validaVitoria(Jogador jog) {
        return jog.getParteDestruidas() == TOTAL_DE_PARTES;
    }
}
