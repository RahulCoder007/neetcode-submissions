class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        /*********O(n2)*********/
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

      /*********O(n) + space: O(n)*********/
    //  int[] prefix=new int[n];
    //     int[] suffix=new int[n];
    //     prefix[0]=1;
    //     suffix[n-1]=1;
    //     for(int i=1;i<n;i++){
    //         prefix[i]=prefix[i-1]*nums[i-1];
    //     }
    //     for(int j=n-2;j>=0;j--){
    //         suffix[j]=suffix[j+1]*nums[j+1];
    //     }
    //     // System.out.println(Arrays.toString(prefix));
    //     // System.out.println(Arrays.toString(suffix));
    //     int[] op=new int[n];
    //     for(int k=0;k<n;k++){
    //         op[k]=prefix[k]*suffix[k];
    //     }
    //     return op;

    /*********O(n)*********/
    int[] res=new int[n];
    Arrays.fill(res,1);
    //int prefix=1;

    for(int i=1;i<n;i++){
       // prefix*=nums[i-1]
       res[i]=res[i-1]*nums[i-1];// res[i-1]=prefix

    }
    int suffix=1;
    for(int i=n-2;i>=0;i--){
        suffix*=nums[i+1];
        res[i]*=suffix;
    }
       return res;

    }
    
}  
