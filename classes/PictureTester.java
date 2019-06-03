 

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testGrayscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  public static void testFixUnderwater()
  {
    Picture beach = new Picture("water.jpg");
    beach.explore();
    beach.fixUnderwater();
    beach.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorHorizontal();
    redMotorcycle.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorHorizontalBotToTop();
    redMotorcycle.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture redMotorcycle = new Picture("beach.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorDiagonal();
    redMotorcycle.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture redMotorcycle = new Picture("snowman.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorArms();
    redMotorcycle.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture redMotorcycle = new Picture("seagull.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorGull();
    redMotorcycle.explore();
  }
  
 
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCollage2()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage2();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    testFixUnderwater();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalBotToTop();
    // testMirrorVertical();
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    testMirrorDiagonal();
    testCollage();
    testCollage2();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}