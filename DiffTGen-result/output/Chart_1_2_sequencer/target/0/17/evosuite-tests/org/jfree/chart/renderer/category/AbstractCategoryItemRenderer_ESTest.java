/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 06:59:22 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Paint paint0 = boxAndWhiskerRenderer0.getArtifactPaint();
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(boxAndWhiskerRenderer0.ZERO, (double) boxAndWhiskerRenderer0.ZERO, 3.0, 0.2, paint0, boxAndWhiskerRenderer0.DEFAULT_STROKE);
      Layer layer0 = Layer.FOREGROUND;
      ganttRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalLineAndShapeRenderer0.getURLGenerator(433, 2201, false);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 2.0);
      CategoryPlot categoryPlot0 = stackedBarRenderer3D0.getPlot();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(true, false);
      Object object0 = lineAndShapeRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      GanttRenderer ganttRenderer1 = new GanttRenderer();
      boolean boolean0 = ganttRenderer0.equals(ganttRenderer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Number[][] numberArray0 = new Number[9][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((Comparable[]) null, (Comparable[]) null, numberArray0, numberArray0);
      Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(30.85016, 752.3443602);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = barRenderer3D0.getItemLabelGenerator(1, 1, false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      statisticalLineAndShapeRenderer0.setSeriesURLGenerator(433, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalLineAndShapeRenderer0.getSeriesURLGenerator(1494);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(30.85016, 752.3443602);
      barRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setLegendItemToolTipGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = groupedStackedBarRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      CategoryURLGenerator categoryURLGenerator0 = lineAndShapeRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      LevelRenderer levelRenderer0 = new LevelRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      // Undeclared exception!
      try { 
        levelRenderer0.addEntity(standardEntityCollection0, statisticalLineAndShapeRenderer0.DEFAULT_SHAPE, (CategoryDataset) null, 2, 0, true, 5.0E10, (double) statisticalLineAndShapeRenderer0.ZERO);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      DrawingSupplier drawingSupplier0 = barRenderer0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      int int0 = ganttRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator("|");
      lineAndShapeRenderer0.setLegendItemURLGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = scatterRenderer0.getLegendItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      SimpleTimeZone simpleTimeZone0 = (SimpleTimeZone)SegmentedTimeline.NO_DST_TIME_ZONE;
      DateAxis dateAxis0 = new DateAxis("", simpleTimeZone0);
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultMultiValueCategoryDataset0, categoryAxis0, dateAxis0, levelRenderer0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        levelRenderer0.initialise((Graphics2D) null, (Rectangle2D) null, categoryPlot0, defaultMultiValueCategoryDataset0, plotRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(0.2, 3.0, waterfallBarRenderer0.ZERO, 1.0E-100, waterfallBarRenderer0.DEFAULT_OUTLINE_PAINT, waterfallBarRenderer0.DEFAULT_OUTLINE_STROKE);
      waterfallBarRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      String[] stringArray0 = new String[9];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, (Number[][]) null, (Number[][]) null);
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }
}
