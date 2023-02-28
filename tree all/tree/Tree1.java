import java.util.Scanner;


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


    static void inOrder(Node root) {                    //4
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}

	static void preorder(Node root){
		if(root== null)  return;

		System.out.print(root.data+ " ");
		preorder(root.left);
		preorder(root.right);
	}

	static void postorder(Node root){
		if(root ==null) return;

		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+ " ");
	}

    public static void main(String[] args) {           //5
 

		// sc = new Scanner(System.in);

        Node root = createTree();
		inOrder(root);
		System.out.println();

		preorder(root);

		System.out.println();
		postorder(root);
		
		


        
    }


    
}
