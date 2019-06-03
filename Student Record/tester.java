
/**
 * Write a description of class tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tester
{
    public static void main(String[] args)
    {
        int[] vals = {50,50,20,80,53} ;
        StudentRecord grades = new StudentRecord(vals) ;
        System.out.println(grades.finalAverage()) ;
        int[] vals2 = {20,50,50,53,80} ;
        StudentRecord grades2 = new StudentRecord(vals2) ;
        System.out.println(grades2.finalAverage()) ;
        int[] vals3 = {20,50,50,80} ;
        StudentRecord grades3 = new StudentRecord(vals3) ;
        System.out.println(grades3.finalAverage()) ;
        
    }
}
