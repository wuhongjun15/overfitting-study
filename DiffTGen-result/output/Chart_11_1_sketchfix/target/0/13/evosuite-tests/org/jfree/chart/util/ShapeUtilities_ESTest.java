/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:22:34 GMT 2020
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JTable;
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
      Line2D.Double line2D_Double0 = new Line2D.Double(1735.8884F, 0.0F, 1484.8237888041342, 1356.6004636);
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(6042.8804F, 6042.8804F, 127.0F, 0.0F);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, (-1606.5876F));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(2.0F, (-876.0741F));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) 2.0F, (-3716.71466728379));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createLineRegion((Line2D) null, 0.0F);
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
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiagonalCross(0.0F, 490.32516F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, (-613.120186399), 0.0, (-613.120186399));
      Rectangle rectangle0 = new Rectangle(0, 0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, (-613.120186399), 0.0, (-613.120186399));
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      Size2D size2D0 = new Size2D((-637.5305058835446), (-1894.0));
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, Integer.MAX_VALUE, 2150.18042598, rectangleAnchor0);
      JTable jTable0 = new JTable();
      Rectangle rectangle0 = jTable0.getVisibleRect();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      line2D_Double0.setLine((double) 0.0F, 0.0, 1.7976931348623157E308, (double) 0.0F);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      Size2D size2D0 = new Size2D((-637.5305058835446), (-1894.0));
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, Integer.MAX_VALUE, 2150.18042598, rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double((-443.8), 0.0);
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Double0, point2D_Double0);
      Line2D.Float line2D_Float0 = new Line2D.Float((-1.0F), 0, 0.0F, 490.32516F);
      line2D_Double0.setLine((Line2D) line2D_Float0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 490.32516F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, (-1.0F));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 1343.0, 0.0F, 3350.88F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(1.0F, 1.0F, (-1.0F), (-1.0F));
      Rectangle rectangle0 = line2D_Float0.getBounds();
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) rectangle0, (RectangleAnchor) null, (double) 0.0F, (-1695.8745));
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, (RectangleAnchor) null, (-1.0), (-1.0));
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
        ShapeUtilities.createTranslatedShape((Shape) null, (double) 0.0F, (double) 1921L);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) line2D_Double0, Double.POSITIVE_INFINITY, 0.0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(1735.8884F, 1735.8884F);
      Shape shape1 = ShapeUtilities.createDiagonalCross((-1376.928F), 0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape1, shape0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[4];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Shape shape0 = ShapeUtilities.rotateShape(polygon0, 6, (-3649), 6);
      GeneralPath generalPath0 = new GeneralPath(shape0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createRegularCross(0.0F, 2326.192F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, (GeneralPath) null);
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
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(2.0F, 2.0F, (-1.0F), (-1.0F), 0.0F, 3468.8472F, 0);
      Arc2D.Float arc2D_Float1 = new Arc2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(1781.60172296663, 1731.3893, 1781.60172296663, 1781.60172296663, 860.045, 2.0, 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 1.0F, 1.0F, 0.0F);
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(1.5, 0.0F, 1774.03, 335.0);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Line2D.Double line2D_Double1 = (Line2D.Double)line2D_Double0.clone();
      line2D_Double0.setLine((double) 0.0F, 0.0, 1.7976931348623157E308, (double) 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, 0.0, 0.0, Double.POSITIVE_INFINITY);
      Line2D.Float line2D_Float0 = new Line2D.Float((-3006.81F), (-3006.81F), 0.0F, (-3006.81F));
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) polygon0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int[] intArray0 = new int[4];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Shape shape0 = ShapeUtilities.rotateShape(polygon0, 6, (-3649), 6);
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, shape0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(1.0F, (-900.1F), (-900.1F), 1.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, (Shape) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 0.0, 0.0, 0.0);
      Point2D point2D0 = ShapeUtilities.getPointInRectangle((-859.45), 0.0, rectangle2D_Double0);
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D0, point2D0);
      Line2D.Double line2D_Double0 = new Line2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) null);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      Shape shape0 = ShapeUtilities.clone(rectangle0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle((-208.7F));
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, shape0, 0.0, 3511.2686F, (-2808.0F));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) null);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle((-900.1F));
  }
}
