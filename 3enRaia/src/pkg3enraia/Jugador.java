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
public class Jugador {
    
private int tipoFicha,posicion,tablero;
private String nombre;

    public Jugador(int tipoFicha, int posicion, int tablero) {
        this.tipoFicha = tipoFicha;
        this.posicion = posicion;
        this.tablero = tablero;
    }

    public Jugador() {
    }

    public int getTipoFicha() {
        return tipoFicha;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getTablero() {
        return tablero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipoFicha(int tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public void setTablero(int tablero) {
        this.tablero = tablero;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion movimiento(){ //Jugador dice donde quiere mover
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
