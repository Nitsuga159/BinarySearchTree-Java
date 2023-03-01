package binarySearchTree;

public class Main {

	public static void main(String[] args) {
		CallBackBinarySearchThree<Integer> myCbBinaryTree = new CallBackBinarySearchThree<Integer>() {
			//IN OUR CASE, WE JUST WANT THAT THE VALUES INTEGER WILL BE EQUALS,
			//BUT THIS COULD BE MORE COMPLEX COMPARING OBJECTS WITH MANY PROPERTIES.
			public boolean findCb(Integer value, Integer actualValue) {
				return value == actualValue;
			}
			
			//DEPENDING WHAT VALUE RETURN 'compareCb' THE BINARY SEARCH TREE WILL PUT THE VALUE ON THE LEFT/RIGHT.
			public Direction compareCb(Integer actualValue, Integer newValue) {
				return newValue < actualValue ? Direction.LEFT : Direction.RIGHT;
			}
		};
		
		BinarySearchTree<Integer> myBinaryTree = new BinarySearchTree<Integer>(1, myCbBinaryTree); 
		
		myBinaryTree.add(2);
		myBinaryTree.add(5);
		myBinaryTree.add(0);
		
		System.out.println("0 IS IN BINARY SEARCH TREE ? " + myBinaryTree.find(0));
		System.out.println("3 IS IN BINARY SEARCH TREE ? " + myBinaryTree.find(3));
		System.out.println("5 IS IN BINARY SEARCH TREE ? " + myBinaryTree.find(5));
		
		System.out.println("\nFOR EACH VALUE OF A BINARY SEARCH TREE IN PRE ORDER, DO SOMETHING:");
		myBinaryTree.forEach(BinaryOrder.PREORDER);
		
		System.out.println("\nFOR EACH VALUE OF A BINARY SEARCH TREE IN ORDER, DO SOMETHING:");
		myBinaryTree.forEach(BinaryOrder.INORDER);
		
		System.out.println("\nFOR EACH VALUE OF A BINARY SEARCH TREE IN POST ORDER, DO SOMETHING:");
		myBinaryTree.forEach(BinaryOrder.POSTORDER);
		
		
	}

}
