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
    
       
private String [][] tablero; 
private int turnoActual, marcador;
private Jugador [] jugadores;

    public Partida(Marcador marcador, Jugador jugadorJ, JugadorIA jugadorIA) {
        this.tablero[][] = new Tablero();
        jugadorIA.setTablero(tablero);
        this.marcador = marcador;
        this.jugadores = new Jugador [2]; 
        this.jugadores[0] =  jugadorJ;
        this.jugadores [0].setTipoFicha("X");
        this.jugadores[1] =  jugadorIA;
        this.jugadores [1].setTipoFicha("O");
        
        this.turnoActual = 1;
    }

    public Partida() {
      
    }

    public int getTurnoActual() {
        return turnoActual;
    }

    public String[][] getTablero() {
        return tablero;
    }

    public int getMarcador() {
        return marcador;
    }

    public void setTablero(String[][] tablero) {
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
    
    private boolean comprobarGanador(Jugador jugadorJ, JugadorIA jugadorIA){ //Comprueba que jugador ha ganado; mirando las diagonales, verticales y horizontales. Despues de cada movimiento.
        Jugador jugador = new Jugador();
        boolean valor = false;
        String ficha1 = " _"+jugador.getTipoFicha().getTipoFicha()+"_ ";
        String ficha3 = ficha1+ficha1+ficha1;
        String fila = tablero[0][0]+tablero[0][1]+tablero[0][2];
        //System.out.println("-->"+ficha3);
        //System.out.println("-->"+ficha1);
        if( ficha3.equals(fila)){
            valor  = true;
        }
        fila = tablero[1][0]+tablero[1][1]+tablero[1][2];
        if( ficha3.equals(fila)){
            valor  = true;
        }
         fila = tablero[2][0]+tablero[2][1]+tablero[2][2];
        if( ficha3.equals(fila)){
            valor  = true;
        }
         String columna = tablero[0][0]+tablero[1][0]+tablero[2][0];
        if( ficha3.equals(columna)){
            valor  = true;
        }
         columna = tablero[0][1]+tablero[1][1]+tablero[2][1];
        if( ficha3.equals(columna)){
            valor  = true;
        }
         columna = tablero[0][2]+tablero[1][2]+tablero[2][2];
        if( ficha3.equals(columna)){
            valor  = true;
        }
        String diagonal = tablero[0][0]+tablero[1][1]+tablero[2][2];
        if( ficha3.equals(diagonal)){
            valor  = true;
        }
         diagonal = tablero[2][0]+tablero[1][1]+tablero[0][2];
        if( ficha3.equals(diagonal)){
            valor  = true;
        }
        return valor;
    }
    
    private void jugar(){ //Bucle que continua hasta que la partida finaliza. Cuando el tablero está completo o alguien ha ganado.
        Posicion p;
        Tablero t = new Tablero();
        Marcador m = new Marcador();
        
        boolean partidaFinalizada=false;
        turnoActual=0;
        
        while (!partidaFinalizada){
            p=this.jugadores[turnoActual].movimiento();
            if(t.validarMovimiento(p)){
                this.tablero.ponerFicha(p,this.jugadores[turnoActual].getTipoFicha);
            }else{
                partidaFinalizada=true;
                m.comprobarGanador(this.jugador[turnoActual+1)%2]);              
            }
            if(!partidaFinalizada){
                
            }
        }
    }
}