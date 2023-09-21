// list

def numbers = [1, 2, 3, 4, 5]
def fruits = ['apple', 'banana', 'cherry']

//map
def person = [name: 'John', age: 30, city: 'New York']

// sets
def uniqueNumbers = [1, 2, 3, 4, 5] as Set

//Array
def colors = ['red', 'green', 'blue'] as String[]

//linkedlist
class ListNode {
    def value
    ListNode next
}

def node1 = new ListNode(value: 1)
def node2 = new ListNode(value: 2)
node1.next = node2

//Stack and queue
def stack = []
stack.push(1)
stack.push(2)
def topElement = stack.pop()

def queue = []
queue.add(1)
queue.add(2)
def frontElement = queue.remove(0)

// tress
class TreeNode {
    def value
    List<TreeNode> children = []
}

def root = new TreeNode(value: 'A')
def child1 = new TreeNode(value: 'B')
def child2 = new TreeNode(value: 'C')
root.children << child1 << child2
println root


// graphs
class GraphNode {
    def value
    List<GraphNode> neighbors = []
}

def nodeA = new GraphNode(value: 'A')
def nodeB = new GraphNode(value: 'B')
def nodeC = new GraphNode(value: 'C')
nodeA.neighbors << nodeB << nodeC