import java.util.Scanner;
import java.lang.Math; //or *
import java.util.LinkedList;
import java.util.Queue;


class Node {                                         //1
	Node left, right;
	int data;
	
	public Node(int data) {   //constructer
		this.data = data;
	}
}


public class Tree1 {                     //2

    // static Scanner sc=null;



    static Node createTree() {              //3
	Scanner sc = new Scanner(System.in);
		
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt(); 
		
		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left for " + data);
		root.left = createTree();
		
		System.out.println("Enter right for "+ data);  
		root.right = createTree();
		 
		return root;
	}


	static int height(Node root){

        if(root==null)
        return 0;

        return Math.max(height(root.left),height(root.right)) +1;
    }


    static int diameter(Node root){

        if(root==null)  return 0;
        

        int dl=diameter(root.left);
        int dr=diameter(root.right);
        int current=height(root.left)+height(root.right)+1 ;

        return Math.max(current,Math.max(dl,dr));

          
       

        

    }


    
        

    public static void main(String[] args) {           //5
 

		// sc = new Scanner(System.in);

        Node root = createTree();

        System.out.println("diameter of binary tree is "+diameter(root));
      





        


		
		


        
    }


    
}
