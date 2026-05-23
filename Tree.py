class Node:
    data = None
    left = None
    right = None
    def __init__(self, data):
        self.data = data
class Tree:
    root = None
    def __init__(self, data):
        self.root = Node(data)