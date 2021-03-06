/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 12:00:52 GMT 2020
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.ShapeUtilities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShapeUtilities_ESTest extends ShapeUtilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0);
      Rectangle rectangle0 = generalPath0.getBounds();
      rectangle0.setRect(3613.155, (-533.0), 3613.155, 0.0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-329.20552936956), (-329.20552936956), 0.0, (-329.20552936956));
      rectangle2D_Double0.setFrameFromDiagonal(0.0, (-727.0), 0.0, 0.0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D_Double0, rectangle2D_Double0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      line2D_Double0.setLine((-727.0), (-727.0), 727.0, 0.0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 2.0F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(693.5698, 0.0, 0.0, 0.0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 1272.0F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0);
      Rectangle rectangle0 = generalPath0.getBounds();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      rectangle0.setFrame((-799.5196286), 0.0, (-799.5196286), Double.POSITIVE_INFINITY);
      Shape shape0 = ShapeUtilities.createTranslatedShape((Shape) rectangle0, rectangleAnchor0, 0.0, 0.5);
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
        ShapeUtilities.getPointInRectangle(0.0F, 0.0, (Rectangle2D) null);
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
        ShapeUtilities.createLineRegion((Line2D) null, (-821.1194F));
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
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createRegularCross(0.0F, 0.0F);
      GeneralPath generalPath1 = (GeneralPath)ShapeUtilities.createUpTriangle(0.0F);
      boolean boolean0 = ShapeUtilities.equal(generalPath1, generalPath0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiagonalCross((-747.27045F), (-747.27045F));
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal(polygon0, polygon0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double((-217.34826156661524), Double.POSITIVE_INFINITY, (-217.34826156661524), 2216.48357511318);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, (-1.0F), (-3328.4192F), 0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Float0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(1777.6300015, 1777.6300015, 1777.6300015, (-4430.0));
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-652.216319966), Double.NEGATIVE_INFINITY, 0.0, (-926.05118));
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      Rectangle rectangle0 = ellipse2D_Double0.getBounds();
      Rectangle2D rectangle2D0 = rectangle2D_Double0.createIntersection(rectangle0);
      boolean boolean0 = ShapeUtilities.intersects(rectangle2D0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JTableHeader jTableHeader0 = new JTableHeader();
      Rectangle rectangle0 = jTableHeader0.getHeaderRect(2146602277);
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(2146602277, 269.3986F, 0, 269.3986F);
      Rectangle2D rectangle2D0 = ellipse2D_Float0.getBounds2D();
      boolean boolean0 = ShapeUtilities.contains(rectangle0, rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(2615.54F, 2615.54F, 2615.54F, (-781.727F));
      boolean boolean0 = ShapeUtilities.contains(rectangle2D_Float0, rectangle2D_Float0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(1934.402077454917, 1934.402077454917, 1934.402077454917, 1934.402077454917);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Rectangle rectangle1 = line2D_Double0.getBounds();
      rectangle0.setFrameFromDiagonal((-1045.5467), 0.0, (-384.467), (-848.46594221355));
      boolean boolean0 = ShapeUtilities.contains(rectangle1, rectangle0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, 0.0F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Shape shape0 = ShapeUtilities.rotateShape((Shape) null, 0.0, 0.0F, 911.99F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0, 0);
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) generalPath0, (RectangleAnchor) null, (double) 0, (double) 0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'anchor' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShapeUtilities.createTranslatedShape((Shape) null, 0.0, (-2.147483648E9));
      } catch(IllegalArgumentException e) {
         //
         // Null 'shape' argument.
         //
         verifyException("org.jfree.chart.util.ShapeUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, 0.0F);
      Shape shape1 = ShapeUtilities.createTranslatedShape(shape0, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createDiagonalCross((-747.27045F), (-747.27045F));
      Shape shape1 = ShapeUtilities.createDiagonalCross(378.0F, (-747.27045F));
      boolean boolean0 = ShapeUtilities.equal(shape0, shape1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GeneralPath generalPath0 = new GeneralPath(0, 334);
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiamond(3508.9F);
      GeneralPath generalPath1 = new GeneralPath();
      boolean boolean0 = ShapeUtilities.equal(generalPath0, generalPath1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GeneralPath generalPath0 = (GeneralPath)ShapeUtilities.createDiagonalCross((-370.9F), 2172.1855F);
      boolean boolean0 = ShapeUtilities.equal((GeneralPath) null, generalPath0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Polygon) null, (Polygon) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      arc2D_Double0.setAngles(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float(0.0F, 0.0F, 0.0F, 1270.359F, 0.0F, 0.0F, 0);
      Arc2D.Float arc2D_Float1 = new Arc2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Float0, (Arc2D) arc2D_Float1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double((-1614.0), (-3024.9602), (-2.147483648E9), (-2.147483648E9), 2216.48357511318, 686.456106326948, 0);
      boolean boolean0 = ShapeUtilities.equal((Arc2D) arc2D_Double0, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Arc2D) null, (Arc2D) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float(2009.8864F, 0.0F, 2009.8864F, 2009.8864F);
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Float0, (Ellipse2D) ellipse2D_Double0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) ellipse2D_Double0, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      GridBagLayout gridBagLayout0 = new GridBagLayout();
      Point point0 = gridBagLayout0.location(0, 0);
      Point point1 = gridBagLayout0.getLayoutOrigin();
      point1.y = 6;
      point0.setLocation((Point2D) point1);
      Line2D.Float line2D_Float0 = new Line2D.Float(point0, point0);
      boolean boolean0 = ShapeUtilities.equal((Line2D) line2D_Double0, (Line2D) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = ShapeUtilities.equal((Line2D) null, (Line2D) null);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0, 0.0, (-687.3429572462081), 0.0);
      Shape shape0 = ShapeUtilities.createLineRegion(line2D_Double0, (-457.327F));
      Rectangle2D rectangle2D0 = shape0.getBounds2D();
      boolean boolean0 = ShapeUtilities.equal(shape0, (Shape) rectangle2D0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Polygon polygon0 = new Polygon();
      boolean boolean0 = ShapeUtilities.equal((Shape) polygon0, (Shape) polygon0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, (Shape) arc2D_Double0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Ellipse2D.Float ellipse2D_Float0 = new Ellipse2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Float0, (Shape) ellipse2D_Float0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double();
      boolean boolean0 = ShapeUtilities.equal((Shape) ellipse2D_Double0, (Shape) null);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Line2D.Float line2D_Float0 = new Line2D.Float();
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Float0, (Shape) line2D_Float0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Shape shape0 = ShapeUtilities.createRegularCross((-243.775F), 836.0F);
      boolean boolean0 = ShapeUtilities.equal((Shape) line2D_Double0, shape0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      Shape shape0 = ShapeUtilities.clone(arc2D_Float0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Shape shape0 = ShapeUtilities.clone((Shape) null);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Shape shape0 = ShapeUtilities.createRegularCross(0.0F, 0.0F);
      Arc2D.Double arc2D_Double0 = new Arc2D.Double();
      Shape shape1 = ShapeUtilities.rotateShape(shape0, 642.78577193, 0.0F, 1212.0255F);
      boolean boolean0 = ShapeUtilities.equal((Shape) arc2D_Double0, shape1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTable jTable0 = new JTable(defaultTableModel0, defaultTableColumnModel0);
      Rectangle rectangle0 = jTable0.getVisibleRect();
      // Undeclared exception!
      try { 
        ShapeUtilities.drawRotatedShape((Graphics2D) null, rectangle0, (-1523.23355), 0.0F, 0);
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
      Line2D.Double line2D_Double0 = new Line2D.Double(0.0F, (-747.27045F), 0.0F, (-2845.132));
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Point2D point2D0 = ShapeUtilities.getPointInRectangle((-694.88F), (-694.88F), rectangle0);
  }
}
