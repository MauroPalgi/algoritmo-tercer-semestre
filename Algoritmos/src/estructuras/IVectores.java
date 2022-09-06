package estructuras;

import algoritmos.Retorno;


public interface IVectores {

    public Retorno mostrarv(int[] v);

    public Retorno maxvec(int[] v);

    public Retorno maxvecV2(int[] v);

    public Retorno minvec(int[] v);

    public Retorno minvecV2(int[] v);

    //pre:desde>0, hasta>0, desde<=hasta, desde<largo de v, hasta < largo de v
    //post:retorna el valor máximo del vector entre desde y hasta (inclusive)
    public Retorno maxvec(int[] v, int desde, int hasta);

    public Retorno maxvecV2(int[] v, int desde, int hasta);

    public Retorno minvec(int[] v, int desde, int hasta);

    public Retorno minvecV2(int[] v, int desde, int hasta);

    //pre:desde>0, hasta>0, desde<=hasta, desde<largo de v, hasta < largo de v
    //post:retorna pos. del máximo valor del vector entre desde y hasta (inclusive)
    public Retorno posmaxvec(int[] v, int desde, int hasta);

    public Retorno posminvec(int[] v, int desde, int hasta);

    public Retorno buscarvec(int[] v, int elemento);

    public Retorno buscarporpuntomedio(int[] v, int elemento);

    public Retorno buscarenpos(int[] v, int desde, int hasta, int elemento);

    public Retorno buscarenposV2(int[] v, int desde, int hasta, int elemento);

    public Retorno poselemento(int[] v, int elemento);

    public Retorno poselemento(int[] v, int desde, int hasta, int elemento);

    public Retorno ordenarvec1(int[] v);

    public Retorno ordenarvec2(int[] v);

    public Retorno ordenarvec3(int[] v);

    public Retorno promedio(int[] v);

    public Retorno unirvectoresordenados(int[] v1, int[] v2);

    public Retorno muestroposimpares(int v[]);

    public Retorno muestropospares(int v[]);

    public Retorno muestrocontenidosimpares(int v[]);

}
