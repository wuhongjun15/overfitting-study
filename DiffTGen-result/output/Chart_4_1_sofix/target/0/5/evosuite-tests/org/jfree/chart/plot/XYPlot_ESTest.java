/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 11:50:25 GMT 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.util.Layer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(valueAxis0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      Point2D.Float point2D_Float0 = new Point2D.Float(2.0F, 500);
      combinedDomainXYPlot0.zoomRangeAxes((double) 2, (double) 2, plotRenderingInfo0, (Point2D) point2D_Float0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      combinedDomainXYPlot0.setRangeCrosshairLockedOnData(false);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LogAxis logAxis0 = new LogAxis("");
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(logAxis0);
      combinedRangeXYPlot0.setRangeCrosshairVisible(true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      combinedDomainXYPlot0.clearRangeMarkers();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      combinedDomainXYPlot0.setDomainMinorGridlinePaint(numberAxis0.DEFAULT_AXIS_LINE_PAINT);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("1(");
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(logarithmicAxis0);
      Layer layer0 = Layer.BACKGROUND;
      // Undeclared exception!
      try { 
        combinedRangeXYPlot0.addRangeMarker(500, (Marker) null, layer0, false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.XYPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      Color color0 = (Color)XYPlot.DEFAULT_GRIDLINE_PAINT;
      combinedDomainXYPlot0.setDomainTickBandPaint(color0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      combinedDomainXYPlot0.setDomainAxis(1, (ValueAxis) numberAxis0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      int int0 = combinedDomainXYPlot0.getSeriesCount();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      boolean boolean0 = combinedDomainXYPlot0.isDomainGridlinesVisible();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      CompoundBorder compoundBorder0 = new CompoundBorder();
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) null, (Border) compoundBorder0, 500, 86, (-3910), 86);
      // Undeclared exception!
      try { 
        combinedDomainXYPlot0.drawBackground((Graphics2D) null, rectangle0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.Plot", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      boolean boolean0 = combinedDomainXYPlot0.canSelectByPoint();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      boolean boolean0 = combinedDomainXYPlot0.isRangeMinorGridlinesVisible();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      int int0 = combinedDomainXYPlot0.getRangeAxisCount();
  }
}
