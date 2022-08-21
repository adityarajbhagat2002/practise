

public class Question1 {
    public static void main(String[] args) {
        print("ADITYA" , 5);

    }

    static void print(String name , int times){
        System.out.println(times + ":" + name);
        if(times !=1)
        print(name , times-1);
        else
        return;

    }
    
}
