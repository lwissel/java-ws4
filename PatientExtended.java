/** Excercise 1b WS4
 *
 * PatientExtended class to extend the patient class
 *
 * @author  Lennart Wissel
 * @version 24.11.2014
 */
import java.util.Calendar;

public class PatientExtended extends Patient {
  private Calendar lastSeen;

  // constructor
  public PatientExtended(String name, int dateOfBirth, char gender, Calendar lastSeen) {
    super(name,dateOfBirth,gender);
    this.lastSeen = lastSeen;
  }

  // getter
  public Calendar getLastSeen() {
    return this.lastSeen;
  }

  // setter
  public void setLastSeen(Calendar lastSeen) {
    this.lastSeen = lastSeen;
  }
}
