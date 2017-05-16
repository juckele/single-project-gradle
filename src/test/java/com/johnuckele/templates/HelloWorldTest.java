package com.johnuckele.templates;
import org.junit.Assert;

public class HelloWorldTest {
  public static void testAdd(){
    Assert.assertEquals(2, HelloWorld.add(1,1));
  }
}