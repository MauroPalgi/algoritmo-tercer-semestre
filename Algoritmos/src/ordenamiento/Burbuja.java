/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;
import auxiliares.helpers.Helper;

/**
 *
 * @author maurp
 */
public class Burbuja {

    public static void Ordenar(int[] v) {
        int largo = v.length;
        Helper.MostrarArreglos(v);

        for (int i = 0; i < largo - 1; i++) {
            boolean cambio = true;
            Helper.MostrarArreglos(v);
            for (int j = 0; j < largo - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    cambio = false;
                }
            }
            if (cambio == true) {
                break;
            }            
        }
        System.out.println("-----------------");
        Helper.MostrarArreglos(v);

    }

   

}
