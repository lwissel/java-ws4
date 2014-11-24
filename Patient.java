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
    this.gender = gender;
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
}
