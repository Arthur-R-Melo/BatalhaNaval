package model.jogador;

import control.JogadorControl;
import java.util.Random;
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

    @Override
    public int[] getParNavio(JogadorControl controle) throws NumberFormatException, StringIndexOutOfBoundsException {
        return sorteiaCoord();
    }

    @Override
    public boolean getDirecaoNavio(JogadorControl controle) {
        return sorteiaDirecao();
    }

    @Override
    public int[] realizaAtaque(JogadorControl controle) {
        return sorteiaCoord();
    }
    
    private int[] sorteiaCoord() {
        Random r = new Random();
        int coord[] = new int[2];
        coord[0] = r.nextInt(0, 9);
        coord[1] = r.nextInt(0, 4);
        
        return coord;
    }
    
    private boolean sorteiaDirecao() {
        Random r = new Random();
        return r.nextBoolean();
    }
}
