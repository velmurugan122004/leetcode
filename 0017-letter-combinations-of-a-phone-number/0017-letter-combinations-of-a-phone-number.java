class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<String>();
        if(digits==null || digits.length()==0)
        {
            return res;
        }
        Map<Character,String> keyboard=new HashMap<>();
        keyboard.put('2',"abc");
        keyboard.put('3',"def");
        keyboard.put('4',"ghi");
        keyboard.put('5',"jkl");
        keyboard.put('6',"mno");
        keyboard.put('7',"pqrs");
        keyboard.put('8',"tuv");
        keyboard.put('9',"wxyz");
        backtrack(0,digits,res,keyboard,new StringBuilder());
        return res;

    }
    public void backtrack(int index,String digit,List<String> res,Map<Character,String> keyboard,StringBuilder combine)
    {
        if(digit.length()==combine.length())
        {
            res.add(combine.toString());
            return;
        }
        String letters=keyboard.get(digit.charAt(index));
        for(char c:letters.toCharArray())
        {
            combine.append(c);
            backtrack(index+1,digit,res,keyboard,combine);
            combine.deleteCharAt(combine.length()-1);
        }
    }
}