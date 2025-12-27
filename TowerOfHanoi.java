import java.util.Scanner;

public class TowerOfHanoi{

    static void towerofhanoi(int n, char source, char helper, char destination){

        if(n==0){
            return;
        }

        //step 1 move n - 1 disks from sourse to helper
        towerofhanoi(n - 1, source, destination, helper);

        //step 2 move nth disk from sourse to destination
        System.out.println("move disk" +n +" from "+source +" to "+destination);

        //step 3 move n - 1 disks from helper to destination
        towerofhanoi(n - 1,helper,source, destination);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Disks: ");
        int n = sc.nextInt();

        towerofhanoi(n, 'R', 'V', 'G');

        sc.close();
    }
}