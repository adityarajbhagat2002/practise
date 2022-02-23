import java.util.*;

public class ODDnEVEN {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a numeber ");
        int n= sc.nextInt();
        evenodd(n);
        

    }
      
    public static void evenodd(int n){
        if(n%2==0){
            System.out.println("the number is even " + n);
        }
        else{
            System.out.println("the number is odd  " + n);
        }
    }


}
