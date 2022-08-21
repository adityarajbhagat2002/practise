
public class Question3 {
    static void reverse(int start,int end){
        if(start > end){
            return ;
        }
        reverse(start+1,end);
        System.out.println(start);
    }
    public static void main(String args[]){
    
        reverse(1,10);
    }
}
    

