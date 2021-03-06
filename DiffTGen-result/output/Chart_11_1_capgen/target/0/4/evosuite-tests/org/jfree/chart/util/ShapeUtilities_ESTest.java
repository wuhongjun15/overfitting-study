/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 10:23:40 GMT 2020
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Insets;
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
import java.text.Format;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.border.AbstractBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
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
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(644.2327F, 1.0F, 644.2327F, 1.0F);
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 1158.01F, 1158.01F, 0.0F);
      ellipse2D_Float0.setFrameFromCenter((double) 1158.01F, (-2120.843567), (-2120.843567), (-1228.91616));
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 1158.01F, 1158.01F, 0.0F);
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(3712.8026256, 3712.8026256, 158.0, 3712.8026256);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 2585.327F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(1620.3F, 1620.3F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (-2592.29), 0.5);
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
        ShapeUtilities.getPointInRectangle(1251.1500472, 1251.1500472, (Rectangle2D) null);
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
        ShapeUtilities.createLineRegion((Line2D) null, 2395.104F);
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
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiamond(3239.2703F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.textHighlightText;
      BevelBorder bevelBorder0 = new BevelBorder((-460), systemColor0, systemColor0);
      Rectangle rectangle0 = bevelBorder0.getInteriorRectangle((Component) null, (-460), 871, 871, (-4994));
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.0F, 0.0F, 0.0F);
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JViewport jViewport0 = new JViewport();
      Rectangle rectangle0 = jViewport0.getViewRect();
      rectangle0.grow((-2416), 1073741824);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-1232.07F), (-4143.132F), 0.0F, 0.0F);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 2344.04F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.0F, 0.0F, 0.0F);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, (-256.89843428816), (-3799.0F), (-3799.0F));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross((-1429.284F), (-1429.284F));
      Shape shape1 = ShapeUtilities.rotateShape(shape0, (-2193.0), 0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) defaultCaret0, (RectangleAnchor) null, 1655.9416, (-1376.45891451));
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, (double) 0, (double) 0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(0.0F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) 0.0F, (-1125.417807));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, (double) 0.0F, (double) 2798);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(2.0F);
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, 311.337, (double) 0.0F);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createUpTriangle(2.0F);
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createDiagonalCross(0.0F, 2.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createUpTriangle(2.0F);
      GeneralPath generalPath1 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon(polygon0.xpoints, polygon0.xpoints, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon(polygon0.ypoints, polygon0.xpoints, 0);
      polygon1.addPoint(2029, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, polygon0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(0);
      arc2D_Float0.y = 2.0F;
      Arc2D.Double arc2D_Double0 = new Arc2D.Double(0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-2613.300048828125), 0.0F, 987.9, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, (-381.5771632677695), Double.NaN, 0.5);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      JTable jTable0 = new JTable();
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      Rectangle rectangle0 = jTableHeader0.getHeaderRect((-7));
      Point2D point2D0 = RectangleAnchor.coordinates(rectangle0, rectangleAnchor0);
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, 0.5, 871.1418F, (-7));
      Line2D.Double line2D_Double1 = new Line2D.Double(point2D0, point2D0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond((-1226.2269F));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-61.957F), (-61.957F), 1560.9991F, 2122.1255F);
      Shape shape0 = ShapeUtilities.createDiagonalCross((-261.3831F), 1560.9991F);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Float0, (Shape) arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(1.0, 2.0, (-4531.87F), 2837.085001370167);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.0F, 0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) null);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, (Shape) rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField((Format) null);
      Insets insets0 = new Insets(0, (-1), 0, 78);
      ImageIcon imageIcon0 = new ImageIcon();
      MatteBorder matteBorder0 = new MatteBorder(insets0, imageIcon0);
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) jFormattedTextField0, (Border) matteBorder0, 2923, (-34), 0, 2311);
      Shape shape0 = ShapeUtilities.clone(rectangle0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createRegularCross((-1429.284F), (-1429.284F));
      GeneralPath generalPath1 = new GeneralPath(0, 78);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross((-2739.149F), (-2739.149F));
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, shape0, (-873.0), (-2739.149F), (-2739.149F));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(2.0F);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.0F, 0.0F, 0.0F);
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(0.0F, Double.NaN, rectangle2D0);
  }
}
