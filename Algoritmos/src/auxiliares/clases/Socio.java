/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliares.clases;

/**
 *
 * @author maurp
 */
public class Socio {
    private String Nombre;
    private int Numero;
    static int ProximoNumero = 1;

    public Socio(String Nombre) {
        this.Nombre = Nombre;
        this.Numero = Socio.ProximoNumero;
        Socio.ProximoNumero++;
    }
}
