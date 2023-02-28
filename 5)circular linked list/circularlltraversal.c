#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node* next;
};


void Clinkedlisttraversal(struct Node *head){

    struct Node *ptr=head;

   
   do{
    printf("element: %d\n",ptr->data);
    ptr=ptr->next;
   }while(ptr!=head);
  
    
} 

struct Node * InsertionAtFirst(struct Node *head ,int data){
    struct Node * ptr=(struct Node*)malloc(sizeof(struct Node));
    ptr->data=data;

    struct Node *p=head->next;
    while (p->next!=head)
    
    {
        p=p->next;
    }


    p->next=ptr;
    ptr->next=head;
    head=ptr;
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
    third->next=head;
    
   
    Clinkedlisttraversal(head);
    head=InsertionAtFirst(head,89);
    head=InsertionAtFirst(head,9);
   
    printf("after insertion at first\n");
    Clinkedlisttraversal(head);

    

    return 0;
       
}