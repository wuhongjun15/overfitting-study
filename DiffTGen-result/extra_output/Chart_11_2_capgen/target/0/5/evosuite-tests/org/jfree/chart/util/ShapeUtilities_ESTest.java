/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:50:33 GMT 2020
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseWheelEvent;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JPasswordField;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
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
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      rectangle2D_Float0.add((double) 0.0F, 1.0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Float0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      Size2D size2D0 = new Size2D(2.0, 0.0);
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 2.0, 0.0, rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      line2D_Float0.setLine((-2379.499471131092), (-2379.499471131092), (-2379.499471131092), 1229.748);
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.0, 0.0, 5747.83801151566, 0.0);
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.0, 1912.2, (-2265.32), 0.0);
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(2562.4575F, (-3505.54F), 2562.4575F, 1.0F);
      Rectangle2D rectangle2D1 = ellipse2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.5, 0.0, (-183.061322), (-2344.443644243564));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-631.0526F));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle((-1.0F));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, 730.0722921569, 2.0);
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
        ShapeUtilities.getPointInRectangle((-22), 1, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, arc2D_Double0, 0.0, 0.0F, 0.0F);
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
        ShapeUtilities.createLineRegion((Line2D) null, (-1.0F));
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
        ShapeUtilities.contains((Rectangle2D) null, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0, 0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[9];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.0, 0.0, 5747.83801151566, 0.0);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.0, 1912.2, (-2265.32), 0.0);
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Size2D size2D0 = new Size2D();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-3505.5400390625), 0.0, 0.0, (-1395.75));
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 1669.34287111, 1669.34287111, rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.0F, 0.0F, 924.0F);
      line2D_Float0.setLine((-804.97485F), 1049.9648F, 0.0F, 924.0F);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 2.0F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultTableCellRenderer defaultTableCellRenderer0 = new DefaultTableCellRenderer();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(defaultTableCellRenderer0, (-818), (-818), (-1605), (-818), (-2126), (-818), 0, (-818), false, 0, (-1605), 0);
      Point point0 = mouseWheelEvent0.getLocationOnScreen();
      Line2D.Double line2D_Double0 = new Line2D.Double(point0, point0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 861.17F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 629.098785616887, 0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0);
      Rectangle2D rectangle2D0 = generalPath0.getBounds2D();
      Shape shape0 = ShapeUtilities.rotateShape(rectangle2D0, 0.0, 1714.4F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(779.45475, 1056.803158, 0.0, 0.0);
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) rectangle2D0, (RectangleAnchor) null, 0.0, 1863.2403746);
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
        ShapeUtilities.createTranslatedShape((Shape) null, (RectangleAnchor) null, (-1690.71), (-1690.71));
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
        ShapeUtilities.createTranslatedShape((Shape) null, 2153.1025395, 2153.1025395);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) generalPath0, 1197.979, (-2120.2));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDownTriangle(2.0F);
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createUpTriangle((-591.9F));
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createRegularCross(0.0F, 0.0F);
      GeneralPath generalPath1 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDownTriangle(2.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0);
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createDiagonalCross(0, 597.51F);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createRegularCross(0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int[] intArray0 = new int[5];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon0, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      arc2D_Double0.setFrameFromDiagonal((-528.78040588981), (double) 0, 2161.31189, 1.5);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(1157.2128F, 0.0F, 1157.2128F, 0.0F);
      Ellipse2D.Float ellipse2D_Float1 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      line2D_Float0.setLine(Double.NaN, (-5021.890009765625), (-1.0), Double.NaN);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-3505.5400390625), 0.0, 0.0, (-1395.75));
      Point2D point2D0 = RectangleAnchor.coordinates(rectangle2D_Double0, rectangleAnchor0);
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D0, point2D0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0);
      boolean boolean0 = ShapeUtilities.equal((Shape) generalPath0, (Shape) generalPath0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) polygon0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross((-561.37415F), 1.0F);
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, shape0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, (Shape) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-4265.0F), (-4265.0F), 115.79892F, 2.0F);
      GeneralPath generalPath0 = new GeneralPath(rectangle2D_Float0);
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, (Shape) generalPath0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(924.0F);
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.0F, 0.0F, 924.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, shape0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(924.0F);
      Shape shape1 = ShapeUtilities.clone(shape0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(2.0F);
      BufferedImage bufferedImage0 = new BufferedImage(92, 92, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      ShapeUtilities.drawRotatedShape(graphics2D0, shape0, (-937.79425787051), (-1.0F), 1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(0.0F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, 2410.249, (-3071.854163423));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0.0F);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField(0);
      TitledBorder titledBorder0 = new TitledBorder((Border) null, "|y6{");
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) jPasswordField0, (Border) titledBorder0, 0, 5927, 5927, 0);
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(1260.47509314076, 1260.47509314076, rectangle0);
  }
}