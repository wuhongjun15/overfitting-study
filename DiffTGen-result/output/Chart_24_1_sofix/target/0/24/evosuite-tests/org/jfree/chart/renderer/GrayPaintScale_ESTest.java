/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:49:22 GMT 2020
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
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = new GrayPaintScale(0.0, 80.043253);
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = new GrayPaintScale((-3205.098), (-1.0));
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-2177.09), 0.0);
      double double0 = grayPaintScale0.getUpperBound();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1197.06234925641), (-1.0));
      double double0 = grayPaintScale0.getUpperBound();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(1.0, 255.0);
      double double0 = grayPaintScale0.getLowerBound();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1197.06234925641), (-1.0));
      double double0 = grayPaintScale0.getLowerBound();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-39.0), 4731.5217);
      GrayPaintScale grayPaintScale1 = new GrayPaintScale();
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-39.0), 4731.5217);
      Object object0 = new Object();
      boolean boolean0 = grayPaintScale0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = new GrayPaintScale(0.0, 80.043253);
      boolean boolean0 = grayPaintScale1.equals(grayPaintScale0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale((-0.1571915219442244), (-0.1571915219442244));
      } catch(IllegalArgumentException e) {
         //
         // Requires lowerBound < upperBound.
         //
         verifyException("org.jfree.chart.renderer.GrayPaintScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      double double0 = grayPaintScale0.getUpperBound();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      Object object0 = grayPaintScale0.clone();
      boolean boolean0 = object0.equals(grayPaintScale0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      double double0 = grayPaintScale0.getLowerBound();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-39.0), 4731.5217);
      Paint paint0 = grayPaintScale0.getPaint(4731.5217);
  }
}
