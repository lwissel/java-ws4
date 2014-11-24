/** Exercise 1 WS4 Computer Workshop ICY
 *
 * class Patient representating a patient with name, birth, gender and respective standard methods
 * contains exception handling for the gender type
 *
 * @author  Lennart Wissel
 * @version 24.11.2014
 */

public class Patient {

  // field variables
  private String name;
  private int dateOfBirth; // expect format ddmmyyyy
  private char gender; // only allow M or F

  // constructor
  public Patient(String name, int dateOfBirth, char gender) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    
    // throw expection if gender is not M or F
    if (gender == 'M' || gender == 'F') {
      this.gender = gender;
    }
    else {
      throw new IllegalArgumentException("In Constructor: Gender is not M or F but was: " + gender);
    }
  }


  // getters
  public String getName() {
    return this.name;
  }
  public int getDateOfBirth() {
    return this.dateOfBirth;
  }
  public char getGender() {
    return this.gender;
  }

  // setters
  public void setName(String name) {
    this.name = name;
  }
  public void setDateOfBirth(int dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  public void setGender(char gender) {
    // throw expection if gender is not M or F
    if (gender == 'M' || gender == 'F') {
      this.gender = gender;
    }
    else {
      throw new IllegalArgumentException("In Setter: Gender is not M or F but was: " + gender);
    }
  }

  // toString
  public String toString() {
    return this.name + " " + this.dateOfBirth + " " + this.gender;
  }

  // equals
  public boolean equals(Patient p) {
    if ( (p.getName().equals(this.name)) && (p.getDateOfBirth() == this.dateOfBirth) && (p.getGender() == this.gender)) {
      return true;
    }
    else {
      return false;
    }
  }


  public static void main(String[] args) {
    Patient p1 = new Patient("Lennart", 24031990, 'M');
    System.out.println(p1.toString());
  }
}
