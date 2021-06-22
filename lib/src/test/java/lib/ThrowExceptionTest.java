package lib;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ThrowExceptionTest {

  @Test
  void test() {

    ThrowException throwException = new ThrowException();

    assertThrows(ArithmeticException.class,
        () -> throwException.divide(3, 0),"Divide by Zero should throw Exception");
  }

  /*If we are using null pointer Exception or any other instead of Arithmatic Exceprtion it will throw Error*/
  @Test
  void secondTest() {

    ThrowException throwException = new ThrowException();

    assertThrows(NullPointerException.class,
        () -> throwException.divide(3, 0),"Divide by Zero should throw Exception");
  }
  
  @Test
  void thirdTest() {

    ThrowException throwException = new ThrowException();
    
    int expected = 2;
    
    int actual =  throwException.divide(4, 2);
    
    assertEquals(expected, actual);

    
  }
}
