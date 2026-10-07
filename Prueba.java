/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miProyectoTv;

/**
 *
 * @author Sebastian Estevez
 */
public class Prueba {

    public static void main(String[] args) {

        // Crear las 3 TV
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        Tv tv3 = new Tv();

        // ===== TV 1 =====
        tv1.marca = "Samsung";
        tv1.pulgadas = 55;
        tv1.encendido = false;
        tv1.volumen = 20;

        System.out.println("\n--- TV 1 ---");
        tv1.encender();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.apagar();


        // ===== TV 2 =====
        tv2.marca = "LG";
        tv2.pulgadas = 65;
        tv2.encendido = false;
        tv2.volumen = 15;

        System.out.println("\n--- TV 2 ---");
        tv2.encender();
        tv2.subirVolumen();
        tv2.bajarVolumen();
        tv2.apagar();


        // ===== TV 3 =====
        tv3.marca = "Sony";
        tv3.pulgadas = 50;
        tv3.encendido = false;
        tv3.volumen = 25;

        System.out.println("\n--- TV 3 ---");
        tv3.encender();
        tv3.subirVolumen();
        tv3.bajarVolumen();
        tv3.apagar();
    }
}