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
    private String tablero;

    public JugadorIA(int inteligencia, int tipoFicha, int posicion, String tablero) {
        this.inteligencia = inteligencia;
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
    public Posicion movimiento (){ ////Jugador dice donde quiere mover
        int fila, columna;
        
        Posicion p = new Posicion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Fila -->");
        fila = sc.nextInt();
        System.out.println("Columna -->");
        columna = sc.nextInt();
        p.setFila(fila);
        p.setColumna(columna);
        return p;      
    }
    
}
