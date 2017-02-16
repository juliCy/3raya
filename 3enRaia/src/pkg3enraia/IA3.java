/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3enraia;

/**
 *
 * @author Juli
 */
public class IA3 extends IA2 {

    public IA3(String tipoFicha, String nombre) {
        super(tipoFicha, nombre);
    }

    public IA3() {
    }
    
    @Override
    public Posicion movimiento(){
        //super.movimiento();
        
        if (tablero.consultar(new Posicion(0, 0)).equals("|X|") && tablero.consultar(new Posicion(0, 1)).equals("|X|") && tablero.consultar(new Posicion(0, 2)).equals("|-|")) {
            System.out.println("IA Fila --> " + 0);
            System.out.println("IA Columna --> " + 2);
            System.out.println("-----------");
            return new Posicion(0, 2);
        }
        if (tablero.consultar(new Posicion(0, 0)).equals("|X|") && tablero.consultar(new Posicion(0, 2)).equals("|X|") && tablero.consultar(new Posicion(0, 1)).equals("|-|")) {
            System.out.println("IA Fila --> " + 0);
            System.out.println("IA Columna --> " + 1);
            System.out.println("-----------");
            return new Posicion(0, 1);
        }
        if (tablero.consultar(new Posicion(0, 1)).equals("|X|") && tablero.consultar(new Posicion(0, 2)).equals("|X|") && tablero.consultar(new Posicion(0, 0)).equals("|-|")) {
            System.out.println("IA Fila --> " + 0);
            System.out.println("IA Columna --> " + 0);
            System.out.println("-----------");
            return new Posicion(0, 0);
        }
        //--------------fila 1
        if (tablero.consultar(new Posicion(1, 0)).equals("|X|") && tablero.consultar(new Posicion(1, 1)).equals("|X|") && tablero.consultar(new Posicion(1, 2)).equals("|-|")) {
            System.out.println("IA Fila --> " + 1);
            System.out.println("IA Columna --> " + 2);
            System.out.println("-----------");
            return new Posicion(1, 2);
        }
        if (tablero.consultar(new Posicion(1, 0)).equals("|X|") && tablero.consultar(new Posicion(1, 2)).equals("|X|") && tablero.consultar(new Posicion(1, 1)).equals("|-|")) {
            System.out.println("IA Fila --> " + 1);
            System.out.println("IA Columna --> " + 1);
            System.out.println("-----------");
            return new Posicion(1, 1);
        }
        if (tablero.consultar(new Posicion(1, 1)).equals("|X|") && tablero.consultar(new Posicion(1, 2)).equals("|X|") && tablero.consultar(new Posicion(1, 0)).equals("|-|")) {
            System.out.println("IA Fila --> " + 1);
            System.out.println("IA Columna --> " + 0);
            System.out.println("-----------");
            return new Posicion(1, 0);
        }
        //--------------fila 2
        if (tablero.consultar(new Posicion(2, 0)).equals("|X|") && tablero.consultar(new Posicion(2, 1)).equals("|X|") && tablero.consultar(new Posicion(2, 2)).equals("|-|")) {
            System.out.println("IA Fila --> " + 2);
            System.out.println("IA Columna --> " + 2);
            System.out.println("-----------");
            return new Posicion(2, 2);
        }
        if (tablero.consultar(new Posicion(2, 0)).equals("|X|") && tablero.consultar(new Posicion(2, 2)).equals("|X|") && tablero.consultar(new Posicion(2, 1)).equals("|-|")) {
            System.out.println("IA Fila --> " + 2);
            System.out.println("IA Columna --> " + 1);
            System.out.println("-----------");
            return new Posicion(2, 1);
        }
        if (tablero.consultar(new Posicion(2, 1)).equals("|X|") && tablero.consultar(new Posicion(2, 2)).equals("|X|") && tablero.consultar(new Posicion(2, 0)).equals("|-|")) {
            System.out.println("IA Fila --> " + 2);
            System.out.println("IA Columna --> " + 0);
            System.out.println("-----------");
            return new Posicion(2, 0);
        }
        //--------------columna
        if (tablero.consultar(new Posicion(0, 0)).equals("|X|") && tablero.consultar(new Posicion(2, 0)).equals("|X|") && tablero.consultar(new Posicion(1, 0)).equals("|-|")) {
            System.out.println("IA Fila --> " + 1);
            System.out.println("IA Columna --> " + 0);
            System.out.println("-----------");
            return new Posicion(1, 0);
        }
        if (tablero.consultar(new Posicion(0, 0)).equals("|X|") && tablero.consultar(new Posicion(1, 0)).equals("|X|") && tablero.consultar(new Posicion(2, 0)).equals("|-|")) {
            System.out.println("IA Fila --> " + 2);
            System.out.println("IA Columna --> " + 0);
            System.out.println("-----------");
            return new Posicion(2, 0);
        }
        if (tablero.consultar(new Posicion(2, 0)).equals("|X|") && tablero.consultar(new Posicion(1, 0)).equals("|X|") && tablero.consultar(new Posicion(0, 0)).equals("|-|")) {
            System.out.println("IA Fila --> " + 0);
            System.out.println("IA Columna --> " + 0);
            System.out.println("-----------");
            return new Posicion(0, 0);
        }
        //--------------columna 1
        if (tablero.consultar(new Posicion(0, 1)).equals("|X|") && tablero.consultar(new Posicion(2, 1)).equals("|X|") && tablero.consultar(new Posicion(1, 1)).equals("|-|")) {
            System.out.println("IA Fila --> " + 1);
            System.out.println("IA Columna --> " + 1);
            System.out.println("-----------");
            return new Posicion(1, 1);
        }
        if (tablero.consultar(new Posicion(0, 1)).equals("|X|") && tablero.consultar(new Posicion(1, 1)).equals("|X|") && tablero.consultar(new Posicion(2, 1)).equals("|-|")) {
            System.out.println("IA Fila --> " + 2);
            System.out.println("IA Columna --> " + 1);
            System.out.println("-----------");
            return new Posicion(2, 1);
        }
        if (tablero.consultar(new Posicion(1, 1)).equals("|X|") && tablero.consultar(new Posicion(2, 1)).equals("|X|") && tablero.consultar(new Posicion(0, 1)).equals("|-|")) {
            System.out.println("IA Fila --> " + 0);
            System.out.println("IA Columna --> " + 1);
            System.out.println("-----------");
            return new Posicion(0, 1);
        }
        //--------------columna 2
        if (tablero.consultar(new Posicion(0, 2)).equals("|X|") && tablero.consultar(new Posicion(2, 2)).equals("|X|") && tablero.consultar(new Posicion(1, 2)).equals("|-|")) {
            System.out.println("IA Fila --> " + 1);
            System.out.println("IA Columna --> " + 2);
            System.out.println("-----------");
            return new Posicion(1, 2);
        }
        if (tablero.consultar(new Posicion(0, 2)).equals("|X|") && tablero.consultar(new Posicion(1, 2)).equals("|X|") && tablero.consultar(new Posicion(2, 2)).equals("|-|")) {
            System.out.println("IA Fila --> " + 2);
            System.out.println("IA Columna --> " + 2);
            System.out.println("-----------");
            return new Posicion(2, 2);
        }
        if (tablero.consultar(new Posicion(1, 2)).equals("|X|") && tablero.consultar(new Posicion(2, 2)).equals("|X|") && tablero.consultar(new Posicion(0, 2)).equals("|-|")) {
            System.out.println("IA Fila --> " + 0);
            System.out.println("IA Columna --> " + 2);
            System.out.println("-----------");
            return new Posicion(0, 2);
        }
        //--------------diagonal 1
        if (tablero.consultar(new Posicion(0, 0)).equals("|X|") && tablero.consultar(new Posicion(1, 1)).equals("|X|") && tablero.consultar(new Posicion(2, 2)).equals("|-|")) {
            System.out.println("IA Fila --> " + 2);
            System.out.println("IA Columna --> " + 2);
            System.out.println("-----------");
            return new Posicion(2, 2);
        }
        if (tablero.consultar(new Posicion(1, 1)).equals("|X|") && tablero.consultar(new Posicion(2, 2)).equals("|X|") && tablero.consultar(new Posicion(0, 0)).equals("|-|")) {
            System.out.println("IA Fila --> " + 0);
            System.out.println("IA Columna --> " + 0);
            System.out.println("-----------");
            return new Posicion(0, 0);
        }
        if (tablero.consultar(new Posicion(0, 0)).equals("|X|") && tablero.consultar(new Posicion(2, 2)).equals("|X|") && tablero.consultar(new Posicion(1, 1)).equals("|-|")) {
            System.out.println("IA Fila --> " + 1);
            System.out.println("IA Columna --> " + 1);
            System.out.println("-----------");
            return new Posicion(1, 1);
        }
        //--------------diagonal 2
        if (tablero.consultar(new Posicion(0, 2)).equals("|X|") && tablero.consultar(new Posicion(1, 1)).equals("|X|") && tablero.consultar(new Posicion(2, 0)).equals("|-|")) {
            System.out.println("IA Fila --> " + 2);
            System.out.println("IA Columna --> " + 0);
            System.out.println("-----------");
            return new Posicion(2, 0);
        }
        if (tablero.consultar(new Posicion(1, 1)).equals("|X|") && tablero.consultar(new Posicion(2, 0)).equals("|X|") && tablero.consultar(new Posicion(0, 2)).equals("|-|")) {
            System.out.println("IA Fila --> " + 0);
            System.out.println("IA Columna --> " + 2);
            System.out.println("-----------");
            return new Posicion(0, 2);
        }
        if (tablero.consultar(new Posicion(0, 2)).equals("|X|") && tablero.consultar(new Posicion(2, 0)).equals("|X|") && tablero.consultar(new Posicion(1, 1)).equals("|-|")) {
            System.out.println("IA Fila --> " + 1);
            System.out.println("IA Columna --> " + 1);
            System.out.println("-----------");
            return new Posicion(1, 1);
        } 
        return super.movimiento();
    }
}
