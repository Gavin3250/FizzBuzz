/**
* Implement a Tetradecagon
*
* @author Gavin Martinez
* @version 2024-01-14
*/
public class Tetradecagon implements Shape
{
  private int side;
  private String color;
  


 /**
   * Constructor for objects of class Tetradecagon 
   */
  public Tetradecagon(int side, String color)
  {
    this.side = side;
    this.color = color;
  }


 /**
   * Get the area
   *
   * @return     returns the area of the Tetradecagon
   */
  public double getArea()
  {
      return ( (14*(side * side))/(4*Math.tan(Math.PI/14))); 
  }


 /**
   * Get the perimeter
   *
   * @return     returns the perimeter of the Tetradecagon
   */
  public double getPerimeter()
  {
    return 14 * side;
  }


 /**
   * Get the color
   *
   * @return     returns the color of the Tetradecagon
   */
  public String getColor()
  {
      return this.color;
  }
  


}