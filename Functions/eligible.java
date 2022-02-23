import java.util.*;

public class eligible {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age");
        int n=sc.nextInt();
        checkage(n);

    }
    public static void checkage(int n){
        if(n>=18){
            System.out.println("you are eligible to vote");
            System.out.println("bada aaya desh badalnee");
        }
        else{
            System.out.println("ghar jaa bsdk");
        }
    } 
    
}
