/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:53:40 GMT 2020
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
      Rectangle rectangle0 = new Rectangle(784, 784, (-1237), 784);
      rectangle0.setFrameFromCenter((-370.92114775), 0.0, Double.NEGATIVE_INFINITY, (double) 1.0F);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(1, 0);
      Rectangle2D rectangle2D0 = rectangle0.getFrame();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.5, 0.5, (-826.140294836145), (-1.0));
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.0F, 0.0F, 0.0F);
      Line2D.Float line2D_Float1 = new Line2D.Float(1.0F, 0.0F, 1056.645F, 0.0F);
      line2D_Float0.setLine((Line2D) line2D_Float1);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(861.863F, 0.0F, 0.0F, (-1.0F));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) ellipse2D_Float0, rectangleAnchor0, (double) 0.0F, 648.60917274);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiamond(0.0F);
      Polygon polygon0 = new Polygon();
      GeneralPath generalPath1 = new GeneralPath(polygon0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
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
        ShapeUtilities.getPointInRectangle(0.0, Double.POSITIVE_INFINITY, (Rectangle2D) null);
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
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
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
  public void test10()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiamond(0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(1.0F, 0, (-1543.5623F), 0);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(1.0, 0.0, 1.0, 0.0);
      Rectangle rectangle0 = new Rectangle(1679, 1679, 1900, 1900);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      Size2D size2D0 = new Size2D();
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, (-1026.6206600121), (-788.0), rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(1.0F, 1.0F, (-1108.79F), (-1108.79F));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 1.0F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, (-7813.02546), 1.0F, 1.0F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(0.0F, 0.0F);
      Shape shape1 = ShapeUtilities.rotateShape(shape0, 0.0F, (-34.288006F), 0.0F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) polygon0, (RectangleAnchor) null, (double) 0, 762.053);
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, (double) 0.0F, (-1572.8105624328216));
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
        ShapeUtilities.createTranslatedShape((Shape) null, 2153.32, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      Size2D size2D0 = new Size2D();
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, (-1026.6206600121), (-788.0), rectangleAnchor0);
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) rectangle2D0, (double) 0.0F, 0.0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiamond(0.0F);
      GeneralPath generalPath1 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      GeneralPath generalPath0 = new GeneralPath(polygon0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon(polygon0.xpoints, polygon0.ypoints, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(0.0F, (-977.30414F), (-977.30414F), 0.0F, (-977.30414F), (-977.30414F), 1);
      Arc2D.Float arc2D_Float1 = new Arc2D.Float(1178.0F, (-926.0F), (-926.0F), (-977.30414F), (-977.30414F), (-1.0F), 1);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float1, (Arc2D) arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(721.5801542, (-2560.414877613), 0.0, 0.0F, 0.0, 0.0F, 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Ellipse2D.Float ellipse2D_Float1 = new Ellipse2D.Float(861.863F, 0.0F, 0.0F, (-1.0F));
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Line2D.Float line2D_Float0 = new Line2D.Float();
      line2D_Float0.y1 = (-1.0F);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double((-195.6), 0.0);
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Double0, point2D_Double0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      Shape shape0 = ShapeUtilities.createDiagonalCross(1206.4003F, 1206.4003F);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) rectangle0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(721.5801542, (-2560.414877613), 0.0, 0.0F, 0.0, 0.0F, 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, (Shape) null);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-1270.2462962072), 2734.015250926, 2734.015250926, 2734.015250926);
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, (Shape) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(100.58F, 100.58F, (-2143.1F), 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, (-1.0F), (-1.0F), 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(0.0F);
      Rectangle rectangle0 = shape0.getBounds();
      Shape shape1 = ShapeUtilities.clone(rectangle0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Shape shape0 = ShapeUtilities.clone(polygon0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, 0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) ellipse2D_Float0, rectangleAnchor0, (double) 0.0F, 648.60917274);
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, shape0, 0.0, 0.0F, (-1230.9F));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDownTriangle(0.0F);
      GeneralPath generalPath1 = new GeneralPath(0, 600);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(0.0F);
      Rectangle rectangle0 = shape0.getBounds();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(966.1749, 2.0, rectangle0);
  }
}
