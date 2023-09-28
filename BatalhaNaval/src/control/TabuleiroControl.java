/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.Navio;
import model.Tabuleiro;

/**
 *
 * @author 0068943
 */
public class TabuleiroControl {

    private Tabuleiro tabuleiro;

    public TabuleiroControl(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    public boolean validaPosicionamento(Navio navio, int parOrdenado[], boolean direcao) {
        //TODO
        return true;
    }
    public static int[] convertePosicao(String posicao) throws NumberFormatException {
        int vet[] = new int[2];
        char y = posicao.toLowerCase().charAt(0);
        vet[1] = (int) y - (int) 'a';
        if(vet[1] > 0 || vet[1] > 4) {
            throw new NumberFormatException();
        }
        /*
                Para converter do caractere para uma posição de 0 a 4 é feito o parse do primeiro caractere da String e subtraido o valor do parse
                do caractere 2
         */
        vet[0] = Integer.parseInt(posicao.substring(1)) - 1;
        if(vet[0] > 0 || vet[0] > 9) {
            throw new NumberFormatException();
        }
        return vet;
    }

    
}
