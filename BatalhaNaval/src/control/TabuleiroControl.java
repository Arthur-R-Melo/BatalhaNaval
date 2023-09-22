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

    /*
        A String posicao deve ser formatada como letra(a, b, c, d, e)+ numero (from 1 to 10) como em: a1, b5, e10.
     */
    public boolean posicionaNavio(Navio navio, String posicao, int direcao) {
        try {
            int parOrdenado[] = convertePosicao(posicao);
            switch (direcao) {
                case Tabuleiro.HORIZONTAL -> {
                    
                }
                case Tabuleiro.VERTICAL -> {
                    
                }
                default -> {
                    return false;
                }
            }
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
    
    /*
        Retorna verdadeiro caso atinja um navio, falso caso erre e nulo caso ocorra um erro
     */
    public boolean recebeTiro(int parOrdenado[]) {//true = acertou navio | false = não acertou um navio

        if (this.tabuleiro.getCoord(parOrdenado) == Tabuleiro.NAVIO) {
            this.tabuleiro.setCoord(Tabuleiro.NAVIO_ACERTADO, parOrdenado);
            return true;
        } else {
            this.tabuleiro.setCoord(Tabuleiro.TIRO_AGUA, parOrdenado);
            return false;
        }
    }
    
    public static int[] convertePosicao(String posicao) throws NumberFormatException {
        int vet[] = new int[2];
        char y = posicao.charAt(0);
        vet[1] = (int) y - (int) 'a';
        /*
                Para converter do caractere para uma posição de 0 a 4 é feito o parse do primeiro caractere da String e subtraido o valor do parse
                do caractere 2
         */
        vet[0] = Integer.parseInt(posicao.substring(1)) - 1;
        return vet;
    }

    
}
