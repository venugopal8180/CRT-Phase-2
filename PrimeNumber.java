import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number To Prime or Not: ");
        int num = sc.nextInt();

        if(num<=1){
            System.out.println("It is not Prime.");
        }
        boolean isPrime=true;
        for(int i=2;i<=num/2;i++){
            if(num%i==1)
            {
             isPrime=false;
             break;
            }
        }

        if(isPrime){
            System.out.println("It is prime number");
        }
        else{
            System.out.println("It is prime number");

        }
        sc.close();
    }
}
