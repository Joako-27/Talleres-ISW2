package inge2.dataflow;

public class MapSumaUno {

    // Suma uno a todos los elementos de un array.
    //
    // TODO: ESPECIFICAR
    //@ requires \forall int i; 0 <= i < arr.length; arr[i] < Integer.MAX_VALUE;
    //@ ensures \forall int i; 0 <= i < arr.length; arr[i] == \old(arr[i]) + 1;

    public static void mapSumaUno(int[] arr) {
        //@ loop_invariant 0 <= i <= arr.length;
        //@ maintaining \forall int k; 0 <= k < i; arr[k] - 1 == \old(arr[k]);
        //@ maintaining \forall int k; i <= k < arr.length; arr[k] == \old(arr[k]);
        //@ decreases arr.length - i;
        //@ loop_writes i, arr[*];
        for (int i = 0; i < arr.length; i++) {
            //@ assume arr[i] < Integer.MAX_VALUE;
            arr[i] = arr[i] + 1;
            //@ show i, arr.length;
        }
        //@ assert \forall int i; 0 <= i < arr.length; arr[i] == \old(arr[i]) + 1;
    }
}