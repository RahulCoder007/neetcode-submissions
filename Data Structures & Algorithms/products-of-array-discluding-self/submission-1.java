class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        // int[] op= new int[n];
        // for(int i=0;i<n;i++){
        //     int prod=1;
        //     for(int j=0;j<n;j++){
        //         if(i==j)
        //         continue;
        //         prod=prod*nums[j];
        //         op[i]=prod;
        //     }
        // }
        // return op;


        int[] prefix=new int[n+1];
        int[] suffix=new int[n+1];
        prefix[0]=1;
        suffix[n]=1;
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]*nums[i];
        }
        for(int j=n-1;j>=0;j--){
            suffix[j]=suffix[j+1]*nums[j];
        }
        // System.out.println(Arrays.toString(prefix));
        // System.out.println(Arrays.toString(suffix));
        int[] op=new int[n];
        for(int k=0;k<n;k++){
            op[k]=prefix[k]*suffix[k+1];
        }
        return op;
    }
    
}  
