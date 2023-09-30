package model.jogador;

import model.Tabuleiro;

/**
 *
 * @author Arthur
 */
public class Computador extends Jogador{

    public Computador() {
        super.parteDestruidas = 0;
        super.tabuleiro = new Tabuleiro();
    }
    
}
