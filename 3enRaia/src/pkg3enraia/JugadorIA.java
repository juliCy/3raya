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
public class JugadorIA extends Jugador {
    
    private int inteligencia, tablero;

    public JugadorIA(int inteligencia, int tipoFicha, int posicion, int tablero) {
        super(tipoFicha, posicion,tablero);
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

    private void movimiento (){ ////Jugador dice donde quiere mover
       
    }
    
}
