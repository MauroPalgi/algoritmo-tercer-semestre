/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliares.helpers;

import algoritmos.Algoritmos;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maurp
 */
public class Helper {

    public void EjecutarTodosLosTest() {
        try {
            Class<?> c = Class.forName("practicos.Practico1");
            Method method;
            method = c.getDeclaredMethod("ejercicio1", int.class);
            method.invoke(c.getDeclaredConstructor().newInstance(), 1);
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | ClassNotFoundException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
