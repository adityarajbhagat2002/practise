

public class Question2 {
public static void main(String[] args) {
    printnumbers(10);
}

 static void printnumbers(int n){
    int i = 0 ;
    if(i<n){
        System.out.println(i);
        i++;
        
    }
    printnumbers(i);
    
    return;
    
}

}
