/** Excercise 3 WS4
 *
 * Runner class for testing
 * 
 * @author  Lennart Wissel
 * @version 27.11.2014
 */
import java.util.*;

public class Runner {
  public static void main(String[] args) {
    House h1 = new House('s',1,"First House","path/to/file.png",2);
    Apartment a1 = new Apartment('s',1,"First Apartment","path/to/file.png",1);

    ArrayList<Property> props = new ArrayList<Property>();
    props.add(h1);
    props.add(a1);

    Control run = new Control(props);
    run.sortPropertiesByLowestPrice();
    run.generateHTML();
  }
}
