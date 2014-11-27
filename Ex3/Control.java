/** Excercise 3 WS4 
 *
 * Class for controlling the objects, and printing to html
 *
 * @author  Lennart Wissel
 * @version 27.11.2014
 */
import java.util.*;
import java.io.*;

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

  /**
   * sorting the list by overriding the given compare method for lists
   */
  public void sortPropertiesByLowestPrice() {
    Collections.sort(this.properties, new Comparator<Property>() {
      @Override
      public int compare(Property p1, Property p2) {
        return Double.valueOf(p1.getPayAmount()).compareTo(Double.valueOf(p2.getPayAmount()));
      }
    });
  }


  /** generate html from within the control class
   */
  public void generateHTML() {
    String htmlHeader = "<!DOCTYPE html><html><head><title>Properties</title></head><body>";
    String htmlFooter = "</body></html>";
    String htmlRent = htmlHeader;
    String htmlSale = htmlHeader;
    for (Property p: this.properties) {
      if (p.getType() == 'r') {
        htmlRent += p.toString();
        htmlRent += "<a href=\"" + p.getPicture() + "\"></a><hr>";
      }
      if (p.getType() == 's') {
        htmlSale += p.toString();
        htmlSale += "<a href=\"" + p.getPicture() + "\"></a><hr>";
      }
    }
    htmlRent += htmlFooter;
    htmlSale += htmlFooter;

    try {
      BufferedWriter outRent = new BufferedWriter(new FileWriter("rent.html"));
      BufferedWriter outSale = new BufferedWriter(new FileWriter("sale.html"));
      outRent.write(htmlRent);
      outSale.write(htmlSale);

      outRent.close();
      outSale.close();

    } 
    catch (IOException e) {
      System.out.println("io file problem");
    }
  }
}
