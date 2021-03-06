/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 12:00:50 GMT 2020
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
import java.awt.SystemColor;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JTextField;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.ShapeUtilities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShapeUtilities_ESTest extends ShapeUtilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(537, 537);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double((-3905.7618), 257.92867792599, 0.0, 1722.8680536550896);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(1092.0F);
      Shape shape1 = ShapeUtilities.rotateShape(shape0, 0.0F, 0.0F, 1935.7937F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      Shape shape2 = ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor0, (double) 0.0F, (double) 0.0F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.getPointInRectangle((-41.0F), (-41.0F), (Rectangle2D) null);
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
        ShapeUtilities.createLineRegion((Line2D) null, (-80.0F));
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
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, 0.0, 1.0, 1.0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      GeneralPath generalPath0 = new GeneralPath(rectangle0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float((-3030.36F), (-3030.36F), (-3030.36F), (-2465.045F));
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Point point0 = new Point();
      Line2D.Float line2D_Float0 = new Line2D.Float(point0, point0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1998.1423F), 0.0F, 2522.7427F, (-471.48F));
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Float0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 0.0, 0.0, 0.0);
      GeneralPath generalPath0 = new GeneralPath(rectangle2D_Double0);
      Rectangle rectangle0 = generalPath0.getBounds();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float((-3030.36F), (-3030.36F), (-3030.36F), (-2465.045F));
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle rectangle0 = line2D_Double0.getBounds();
      JTextField jTextField0 = new JTextField();
      Color color0 = Color.darkGray;
      SystemColor systemColor0 = SystemColor.textHighlight;
      SoftBevelBorder softBevelBorder0 = new SoftBevelBorder(4249, color0, color0, color0, systemColor0);
      Rectangle rectangle1 = AbstractBorder.getInteriorRectangle((Component) jTextField0, (Border) softBevelBorder0, (-2396), 0, 0, 0);
      boolean boolean0 = ShapeUtilities.contains(rectangle1, rectangle0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 0.0, 0.0, 0.0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Double0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float((-3030.36F), (-3030.36F), (-3030.36F), (-2465.045F));
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Double0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 1.0, 0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(1.0F, (-1.0F));
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape(shape0, (RectangleAnchor) null, 0.5, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, (RectangleAnchor) null, 0.0, (double) 0);
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
        ShapeUtilities.createTranslatedShape((Shape) null, (double) 0.0F, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double((-440.688754455), (-440.688754455), 2.0, (-2158.78998));
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createLineRegion(line2D_Double0, 1.0F);
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createDiamond(0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(473.0, 473.0, 473.0, 473.0);
      Rectangle rectangle0 = new Rectangle((-1360), (-6771));
      Rectangle2D rectangle2D0 = rectangle2D_Double0.createIntersection(rectangle0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) rectangle2D0, rectangleAnchor0, 196.5014, 473.0);
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createUpTriangle(0.0F);
      GeneralPath generalPath1 = new GeneralPath(shape0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GridBagLayout gridBagLayout0 = new GridBagLayout();
      Point point0 = gridBagLayout0.getLayoutOrigin();
      Line2D.Float line2D_Float0 = new Line2D.Float(point0, point0);
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(rectangle2D0, (-4540.0F), 0.0F, 0);
      Arc2D.Float arc2D_Float1 = new Arc2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(1);
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(2.0, 1709.7366897, 1, 1342.7335253273, 1709.7366897, (-3733.701904296875), 1);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(1.0, (-2.147483648E9), (-2.147483648E9), 1.0);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(3733.7018467176, 1.0, 0.0, 473.0);
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Point point0 = new Point(1689, 2783);
      Line2D.Float line2D_Float0 = new Line2D.Float(point0, point0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, (-5121.042F));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross((-1754.0F), (-1754.0F));
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, (double) (-1754.0F), (-1266.8426634038));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int[] intArray0 = new int[4];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) polygon0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Line2D.Float line2D_Float0 = new Line2D.Float(0, 0, (-1068), 0.0F);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, shape0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, (Shape) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, (-1.0F), (-2532.4F), 308.87228F);
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, (Shape) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(3124.0F, 3124.0F);
      Point2D.Double point2D_Double0 = new Point2D.Double();
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Double0, point2D_Double0);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, shape0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Point point0 = new Point(0, 0);
      Rectangle rectangle0 = new Rectangle(point0);
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(rectangle0, 0.0F, 0.0F, 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Float0, (Shape) rectangle0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(1233.2164F);
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, (-1514.06489), 1525.484877794);
      Shape shape2 = ShapeUtilities.clone(shape1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(1092.0F);
      Shape shape1 = ShapeUtilities.rotateShape(shape0, 0.0F, 0.0F, 1935.7937F);
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, shape1, 1, 0.0F, 0.5F);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(0.0F);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(537, 537);
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(0.0, (-3082.330714449777), rectangle0);
  }
}
