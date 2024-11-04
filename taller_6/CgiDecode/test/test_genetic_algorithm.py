#!./venv/bin/python
import unittest

from random import seed
from src.genetic_algorithm import GeneticAlgorithm


class TestGeneticAlgorithm(unittest.TestCase):
    def test1(self):
        # TODO COMPLETAR
        seed(1)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertLessEqual(ga.get_generation(), 1000)
        if ga.get_generation() != 1000:
            self.assertEqual(ga.get_fitness_best_individual(), 10)
        print("Test suite:", result)
        print("Branch coverage:", ga.get_fitness_best_individual()*10, "%")

    def test2(self):
        # TODO COMPLETAR
        seed(2)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertLessEqual(ga.get_generation(), 1000)
        if ga.get_generation() != 1000:
            self.assertEqual(ga.get_fitness_best_individual(), 10)
        print("Test suite:", result)
        print("Branch coverage:", ga.get_fitness_best_individual()*10, "%")

    def test3(self):
        # TODO COMPLETAR
        seed(3)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertLessEqual(ga.get_generation(), 1000)
        if ga.get_generation() != 1000:
            self.assertEqual(ga.get_fitness_best_individual(), 10)
        print("Test suite:", result)
        print("Branch coverage:", ga.get_fitness_best_individual()*10, "%")

