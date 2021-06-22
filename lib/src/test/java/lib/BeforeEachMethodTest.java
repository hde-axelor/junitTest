package lib;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeEachMethodTest {
  
  BeforeEachMethod beforeEach;
  
  @BeforeEach
  void init() { 
    beforeEach = new BeforeEachMethod();
  }
  
  @AfterEach
  void print() {
    System.out.println("Test Passed" ); 
  }

  @Test
  void testMultiply() {
    
     int expected = 6;
     int actual = beforeEach.multiply(2, 3);
     assertEquals(expected, actual,"Multiply");
  }

  @Test
  void testSubtract() {
    int expected = 2;
    int actual = beforeEach.subtract(5, 3);
    assertEquals(expected, actual,"Subtract");
  }

  @Test
  void testAdd() {
    int expected = 5;
    int actual = beforeEach.add(2,3);
    assertEquals(expected, actual, "Add");
  }
}
