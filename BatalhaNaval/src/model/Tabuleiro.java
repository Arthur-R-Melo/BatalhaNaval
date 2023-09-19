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
        A String posicao deve ser formatada como letra(a, b, c, d, e)+ numero (from 1 to 10) como em: a1, b5, e10.
    */
    public boolean posicionaNavio(Navio navio, String posicao, int direcao) {
        //TODO
        return true;
    }
    /*
        Retorna verdadeiro caso atinja um navio e falso caso erre
    */
    public boolean recebeTiro(String posicao) {//true = acertou navio | false = não acertou um navio
        int[] parOrdenado = convertePosicao(posicao);
        if(this.tab[parOrdenado[0]][parOrdenado[1]] == NAVIO) {
            this.tab[parOrdenado[0]][parOrdenado[1]] = NAVIO_ACERTADO;
            return true;
        }else {
            this.tab[parOrdenado[0]][parOrdenado[1]] = TIRO_AGUA;
            return false;
        }
    }
    private int[] convertePosicao(String posicao) {
        try{
            int vet[] = new int[2];
            char y = posicao.charAt(0);
            vet[0] = (int)y - (int)'a';
            /*
                Para converter do caractere para uma posição de 0 a 4 é feito o parse do primeiro caractere da String e subtraido o valor do parse
                do caractere 2
            */
            vet[1] = Integer.parseInt(posicao.substring(1)) - 1;
            return vet;
        }catch(NumberFormatException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    public int[][] getTab() {
        return tab;
    }
    
}
