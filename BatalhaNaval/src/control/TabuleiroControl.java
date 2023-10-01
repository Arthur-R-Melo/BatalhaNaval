package control;

import model.Navio;
import model.Tabuleiro;

/**
 *
 * @author Arthur
 */
public class TabuleiroControl {

    private Tabuleiro tabuleiro;

    public TabuleiroControl(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    public boolean validaPosicionamento(Navio navio, int parOrdenado[], boolean direcao) {
        if(direcao) {
            //Verifica se a posição final não estará fora da matriz
            if(parOrdenado[0] + navio.getTam() > this.tabuleiro.getTab().length) {
                return false;
            }
            //Verifica se não há outro navio impedindo o posicionamento
            for (int i = parOrdenado[0]; i < navio.getTam() + parOrdenado[0]; i++) {
                if(this.tabuleiro.getTab()[i][parOrdenado[1]] != Tabuleiro.EM_BRANCO) {
                    return false;
                }
            }
        }else {
            //Verifica se a posição final não estará fora da matriz
            if(parOrdenado[1] + navio.getTam() > this.tabuleiro.getTab()[0].length) {
                return false;
            }
            //Verifica se não há outro navio impedindo o posicionamento
            for (int i = parOrdenado[1]; i < navio.getTam() + parOrdenado[1]; i++) {
                if(this.tabuleiro.getTab()[parOrdenado[0]][i] != Tabuleiro.EM_BRANCO) {
                    return false;
                }
            }
        }
        return true;
    }
    
    /*
    Realiza  a converção de uma String devidamente formatada para um par ordenado que possa ser
    utilizada para achar uma posição de uma matriz
    */
    public static int[] convertePosicao(String posicao) throws NumberFormatException, StringIndexOutOfBoundsException{
        int vet[] = new int[2];
        char y = posicao.toLowerCase().charAt(0);
        vet[1] = (int) y - (int) 'a';
        if(vet[1] < 0 || vet[1] > 4) {//Verifica se não está fora dos limites da matriz
            throw new NumberFormatException();
        }
        /*
                Para converter do caractere para uma posição de 0 a 4 é feito o parse do primeiro caractere da String e subtraido o valor do parse
                do caractere 2
         */
        vet[0] = Integer.parseInt(posicao.substring(1)) - 1;
        if(vet[0] < 0 || vet[0] > 9) {//Verifica se não está fora dos limites da matriz
            throw new NumberFormatException();
        }
        return vet;
    }

    
}
