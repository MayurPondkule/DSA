import java.util.Scanner;
// import java.lang.*;
// import java.lang.Math;



class Node {                                         //1
	Node left, right;
	int data;
	
	public Node(int data) {   //constructer
		// this.data = data;
		left=right=null;
	}

}







public class Tree {                     //2

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



	static Node prev=null,head=null;
    static void convertToDLL(Node root){
		// Node prev=null,head=null;
        
        // inorder L root R

		if(root==null) return;

		convertToDLL(root.left);

		if(prev==null) head=root;

		else{
			root.left=prev;
			prev.right=root;
		}

		prev=root;

		convertToDLL(root.right);

    }


	static void printList(Node root)
    {
        while (root != null)
        {
            System.out.print(root.data + " ");
            root = root.right;
        }
    }




    

    public static void main(String[] args) {           //5
 

		// sc = new Scanner(System.in);

        Node root = createTree();


		// Tree myobj= new myobj();

		// System.out.println("this:");

		convertToDLL(root);

		printList(head);
	

	
        
    }


    
}
