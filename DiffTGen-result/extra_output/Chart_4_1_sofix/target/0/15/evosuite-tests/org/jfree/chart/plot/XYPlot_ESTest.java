/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 11:54:52 GMT 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.BasicStroke;
import java.awt.Paint;
import java.awt.image.BufferedImage;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.util.Layer;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      combinedDomainXYPlot0.setDomainCrosshairLockedOnData(false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      combinedDomainXYPlot0.clearRangeMarkers(30);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      BasicStroke basicStroke0 = (BasicStroke)Plot.DEFAULT_OUTLINE_STROKE;
      combinedDomainXYPlot0.setRangeMinorGridlineStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(numberAxis0);
      combinedRangeXYPlot0.setRangeGridlineStroke(numberAxis0.DEFAULT_AXIS_LINE_STROKE);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      boolean boolean0 = combinedDomainXYPlot0.isDomainZoomable();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Paint paint0 = combinedDomainXYPlot0.getDomainGridlinePaint();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      DatasetRenderingOrder datasetRenderingOrder0 = xYPlot0.getDatasetRenderingOrder();
      xYPlot0.setDatasetRenderingOrder(datasetRenderingOrder0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      boolean boolean0 = xYPlot0.isRangeGridlinesVisible();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      ValueMarker valueMarker0 = new ValueMarker(1.0F);
      Layer layer0 = Layer.BACKGROUND;
      boolean boolean0 = combinedDomainXYPlot0.removeRangeMarker((Marker) valueMarker0, layer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      xYPlot0.setDomainCrosshairValue(360.0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      JFreeChart jFreeChart0 = new JFreeChart(combinedRangeXYPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1904, 10, (double) 10, (double) 1904, chartRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      Year year0 = new Year(0);
      ZoneInfo zoneInfo0 = (ZoneInfo)SegmentedTimeline.DEFAULT_TIME_ZONE;
      Locale locale0 = Locale.TAIWAN;
      PeriodAxis periodAxis0 = new PeriodAxis("1/B4:m", year0, year0, zoneInfo0, locale0);
      combinedRangeXYPlot0.setRangeAxis(3, (ValueAxis) periodAxis0);
  }
}
