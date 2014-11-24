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
  public PatientExtended(String name, int dateOfBirth, char gender) {
    super(name,dateOfBirth,gender);
    this.lastSeen = lastSeen.getInstance();
  }

  // getter
  public Calendar getLastSeen() {
    return this.lastSeen;
  }

  // setter
  public void setLastSeen(Calendar lastSeen) {
    this.lastSeen = lastSeen;
  }
  
  // method that checks whether the patient was seen
  public boolean wasPatientSeenAtOrAfter(Calendar c) {
    if ( c.after(lastSeen) || c.equals(lastSeen) ) {
      return true;
    }
    else {
      return false;
    }
  }
}
// set a date
// Calendar calendar = new GregorianCalendar(2013,10,28);	
// calendar.set(Calendar.YEAR, 2014);
// calendar.set(Calendar.MONTH, 11);
// calendar.set(Calendar.MINUTE, 33);
