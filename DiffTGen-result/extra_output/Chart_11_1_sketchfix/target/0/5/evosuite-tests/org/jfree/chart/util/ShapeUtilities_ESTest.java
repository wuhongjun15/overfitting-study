/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:19:28 GMT 2020
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
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JInternalFrame;
import javax.swing.JViewport;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
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
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      rectangle2D_Double0.add(1655.290399468, 1655.290399468);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JInternalFrame jInternalFrame0 = new JInternalFrame();
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      Rectangle2D rectangle2D0 = rectangle0.getFrame();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(1.0F, 1.0F, (-2613.8137F), 1.0F);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Float0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, (-1.0), (-1.0));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, (-86.8F));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) 0.0F, 281.46343589518);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, 0.0F);
      Rectangle rectangle0 = shape0.getBounds();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(0.0, 0.0F, rectangle0);
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
        ShapeUtilities.createLineRegion((Line2D) null, 0.0F);
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
      DefaultCaret defaultCaret0 = new DefaultCaret();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0, (-60), 0, 0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, defaultCaret0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Border border0 = LineBorder.createGrayLineBorder();
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) null, border0, (-2146187085), (-2146187085), (-2146187085), (-2146187085));
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      Rectangle rectangle1 = ellipse2D_Double0.getBounds();
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-60), (-60));
      Rectangle2D rectangle2D0 = rectangle0.getFrame();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(4552.05307289, 2074.0, 778.8584977, 0.0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-1.0F));
      GeneralPath generalPath0 = new GeneralPath();
      generalPath0.append(shape0, true);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 0.0, (-584.8322F), (-584.8322F));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(1.0F);
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape(shape0, (RectangleAnchor) null, (double) 1.0F, (double) 1.0F);
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, 2160.2, 2160.2);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(1.0F, 1.0F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (-1360.749), (double) 0.0F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, 1.0, 520.6072);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(1.0F, 1.0F);
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, 2422.0, (double) 1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(324.8F);
      Shape shape1 = ShapeUtilities.createDownTriangle(0);
      boolean boolean0 = ShapeUtilities.equal(shape1, shape0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(1, 1);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      GeneralPath generalPath1 = new GeneralPath(0, 0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon(polygon0.xpoints, polygon0.ypoints, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon1, polygon0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, (Polygon) null);
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
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(0);
      Arc2D.Float arc2D_Float1 = new Arc2D.Float(2087.617F, 0.0F, 0.0F, (-5057.381F), 0.0F, 0.0F, 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(0, (-1076.459F), (-1673.0F), (-1076.459F), (-1076.459F), 0, 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.0, 0.0, (-957.0138868521262), 175.6345681);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(886.2F, (-3413.9F), 0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.5, 446.1062751, (-1220.954488507573), 0);
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, (-1.0F), 0, 333.7054F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      Point2D point2D0 = arc2D_Double0.getStartPoint();
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D0, point2D0);
      Line2D.Float line2D_Float1 = new Line2D.Float(0.0F, 1, 768.4574F, 768.4574F);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JViewport jViewport0 = new JViewport();
      Point point0 = jViewport0.getViewPosition();
      Line2D.Double line2D_Double0 = new Line2D.Double(point0, point0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) null);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JViewport jViewport0 = new JViewport();
      Point point0 = jViewport0.getViewPosition();
      Line2D.Double line2D_Double0 = new Line2D.Double(point0, point0);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0.0F);
      Shape shape1 = ShapeUtilities.rotateShape(shape0, 0.0, (-1140.8871F), 1195.84F);
      Shape shape2 = ShapeUtilities.clone(shape1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, ellipse2D_Float0, 1457.6727152457308, 2792.9F, 519.9093F);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.getPointInRectangle(367.474, 367.474, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(0.0F);
  }
}