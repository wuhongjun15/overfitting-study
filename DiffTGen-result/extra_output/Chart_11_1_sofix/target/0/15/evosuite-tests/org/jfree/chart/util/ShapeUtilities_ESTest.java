/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:55:04 GMT 2020
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
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
      Line2D.Float line2D_Float0 = new Line2D.Float((-1.0F), 0.0F, 0.0F, (-3484.29F));
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      defaultCaret0.setSize((-296), 0);
      boolean boolean0 = ShapeUtilities.contains(defaultCaret0, defaultCaret0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0F, 0.0F, 1.0F, (-911.669768274));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 1083.0853F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double((-1495.8882437335), 807.0, 807.0, (-1495.8882437335));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(2.0, 0.0F, 370.079606698994, 0.0);
      line2D_Double0.setLine(0.0, 0.0, (-1.0), 370.079606698994);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance(1972.9500855, (-1.0), 432.4);
      Point point0 = new Point();
      Point2D point2D0 = affineTransform0.transform((Point2D) point0, (Point2D) point0);
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D0, point0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross((-1.0F), (-1.0F));
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
        ShapeUtilities.getPointInRectangle((-2952.8), 2.0, (Rectangle2D) null);
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
        ShapeUtilities.createLineRegion((Line2D) null, (-1880.6385F));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiagonalCross((-1.0F), 0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(2046.136147393, 2046.136147393, 2046.136147393, 53.3741901);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 1807);
      JTable jTable0 = new JTable(defaultTableModel0);
      Point point0 = jTable0.getLocation();
      Line2D.Float line2D_Float0 = new Line2D.Float(point0, point0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      defaultCaret0.setSize((-296), 0);
      JInternalFrame jInternalFrame0 = new JInternalFrame("*yLoxw20{t%{cFa^C", false, false, false, false);
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      boolean boolean0 = ShapeUtilities.intersects(defaultCaret0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel((Object[][]) null, (Object[]) null);
      JTable jTable0 = new JTable(defaultTableModel0);
      Rectangle rectangle0 = jTable0.getBounds();
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-3484.29F), (-1.0F), (-3484.29F), (-3484.29F));
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Float0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.0F, 0.0F, (-3284.1F));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
      Rectangle2D rectangle2D0 = shape0.getBounds2D();
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, (-1271.5468321675), 1.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Shape shape0 = ShapeUtilities.rotateShape(polygon0, 1295.86368, 115.01194F, 115.01194F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(1.0F);
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape(shape0, (RectangleAnchor) null, 0.0, 475.064135);
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, (-2876.474036717), 0.0);
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
        ShapeUtilities.createTranslatedShape((Shape) null, 2.0, (double) 374.0F);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createRegularCross(0.0F, 983.7562F);
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createUpTriangle(0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-253.112418), (-253.112418), (-253.112418), (-1472.379969076303));
      GeneralPath generalPath0 = new GeneralPath(ellipse2D_Double0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0.0F, 0.0F, (-2570.351), 0.0F, 0.0F, 0, 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(4217.431F, (-1.0F), 3196.67F, (-3098.09F), (-1005.8F), 2.0F, 1);
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 1709.445F, (-1.0F), 0.0F);
      Ellipse2D.Float ellipse2D_Float1 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.0, 0.0, (-2962.8273), 1.0);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Line2D.Float line2D_Float1 = new Line2D.Float((-1520.9058F), 0, (-1520.9058F), (-1507.5F));
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.0F, 0.0F, (-3284.1F));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, 41.16877, 0.0);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, 983.7562F);
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, shape0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float((-1005.8F), (-1005.8F), 1394.579F, (-1005.8F));
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, (Shape) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double((-3820.19337316), (-3820.19337316), (-3820.19337316), (-2.147483648E9));
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond((-669.1895F));
      Line2D.Double line2D_Double0 = new Line2D.Double((-669.1895F), (-1138.5423494), 0.5, (-1138.5423494));
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, shape0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float((-1005.8F), (-1005.8F), 1394.579F, (-1005.8F));
      Object[] objectArray0 = new Object[4];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 1807);
      JTable jTable0 = new JTable(defaultTableModel0);
      Point point0 = jTable0.getLocation();
      Line2D.Float line2D_Float0 = new Line2D.Float(point0, point0);
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Shape shape0 = ShapeUtilities.clone(line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 2000, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape(graphics2D0, (Shape) null, 348.89, 0.0F, (-2655.6F));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.geom.Path2D$Float", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(1657.0F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) (-1005.8F), 1295.86368);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(2.0, 1.0, defaultCaret0);
  }
}
