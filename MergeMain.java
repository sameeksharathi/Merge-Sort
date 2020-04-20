class MergeMain{
  public static void main(String[] args) {
        int arr[]={90,40,30,10,60,20};
        MergeSort obj=new MergeSort(arr.length);
        obj.mergesort(arr,0,arr.length-1);
        for (int i = 0; i <arr.length-1 ; i++) {
            System.out.println(arr[i]);
        }
    }
}
