/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.jogador.Jogador;
import model.jogador.Computador;

/**
 *
 * @author 0068943
 */
public class Partida {
    private Jogador jogadores[];

    public Partida() {
        this.jogadores = new Jogador[2];
        this.jogadores[0] = new Jogador();
        this.jogadores[1] = new Computador();
    }
    
}
