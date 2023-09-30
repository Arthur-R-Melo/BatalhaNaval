/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.Tabuleiro;
import view.Janela;

/**
 *
 * @author 0068943
 */
public class JogadorControl {
    
    private Janela origem;

    public JogadorControl(Janela origem) {
        this.origem = origem;
    }
    
    public int[] getAtk() {
        return this.origem.getCoordAtk();
    }
    
    public int[] getParInicial() throws NumberFormatException{
        return TabuleiroControl.convertePosicao(this.origem.getTempCoordNavio());
    }
    
    public boolean getDirecaoNavio() {
        return origem.isTempPosNavio();
    }
}
