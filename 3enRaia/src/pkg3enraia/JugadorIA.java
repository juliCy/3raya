/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3enraia;

import java.util.Scanner;

/**
 *
 * @author dam1a26
 */
public class JugadorIA extends Jugador {
    
    private int inteligencia; 
   
    public JugadorIA(String tipoFicha, String nombre) {
        super(tipoFicha, nombre);
    }

    public JugadorIA() {
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public Posicion movimiento (){ //IA mueve random
        int fila, columna;
        fila=(int)(Math.random()*100)%3;
        columna=(int)(Math.random()*100)%3;
        System.out.println("Fila -->"+fila);
        System.out.println("Columna -->"+columna);
        return new Posicion(fila,columna);
    }
    
}
