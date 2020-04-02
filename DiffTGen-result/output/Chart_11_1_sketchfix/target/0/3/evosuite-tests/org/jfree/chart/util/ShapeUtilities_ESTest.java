/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:19:34 GMT 2020
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Component;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.SystemColor;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JInternalFrame;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.ShapeUtilities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShapeUtilities_ESTest extends ShapeUtilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      Rectangle rectangle0 = ellipse2D_Double0.getBounds();
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1.0F), 0.0F, (-1.0F), (-1.0F));
      line2D_Float0.x1 = 0.0F;
      Rectangle rectangle0 = line2D_Float0.getBounds();
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-1855.316), 0.5, (-1855.316), (-1855.316));
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Double0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1.0F), 0.0F, (-1.0F), (-1.0F));
      line2D_Float0.x1 = 0.0F;
      Rectangle rectangle0 = line2D_Float0.getBounds();
      Rectangle rectangle1 = line2D_Float0.getBounds();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle((-1.0F), 709.9988F, rectangle0);
      rectangle1.setFrameFromDiagonal(point2D0, point2D0);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1.0F), 0.0F, (-1.0F), (-1.0F));
      Rectangle rectangle0 = line2D_Float0.getBounds();
      Rectangle rectangle1 = line2D_Float0.getBounds();
      Point2D.Double point2D_Double0 = (Point2D.Double)ShapeUtilities.getPointInRectangle((-1.0F), 709.9988F, rectangle0);
      point2D_Double0.x = (-650.8589957);
      rectangle1.setFrameFromDiagonal((Point2D) point2D_Double0, (Point2D) point2D_Double0);
      boolean boolean0 = ShapeUtilities.contains(rectangle1, rectangle0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1.0F), (-1.0F), 2440.866F, 2440.866F);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, (-1.0F));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1.0F), 0.0F, (-1.0F), (-1.0F));
      line2D_Float0.setLine((-1.0), (double) (-1.0F), 709.99875603, (-2.147483648E9));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 709.9988F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1.0F), 0.0F, (-1.0F), (-1.0F));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 709.9988F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(0.0F, 1673.881F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(659.14154F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (-1.0), (double) 659.14154F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-1), (-1209), 0, 631);
      // Undeclared exception!
      try { 
        ShapeUtilities.intersects((Rectangle2D) null, rectangle0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.getPointInRectangle(840.0986915, 0.0, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createLineRegion((Line2D) null, 1631.68F);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDownTriangle(1003.9F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(883.5, 883.5, 0.0F, 0.0);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.desktop;
      SoftBevelBorder softBevelBorder0 = new SoftBevelBorder(2464, systemColor0, systemColor0);
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) null, (Border) softBevelBorder0, 0, 2464, 1, 2464);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(Double.POSITIVE_INFINITY, 1422.03, Double.POSITIVE_INFINITY, 2.0);
      DefaultCaret defaultCaret0 = new DefaultCaret();
      Rectangle2D rectangle2D0 = rectangle2D_Double0.createIntersection(defaultCaret0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1.0F), 0.0F, (-1.0F), (-1.0F));
      Rectangle rectangle0 = line2D_Float0.getBounds();
      Rectangle rectangle1 = line2D_Float0.getBounds();
      Point2D.Double point2D_Double0 = (Point2D.Double)ShapeUtilities.getPointInRectangle((-1.0F), 709.9988F, rectangle0);
      point2D_Double0.x = (-650.8589957);
      rectangle1.setFrameFromDiagonal((Point2D) point2D_Double0, (Point2D) point2D_Double0);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1.0F), 0.0F, (-1.0F), (-1.0F));
      line2D_Float0.x1 = 0.0F;
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 709.9988F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 0.0, 0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(103, 103);
      Shape shape0 = ShapeUtilities.rotateShape(rectangle0, 103, 0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle((-362.68F));
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape(shape0, (RectangleAnchor) null, 1.0, (double) (-362.68F));
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, (-4360.067643358334), (-4360.067643358334));
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(108.675F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) 108.675F, 1292.9037228);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, (double) 0.0F, (double) (-4139.9F));
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(1003.9F);
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, (double) 1003.9F, (-117.3803673711));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0);
      GeneralPath generalPath1 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon(polygon0.ypoints, polygon0.xpoints, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(103, 103);
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(rectangle0, 0.0F, 2.0, 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(185.0F, 2.0F, 185.0F, 3296.9094F);
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-764.2755606471), (-764.2755606471), (-764.2755606471), 0.0);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(883.5, 883.5, 0.0F, 0.0);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1.0F), 0.0F, (-1.0F), (-1.0F));
      Line2D.Float line2D_Float1 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1.0F), 0.0F, (-1.0F), (-1.0F));
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(1775.0F, 0.0F);
      JInternalFrame jInternalFrame0 = new JInternalFrame("", true, true);
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) rectangle0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, (-3844.6F), 0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, (Shape) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(108.675F);
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 0.0F, 1025.72F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, shape0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle((-2315.989F));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.desktop;
      SoftBevelBorder softBevelBorder0 = new SoftBevelBorder(2464, systemColor0, systemColor0);
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) null, (Border) softBevelBorder0, 0, 2464, 1, 2464);
      Shape shape0 = ShapeUtilities.clone(rectangle0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(1.0F);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle((-1.0F));
      Shape shape1 = ShapeUtilities.createDiamond((-1.0F));
      boolean boolean0 = ShapeUtilities.equal(shape1, shape0);
  }
}