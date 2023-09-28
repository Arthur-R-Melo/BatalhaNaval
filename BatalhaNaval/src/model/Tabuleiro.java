/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author arthur
 */
public class Tabuleiro {

    public static final int EM_BRANCO = 1, NAVIO = 2, TIRO_AGUA = 3, NAVIO_ACERTADO = 4;
    private int tab[][];

    public Tabuleiro() {
        this.tab = new int[10][5];
        for (int i = 0; i < this.tab.length; i++) {
            for (int j = 0; j < this.tab[i].length; j++) {
                this.tab[i][j] = EM_BRANCO;
            }
        }
    }
    /*
        A String posicao deve ser formatada como letra(a, b, c, d, e)+ numero (from 1 to 10) como em: a1, b5, e10.
     */
    public void posicionaNavio(Navio navio, int parOrdenado[], boolean direcao) {
        //TODO
    }
    
    /*
        Retorna verdadeiro caso atinja um navio, falso caso erre e nulo caso ocorra um erro
     */
    public boolean recebeTiro(int parOrdenado[]) {//true = acertou navio | false = não acertou um navio

        if (this.getCoord(parOrdenado) == Tabuleiro.NAVIO) {
            this.tab[parOrdenado[0]][parOrdenado[1]] = NAVIO_ACERTADO;
            return true;
        } else {
            this.tab[parOrdenado[0]][parOrdenado[1]] = TIRO_AGUA;
            return false;
        }
    }
    
    
    public int[][] getTab() {
        return tab;
    }
    
    public int getCoord(int parOrdenado[]) {
        return this.tab[parOrdenado[0]][parOrdenado[1]];
    }

}
