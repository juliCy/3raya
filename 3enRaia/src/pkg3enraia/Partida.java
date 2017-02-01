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
public class Partida {
    
       
 
private int turnoActual, Tablero, marcador;

    public Partida(int turnoActual,int Tablero,int marcador) {
        this.turnoActual = turnoActual; 
        this.Tablero =  new Tablero;
        this.marcador = marcador;
        this.jugadorIA.set tablero(this.tablero);
        int jugadores [] = {null,null};
        jugadores=[0];
    }

    public Partida() {
      
    }

    public int getTurnoActual() {
        return turnoActual;
    }

    public int getTablero() {
        return;
    }

    public int getMarcador() {
        return marcador;
    }

    public void setTablero(int tablero) {
        this.tablero = tablero;
    }

    public void setMarcador(int marcador) {
        this.marcador = marcador;
    }

    public void setTurnoActual(int turnoActual) {
        this.turnoActual = turnoActual;
    }

    private void iniciar(){ //Metodo que inicia la partida.
        
    }
    
    private void salir(){ //Método para salir de la partida.
        
    }
    
    private void comprobarGanador(){ //Comprueba que jugador ha ganado; mirando las diagonales, verticales y horizontales. Despues de cada movimiento.
        
    }
    
    private void jugar(){ //Bucle que continua hasta que la partida finaliza. Cuando el tablero está completo o alguien ha ganado.
        Posicion p;
        boolean partidaFinalizada=false;
        turnoActual=0;
        
        while (!partidaFinalizada){
            p=this.jugadores[turnoActual].movimiento();
            if(this.Tablero.validarMovimiento(p)){
                this.Tablero.ponerFicha(p,this.jugadores[turnoActual].getTipoFicha);
            }else{
                partidaFinalizada=true;
                this.marcador.comprobarGanador(this.jugadores[turnoActual+1)%2]);              
            }
            if(!partidaFinalizada){
                
            }
        }
    }
}