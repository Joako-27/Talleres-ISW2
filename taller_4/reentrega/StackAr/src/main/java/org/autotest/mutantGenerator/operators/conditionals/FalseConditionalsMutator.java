package org.autotest.mutantGenerator.operators.conditionals;

import org.autotest.mutantGenerator.operators.MutationOperator;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#REMOVE_CONDITIONALS
 *
 * Este operador reemplaza los valores en las condiciones de guardas por false.
 */
public class FalseConditionalsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        // llamo al método super para verificar que el candidato no es parte de randoop.CheckRep: repOK method
        if (!super.isToBeProcessed(candidate)) {
            return false;
        }
        if (candidate instanceof CtIf){
            CtIf op = (CtIf) candidate;
            return !Objects.equals(op.getCondition().toString(), "false");
        }
        return false;

    }

    @Override
    public void process(CtElement candidate) {
        CtIf op = (CtIf) candidate;
        op.setCondition(op.getFactory().Code().createLiteral(false));
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtIf op = (CtIf)candidate;
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                op.getCondition().toString() + " por false"+
                " en la línea " + op.getPosition().getLine() + ".";
    }
}
