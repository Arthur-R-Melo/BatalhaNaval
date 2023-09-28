/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.jogador;

import control.JogadorControl;
import model.Tabuleiro;

/**
 *
 * @author 0068943
 */
public class Jogador {
    protected int parteDestruidas;
    protected Tabuleiro tabuleiro;
    
    public Jogador() {
        this.parteDestruidas = 0;
        this.tabuleiro = new Tabuleiro();
    }
    
    public boolean getDirecaoNavio(JogadorControl controle) {
        return controle.getDirecaoNavio();
    }
    
    public int[] getParNavio(JogadorControl controle) {
        return controle.getParInicial();
    }
    
    public int[] realizaAtaque(JogadorControl controle) {
        return controle.getAtk();
    }
    
    public void destroiParte() {
        this.parteDestruidas++;
    }

    public int getParteDestruidas() {
        return parteDestruidas;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}
