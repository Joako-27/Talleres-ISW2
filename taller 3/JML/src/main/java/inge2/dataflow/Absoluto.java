package inge2.dataflow;

public class Absoluto {

    // Calcula el valor absoluto de un número entero.
    // Si el número es negativo, devuelve el opuesto.
    //
    // TODO: ESPECIFICAR
    //@ requires n != Integer.MIN_VALUE;
    //@ ensures \result == (\old(n) >= 0 ? n : -n);
    public static int valorAbsoluto(int n) {
        if (n < 0) {
            return -n;
        } else {
            return n;
        }
    }
}