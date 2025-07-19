class Solution {
    public String intToRoman(int num) {
        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String roman[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String s=new String();
        int i=0;
        while(num!=0 && i<values.length)
        {
            if(num>=values[i])
            {
                num-=values[i];
                s+=roman[i];
                
            }
            else
            {
                i++;
                //increment;
            }
        }
        return s;
        
    }
}
