/**
 * Represents a single position in a maze of characters.
 *
 * @author Lewis and Chase
 * @version 4.0
 */
public class Position implements Comparable <Position> {
  private int x; 
  private int y;
  private int distance;

  /**
   * Constructs a position and sets the x & y coordinates to 0,0.
   */
  Position (){
    x = 0;
    y = 0;
    distance = 0;
  }

  

  /**
   * Returns the x-coordinate value of this position.
   * @return the x-coordinate of this position
   */
  public int getx(){
    return x;
  }

  /**
   * Returns the y-coordinate value of this position.
   * @return the y-coordinate of this position
   */
  public int gety(){
    return y;
  }

  public int getdistance(){
    return distance;
  }

  /**
   * Sets the value of the current position's x-coordinate.
   * @param a value of x-coordinate
   */
  public void setx(int a){
    x = a;
  }

  /**
   * Sets the value of the current position's x-coordinate.
   * @param a value of y-coordinate
   */ 
  public void sety(int a){
    y = a;
  }

  public void setDistance (int d){
    distance = d;
  }

  public int compareTo(Position p){
    return this.distance - p.distance;
  }

}
