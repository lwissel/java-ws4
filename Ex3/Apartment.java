/** Excercise 3 WS4 
 *
 * abstract class for property objects of type apartment
 *
 * @author  Lennart Wissel
 * @version 27.11.2014
 */

public class Apartment extends House {
  // constructor
  public Apartment(char type, int bedrooms, String description, String picture, double payAmount) {
    super(type, bedrooms, description, picture, payAmount);
  }
}
