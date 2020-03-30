/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:28:20 GMT 2020
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
      Rectangle rectangle0 = new Rectangle(1332, 1332, 366, 366);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0, 0, (-2590.896498), (-2203.396104));
      boolean boolean0 = ShapeUtilities.contains(defaultCaret0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(1332, 1332, 366, 366);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Point2D.Float point2D_Float0 = new Point2D.Float(0, (-558.0589F));
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Float0, point2D_Float0);
      line2D_Double0.x2 = 1338.99;
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(2.0F, 0.0F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) 2.0F, (double) 0.0F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.getPointInRectangle(0.0, 0.0F, (Rectangle2D) null);
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
        ShapeUtilities.createLineRegion((Line2D) null, 2145.0F);
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
        ShapeUtilities.contains((Rectangle2D) null, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(1.0F, 0.0F, 1.0F, 1.0F);
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDownTriangle(0.0F);
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createLineRegion(line2D_Float0, 1.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiagonalCross(0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle rectangle0 = line2D_Double0.getBounds();
      rectangle0.setSize(2247, (-491));
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 0.0F, 0.0F, (-5239.9F));
      ellipse2D_Float0.width = (-5239.9F);
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-1.0), (-1.0), (-1477.61074581264), (-1.0));
      Rectangle rectangle0 = ellipse2D_Double0.getBounds();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      Size2D size2D0 = new Size2D();
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, (-1.7976931348623157E308), (-1477.61074581264), rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(3880, 3880, (-1947.8715), (-1947.8715));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 3880);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, (-3091.91980064416), 0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 1251.994F);
      Shape shape1 = ShapeUtilities.rotateShape(shape0, (-2763.4736F), 1251.994F, 843.2114F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(1071.007399122884, 1071.007399122884, 1071.007399122884, (-638.2106219596));
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) line2D_Double0, (RectangleAnchor) null, (-1468.0), (-638.2106219596));
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
        ShapeUtilities.createTranslatedShape((Shape) null, (RectangleAnchor) null, (-3091.91980064416), (double) 0.0F);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0.0F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, 0.0, 1.0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, 0.0, (-1.0));
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createUpTriangle(1.0F);
      GeneralPath generalPath1 = new GeneralPath(1);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon(polygon0.ypoints, polygon0.xpoints, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, polygon0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      arc2D_Float0.setAngles((-1769.55287287), (-1769.55287287), (-991.4646932), (-1769.55287287));
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(1367, 3012.74418438603, 0, (-1752.826), 847.316628, 3012.74418438603, 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Ellipse2D.Float ellipse2D_Float1 = new Ellipse2D.Float(1194.0F, 0.0F, 0.0F, 1.0F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(1.0F, 1.0F, 1.0F, 1.0F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-1.0), (-1.0), (-1477.61074581264), (-1.0));
      Rectangle rectangle0 = ellipse2D_Double0.getBounds();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      rectangle0.setFrameFromDiagonal(4084.93036, 1960.5779567, 1960.5779567, 535.160953399177);
      Point2D point2D0 = RectangleAnchor.coordinates(rectangle0, rectangleAnchor0);
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D0, point2D0);
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 1251.994F);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(2678.337981166, (-4078.19157354885), 2678.337981166, (-560.44401349863), 2678.337981166, Double.NEGATIVE_INFINITY, 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, (Shape) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) arc2D_Float0, (double) 0.0F, (double) 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Float0, shape0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, (Shape) polygon0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) polygon0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double();
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D_Double0, point2D_Double0);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(805.11945477541, 805.11945477541, 1.0, 805.11945477541);
      Shape shape0 = ShapeUtilities.clone(rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross((-563.253F), (-563.253F));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, line2D_Double0, 0.0, 668.628F, 0.0F);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 0.0F, 0.0F, (-5239.9F));
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(0.0F, (-2273.9289815), rectangle2D0);
  }
}