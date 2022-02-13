import java.util.*;
public class printhefactorsuntillGREATEST {
    public static void main(String[] args){
        int n,max=0,temp;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        do{
            n=sc.nextInt();
            temp=n;
            if(temp>max){
                max=temp;
            }
            System.out.println("the greatest number untill now " +max);


        }while(n!=0);
    }
    
}
