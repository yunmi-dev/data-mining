import pytest
from src.similarity.jaccard_similarity import JaccardSimilarity

class TestJaccardSimilarity:
    def test_identical_sets(self):
        set1 = {1, 2, 3, 4, 5}
        set2 = {1, 2, 3, 4, 5}
        assert JaccardSimilarity.calculate(set1, set2) == 1.0
        
    def test_disjoint_sets(self):
        set1 = {1, 2, 3}
        set2 = {4, 5, 6}
        assert JaccardSimilarity.calculate(set1, set2) == 0.0
        
    def test_partial_overlap(self):
        set1 = {1, 2, 3, 4}
        set2 = {3, 4, 5, 6}
        expected = 2 / 6  # intersection / union
        assert abs(JaccardSimilarity.calculate(set1, set2) - expected) < 1e-10
