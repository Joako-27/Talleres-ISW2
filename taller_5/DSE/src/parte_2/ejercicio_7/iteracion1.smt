(declare-const n Int)
(assert (< 0 n))
(check-sat)
(get-model)