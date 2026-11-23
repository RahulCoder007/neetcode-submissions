class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int i=0, j=n-1;
        while(i<j){
            if(numbers[i]+numbers[j]>target){
                j--;
            }else if(numbers[i]+numbers[j]<target){
                i++;
            }else{
                return new int[]{i+1,j+1};
            }
            
        }
        // for(int i=0;i<n;i++){
        //      numbers[i]=target-numbers[i];  
        //     System.out.println(numbers[i]);
        // }
        // System.out.println(numbers[i]+" "+numbers[j]);
        return new int[]{};
    }
}
