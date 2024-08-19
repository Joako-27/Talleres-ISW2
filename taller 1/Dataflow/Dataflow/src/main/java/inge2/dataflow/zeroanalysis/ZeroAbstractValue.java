package inge2.dataflow.zeroanalysis;

import java.util.Objects;

/**
 * This enum represents the possible values of the zero analysis for a variable.
 */
public enum ZeroAbstractValue {

    /**
     * We don't have information about the variable.
     */
    BOTTOM("bottom"),

    /**
     * The variable is not zero.
     */
    NOT_ZERO("not-zero"),

    /**
     * The variable is zero.
     */
    ZERO("zero"),

    /**
     * The variable may be (or not) zero.
     */
    MAYBE_ZERO("maybe-zero");

    /**
     * The name of the ZeroAbstractValue.
     */
    private final String name;

    @Override
    public String toString() {
        return this.name;
    }

    ZeroAbstractValue(String name) {
        this.name = name;
    }

    /**
     * Returns the result of the addition between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the addition.
     */
    public ZeroAbstractValue add(ZeroAbstractValue another) {
        // TODO: IMPLEMENTAR
        //Especificado en la tabla de verdad de la parte 1
        if(this == BOTTOM || another == BOTTOM) return BOTTOM; //si cualquiera de los dos es bottom, la suma sera bottom
        if(this == ZERO) return another; //sumar ZERO no cambia el estado del otro sumando
        if(another == ZERO) return this; //analogo al de arriba
        else return MAYBE_ZERO; //si no se cumplio ninguno de los casos anteriores es porque la suma sera MAYBE_ZERO
    }

    /**
     * Returns the result of the division between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the division.
     */
    public ZeroAbstractValue divideBy(ZeroAbstractValue another) {
        // TODO: IMPLEMENTAR
        //Especificado en la tabla de verdad de la parte 1
        if(this == BOTTOM || another == BOTTOM) return BOTTOM; //si cualquiera de los dos es bottom, la division sera bottom
        if(another == ZERO) return BOTTOM; //si divido por ZERO el resultado sera BOTTOM
        if(this == ZERO) return ZERO; //Si el numerador es ZERO no importa el valor de another, sera ZERO el valor final
        else return MAYBE_ZERO; //Si no, sera MAYBE_ZERO
    }

    /**
     * Returns the result of the multiplication between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the multiplication.
     */
    public ZeroAbstractValue multiplyBy(ZeroAbstractValue another) {
        // TODO: IMPLEMENTAR
        if(this == BOTTOM || another == BOTTOM) return BOTTOM;
        if(this == ZERO || another == ZERO) return ZERO;
        if(this == NOT_ZERO && another == NOT_ZERO) return NOT_ZERO;
        else return MAYBE_ZERO;
    }

    /**
     * Returns the result of the subtraction between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the subtraction.
     */
    public ZeroAbstractValue subtract(ZeroAbstractValue another) {
        // TODO: IMPLEMENTAR
        if(this == BOTTOM || another == BOTTOM) return BOTTOM;
        if(this == ZERO) return another;
        if(another == ZERO) return this;
        else return MAYBE_ZERO;
    }

    /**
     * Returns the result of the merge between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the merge.
     */
    public ZeroAbstractValue merge(ZeroAbstractValue another) {
        // TODO: IMPLEMENTAR
        if(this == MAYBE_ZERO || another == MAYBE_ZERO) return MAYBE_ZERO;
        if(this == BOTTOM) return another;
        if(another == BOTTOM) return this;
        if(this == another) return this;
        else return MAYBE_ZERO;
    }

}
