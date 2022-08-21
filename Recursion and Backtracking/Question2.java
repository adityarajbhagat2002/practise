import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Question2 {
public static void main(String[] args) {
    print(10,1);
    


    }
    static void print(int start, int end ){
        if(start >= end){
            System.out.println(start);
            print(start -1 , end);
            }
            return;

        
    }

  }
