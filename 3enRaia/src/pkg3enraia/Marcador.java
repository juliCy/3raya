/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3enraia;

/**
 *
 * @author dam1a26
 */
public class Marcador {
    
    int victoriasA=0;
    int victoriasB=0;
    
    public Marcador() {
        
    }

    public int getVictoriasA() {
        return victoriasA;
    }

    public int getVictoriasB() {
        return victoriasB;
    }

    public void setVictoriasA(int victoriasA) {
        this.victoriasA = victoriasA;
    }

    public void setVictoriasB(int victoriasB) {
        this.victoriasB = victoriasB;
    }
    
    private void mostrar(){ //Muestra el marcador actual por consola.
        
    }
    
    private void incrementarA(){ //Incrementa el marcador cada vez que termina una partida.
        victoriasA++;
    }
    private void incrementarB(){ //Incrementa el marcador cada vez que termina una partida.
        victoriasB++;
    }
   
    private void ganar(){ //Verifica si hay 3 fichas del mismo tipo en linea.
        
    }
    
    private void empatar(){ //Veriica si se completa el tablero y nadie ha ganado.
       
    }
}
