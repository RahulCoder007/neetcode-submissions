
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
        /******O(nlogn)**********/
        int i=0;
        int j=nums.length-1;

        int[][] arr=new int[nums.length][2];

        for(int x=0;x<=j;x++){
            arr[x][0]=nums[x];
            arr[x][1]=x;
        }
        System.out.println(Arrays.deepToString(arr));
        Arrays.sort(arr,Comparator.comparingInt(a->a[0]));
        System.out.println(Arrays.deepToString(arr));

        while(i<j){
            if(arr[i][0]+arr[j][0]>target)
            j--;
            else if(arr[i][0]+arr[j][0]<target)
            i++;
            else
            return new int[]{Math.min(arr[i][1],arr[j][1]),Math.max(arr[i][1],arr[j][1])};
        }
        return new int[]{};
        



        /******O(n)**********/
        // Map<Integer,Integer> m=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     int complement=target-nums[i];//4

        //     if(m.containsKey(complement))
        //         return new int[]{m.get(complement),i};


        //     m.put(nums[i],i);//[3,0],[4,1]
        // }
        // return new int[]{};
        
    }
}


