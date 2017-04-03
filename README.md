# DLLDeque
---
## Team JDK: Judy Liu, David Frid, Karina Ionkina
### Rationale for method selections:
The doubly-linked queue should have "enqueue", "dequeue" and "peek" capabilities on either end.


### Methods
1. public void addFront(T x) 
  * Adds the element to the front of the deque
2. public T removeFront()
  * Removes the element at the front of the deque and returns the removed element
3. public T peekFront()
  * Returns the element at the front of the deque
4. public void addEnd(T x)
  * Adds the element to the end of the deque
5. public T removeEnd()
  * Removes the element at the end of the deque and returns the removed element
6. public T peekEnd()
  * Returns the element at the end of the deque
7. public boolean isEmpty()
  * Returns true if the first element is null
### Rationale for Doubly-linked Node-based Architecture
Our team choose doubly-linked Node-based architecture for Deque because Deque is a double ended queue. The instance variables nextNode and prevNode and their methods from the doubly-linked nodes would be useful in adding, removing, and peeking from the front or end of the queue.
