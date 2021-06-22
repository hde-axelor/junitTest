package lib;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class BeforeAllAndAfterAllTest {
  
  
  @BeforeAll
  static void start() {     // method should be static when you ypu are using Befor All or After all
   
     System.out.println("Initalizatio of test methods.........." ); 
  }
  
  @AfterAll
  static void end() {
    System.out.println("Cleaning up ..........." ); 
  }

  @Test
  void testNames() {

    BeforeAllAndAfterAll test = new BeforeAllAndAfterAll();
    
    int expected = 9;
    int actual = test.numbers(3, 6);
    
    assertEquals(expected, actual);
  }
  
  
  @Test
  void secondtestNames() {

    BeforeAllAndAfterAll test = new BeforeAllAndAfterAll();
    
    int expected = 3;
    int actual = test.numbers(3, 0);
    
    assertEquals(expected, actual);
  }
}
