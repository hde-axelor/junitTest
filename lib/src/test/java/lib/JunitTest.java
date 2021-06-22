package lib;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JunitTest {

  // this is passed test
  @Test
  void test() {

    Junit junit = new Junit();

    int expected = 2;
    int actual = junit.add(1, 1);

    assertEquals(expected, actual);
  }

  // this is an  example of failed test

  @Test
  void secondTest() {

    Junit junit = new Junit();

    int expected = 3;
    int actual = junit.add(1, 1);

    assertNotEquals(expected, actual);
  }
   
  /*we adding string in our assertions when it fails */
  
  @Test
  void thirdTest() {

    Junit junit = new Junit();

    int expected = 3;
    int actual = junit.add(1, 1);

    assertEquals(expected, actual, "The add method should add two nos : -");
  }
}
