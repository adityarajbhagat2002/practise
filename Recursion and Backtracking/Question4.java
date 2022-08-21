import java.util.*;


public class Question4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the range");
        int n= sc.nextInt();
        System.out.println(sum(n));
        
    }
    static int  sum(int n){
        if(n==0){
            return n;
        }
         return  n +  sum(n-1);
          

    }


    
}
