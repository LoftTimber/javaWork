
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
        BatteryCharger charger = new BatteryCharger() ;
        System.out.println(charger.getChargeStartTime(1)) ;
        System.out.println(charger.getChargeStartTime(2)) ;
        System.out.println(charger.getChargeStartTime(7));
        System.out.println(charger.getChargeStartTime(30)) ;
    }
}
