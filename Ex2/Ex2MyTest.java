import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;


public class Ex2MyTest {
  
  /**
   * Test 1 setters and equals
   */
  @Test
    public void ex2Test1() {
        Company c0 = new Company("a", "http://a", 2000000);

        HourlyEmployee he1 = new HourlyEmployee("h","z","n1", "1", "1000");
        HourlyEmployee he2 = new HourlyEmployee("a","z","n2", "2", "2000");
        HourlyEmployee he3 = new HourlyEmployee("n","z","n3", "3", "3000");
        HourlyEmployee he4 = new HourlyEmployee("s","z","n4", "4", "4000");

        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(he1);
        employees.add(he2);
        employees.add(he3);
        employees.add(he4);

    }
}
