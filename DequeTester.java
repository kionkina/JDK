//Team CATScan
//Tina Chen, Angel Ng, Caleb Smith-Salzberg
//APCS2 pd5
//HW29 -- Stress is the Best
//2017-04-04

public class DequeTester{
    public static void main (String[] args){
	DLLDeque<String> bob = new DLLDeque<String>();
	System.out.println("adding items to deque...........................");
	bob.addFront("Hello");
	bob.addEnd("my");
	bob.addEnd("name");
	bob.addEnd("is");
	bob.addEnd("bob");
	System.out.println("items in deque: " + bob);
	
	//shows first item
	System.out.println("Peek first item: " + bob.peekFront()); //hello
	//shows last item
	System.out.println("Peek last item: " + bob.peekEnd()); //bob

	//returns deque with first item removed
	bob.removeFront();
	System.out.println("Remove first item: " + bob);

	//returns deque with last item removed
	bob.removeEnd();
	System.out.println("Remove last item: " + bob);

	//remove everything to create every deque
	bob.removeEnd();
	bob.removeEnd();
	bob.removeEnd();
	System.out.println("Removed all items: " + bob);
	System.out.println("Removing from an empty list should return some sort of exception that makes sense: ");
	bob.removeEnd();
	
    }
}
