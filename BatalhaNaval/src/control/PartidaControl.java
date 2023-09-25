/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.Partida;
import view.janela;

/**
 *
 * @author 0068943
 */
public class PartidaControl {
    private Partida partida;
    private janela origem;

    public PartidaControl(Partida partida, janela origem) {
        this.partida = partida;
        this.origem = origem;
    }
    
    //posicao [0] = jogador | [1] = máquina
    public int[][][] realizaJogada() {
        //TODO
        return null;
    }
}
