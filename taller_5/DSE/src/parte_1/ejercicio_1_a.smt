; Ejercicio 1 a) ¬(x ∨ y) ≡ (¬x ∧ ¬y)
; COMPLETAR

(declare-const x Bool)
(declare-const y Bool)
(assert ( = (not(or x y)) (or (not x) (not y))))
(check-sat)
(get-model)
