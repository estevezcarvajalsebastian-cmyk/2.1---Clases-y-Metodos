/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miProyectoTv;

/**
 *
 * @author Sebastian Estevez
 */
public class Tv {

    String marca;
    int pulgadas;
    boolean encendido;
    int volumen;

    void encender() {
        System.out.println("La TV se está encendiendo...");
        encendido = true;
    }

    void apagar() {
        System.out.println("La TV se está apagando...");
        encendido = false;
    }

    void subirVolumen() {
        System.out.println("Subiendo el volumen...");
        volumen++;
    }

    void bajarVolumen() {
        System.out.println("Bajando el volumen...");
        volumen--;
    }
}