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
    
    public boolean posicionaNavio() {
        //TODO
        return true;
    }
    
    public int[] getParInicial() {
        //TODO 
        //Deve chamar um método da janela para ter acesso ao par ordenado do posicionamento inicial, entretando o método não foi implementado
        return null;
    }
    
    public int getDirecao() {
        //TODO 
        //Deve chamar um método da janela para ter acesso a direção do posicionamento inicial, entretando o método não foi implementado
        return 0;
    }
}
