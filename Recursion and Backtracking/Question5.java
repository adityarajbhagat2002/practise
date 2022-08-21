import java.util.Scanner;
import java.util.*;


public class Question5 {

public static void main(String[] args) {
    
    int[] arr ={1,2,3,4,5};
    skip(arr,0,arr.length-1);
     System.out.println(Arrays.toString(arr));
 }

 private static void skip(int[] arr , int start , int end) {
     if(start>=end){
         return ;
     }
     swap(arr,start,end);
     skip(arr,start+1,end-1);
 }

 private static void swap(int[] arr ,int start, int end) {
     int temp = arr[start];
     arr[start] = arr[end];
     arr[end] = temp;
 }
}
