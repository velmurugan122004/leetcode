class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        backTrack(nums,0,0,target);
        return count;
    }

    public void backTrack(int[]nums,int index,int currentSum,int target){
        if(index==nums.length){
            if(currentSum==target)
            {
                count++;
            }
            return;
        }
        backTrack(nums,index+1,currentSum+nums[index],target);
        backTrack(nums,index+1,currentSum-nums[index],target);
    }
}