/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 07:48:57 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.labels.IntervalCategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
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
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      barRenderer3D0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      stackedAreaRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      defaultCategoryItemRenderer0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryURLGenerator categoryURLGenerator0 = scatterRenderer0.getSeriesURLGenerator(3);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = boxAndWhiskerRenderer0.getSeriesItemLabelGenerator((-1649));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      CategoryPlot categoryPlot0 = stackedBarRenderer3D0.getPlot();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      int int0 = lineRenderer3D0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      LegendItem legendItem0 = scatterRenderer0.getLegendItem(109, (-3296));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = groupedStackedBarRenderer0.getItemLabelGenerator(0, 0, false);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      CategoryAxis categoryAxis0 = boxAndWhiskerRenderer0.getDomainAxis(combinedRangeCategoryPlot0, (CategoryDataset) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("`m2b7iKw", 3.0, (double) waterfallBarRenderer0.ZERO, 211.284);
      boolean boolean0 = waterfallBarRenderer0.equals(categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      CategoryItemRendererState categoryItemRendererState0 = categoryStepRenderer0.createState((PlotRenderingInfo) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CustomCategoryURLGenerator customCategoryURLGenerator0 = new CustomCategoryURLGenerator();
      // Undeclared exception!
      try { 
        scatterRenderer0.setSeriesURLGenerator((-537), (CategoryURLGenerator) customCategoryURLGenerator0, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator();
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.setSeriesToolTipGenerator((-61), (CategoryToolTipGenerator) intervalCategoryToolTipGenerator0, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      // Undeclared exception!
      try { 
        categoryStepRenderer0.setSeriesItemLabelGenerator((-370), (CategoryItemLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      JFreeChart jFreeChart0 = new JFreeChart("", combinedRangeXYPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 1, 3, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      CategoryMarker categoryMarker0 = new CategoryMarker(0.0F);
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.drawDomainMarker(graphics2D0, (CategoryPlot) null, extendedCategoryAxis0, categoryMarker0, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(categoryStepRenderer0.DEFAULT_PAINT, minMaxCategoryRenderer0.DEFAULT_PAINT, categoryStepRenderer0.DEFAULT_OUTLINE_PAINT, categoryStepRenderer0.DEFAULT_PAINT);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      // Undeclared exception!
      try { 
        levelRenderer0.addEntity(standardEntityCollection0, minMaxCategoryRenderer0.DEFAULT_SHAPE, defaultKeyedValues2DDataset0, 5, 5, false, (double) waterfallBarRenderer0.ZERO, (double) categoryStepRenderer0.ZERO);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 5, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Object object0 = boxAndWhiskerRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      DrawingSupplier drawingSupplier0 = waterfallBarRenderer0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      Range range0 = stackedAreaRenderer0.findRangeBounds((CategoryDataset) defaultKeyedValues2DDataset0, false);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("org.jfree.chart.renderer.xy.XYAreaRenderer2", 8.0, 8.0, 0.2);
      Layer layer0 = Layer.FOREGROUND;
      stackedBarRenderer3D0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("Unknown layer.", 3.0, (double) barRenderer3D0.ZERO, 8.0);
      // Undeclared exception!
      try { 
        barRenderer3D0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0, (Layer) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, false);
      CategoryURLGenerator categoryURLGenerator0 = statisticalLineAndShapeRenderer0.getURLGenerator(36, (-4155), false);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 0.0, true);
      stackedBarRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = defaultCategoryItemRenderer0.getToolTipGenerator(1131, 1131, true);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      CategoryToolTipGenerator categoryToolTipGenerator0 = stackedBarRenderer3D0.getSeriesToolTipGenerator(110);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      LegendItemCollection legendItemCollection0 = stackedAreaRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      ValueAxis valueAxis0 = ganttRenderer0.getRangeAxis(categoryPlot0, 10);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Object object0 = statisticalLineAndShapeRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("", levelRenderer0.DEFAULT_VALUE_LABEL_FONT, combinedRangeCategoryPlot0, false);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 15, 51, 51, 999, 10, 999, false, false, true, false, false, true, true);
      PlotOrientation plotOrientation0 = chartPanel0.getOrientation();
      String[] stringArray0 = new String[5];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, (Number[][]) null, (Number[][]) null);
      levelRenderer0.drawItemLabel((Graphics2D) null, plotOrientation0, defaultIntervalCategoryDataset0, (-3801), 0, false, (-509.1996), 15, false);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.updateCrosshairValues(categoryCrosshairState0, "", "", 498.538043741814, 7, (-5880), 2525.0, (PlotOrientation) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'orientation' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((double) statisticalBarRenderer0.ZERO);
      CompassPlot compassPlot0 = new CompassPlot(defaultValueDataset0);
      JFreeChart jFreeChart0 = new JFreeChart(compassPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false, false, true, true, true);
      PlotOrientation plotOrientation0 = chartPanel0.getOrientation();
      lineAndShapeRenderer0.updateCrosshairValues((CategoryCrosshairState) null, 0.2, statisticalBarRenderer0.ZERO, 0.0, 50, 3.0, 0.5235987755982988, plotOrientation0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      LineRenderer3D lineRenderer3D1 = new LineRenderer3D();
      boolean boolean0 = lineRenderer3D0.equals(lineRenderer3D1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      double[][] doubleArray0 = new double[1][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("Bh|uZ^K<Vc}");
      NumberAxis numberAxis0 = new NumberAxis();
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultIntervalCategoryDataset0, categoryAxis3D0, numberAxis0, statisticalBarRenderer0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, false);
      CategoryPlot categoryPlot0 = new CategoryPlot((CategoryDataset) null, (CategoryAxis) null, numberAxis3D0, statisticalLineAndShapeRenderer0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      MeterPlot meterPlot0 = new MeterPlot();
      JFreeChart jFreeChart0 = new JFreeChart(meterPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = stackedAreaRenderer0.createState(plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator();
      stackedBarRenderer0.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator(">b)B5{<G", "", ">b)B5{<G");
      barRenderer3D0.setSeriesURLGenerator(0, (CategoryURLGenerator) standardCategoryURLGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator("", numberFormat0);
      ganttRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) intervalCategoryToolTipGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      levelRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      waterfallBarRenderer0.setSeriesItemLabelGenerator(58, (CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.setPlot((CategoryPlot) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      layeredBarRenderer0.setPlot(combinedDomainCategoryPlot0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      // Undeclared exception!
      try { 
        layeredBarRenderer0.setSeriesURLGenerator((-3874), (CategoryURLGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = ganttRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = lineRenderer3D0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      areaRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, true);
      int int0 = statisticalLineAndShapeRenderer0.getRowCount();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Locale locale0 = Locale.FRENCH;
      NumberFormat numberFormat0 = NumberFormat.getInstance(locale0);
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator("5Ai{M^H`[Lbg,l,^", numberFormat0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.setSeriesToolTipGenerator((-1818), (CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      DecimalFormat decimalFormat0 = new DecimalFormat();
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator("", decimalFormat0);
      lineRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = boxAndWhiskerRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CustomCategoryURLGenerator customCategoryURLGenerator0 = new CustomCategoryURLGenerator();
      scatterRenderer0.setBaseURLGenerator((CategoryURLGenerator) customCategoryURLGenerator0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      CategoryURLGenerator categoryURLGenerator0 = stackedAreaRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.addEntity(standardEntityCollection0, rectangle2D_Double0, defaultCategoryDataset0, (-3359), 0, true);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      int int0 = barRenderer3D0.hashCode();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      int int0 = boxAndWhiskerRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setLegendItemURLGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedAreaRenderer0.getLegendItemLabelGenerator();
      stackedAreaRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("ZjP", lineRenderer3D0.ZERO, 2427.74179491927, 12.0);
      boolean boolean0 = lineRenderer3D0.removeAnnotation(categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Range range0 = barRenderer3D0.findRangeBounds(defaultStatisticalCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Null 'paint' argument.");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(numberAxis3D0);
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.getDomainAxis(combinedRangeCategoryPlot0, defaultBoxAndWhiskerCategoryDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", 8.0, (double) barRenderer3D0.ZERO, 0.0);
      barRenderer3D0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = waterfallBarRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      stackedBarRenderer3D0.setSeriesItemLabelGenerator(3, (CategoryItemLabelGenerator) null);
  }
}