/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 12:03:58 GMT 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Paint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SeriesRenderingOrder;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      xYPlot0.handleClick(0, 1682, plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      xYPlot0.setQuadrantPaint(0, (Paint) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis((String) null);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      XYLineAndShapeRenderer xYLineAndShapeRenderer0 = new XYLineAndShapeRenderer(true, true);
      xYPlot0.setRenderer((XYItemRenderer) xYLineAndShapeRenderer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      SeriesRenderingOrder seriesRenderingOrder0 = xYPlot0.getSeriesRenderingOrder();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      int int0 = xYPlot0.getRangeAxisCount();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      Object object0 = combinedRangeXYPlot0.clone();
  }
}