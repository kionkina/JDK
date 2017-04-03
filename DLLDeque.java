public class DLLDeque<T>{

    private DLLNode<T> _front;
    private DLLNode<T> _end;
    private int _size;
    
    public DLLDeque(){
	_size = 0;
	_front = null;
	_end = null;
    }

//~~~~~~~~~~~~~ methods for Front of Deque ~~~~~~~~~~~~                                         
//adds element to the front                                                                     
    public void addFront(T x){
	if(isEmpty()){
	    _front = new DLLNode<T>(x, null, null);
	    _end = _front;
	 	}
	else {
	    DLLNode bob = new DLLNode<T>(x, null,_front);
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
	    _front = _end;
	}
	else{
	    DLLNode<T> bob = new DLLNode<T>(x, _end,null);
	    _end = bob;
	    _end.getPrev().setNext(_end);
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
	    _end.setNext(null);
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
    public String toString(){
	String retStr = "";
	DLLNode node = _front;
	while(node != null){
	    retStr += node.toString() + "  ";
	    node = node.getNext();
	}
	return retStr;
	
    }
    /*public static void main(String[] args){
	DLLDeque<String> test = new DLLDeque<String>();
	test.addFront("hello");
	test.addFront("hello1");
	//test.removeFront();
	test.addEnd("hello3");
	test.addEnd("hello3");
	test.addFront("hello1");
	test.removeEnd();
	System.out.println(test);
	}*/

}
