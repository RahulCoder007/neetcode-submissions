class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list= new ArrayList<>();
        int n=nums.length;
        // int i=0, k=n-1,j=0;
        for(int i=0;i<n;i++){
            // Early exit: if the smallest number is > 0, no triplet can sum to 0
            if(nums[i]>0) break;
            // Skip duplicate values for the first element
            if(i>0 && nums[i]==nums[i-1]) continue;
            int target=-nums[i];
            int j=i+1, k=n-1;
            while(j<k){
                if(nums[j]+nums[k]>target)
                    k--;
                    else if(nums[j]+nums[k]<target)
                    j++;
                    else{
                        list.add(List.of(nums[i],nums[j],nums[k]));
                        j++;k--;
                        // Skip duplicate values for the second element
                        while(j<k && nums[j]==nums[j-1])
                        j++;
                    }
                    
            }
        }
    return list;
    }
}
