/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:28:22 GMT 2020
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
import javax.swing.JTree;
import javax.swing.text.DefaultCaret;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
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
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, 0.0F);
      DefaultMutableTreeNode defaultMutableTreeNode0 = new DefaultMutableTreeNode(shape0, true);
      JTree jTree0 = new JTree(defaultMutableTreeNode0);
      TreePath treePath0 = jTree0.getPathForRow(0);
      Rectangle rectangle0 = jTree0.getPathBounds(treePath0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 1550.8, (-3712.3470359), 0.0);
      rectangle2D_Double0.add((-1023.629154714485), 1550.8);
      Rectangle rectangle0 = new Rectangle();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1482.0F), (-1482.0F), (-1482.0F), (-1482.0F));
      Rectangle2D rectangle2D0 = rectangle2D_Float0.createUnion(rectangle2D_Float0);
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(1.5, 856.7447462252933, 535.7687048699, 535.7687048699);
      Rectangle rectangle0 = ellipse2D_Double0.getBounds();
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      GeneralPath generalPath0 = new GeneralPath(rectangle2D_Double0);
      Rectangle rectangle0 = generalPath0.getBounds();
      rectangle2D_Double0.setFrameFromDiagonal((-1055.67), (-303.722319), (-3395.66350440767), (-1101.27462067));
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Double0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      line2D_Double0.setLine((-189.92728777883863), 6.0, (-2505.0), 2.0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 1.0F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double((-2.147483648E9), 0.0, 1.0, (-3098.881091439));
      Line2D.Float line2D_Float0 = new Line2D.Float(1.0F, 1.0F, 1.0F, 0.0F);
      line2D_Float0.setLine((double) 0.0F, 22.0647777, (-2.147483648E9), (-3098.881091439));
      line2D_Double0.setLine((Line2D) line2D_Float0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 1407.628F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createUpTriangle((-1.0F));
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, rectangleAnchor0, 222.93607046415278, 0.0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-1), 2649);
      Point2D point2D0 = ShapeUtilities.getPointInRectangle(222.10295, 1.0F, rectangle0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[5];
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      polygon0.npoints = 1;
      // Undeclared exception!
      try { 
        ShapeUtilities.rotateShape(polygon0, 3188, 0.0F, (-1523.9995F));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("java.awt.Polygon$PolygonPathIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      // Undeclared exception!
      try { 
        ShapeUtilities.intersects(rectangle0, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createLineRegion((Line2D) null, 2.0F);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      GeneralPath generalPath0 = new GeneralPath(line2D_Double0);
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createUpTriangle(0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createRegularCross((-2042.3549F), (-4025.313F));
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      Size2D size2D0 = new Size2D();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 0.0, 1.0, rectangleAnchor0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultCaret defaultCaret0 = new DefaultCaret();
      boolean boolean0 = ShapeUtilities.intersects(defaultCaret0, defaultCaret0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float((-69.65004F), (-69.65004F), (-69.65004F), (-69.65004F));
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1482.0F), (-1482.0F), (-1482.0F), (-1482.0F));
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.contains(rectangle2D0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      line2D_Double0.x1 = (double) (-1.0F);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 0.0, 1.0F, 0.0F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      Shape shape0 = ShapeUtilities.rotateShape(ellipse2D_Double0, 0.0, 978.94324F, 0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) polygon0, (RectangleAnchor) null, (double) 0, (double) 0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, rectangleAnchor0, 2.0, 2.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      GeneralPath generalPath0 = new GeneralPath(rectangle2D_Double0);
      Shape shape0 = ShapeUtilities.createDownTriangle((-1.0F));
      boolean boolean0 = ShapeUtilities.equal((Shape) generalPath0, shape0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      GeneralPath generalPath0 = new GeneralPath(rectangle2D_Double0);
      GeneralPath generalPath1 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal((Shape) generalPath0, (Shape) generalPath1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0, 0);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Polygon polygon1 = new Polygon(polygon0.ypoints, polygon0.xpoints, 0);
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(0, 0.0F, 1902.7F, 734.7F, 0.0F, (-841.00116F), 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(0.0F, 1294.093F, 2499.3F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(Double.NEGATIVE_INFINITY, 0, 0, 0);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-1.7976931348623157E308), (-1486.1363), (-1486.1363), (-1.7976931348623157E308));
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0, 0.0F, (-1254));
      Line2D.Float line2D_Float1 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      line2D_Float0.y1 = (-1482.0F);
      Point2D.Float point2D_Float0 = new Point2D.Float();
      Line2D.Float line2D_Float1 = new Line2D.Float(point2D_Float0, point2D_Float0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Float0, 0.0F);
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) rectangle0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(5.7F, (-870.5498F), 0.0F, 0.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, (Shape) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      Shape shape0 = ShapeUtilities.createRegularCross((-2042.3549F), (-4025.313F));
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, shape0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) ellipse2D_Float0, (double) 0.0F, (double) (-1482.0F));
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, shape0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross(1.0F, 1590.2588F);
      boolean boolean0 = ShapeUtilities.equal(shape0, shape0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      Shape shape0 = ShapeUtilities.clone(ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      GeneralPath generalPath0 = new GeneralPath(rectangle2D_Double0);
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, generalPath0, 212, 2964.0F, 0.0F);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiamond(1590.2588F);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.getPointInRectangle(0.0, (-1482.0), (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }
}
