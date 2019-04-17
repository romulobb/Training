
public class BinaryTree {
 
    Node root;
 
    // ...
    public boolean esHoja(Node n) {
    	
    	return ((n.left==null) &&(n.right==null)); 
    	
    }

	public BinaryTree(Node root) {
		super();
		this.root = root;
		root.right = null;
        root.left = null;
	}
	
		
    
}