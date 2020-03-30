/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:00:01 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.text.NumberFormat;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItem;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boolean boolean0 = waterfallBarRenderer0.equals(boxAndWhiskerRenderer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator((-1534), (CategoryItemLabelGenerator) null, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      double[][] doubleArray0 = new double[5][8];
      double[] doubleArray1 = new double[7];
      doubleArray0[2] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0, false);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Object object0 = minMaxCategoryRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      PiePlot piePlot0 = new PiePlot();
      LegendTitle legendTitle0 = new LegendTitle(scatterRenderer0);
      RectangleAnchor rectangleAnchor0 = legendTitle0.getLegendItemGraphicLocation();
      // Undeclared exception!
      try { 
        scatterRenderer0.calculateRangeMarkerTextAnchorPoint((Graphics2D) null, (PlotOrientation) null, (Rectangle2D) null, (Rectangle2D) null, piePlot0.DEFAULT_INSETS, (LengthAdjustmentType) null, rectangleAnchor0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.RectangleAnchor", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Range range0 = minMaxCategoryRenderer0.findRangeBounds((CategoryDataset) null, false);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      double[][] doubleArray0 = new double[5][8];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = stackedAreaRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0, false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = stackedAreaRenderer0.createState(plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      CategoryURLGenerator categoryURLGenerator0 = stackedAreaRenderer0.getURLGenerator(0, (-26), false);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      minMaxCategoryRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getItemLabelGenerator((-3140), (-3140), false);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      Locale locale0 = Locale.ENGLISH;
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance(locale0);
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator("Requires 'value' > 0.0.", numberFormat0);
      stackedAreaRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getSeriesItemLabelGenerator((-1534));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      int int0 = stackedAreaRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      LegendItem legendItem0 = stackedAreaRenderer0.getLegendItem(0, 0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      Rectangle rectangle0 = new Rectangle(0, 32);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.calculateBarW0((CategoryPlot) null, plotOrientation0, rectangle0, categoryAxis0, (CategoryItemRendererState) null, (-158), 32);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.BarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = boxAndWhiskerRenderer0.getLegendItemToolTipGenerator();
  }
}