/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 10:23:37 GMT 2020
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
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.StyleContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.ShapeUtilities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShapeUtilities_ESTest extends ShapeUtilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Float0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-1), 0, 0, 670);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(2151.0F, 14.107F, (-572.8F), 0.0F);
      int[] intArray0 = new int[7];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Rectangle rectangle0 = polygon0.getBounds();
      Rectangle2D rectangle2D0 = rectangle2D_Float0.createUnion(rectangle0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.5, (-184.1706306), 3270.020777076, 3270.020777076);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1387.19F), (-138.407F), (-2271.4917F), (-2141.243F));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, (-1387.19F));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond((-3769.988F));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) (-3769.988F), (-833.084283923));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JScrollPane jScrollPane0 = new JScrollPane();
      Rectangle rectangle0 = jScrollPane0.getViewportBorderBounds();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle((-2352.698937818), 2192.516098, rectangle0);
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
        ShapeUtilities.createLineRegion((Line2D) null, (-1.0F));
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
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiamond(474.67813F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1387.19F), (-138.407F), (-2271.4917F), (-2141.243F));
      Rectangle rectangle0 = line2D_Float0.getBounds();
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StyleContext styleContext0 = new StyleContext();
      StyleContext.NamedStyle styleContext_NamedStyle0 = styleContext0.new NamedStyle();
      Color color0 = styleContext0.getForeground(styleContext_NamedStyle0);
      SoftBevelBorder softBevelBorder0 = new SoftBevelBorder((-4295), color0, color0, color0, color0);
      DefaultFormatterFactory defaultFormatterFactory0 = new DefaultFormatterFactory((JFormattedTextField.AbstractFormatter) null, (JFormattedTextField.AbstractFormatter) null, (JFormattedTextField.AbstractFormatter) null, (JFormattedTextField.AbstractFormatter) null);
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField((JFormattedTextField.AbstractFormatterFactory) defaultFormatterFactory0);
      Rectangle rectangle0 = softBevelBorder0.getInteriorRectangle((Component) jFormattedTextField0, (-4295), 2582, 2582, (-4295));
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Rectangle rectangle0 = line2D_Float0.getBounds();
      JProgressBar jProgressBar0 = new JProgressBar(0, 0);
      Border border0 = LineBorder.createBlackLineBorder();
      CompoundBorder compoundBorder0 = new CompoundBorder(border0, border0);
      Rectangle rectangle1 = AbstractBorder.getInteriorRectangle((Component) jProgressBar0, (Border) compoundBorder0, (-335), 1567, 0, (-335));
      rectangle0.setRect((Rectangle2D) rectangle1);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(945, (-2636));
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Rectangle2D rectangle2D0 = rectangle2D_Float0.createUnion(rectangle0);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 2531.980345, 0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[9];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) polygon0, (RectangleAnchor) null, 0.0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, 0.0, (-1.0));
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM;
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) line2D_Double0, rectangleAnchor0, (-2441.115820408758), 0.0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, 0.0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 1262.0F);
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, 3699.63532905366, 0.0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      GeneralPath generalPath0 = new GeneralPath(arc2D_Float0);
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createRegularCross(0.0F, (-1.0F));
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiagonalCross((-333.9663F), (-333.9663F));
      GeneralPath generalPath1 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[9];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Polygon polygon1 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int[] intArray0 = new int[4];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, polygon0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(1664.6498F, 1664.6498F, 0.0F, 1664.6498F);
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(13.669689, 0.0F, 2522.78991514, 0.0);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Double0);
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
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1860.7178F), (-1860.7178F), (-1860.7178F), (-1860.7178F));
      line2D_Float0.x2 = 77.33563F;
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, (-1860.7178F), (-1860.7178F), 3351.10235);
      line2D_Double0.setLine((Line2D) line2D_Float0);
      line2D_Double0.x2 = (double) (-1860.7178F);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond((-1460.0F));
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond((-1460.0F));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0.0, (-2459.983674924869), (-2459.983674924869), 0.0F, 1972.88, (-2349.282152), 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, (Shape) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1860.7178F), (-1860.7178F), (-1860.7178F), (-1860.7178F));
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, (-1860.7178F), (-1860.7178F), 3351.10235);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 1262.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) null, shape0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross((-138.407F), 1467.6608F);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JScrollPane jScrollPane0 = new JScrollPane();
      Rectangle rectangle0 = jScrollPane0.getViewportBorderBounds();
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, rectangle0, 1, 2.0F, 1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(0.0F);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(0.0F);
      Shape shape1 = ShapeUtilities.rotateShape(shape0, Double.POSITIVE_INFINITY, (-1.0F), 0.0F);
      Shape shape2 = ShapeUtilities.clone(shape1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.getPointInRectangle(0.0, 0.0, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(0.0F);
  }
}
