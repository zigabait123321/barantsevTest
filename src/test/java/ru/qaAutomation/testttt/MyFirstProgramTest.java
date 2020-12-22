package ru.qaAutomation.testttt;


import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstProgramTest {

  @Test
  public void testArea() {
    Square s = new Square(7);
    //Assert.assertEquals(25, s.area());
    Assert.assertEquals(s.area(), 49.0);
  }
}
