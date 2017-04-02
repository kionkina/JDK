public class DLLDeque{

    private DLLNode<T> _front;
    private DLLNode<T> _end;
    private int _size;
    
    public DLLDeque(){
	_size = 0;
	_front = null;
	_end = _front;
    }

//~~~~~~~~~~~~~ methods for Front of Deque ~~~~~~~~~~~~                                         
//adds element to the front                                                                     
    public void addFront(T x){
	if(isEmpty()){
	    _front = new DLLNode<T>(x, null);
	 	}
	else {
	    DLLNode bob = new DLLNode<T>(x, null);
	    bob.setNext(_front);
	    _front.setPrev(bob);
	    _front = bob;
	}
	_size++;
    }

    public T removeFront(){
	if(isEmpty()){
	    return null;
	}
	T ret = _front.getCargo();
	_front = _front.getNext();
	_front.setPrev(null);
	return ret;
    }

    public T peekFront(){
	return _front.getCargo();
    }


    //~~~~~~~~~~~~ methods for the End of Deque ~~~~~~~~~~~                                         

    public void addEnd(T x);

    public T removeEnd();

    public T peekEnd(){
	return _end.getCargo();
    }


    public boolean isEmpty(){
	return _front == null;
    }

}