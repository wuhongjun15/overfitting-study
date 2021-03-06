/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:09:10 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.JTableHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItem;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.IntervalBarRenderer;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.SlidingCategoryDataset;
import org.jfree.data.gantt.SlidingGanttCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesTableModel;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      CategoryToolTipGenerator categoryToolTipGenerator0 = stackedAreaRenderer0.getSeriesToolTipGenerator(1391);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategoryPlot categoryPlot0 = defaultCategoryItemRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      LegendItem legendItem0 = boxAndWhiskerRenderer0.getLegendItem((-1122), (-1122));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(4.5, 4.5);
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      SlidingCategoryDataset slidingCategoryDataset0 = new SlidingCategoryDataset(defaultMultiValueCategoryDataset0, 52, (-1824));
      boolean boolean0 = barRenderer3D0.equals(slidingCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      // Undeclared exception!
      try { 
        categoryStepRenderer0.setSeriesURLGenerator((-1310), (CategoryURLGenerator) null, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((-256), (CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      // Undeclared exception!
      try { 
        lineRenderer3D0.setSeriesItemLabelGenerator((-651), (CategoryItemLabelGenerator) null, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getURLGenerator((-4477), (-4), false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      intervalBarRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setSeriesToolTipGenerator(2096, (CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getToolTipGenerator(998, 998, true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(2.0, 0.0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset(taskSeriesCollection0, (-1357), (-1357));
      // Undeclared exception!
      try { 
        barRenderer3D0.addEntity(standardEntityCollection0, (Shape) null, slidingGanttCategoryDataset0, 717, (-1357), true);
      } catch(IllegalArgumentException e) {
         //
         // Null 'hotspot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      RectangleInsets rectangleInsets0 = Plot.DEFAULT_INSETS;
      Rectangle rectangle0 = new Rectangle(36, 300);
      Rectangle2D rectangle2D0 = rectangleInsets0.createInsetRectangle((Rectangle2D) rectangle0);
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      // Undeclared exception!
      try { 
        lineRenderer3D0.addEntity(standardEntityCollection0, rectangle2D0, defaultMultiValueCategoryDataset0, 999, (-1718), true);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 999, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      Object object0 = stackedBarRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      Paint paint0 = ganttRenderer0.lookupSeriesPaint(5);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds((CategoryDataset) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = layeredBarRenderer0.createState(plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setSeriesToolTipGenerator(680, (CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      boxAndWhiskerRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator();
      waterfallBarRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) standardCategoryURLGenerator0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-743.232164054574), (-743.232164054574));
      CategoryURLGenerator categoryURLGenerator0 = stackedBarRenderer3D0.getSeriesURLGenerator(0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = lineRenderer3D0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-743.232164054574), (-743.232164054574));
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = spiderWebPlot0.getLabelGenerator();
      stackedBarRenderer3D0.setBaseItemLabelGenerator(categoryItemLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      int int0 = ganttRenderer0.getRowCount();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(2.0, 0.0);
      barRenderer3D0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = ganttRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.addEntity(standardEntityCollection0, lineRenderer3D0.DEFAULT_SHAPE, defaultCategoryDataset0, 2946, 57, false, (-2031.8675), 941.344184);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2946, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      int int0 = stackedAreaRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      int int0 = stackedBarRenderer3D0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Color color0 = (Color)LegendTitle.DEFAULT_ITEM_PAINT;
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(color0, color0, color0, color0);
      int int0 = waterfallBarRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setLegendItemURLGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedBarRenderer3D0.getLegendItemLabelGenerator();
      stackedBarRenderer3D0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(4.5, 4.5);
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      SlidingCategoryDataset slidingCategoryDataset0 = new SlidingCategoryDataset(defaultMultiValueCategoryDataset0, 52, (-1824));
      Range range0 = barRenderer3D0.findRangeBounds(slidingCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      TimeSeries timeSeries0 = new TimeSeries(barRenderer3D0.ZERO);
      TimeSeriesTableModel timeSeriesTableModel0 = new TimeSeriesTableModel(timeSeries0, false);
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTable jTable0 = new JTable(timeSeriesTableModel0, defaultTableColumnModel0);
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      Rectangle rectangle0 = jTableHeader0.getHeaderRect(10);
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        barRenderer3D0.calculateBarWidth(categoryPlot0, rectangle0, defaultCategoryDataset0, (CategoryItemRendererState) null);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      // Undeclared exception!
      try { 
        waterfallBarRenderer0.addAnnotation((CategoryAnnotation) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'annotation' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = ganttRenderer0.getBaseToolTipGenerator();
  }
}
