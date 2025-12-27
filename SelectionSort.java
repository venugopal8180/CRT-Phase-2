public class SelectionSort {
    public static void main(String args[]){
        int arr[] ={10,20,34,22,5,10};

        for(int i=0; i<arr.length - 1;i++){
            int min = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp; 
        }

        for(int x : arr){
            System.out.println(x +" ");
        }
    }
}
