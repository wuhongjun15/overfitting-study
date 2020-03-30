/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 10:26:44 GMT 2020
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
import org.jfree.chart.util.Size2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShapeUtilities_ESTest extends ShapeUtilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(0, 1512);
      Size2D size2D0 = new Size2D();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 0, 0, rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 637.1F, (-1.0F), 1315.45F);
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      line2D_Double0.x2 = 0.0;
      line2D_Double0.x2 = 299.808322;
      line2D_Double0.y1 = 2.0;
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 236.55867F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(252.07915F, 0.0F, (-654.9002F), (-758.5477F));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 21.8201F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(911.0F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) 911.0F, (-5452.21511155326));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(1.0F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) 1.0F, (-3383.70656274));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.getPointInRectangle(1613.6106, 1613.6106, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createLineRegion((Line2D) null, 2.0F);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(2357.9849F, 1.5353277F, 2.0F, (-649.16F));
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Polygon polygon0 = new Polygon();
      rectangle2D_Float0.setRect((float) 0, (float) 0, (-231.0F), (float) 0);
      Rectangle2D rectangle2D0 = polygon0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Float0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      rectangle2D_Float0.setFrame((double) (-78.49F), (double) (-78.49F), 3777.8692761006237, (-2897.308452));
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Float0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle2D rectangle2D0 = polygon0.getBounds2D();
      Size2D size2D0 = new Size2D();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      Rectangle2D rectangle2D1 = RectangleAnchor.createRectangle(size2D0, 0, 0, rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Rectangle2D rectangle2D0 = rectangle2D_Double0.getBounds2D();
      rectangle2D_Double0.setFrameFromCenter((-2975.7983474731445), (-2975.7983474731445), (-2095.757080078125), 1735.59894582);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Rectangle2D rectangle2D0 = rectangle2D_Double0.getBounds2D();
      rectangle2D_Double0.setFrameFromCenter((-2975.7983474731445), (-2975.7983474731445), (-2095.757080078125), 1735.59894582);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, (-323.0437911192), 0.0F, 3783.068F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross((-1355.6847F), (-1355.6847F));
      Shape shape1 = ShapeUtilities.rotateShape(shape0, (-1355.6847F), 0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, (-1.7976931348623157E308), Double.NEGATIVE_INFINITY);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, 2.0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1105.6422F), (-1105.6422F), 0.0F, 2241.603F);
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) rectangle2D_Float0, 2.0, (double) (-1105.6422F));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond((-2780.5386F));
      Shape shape1 = ShapeUtilities.createUpTriangle((-1706.3F));
      boolean boolean0 = ShapeUtilities.equal(shape1, shape0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createUpTriangle(804.1F);
      GeneralPath generalPath1 = new GeneralPath(0, 0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon(polygon0.xpoints, polygon0.xpoints, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1105.6422F), (-1105.6422F), 0.0F, 2241.603F);
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(rectangle2D_Float0, 0.0F, (-1105.6422F), 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-1.0), (-1.0), (-1.0), 0.0);
      Ellipse2D.Double ellipse2D_Double1 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0, (-3145.66010649), 0, 0);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(2408.0F, 1607.7983F, 1607.7983F, 1986.06383);
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int[] intArray0 = new int[7];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) polygon0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, (Shape) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Point point0 = new Point();
      Line2D.Float line2D_Float0 = new Line2D.Float(point0, point0);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, 1965.6686111806, 2703.0, (-2975.7983474731445));
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross((-1355.6847F), (-1355.6847F));
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1105.6422F), (-1105.6422F), 0.0F, 2241.603F);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(0, 1.0F);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross((-1355.6847F), (-1355.6847F));
      Shape shape1 = ShapeUtilities.clone(shape0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond((-1.0F));
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, shape0, 0.0, (-1455.7275F), (-1.0F));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDownTriangle(2340.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0.0F);
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape(shape0, (RectangleAnchor) null, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle2D rectangle2D0 = polygon0.getBounds2D();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(0, (-705.8758471555), rectangle2D0);
  }
}
