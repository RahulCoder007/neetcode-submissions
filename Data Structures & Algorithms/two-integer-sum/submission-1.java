class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        /******O(n2)**********/
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         // if(i==j)
        //         // continue;
        //         if (nums[i] + nums[j] == target)
        //             return new int[] {i, j};
        //     }
        // }
        // return new int[] {};

        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            int complement=target-nums[i];//4

            if(m.containsKey(complement))
                return new int[]{m.get(complement),i};


            m.put(nums[i],i);//[3,0],[4,1]
        }
        return new int[]{};
    }
}
