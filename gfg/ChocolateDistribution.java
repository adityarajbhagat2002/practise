class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        long min_diff=Integer.MAX_VALUE;
        long x=m-1;
        
        for(int i=0;x<n;i++){
            long diff=a.get((int)x)-a.get((int)i);
            
            if(diff<min_diff)
            min_diff=diff;
            x++;
        }
        return min_diff;
        
    }
}