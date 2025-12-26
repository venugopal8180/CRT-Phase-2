import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = sc.nextInt();

        int sum = 0;
        int OriginalNum = number;
        
        while(number>0){
            int digit = number%10;
            sum += digit*digit*digit;
            number /= 10;
        }
        if(sum == OriginalNum){
            System.out.println(OriginalNum +" Is An amstrong Number");
        }
        else{
            System.out.println(OriginalNum +" Is An Not Amstrong Number");
        }

        sc.close();
    }
}
