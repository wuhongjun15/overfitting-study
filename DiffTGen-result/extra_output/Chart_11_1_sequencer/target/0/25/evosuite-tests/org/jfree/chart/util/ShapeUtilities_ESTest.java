/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:47:24 GMT 2020
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Component;
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
import java.awt.image.BufferedImage;
import javax.swing.Action;
import javax.swing.JRadioButton;
import javax.swing.TransferHandler;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.DefaultCaret;
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
      Action action0 = TransferHandler.getCutAction();
      JRadioButton jRadioButton0 = new JRadioButton(action0);
      Color color0 = Color.DARK_GRAY;
      LineBorder lineBorder0 = new LineBorder(color0);
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) jRadioButton0, (Border) lineBorder0, 6, (-2157), 6, 6);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(1338, 1338, 1338, 1906);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      Size2D size2D0 = new Size2D();
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 1338, 1906, rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-213.047F), 0.0, (-213.047F), 0.0);
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 0.0, (-213.0469970703125), 0.0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(6050.5112, 6050.5112, Double.NaN, 0.0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 1.0F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Action action0 = TransferHandler.getCutAction();
      JRadioButton jRadioButton0 = new JRadioButton(action0);
      Color color0 = Color.DARK_GRAY;
      LineBorder lineBorder0 = new LineBorder(color0);
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) jRadioButton0, (Border) lineBorder0, 6, (-2157), 6, 6);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM;
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) rectangle0, rectangleAnchor0, (double) 6, 0.0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      polygon0.npoints = 92;
      // Undeclared exception!
      try { 
        ShapeUtilities.rotateShape(polygon0, 92, 0.0F, 92);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("java.awt.Polygon$PolygonPathIterator", e);
      }
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
        ShapeUtilities.getPointInRectangle(0.0F, 2224.1864968, (Rectangle2D) null);
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
        ShapeUtilities.createLineRegion((Line2D) null, 0.0F);
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
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double((-584.1F), (-584.1F), 80.257009, (-1.0));
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Size2D size2D0 = new Size2D(0.0F, 200.7525);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)RectangleAnchor.createRectangle(size2D0, 0.0, (-3468.762835969343), rectangleAnchor0);
      rectangle2D_Double0.y = 200.7525;
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Size2D size2D0 = new Size2D(0.0F, 200.7525);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 0.0, (-3468.762835969343), rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      Size2D size2D0 = new Size2D();
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 0, 1906, rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      boolean boolean0 = ShapeUtilities.contains(defaultCaret0, defaultCaret0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, (-1470.47F));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 1878.4922301, (-612.68036F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTableHeader jTableHeader0 = new JTableHeader(defaultTableColumnModel0);
      Rectangle rectangle0 = jTableHeader0.getHeaderRect(1287);
      Shape shape0 = ShapeUtilities.rotateShape(rectangle0, 396.55712786884, (-4734.199F), 0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) rectangle2D_Double0, (RectangleAnchor) null, (-1987.30207), (-1987.30207));
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, (RectangleAnchor) null, 251.703, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(1.0F, 0.0F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, 0.0, (double) 0.0F);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, 1878.4922301, (double) (-1.0F));
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(1.0F, 1.0F);
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, 0.0, 598.4411315);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiamond((-584.1F));
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createDownTriangle(0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-689.185F), 1, 0, 0.0F);
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createLineRegion(line2D_Float0, 1);
      GeneralPath generalPath1 = new GeneralPath(0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = new int[5];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Polygon polygon1 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      Ellipse2D.Double ellipse2D_Double1 = new Ellipse2D.Double(0.0, 2775.8777, 1.5, 0.0);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Point2D.Float point2D_Float0 = new Point2D.Float(0, 0);
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Float0, point2D_Float0);
      Line2D.Double line2D_Double1 = new Line2D.Double();
      line2D_Double0.x2 = (-3244.344710534265);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1.0F), 149.99382F, (-1955.72F), 0.0F);
      Line2D.Float line2D_Float1 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) polygon0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle((-945.07F));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, (Shape) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(2055.9F, (-289.68274F), (-289.68274F), (-289.68274F));
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Point2D.Float point2D_Float0 = new Point2D.Float(0, 0);
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Float0, point2D_Float0);
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      Shape shape0 = ShapeUtilities.clone(ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiagonalCross(0.0F, (-1.0F));
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1517, 1517, 8);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape(graphics2D0, (Shape) null, 1070.7672119140625, 8, 1.0F);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.geom.Path2D$Float", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      Size2D size2D0 = new Size2D();
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 0.0, (-2302.5273400033), rectangleAnchor0);
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(0.0, 0.0, rectangle2D0);
  }
}
