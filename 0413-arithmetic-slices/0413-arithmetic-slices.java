class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int length=nums.length;
        int current=0;
        int count=0;
        for(int i=2;i<length;i++)
        {
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2])
            {
                current++;
                count+=current;
            }
            else
            {
                current=0;
            }
        }
        return count;
    }
}