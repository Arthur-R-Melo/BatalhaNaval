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
    public void posicionaNavio(Navio navio, int parOrdenado[], boolean direcaoH) {
        if(direcaoH) {
            for (int i = parOrdenado[0]; i < navio.getTam() + parOrdenado[0]; i++) {
                this.tab[i][parOrdenado[1]] = NAVIO;
            }
        }else {
            for (int i = parOrdenado[1]; i < navio.getTam() + parOrdenado[1]; i++) {
                this.tab[parOrdenado[0]][i] = NAVIO;
            }
        }
    }
    
    /*
        Retorna verdadeiro caso atinja um navio, falso caso erre
     */
    public boolean recebeTiro(int parOrdenado[]) {

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
