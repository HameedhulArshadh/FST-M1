import pytest


@pytest.mark.great
def test_greater():
    assert 5 > 2

@pytest.mark.activity
def test_greater_equal():
    assert 8 >= 8

@pytest.mark.activity
def test_lesser():
    assert 2 < 5 