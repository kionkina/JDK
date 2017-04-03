# DLLDeque
---
## Team JDK: Judy Liu, David Frid, Karina Ionkina

### Method Selections
1. addFirst 
  * Adds the element to the front of the deque
2. removeFirst
  * Removes the element at the front of the deque and returns the removed element
3. peekFirst
  * Returns the element at the front of the deque
4. addEnd
  * Adds the element to the end of the deque
5. removeEnd
  * Removes the element at the end of the deque and returns the removed element
6. peekEnd
  * Returns the element at the end of the deque
7. isEmpty
  * Returns true if the first element is null
### Rationale for Doubly-linked Node-based Architecture
Our team choose doubly-linked Node-based architecture for Deque because Deque is a double ended queue. The instance variables nextNode and prevNode and their methods from the doubly-linked nodes would be useful in adding, removing, and peeking from the front or end of the queue.
