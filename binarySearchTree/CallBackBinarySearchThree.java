package binarySearchTree;


//THIS METHODS MUST BE OVERWRITTEN WHEN YOU'LL DO AN INSTANCE, THEN YOU CAN ADD THE LOGIC THAT YOU NEED TO FIND OR COMPARE YOUR VALUES.

public abstract class CallBackBinarySearchThree<T> {
	
	//DEFAULT METHOD JUST RETURN FALSE, SO NEVER WILL BE RETURNED AN OBJECT WITH THE DEFAULT METHOD
	
	public boolean findCb(T value, T actualValue) {
		return false;
	}
	
	//DEFAULT METHOD JUST COMPARES HASHCODE VALUE (FROM ADDRESS MEMORY).
	//IN ANOTHER WORDS, IT'S A RANDOM ELECTION TO RETURNED LEFT OR RIGHT DIRECTION.
	
	public Direction compareCb(T actualValue, T newValue) {
		return actualValue.hashCode() < newValue.hashCode() ? Direction.LEFT : Direction.RIGHT;
	}
	
	public void doCb(T value) {
		System.out.print(value);
	}
}
