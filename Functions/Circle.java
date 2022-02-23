import java.util.*;

public class Circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers for the produt");
        int a =sc.nextInt();
        int b=sc.nextInt();
        product(a,b);

    }
    public static  void product(int x,int y){
        System.out.println("the product is " + x*y);
    
    }
    
}
