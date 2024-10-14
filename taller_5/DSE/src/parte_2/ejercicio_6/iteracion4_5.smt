;not c1_0
;unsat
(declare-const k Int)
(assert (not (< 0 3)))
(check-sat)
(get-model)