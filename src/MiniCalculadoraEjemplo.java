/**
 * Clase que engloba una serie de metodos que tienen como objetivos hacer
 * la raiz cuadrada y el valor absoluto respectivamente
 *
 * @author Daniel
 * @version 1.0
 * @since 09-04-2026
 */
public class MiniCalculadoraEjemplo {
    /**
     * Metodo que devuelve la raiz cuadrada de un numero de valor double que se le pase
     * usando la biblioteca Math
     *
     * @author Daniel
     * @version 1.0
     * @param numero
     * @return Raiz cuadrada del parametro pasado de tipo double
     * @since 09-04-2026
     */
    public double raizCuadrada(double numero){
        return Math.sqrt(numero);
    }
    /**
     * Metodo que devuelve el valor absoluto del valor pasado al metodo usando la biblioteca Math
     *
     * @author Daniel
     * @version 1.0
     * @param numero
     * @return Valor absoluto del parametro pasado
     * @since 09-04-2026
     */
    public double absoluto(double numero){
        return Math.abs(numero);
    }
}
