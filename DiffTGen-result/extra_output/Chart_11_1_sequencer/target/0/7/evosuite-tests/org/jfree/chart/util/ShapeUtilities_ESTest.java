/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:38:34 GMT 2020
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
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.border.BevelBorder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.ShapeUtilities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShapeUtilities_ESTest extends ShapeUtilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      rectangle0.setFrameFromDiagonal(548.796, 514.45746124, 514.45746124, 0.5);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-3004.50987635), 0.0, (-1118.2645666047395), 0);
      rectangle0.translate(1621, 0);
      Rectangle rectangle1 = ellipse2D_Double0.getBounds();
      Rectangle2D rectangle2D0 = rectangle2D_Double0.createUnion(rectangle0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle rectangle0 = line2D_Double0.getBounds();
      rectangle0.translate(1621, 0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Double0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-930.95F), (-930.95F), (-930.95F), (-2869.0F));
      line2D_Float0.setLine((-2869.0F), 0.0F, (-895.0F), (-2869.0F));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 764.1F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, (-184.5F), (-184.5F), (-184.5F));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      Line2D.Float line2D_Float0 = new Line2D.Float((-2426.3677F), (-2426.3677F), 0.0F, 1.0F);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, 1573.0F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) 0.0F, (-1.7976931348623157E308));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle2D rectangle2D0 = polygon0.getBounds2D();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(0.0, 573.298F, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createLineRegion((Line2D) null, 3600.72F);
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
      Line2D.Double line2D_Double0 = new Line2D.Double();
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createLineRegion(line2D_Double0, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-2009.874894458), (-2009.874894458), (-2009.874894458), (-2009.874894458));
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(3555.3F, 3555.3F, 3555.3F, (-1.0F));
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(1220.8F, 1220.8F, 1220.8F, (-1052.699F));
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      ellipse2D_Double0.width = (double) (-1357.68F);
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double();
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Double0, point2D_Double0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Rectangle2D rectangle2D0 = rectangle0.getFrame();
      rectangle0.y = 1133;
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1937.86F), (-2943.026F), 2.0F, (-1937.86F));
      Rectangle rectangle0 = line2D_Float0.getBounds();
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, (-302.4842093), (-3618.864F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, 2.0, 2.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) polygon0, 0.0, (-67.1643527013));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (-2147.173074665), 0.0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, 898.5128, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiagonalCross(0.0F, 0.0F);
      GeneralPath generalPath1 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon(polygon0.xpoints, polygon0.ypoints, 1);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Point2D.Float point2D_Float0 = new Point2D.Float((-2075.7F), (-2075.7F));
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Float0, point2D_Float0);
      Line2D.Double line2D_Double1 = new Line2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double1, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(937.0F);
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(1.0, 1.0, 1.0, 1.0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-876.07495F));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) polygon0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, (Shape) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-2009.874894458), (-2009.874894458), (-2009.874894458), (-2009.874894458));
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(3555.3F, 3555.3F, 3555.3F, (-1.0F));
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, (Shape) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(1.0, 1.0, 1.0, 1.0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-876.07495F));
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, shape0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.0F, 0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(0);
      Shape shape0 = ShapeUtilities.rotateShape(arc2D_Float0, 0.0, 0.0F, 1210.413F);
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Float0, shape0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle((-2075.7F));
      Shape shape1 = ShapeUtilities.clone(shape0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(0.0F, (-443.83197F));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Color color0 = Color.red;
      BevelBorder bevelBorder0 = new BevelBorder(2018, color0, color0, color0, color0);
      ImageIcon imageIcon0 = new ImageIcon("O`l-|");
      JMenuItem jMenuItem0 = new JMenuItem(imageIcon0);
      Rectangle rectangle0 = bevelBorder0.getInteriorRectangle((Component) jMenuItem0, 2689, 2689, 2689, 0);
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, rectangle0, 2689, 2689, (-4124.9614F));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(0.0F);
      Shape shape1 = ShapeUtilities.createDownTriangle(1218.204F);
      boolean boolean0 = ShapeUtilities.equal(shape1, shape0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0.0F);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.getPointInRectangle(1.7976931348623157E308, (-1038.486), (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }
}
