import java.util.Scanner;
import java.lang.*;


class Node {                                         //1
	Node left, right;
	int data;
	
	public Node(int data) {   //constructer
		this.data = data;
        // left=right=null;
	}
}


public class Tree{                     //2

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


    static Node lca(Node root,int n1,int n2){
        
        if(root==null) return root;

        if(n1==root.data || n2==root.data) return root;

        Node left=lca(root.left, n1, n2);
        Node right=lca(root.right, n1, n2);

        if(left==null) return right;
        if (right== null) return left;

        return root;                        

        


    } 


    


    public static void main(String[] args) {           //5
 

		// sc = new Scanner(System.in);

        Node root = createTree();

        lca(root, 5, 3);
	

   



		
		


        
    }


    
}
