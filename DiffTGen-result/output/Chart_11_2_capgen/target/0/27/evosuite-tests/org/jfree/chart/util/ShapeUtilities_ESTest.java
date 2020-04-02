/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:59:22 GMT 2020
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
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.JViewport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.ShapeUtilities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShapeUtilities_ESTest extends ShapeUtilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      ellipse2D_Double0.setFrame(3998.0737, 0.0, 0.0, 1581.15);
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0, (-2.147483648E9), 0, (-2.147483648E9));
      rectangle2D_Double0.setRect((double) 0, (double) 0, 2583.920123, 0.0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0F, (-643.679885), 0.0F, (-643.679885));
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Double0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-799.61F), (-799.61F), 2.0F, 0.0F);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 1769.5F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(991.81F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond((-1.0F));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, 1537.245144335758, 0.0);
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
        ShapeUtilities.getPointInRectangle(0, (-2128.3155091), (Rectangle2D) null);
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
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiamond((-1711.1539F));
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
      Rectangle rectangle0 = new Rectangle(767, (-1832), (-1832), (-1832));
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(2269.90437493, 2269.90437493, 2269.90437493, Double.NEGATIVE_INFINITY);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(1.0F, 2.0F, 0.0F, 724.324F);
      Rectangle2D rectangle2D0 = rectangle2D_Double0.createIntersection(rectangle2D_Float0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0F, 1.0, (-1650.0074), 0.0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, (-3603.1811729), (-1527.4683F), (-1527.4683F));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(0.0F);
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape(shape0, (RectangleAnchor) null, (-4080.54583618), 984.489928418);
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
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
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, (double) 0.0F, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0.0F);
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, 1201.77036676, 1201.77036676);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      GeneralPath generalPath0 = new GeneralPath(polygon0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Line2D.Double line2D_Double0 = new Line2D.Double();
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createLineRegion(line2D_Double0, 2843.8F);
      GeneralPath generalPath1 = new GeneralPath(polygon0);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon(polygon0.xpoints, polygon0.xpoints, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
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
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      arc2D_Float0.setFrameFromCenter(1.7976931348623157E308, 1.7976931348623157E308, 1.7976931348623157E308, (-1092.569458));
      Point2D.Double point2D_Double0 = new Point2D.Double();
      arc2D_Float0.setAngles((Point2D) point2D_Double0, (Point2D) point2D_Double0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 0.0F, 1.0F, 0.0F);
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Line2D.Float line2D_Float1 = new Line2D.Float(0.0F, 0, 0.0F, 2706.1274F);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Point point0 = new Point();
      Line2D.Double line2D_Double0 = new Line2D.Double(point0, point0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      Shape shape0 = ShapeUtilities.createDiamond(962.592F);
      Shape shape1 = ShapeUtilities.rotateShape(shape0, 812.929, 0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape1, (Shape) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      Rectangle rectangle0 = ellipse2D_Double0.getBounds();
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(rectangle0, 0.0, 0.0, 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, (Shape) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-799.61F), (-799.61F), 2.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Shape shape0 = ShapeUtilities.createDownTriangle(1494.3F);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) polygon0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Vector<Point> vector0 = new Vector<Point>();
      JTable jTable0 = new JTable(vector0, vector0);
      Rectangle rectangle0 = jTable0.getCellRect(302, 2510, true);
      Shape shape0 = ShapeUtilities.clone(rectangle0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Shape shape0 = ShapeUtilities.clone(polygon0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross((-705.7264F), (-705.7264F));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-458), (-458));
      Rectangle2D rectangle2D0 = rectangle0.getFrame();
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, rectangle2D0, 0, 0, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0.0F);
      Shape shape1 = ShapeUtilities.createDownTriangle(0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JViewport jViewport0 = new JViewport();
      Rectangle rectangle0 = jViewport0.getViewRect();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle((-916.415113485315), 0.0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createUpTriangle((-2689.0F));
      GeneralPath generalPath1 = new GeneralPath(generalPath0);
      generalPath1.setWindingRule(0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }
}