;c1_0 and c2_0
;sat = -5
(declare-const k Int)
(assert (< 0 3))
(assert (= (+ 5 k) 0))
(check-sat)
(get-model)