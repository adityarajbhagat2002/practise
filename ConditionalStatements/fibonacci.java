import java .util.*;

public class fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the range");
        int n= in.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i< n ;i++){
            int temp=a+b;
            System.out.println(temp);
           

        }

    }
}
