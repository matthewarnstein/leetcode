class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        max = 0;
        for sentence in sentences:
            words = sentence.split(' ')
            if len(words) > max:
                max = len(words)
            
        return max
        
