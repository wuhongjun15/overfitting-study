/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 06:29:36 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DecimalFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryToolTipGenerator;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.category.SlidingCategoryDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedAreaRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.setSeriesURLGenerator((-3593), (CategoryURLGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Object object0 = minMaxCategoryRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      LegendItemCollection legendItemCollection0 = waterfallBarRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      double[][] doubleArray0 = new double[5][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      SlidingCategoryDataset slidingCategoryDataset0 = new SlidingCategoryDataset(defaultIntervalCategoryDataset0, (-2506), (-2506));
      Range range0 = statisticalBarRenderer0.findRangeBounds((CategoryDataset) slidingCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = stackedAreaRenderer0.createState(plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      Layer layer0 = Layer.FOREGROUND;
      // Undeclared exception!
      try { 
        waterfallBarRenderer0.addAnnotation((CategoryAnnotation) null, layer0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'annotation' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategoryURLGenerator categoryURLGenerator0 = defaultCategoryItemRenderer0.getURLGenerator(0, 0, false);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      DecimalFormat decimalFormat0 = new DecimalFormat("");
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator("", decimalFormat0);
      lineAndShapeRenderer0.setSeriesToolTipGenerator(156, (CategoryToolTipGenerator) intervalCategoryToolTipGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      categoryStepRenderer0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getItemLabelGenerator(5, 0, true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, false);
      statisticalLineAndShapeRenderer0.setSeriesURLGenerator(1322, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryURLGenerator categoryURLGenerator0 = scatterRenderer0.getSeriesURLGenerator(2156);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = categoryStepRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      stackedBarRenderer3D0.setSeriesToolTipGenerator(2104, (CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = stackedAreaRenderer0.getSeriesItemLabelGenerator((-1855));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator();
      levelRenderer0.setBaseURLGenerator((CategoryURLGenerator) standardCategoryURLGenerator0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = stackedAreaRenderer0.getSeriesToolTipGenerator(55);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      defaultCategoryItemRenderer0.setLegendItemURLGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(3.0, 1482.818356461, 0.2, 4.0, stackedAreaRenderer0.DEFAULT_PAINT, stackedBarRenderer0.DEFAULT_OUTLINE_STROKE);
      boolean boolean0 = stackedBarRenderer0.removeAnnotation(categoryLineAnnotation0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(ganttRenderer0.ZERO, 1141.969, 0.2, (-2435), ganttRenderer0.DEFAULT_VALUE_LABEL_PAINT, ganttRenderer0.DEFAULT_STROKE);
      scatterRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot(defaultMultiValueCategoryDataset0);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = spiderWebPlot0.getLabelGenerator();
      groupedStackedBarRenderer0.setSeriesItemLabelGenerator(1896, categoryItemLabelGenerator0, true);
  }
}
