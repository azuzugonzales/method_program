package by.bsu.tasks.t3;

import java.math.BigInteger;

public class factorial1 {
    public static void main(String args[])
    {
        BigInteger ans = new BigInteger("1");
        for (int i = 1; i <= 100; i++)
        {
            ans = ans.multiply(new BigInteger(new Integer(i).toString()));
        }

        long sum = 0;
        String s = ans.toString();
        for (int i = 0; i < s.length(); i++)
        {
            sum = sum + Long.parseLong("" + s.charAt(i));
        }
        System.out.print(sum);
    }

}
