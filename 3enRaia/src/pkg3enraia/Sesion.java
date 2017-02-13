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

    static Scanner sc = new Scanner(System.in);  
    int salir; 
    
    public Sesion() {
        System.out.println("|| ES UN 3 EN RAYA CONTRA LA IA ||");
        System.out.println("-----------");
        marcador = new Marcador();
        jugador = new Jugador("|X|", pedirNombre()); // se pasan los parametros que hay en el constructor de jugador
        System.out.println("-----------");
        System.out.println("****Empiezas primero****");
        System.out.println("-----------");
        System.out.println("****Tus fichas son las X****");
        System.out.println("-----------");
        System.out.println("****Las filas y columnas van desde la (0,0) hasta la (2,2)****");
        System.out.println("-----------");
        jugadorIA = new IA2("|O|", "IA"); // se pasan los parametros que hay en el constructor de jugador, nombre IA siempre igual       
        
        do {  
            partida = new Partida(marcador, jugador, jugadorIA);
            partida.iniciar();					             
            System.out.println("Pulsa 0 para SALIR o cualquier otro número para volver a jugar: ");
            salir= sc.nextInt();           
        } while (salir != 0);//bucle para poder reiniciar la partida o salir de ella al terminar de jugar.           
    }

    private String pedirNombre() { //pide el nombre del jugador normal
        System.out.println("Introduce el nombre del jugador: ");
        return sc.nextLine(); //lee string
    }       
}
    /*
    private Marcador marcador; //se crean los objetos marcador, partida, jugador y jugadorIA.

    private Partida partida;

    private Jugador jugador;

    private JugadorIA jugadorIA;
    
    static Scanner sc = new Scanner(System.in); //Sirve para recoger texto por consola
    static int select = -1; //opción elegida del usuario
    int salir;  

    public Sesion() {
        marcador = new Marcador();
        jugador = new Jugador("|"+"X"+"|", pedirNombre()); // se pasan los parametros que hay en el constructor de jugador
        System.out.println("-----------");
        System.out.println("****Las filas y columnas van desde la (0,0) hasta la (2,2)****");
        jugadorIA = new JugadorIA("|"+"O"+"|", "IA"); // se pasan los parametros que hay en el constructor de jugador, nombre IA siempre igual
        
        
        do {  
            menu();
            select = sc.nextInt();
            switch(select){
		case 1: 
                    partida = new Partida(marcador, jugador, jugadorIA);
                    partida.iniciar();					
                    break;
		case 0: 
                    while(salir != 0){	
                    salir= sc.nextInt();
                    }
                    break;
                default:
                    System.out.println("Mira bien lo que escribes");
                    break;
            }                    
            System.out.println("Pulsa 0 para SALIR o cualquier otro número para volver a jugar: ");
            salir= sc.nextInt();
            if(salir != 0){
                partida = new Partida(marcador, jugador, jugadorIA);
                partida.iniciar();
            }
        } while (salir != 0);//bucle para poder reiniciar la partida o salir de ella al terminar de jugar.           
    }

    private String pedirNombre() { //pide el nombre del jugador normal
        System.out.println("Introduce el nombre del jugador: ");
        return sc.nextLine(); //lee string
    }
    
    private static void menu() {
        System.out.println("Introduce la opción deseada");
        System.out.println("1. Jugar");
        System.out.println("0. Salir");
    }
    */