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

    linkedlisttraversal(head);


    return 0;
       
}