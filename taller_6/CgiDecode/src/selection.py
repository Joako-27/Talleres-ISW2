from random import sample
from typing import Tuple


def selection(fitness_by_individual: dict, tournament_size: int) -> Tuple[str, float]:
    """
    fitness_by_individual: Diccionario que contiene a los individuos de la población como keys y su fitness como valores.
    tournament_size: Tamaño del torneo (entero positivo).
    """
    winner = None
    # TODO: COMPLETAR
    #  (Tournament selection)
    participantes = fitness_by_individual.keys()
    seleccionados = sample(participantes, tournament_size)
    mayor_fitness = 0
    for individuo in seleccionados:
        if fitness_by_individual[individuo] > mayor_fitness:
            mayor_fitness = fitness_by_individual[individuo]
            winner = individuo

    return winner, fitness_by_individual[winner]
