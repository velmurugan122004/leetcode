class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length<3)
        {
            return 0;
        }
        Arrays.sort(nums);
        int closestSum=nums[0]+nums[1]+nums[2];
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            int l=i+1;
            int r=n-1;
            while(l<r)
            {
                int max=nums[i]+nums[l]+nums[r];
                if(Math.abs(target-max)<Math.abs(target-closestSum))
                {
                    closestSum=max;
                }

                if(max==target)
                {
                    return target;
                }
                else if(max>target)
                {
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return closestSum;
    }
}