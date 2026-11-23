class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        // int i=0, j=n-1;
        // while(i<j){
        //     if(numbers[i]+numbers[j]>target){
        //         j--;
        //     }else if(numbers[i]+numbers[j]<target){
        //         i++;
        //     }else{
        //         return new int[]{i+1,j+1};
        //     }
            
        // }
        int i, idx=0;
        for(i=0;i<n;i++){
             int temp=target-numbers[i];  
             idx=Arrays.binarySearch(numbers,i+1,n,temp);
             if(idx>=0)
             return new int[]{i+1,idx+1};
        }
        //  System.out.println(numbers[i]+" "+numbers[idx]);
        return new int[]{};
    }
}
