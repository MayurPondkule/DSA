#include<iostream>

using namespace std;


class Node{
    public:
    int data;
    Node* next;
};


void linkedlisttraversal(Node *ptr){

    while(ptr!=NULL){
    cout<<"element:"<<ptr->data<<endl;
    ptr=ptr->next;

    }
}




Node * deletefirst(Node *head){

    Node * ptr=head;
    head=head->next;
    free(ptr);
    return head;

}

Node *deleteatindex(Node*head,int index){

    Node *p=head;
    Node *q=head->next;

    for(int i=0;i<index-1;i++){
        p=p->next;
        q=p->next;

    }

    p->next=q->next;
    free(q);
    return head;
}


Node *deletelast(Node *head){

    Node *p=head;
    Node *q=head->next;

    while(q->next!=NULL){
        p=p->next;
        q=p->next;

    }

    p->next=NULL;
    free(q);
    return head;

}


Node *deletebyvalue(Node * head,int value){
    Node *p=head;
    Node* q=head->next;

    while (q->data!=value &&   q->next!=NULL)
    {
        p=p->next;
        q=q->next;
    }

    if(q->data==value){

        p->next=q->next;
        free(q);
    }

    return head;
    
}

int main(){
    Node *head=new Node();
    Node *second=new Node();
    Node *third=new Node();
    Node *forth=new Node();


    

    head->data=11;
    head->next=second;

    second->data=22;
    second->next=third;

    third->data=33;
    third->next=forth;

    forth->data=44;
    forth->next=NULL;

    

cout<<"before deletion\n";

    linkedlisttraversal(head);

    
// cout<<"after delete the first element\n";


//     head=deletefirst(head);
//     linkedlisttraversal(head);


// cout<<"after delete at index\n";

// head=deleteatindex(head,2);
// linkedlisttraversal(head);




// cout<<"after delete last element\n";

// head=deletelast(head);
// linkedlisttraversal(head);


cout<<"after delete by using value \n";
head=deletebyvalue(head,22);
linkedlisttraversal(head);



    return 0;
       
       
}