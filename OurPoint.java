/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourpoint;

/**
 *
 * @author gagandeep gahir
 */
/**
 * This class provides various routines to
 * manipulate points in the coordinate plane (x, y).
 */
import java.util.Scanner;
public class OurPoint {

//----------------------------------
//    Data Members
//----------------------------------
  
  /**
   * The x coordinate of a point
   */
    double xCoord;
   
  /**
   * The y coordinate of a point
   */
    private double yCoord;

//----------------------------------
//    Constructors
//----------------------------------
                                
   /**
    * Default constructor
    */
   public OurPoint( ) {
       
       xCoord = 0;
       yCoord = 0;
   }
   public OurPoint(Double x, Double y ) {
       
       xCoord = x;
       yCoord = y;
   }

    

   
//-------------------------------------------------
//      Public Methods:
// 
//          void setX  ( double );
//          void setY  ( double );
//          double getX ( double );
//          double getY ( double );
//------------------------------------------------
   
   /**
    * Changes the value of the x-coordinate of a point
    * 
    * 
    * @param x the new value for the x-coordinate of this point
    */
   public void setX (double x) {
       xCoord = x;
   }

   /**
    * Changes the value of the y-coordinate of a point
    * 
    * @param y the new value for the x-coordinate of this point
    */
   public void setY (double y) {
       yCoord=y;
   }

   /**
    * Returns the x-coordinate of a point
    * 
    * @return the x-coordinate of this point
    */
   public double getX () {
       return xCoord;
   }

   /**
    * Returns the y-coordinate of a point
    * 
    * @return the y-coordinate of this point
    */
   public double getY () {
       
       return yCoord;
   }
    

  
   public static void main (String [] args)  {
       Scanner sc = new Scanner(System.in);
       System.out.println( "enter a: ");
      double a=sc.nextDouble();
      System.out.println( "enter b: ");
      double b=sc.nextDouble();
      OurPoint p  = new OurPoint (); // Coordinates of p are (0,0)
      OurPoint q  = new OurPoint (a,b); // Coordinates of q are (-5, -12)
      double xDiff; // the difference of the x values
      double yDiff; // the difference of the y values
      double distance; // the distance between the points

      xDiff  = p.getX() - q.getX();
      yDiff  = p.getY() - q.getY();
      distance = Math.sqrt (xDiff * xDiff + yDiff * yDiff);
      System.out.println( "Distance is: " + 
                           distance);
      
      System.out.println( "Distance from (0,0) to (a, b) is: " + 
                           distance);
      System.out.println( "enter c: ");
      double c=sc.nextDouble();
      System.out.println( "enter d: ");
      double d=sc.nextDouble();
      q.setX(c);
      q.setY(d);

      xDiff  = p.getX() - q.getX();
      yDiff  = p.getY() - q.getY();
      distance = Math.sqrt (xDiff * xDiff + yDiff * yDiff);

      System.out.println( "Distance from c to d is: " + 
                           distance);
   }
   

}
