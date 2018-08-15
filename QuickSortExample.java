
/* Implementation of Quick Sort in Java */

public class QuickSortExample {
	
	public static void swap(int[] arr,int a, int b){
	    int temp = arr[a];
	    arr[a]=arr[b];
	    arr[b]=temp;
	}

	public static int partition(int[] a, int start, int end){
	    int pivot= a[end];
	    int partitionIndex=start; //set partition index as start initially

	    for(int i=start;i<end;i++){

	        if(a[i]<=pivot){
	            swap(a,i,partitionIndex); //swap if element is lesser than pivot
	            partitionIndex++;
	        }
	    }
	    swap(a,partitionIndex,end); // swap pivot with element at partition index
	    return partitionIndex;
	}

	public static void quickSort(int[] a, int start, int end){
	    if(start < end){
	        int partitionIndex = partition(a,start,end);
	        quickSort(a,start, partitionIndex-1);
	        quickSort(a,partitionIndex+1, end);
	    }
	}

	public static void main(String[] args)
	{
	    int[] a={8,3,2,5,6,4,7,1};
	    quickSort(a,0,7);
	    for(int i=0;i<8;i++) {
	        System.out.printf(" %d ", a[i]);
	    }
	    
	}

}
