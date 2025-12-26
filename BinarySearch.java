import java.util.Scanner;
public class BinarySearch {
     public static int binarySearch(int[] nums, int target){

     int left =0;
     int right=nums.length - 1;

      while(left<=right){
        int mid = left +(right-left)/2;

        if(nums[mid] == target){

         return mid;

        }
        else if(nums[mid] < target){
             left= mid + 1;

        }else{
            right=mid-1;
        }
        }
        return -1;
     }
    

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of array: ");
        int n =sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter Elements of array: ");
        for(int j=0;j<nums.length;j++){
            nums[j] = sc.nextInt();
        }
        System.out.println("Array Length: "+nums.length);

        System.out.println("Enter Target Value: ");
        int target = sc.nextInt();

        int result = binarySearch(nums, target);

        if(result!= -1){
            System.out.println("Value Found At Index: "+result);
        }else{
            System.out.println("Value Not Found!!");
        }
        sc.close();
    }
     
}
