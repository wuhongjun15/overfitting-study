/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 12:12:56 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.util.EventListener;
import java.util.SimpleTimeZone;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.needle.ArrowNeedle;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.util.RectangleEdge;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("SansSerif");
      dateAxis0.setAxisLineVisible(false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      categoryAxis0.setPlot((Plot) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis(",f_#0/T8j`c6*S");
      PolarPlot polarPlot0 = new PolarPlot();
      JFreeChart jFreeChart0 = new JFreeChart(",f_#0/T8j`c6*S", categoryAxis0.DEFAULT_TICK_LABEL_FONT, polarPlot0, false);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(792, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      categoryAxis0.drawAxisLine(graphics2D0, 15, defaultCaret0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      boolean boolean0 = categoryAxis0.hasListener((EventListener) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("{. |#=4j0");
      Color color0 = (Color)CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
      dateAxis0.setTickMarkPaint(color0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("<area shape=\"");
      BasicStroke basicStroke0 = (BasicStroke)FastScatterPlot.DEFAULT_GRIDLINE_STROKE;
      subCategoryAxis0.setTickMarkStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("eWKEXk*B;H");
      Color color0 = new Color(500);
      logarithmicAxis0.setTickLabelPaint(color0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      // Undeclared exception!
      try { 
        categoryAxis0.setAxisLineStroke((Stroke) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      ArrowNeedle arrowNeedle0 = new ArrowNeedle(false);
      Stroke stroke0 = arrowNeedle0.getOutlineStroke();
      symbolAxis0.setAxisLineStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = (SimpleTimeZone)SegmentedTimeline.NO_DST_TIME_ZONE;
      DateAxis dateAxis0 = new DateAxis("Null 'paint' argument.", simpleTimeZone0);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      Paint paint0 = thermometerPlot0.getThermometerPaint();
      dateAxis0.setAxisLinePaint(paint0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("Null 'fillPaint' argument.");
      Font font0 = Axis.DEFAULT_AXIS_LABEL_FONT;
      logarithmicAxis0.setLabelFont(font0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("Null 'fillPaint' argument.");
      logarithmicAxis0.setLabelFont(logarithmicAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis(",f_#0/T8j`c6*S");
      categoryAxis0.setLabel(",f_#0/T8j`c6*S");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      categoryAxis0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SymbolAxis symbolAxis0 = new SymbolAxis(",f_#0/T8j`c6*S", stringArray0);
      symbolAxis0.setLabelToolTip(",f_#0/T8j`c6*S");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("P_@U~l66nn");
      logarithmicAxis0.setLabelAngle(500);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("0#/JfV`|d>Jun*");
      dateAxis0.setTickMarkOutsideLength(0.0F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      Object object0 = numberAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("RectangleAnchor.BOTTOM");
      dateAxis0.setLabelURL("org.jfree.chart.needle.MiddlePinNeedle");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      Stroke stroke0 = symbolAxis0.getTickMarkStroke();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      Paint paint0 = categoryAxis0.getTickLabelPaint((Comparable) 2.0F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("?M?R&86^cr:t^:4#IU");
      Paint paint0 = dateAxis0.getTickMarkPaint();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis((String) null);
      // Undeclared exception!
      try { 
        numberAxis0.estimateMaximumTickLabelHeight((Graphics2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.NumberAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      Paint paint0 = numberAxis0.getAxisLinePaint();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.05);
      boolean boolean0 = cyclicNumberAxis0.isTickLabelsVisible();
  }
}
