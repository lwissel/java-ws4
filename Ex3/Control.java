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

  // constructor
  public Control(ArrayList<Property> properties) {
    this.properties = properties;
  }

  public ArrayList<Property> getProperties() {
    return this.properties;
  }
  public void setProperties(ArrayList<Property> properties) {
    this.properties = properties;
  }
}
