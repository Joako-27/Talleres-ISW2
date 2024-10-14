;c1_0 and c2_0 and c1_1 and not c2_1 and c1_2 and not c2_2 and c1_3
;unsat
(declare-const k Int)
(assert (< 0 3))
(assert (= (+ 5 k) 0))
(assert (< 1 3))
(assert (not (= (+ 1 k) 0)))
(assert (< 2 3))
(assert (not (= (+ 3 k) 0)))
(assert (< 3 3))
(check-sat)
(get-model)
