import javax.xml.crypto.Data;

class LL{
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //add -first ,last
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;

    }

    //last
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }

        currNode.next=newNode;

    }


    //print
    public void printList(){
        
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node currNode=head;

        while(currNode!=null){
            System.out.print(currNode.data+"-> ");
            currNode=currNode.next;
        }

        System.out.println("null");
    }




    public static void main(String[] args) {
        
        LL list=new LL();  //make apni class ki object
        list.addFirst(2);
        list.addFirst(4);
        list.addLast(10);
        list.printList();

        
    }
}