public class MergeSort {
    int arr[];
    public MergeSort(int size){
        arr=new int[size];
    }

    public void mergesort(int arr1[], int lb, int ub) {
        if(lb<ub){
            int mid=(lb+ub)/2;
            mergesort(arr1,lb,mid);
            mergesort(arr1,mid+1,ub);
            merge(arr1,lb,mid,ub);
        }
    }

    public void merge(int arr1[], int lb, int mid, int ub){
        int i=lb;
        int j=mid+1;
        int k=lb;
        while(i<=mid && j<=ub){
            if (arr1[i]<=arr1[j]){
                arr[k]=arr1[i];
                i++;
            }
            else {
                arr[k]=arr1[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=ub){
                arr[k]=arr1[j];
                j++;
                k++;
            }
        }
        else{
            while (i<=mid){
                arr[k]=arr1[i];
                i++;
                k++;
            }
        }
        for (k=lb;k<=ub;k++){
            arr1[k]=arr[k];
        }
    }
}
