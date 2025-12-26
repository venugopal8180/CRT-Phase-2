import java.util.Scanner;
public class StrongNumber {
    public static int factorial( int digit){
        int fact =1;
        for(int i=1; i<=digit; i++ ){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = sc.nextInt();

        int sum = 0;
        int OriginalNum = number;
        
        while(number>0){
            int digit = number%10;
            sum += factorial(digit);
            number /= 10;
        }
        if(sum == OriginalNum){
            System.out.println(OriginalNum +"Is An Strong Number");
        }
        else{
            System.out.println(OriginalNum +"Is An Not Strong Number");
        }

        sc.close();
    }
}
