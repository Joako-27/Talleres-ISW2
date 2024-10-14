;c1_0 and not c2_0 and not c1_1
;unsat
(declare-const k Int)
(assert (< 0 3))
(assert (not (= (+ 5 k) 0)))
(assert (not (< 1 3)))
(check-sat)
(get-model)