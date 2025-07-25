class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        backtrack(res,n,"",0,0);
        return res;
    }
    public void backtrack(List<String> res,int max,String brac,int open,int close)
    {
        if(open+close==max*2)
        {
            res.add(brac);
            return;
        }
        if(open<max)
        {
            backtrack(res,max,brac+"(",open+1,close);
        }
        if(close<open)
        {
            backtrack(res,max,brac+")",open,close+1);
        }
    }
}