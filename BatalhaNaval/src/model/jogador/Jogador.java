package model.jogador;

import control.JogadorControl;
import model.Tabuleiro;

/**
 *
 * @author Arthur
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
    
    public int[] getParNavio(JogadorControl controle) throws NumberFormatException{
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
