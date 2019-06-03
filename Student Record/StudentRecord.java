
/**
 * Write a description of class StudentRecord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRecord
{
    private int[] scores;

    public StudentRecord(int[] vals) {scores = vals;}
    
    private double average(int first, int last)
    {
        int result = 0;
        for (int i=first ; i<last ; i++) {
            result += scores[i] ;
        }
        return (double) result / (last-first) ;
    }

    private boolean hasImproved()
    {
        int val = scores[0] ;
        for (int i=1 ; i<scores.length ; i++) {
            if (val > scores[i]) {
                return false ;
            }
            val = scores[i];
        }
        return true ;
    }
    
    public double finalAverage()
    {
        if (hasImproved()) {
            return average((scores.length/2), scores.length) ;
        }
        return average(0, scores.length) ;
    }
}
