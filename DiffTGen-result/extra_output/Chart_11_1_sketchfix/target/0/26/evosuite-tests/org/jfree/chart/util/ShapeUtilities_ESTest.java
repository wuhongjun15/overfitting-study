/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:28:22 GMT 2020
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
import java.text.AttributedCharacterIterator;
import java.util.LinkedHashMap;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
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
      JTable jTable0 = new JTable(0, 1);
      Rectangle rectangle0 = jTable0.getBounds();
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultMutableTreeNode defaultMutableTreeNode0 = new DefaultMutableTreeNode();
      JTree jTree0 = new JTree(defaultMutableTreeNode0);
      Rectangle rectangle0 = jTree0.getRowBounds(0);
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Line2D.Float line2D_Float1 = new Line2D.Float(0.0F, 0.0F, 4051.3972F, (-1532.7664F));
      line2D_Float0.setLine((Line2D) line2D_Float1);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, (-273.3407F));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross((-1.0F), (-1.0F));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_RIGHT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, (-4403.5), (double) (-1.0F));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      GeneralPath generalPath1 = new GeneralPath(0, 0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
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
        ShapeUtilities.getPointInRectangle(1.0F, 1.0F, (Rectangle2D) null);
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
        ShapeUtilities.createLineRegion((Line2D) null, 2358.013F);
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
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiamond((-1.0F));
      Line2D.Float line2D_Float0 = new Line2D.Float();
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createLineRegion(line2D_Float0, 2.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiagonalCross(6283.0547F, 6283.0547F);
      GeneralPath generalPath1 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiagonalCross(6283.0547F, 6283.0547F);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Point point0 = new Point(0, 0);
      Line2D.Double line2D_Double0 = new Line2D.Double(point0, point0);
      line2D_Double0.setLine((double) 0, (double) 0, Double.NaN, (double) 0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float((-263.1377F), 0.0F, 0.0F, (-263.1377F));
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashMap<AttributedCharacterIterator.Attribute, Ellipse2D.Float> linkedHashMap0 = new LinkedHashMap<AttributedCharacterIterator.Attribute, Ellipse2D.Float>();
      Font font0 = new Font(linkedHashMap0);
      AffineTransform affineTransform0 = AffineTransform.getQuadrantRotateInstance(0);
      FontRenderContext fontRenderContext0 = new FontRenderContext(affineTransform0, true, true);
      Rectangle2D rectangle2D0 = font0.getMaxCharBounds(fontRenderContext0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Size2D size2D0 = new Size2D((-540.41), 665.0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 2.830078125, 116.690362, rectangleAnchor0);
      JInternalFrame jInternalFrame0 = new JInternalFrame("q&<ZeYk&", true, true, false, false);
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(1133.1087072276696, 266.0267132, 655.4454468094691, 1967.2148887750864);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 2358.013F, 2358.013F, 2358.013F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(380.9507F, 380.9507F);
      Shape shape1 = ShapeUtilities.rotateShape(shape0, 380.9507F, 0.0F, (-1.0F));
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape(shape1, (RectangleAnchor) null, 0.0, (double) 0.0F);
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, 1635.74821366516, 1635.74821366516);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, (-934.72066708), (-321.2513159857313));
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDownTriangle((-2600.8F));
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, (double) (-2600.8F), (double) (-2600.8F));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond((-1.0F));
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Shape shape1 = ShapeUtilities.createLineRegion(line2D_Float0, 2.0F);
      boolean boolean0 = ShapeUtilities.equal(shape1, shape0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond((-1.0F));
      GeneralPath generalPath0 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal((Shape) generalPath0, shape0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiamond((-1.0F));
      GeneralPath generalPath1 = new GeneralPath(0);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int[] intArray0 = new int[5];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Polygon polygon1 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(1789.0F, (-6032.5F), (-1.0F), 3661.105F, 0.0F, (-1536.7F), 1);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(1606.4187330234, (-4330.702271), 937.2702616, (-1289.313728244967));
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(3218.9F, (-1920.634F), 3218.9F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 0.0F, (-104.18952F), 9223372036854775807L);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Point point0 = new Point(0, 0);
      Line2D.Double line2D_Double0 = new Line2D.Double(point0, point0);
      line2D_Double0.setLine((double) 0, (double) 0, Double.NaN, (double) 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, (Shape) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      line2D_Double0.x1 = (double) (-287.56F);
      Line2D.Double line2D_Double1 = new Line2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double1, (Line2D) line2D_Double0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(5062.759F, 5062.759F, 5062.759F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond((-1.0F));
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) polygon0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int[] intArray0 = new int[2];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) polygon0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, (Shape) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 800.9407F);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, shape0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Shape shape0 = ShapeUtilities.clone(rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(0.0F, 0.0F);
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, shape0, 0.0F, 0.0F, (-1.0F));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(0.0F, 2.0F, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle(3188.43F);
  }
}
