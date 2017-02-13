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
public class Sesion {

    private Marcador marcador; //se crean los objetos marcador, partida, jugador y jugadorIA.
    private Partida partida;
    private Jugador jugador;
    private JugadorIA jugadorIA; 
    
    public Sesion() {
        iniciarSesion();
        iniciarMenu();         
    }

    private String pedirNombre() { //pide el nombre del jugador normal
        Scanner sc = new Scanner(System.in);  
        System.out.println("Introduce el nombre del jugador: ");
        return sc.nextLine(); //lee string
    }
    
    private void iniciarSesion(){
        System.out.println("|| ES UN 3 EN RAYA CONTRA LA IA ||");
        System.out.println("-----------");
        marcador = new Marcador();
        jugador = new Jugador("|X|", pedirNombre()); // se pasan los parametros que hay en el constructor de jugador
        System.out.println("-----------");    
    }
    
    private void iniciarMenu() {
        Scanner sc = new Scanner(System.in);       
        boolean salir=true;   
        int select;
        
        menu();
        select = sc.nextInt();
        switch(select){
            case 1:
                System.out.println("-----------");
                System.out.println("****Empiezas primero****");
                System.out.println("-----------");
                System.out.println("****Tus fichas son las X****");
                System.out.println("-----------");
                System.out.println("****Las filas y columnas van desde la (0,0) hasta la (2,2)****");
                System.out.println("-----------");
                jugadorIA = new JugadorIA("|O|", "IA"); // se pasan los parametros que hay en el constructor de jugador, nombre IA siempre igual
                partida = new Partida(marcador, jugador, jugadorIA);
                partida.iniciar();
                iniciarMenu();               
                break;
            case 2:
                System.out.println("-----------");
                System.out.println("****Empiezas primero****");
                System.out.println("-----------");
                System.out.println("****Tus fichas son las X****");
                System.out.println("-----------");
                System.out.println("****Las filas y columnas van desde la (0,0) hasta la (2,2)****");
                System.out.println("-----------");
                jugadorIA = new IA1("|O|", "IA"); // se pasan los parametros que hay en el constructor de jugador, nombre IA siempre igual
                partida = new Partida(marcador, jugador, jugadorIA);
                partida.iniciar();
                iniciarMenu();               
                break;
            case 3:
                System.out.println("-----------");
                System.out.println("****Empiezas primero****");
                System.out.println("-----------");
                System.out.println("****Tus fichas son las X****");
                System.out.println("-----------");
                System.out.println("****Las filas y columnas van desde la (0,0) hasta la (2,2)****");
                System.out.println("-----------");
                jugadorIA = new IA2("|O|", "IA"); // se pasan los parametros que hay en el constructor de jugador, nombre IA siempre igual
                partida = new Partida(marcador, jugador, jugadorIA);
                partida.iniciar();
                iniciarMenu();               
                break;
            case 4:                 	
                salir= false;          
                break;
            default:
                System.out.println("-----------");
                System.out.println("Mira bien lo que escribes");
                System.out.println("-----------");
                iniciarMenu();
                break;
        }                    
    }
    
     private static void menu() {
        System.out.println("Introduce la opción deseada");
        System.out.println("-----------");
        System.out.println("1. Nivel ultrafácil");
        System.out.println("2. Nivel menos fácil");
        System.out.println("3. Nivel menos facil que el anterior");
        System.out.println("4. Salir");
    }
}