class Solution {
    public int maxArea(int[] height) {
        int L=0,R=height.length-1;
        int max=0,cmax=0;
        while(L<R)
        {
            if(height[L]>height[R])
            {
                cmax=(R-L)*height[R];
                R--;
            }
            else
            {
                cmax=(R-L)*height[L];
                L++;
            }
            max=Math.max(cmax,max);
        }
        return max;
        
    }
}