#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node* next;
};


void linkedlisttraversal(struct Node *ptr){

    while(ptr!=NULL){
    printf("element: %d\n",ptr->data);
    ptr=ptr->next; 

    }
} 


struct Node * InsertionAtFirst(struct Node *head ,int data){
    struct Node * ptr=(struct Node*)malloc(sizeof(struct Node));
    ptr->data=data;
    ptr->next=head;
    head=ptr;
    return head;
    // return ptr;

}


struct Node * InsertionAtIndex(struct Node *head ,int data,int index){
    struct Node * ptr=(struct Node*)malloc(sizeof(struct Node));

    struct Node *p=head;
    
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


struct Node * InsertionAtEnd(struct Node *head ,int data){
      struct Node * ptr=(struct Node*)malloc(sizeof(struct Node));
      struct Node *p= head;
      ptr->data=data;
      while (p->next!=NULL)
      {
          p=p->next;
          
      }
      p->next=ptr;
      ptr->next=NULL;
      return head;

}
      

struct Node * InsertionAfterNode(struct Node *head ,struct Node *prevNode,int data){
      struct Node * ptr=(struct Node*)malloc(sizeof(struct Node));
      ptr->data=data;

      ptr->next=prevNode->next;
      prevNode->next=ptr;

      return head;



}







int main(){
    struct Node *head;
    struct Node *second;
    struct Node *third;

    head=(struct Node*)malloc(sizeof(struct Node));     
    second=(struct Node*)malloc(sizeof(struct Node));
    third=(struct Node*)malloc(sizeof(struct Node));
    

    head->data=33;
    head->next=second;

    second->data=44;
    second->next=third;

    third->data=55;
    third->next=NULL;
    
    printf("before insertion\n");
    linkedlisttraversal(head);
    head=InsertionAtFirst(head,22);
    printf("after insertion at first\n");
    linkedlisttraversal(head);

    printf("after insertion in between\n");

    head=InsertionAtIndex(head,90,1);
    linkedlisttraversal(head);


    printf("after insertion at END\n");

    head=InsertionAtEnd(head,123);
    linkedlisttraversal(head);

    printf("insertion after a Node\n");

    head=InsertionAfterNode(head,second,899);
    linkedlisttraversal(head);




    return 0;
       
}