/** Excercise 3 WS4 
 *
 * abstract class for property objects
 *
 * @author  Lennart Wissel
 * @version 27.11.2014
 */

public abstract class Property implements Rentable, Sellable {
  // interface methods
  public abstract double rentAmount();
  public abstract double askingPrice();

  // field variables for all properties
  private char type;  // limits us to all char types
  private int bedrooms;
  private String description;
  private String picture;
  private double payAmount;

  /** full constructor to be extended in case
   * @param type s ellable or r entable
   * @param bedrooms number of bedrooms
   * @param description what it says
   * @param picture string containing the filepath
   * @param payAmount is the money, value, rent whatever referring to the object
   */
  public Property(char type, int bedrooms, String description, String picture, double payAmount) {
    validateAndSetType(type);
    this.type = type;
    this.bedrooms = bedrooms;
    this.description = description;
    this.picture = picture;
    this.payAmount = payAmount;
  }

  /** throw exception if type is not accepted
   * @param type of r or s
   */
  private void validateAndSetType(char type) {
    // throw expection if gender is not s or r
    if (type == 's' || type == 'r') {
      this.type = type;
    }
    else {
      throw new IllegalArgumentException("type is not r or s but was: " + type);
    }
  }

  /** GETTERS
   * @return type indicates whether for sell or for rent
   */
  protected char getType() {
    return this.type;
  }
  /**
   * @return number of bedrooms in property
   */
  protected int getBedrooms() {
    return this.bedrooms;
  }
  /**
   * @return description of property
   */
  protected String getDescription() {
    return this.description;
  }
  /**
   * @return path of picture
   */
  protected String getPicture() {
    return this.picture;
  }
  /**
   * @return any money associated with the property
   */
  protected double getPayAmount() {
    return this.payAmount;
  }

  /** SETTERS
   * @param type char type of object
   */
  protected void setType(char type) {
    validateAndSetType(type);
  }
  /**
   * @param bedrooms number of bedrooms
   */
  protected void setBedrooms(int bedrooms) {
    this.bedrooms = bedrooms;
  }
  /**
   * @param description text about property
   */
  protected void setDescription(String description) {
    this.description = description;
  }
  /**
   * @param picture path to picture
   */
  protected void setPicture(String picture) {
    this.picture = picture;
  }
  /**
   * @param payAmount set money
   */
  protected void setPayAmount(double payAmount) {
    this.payAmount = payAmount;
  }

  /** override toString
   * @return some object information
   */
  @Override
   public String toString() {
     return "Type: " + this.type + ", Bedrooms: " + this.bedrooms + ", Price: " + this.payAmount + ", Text: " + this.description;
   }

  /** override equals
   * @return true if object properties are the same but not the image!
   * @param p property to test against
   */
  public boolean equals(Property p) {
    if(p == null) {
      return false;
    }
    if (this.type == p.getType() && this.bedrooms == p.getBedrooms() && (Math.abs(this.payAmount - p.getPayAmount()) <= 0.001)) {
      return true;
    }
    else {
      return false;
    }
  }
}
