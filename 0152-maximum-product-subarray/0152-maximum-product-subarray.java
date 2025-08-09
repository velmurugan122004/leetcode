class Solution {
    public int maxProduct(int[] nums) {
        int m=Integer.MIN_VALUE,cm=1,cmin=1;
        for (int n : nums) {
            m =max(m, n);
        }
        for(int i=0;i<nums.length;i++)
        {
            int temp=cm*nums[i];
            cm=max(temp,max(cmin*nums[i],nums[i]));
            cmin=min(temp,min(cmin*nums[i],nums[i]));
            m=max(m,cm);
        }
        return m;
    }
    public int max(int i,int j)
    {
        return i>j?i:j;
    }
    public int min(int i,int j)
    {
        return i<j?i:j;
    }
}