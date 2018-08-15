/* Quick Sort implementation in C++ */
#include <iostream>

using namespace std;

void swap(int *a, int *b){
    int temp = *a;
    *a=*b;
    *b=temp;
}

int partition(int *a, int start, int end){
    int pivot= a[end];
    int partitionIndex=start; //set partition index as start initially

    for(int i=start;i<end;i++){

        if(a[i]<=pivot){
            swap(a[i],a[partitionIndex]); //swap if element is lesser than pivot
            partitionIndex++;
        }
    }
    swap(a[partitionIndex],a[end]); // swap pivot with element at partition index
    return partitionIndex;
}

void quickSort(int *a, int start, int end){
    if(start < end){
        int partitionIndex = partition(a,start,end);
        quickSort(a,start, partitionIndex-1);
        quickSort(a,partitionIndex+1, end);
    }
}

int main()
{
    int a[]={8,3,2,5,6,4,7,1};
    quickSort(a,0,7);
    for(int i=0;i<8;i++) {
        cout << a[i] << " ";
    }
    return 0;
}
