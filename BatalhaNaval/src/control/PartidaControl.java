/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.Navio;
import model.Partida;
import model.Tabuleiro;
import view.Janela;

/**
 *
 * @author 0068943
 */
public class PartidaControl {
    private Partida partida;
    private Janela origem;

    public PartidaControl(Partida partida, Janela origem) {
        this.partida = partida;
        this.origem = origem;
    }
    
    public void posicionaNavio(Navio navio, int parOrdenado[], int direcao) {
        TabuleiroControl controleTabuleiro = new TabuleiroControl(new Tabuleiro());
        if(controleTabuleiro.validaPosicionamento(navio, parOrdenado, direcao)) {
            
        }
    }
    
    public void realizaJogada() {
        this.partida.realizaRodada(new JogadorControl(origem));
    }
}
