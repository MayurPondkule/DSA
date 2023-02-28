import java.util.Scanner;
// import java.lang.*;
import java.lang.Math;



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


    
//number of nodes in tree
    static int size(Node root ){
		 if(root==null) 
		 return 0;

		 return size(root.left) + size(root.right) +1;
	}


	//max node

	static int maximum(Node root){

		if(root==null)
		return  -2;

		return  Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
	}

	static int minimum(Node root){

		if(root==null)
		return  1000;

		return  Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));
	}

    public static void main(String[] args) {           //5
 

		// sc = new Scanner(System.in);

        Node root = createTree();
	

        System.out.println("total nodes in tree is "+ size(root));
        System.out.println("maximum node value in tree is "+ maximum(root));
        System.out.println("minimum node value in tree is "+ minimum(root));



		
		


        
    }


    
}
