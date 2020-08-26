class MinStack:
    stack: [int]

    def __init__(self):
        self.stack = []

    def push(self, x: int) -> None:
        self.stack.insert(0, x)

    def pop(self) -> None:
        self.stack.pop(0)

    def top(self) -> int:
        return self.stack[0]

    def getMin(self) -> int:
        min_num = self.stack[0]
        for x in self.stack:
            min_num = min(min_num, x)
        return min_num

# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()