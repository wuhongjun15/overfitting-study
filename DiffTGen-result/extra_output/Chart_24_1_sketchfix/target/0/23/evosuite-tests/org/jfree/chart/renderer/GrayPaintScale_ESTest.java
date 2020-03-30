/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:00:55 GMT 2020
 */

package org.jfree.chart.renderer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Paint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.renderer.GrayPaintScale;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GrayPaintScale_ESTest extends GrayPaintScale_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 1.0);
      GrayPaintScale grayPaintScale1 = new GrayPaintScale(0.0, 765.887775095571);
      boolean boolean0 = grayPaintScale1.equals(grayPaintScale0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = new GrayPaintScale((-88.245311217648), 0.0);
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-2619.577), (-2540.382389695108));
      Paint paint0 = grayPaintScale0.getPaint(255.0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1331.9207274544), 0.0);
      double double0 = grayPaintScale0.getUpperBound();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-2619.577), (-2540.382389695108));
      double double0 = grayPaintScale0.getUpperBound();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(401.058581, 1018.47746);
      double double0 = grayPaintScale0.getLowerBound();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-2619.577), (-2540.382389695108));
      double double0 = grayPaintScale0.getLowerBound();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = new GrayPaintScale(0.0, 815.07857);
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = new GrayPaintScale((-2920.25719003), 866.66476654);
      boolean boolean0 = grayPaintScale1.equals(grayPaintScale0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      boolean boolean0 = grayPaintScale0.equals("");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale(0.0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Requires lowerBound < upperBound.
         //
         verifyException("org.jfree.chart.renderer.GrayPaintScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      double double0 = grayPaintScale0.getUpperBound();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      Object object0 = grayPaintScale0.clone();
      boolean boolean0 = grayPaintScale0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      double double0 = grayPaintScale0.getLowerBound();
  }
}
