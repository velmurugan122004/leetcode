class Solution {
    public boolean isNumber(String s) {
        int i=0;
        boolean number=false;
        boolean dot=false;
        boolean expo=false;
        while(i<s.length())
        {
            char c=s.charAt(i);
            if(c>='0' && c<='9')
            {
                number=true;
            }
            else if(c=='.')
            {
                if(dot|| expo)return false;
                dot=true;
            }
            else if(c=='+' || c=='-')
            {
                if(i>0 && s.charAt(i-1)!='E' && s.charAt(i-1)!='e')
                {
                    return false;
                }
            }
            else if(c=='e' || c=='E')
            {
                if(expo || !number) return false;
                expo=true;
                number=false;
            }
            else
            {
                return false;   
            }
            i++;
            
        }
        return number;
    }
}