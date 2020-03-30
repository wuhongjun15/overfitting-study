/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:43:00 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
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
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.category.SlidingCategoryDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      int int0 = levelRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryURLGenerator categoryURLGenerator0 = ganttRenderer0.getURLGenerator((-1950), (-43), true);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryURLGenerator categoryURLGenerator0 = levelRenderer0.getSeriesURLGenerator(1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = scatterRenderer0.getSeriesToolTipGenerator(2079);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      int int0 = lineRenderer3D0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-822.89769), (-822.89769), false);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedBarRenderer3D0.getLegendItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      LegendItem legendItem0 = barRenderer3D0.getLegendItem((-41), 102);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = lineRenderer3D0.findRangeBounds((CategoryDataset) defaultBoxAndWhiskerCategoryDataset0, true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      Locale locale0 = Locale.CANADA_FRENCH;
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("_:$5xw4y7", numberFormat0);
      boolean boolean0 = statisticalLineAndShapeRenderer0.equals(standardCategoryToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, false);
      CustomCategoryURLGenerator customCategoryURLGenerator0 = new CustomCategoryURLGenerator();
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.setSeriesURLGenerator((-4173), (CategoryURLGenerator) customCategoryURLGenerator0, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = spiderWebPlot0.getLabelGenerator();
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.setSeriesItemLabelGenerator((-656), categoryItemLabelGenerator0, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SlidingCategoryDataset slidingCategoryDataset0 = new SlidingCategoryDataset(defaultStatisticalCategoryDataset0, 506, 60);
      // Undeclared exception!
      try { 
        defaultCategoryItemRenderer0.getDomainAxis(categoryPlot0, slidingCategoryDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      double[][] doubleArray0 = new double[4][9];
      double[] doubleArray1 = new double[5];
      doubleArray0[2] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0, false);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      DrawingSupplier drawingSupplier0 = intervalBarRenderer0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      double[][] doubleArray0 = new double[4][9];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = lineAndShapeRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0, false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(0.2, 0.2, 3.0, 0.0, intervalBarRenderer0.DEFAULT_OUTLINE_PAINT, statisticalBarRenderer0.DEFAULT_OUTLINE_STROKE);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, (Layer) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      levelRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      groupedStackedBarRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) standardCategoryToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      levelRenderer0.setPlot(categoryPlot0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryPlot categoryPlot0 = statisticalBarRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.addEntity(standardEntityCollection0, (Shape) null, defaultKeyedValues2DDataset0, 0, 263, false);
      } catch(IllegalArgumentException e) {
         //
         // Null 'hotspot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      LegendItemCollection legendItemCollection0 = lineAndShapeRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("[l=L<bY$n7k7)bZrLc");
      CategoryPlot categoryPlot0 = new CategoryPlot((CategoryDataset) null, categoryAxis3D0, numberAxis3D0, statisticalLineAndShapeRenderer0);
      ValueAxis valueAxis0 = statisticalLineAndShapeRenderer0.getRangeAxis(categoryPlot0, (-1186));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Object object0 = statisticalBarRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      // Undeclared exception!
      try { 
        waterfallBarRenderer0.updateCrosshairValues(categoryCrosshairState0, "", (Comparable) null, 0.0, 1, 0.0, 0.0, plotOrientation0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      GanttRenderer ganttRenderer1 = new GanttRenderer();
      boolean boolean0 = ganttRenderer0.equals(ganttRenderer1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      PlotOrientation plotOrientation0 = combinedRangeCategoryPlot0.getOrientation();
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.EXPAND;
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      // Undeclared exception!
      try { 
        stackedBarRenderer0.calculateRangeMarkerTextAnchorPoint((Graphics2D) null, plotOrientation0, (Rectangle2D) null, (Rectangle2D) null, combinedRangeCategoryPlot0.DEFAULT_INSETS, lengthAdjustmentType0, rectangleAnchor0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'base' argument.
         //
         verifyException("org.jfree.chart.util.RectangleInsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      JFreeChart jFreeChart0 = new JFreeChart("rD}{,-{[d6r", minMaxCategoryRenderer0.DEFAULT_VALUE_LABEL_FONT, spiderWebPlot0, false);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2207, 10, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      LogAxis logAxis0 = new LogAxis();
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultKeyedValues2DDataset0, (CategoryAxis) null, logAxis0, minMaxCategoryRenderer0);
      ValueMarker valueMarker0 = new ValueMarker(4.0, jFreeChart0.DEFAULT_BACKGROUND_PAINT, logAxis0.DEFAULT_AXIS_LINE_STROKE);
      minMaxCategoryRenderer0.drawRangeMarker(graphics2D0, categoryPlot0, logAxis0, valueMarker0, (Rectangle2D) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("[l=L<bY$n7k7)bZrLc");
      CategoryPlot categoryPlot0 = new CategoryPlot((CategoryDataset) null, categoryAxis3D0, numberAxis3D0, statisticalLineAndShapeRenderer0);
      Shape shape0 = statisticalLineAndShapeRenderer0.lookupLegendShape(560);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, true);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = lineAndShapeRenderer0.createState(plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, true);
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemLabelGenerator();
      boxAndWhiskerRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.addAnnotation((CategoryAnnotation) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'annotation' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      levelRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setSeriesURLGenerator(3035, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(2256.856137626574, 2256.856137626574);
      barRenderer3D0.setSeriesURLGenerator(0, (CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      Locale locale0 = Locale.FRANCE;
      NumberFormat numberFormat0 = NumberFormat.getInstance(locale0);
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("", numberFormat0);
      lineRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) standardCategoryToolTipGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setSeriesToolTipGenerator(81, (CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      defaultCategoryItemRenderer0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getToolTipGenerator((-2568), (-2568), true);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      levelRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      DateFormat dateFormat0 = MockDateFormat.getInstance();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("", dateFormat0);
      categoryStepRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setSeriesItemLabelGenerator(3, (CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("", numberFormat0);
      scatterRenderer0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = levelRenderer0.getItemLabelGenerator((-2940), 0, false);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      RingPlot ringPlot0 = new RingPlot(defaultKeyedValuesDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.event.AxisChangeEvent", barRenderer3D0.DEFAULT_VALUE_LABEL_FONT, ringPlot0, false);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, (-1127.82), 0.0, (ChartRenderingInfo) null);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(1233.7429811227, 0.0, (-3145.3), 8.0);
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        barRenderer3D0.initialise(graphics2D0, rectangle0, (CategoryPlot) null, defaultBoxAndWhiskerCategoryDataset0, plotRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      // Undeclared exception!
      try { 
        ganttRenderer0.setSeriesURLGenerator((-4538), (CategoryURLGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalLineAndShapeRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      areaRenderer0.setLegendItemToolTipGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      int int0 = levelRenderer0.getRowCount();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      defaultCategoryItemRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = scatterRenderer0.getSeriesItemLabelGenerator(97);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      categoryStepRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      minMaxCategoryRenderer0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryURLGenerator categoryURLGenerator0 = lineRenderer3D0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      int int0 = levelRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      stackedAreaRenderer0.setLegendItemURLGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("`5l+'ENLy|/>", 500, (double) statisticalLineAndShapeRenderer0.ZERO, 626.0);
      boolean boolean0 = scatterRenderer0.removeAnnotation(categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      // Undeclared exception!
      try { 
        layeredBarRenderer0.getDomainAxis((CategoryPlot) null, (CategoryDataset) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("k", "k", 0.0);
      areaRenderer0.addAnnotation((CategoryAnnotation) categoryTextAnnotation0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = spiderWebPlot0.getLabelGenerator();
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.setSeriesItemLabelGenerator((-409), categoryItemLabelGenerator0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }
}