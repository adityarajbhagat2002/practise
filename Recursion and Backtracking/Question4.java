import java.util.*;


public class Question4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the range");
        int n= sc.nextInt();
        System.out.println(factorial(n));
        
    }
    static int  factorial(int n){
        if(n==1){
            return n;
        }
         return  n *  factorial(n-1);
          

    }


    
}
