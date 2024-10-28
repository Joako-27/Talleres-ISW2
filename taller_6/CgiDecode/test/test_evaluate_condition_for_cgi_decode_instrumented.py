#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode
from src.cgi_decode_instrumented import cgi_decode_instrumented
from src.evaluate_condition import clear_maps, get_true_distance, get_false_distance,distances_false,distances_true


class TestEvaluateConditionForCgiDecodeInstrumented(unittest.TestCase):
    def test_1(self):
        clear_maps()
        res = cgi_decode_instrumented("test+uno")
        self.assertEqual(res, "test uno")
        self.assertEqual(distances_true, {1: 0, 2: 0, 3: 64})
        self.assertEqual(distances_false, {1: 0, 2: 0, 3: 0})