import java.util.Scanner;

/*Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
*/


public class sumofnumebrs {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n ,negsum=0,evensum=0,oddsum=0;

        while(true){
            System.out.println("enter a number and enter 0 to end");
            n=sc.nextInt();
            if(n<0){
                negsum+=n;
           }
            else if(n>0 && n%2==0){
                evensum+=n;
            }
            else if(n>0 && n!=0){
                oddsum+=n;
            }
            if(n==0){
             
             System.out.println("negative sum is " + negsum + " positve even sum is " + evensum + " positive odd sum " +oddsum);
             break;
            }

        }
        
 }
}
