
/**
 * Write a description of class runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Arrays;

public class Tester
{
    public static void main(String[] args)
    {
        System.out.println(SelfDivisor.isSelfDivisor(128)) ;
        int[] answer = SelfDivisor.firstNumSelfDivisors(10, 3);
        System.out.println(Arrays.toString(answer));
    }
}
