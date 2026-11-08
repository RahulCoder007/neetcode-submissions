class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        // console.log(nums.length)
        for(let i=0;i<nums.length;i++){
            let store=nums[i]
            for(let j=i+1;j<nums.length;j++){
                if(store===nums[j])
                {
                    console.log(store, nums[j])
                    return true
                }
            }
        }
        return false
    }
}
