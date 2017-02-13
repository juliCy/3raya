/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3enraia;

/**
 *
 * @author dam1a30
 */
public class IA2 extends IA1 {
    
    public IA2(String tipoFicha, String nombre) {      
        super(tipoFicha, nombre);
    }

    public IA2() {
    }
    
    @Override
    public Posicion movimiento() {
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){              
                if(tablero.consultar(new Posicion(0,0)).equals("|O|") && tablero.consultar(new Posicion(0,1)).equals("|O|")){
                    System.out.println("IA Fila --> " + 0);
                    System.out.println("IA Columna --> " + 2);
                    System.out.println("-----------");
                    return new Posicion (0,2);
                }
                if(tablero.consultar(new Posicion(0,0)).equals("|O|") && tablero.consultar(new Posicion(0,2)).equals("|O|")){
                    System.out.println("IA Fila --> " + 0);
                    System.out.println("IA Columna --> " + 1);
                    System.out.println("-----------");
                    return new Posicion (0,1);
                }
                if(tablero.consultar(new Posicion(0,1)).equals("|O|") && tablero.consultar(new Posicion(0,2)).equals("|O|")){
                    System.out.println("IA Fila --> " + 0);
                    System.out.println("IA Columna --> " + 0);
                    System.out.println("-----------");
                    return new Posicion (0,0);
                }
                //--------------
                if(tablero.consultar(new Posicion(1,0)).equals("|O|") && tablero.consultar(new Posicion(1,1)).equals("|O|")){
                    System.out.println("IA Fila --> " + 1);
                    System.out.println("IA Columna --> " + 2);
                    System.out.println("-----------");
                    return new Posicion (1,2);
                }
                if(tablero.consultar(new Posicion(1,0)).equals("|O|") && tablero.consultar(new Posicion(1,2)).equals("|O|")){
                    System.out.println("IA Fila --> " + 1);
                    System.out.println("IA Columna --> " + 1);
                    System.out.println("-----------");
                    return new Posicion (1,1);
                }
                if(tablero.consultar(new Posicion(1,1)).equals("|O|") && tablero.consultar(new Posicion(1,2)).equals("|O|")){
                    System.out.println("IA Fila --> " + 1);
                    System.out.println("IA Columna --> " + 0);
                    System.out.println("-----------");
                    return new Posicion (1,0);
                }
                //--------------
                if(tablero.consultar(new Posicion(2,0)).equals("|O|") && tablero.consultar(new Posicion(2,1)).equals("|O|")){
                    System.out.println("IA Fila --> " + 2);
                    System.out.println("IA Columna --> " + 2);
                    System.out.println("-----------");
                    return new Posicion (2,2);
                }
                if(tablero.consultar(new Posicion(2,0)).equals("|O|") && tablero.consultar(new Posicion(2,2)).equals("|O|")){
                    System.out.println("IA Fila --> " + 2);
                    System.out.println("IA Columna --> " + 1);
                    System.out.println("-----------");
                    return new Posicion (2,1);
                }
                if(tablero.consultar(new Posicion(2,1)).equals("|O|") && tablero.consultar(new Posicion(2,2)).equals("|O|")){
                    System.out.println("IA Fila --> " + 2);
                    System.out.println("IA Columna --> " + 0);
                    System.out.println("-----------");
                    return new Posicion (2,0);
                }
                //--------------diagonal 1
                if(tablero.consultar(new Posicion(0,0)).equals("|O|") && tablero.consultar(new Posicion(1,1)).equals("|O|")){
                    System.out.println("IA Fila --> " + 2);
                    System.out.println("IA Columna --> " + 2);
                    System.out.println("-----------");
                    return new Posicion (2,2);
                }
                if(tablero.consultar(new Posicion(1,1)).equals("|O|") && tablero.consultar(new Posicion(2,2)).equals("|O|")){
                    System.out.println("IA Fila --> " + 0);
                    System.out.println("IA Columna --> " + 0);
                    System.out.println("-----------");
                    return new Posicion (0,0);
                }
                if(tablero.consultar(new Posicion(0,0)).equals("|O|") && tablero.consultar(new Posicion(2,2)).equals("|O|")){
                    System.out.println("IA Fila --> " + 1);
                    System.out.println("IA Columna --> " + 1);
                    System.out.println("-----------");
                    return new Posicion (1,1);
                }
                //--------------diagonal 2
                if(tablero.consultar(new Posicion(0,2)).equals("|O|") && tablero.consultar(new Posicion(1,1)).equals("|O|")){
                    System.out.println("IA Fila --> " + 2);
                    System.out.println("IA Columna --> " + 0);
                    System.out.println("-----------");
                    return new Posicion (2,0);
                }
                if(tablero.consultar(new Posicion(1,1)).equals("|O|") && tablero.consultar(new Posicion(2,0)).equals("|O|")){
                    System.out.println("IA Fila --> " + 0);
                    System.out.println("IA Columna --> " + 2);
                    System.out.println("-----------");
                    return new Posicion (0,2);
                }
                if(tablero.consultar(new Posicion(0,2)).equals("|O|") && tablero.consultar(new Posicion(2,0)).equals("|O|")){
                    System.out.println("IA Fila --> " + 1);
                    System.out.println("IA Columna --> " + 1);
                    System.out.println("-----------");
                    return new Posicion (1,1);   
                }
            }
        }
        return super.movimiento();
    }
}
/*
HACER MOVIMIENTO GANADOR SI SE PUEDE
SI NO MOVER A CASILLA SEGUN VALOR ESTRATEGICO
*/