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
        this.tab = new int[10][5];
        for (int i = 0; i < this.tab.length; i++) {
            for (int j = 0; j < this.tab[i].length; j++) {
                this.tab[i][j] = EM_BRANCO;
            }
        }
    }

    
    
    public int[][] getTab() {
        return tab;
    }
    
    public int getCoord(int parOrdenado[]) {
        return this.tab[parOrdenado[0]][parOrdenado[1]];
    }
    
    public void setCoord(int value, int parOrdenado[]) {
        this.tab[parOrdenado[0]][parOrdenado[1]] = value;
    }

}
