package binarySearchTree;

public class BinarySearchTree<T> {
	private T value;
	private BinarySearchTree<T> left;
	private BinarySearchTree<T> right;
	private CallBackBinarySearchThree<T> cbInstance;
	
	public BinarySearchTree(T value, CallBackBinarySearchThree<T> cbInstance) {
		this.value = value;
		this.cbInstance = cbInstance;
	}
	
	public void add(T value) {
		if(cbInstance.compareCb(this.value, value) == Direction.LEFT) 
			if(this.left == null) this.left = new BinarySearchTree<T>(value, cbInstance);
			else this.left.add(value);
		else 
			if(this.right == null) this.right = new BinarySearchTree<T>(value, cbInstance);
			else this.right.add(value);
	}
	
	public boolean find(T value) {
		if(cbInstance.findCb(value, this.value)) return true;
		
		if(cbInstance.compareCb(this.value, value) == Direction.LEFT) {
			if(this.left != null) return this.left.find(value);			
		} else {
			if(this.right != null) return this.right.find(value);
		}
		
		return false;
	}
	
	//EXECUTES A CB FOR EACH VALUE OF A BINARY SEARCH TREE INSTANCE THAT FOUNDS.
	public void forEach(BinaryOrder order) {
		if(order == BinaryOrder.PREORDER) cbInstance.doCb(this.value);

		if(this.left != null) this.left.forEach(order);

		if(order == BinaryOrder.INORDER) cbInstance.doCb(this.value);

		if(this.right != null) this.right.forEach(order);

		if(order == BinaryOrder.POSTORDER) cbInstance.doCb(this.value);
	}
	
	
}
