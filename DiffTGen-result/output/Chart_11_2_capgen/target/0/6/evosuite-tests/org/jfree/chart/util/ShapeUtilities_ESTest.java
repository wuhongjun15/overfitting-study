/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:50:33 GMT 2020
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
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
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
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
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(257.9F, 257.9F, 1.0F, 923.9599F);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Float0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-2114.227F), (-2114.227F), (-798.8318F), (-798.8318F));
      Rectangle2D rectangle2D0 = rectangle2D_Float0.getBounds2D();
      rectangle2D_Float0.height = (-2114.227F);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      Rectangle rectangle1 = polygon0.getBounds();
      rectangle0.setFrame((-1235.692085367458), 2.0, 877.527639871905, 1808.361811208516);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(132.0451155, (-1835.735), (-1.0F), 1750.81763);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 1339.5F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      line2D_Double0.x2 = 1.0;
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-2233.7837F));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(534.144F, 2229.273F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) 534.144F, (double) 2229.273F);
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
        ShapeUtilities.getPointInRectangle((-2286.82191377), (-2286.82191377), (Rectangle2D) null);
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
        ShapeUtilities.createLineRegion((Line2D) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(1756.63291146, 0.0F, 0.0, (-1154.95139));
      Rectangle rectangle0 = line2D_Double0.getBounds();
      // Undeclared exception!
      try { 
        ShapeUtilities.contains((Rectangle2D) null, rectangle0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(defaultCaret0, 0, 0, 0);
      Arc2D.Float arc2D_Float1 = new Arc2D.Float(1);
      arc2D_Float0.setArc((Arc2D) arc2D_Float1);
      GeneralPath generalPath0 = new GeneralPath(arc2D_Float0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiamond((-2115.9194F));
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createDiagonalCross((-798.8318F), 900.31104F);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GridBagLayout gridBagLayout0 = new GridBagLayout();
      Point point0 = gridBagLayout0.location(1, 1);
      Line2D.Double line2D_Double0 = new Line2D.Double(point0, point0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, 0.0, (-1235.692085367458), 0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0, (-1235.692085367458), (-416.9968638212896), 0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      Size2D size2D0 = new Size2D(1.0, Double.NaN);
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 0.0, 0.0, rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Color color0 = Color.ORANGE;
      LineBorder lineBorder0 = new LineBorder(color0, 28);
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) null, (Border) lineBorder0, (-1558), 28, (-1558), 0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-2115.9194F), (-2115.9194F), (-798.8318F), (-798.8318F));
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Float0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Point point0 = new Point(0, (-1));
      Line2D.Double line2D_Double0 = new Line2D.Double(point0, point0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 2343);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 0.0, 0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Shape shape0 = ShapeUtilities.rotateShape(polygon0, 952.5314649097, 0, (-4293.0F));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0.0F);
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape(shape0, (RectangleAnchor) null, (double) (-600.0638F), 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, (-2778.21532616515), 2106.5319981634);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-2115.9194F), (-2115.9194F), (-798.8318F), (-798.8318F));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) rectangle2D_Float0, rectangleAnchor0, 5969.2613325508, (double) (-2115.9194F));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, (-3353.5099543028), (double) 0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) rectangle2D0, 0.0, (-1.0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(0.0F, 0.0F);
      Shape shape1 = ShapeUtilities.createRegularCross(0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape1, shape0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createRegularCross((-4293.0F), (-4293.0F));
      boolean boolean0 = ShapeUtilities.equal(generalPath0, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon(polygon0.ypoints, polygon0.xpoints, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int[] intArray0 = new int[6];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 1);
      Polygon polygon1 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float((-1922.961F), 2.0F, (-1922.961F), (-1922.961F));
      Ellipse2D.Float ellipse2D_Float1 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, (-368.8F), 421.426F, 421.426F);
      Line2D.Float line2D_Float1 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double((-1276.6591), (-1276.6591));
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D_Double0, point2D_Double0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross((-2400.55F), (-2400.55F));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) polygon0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Float0, (Shape) arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle2D rectangle2D0 = polygon0.getBounds2D();
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Float0, (Shape) rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GridBagLayout gridBagLayout0 = new GridBagLayout();
      Point point0 = gridBagLayout0.location(1, 1);
      Line2D.Double line2D_Double0 = new Line2D.Double(point0, point0);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0.0F);
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(6, 1172);
      Shape shape0 = ShapeUtilities.clone(rectangle0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, (Shape) null, (-2.147483648E9), 0, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(0.0F);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(2120.655502780982, (-1879.3477), rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(276.0F);
  }
}
