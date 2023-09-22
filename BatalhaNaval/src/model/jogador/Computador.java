/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.jogador;

import model.Tabuleiro;

/**
 *
 * @author 0068943
 */
public class Computador extends Jogador{

    public Computador() {
        super.parteDestruidas = 0;
        super.tabuleiro = new Tabuleiro();
    }
    
}
