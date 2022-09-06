package practicos;

import algoritmos.Retorno;
import algoritmos.Retorno;

public interface IPractico0 {

    /* Implemente un método que imprima en consola 
    la suma de todos los impares entre 1 y 50. */
    public Retorno ejercicio1();

    /* Implemente un método que dado dos números enteros calcula el
     promedio, la cantidad de números pares y retorne la suma del
     valor absoluto de los números. El método debe imprimir por consola
     los datos calculados. Pruebelo con 3 conjuntos de datos.*/
    public Retorno ejercicio2(int a, int b);

    /* Implemente un método que reciba un int e imprima los dígitos de
     forma separada. Asuma que el número ingresado es positivo
    Pruebelo con los siguientes valores: 5, 1523, 20, 100000. */
    public Retorno ejercicio3();

    /* Implemente un método que reciba dos int e imprima el mayor de
     ellos y la suma de todos los números desde el principio hasta ese
     máximo inclusive*/
    public Retorno ejercicio4(int a, int b);

    /* Cree la clase Triángulo. Debe incluir los siguientes métodos que devuelven un valor booleano:
    a. public boolean esEscaleno ()
    b. public boolean esIsósceles  ()
    c. public boolean esEquilátero  ()
    d. public boolean tieneAnguloRecto ()
    Agregar el código necesario para probarla. */
    public Retorno ejercicio5();
    
    /* Un club tiene socios
    a. Cree la clase Socio con los siguiente atributos:
     nombre y número; y variable de Clase: PróximoNúmero.
    b. Agregue los métodos de acceso y modificación 
    c. Inicialice en 1 el próximo número. 
    d. Cree dos socios  y mostrar sus datos*/
    public Retorno ejercicio6();
    
    /*Cree la clase Funcionario con atributos nombre y sueldo. 
    Incluir métodos de acceso y modificación. 
    Agregar dos métodos de clase para prueba:
    ejemplo1: crea un funcionario con datos a ingresar por el operador y lo muestra 
    ejemplo2: crea dos funcionarios  usando el ejemplo1  e indica además cuál gana más.*/
    public Retorno ejercicio7();
}
