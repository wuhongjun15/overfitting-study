/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:52:11 GMT 2020
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.ShapeUtilities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShapeUtilities_ESTest extends ShapeUtilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0);
      Rectangle2D rectangle2D0 = generalPath0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(2086.592F, 135.02F);
      Rectangle2D rectangle2D0 = shape0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      line2D_Double0.setLine((double) (-96.69F), (-1.0), (-1.0), (double) (-96.69F));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-2710.07F));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0, 6);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) generalPath0, rectangleAnchor0, (double) 0, 0.0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.intersects((Rectangle2D) null, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.getPointInRectangle(0.0, 0.0, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createLineRegion((Line2D) null, (-3192.92F));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.contains((Rectangle2D) null, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiamond((-3468.3F));
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 0.0F, 0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(1.0, 0, 0.0, 0.0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1.0F), 726.0F, 726.0F, (-1.0F));
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(0.0, 0.0, rectangle2D_Float0);
      Point point0 = new Point();
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D0, point0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-3468.3F), (-3468.3F), (-3468.3F), 0.0F);
      Rectangle rectangle0 = line2D_Float0.getBounds();
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, (-1.0), (-1096.4373F), (-1096.4373F));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-96.69F));
      Rectangle rectangle0 = shape0.getBounds();
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) rectangle0, (RectangleAnchor) null, (double) 1689.9F, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, (-3069.318666986302), (-3069.318666986302));
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-3468.3F), (-3468.3F), (-3468.3F), 0.0F);
      Rectangle rectangle0 = line2D_Float0.getBounds();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) rectangle0, rectangleAnchor0, (double) 1.0F, (double) (-3469));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, 1.0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) line2D_Double0, (-1054.0), (-1054.0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-96.69F));
      Shape shape1 = ShapeUtilities.createLineRegion(line2D_Double0, (-2710.07F));
      boolean boolean0 = ShapeUtilities.equal(shape1, shape0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0, 6);
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      GeneralPath generalPath1 = new GeneralPath(0);
      generalPath1.append((Shape) rectangle0, false);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon(polygon0.xpoints, polygon0.xpoints, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 1721.1062F, (-1373.103F), 0.0F);
      Ellipse2D.Float ellipse2D_Float1 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float1, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double((-2655.7), 1.0F);
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D_Double0, point2D_Double0);
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Double0, point2D_Double0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Point2D.Float point2D_Float0 = new Point2D.Float((-1096.4373F), (-1037.95F));
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Float0, point2D_Float0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(1.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, (Shape) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-96.69F));
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(1689.9F, (-96.69F), 1689.9F, 1689.9F);
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, shape0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(2.0, 3110.2547855436, 2.0, 2.0);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Shape shape0 = ShapeUtilities.createUpTriangle((-147.0F));
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, shape0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, 1.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) null);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross((-1.0F), (-1.0F));
      Shape shape1 = ShapeUtilities.clone(shape0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross((-1.0F), 2853.5068F);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross((-1.0F), (-1.0F));
      Shape shape1 = ShapeUtilities.rotateShape(shape0, (-426.62), 0.0F, 1511.9127F);
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, shape1, 1.0, 0.0F, 2853.5068F);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1.0F), 726.0F, 726.0F, (-1.0F));
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(0.0, 0.0, rectangle2D_Float0);
      Point point0 = new Point();
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D0, point0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(75.6466793, 0.0, (-2266.44292), Double.NaN);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle2D_Double0);
  }
}
