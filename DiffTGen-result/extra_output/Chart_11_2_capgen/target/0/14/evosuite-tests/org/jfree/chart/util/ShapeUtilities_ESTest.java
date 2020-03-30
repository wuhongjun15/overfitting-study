/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:53:36 GMT 2020
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.Polygon;
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShapeUtilities_ESTest extends ShapeUtilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(2339.34F);
      Rectangle2D rectangle2D0 = shape0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.5, 0.5, 262.0F, (-2151.66879216446));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-378.0F));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(877.5F, (-2528.6165F));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) (-2528.6165F), (-1.0));
      Shape shape2 = ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor0, (-1.0), (double) (-2528.6165F));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      // Undeclared exception!
      try { 
        ShapeUtilities.intersects(defaultCaret0, (Rectangle2D) null);
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
        ShapeUtilities.getPointInRectangle((-581.479), (-581.479), (Rectangle2D) null);
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
        ShapeUtilities.createLineRegion((Line2D) null, (-810.7934F));
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
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiagonalCross(1219.3F, 1219.3F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-2046.8832F), (-1633.0F), (-3096.711F), (-3096.711F));
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle2D rectangle2D0 = polygon0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      rectangle2D_Double0.setFrame((double) 1219.3F, (-1301.216191), (-1301.216191), (-1301.216191));
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross((-952.0F), (-1633.0F));
      Rectangle2D rectangle2D0 = shape0.getBounds2D();
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(696.0673F, 1.5, (-2154.8928493339426), 0.0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-1366.0F));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0F, (-2081.04073), 0.0F, Double.NEGATIVE_INFINITY);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-4198.524F));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 1288.71855953752, 2.0F, 2.0F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(150.0F, (-1.0F));
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape(shape0, (RectangleAnchor) null, (double) 150.0F, (double) (-1.0F));
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, (double) 2.0F, (double) 2.0F);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, 0.5, 0.5);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiamond(0);
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createDownTriangle(696.0673F);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      Point point0 = new Point(31, 1097);
      arc2D_Double0.setArcByTangent(point0, point0, point0, 1488.9197);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float((-1.0F), 0, 0.0F, 0);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(1197.42F, 1403.47F, (-1.0F), (-965.22845F));
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1059.6393F), (-1059.6393F), (-1059.6393F), (-1059.6393F));
      Line2D.Float line2D_Float1 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle((-797.44F));
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, 0.0, 2332.56648733182);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, (-1505.85277), 0.0, 0.0);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      GridBagLayout gridBagLayout0 = new GridBagLayout();
      Point point0 = gridBagLayout0.location(100, 0);
      Line2D.Double line2D_Double0 = new Line2D.Double(point0, point0);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(1219.3F, 1219.3F);
      Shape shape1 = ShapeUtilities.clone(shape0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross((-952.0F), (-1633.0F));
      Shape shape1 = ShapeUtilities.rotateShape(shape0, 0.0, 345.243F, (-1633.0F));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, polygon0, Double.NaN, (-1856.974F), 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 0.0F, 0.0F, 0.0F);
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(Float.NEGATIVE_INFINITY, 0.0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle((-1.0F));
  }
}