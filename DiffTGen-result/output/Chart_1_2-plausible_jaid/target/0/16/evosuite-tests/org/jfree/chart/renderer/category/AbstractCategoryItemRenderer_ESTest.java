/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:07:21 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.geom.Point2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.renderer.xy.XYBlockRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Second;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(25.5, 25.5, true);
      stackedBarRenderer3D0.setSeriesURLGenerator(1269, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      CategoryURLGenerator categoryURLGenerator0 = lineAndShapeRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(true, true);
      CategoryToolTipGenerator categoryToolTipGenerator0 = lineAndShapeRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      Range range0 = groupedStackedBarRenderer0.findRangeBounds((CategoryDataset) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      // Undeclared exception!
      try { 
        layeredBarRenderer0.getDomainAxis(combinedDomainCategoryPlot0, defaultKeyedValues2DDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      Object object0 = categoryStepRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      DrawingSupplier drawingSupplier0 = lineAndShapeRenderer0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getURLGenerator(0, (-1030), true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(0.0, (-518.7395749081459));
      barRenderer3D0.setSeriesToolTipGenerator(3, (CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getToolTipGenerator(78, 0, true);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = ganttRenderer0.getSeriesToolTipGenerator(5794);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CategoryPlot categoryPlot0 = layeredBarRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      SystemColor systemColor0 = SystemColor.info;
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(systemColor0, systemColor0, defaultCategoryItemRenderer0.DEFAULT_PAINT, systemColor0);
      LegendItemCollection legendItemCollection0 = waterfallBarRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond(471, second0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
      layeredBarRenderer0.updateCrosshairValues((CategoryCrosshairState) null, millisecond0, second0, 59, 360, 471, 903.2047140986, plotOrientation0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      PiePlot3D piePlot3D0 = new PiePlot3D(defaultKeyedValuesDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("", piePlot3D0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 15, 15, 0, (-1336), (-64), (-519), false, false, true, true, false, true);
      PlotOrientation plotOrientation0 = chartPanel0.getOrientation();
      Rectangle rectangle0 = chartPanel0.getVisibleRect();
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.NO_CHANGE;
      XYBlockRenderer xYBlockRenderer0 = new XYBlockRenderer();
      RectangleAnchor rectangleAnchor0 = xYBlockRenderer0.getBlockAnchor();
      Point2D point2D0 = stackedAreaRenderer0.calculateRangeMarkerTextAnchorPoint((Graphics2D) null, plotOrientation0, rectangle0, rectangle0, piePlot3D0.DEFAULT_INSETS, lengthAdjustmentType0, rectangleAnchor0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      double[][] doubleArray0 = new double[9][8];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = statisticalBarRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      // Undeclared exception!
      try { 
        barRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      statisticalLineAndShapeRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      layeredBarRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      stackedAreaRenderer0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      lineRenderer3D0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      // Undeclared exception!
      try { 
        categoryStepRenderer0.setSeriesURLGenerator((-438), (CategoryURLGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getSeriesURLGenerator(250);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = ganttRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      stackedBarRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setSeriesToolTipGenerator(5794, (CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      lineAndShapeRenderer0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(0.0, (-518.7395749081459));
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      Number[][] numberArray0 = new Number[0][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.addEntity(standardEntityCollection0, barRenderer3D0.DEFAULT_SHAPE, defaultIntervalCategoryDataset0, 0, 0, false);
      } catch(IllegalArgumentException e) {
         //
         // The 'row' argument is out of bounds.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      int int0 = stackedAreaRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      int int0 = stackedBarRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator("EX 5_9Je");
      layeredBarRenderer0.setLegendItemURLGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      DateAxis dateAxis0 = new DateAxis();
      CategoryPlot categoryPlot0 = new CategoryPlot(taskSeriesCollection0, subCategoryAxis0, dateAxis0, statisticalBarRenderer0);
      CategoryAxis categoryAxis0 = statisticalBarRenderer0.getDomainAxis(categoryPlot0, taskSeriesCollection0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(0.0, (-518.7395749081459));
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(12.0, 0.0, 12.0, (double) barRenderer3D0.ZERO, barRenderer3D0.DEFAULT_PAINT, statisticalBarRenderer0.DEFAULT_STROKE);
      barRenderer3D0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0);
  }
}
