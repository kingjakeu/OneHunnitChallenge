class Solution:
    def searchMatrix(self, matrix, target):
        for m in matrix:
            if target in m:
                return True
        return False
