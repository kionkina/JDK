public class DLLDeque<T>{

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
	    _front = new DLLNode<T>(x, null, null);
	 	}
	else {
	    DLLNode bob = new DLLNode<T>(x, _front ,null);
	    _front.setPrev(bob);
	    _front = bob;
	    _end.setNext(_front);
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
	_end.setNext(_front);
	_size --;
	return ret;
    }

    public T peekFront(){
	return _front.getCargo();
    }


    //~~~~~~~~~~~~ methods for the End of Deque ~~~~~~~~~~~                                         

    public void addEnd(T x){
	if (isEmpty()){
	    _end = new DLLNode<T>(x,null, null);
	}
	else{
	    DLLNode<T> bob = new DLLNode<T>(x, _front, _end);
	    _end.setNext(bob);
	    _end = bob;
	}
	_size ++;
    }
    public T removeEnd(){
	if (isEmpty()){
	    return null;
	}
	else{
	    T ret = _end.getCargo();
	    _end = _end.getPrev();
	    _end.setNext(_front);
	    _size --;
	    return ret;
	}
    }

    public T peekEnd(){
	return _end.getCargo();
    }


    public boolean isEmpty(){
	return _front == null;
    }

}
