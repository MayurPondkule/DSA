#include<iostream>

using namespace std;

int linearsearch(int arr[],int size,int element){

    for(int i=0;i<size;i++){

        if(arr[i]==element){
            return i;

        }
        
    }
    return -1;

}


int binarysearch(int arr[],int size, int element){
    int low,mid,high;
    low=0;
    high=size-1;
    mid=(low+high)/2;

    //keep searching until low <=high;

    while (low<=high)
    {
       if(arr[mid]==element){
           return mid;
       } 

       if(arr[mid]<element){
           low=mid+1;

       }
       else{
           high=mid-1;
       }
        
    }

    return -1;

    
}


int main(){
    //unsorted array for linar search
    // int arr[]={1,6,8,4,77,33,99,3};
    // int size=sizeof(arr)/sizeof(int);
    // int element=6;
    // int searchindex=linearsearch(arr,size,element);
    // cout<<"the element "<<element<<" at index of "<<searchindex;


    //sorted array for binary search
    int arr[]={1,3,6,88,99,123,4556,8765};
    int size=sizeof(arr)/sizeof(int);
    int element=88;
    int searchindex=linearsearch(arr,size,element);
    cout<<"the element "<<element<<" at index of "<<searchindex;

    return 0;



}