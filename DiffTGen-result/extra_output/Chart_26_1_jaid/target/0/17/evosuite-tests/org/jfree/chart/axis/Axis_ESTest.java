/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 13:40:03 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Paint;
import java.awt.Stroke;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.renderer.PaintScale;
import org.jfree.chart.renderer.xy.XYBlockRenderer;
import org.jfree.chart.title.PaintScaleLegend;
import org.jfree.data.Range;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.RegularTimePeriod;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("Null 'stroke' argument.", (Range) null);
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      // Undeclared exception!
      try { 
        moduloAxis0.setPlot(spiderWebPlot0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'range' argument.
         //
         verifyException("org.jfree.chart.axis.ValueAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[5];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      symbolAxis0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      DateAxis dateAxis0 = new DateAxis(",", zoneInfo0);
      Plot plot0 = dateAxis0.getPlot();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      DateAxis dateAxis0 = new DateAxis(",", zoneInfo0);
      dateAxis0.setPlot((Plot) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      BasicStroke basicStroke0 = (BasicStroke)FastScatterPlot.DEFAULT_GRIDLINE_STROKE;
      categoryAxis3D0.setTickMarkStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      categoryAxis3D0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("H*9fqY.Y:!}YosR<`g ");
      XYBlockRenderer xYBlockRenderer0 = new XYBlockRenderer();
      PaintScale paintScale0 = xYBlockRenderer0.getPaintScale();
      PeriodAxis periodAxis0 = new PeriodAxis("H*9fqY.Y:!}YosR<`g ");
      PaintScaleLegend paintScaleLegend0 = new PaintScaleLegend(paintScale0, periodAxis0);
      Paint paint0 = paintScaleLegend0.getBackgroundPaint();
      extendedCategoryAxis0.setTickLabelPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setTickLabelsVisible(false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      BasicStroke basicStroke0 = (BasicStroke)FastScatterPlot.DEFAULT_GRIDLINE_STROKE;
      categoryAxis3D0.setAxisLineStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D((String) null);
      // Undeclared exception!
      try { 
        numberAxis3D0.setAxisLinePaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultStatisticalCategoryDataset0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 10, (-2842), (-4), 10, 1173, 10, true, true, false, false, false, false);
      Font font0 = chartPanel0.getFont();
      categoryAxis3D0.setLabelFont(font0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("Null 'stroke' argument.", (Range) null);
      moduloAxis0.setTickMarkInsideLength(978.28735F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("");
      float float0 = dateAxis0.getTickMarkOutsideLength();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("Gh3z_\u0007");
      extendedCategoryAxis0.setLabelAngle(1059.582338);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis((String) null);
      extendedCategoryAxis0.setTickMarkOutsideLength(1.0F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      Paint paint0 = categoryAxis3D0.getLabelPaint();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      Object object0 = logarithmicAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setLabelURL("]|bUWUF5");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0);
      Stroke stroke0 = cyclicNumberAxis0.getTickMarkStroke();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("");
      boolean boolean0 = dateAxis0.isVisible();
  }
}
