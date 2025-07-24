class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int length=nums.length;
        // if(length==3)
        // {
        //     return 1;
        // }
        int count=0,dif;
        for(int i=0;i<length-2;i++)
        {
            dif=nums[i+1]-nums[i];
            for(int j=i+2;j<length;j++)
            {
                if(dif==nums[j]-nums[j-1])
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
        }
        return count;
    }
}