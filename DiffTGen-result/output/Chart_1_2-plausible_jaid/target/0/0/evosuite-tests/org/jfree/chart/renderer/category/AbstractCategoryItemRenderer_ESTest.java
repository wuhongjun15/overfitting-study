/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:59:59 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.SlidingGanttCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(1423.09257952, 1423.09257952);
      CategoryToolTipGenerator categoryToolTipGenerator0 = stackedBarRenderer3D0.getSeriesToolTipGenerator((-4703));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      LegendItemCollection legendItemCollection0 = defaultCategoryItemRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Object object0 = scatterRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Shape shape0 = minMaxCategoryRenderer0.lookupLegendShape(3);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = defaultCategoryItemRenderer0.findRangeBounds((CategoryDataset) defaultBoxAndWhiskerCategoryDataset0, false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(barRenderer0.ZERO, (-460.86101434319), barRenderer0.ZERO, (-460.86101434319), barRenderer0.DEFAULT_VALUE_LABEL_PAINT, barRenderer0.DEFAULT_OUTLINE_STROKE);
      Layer layer0 = Layer.FOREGROUND;
      barRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      lineAndShapeRenderer0.setSeriesURLGenerator(3, (CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(1423.09257952, 1423.09257952);
      CategoryURLGenerator categoryURLGenerator0 = stackedBarRenderer3D0.getURLGenerator((-4703), (-4703), false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      CompassPlot compassPlot0 = new CompassPlot(defaultValueDataset0);
      JFreeChart jFreeChart0 = new JFreeChart(compassPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(66, 89, (double) 1, (double) minMaxCategoryRenderer0.ZERO, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      LogAxis logAxis0 = new LogAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(logAxis0);
      PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset(taskSeriesCollection0, 10, 10);
      minMaxCategoryRenderer0.drawItemLabel(graphics2D0, plotOrientation0, slidingGanttCategoryDataset0, 157, 500, false, 0.05, 0.0, true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      // Undeclared exception!
      try { 
        scatterRenderer0.setSeriesURLGenerator((-11), (CategoryURLGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      stackedAreaRenderer0.setLegendItemToolTipGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      waterfallBarRenderer0.setSeriesToolTipGenerator(1, (CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(1423.09257952, 1423.09257952);
      CategoryToolTipGenerator categoryToolTipGenerator0 = stackedBarRenderer3D0.getToolTipGenerator(0, (-4703), true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      LegendItem legendItem0 = minMaxCategoryRenderer0.getLegendItem((-1), 0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("({0}, {1}) = {2}", 0.2, 1, (double) waterfallBarRenderer0.ZERO);
      boolean boolean0 = waterfallBarRenderer0.removeAnnotation(categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      double[][] doubleArray0 = new double[7][9];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        scatterRenderer0.getDomainAxis((CategoryPlot) null, defaultIntervalCategoryDataset0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Layer layer0 = Layer.BACKGROUND;
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.addAnnotation((CategoryAnnotation) null, layer0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'annotation' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }
}
