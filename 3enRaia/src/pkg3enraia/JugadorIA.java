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

    //private Tablero tablero;
    //private Posicion p;
    
    public JugadorIA(String tipoFicha, String nombre) {      
        super(tipoFicha, nombre);
        //this.tablero = new Tablero();
    }

    public JugadorIA() {
    }
    /*
    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }*/
    
    @Override
    public Posicion movimiento() { //IA mueve random sobre todo el tablero
        
        int fila, columna;
        fila = (int) (Math.random() * 3);
        columna = (int) (Math.random() * 3);
        System.out.println("IA Fila --> " + fila);
        System.out.println("IA Columna --> " + columna);
        System.out.println("-----------");
        return new Posicion(fila, columna);
        /*
        p = new Posicion();
        tablero = new Tablero();
        
        for (int i = 0; i < 3; i++){
            p.setFila(i);
            for (int j = 0; j < 3; j++){
                p.setColumna(j);
                if(tablero.consultar(p).equals("-")){
                    return p;
                    
                }
            }
        }
        return null; */
    }
}
