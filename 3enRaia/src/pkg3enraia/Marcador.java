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
    
    private int victoriasA;
    private int victoriasB;
    private int empate;
    
    public Marcador() {
        victoriasA=0;
        victoriasB=0;
        empate=0;
    }

    public int getVictoriasA() {
        return victoriasA;
    }

    public int getVictoriasB() {
        return victoriasB;
    }
    
    public void mostrar(Jugador j){ //Muestra el marcador actual por consola.
        System.out.println("Victorias "+j.getNombre()+": "+victoriasA);
        System.out.println("Victorias IA: "+victoriasB);
        System.out.println("Empates: "+empate);
    }
    
    public void incrementarA(){ //Incrementa el marcador cada vez que termina una partida.
        victoriasA++;
    }
    
    public void incrementarB(){ //Incrementa el marcador cada vez que termina una partida.
        victoriasB++;
    }
    
    public void empatar(){ //Veriica si se completa el tablero y nadie ha ganado. Incrementa el marcador de empates
        empate++;
    }
}
