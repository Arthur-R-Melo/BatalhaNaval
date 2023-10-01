package control;

import model.Navio;
import model.Partida;
import model.Tabuleiro;
import model.jogador.Computador;
import model.jogador.Jogador;
import view.Janela;

/**
 *
 * @author Arthur
 */
public class PartidaControl {

    private Janela origem;

    public PartidaControl(Janela origem) {
        this.origem = origem;
    }

    public boolean posicionaNavio(Navio navio) {
        try {
            Partida partida = this.origem.getPartida();
            int[] parOrdenado;
            boolean direcao;//verdadeiro para horizontal e falso para vertical
            TabuleiroControl tabCtrl;
            JogadorControl jogCtrl = new JogadorControl(origem);
            for (Jogador jog : partida.getJogadores()) {
                tabCtrl = new TabuleiroControl(jog.getTabuleiro());
                direcao = jog.getDirecaoNavio(jogCtrl);
                parOrdenado = jog.getParNavio(jogCtrl);
                if(jog instanceof Computador) {
                    while (!tabCtrl.validaPosicionamento(navio, parOrdenado, direcao)) {                        
                        parOrdenado = jog.getParNavio(jogCtrl);
                    }
                }
                if (!tabCtrl.validaPosicionamento(navio, parOrdenado, direcao)) {
                    return false;
                } else {
                    jog.getTabuleiro().posicionaNavio(navio, parOrdenado, direcao);
                }
            }
            return true;
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            return false;
        }
    }

    public boolean realizaJogada() {
        Partida partida = this.origem.getPartida();
        int j;
        for (int i = 0; i < partida.getJogadores().length; i++) {
            j=i == 0 ? 1 : 0;//Tem como função pegar o indice do outro jogador
            partida.realizaRodada(new JogadorControl(origem), i, j);
            if(partida.validaVitoria(partida.getJogadores()[j])) {
                return true;
            }
        }
        return false;
    }

    public Tabuleiro getTabuleiro(int indice) {
        Partida partida = this.origem.getPartida();
        return partida.getJogadores()[indice].getTabuleiro();
    }

    public int getValorCoord(int indiceJog, int[] parOrdenado) {
        Partida partida = this.origem.getPartida();
        return partida.getJogadores()[indiceJog].getTabuleiro().getCoord(parOrdenado);
    }
    
    
    /*
    Retorna verdadeiro caso o jogador viorioso seja o usuário e falso caso seja a IA
    */
    public boolean getJogVitorioso()  {
        Partida partida = this.origem.getPartida();
        return !(partida.getJogVitorioso() instanceof Computador);
    }
    
    public int getPartesDestruidas(int i) {
        Partida partida = this.origem.getPartida();
        int temp = i == 1? 0:1;
        return partida.getJogadores()[temp].getParteDestruidas();
    }
}
