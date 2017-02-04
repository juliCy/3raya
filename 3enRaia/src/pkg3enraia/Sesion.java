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

    private Marcador marcador;

    private Partida partida;

    private Jugador jugador;

    private JugadorIA jugadorIA;

    public Sesion() {
        marcador = new Marcador();
        jugador = new Jugador("X", pedirNombre());
        jugadorIA = new JugadorIA("O", "IA");
        
        int salir = 0;
        do {
            partida = new Partida(marcador, jugador, jugadorIA);
            partida.iniciar();
            System.out.println("Pulsa 1 para salir o cualquier numero para volver a jugar: ");
            Scanner sc = new Scanner(System.in);
            salir= sc.nextInt();
        } while (salir != 1);

    }

    private String pedirNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del jugador: ");
        return sc.nextLine(); //lee string
    }

}
