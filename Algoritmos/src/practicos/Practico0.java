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
    public Retorno ejercicio2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno ejercicio3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Retorno ejercicio4() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
