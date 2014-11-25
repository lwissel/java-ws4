/** Excercise 1b WS4
 *
 * PatientExtended class to extend the patient class
 *
 * @author  Lennart Wissel
 * @version 24.11.2014
 */
import java.util.*;

public class PatientExtended extends Patient {
  private Calendar lastSeen;

  /** full constructor
   * @param name Name of patient
   * @param dateOfBirth birthday
   * @param gender M or F
   */
  public PatientExtended(String name, int dateOfBirth, char gender) {
    super(name,dateOfBirth,gender);
    this.lastSeen = lastSeen.getInstance();
  }

  /** Getter
   * @return calendar object of patient
   */
  public Calendar getLastSeen() {
    return this.lastSeen;
  }

  /** Setter
   * @param lastSeen Calendar object
   */
  public void setLastSeen(Calendar lastSeen) {
    this.lastSeen = lastSeen;
  }
  
  public static void main (String[] args) {

    // our list containing all patientextended patients
    ArrayList<PatientExtended> pList = new ArrayList<PatientExtended>();

    // example patients
    PatientExtended p1 = new PatientExtended("h",123,'M');
    PatientExtended p2 = new PatientExtended("a",123,'F');
    PatientExtended p3 = new PatientExtended("n",123,'M');
    PatientExtended p4 = new PatientExtended("s",123,'F');

    // register them to the array list
    pList.add(p1);
    pList.add(p2);
    pList.add(p3);
    pList.add(p4);

    // nothing printed here
    listPatientExtendedNotSeenAYear(pList);

    // now set the calendar date one year and one day back
    Calendar c = Calendar.getInstance();
    c.set(Calendar.YEAR, 2013);
    c.set(Calendar.DAY_OF_MONTH,c.get(Calendar.DAY_OF_MONTH)-1);

    // and update the date
    p1.setLastSeen(c);
    p2.setLastSeen(c);
    p3.setLastSeen(c);

    // here we get p1 p2 p3 printed
    listPatientExtendedNotSeenAYear(pList);
  }

  /** method to print all patients not seen for a year
   * @param pList ArrayList of patientextended objects
   */
  public static void listPatientExtendedNotSeenAYear(ArrayList<PatientExtended> pList) {
    Calendar c = Calendar.getInstance();
    c.set(Calendar.YEAR,c.get(Calendar.YEAR)-1);

    for(PatientExtended p: pList) {
      if (p.getLastSeen().before(c)) { System.out.println(p); }
    }
  }
  
}
