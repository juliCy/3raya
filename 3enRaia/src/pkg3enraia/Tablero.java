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
public class Tablero {
    
private String casillas[][] = new String[3][3];
private String posicion, tipoFicha;

    public Tablero(String posicion, String tipoFicha) {
        this.posicion = posicion;
        this.tipoFicha = tipoFicha;
    }

    public Tablero() {
        int fila, columna;
        
        for(fila=0; fila<3; fila++){
            for(columna=0; columna<3; columna++)
                this.casillas[fila][columna]="-";
        }
    }
    public String[][] getCasillas() {
        return casillas;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getTipoFicha() {
        return tipoFicha;
    }

    public void setCasillas(String[][] casillas) {
        this.casillas = casillas;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setTipoFicha(String tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public void ponerFicha(Posicion p, String f){ //Indicar el lugar donde se colocará la ficha.
        this.casillas[p.getFila()][p.getColumna()]=f;
    }
    
    public boolean validarMovimiento(Posicion p){ //Metodo que valida si el sitio del tablero está vacía.     
        return this.casillas[p.getFila()][p.getColumna()].equals("-");
    }
    
    public void mostrar(){ //Mostrar el tablero por consola.
        int fila, columna;
        
        for(fila=0; fila<3; fila++){
            for(columna=0; columna<3; columna++)
                System.out.println(this.casillas[fila][columna]+" ");
            System.out.println();
        }
    }
    
    public String consultar(Posicion p){ //Devuelve la ficha que hay en una posicion
        return this.casillas[p.getFila()][p.getColumna()];
    }
    
    public boolean completo(){ //Verifica si el tablero está completo.
        int contVacias, fila, columna;
        contVacias =0;
        
        for(fila=0; fila<3; fila++)
            for(columna=0; columna<3; columna++)
                if(this.casillas[fila][columna].equals("-"))
                    contVacias++;
        return (contVacias==0);
    }
}