
/**
 * Write a description of class BatteryCharger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BatteryCharger
{
    private int[] rateTable = {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 80, 60}; 
    
    private int getChargingCost(int startHour, int chargeTime)
    {
        int total = 0 ;
        for (int i=0 ; i<chargeTime ; i++) {
            total += rateTable[(startHour + i)%24] ;
        }
        return total ;
    }
    
    public int getChargeStartTime(int chargeTime)
    {
        int cheapStart = 0 ;
        int cheapCost = 0 ;
        for (int h=0 ; h<24 ; h++) {
            int total = getChargingCost(h, chargeTime) ;
            if (h==0) {
                cheapCost = total ;
            }
            if (total<cheapCost) {
                cheapStart = h ;
                cheapCost = total ;
            }
        }
        return cheapStart ;
    }
}
