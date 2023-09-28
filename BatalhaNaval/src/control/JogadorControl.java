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
    
    public int[] getParInicial() {
        //TODO 
        //Deve chamar um método da janela para ter acesso ao par ordenado do posicionamento inicial, entretando o método não foi implementado
        //Tem que converter de String para vetor de inteiros
        return null;
    }
    
    public boolean getDirecaoNavio() {
        //TODO 
        //Deve chamar um método da janela para ter acesso a  direção do navio, entretando o método não foi implementado
        return false;
    }
}
