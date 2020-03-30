/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 10:32:33 GMT 2020
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
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
import java.util.Stack;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
      Polygon polygon0 = new Polygon();
      polygon0.addPoint((-522), 2460);
      Rectangle rectangle0 = polygon0.getBounds();
      GridBagLayout gridBagLayout0 = new GridBagLayout();
      Point point0 = gridBagLayout0.getLayoutOrigin();
      rectangle0.add(point0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-2751), (-2751));
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(Double.NEGATIVE_INFINITY, 0.0, Double.NEGATIVE_INFINITY, (-856.8372));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 0.0F);
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
        ShapeUtilities.getPointInRectangle(1.0, 1326.687300257, (Rectangle2D) null);
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
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-853.499897377784), (-853.499897377784), 77.8, (-1.7976931348623157E308));
      Rectangle rectangle0 = ellipse2D_Double0.getBounds();
      GeneralPath generalPath0 = new GeneralPath(rectangle0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double();
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Double0, point2D_Double0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Stack<Object> stack0 = new Stack<Object>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, stack0);
      JTable jTable0 = new JTable(defaultTableModel0);
      Rectangle rectangle0 = jTable0.getCellRect(2240, 0, false);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      Size2D size2D0 = new Size2D(Double.NEGATIVE_INFINITY, 0.0);
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 1246.50145179667, 360.0, rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      Size2D size2D0 = new Size2D((-1.0F), (-1.0F));
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, (-1.0), 438.289, rectangleAnchor0);
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.5, 0.0, 5525.5758231, 0);
      Rectangle2D rectangle2D1 = ellipse2D_Double0.getBounds2D();
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1453.0F), (-1453.0F), (-1453.0F), 0.0F);
      Line2D.Double line2D_Double0 = new Line2D.Double((-1.0), (-1453.0F), 0.0F, 0.0);
      line2D_Float0.setLine((Line2D) line2D_Double0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, (-2081.87F));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0, 2.0F, 0.0F, (-2354.9F));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, (-1.0), 1176.1101F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Shape shape0 = ShapeUtilities.rotateShape(polygon0, 0.0F, 1176.1101F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, 0.0, 0.0);
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
        ShapeUtilities.createTranslatedShape((Shape) null, (-1143.277023607), (-1143.277023607));
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle((-1.0F));
      Shape shape1 = ShapeUtilities.createUpTriangle((-1.0F));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      Shape shape0 = ShapeUtilities.createUpTriangle((-1.0F));
      boolean boolean0 = ShapeUtilities.equal((Shape) generalPath0, shape0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[1];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      polygon0.xpoints = intArray0;
      Polygon polygon1 = new Polygon();
      polygon1.xpoints = intArray0;
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
      Point point0 = new Point((-170), (-170));
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(rectangle0, (-170), (-1.0F), 0);
      Arc2D.Double arc2D_Double1 = new Arc2D.Double(0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Ellipse2D.Float ellipse2D_Float1 = new Ellipse2D.Float(309.0F, 0.0F, (-2820.3032F), (-2820.3032F));
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float1, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float((-1509.839F), (-1509.839F), 0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(1);
      Point2D point2D0 = arc2D_Double0.getStartPoint();
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D0, point2D0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(0.0F, 0.0F);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Polygon polygon0 = new Polygon();
      Rectangle2D rectangle2D0 = polygon0.getBounds2D();
      Rectangle2D rectangle2D1 = rectangle2D_Float0.createIntersection(rectangle2D0);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) rectangle2D1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) polygon0, (-1488.6390684), (double) 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, shape0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-2060.09890301293), Double.POSITIVE_INFINITY, (-531.368117694361), (-531.368117694361));
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, (Shape) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, (-1003.06F));
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, shape0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double((-1.0), (-1453.0F), 0.0F, 0.0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) line2D_Double0, rectangleAnchor0, 0.0, (-1.0));
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, shape0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double((-1.0), (-1453.0F), 0.0F, 0.0);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(rectangle0, 1038.9719619, 0, 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, (Shape) rectangle0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      Shape shape0 = ShapeUtilities.clone(rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiagonalCross(2210.2246F, 4.7306747F);
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createDiamond((-1.0F));
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 0.0F, 0.0F, 1.0F);
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, rectangle2D0, 0.0, 1.0F, 0.0F);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Stack<Object> stack0 = new Stack<Object>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, stack0);
      JTable jTable0 = new JTable(defaultTableModel0);
      Rectangle rectangle0 = jTable0.getCellRect(2240, 0, false);
      Point2D point2D0 = ShapeUtilities.getPointInRectangle((-13.7533900309), 0, rectangle0);
  }
}
