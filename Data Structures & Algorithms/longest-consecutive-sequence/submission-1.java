class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> set=new TreeSet<>();
        for(int num: nums)
        set.add(num); //0,1,2,3,4,5,6,20

        int ct=1;
        int maxCt=1;
        Integer prev=null;
        for(int num: set){
            if(prev!=null){
               if(prev+1==num){
                ct++;
                maxCt=Math.max(ct,maxCt);
               }else{
                ct=1;
               } 
              
            }
             prev=num;
        }
        return maxCt;

        
    }
}
