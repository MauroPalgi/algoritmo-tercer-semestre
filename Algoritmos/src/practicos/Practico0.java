/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicos;

import algoritmos.Retorno;

/**
 *
 * @author maurp
 */
public class Practico0 implements IPractico0 {

    @Override
    public Retorno ejercicio1() {
        Retorno retorno = new Retorno(Retorno.Resultado.OK);
        retorno.setValorString("1,");
        for (int i = 3; i < 51; i++) {
            if (i % 3 == 0) {
                retorno.setValorString(retorno.getValorString() + i + ',');
            }
        }
        return retorno;
    }

    @Override
    public Retorno ejercicio2(int a, int b) {
        Retorno retorno = new Retorno(Retorno.Resultado.OK);
        int promedio = 0;
        int cantPares = 0;
        int sumaAbs = 0;
        if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }

        promedio = (b + a) / 2;
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                cantPares++;
            }
        }

        if (a < 0) {
            a = a * -1;
        }

        if (a < 0) {
            b = b * -1;
        }

        sumaAbs = a + b;
        retorno.setValorString("Valor de a: " + a + "\nValor de b: " + b + "\nPromedio: " + promedio + "\nCamtidad de Pares: " + cantPares + "\nSuma de ABS: " + sumaAbs);
        return retorno;
    }

    @Override
    public Retorno ejercicio3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno ejercicio4(int a, int b) {
        Retorno retorno = new Retorno(Retorno.Resultado.OK);
         if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }
        retorno.setValorString("Mayor: " + b + "Valores entre: ");
         
         for (int i = a; i <= b; i++) {
            retorno.setValorString(retorno.getValorString() + i + ",");
        }
        return retorno;
    }

    @Override
    public Retorno ejercicio5() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno ejercicio6() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno ejercicio7() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
