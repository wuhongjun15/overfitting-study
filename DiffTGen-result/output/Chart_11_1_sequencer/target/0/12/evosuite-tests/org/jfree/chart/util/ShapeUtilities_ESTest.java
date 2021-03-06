/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:41:35 GMT 2020
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
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 3856.83736245, 4510.615469068);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-4213.6206F));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle((-3354.0F));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) (-3354.0F), (double) (-3354.0F));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-2444.8739842), 2654.0, (-2444.8739842), (-1913.6513805756));
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle((-1913.6513805756), (-2444.8739842), rectangle2D0);
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
        ShapeUtilities.createLineRegion((Line2D) null, (-858.47F));
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
        ShapeUtilities.contains((Rectangle2D) null, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(1, 244);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-19), 244);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-19), 244);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(244, 0, 0, 2349.1543F);
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createLineRegion(line2D_Float0, 1302.8F);
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createDiagonalCross(417.0795F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 0.5, 1.0F, 1.0F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Point2D.Float point2D_Float0 = new Point2D.Float();
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D_Float0, point2D_Float0);
      Rectangle rectangle0 = line2D_Float0.getBounds();
      GeneralPath generalPath0 = new GeneralPath(rectangle0);
      Shape shape0 = ShapeUtilities.rotateShape(generalPath0, 0.0F, 0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(0, 0, (-1), (-731));
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) rectangle0, (RectangleAnchor) null, (double) 0, (double) 1);
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, (double) 391.8398F, (double) 391.8398F);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, 886.83833988029, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0);
      Shape shape1 = ShapeUtilities.createDiagonalCross(0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Point2D.Float point2D_Float0 = new Point2D.Float();
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D_Float0, point2D_Float0);
      Rectangle rectangle0 = line2D_Float0.getBounds();
      GeneralPath generalPath0 = new GeneralPath(rectangle0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon(polygon0.xpoints, polygon0.ypoints, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[3];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 1);
      Polygon polygon1 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(0);
      arc2D_Float0.setFrameFromCenter((double) 0.0F, (double) 0, 438.1917474836, (-1482.976));
      Arc2D.Float arc2D_Float1 = new Arc2D.Float(rectangle2D0, 231.689F, 0.0F, 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      ellipse2D_Float0.width = (-492.30453F);
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-894.8F), 1603.85, (-2056.837), 2.0);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0, 0, 0.0F, 1616.44F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Point2D.Float point2D_Float0 = new Point2D.Float();
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D_Float0, point2D_Float0);
      Line2D.Float line2D_Float1 = new Line2D.Float();
      line2D_Float1.x1 = (-1.0F);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float1, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, 1.0, (-1.6137207971659346), 2.0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Point point0 = new Point();
      Rectangle rectangle0 = new Rectangle(point0);
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(rectangle0, 374.6, 0, 0);
      Point2D point2D0 = arc2D_Double0.getStartPoint();
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D0, point0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) rectangle0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) rectangle0, (-3165.9), (double) 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, shape0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(rectangle2D_Double0, 0.0, 0.0, 1);
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, (Shape) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-117.86F), (-117.86F), (-1.0F), (-2229.0F));
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Point point0 = new Point();
      Rectangle rectangle0 = new Rectangle(point0);
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(rectangle0, 374.6, 0, 0);
      Point2D point2D0 = arc2D_Double0.getStartPoint();
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D0, point0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, shape0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) generalPath0, rectangleAnchor0, (double) 0.0F, (-527.0677916));
      Shape shape1 = ShapeUtilities.clone(shape0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, 1341.3F);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(2535.6406F, (-1541.924F));
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, shape0, 2535.6406F, 2535.6406F, 2535.6406F);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle((-1908.1454F));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
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
}
