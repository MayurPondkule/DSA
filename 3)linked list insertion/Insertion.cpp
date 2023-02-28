#include<iostream>
using namespace std;


class Node{
    public:
    int data;
    Node* next;
};


void linkedlisttraversal( Node *ptr){

    while(ptr!=NULL){
    cout<<"element:"<<ptr->data<<endl;
    ptr=ptr->next; 

    }
} 


Node * InsertionAtFirst( Node *head ,int data){
    Node * ptr= new Node();
    ptr->data=data;
    ptr->next=head;
    head=ptr;
    return head;
    // return ptr;

}

 Node * InsertionAtIndex(Node *head ,int data,int index){
    Node * ptr= new Node();

    Node *p=head;
    
    int i=0;

    while(i!=index-1){
        p=p->next;
        i++;
    }
    ptr->data=data;
    ptr->next=p->next;
    p->next=ptr;
    return head;

}


Node * InsertionAtEnd(Node *head ,int data){
      Node * ptr= new Node();
      Node *p= head;
      ptr->data=data;
      while (p->next!=NULL)
      {
          p=p->next;
          
      }
      p->next=ptr;
      ptr->next=NULL;
      return head;

}
      
 Node * InsertionAfterNode(Node *head ,Node *prevNode,int data){
      Node * ptr= new Node();
      ptr->data=data;

      ptr->next=prevNode->next;
      prevNode->next=ptr;

      return head;



}







int main(){

    
    Node *head=new Node();
    Node *second=new Node();
    Node *third=new Node();

    head->data=33;
    head->next=second;

    second->data=44;
    second->next=third;

    third->data=55;
    third->next=NULL;
    
    cout<<"before insertion\n";
    linkedlisttraversal(head);
    head=InsertionAtFirst(head,22);
    cout<<"after insertion at first\n";
    linkedlisttraversal(head);

    cout<<"after insertion in between\n";

    head=InsertionAtIndex(head,90,1);
    linkedlisttraversal(head);


    cout<<"after insertion at END\n";

    head=InsertionAtEnd(head,123);
    linkedlisttraversal(head);

    cout<<"insertion after a Node\n";

    head=InsertionAfterNode(head,second,899);
    linkedlisttraversal(head);




    return 0;
       
}