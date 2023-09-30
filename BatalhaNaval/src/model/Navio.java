package model;

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
