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
    
    private int humano, maquina;

    public Marcador(int humano, int maquina) {
        this.humano = humano;
        this.maquina = maquina;
    }

    public Marcador() {
    }

    public int getHumano() {
        return humano;
    }

    public int getMaquina() {
        return maquina;
    }

    public void setHumano(int humano) {
        this.humano = humano;
    }

    public void setMaquina(int maquina) {
        this.maquina = maquina;
    }
    
    private void mostrar(int humano, int maquina){ //Muestra el marcador actual por consola.
        
    }
    
    private int incrementar(){ //Incrementa el marcador cada vez que termina una partida.
        return -1;
    }
    
    private void ganar(){ //Verifica si hay 3 fichas del mismo tipo en linea.
        
    }
    
    private void empatar(){ //Veriica si se completa el tablero y nadie ha ganado.
       
    }
}
