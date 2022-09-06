/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import practicos.*;

/**
 *
 * @author maurp
 */
public class Algoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EjecutarPracitco0();
    }

    public static void EjecutarPracitco0() {
        Practico0 practico = new Practico0();

        // ejercicio 1
        // System.out.println(practico.ejercicio1().getValorString());
        // ejercicio 2
        /*
        System.out.println(practico.ejercicio2(0,8).getValorString());
        System.out.println(practico.ejercicio2(-2,20).getValorString());
        System.out.println(practico.ejercicio2(20,-2).getValorString());
         */
        // ejercicio 3
        System.out.println(practico.ejercicio4(20, -2).getValorString());

    }
}
