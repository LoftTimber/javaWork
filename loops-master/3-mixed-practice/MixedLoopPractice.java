/*
 * APCS-A - Mixed Loop Practice
 *
 * This program is to give you practice writing methods that use for loops. Your
 * task is to study the code and output for methods that I have completed. Then 
 * you should complete and test the methods that are incomplete or missing. 
 *
 *  1) oneToThirtyF    - uses a for loop to print the set {1, 2, 3, ... , 30}.
 *
 *  2) oneToThirtyW    - uses a while loop to print the set {1, 2, 3, ... , 30}.
 *
 *  3) twentyToZeroF   - uses a for loop to print the set {20, 18, 16, ... , 0}.
 *
 *  4) twentyToZeroW   - uses a while loop to print the set {20, 18, 16, ... , 0}.
 *
 *  5) countMtoN       - uses a while loop to print the set {m, m+1, m+2, ... , n}.
 *
 *  6) sumN            - uses a while loop to find and return the sum of the first 
 *                       n positive integers. 
 *                       
 *  7) perfectSquaresF - uses a for loop to print the first n perfect squares.
 *
 *  8) sumSquaresW     - uses a while loop find and return the sum of the first n 
 *                       perfect squares.
 *
 *  9) iLoveJava       - uses a while loop to print the sentence "I love java." n
 *                       times.
 *
 * 10) divBy2and9      - uses a for loop to count from 1 to 100 by ones, but only
 *                       values that are evenly divisible by 2 and 9 are printed.
 *                       (you'll need to use an if statement.)
 *
 * 11) divBy3and8      - uses a while loop to count from 1 to 100 by ones, but only
 *                       values that are evenly divisible by 3 and 8 are printed.
 *                       (you'll need to use an if statement.)
 *
 * 12) divBy5or7Sum    - uses a while loop to find and return the sum of all values in 
 *                       the set {1, 2, 3, ... , 10000} that are divisible by 5 or 7.
 *
 * 13) fizzBuzz        - uses a while loop to count from 1 to n by ones. However,
 *                       if a number is divisible by 3, the word "bizz" should be 
 *                       printed, and if the number is divisible by 5, "buzz" should
 *                       be printed. Sample output:
 *
 *                       1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, 
 *                       Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, ...
 *                       
 * 14) sumDigits       - finds and return the sum of the digits in an int.
 *
 * 15) countEvens      - finds and returns the number of even digits in an int.
 *
 * 16) hasDigit        - return true if a number n contains the digit d and false otherwise.
 *
 * 17) hasMoreEvens    - returns true if a number n has more even digits than odd digits
 *                       and false otherwise.
 *
 *  ------------------------------------------------------------------------------
 *
 * @author  your name 
 * @version date
 */
 
 public class MixedLoopPractice
 {
    public static void oneToThirtyF()
    {
        for(int i=1 ; i<=30 ; i++) {
            System.out.print(i + " ") ;
        }
        System.out.println() ;
    }
    
    public static void oneToThirtyW()
    {
        int i = 1 ;
        while(i <= 30) {
            System.out.print(i + " ") ;
            i++ ;
        }
        System.out.println() ;
    }
     
    public static void twentyToZeroF()
    {
        for(int i=20 ; i>=0 ; i-=2) {
            System.out.print(i + " ") ;
        }
        System.out.println() ;
    }
    
    public static void twentyToZeroW()
    {
        int i = 20 ;
        while(i >= 0) {
            System.out.print(i + " ") ;
            i-=2 ;
        }
        System.out.println() ;
    }
    
    public static void countMtoN(int m, int n)
    {
        while(m<=n) {
            System.out.print(m + " ") ;
            m++ ;
        }
        System.out.println() ;
    }
    
    public static void sumN(int m, int n)
    {
        int sum = 0 ;
        while(m<=n) {
            if (m > 0) {
                sum += m ;
            }
            m++ ;
        }
        System.out.println(sum) ;
    }
    
    public static void perfectSquaresF(int m, int n)
    {
        int perfect = 0 ;
        for(m=m ; m<=n ; m++) {
            if ((double) Math.sqrt(m) == (int) Math.sqrt(m) && (perfect == 0)) {
                perfect = m ;
            }
        }
        System.out.println(perfect) ;
    }
    
    public static void sumSquaresW(int m, int n)
    {
        int sum = 0 ;
        while(m<=n) {
            if ((double) Math.sqrt(m) == (int) Math.sqrt(m)) {
                sum += m ;
            }
            m++ ;
        }
        System.out.println(sum) ;
    }
    
    public static void iLoveJava(int n)
    {
        while(n>0) {
            System.out.print("I love java. ") ;
            n-- ;
        }
        System.out.println() ;
    }
    
    public static void divBy2and9()
    {
        for(int i = 1 ; i<=100 ; i++) {
            if (i%2 == 0 && i%9 == 0) {
                System.out.print(i + " ") ;
            }
        }
        System.out.println() ;
    }
    
    public static void divBy3and8()
    {
        int i = 1 ;
        while(i<=100) {
            if (i%3 == 0 && i%8 == 0) {
                System.out.print(i + " ") ;
            }
            i++ ;
        }
        System.out.println() ;
    }
    
    public static void divBy5or7Sum()
    {
        int i = 1 ;
        int sum = 0 ;
        while(i<=10000) {
            if (i%5 == 0 || i%7 == 0) {
                sum += i ;
            }
            i++ ;
        }
        System.out.println(sum) ;
    }
    
    public static void fizzBuzz(int n)
    {
        int i = 1 ;
        while(i<=n) {
            if (i%3 == 0) {
                System.out.print("Fizz") ;
            }
            if (i%5 == 0) {
                if (i%3 == 0) {
                    System.out.print(" ") ;
                }
                System.out.print("Buzz") ;
            }
            if (!(i%3 == 0 || i%5 == 0)) {
                System.out.print(i) ;
            }
            if (i<n) {
                System.out.print(", ") ;
            }
            i++ ;
        }
        System.out.println() ;
    }
    
    // public static void sumDigits(int n)
    // {
        // int sum = 0 ;
        // int num = n ;
        // int len = 0 ;
        // while (num > 0) {
            // num /= 10 ;
            // len += 1 ;
        // }
        // while (len > 0) {
            // sum += n / (Math.pow(10, len-1)) ;
            // n /= 10 ;
            // len -= 1 ;
        // }
        // System.out.println(sum) ;
    // }
    // keep making methods here
    
    
    public static void main(String[] args)
    {
        oneToThirtyF();
        oneToThirtyW();
        twentyToZeroF();
        twentyToZeroW();
        countMtoN(-100, 100);
        sumN(-10, 3);
        perfectSquaresF(5, 100);
        sumSquaresW(0, 10);
        iLoveJava(3);
        divBy2and9();
        divBy3and8();
        divBy5or7Sum();
        fizzBuzz(1000);
        // sumDigits(10);
        
        // test your methods here
    }
 }
 
