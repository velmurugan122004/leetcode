class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lmax=height[l];
        int rmax=height[r];
        int waterStored=0;
        while(l<r){
            if(height[l]<height[r]){
                lmax=Math.max(lmax,height[l]);
                waterStored+=lmax-height[l];
                l++;
            }
            else{
                rmax=Math.max(rmax,height[r]);
                waterStored+=rmax-height[r];
                r--;
            }
        }
        return waterStored;
    }
}