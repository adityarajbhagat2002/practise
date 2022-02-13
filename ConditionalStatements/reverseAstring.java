import java.util.*;

public class reverseAstring {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string :");

        String str= sc.nextLine();
        System.out.println("the reverse string is :");
        int i= str.length();
        while (i>0) {
            System.out.print(str.charAt(i-1));
            i--;

            
        } 
    }
}
