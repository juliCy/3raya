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
    
       
private Tablero tablero; 
private Marcador marcador;
private int turnoActual;
private Jugador [] jugadores;

    public Partida(Marcador marcador, Jugador jugadorJ, JugadorIA jugadorIA) {
        this.tablero = new Tablero();
        
        this.marcador = marcador;
        this.jugadores = new Jugador [2]; 
        this.jugadores[1] =  jugadorJ;      
        this.jugadores[0] =  jugadorIA;       
        
        this.turnoActual = 1;
       
    }

    public Partida() {
      
    }

    public int getTurnoActual() {
        return turnoActual;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public Marcador getMarcador() {
        return marcador;
    }

    public void incrementarTurno() {
        this.turnoActual++;
    }

    public void iniciar(){ //Metodo que inicia la partida.
        jugar();
    }
    
    private void salir(){ //Método para salir de la partida.
        tablero.mostrar();
        marcador.mostrar();
    }
    
    public boolean comprobarGanador(Jugador jugadorJ){ //Comprueba que jugador ha ganado; mirando las diagonales, verticales y horizontales. Despues de cada movimiento.       
        
        if (validar(new Posicion(0,0), new Posicion(0,1), new Posicion(0,2), jugadorJ.getTipoFicha())){
            return true;
        }
        if (validar(new Posicion(1,0), new Posicion(1,1), new Posicion(1,2), jugadorJ.getTipoFicha())){
            return true;
        }
        if (validar(new Posicion(2,0), new Posicion(2,1), new Posicion(2,2), jugadorJ.getTipoFicha())){
            return true;
        }
        if (validar(new Posicion(0,0), new Posicion(1,0), new Posicion(2,0), jugadorJ.getTipoFicha())){
            return true;
        }
        if (validar(new Posicion(0,1), new Posicion(1,1), new Posicion(2,1), jugadorJ.getTipoFicha())){
            return true;
        }
        if (validar(new Posicion(0,2), new Posicion(1,2), new Posicion(2,2), jugadorJ.getTipoFicha())){
            return true;
        }
        if (validar(new Posicion(0,0), new Posicion(1,1), new Posicion(2,2), jugadorJ.getTipoFicha())){
            return true;
        }
        if (validar(new Posicion(0,2), new Posicion(1,1), new Posicion(2,0), jugadorJ.getTipoFicha())){
            return true;
        }
        return false;
    }
    private boolean validar(Posicion pos1, Posicion pos2, Posicion pos3, String tipoFicha){
        if(tablero.consultar(pos1).equals(tipoFicha) && tablero.consultar(pos2).equals(tipoFicha) && tablero.consultar(pos3).equals(tipoFicha)){
            return true;
        }
        return false;
    }
    private void jugar(){ //Bucle que continua hasta que la partida finaliza. Cuando el tablero está completo o alguien ha ganado.
        Posicion p;
        
        boolean partidaFinalizada=false;
        
        while (!partidaFinalizada){
            System.out.println("Turno actual: "+turnoActual);
            tablero.mostrar();
            p=this.jugadores[turnoActual%2].movimiento();
            if(tablero.validarMovimiento(p)){
                this.tablero.ponerFicha(p,this.jugadores[turnoActual%2].getTipoFicha());              
                if(comprobarGanador(this.jugadores[turnoActual%2])){
                   if(turnoActual%2==1){
                       marcador.incrementarA();
                   }else{                      
                       marcador.incrementarB();
                   }
                   
                   partidaFinalizada=true;
               }
                incrementarTurno();              
            }else{
                if(turnoActual%2==1){
                    marcador.incrementarB();
                }else{
                    marcador.incrementarA();
                }
                System.out.println("Movimiento no valido, ¡HAS PERDIDO!");
               
                partidaFinalizada=true;            
            }
            if(tablero.completo()){
                partidaFinalizada=true;
                System.out.println("¡EMPATE!");
                marcador.empatar();
            }
        }
        salir();
    }
}