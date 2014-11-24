import static org.junit.Assert.*;
import org.junit.Test;


public class Ex1MyTest {
  
  /**
   * Test 1 setters and equals
   */
  @Test
    public void ex1Test1() {
      Patient p1 = new Patient("test",123,'M');
      p1.setName("t2");
      p1.setDateOfBirth(1234);
      p1.setGender('F');
      Patient p2 = new Patient("t2",1234,'F');
      assertTrue(p1.equals(p2));
    }

  // equal to itself?
  @Test
    public void ex1Test2() {
      Patient p3 = new Patient("t3",1,'F');
      assertTrue(p3.equals(p3));
    }

  // passing null should evaluate to false
  @Test
    public void ex1Test3() {
      Patient p4 = new Patient("t4",23,'F');
      assertFalse(p4.equals(null));
    }

  // test for exception
  @Test (expected = IllegalArgumentException.class)
    public void ex1Test4() {
      Patient p5 = new Patient("hans",13,'m');
    }
}
