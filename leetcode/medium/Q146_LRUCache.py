class LRUCache:
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.dic = {}
        self.recent = []
    def get(self, key: int) -> int:
        if key in self.recent:
            self.recent.remove(key)
            self.recent.append(key)
            return self.dic[key]
        return -1
    def put(self, key: int, value: int) -> None:
        if len(self.recent) == self.capacity:
            if key not in self.recent:
                self.recent.pop(0)
        if key in self.recent:
            self.recent.remove(key)
        self.recent.append(key)
        self.dic[key] = value
