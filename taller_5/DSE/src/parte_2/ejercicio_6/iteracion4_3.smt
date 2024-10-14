;c1_0 and c2_0 and c1_1 and c2_1
;unsat
(declare-const k Int)
(assert (< 0 3))
(assert (= (+ 5 k) 0))
(assert (< 1 3))
(assert (= (+ 1 k) 0))
(check-sat)
(get-model)