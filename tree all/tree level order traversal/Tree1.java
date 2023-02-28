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



	static void printcurrentlevel(Node root,int level){

		if(root==null)
		return;

		if(level==1){

			System.out.print(root.data+" ");

		}
		else if(level>1){
			printcurrentlevel(root.left, level-1);
			printcurrentlevel(root.right, level-1);

		}
	}


	static void printlevelorder(Node root){
		Queue<Node> q=new LinkedList<>(); 
		q.add(root);

		while(!q.isEmpty()){

			Node current=q.poll();
			System.out.print(current.data+ " ");

			if(current.left!=null){
				q.add(current.left);
			}

			if(current.right!=null){
				q.add(current.right);
			}
		}
	}



	
	static void printlevelorder1(Node root){
		Queue<Node> q=new LinkedList<>(); 
		q.add(root);
		q.add(null);

		while(!q.isEmpty()){

			Node current=q.poll();

			if(current==null){
				if(q.isEmpty())
				return;

				q.add(null);
				System.out.println();
				continue;

			}
			System.out.print(current.data+ " ");


			if(current.left!=null){
				q.add(current.left);
			}

			if(current.right!=null){
				q.add(current.right);
			}
		}
	}

	


    

        

    public static void main(String[] args) {           //5
 

		// sc = new Scanner(System.in);

        Node root = createTree();
        



		// for(int i=1;i<=height(root);i++){              //O(n^2)
		// 	printcurrentlevel(root,i);
		// }


//////////using queue

		printlevelorder(root);
		System.out.println();

		printlevelorder1(root);
	

        


		
		


        
    }


    
}
