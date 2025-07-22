class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int maxsum=0,k1=0;
        int n[]=new int[nums.length-k+1];
        Deque<Integer> dq=new LinkedList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!dq.isEmpty() && dq.peek()<i-k+1)
            {
                dq.poll();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])
            {
                dq.pollLast();
            }
            dq.offer(i);

            if(i>=k-1)
            {
                n[k1++]=nums[dq.peekFirst()];
            }
        }
        return n;
    }
}
