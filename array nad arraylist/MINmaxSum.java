class Solution
{ 
    public static int findSum(int A[],int N) 
    {      int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        for(int i =0;i<A.length;i++){
            if(A[i]>Max){
                Max=A[i];
            }
            if(A[i]<Min){
                Min=A[i];
            }
        }
            return Max+Min;
    }
}