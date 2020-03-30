/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:22:32 GMT 2020
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
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
import java.util.SimpleTimeZone;
import java.util.Stack;
import javax.swing.JTable;
import javax.swing.plaf.metal.MetalComboBoxUI;
import javax.swing.table.JTableHeader;
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
      Point point0 = new Point(1600, 1600);
      Dimension dimension0 = new Dimension(1600, 2954);
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MetalComboBoxUI metalComboBoxUI0 = new MetalComboBoxUI();
      Stack<SimpleTimeZone> stack0 = new Stack<SimpleTimeZone>();
      JTable jTable0 = new JTable(stack0, stack0);
      Dimension dimension0 = metalComboBoxUI0.getMaximumSize(jTable0);
      Rectangle rectangle0 = new Rectangle(dimension0);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0F, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 0.0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 3753.925F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(2.0, 2.0, 2.0, 2.0);
      line2D_Double0.x1 = 3967.755094914764;
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-3697.7F));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(2.0, 2.0, 2.0, 2.0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-3697.7F));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(406.57083F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) 2886.836F, (double) 2886.836F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross((-407.0F), 2269.8328F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, 1821.66, (-1239.978359555));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.getPointInRectangle(0.0, 1039.4417, (Rectangle2D) null);
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
        ShapeUtilities.createLineRegion((Line2D) null, (-2103.4F));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JTableHeader jTableHeader0 = new JTableHeader();
      Rectangle rectangle0 = jTableHeader0.getHeaderRect(0);
      // Undeclared exception!
      try { 
        ShapeUtilities.contains(rectangle0, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[1];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-587.0F), (-1.0F), (-4281.4937F), 1421.37F);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 0.0F, (-1683.0F), (-1683.0F));
      rectangle2D_Float0.setRect(3734.0552F, (-1683.0F), 0.0F, (-1145.2349F));
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Float0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float((-4281.4937F), 3658.2146F, (-4281.4937F), (-279.1388F));
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-2239.53F), (-2239.53F), (-2239.53F), (-2239.53F));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(1447.35016974883, 0.0, 0.0, Double.POSITIVE_INFINITY);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Double0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 1973.72351257, 1762.56F, 1988.834F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-4242.0F), (-4242.0F), (-2070.29F), (-4242.0F));
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) line2D_Float0, (RectangleAnchor) null, 2.0, (double) (-4242.0F));
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, (RectangleAnchor) null, 1073.391842681, 1073.391842681);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, (double) 0.0F, (-807.4495855620946));
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) generalPath0, Double.POSITIVE_INFINITY, (-807.4495855620946));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(1.0F);
      Shape shape1 = ShapeUtilities.createUpTriangle(1.0F);
      boolean boolean0 = ShapeUtilities.equal(shape1, shape0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal((Shape) generalPath0, (Shape) generalPath0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[0];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Polygon polygon1 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(353.70786F, (-603.7652F), (-696.2785F), 1198.0F);
      Ellipse2D.Float ellipse2D_Float1 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 2128.0273F, 0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(1065.35F, 655.5975F, 0.0F, 0.0F);
      Line2D.Double line2D_Double0 = new Line2D.Double(655.5975F, 1.0, 0.0F, (-2081.6038F));
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(0.0F, 1.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int[] intArray0 = new int[2];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) polygon0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int[] intArray0 = new int[0];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Shape shape0 = ShapeUtilities.rotateShape(polygon0, 0, 0, 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, shape0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross((-448.69397F), 1198.0F);
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(353.70786F, (-603.7652F), (-696.2785F), 1198.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, shape0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, defaultCaret0, 0, 0, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(3166.0F);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0.0F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, 1.0, (double) 0.0F);
      Shape shape2 = ShapeUtilities.clone(shape1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(3917.0, (-603.7652F), rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createUpTriangle(1.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }
}
