/** Excercise 3 WS4 
 *
 * Class for controlling the objects, and printing to html
 *
 * @author  Lennart Wissel
 * @version 27.11.2014
 */
import java.util.*;

public class Control {
  private ArrayList<Property> properties;

  /** full constructor
   * @param properties list of properties
   */
  public Control(ArrayList<Property> properties) {
    this.properties = properties;
  }

  /** GETTER
   * @return list of properties
   */
  public ArrayList<Property> getProperties() {
    return this.properties;
  }
  /** SETTER
   * @param properties list
   */
  public void setProperties(ArrayList<Property> properties) {
    this.properties = properties;
  }

  // MISC#

  public void sortPropertiesByLowestPrice() {
    Collections.sort(this.properties, new Comparator<Property>() {
      @Override
      public int compare(Property p1, Property p2) {
        return Double.valueOf(p1.getPayAmount()).compareTo(Double.valueOf(p2.getPayAmount()));
      }
    });
  }
}
