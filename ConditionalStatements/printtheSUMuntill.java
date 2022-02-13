import java.util.*;
public class printtheSUMuntill {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int n =in.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
            }
        
        System.out.println(sum);

    }
    
}
