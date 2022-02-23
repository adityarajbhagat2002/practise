import java.util.*;
public class SUMofFirstN {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the range upto where you want the sum");
        int n=sc.nextInt();
    
        System.out.println("the sum is " + sum(n));


    }
    public static int sum(int n){
        int s=0;
        for(int i=0;i<=n; i++){
         s=s+i;
        }
        return s;
    }
}
