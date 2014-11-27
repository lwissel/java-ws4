import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;


public class Ex3MyTest {

  private House h1, h2, h3;
  private Apartment a1, a2, a3, a4;
  private ArrayList<Property> props;
  private Control propertyControl;
  
  @Before 
    public void setUp() {
      // generate some random properties
      h1 = new House('s',1,"First House","path/to/file.png",2);
      h2 = new House('r',4,"House","path/to/file1.png",2000);
      h3 = new House('r',6,"New House","path/to/file2.png",100);
      a1 = new Apartment('s',9,"First Apartment","path/to/file.png",200);
      a2 = new Apartment('r',3,"2nd Apartment","path/to/file.png",9);
      a3 = new Apartment('s',4,"Worst Apartment","path/to/file.png",200000);
      a4 = new Apartment('s',6,"Test Apartment","path/to/file.png",8);

      props = new ArrayList<Property>();
      props.add(h1);
      props.add(h2);
      props.add(h3);
      props.add(a1);
      props.add(a2);
      props.add(a3);
      props.add(a4);

      Control propertyControl;
    }

    @Test // general functionality
      public void ex3Test1() {
        // add them to a control structure and generate the html
        propertyControl = new Control(props);
        propertyControl.sortPropertiesByLowestPrice();
        propertyControl.generateHTML();
        assertTrue(true);
      }

    @Test // test rentable
      public void ex3Test2() {
        assertEquals(h1.askingPrice(), 2,0.01);
      }
    @Test // test rentable
      public void ex3Test3() {
        assertEquals(h1.rentAmount(), 0,0.01);
      }
    @Test // test rentable 
      public void ex3Test4() {
        assertEquals(a2.rentAmount(), 9,0.01);
      }
    @Test // test sellable
      public void ex3Test5() {
        assertEquals(a2.askingPrice(), 0,0.01);
      }
    @Test (expected = IllegalArgumentException.class) // test for exception
      public void ex3Test6() {
        House defect = new House('e',100,"test","testfile.png",200.);
      }


}
