class Solution {
    public static final Map<Character,String> keyboard=Map.of(
        '2',"abc",'3',"def",'4',"ghi",'5',"jkl",'6',"mno",'7',"pqrs",'8',"tuv",'9',"wxyz"
    );
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<String>();
        if(digits==null || digits.length()==0)
        {
            return res;
        }
        
        backtrack(digits,res,new StringBuilder());
        return res;

    }
    public void backtrack(String digit,List<String> res,StringBuilder combine)
    {
        if(digit.length()==combine.length())
        {
            res.add(combine.toString());
            return;
        }
        String letters=keyboard.get(digit.charAt(combine.length()));
        for(char c:letters.toCharArray())
        {
            combine.append(c);
            backtrack(digit,res,combine);
            combine.deleteCharAt(combine.length()-1);
        }
    }
}