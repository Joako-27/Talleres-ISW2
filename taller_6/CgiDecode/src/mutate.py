from random import choice
from typing import List

from src.create_population import create_test_case, get_random_character


def add_character(test_case: str) -> str:
    # TODO: COMPLETAR
    place_to_add = choice(range(len(test_case)))
    character_to_add = get_random_character()
    test_case = test_case[:place_to_add] + character_to_add + test_case[place_to_add:]
    return test_case


def remove_character(test_case: str) -> str:
    # TODO: COMPLETAR
    place_to_skip = choice(range(len(test_case)-1))
    test_case = test_case[:place_to_skip] + test_case[place_to_skip+1:]
    return test_case


def modify_character(test_case: str) -> str:
    # TODO: COMPLETAR
    place_to_add = choice(range(len(test_case)))
    character_to_add = get_random_character()
    test_case = test_case[:place_to_add] + character_to_add + test_case[place_to_add+1:]
    return test_case


def add_test_case(individual: List[str]) -> List[str]:
    # TODO: COMPLETAR
    return individual


def remove_test_case(individual: List[str]) -> List[str]:
    # TODO: COMPLETAR
    return individual


def modify_test_case(individual: List[str]) -> List[str]:
    # TODO: COMPLETAR
    return individual


def mutate(individual: List[str]) -> List[str]:
    # TODO: COMPLETAR
    return individual

