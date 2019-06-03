
/**
 * Write a description of class SelfDivisor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelfDivisor
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class SelfDivisor
     */
    public static boolean isSelfDivisor(int number)
    {
        String num = number + "" ;
        int[] n = new int[num.length()] ;
        for (int i=0 ; i<num.length() ; i++) {
            int trunk = number/((int) (Math.pow(10, num.length()-1-i))) ;
            for (int k=0 ; k<i ; k++) {
                trunk -= n[k] * ((int) (Math.pow(10, i-k))) ;
            }
            n[i] = trunk ;
        }
        for (int i=0 ; i<num.length() ; i++) {
            if (n[i] == 0) {
                return false ;
            }
            if ((number%n[i]) != 0) {
                return false ;
            }
        }
        return true ;
    }
    
    public static int[] firstNumSelfDivisors(int start, int num)
    {
        int[] divisors = new int[num] ;
        int count = 0 ;
        for (int i=0 ; num>count ; i++) {
            if (isSelfDivisor(start+i)) {
                divisors[count] += start+i ;
                count += 1 ;
            }
        }
        return divisors;
    }
}
