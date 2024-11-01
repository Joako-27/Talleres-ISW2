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
    place_to_add = choice(range(len(test_case)-1))
    character_to_add = get_random_character()
    test_case = test_case[:place_to_add] + character_to_add + test_case[place_to_add+1:]
    return test_case


def add_test_case(individual: List[str]) -> List[str]:
    # TODO: COMPLETAR
    individual.append(create_test_case)
    return individual


def remove_test_case(individual: List[str]) -> List[str]:
    # TODO: COMPLETAR
    individual.pop()
    return individual


def modify_test_case(individual: List[str]) -> List[str]:
    # TODO: COMPLETAR
    test_case_to_modify = choice(individual)
    modification_choice = choice(range(3))
    match modification_choice:
            case 0:
                if len(test_case_to_modify) < 15:
                    add_character(individual)
            case 1:
                if len(test_case_to_modify) > 1:
                    remove_character(individual)
            case 2:
                if len(test_case_to_modify) > 0:
                    modify_character(individual)
    return individual


def mutate(individual: List[str]) -> List[str]:
    # TODO: COMPLETAR
    mutation_choice = choice(range(3))
    match mutation_choice:
        case 0:
            if len(individual) < 15:
                add_test_case(individual)
        case 1:
            if len(individual) > 1:
                remove_test_case(individual)
        case 2:
            if len(individual) > 0:
                modify_test_case(individual)

    return individual

