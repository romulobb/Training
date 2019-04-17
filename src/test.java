import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() {
		/*
	  	ArrayList<Integer> arr = new ArrayList<Integer>(Ej1.ARRAY_LIST_LENTGH); 
		  
        arr.add(10); 
        arr.add(15); 
        arr.add(3); 
        arr.add(7); 
        
        int k=17;

        assertEquals(true, Ej1.exercice(arr,k));
        
        k= 20;
        
        assertEquals(false, Ej1.exercice(arr,k));
        
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Ej1.ARRAY_LIST_LENTGH);
        
        arr2.add(0); 
        arr2.add(1); 
        arr2.add(2); 
        arr2.add(3);
        
        k=0;
        
        assertEquals(false, Ej1.exercice(arr2,k));
        
      */
		/*   0
   0
  / \
 1   0
    / \
   1   0
  / \
 1   1
		 * 
		 * */
		
		Node root =new Node(0);
		root.left=new Node(1);
		root.right=new Node(0);
		root.right.left=new Node(1);
		root.right.right=new Node(0);
		/*root.right.left.left=new Node(1);
		root.right.left.right=new Node(1);*/
		
		assertEquals(3, Ej2.countUnival(root));
		
		
	}

}
