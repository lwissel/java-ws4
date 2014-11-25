import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;


public class Ex2MyTest {

  private Company c0;
  private HourlyEmployee he1, he2, he3, he4;
  private SalariedEmployee se1, se2, se3, se4;
  private ArrayList<Employee> employees;
  
  @Before 
    public void setUp() {
        c0 = new Company("a", "http://a", 2000000);

        he1 = new HourlyEmployee("h","z","n1", 1, 1000);
        he2 = new HourlyEmployee("a","z","n2", 2, 2000);
        he3 = new HourlyEmployee("n","z","n3", 3, 3000);
        he4 = new HourlyEmployee("s","z","n4", 4, 4000);

        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(he1);
        employees.add(he2);
        employees.add(he3);
        employees.add(he4);

        se1 = new SalariedEmployee("h","a","n1", 1, 1000, 10);
        se2 = new SalariedEmployee("a","a","n1", 2, 2000, 20);
        se3 = new SalariedEmployee("n","a","n1", 3, 3000, 30);
        se4 = new SalariedEmployee("s","a","n1", 4, 4000, 40);

        employees.add(se1);
        employees.add(se2);
        employees.add(se3);
        employees.add(se4);

        c0.setEmployees(employees);
        c0.increaseSalaries(0.5);
  }

  /**
   * Tests of increaseSalaries
   */
  @Test
    public void ex2Test1() {
        assertEquals(he1.getHourlySalary(),1500,0.001);
    }
  @Test
    public void ex2Test2() {
        assertEquals(se1.paymentAmount(),1500,0.001);
    }
  @Test
    public void ex2Test3() {
        assertEquals(he2.getHourlySalary(),3000,0.001);
    }
  @Test
    public void ex2Test4() {
        assertEquals(se2.paymentAmount(),3000,0.001);
    }

  // test paymentAmount;
  @Test
    public void ex2Test5() {
      he3.setWorkedHoursLastMonth(10);
        assertEquals(he3.paymentAmount(),45000,0.001);
    }
}
