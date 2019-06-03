
/**
 * Write a description of class starPatterns here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class starPatterns
{
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void numBox(int h, int w)
    {
        for (int col=0 ; col<h ; col++) {
            for (int row=0 ; row<w ; row++) {
                System.out.print(col+""+row+" ") ;
            }
            System.out.println("") ;
        }
    }
    public static void starBox(int h, int w)
    {
        for (int col=0 ; col<h ; col++) {
            for (int row=0 ; row<w ; row++) {
                if (row == 0 || row == h-1 || col == 0 || col == w-1) {
                    System.out.print("*") ;
                }
                else {
                    System.out.print(" ") ;
                }
            }
            System.out.println("") ;
        }
    }
    public static void starX(int h)
    {
        for (int col=0 ; col<h ; col++) {
            for (int row=0 ; row<h ; row++) {
                if (row == col || row + col == h-1) {
                    System.out.print("*") ;
                }
                else {
                    System.out.print(" ") ;
                }
            }
            System.out.println("") ;
        }
    }
    public static void starZ(int h)
    {
        for (int col=0 ; col<h ; col++) {
            for (int row=0 ; row<h ; row++) {
                if (col == 0 || col == h-1 || row + col == h-1) {
                    System.out.print("*") ;
                }
                else {
                    System.out.print(" ") ;
                }
            }
            System.out.println("") ;
        }
    }
    public static void starXBox(int h)
    {
        for (int col=0 ; col<h ; col++) {
            for (int row=0 ; row<h ; row++) {
                if (row == 0 || row == h-1 || col == 0 || col == h-1 || 
                    row == col || row + col == h-1) {
                    System.out.print("*") ;
                }
                else {
                    System.out.print(" ") ;
                }
            }
            System.out.println("") ;
        }
    }
    public static void twoStarBoxes(int h)
    {
        for (int col=0 ; col<h ; col++) {
            for (int row=0 ; row<h ; row++) {
                if (row >= h/2 && col >= h/2 || row+1 <= h/2 && col+1 <= h/2) {
                    System.out.print("*") ;
                }
                else {
                    System.out.print(" ") ;
                }
            }
            System.out.println("") ;
        }
    }
    public static void starTriangle(int h)
    {
        for (int col=0 ; col<h ; col++) {
            for (int row=0 ; row<h ; row++) {
                if (row <= col) {
                    System.out.print("*") ;
                }
                else {
                    System.out.print(" ") ;
                }
            }
            System.out.println("") ;
        }
    }
    public static void emptyTriangle(int h)
    {
        for (int col=0 ; col<h ; col++) {
            for (int row=0 ; row<h ; row++) {
                if (row == 0 || col == h-1 || row == col) {
                    System.out.print("*") ;
                }
                else {
                    System.out.print(" ") ;
                }
            }
            System.out.println("") ;
        }
    }
    public static void starTriangleUR(int h)
    {
        for (int col=0 ; col<h ; col++) {
            for (int row=0 ; row<h ; row++) {
                if (row >= col) {
                    System.out.print("*") ;
                }
                else {
                    System.out.print(" ") ;
                }
            }
            System.out.println("") ;
        }
    }
    public static void isoscelesStarTriangle(int h)
    {
        for (int col=0 ; col<h ; col++) {
            for (int row=0 ; row<h*2 ; row++) {
                if (row + col >= (h-1) && row <= col) {
                    System.out.print("*") ;
                }
                else {
                    System.out.print(" ") ;
                }
            }
            System.out.println("") ;
        }
    }
    public static void checkBoard(int h)
    {
        boolean toggle = true ;
        for (int col=0 ; col<h ; col++) {
            for (int row=0 ; row<h ; row++) {
                if (toggle) {
                    System.out.print("*") ;
                }
                else {
                    System.out.print(" ") ;
                }
                toggle = !toggle ;
            }
            if (col%2 == 0) {
                toggle = false ;
            }
            else {
                toggle = true ;
            }
            System.out.println("") ;
        }
    }
    public static void biggerCheckBoard(int h)
    {
        boolean toggle = true ;
        for (int col=0 ; col<h ; col++) {
            for (int row=0 ; row<h ; row++) {
                if (toggle) {
                    System.out.print("*") ;
                }
                else {
                    System.out.print(" ") ;
                }
                if ((row+1)%3 == 0) {
                    toggle = !toggle ;
                }
            }
            if ((col+1)%6 >= 3) {
                toggle = false ;
            }
            else {
                toggle = true ;
            }
            System.out.println("") ;
        }
    }
    public static void upsideDownCheckeredTriangle(int h)
    {
        boolean toggle = true ;
        for (int col=0 ; col<h ; col++) {
            for (int row=0 ; row<h*2 ; row++) {
                if ((row + col <= (h-1) && row >= col) && toggle) {
                    System.out.print("*") ;
                }
                else {
                    System.out.print(" ") ;
                }
                toggle = !toggle ;
            }
            if (col%2 == 0) {
                toggle = false ;
            }
            else {
                toggle = true ;
            }
            System.out.println("") ;
        }
    }
    public static void primeStars(int h)
    {
        
        for (int col=0 ; col<h ; col++) {
            boolean prime = true ;
            if (col == 1) {
                prime = false ;
            }
            if (col == 2) {
                prime = true ;
            }
            else if (col % 2==0) {
                prime = false ;
            }
            else {
                for (int i=3; i<=col; i+=2) {
                    if (col % i == 0 && col != i) {
                        prime = false ;
                    }
                }
            }
            if (prime) {
                for (int i=0 ; i<col ; i++) {
                    System.out.print("*") ;
                }
                System.out.println("") ;
            }
        }
    }
}

