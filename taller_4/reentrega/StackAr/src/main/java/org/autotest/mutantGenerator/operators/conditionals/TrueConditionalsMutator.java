package org.autotest.mutantGenerator.operators.conditionals;

import org.autotest.mutantGenerator.operators.MutationOperator;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtIf;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#REMOVE_CONDITIONALS
 *
 * Este operador reemplaza los valores en las condiciones de guardas por true.
 */
public class TrueConditionalsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        // llamo al método super para verificar que el candidato no es parte de randoop.CheckRep: repOK method
        if (!super.isToBeProcessed(candidate)) {
            return false;
        }
        //return candidate instanceof CtIf;
        if (candidate instanceof CtIf){
            CtIf op = (CtIf) candidate;
            return !Objects.equals(op.getCondition().toString(), "true");
        }
        return false;
    }

    @Override
    public void process(CtElement candidate) {
        CtIf op = (CtIf) candidate;
        op.setCondition(op.getFactory().Code().createLiteral(true));
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtIf op = (CtIf)candidate;
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                op.getCondition().toString() + " por true"+
                " en la línea " + op.getPosition().getLine() + ".";
    }
}
