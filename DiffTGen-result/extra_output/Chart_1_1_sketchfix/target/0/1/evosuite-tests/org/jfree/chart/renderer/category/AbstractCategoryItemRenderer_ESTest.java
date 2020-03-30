/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:06:00 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.text.DateFormat;
import java.text.DecimalFormat;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.IntervalBarRenderer;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.CustomCategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      CustomCategoryURLGenerator customCategoryURLGenerator0 = new CustomCategoryURLGenerator();
      barRenderer3D0.setSeriesURLGenerator(0, (CategoryURLGenerator) customCategoryURLGenerator0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D((-2362.9914), 2.834604516);
      CategoryURLGenerator categoryURLGenerator0 = barRenderer3D0.getURLGenerator(0, (-1), true);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryURLGenerator categoryURLGenerator0 = scatterRenderer0.getSeriesURLGenerator(243);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      CategoryPlot categoryPlot0 = barRenderer3D0.getPlot();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      int int0 = statisticalLineAndShapeRenderer0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = groupedStackedBarRenderer0.getItemLabelGenerator(316, 39, true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = categoryStepRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.setSeriesToolTipGenerator((-1523), (CategoryToolTipGenerator) null, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      // Undeclared exception!
      try { 
        stackedBarRenderer0.getDomainAxis(combinedDomainCategoryPlot0, defaultCategoryDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      Object object0 = levelRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      DrawingSupplier drawingSupplier0 = stackedBarRenderer3D0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      Range range0 = categoryStepRenderer0.findRangeBounds((CategoryDataset) null, true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(3.0, 3.0, 3.0, (-2465.8), stackedBarRenderer0.DEFAULT_PAINT, stackedBarRenderer0.DEFAULT_STROKE);
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Layer layer0 = Layer.FOREGROUND;
      scatterRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D((-2362.9914), 2.834604516);
      barRenderer3D0.setBaseURLGenerator((CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      stackedBarRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      waterfallBarRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      String[] stringArray0 = new String[2];
      Number[][] numberArray0 = new Number[0][9];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.addEntity(standardEntityCollection0, barRenderer0.DEFAULT_SHAPE, defaultIntervalCategoryDataset0, (-1933), 0, true, (-3251.895900828), 3.0);
      } catch(IllegalArgumentException e) {
         //
         // The 'row' argument is out of bounds.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      LegendItemCollection legendItemCollection0 = minMaxCategoryRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      // Undeclared exception!
      try { 
        stackedBarRenderer0.updateCrosshairValues(categoryCrosshairState0, defaultCategoryItemRenderer0.ZERO, defaultCategoryItemRenderer0.ZERO, 233, 233, 4.0, 4.0, plotOrientation0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      LegendItem legendItem0 = levelRenderer0.getLegendItem((-1677), 0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      DateAxis dateAxis0 = new DateAxis("Zjv");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(dateAxis0);
      ChartPanel chartPanel0 = new ChartPanel((JFreeChart) null, false, false, false, true, false);
      Rectangle2D rectangle2D0 = chartPanel0.getScreenDataArea();
      defaultCategoryItemRenderer0.drawRangeLine((Graphics2D) null, combinedRangeCategoryPlot0, dateAxis0, rectangle2D0, (-3028.0251589), combinedRangeCategoryPlot0.DEFAULT_OUTLINE_PAINT, dateAxis0.DEFAULT_AXIS_LINE_STROKE);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float();
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      // Undeclared exception!
      try { 
        scatterRenderer0.drawDomainLine((Graphics2D) null, combinedDomainCategoryPlot0, rectangle2D0, 316.92171851, combinedDomainCategoryPlot0.DEFAULT_OUTLINE_PAINT, combinedDomainCategoryPlot0.DEFAULT_OUTLINE_STROKE);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      double[][] doubleArray0 = new double[2][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 3776.0, "8d6e@^*H");
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultIntervalCategoryDataset0, extendedCategoryAxis0, cyclicNumberAxis0, boxAndWhiskerRenderer0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart(":5+Bwuss=", combinedDomainCategoryPlot0.DEFAULT_VALUE_LABEL_FONT, combinedDomainCategoryPlot0, false);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = scatterRenderer0.createState(plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(lineRenderer3D0.ZERO, 2356.66188185239, 1.0F, 0.1, lineRenderer3D0.DEFAULT_WALL_PAINT, barRenderer3D0.DEFAULT_STROKE);
      Layer layer0 = Layer.BACKGROUND;
      lineRenderer3D0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      categoryStepRenderer0.setSeriesURLGenerator(4645, (CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      stackedBarRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) standardCategoryToolTipGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setSeriesToolTipGenerator(4266, (CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalLineAndShapeRenderer0.getToolTipGenerator(0, 0, false);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      JSpinner jSpinner0 = new JSpinner();
      JSpinner.NumberEditor jSpinner_NumberEditor0 = new JSpinner.NumberEditor(jSpinner0);
      DecimalFormat decimalFormat0 = jSpinner_NumberEditor0.getFormat();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("##rBX]17zit1GGq2-", decimalFormat0, decimalFormat0);
      barRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setSeriesItemLabelGenerator(39, (CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      layeredBarRenderer0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)AbstractRenderer.DEFAULT_SHAPE;
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.initialise((Graphics2D) null, rectangle0, (CategoryPlot) null, defaultMultiValueCategoryDataset0, plotRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      scatterRenderer0.setPlot(combinedDomainCategoryPlot0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator();
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.setSeriesURLGenerator((-1507), (CategoryURLGenerator) standardCategoryURLGenerator0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = intervalBarRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot(taskSeriesCollection0);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = spiderWebPlot0.getLabelGenerator();
      layeredBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator();
      lineRenderer3D0.setLegendItemToolTipGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      int int0 = boxAndWhiskerRenderer0.getRowCount();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      DateFormat dateFormat0 = DateFormat.getDateTimeInstance();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator("0a'dYj]X>K'V", dateFormat0);
      // Undeclared exception!
      try { 
        levelRenderer0.setSeriesToolTipGenerator((-397), (CategoryToolTipGenerator) intervalCategoryToolTipGenerator0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = layeredBarRenderer0.getSeriesItemLabelGenerator(0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = waterfallBarRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      stackedBarRenderer3D0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(4.0, 0.0, true);
      stackedBarRenderer3D0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = categoryStepRenderer0.getSeriesToolTipGenerator((-6692));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      DefaultMutableTreeNode defaultMutableTreeNode0 = new DefaultMutableTreeNode(waterfallBarRenderer0);
      JTree jTree0 = new JTree(defaultMutableTreeNode0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      int int0 = stackedAreaRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      waterfallBarRenderer0.setLegendItemURLGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedBarRenderer0.getLegendItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(3.0, 3.0, 3.0, (-2465.8), stackedBarRenderer0.DEFAULT_PAINT, stackedBarRenderer0.DEFAULT_STROKE);
      boolean boolean0 = stackedBarRenderer0.removeAnnotation(categoryLineAnnotation0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Range range0 = barRenderer3D0.findRangeBounds(defaultCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        stackedBarRenderer0.getDomainAxis((CategoryPlot) null, defaultStatisticalCategoryDataset0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("Base item URL generator not cloneable.", 5, 599.2457449798, 5);
      categoryStepRenderer0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      CategoryToolTipGenerator categoryToolTipGenerator0 = lineAndShapeRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      // Undeclared exception!
      try { 
        categoryStepRenderer0.setSeriesItemLabelGenerator((-1100), (CategoryItemLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }
}
