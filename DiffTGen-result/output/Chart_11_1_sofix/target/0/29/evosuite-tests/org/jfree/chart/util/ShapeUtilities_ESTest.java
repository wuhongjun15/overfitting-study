/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 12:00:48 GMT 2020
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Font;
import java.awt.Graphics2D;
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
import java.awt.image.BufferedImage;
import javax.swing.JTable;
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
      JTable jTable0 = new JTable(0, 0);
      Rectangle rectangle0 = jTable0.getBounds();
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      Size2D size2D0 = new Size2D(1207.8944F, 1207.8944F);
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, (-1.0F), 1939.0, rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float((-2043.7438F), 1288.0726F, 1160.0F, (-2043.7438F));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, (-2043.7438F));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      line2D_Double0.x2 = (-1.7976931348623157E308);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-1.0F));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JTable jTable0 = new JTable(0, 0);
      Rectangle rectangle0 = jTable0.getBounds();
      rectangle0.setFrameFromCenter((double) 0, 2.0, (double) 2, 2.0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) rectangle0, rectangleAnchor0, 394.15128803054, (double) 0);
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
        ShapeUtilities.getPointInRectangle((-1.0F), 0.0, (Rectangle2D) null);
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
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiamond(1326.8617F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0, 0, 0, 0.0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(134.408F, 134.408F, 134.408F, 134.408F);
      rectangle2D_Float0.setFrame((double) 2339, 4.19, 4.19, (double) (-1));
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Float0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Font font0 = Font.decode("~");
      AffineTransform affineTransform0 = AffineTransform.getQuadrantRotateInstance(3375);
      FontRenderContext fontRenderContext0 = new FontRenderContext(affineTransform0, true, true);
      Rectangle2D rectangle2D0 = font0.getStringBounds(";XwI'uYG2Xx", fontRenderContext0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle rectangle0 = line2D_Double0.getBounds();
      rectangle0.width = (-2648);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-2266.6833F));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 0.0, 0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) rectangle0, (RectangleAnchor) null, 2.0, (double) 0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, 88.09821607228, 2778.584358595707);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, 0.0F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) 0.0F, 0.5);
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
      Line2D.Double line2D_Double0 = new Line2D.Double(0, 0, 0, 0.0);
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) line2D_Double0, 2.0, (double) 0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiamond(1326.8617F);
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createRegularCross(0.80801004F, 0.80801004F);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(1326.8617F);
      GeneralPath generalPath0 = new GeneralPath(shape0);
      generalPath0.moveTo(1326.8617F, (-2952.5F));
      boolean boolean0 = ShapeUtilities.equal((Shape) generalPath0, shape0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[2];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Polygon polygon1 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float((-2648), (-1029.0F), 0, 0, 0, 0, 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-1525.0198913838), (-346.15), (-346.15), 0.0);
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 301.58F, (-1.0F), 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(1.0F, 3014.034F, 1.0F, 1.0F);
      Line2D.Float line2D_Float1 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.0F, (-197.62273F), 0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle((-626.2F));
      Shape shape1 = ShapeUtilities.rotateShape(shape0, (-626.2F), 1895.8712F, 1895.8712F);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, (Shape) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Line2D.Double line2D_Double0 = new Line2D.Double((-1282.0), (-341.19011103), (-1171.588294605), 0.0F);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, shape0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, 0.0, 0.0, 0.0F);
      Shape shape0 = ShapeUtilities.clone(line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Shape shape0 = ShapeUtilities.clone(polygon0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(0.0F, (-1.0F));
      Shape shape1 = ShapeUtilities.rotateShape(shape0, 0.0F, (-1.0F), (-1.0F));
      Line2D.Double line2D_Double0 = new Line2D.Double(0, 0, 0, 0.0);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, shape1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(0.0F);
      Shape shape1 = ShapeUtilities.rotateShape(shape0, 0.0, 0.0F, 0.0F);
      BufferedImage bufferedImage0 = new BufferedImage(6, 6, 6);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      ShapeUtilities.drawRotatedShape(graphics2D0, shape1, (-2066.559), 0.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(0, 0);
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(0.0F, (-1.0F), rectangle0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(0.0F);
  }
}
