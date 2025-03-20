class JaccardSimilarity:
    @staticmethod
    def calculate(set1, set2):
        """
        Calculate Jaccard similarity between two sets.
        
        Args:
            set1: First set of elements
            set2: Second set of elements
            
        Returns:
            float: Jaccard similarity coefficient
        """
        if not set1 and not set2:
            return 1.0
            
        intersection = len(set1.intersection(set2))
        union = len(set1.union(set2))
        
        return intersection / union
