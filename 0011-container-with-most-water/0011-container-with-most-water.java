class Solution {
    public int maxArea(int[] height) {
        int L=0,R=height.length;
        int max=0,cmax=0;
        while(L<R)
        {
            if(height[L]>height[R-1])
            {
                cmax=(R-L-1)*height[R-1];
                R--;
            }
            else
            {
                cmax=(R-L-1)*height[L];
                L++;
            }
            max=Math.max(cmax,max);
        }
        return max;
        
    }
}