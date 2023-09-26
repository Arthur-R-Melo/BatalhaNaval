/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 0068943
 */
public enum Navio {
    CRUZADOR(2), FRAGATA(3), PORTA_AVIOES(4);
    
    private int tam;

    private Navio(int tam) {
        this.tam = tam;
    }

    public int getTam() {
        return tam;
    }
    
    
    
}
