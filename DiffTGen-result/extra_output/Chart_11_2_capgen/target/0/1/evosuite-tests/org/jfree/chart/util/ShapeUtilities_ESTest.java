/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:50:41 GMT 2020
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Component;
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
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableColumnModel;
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
      Line2D.Double line2D_Double0 = new Line2D.Double(2966.2F, 2966.2F, 2966.2F, 0.5);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      rectangle0.setBounds(0, 0, 0, (-6));
      Size2D size2D0 = new Size2D();
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 0.0, (-6), rectangleAnchor0);
      rectangle0.y = (-6);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-559.17F), (-2724.3486F), 1392.6F, (-559.17F));
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Float0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-455.047F), (-455.047F), 2060.5925F, 1623.931F);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 2060.5925F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(2966.2F, 2966.2F, 2966.2F, 0.5);
      line2D_Double0.x1 = 0.5;
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      Size2D size2D0 = new Size2D();
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 0.0, (-6), rectangleAnchor0);
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) rectangle2D0, rectangleAnchor0, 3999.82, (double) 0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, (-1820.4F));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) 0, 0.5);
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
        ShapeUtilities.getPointInRectangle((-1.0), (-1.0), (Rectangle2D) null);
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
        ShapeUtilities.createLineRegion((Line2D) null, 2656.617F);
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
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createRegularCross((-1423.8872F), (-1423.8872F));
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GridBagLayout gridBagLayout0 = new GridBagLayout();
      Point point0 = gridBagLayout0.getLayoutOrigin();
      Line2D.Float line2D_Float0 = new Line2D.Float(point0, point0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-1), (-1));
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      rectangle0.setBounds(0, 0, 0, (-6));
      Size2D size2D0 = new Size2D();
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 0.0, (-6), rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      Size2D size2D0 = new Size2D();
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 0.0, (-6), rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BevelBorder bevelBorder0 = new BevelBorder(1716);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(1716, 1716);
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTable jTable0 = new JTable(defaultTableModel0, defaultTableColumnModel0);
      Rectangle rectangle0 = bevelBorder0.getInteriorRectangle((Component) jTable0, 1716, 1716, 1716, (-125));
      Rectangle rectangle1 = new Rectangle();
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(2058.43, 0.5, 2.0, 0.5);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 3111.354F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 0.0, 0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross((-929.6F), (-929.6F));
      Shape shape1 = ShapeUtilities.rotateShape(shape0, (-929.6F), (-812.2346F), (-929.6F));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-1721.98217739), (-1721.98217739), (-1.7976931348623157E308), (-3103.87262));
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) rectangle2D_Double0, (RectangleAnchor) null, (-1678.989155), 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, 732.345621286912, (double) (-613));
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, 0.0, (double) 0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle((-1.0F));
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, 1440.32065, (-3527.131856853645));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createRegularCross(0.0F, (-1820.4F));
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createUpTriangle(0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createUpTriangle(1.0F);
      GeneralPath generalPath1 = new GeneralPath(1);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0, 0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDownTriangle((-1.0F));
      GeneralPath generalPath1 = new GeneralPath(0, 0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createUpTriangle(1.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Ellipse2D.Float ellipse2D_Float1 = new Ellipse2D.Float(2044.0398F, 0.0F, 0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 0, 0.0F, 5374.808F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.0F, 0.0F, 0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0, 0.0F, (-6), 0);
      Line2D.Float line2D_Float1 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GridBagLayout gridBagLayout0 = new GridBagLayout();
      Point point0 = gridBagLayout0.getLayoutOrigin();
      Line2D.Float line2D_Float0 = new Line2D.Float(point0, point0);
      Line2D.Double line2D_Double0 = new Line2D.Double(0.5, 0.0, 0.0F, (-1.7976931348623157E308));
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Point point0 = new Point(0, 3418);
      Line2D.Float line2D_Float0 = new Line2D.Float(point0, point0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 3418);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(1274.9122F);
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, shape0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.0F, 0.0F, 0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Line2D.Double line2D_Double0 = new Line2D.Double(0.5, 0.0, 0.0F, (-1.7976931348623157E308));
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(1274.9122F);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(1274.9122F);
      Shape shape1 = ShapeUtilities.clone(shape0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1.0F), 1088.05F, 0.0F, 0.0F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      Point2D point2D0 = RectangleAnchor.coordinates(rectangle2D_Float0, rectangleAnchor0);
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D0, point2D0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, shape0, (-1.0F), 1.0F, 828.11487F);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0.0F);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JTable jTable0 = new JTable(31, 31);
      Rectangle rectangle0 = jTable0.getBounds();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle((-2311.3317), (-2291.6023519318082), rectangle0);
  }
}