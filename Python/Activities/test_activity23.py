import pytest


def test_sum_list(setup):
    sum = 0
    for i in setup:
        sum += i
    
    assert 55 == sum