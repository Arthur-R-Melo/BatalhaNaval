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
    public static final int HORIZONTAL = 1, VERTICAL = 2;
    private int tab[][];

    public Tabuleiro() {
        this.tab = new int[5][10];
        for (int i = 0; i < this.tab.length; i++) {
            for (int j = 0; j < this.tab[i].length; j++) {
                this.tab[i][j] = EM_BRANCO;
            }
        }
    }
    /*
        The String posicao must be formated as letter(a, b, c, d, e)+number(from 1 to 10) as in a1, b5, e10.
    */
    public boolean posicionaNavio(Navio navio, String posicao, int direcao) {
        //TODO
        return true;
    }
    /*
        Retorna verdadeiro caso atinja um navio e falso caso erre
    */
    public boolean recebeTiro(String posicao) {
        //TODO
        return false;
    }
    public int[][] getTab() {
        return tab;
    }
    
}
