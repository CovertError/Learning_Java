/**
 * Circle.java
 */
public class Circle {      // Student Starter code
   private double radius;    // circle radius

   /**
    * Constructor - Create a new circle
    * @param    inRadius  radius of the circle
    */

   public Circle(double inRadius ) {
      // implement body here
   }

   /**
    * Return the radius of the circle
    * @return    radius of the circle
    */
   public double getRadius() {
      return radius;
   }

   /**
    * set the radius
    * @param newRadius		new radius of the circle
    */
   public void setRadius(double newRadius) {
   	// implement body here
   }

   /**
    * Compute and return the area of the circle
    * @return    the area of the circle
    */
   public double area() {
      return Math.PI * radius * radius;
   }

   /**
    * Stretches circle size by multiplying
    * the radius by the factor provided.
    * @param    factor    stretch factor
    */
   public void stretchBy(double factor ) {
      // implement body here
   }

   /**
    * Return a string representation of a circle.
    * @return    a string representing this circle
    */
   public String toString() {
     // implement body here
   }
}