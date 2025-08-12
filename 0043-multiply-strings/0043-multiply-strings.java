import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n1 = integer(num1, BigInteger.ZERO, 0);
        BigInteger n2 = integer(num2, BigInteger.ZERO, 0);
        BigInteger n3 = n2.multiply(n1);
        return inttostring(n3);
    }

    public BigInteger integer(String s1, BigInteger num, int i) {
        num = num.multiply(BigInteger.TEN).add(BigInteger.valueOf(s1.charAt(i) - '0'));
        i++;
        return i < s1.length() ? integer(s1, num, i) : num;
    }

    public String inttostring(BigInteger num) {
        boolean isNegative = false;
        if (num.compareTo(BigInteger.ZERO) < 0) {
            isNegative = true;
            num = num.negate();
        }
        StringBuilder sb = new StringBuilder();
        if (num.equals(BigInteger.ZERO)) {
            return "0";
        }
        while (num.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] divRem = num.divideAndRemainder(BigInteger.TEN);
            char digit = (char) ('0' + divRem[1].intValue());
            sb.append(digit);
            num = divRem[0];
        }
        if (isNegative) {
            sb.append('-');
        }
        sb.reverse();
        return sb.toString();
    }
}
