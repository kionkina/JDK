# DLLDeque
---
## Team JDK: Judy Liu, David Frid, Karina Ionkina
### Rationale for method selections:
The doubly-linked queue should have "enqueue", "dequeue" and "peek" capabilities on either end. The methods we chose allow for adding and removing elements in both directions.


### Methods
1. public void addFirst(T x) 
  * Adds the element to the front of the deque
2. public T removeFirst()
  * Removes the element at the front of the deque and returns the removed element and throws error if empty
3. public T peekFirst()
  * Returns the element at the front of the deque
4. public void addEnd(T x)
  * Adds the element to the end of the deque
5. public T removeEnd()
  * Removes the element at the end of the deque and returns the removed element
6. public T peekEnd()
  * Returns the element at the end of the deque
7. public boolean isEmpty()
  * Returns true if the first element is null
 8. public int size()
  * Returns number of elements present 
### Rationale for Doubly-linked Node-based Architecture
Our team choose doubly-linked Node-based architecture for Deque because Deque is a double ended queue. The instance variables nextNode and prevNode and their methods from the doubly-linked nodes would be useful in adding, removing, and peeking from the front or end of the queue.
