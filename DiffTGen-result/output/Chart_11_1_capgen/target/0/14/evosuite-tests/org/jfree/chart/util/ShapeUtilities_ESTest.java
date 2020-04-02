/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 10:26:40 GMT 2020
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.table.JTableHeader;
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
      Line2D.Double line2D_Double0 = new Line2D.Double();
      line2D_Double0.setLine(0.5, Double.POSITIVE_INFINITY, (-2.147483648E9), (-2.147483648E9));
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JPanel jPanel0 = new JPanel(true);
      Point point0 = jPanel0.getLocation((Point) null);
      SynthSeparatorUI synthSeparatorUI0 = new SynthSeparatorUI();
      Dimension dimension0 = synthSeparatorUI0.getMaximumSize(jPanel0);
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double((-2191.0F), 0, (-1.0), (-3692.369398823545));
      line2D_Double0.y1 = (double) (-2191.0F);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-2191.0F));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      line2D_Double0.setLine(0.5, Double.POSITIVE_INFINITY, (-2.147483648E9), (-2.147483648E9));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 1.0F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross((-1230.979F), (-1230.979F));
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, 0.0, (double) (-1230.979F));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      Shape shape2 = ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor0, 2.0, 0.5);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 0.0F, 0.0F, 2152.4446F);
      // Undeclared exception!
      try { 
        ShapeUtilities.intersects(rectangle2D_Float0, (Rectangle2D) null);
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
        ShapeUtilities.getPointInRectangle(2.0, 2.0, (Rectangle2D) null);
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
        ShapeUtilities.createLineRegion((Line2D) null, 1472.0F);
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
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiagonalCross((-1335.3F), 0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(1.5, 0.5, 1109.5696154992, 1.0);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(2187.9438F, 0.0F, 0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      boolean boolean0 = ShapeUtilities.intersects(defaultCaret0, defaultCaret0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float((-1.0F), (-1.0F), (-1.0F), (-2312.985F));
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 0.0F, 0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(1869, (-703));
      Shape shape1 = ShapeUtilities.rotateShape(shape0, 1.7976931348623157E308, 1, (-702.1147F));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(0.0F, 2078.0F);
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape(shape0, (RectangleAnchor) null, (double) 0.0F, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, (-1067.380388314), 0.0);
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
        ShapeUtilities.createTranslatedShape((Shape) null, (-230.0564409348439), (-4847.012006054519));
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createUpTriangle((-2319.985F));
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createDiagonalCross((-236.52F), (-3714.5862F));
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, polygon0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      Arc2D.Double arc2D_Double1 = new Arc2D.Double((-1868.3648681640625), 3250.0, 1.7976931348623157E308, 1.0, (-1.0), 0.5, 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(452.6F, (-2949.5F), 452.6F, (-1746.26F));
      Ellipse2D.Float ellipse2D_Float1 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Point2D.Double point2D_Double0 = new Point2D.Double((-2680.88), 3684.0);
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D_Double0, point2D_Double0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(2187.9438F, 0.0F, 0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1181.8F), (-1181.8F), (-1747.3F), 1.0F);
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(1869, (-703));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-614.0), (-614.0), (-128.7), (-128.7));
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, (Shape) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(1.0F, 0.0F, 1.0F, (-4153.2324F));
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross((-1230.979F), (-1230.979F));
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, shape0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond((-2025.8F));
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, (double) (-2025.8F), (-2432.7));
      Shape shape2 = ShapeUtilities.clone(shape1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(0.0F, 2078.0F);
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, (double) (-1.0F), (double) 2078.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JTableHeader jTableHeader0 = new JTableHeader();
      Rectangle rectangle0 = jTableHeader0.getHeaderRect(87);
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, rectangle0, 87, 633, 87);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(0.0F);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Font font0 = Font.decode(";ZD|;Utn)t!I");
      FontRenderContext fontRenderContext0 = new FontRenderContext((AffineTransform) null, true, true);
      Rectangle2D rectangle2D0 = font0.getStringBounds(";ZD|;Utn)t!I", fontRenderContext0);
      Point2D point2D0 = ShapeUtilities.getPointInRectangle((-2432.7), 42.02914, rectangle2D0);
  }
}