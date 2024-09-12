package inge2.dataflow;

public class StackAr {

    /**
     * Capacidad por defecto de la pila.
     */
    //@ spec_public
    private final static int DEFAULT_CAPACITY = 10;

    /**
     * Arreglo que contiene los elementos de la pila.
     */
    //@ spec_public
    private final int[] elems;

    /**
     * Indice del tope de la pila.
     */
    //@ spec_public
    private int top = -1;

    // TODO: ESPECIFICAR
    //@ ensures this.elems.length == DEFAULT_CAPACITY;
    //@ pure
    public StackAr() {
        this(DEFAULT_CAPACITY);
    }

    // TODO: ESPECIFICAR
    //@ requires capacity > 0;
    //@ ensures this.elems.length == capacity;
    //@ pure
    public StackAr(int capacity) {
        // TODO: IMPLEMENTAR
        this.elems = new int[capacity];
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    // TODO: ESPECIFICAR
    //@ ensures \result == true <==> this.top == -1;
    //@ pure
    public boolean isEmpty() {
        // TODO: IMPLEMENTAR
        return this.top == -1;
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    // TODO: ESPECIFICAR
    //@ ensures \result == true <==> this.top == this.elems.length -1;
    //@ pure
    public boolean isFull() {
        // TODO: IMPLEMENTAR
        return this.top == this.elems.length - 1;
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    // TODO: ESPECIFICAR
    //@ ensures \result == this.top + 1;
    //@ pure
    public int size() {
        // TODO: IMPLEMENTAR
        //@ assume this.top < Integer.MAX_VALUE;
        return this.top + 1;
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    // TODO: ESPECIFICAR
    //@ requires !this.isFull();
    //@ ensures this.top == \old(this.top)+1;
    //@ ensures this.elems[this.top] == o;
    //@ ensures \forall int i; 0 <= i < this.top; this.elems[i] == \old(this.elems[i]);
    public void push(int o) {
        // TODO: IMPLEMENTAR
        //@ assume this.top < Integer.MAX_VALUE;
        this.top++;
        //@ assume 0 <= this.top < this.elems.length;
        this.elems[this.top] = o;
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    // TODO: ESPECIFICAR
    //@ requires !this.isEmpty();
    //@ ensures this.top == \old(this.top) - 1;
    //@ ensures \forall int i; 0 <= i <= this.top; this.elems[i] == \old(this.elems[i]);
    //@ ensures \result == \old(this.elems[this.top]);
    public int pop() {
        // TODO: IMPLEMENTAR
        //@ assume 0 <= this.top < this.elems.length;
        int valor = this.elems[this.top];
        this.top--; //no hace falta borrar el valor ya que no hay manera de acceder a él. En el proximo push se sobreescribe
        return valor;
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    // TODO: ESPECIFICAR
    //@ requires !this.isEmpty();
    //@ ensures this.top == \old(this.top);
    //@ ensures \forall int i; 0 <= i <= this.top; this.elems[i] == \old(this.elems[i]);
    //@ ensures \result == this.elems[this.top];
    public int peek() {
        // TODO: IMPLEMENTAR
        //@ assume 0 <= this.top < this.elems.length;
        return this.elems[this.top];
        //throw new UnsupportedOperationException("Not implemented yet");
    }
}

