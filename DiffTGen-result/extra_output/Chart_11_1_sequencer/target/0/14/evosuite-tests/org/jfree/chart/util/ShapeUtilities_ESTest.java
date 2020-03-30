/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:41:35 GMT 2020
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
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.LinkedHashMap;
import java.util.Map;
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
      LinkedHashMap<Format.Field, Integer> linkedHashMap0 = new LinkedHashMap<Format.Field, Integer>();
      LinkedHashMap<AttributedCharacterIterator.Attribute, Integer> linkedHashMap1 = new LinkedHashMap<AttributedCharacterIterator.Attribute, Integer>(linkedHashMap0);
      Font font0 = Font.getFont((Map<? extends AttributedCharacterIterator.Attribute, ?>) linkedHashMap1);
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance((-80.0), 2754.6826422, 1024.0423887, 0.0);
      FontRenderContext fontRenderContext0 = new FontRenderContext(affineTransform0, true, true);
      Rectangle2D rectangle2D0 = font0.getStringBounds("njvF0x]WOr", fontRenderContext0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0, 0, (-1441));
      line2D_Float0.setLine(342.5047, 0.0, 2883.372261, 2883.372261);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 2883.3723F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle(1.0F);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (double) 1.0F, 1446.0);
      Shape shape2 = ShapeUtilities.createTranslatedShape(shape1, rectangleAnchor0, (double) 1.0F, (-955.436402454));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(648.3F, 648.3F, 648.3F, 648.3F);
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
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.getPointInRectangle(0.0, 994.588725, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      polygon0.npoints = 3907;
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) polygon0, rectangleAnchor0, (double) 0.0F, 1299.0445832808275);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("java.awt.Polygon", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiamond(0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float((-1126.0123F), (-1126.0123F), 1108.7473F, (-662.0F));
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 1223.96F, 560.974F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-5.223), 0.0, (-5.223), 1.7976931348623157E308);
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashMap<Format.Field, Integer> linkedHashMap0 = new LinkedHashMap<Format.Field, Integer>();
      LinkedHashMap<AttributedCharacterIterator.Attribute, Integer> linkedHashMap1 = new LinkedHashMap<AttributedCharacterIterator.Attribute, Integer>(linkedHashMap0);
      Font font0 = Font.getFont((Map<? extends AttributedCharacterIterator.Attribute, ?>) linkedHashMap1);
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance((-80.0), 2754.6826422, 1024.0423887, 0.0);
      FontRenderContext fontRenderContext0 = new FontRenderContext(affineTransform0, true, true);
      Rectangle2D rectangle2D0 = font0.getStringBounds("njvF0x]WOr", fontRenderContext0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(824, (-3374), (-557), 824);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-557), (-3374), 0.0, (-3374));
      Rectangle2D rectangle2D0 = rectangle0.createIntersection(rectangle2D_Double0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(1070.9828F, 1070.9828F, 1.0F, (-1715.675F));
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 1070.9828F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 3284.7739812829, (-997.4461F), (-997.4461F));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(2.0F, (-1776.2F), (-1776.2F), 2.0F);
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) ellipse2D_Float0, (RectangleAnchor) null, (double) (-1776.2F), 3530.4);
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
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
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, Double.NaN, 899.09);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(1941.0F, 1941.0F);
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, (double) 1941.0F, 1.5);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createUpTriangle(0.0F);
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createDiagonalCross(0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiamond(2.0F);
      GeneralPath generalPath1 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      GeneralPath generalPath1 = new GeneralPath(0, 0);
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
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      ellipse2D_Double0.setFrameFromCenter(0.0, Double.NaN, 0.0, 0.0);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(682.1355, 0.0, 3521.613268, 682.1355);
      Point2D.Float point2D_Float0 = new Point2D.Float(0.0F, (-458.5F));
      Line2D.Double line2D_Double1 = new Line2D.Double(point2D_Float0, point2D_Float0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(1941.0F, 1941.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      Shape shape0 = ShapeUtilities.rotateShape(arc2D_Double0, (-2.147483648E9), 636.80206F, 636.80206F);
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, shape0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, (Shape) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double((-635.92), 1.0, (-1.0), 973.166677);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 1567.8F);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) rectangle0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(1070.9828F, 1070.9828F);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(960.9651F);
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, shape0, 960.9651F, 960.9651F, (-251.81448F));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle((-1.0F));
      Shape shape1 = ShapeUtilities.clone(shape0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Size2D size2D0 = new Size2D(1.0F, (-2.146427013E9));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.LEFT;
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, (-2.146427013E9), 1.0, rectangleAnchor0);
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(1.0, 1.0, rectangle2D0);
  }
}
