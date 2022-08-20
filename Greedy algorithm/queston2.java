class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
       ArrayList<Pair> list=new ArrayList<>();
       for(int i=0;i<n;i++){
           list.add(new Pair(start[i],end[i]));
       }
      
       Collections.sort(list,new Comparator<Pair>(){
           @Override
           public int compare(Pair p1,Pair p2){
               return p1.e-p2.e;
           }
           
       });
       int endtill=list.get(0).e;
       int ans=1;
       for(int i=1;i<list.size();i++){
           if(endtill<list.get(i).s){
               ans++;
               endtill=list.get(i).e;
           }
       }
       return ans;
        
    }
}
class Pair{
    int s;
    int e;
    Pair(int s,int e){
        this.s=s;
        this.e=e;
    }
}