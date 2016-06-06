package by.bsu.tasks.t3;

import java.math.BigInteger;

public class Factorial {
    public static void main(String args[])
    {
        long start_time= System.currentTimeMillis();
        BigInteger data= new BigInteger("1");
        for(int index=1;index<=100;++index)
            data= data.multiply(new BigInteger(index+""));
        String str=data.toString();

        long sum=0;

        for(int index=0;index<=str.length()-1;++index)
            sum+=Integer.parseInt(str.substring(index,index+1));

        System.out.println("The sum of the digits in the number 100! :"+sum);
        System.out.println("Total time taken:"+ ((System.currentTimeMillis()-start_time)/1000)+"sec");

    }
}
