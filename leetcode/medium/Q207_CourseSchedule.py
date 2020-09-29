from typing import List

class Solution:
    maps = []
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        self.maps = []
        for i in range(numCourses):
            self.maps.append([])

        for pre in prerequisites:
            self.maps[pre[1]].append(pre[0])

        for pre in prerequisites:
            if self.maps[pre[1]]:
                visited = [False] * numCourses
                visited[pre[1]] = True
                if not self.find(pre[1], visited):
                    return False
        return True

    def find(self, idx, visited):
        while self.maps[idx]:
            m = self.maps[idx].pop(0)
            if visited[m]:
                return False
            else:
                visited[m] = True
                if not self.find(m, visited):
                    return False
                visited[m] = False
        return True

s = Solution()
s.canFinish(2, [[1,0], [0,1]])