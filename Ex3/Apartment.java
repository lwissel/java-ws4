/** Excercise 3 WS4 
 *
 * abstract class for property objects of type apartment
 *
 * @author  Lennart Wissel
 * @version 27.11.2014
 */

public class Apartment extends House {
  /** full constructor to be extended in case
   * @param type s ellable or r entable
   * @param bedrooms number of bedrooms
   * @param description what it says
   * @param picture string containing the filepath
   * @param payAmount is the money, value, rent whatever referring to the object
   */
  public Apartment(char type, int bedrooms, String description, String picture, double payAmount) {
    super(type, bedrooms, description, picture, payAmount);
  }
}
