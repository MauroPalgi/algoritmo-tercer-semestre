/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.lang.reflect.Method;
import practicos.*;
import java.lang.reflect.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import auxiliares.helpers.Helper;

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
        // EjecutarPractico0();
        Helper auxiliar = new Helper();
        auxiliar.EjecutarTodosLosTest();
        // EjecutarPractico1();
    }

    public static void EjecutarPractico0() {
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
        // System.out.println(practico.ejercicio4(20, -2).getValorString());
    }

    public static void EjecutarPractico1() {
        Practico1 practico = new Practico1();

        try {
            Method testMethod = Practico1.class.getMethod("ejercicio1", int.class);
            testMethod.invoke(new Practico1(), 1);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(Algoritmos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*
    
    import java.lang.reflect.*;

public class ReflectionExample {
    public int test(int i) {
        return i + 1;
    }
    public static void main(String args[]) throws Exception {
        Method testMethod = ReflectionExample.class.getMethod("test", int.class);
        int result = (Integer) testMethod.invoke(new ReflectionExample(), 100);
        System.out.println(result); // 101
    }
}
     */
}
