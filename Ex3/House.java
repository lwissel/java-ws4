/** Excercise 3 WS4 
 *
 * abstract class for property objects of type house
 *
 * @author  Lennart Wissel
 * @version 27.11.2014
 */

public class House extends Property {
  private double rAmount;
  private double sAmount;
  
  /** full constructor to be extended in case
   * @param type s ellable or r entable
   * @param bedrooms number of bedrooms
   * @param description what it says
   * @param picture string containing the filepath
   * @param payAmount is the money, value, rent whatever referring to the object
   */
  public House(char type, int bedrooms, String description, String picture, double payAmount) {
    super(type, bedrooms, description, picture, payAmount);
  }

  @Override
    public double rentAmount() {
      if (this.getType() == 'r') {
        return this.getPayAmount();
      }
      else {
        return 0.0;
      }
    }

  @Override
    public double askingPrize() {
      if (this.getType() == 's') {
        return this.getPayAmount();
      }
      else {
        return 0.0;
      }
    }
}
