/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:07:31 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.DateTickUnitType;
import org.jfree.chart.axis.StandardTickUnitSource;
import org.jfree.chart.axis.TickUnit;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.ChartChangeEventType;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.renderer.GrayPaintScale;
import org.jfree.chart.renderer.category.BarPainter;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.IntervalBarRenderer;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.renderer.xy.DefaultXYItemRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.CustomCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.ObjectList;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.gantt.SlidingGanttCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.pie.DefaultPieDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      boolean boolean0 = scatterRenderer0.getUseSeriesOffset();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      RendererChangeEvent rendererChangeEvent0 = new RendererChangeEvent(waterfallBarRenderer0, false);
      ChartChangeEventType chartChangeEventType0 = ChartChangeEventType.GENERAL;
      rendererChangeEvent0.setType(chartChangeEventType0);
      waterfallBarRenderer0.notifyListeners(rendererChangeEvent0);
      waterfallBarRenderer0.setLastBarPaint(scatterRenderer0.DEFAULT_OUTLINE_PAINT);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = scatterRenderer0.getLegendItemLabelGenerator();
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      BufferedImage bufferedImage0 = null;
      BufferedImageRenderingSource bufferedImageRenderingSource0 = null;
      try {
        bufferedImageRenderingSource0 = new BufferedImageRenderingSource((BufferedImage) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'image' argument.
         //
         verifyException("org.jfree.chart.BufferedImageRenderingSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      String string0 = "7^|1rJGnIu}";
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator("7^|1rJGnIu}");
      boxAndWhiskerRenderer0.setLegendItemToolTipGenerator(standardCategorySeriesLabelGenerator0);
      boolean boolean0 = false;
      Object object0 = standardCategorySeriesLabelGenerator0.clone();
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      categoryCrosshairState0.setColumnKey("7^|1rJGnIu}");
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.updateCrosshairValues(categoryCrosshairState0, "{0}", "{0}", (-827.7841139), 2758, 2758, 2.0, (PlotOrientation) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'orientation' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      int int0 = 246;
      DefaultXYItemRenderer defaultXYItemRenderer0 = new DefaultXYItemRenderer();
      Boolean boolean0 = defaultXYItemRenderer0.getSeriesLinesVisible(0);
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getSeriesItemLabelGenerator(246);
      lineAndShapeRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null);
      String string0 = "\">Pr|Ix";
      defaultXYItemRenderer0.setSeriesShapesFilled(623, false);
      // Undeclared exception!
      try { 
        defaultXYItemRenderer0.setLegendShape((-1), lineAndShapeRenderer0.DEFAULT_SHAPE);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Icon icon0 = minMaxCategoryRenderer0.getObjectIcon();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart(combinedDomainCategoryPlot0);
      CategoryPlot categoryPlot0 = jFreeChart0.getCategoryPlot();
      minMaxCategoryRenderer0.setPlot(categoryPlot0);
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      intervalBarRenderer0.setMaximumBarWidth((double) minMaxCategoryRenderer0.ZERO);
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      lineAndShapeRenderer0.setSeriesShapesFilled(10, true);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      int int0 = 360;
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = minMaxCategoryRenderer0.getSeriesItemLabelGenerator(360);
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator((-1012), (CategoryItemLabelGenerator) null, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = false;
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = statisticalLineAndShapeRenderer0.createState(plotRenderingInfo0);
      EntityCollection entityCollection0 = categoryItemRendererState0.getEntityCollection();
      JScrollPane jScrollPane0 = null;
      try {
        jScrollPane0 = new JScrollPane(76, 76);
      } catch(IllegalArgumentException e) {
         //
         // invalid verticalScrollBarPolicy
         //
         verifyException("javax.swing.JScrollPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      double double0 = barRenderer0.getMaximumBarWidth();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      // Undeclared exception!
      try { 
        barRenderer0.setSeriesItemLabelGenerator((-2322), (CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      boolean boolean0 = intervalBarRenderer0.getIncludeBaseInRange();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = intervalBarRenderer0.getItemLabelGenerator(2566, 1, false);
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      BarPainter barPainter0 = intervalBarRenderer0.getBarPainter();
      BarRenderer.setDefaultBarPainter(barPainter0);
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(0.0, 0.2);
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(12.0, 12.0);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      JFreeChart jFreeChart0 = new JFreeChart(waferMapPlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(2566, (-599), (-515.1258428061282), (double) 10, chartRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Width (2566) and height (-599) cannot be <= 0
         //
         verifyException("java.awt.image.DirectColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      waterfallBarRenderer0.setDefaultEntityRadius((-2842));
      plotRenderingInfo0.setDataArea((Rectangle2D) null);
      CategoryItemRendererState categoryItemRendererState0 = waterfallBarRenderer0.createState(plotRenderingInfo0);
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setDrawOutlines(false);
      waterfallBarRenderer0.setItemMargin((double) scatterRenderer0.ZERO);
      BarRenderer.setDefaultShadowsVisible(false);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      ObjectList objectList0 = new ObjectList();
      layeredBarRenderer0.seriesBarWidthList = objectList0;
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset(taskSeriesCollection0, (-2885), (-2885));
      Range range0 = layeredBarRenderer0.findRangeBounds(slidingGanttCategoryDataset0);
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      Locale locale0 = Locale.JAPANESE;
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance(locale0);
      NumberFormat numberFormat1 = NumberFormat.getPercentInstance();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("", numberFormat0);
      groupedStackedBarRenderer0.setBaseLegendShape(layeredBarRenderer0.DEFAULT_SHAPE);
      groupedStackedBarRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) standardCategoryToolTipGenerator0, true);
      boolean boolean0 = groupedStackedBarRenderer0.equals(ganttRenderer0);
      int int0 = groupedStackedBarRenderer0.getPassCount();
      LevelRenderer levelRenderer0 = new LevelRenderer();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      RendererChangeEvent rendererChangeEvent0 = new RendererChangeEvent(integer0);
      JFreeChart jFreeChart0 = rendererChangeEvent0.getChart();
      ChartPanel chartPanel0 = new ChartPanel((JFreeChart) null, false, false, false, false, false);
      // Undeclared exception!
      try { 
        chartPanel0.createGraphics2D();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.ChartPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = lineAndShapeRenderer0.getLegendItemURLGenerator();
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-3207.12), 0.0);
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator();
      stackedBarRenderer3D0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, false);
      BarPainter barPainter0 = stackedBarRenderer3D0.getBarPainter();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      minMaxCategoryRenderer0.setSeriesItemLabelGenerator(541, (CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0);
      Paint paint0 = minMaxCategoryRenderer0.getGroupPaint();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      CategoryDataset categoryDataset0 = null;
      Range range0 = intervalBarRenderer0.findRangeBounds((CategoryDataset) null);
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Range range1 = statisticalLineAndShapeRenderer0.findRangeBounds((CategoryDataset) null, false);
      Stroke stroke0 = statisticalLineAndShapeRenderer0.lookupSeriesOutlineStroke(1447);
      statisticalLineAndShapeRenderer0.setErrorIndicatorPaint(intervalBarRenderer0.DEFAULT_OUTLINE_PAINT);
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      double double0 = stackedBarRenderer3D0.getYOffset();
      DateAxis dateAxis0 = new DateAxis();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(dateAxis0);
      PlotOrientation plotOrientation0 = null;
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale(4.0, 3.0);
      } catch(IllegalArgumentException e) {
         //
         // Requires lowerBound < upperBound.
         //
         verifyException("org.jfree.chart.renderer.GrayPaintScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      LegendItemCollection legendItemCollection0 = categoryStepRenderer0.getLegendItems();
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      int int0 = categoryStepRenderer0.hashCode();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset(taskSeriesCollection0, 5, 5);
      Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds(slidingGanttCategoryDataset0);
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setBaseShapesFilled(true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getBaseURLGenerator();
      boxAndWhiskerRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, true);
      boxAndWhiskerRenderer0.setMedianVisible(true);
      CategoryURLGenerator categoryURLGenerator1 = boxAndWhiskerRenderer0.getURLGenerator(400, 1, true);
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(822.4618359, 822.4618359);
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      StandardTickUnitSource standardTickUnitSource0 = new StandardTickUnitSource();
      TickUnit tickUnit0 = standardTickUnitSource0.getCeilingTickUnit(3.0);
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(0.2, (double) intervalBarRenderer0.ZERO, tickUnit0, (double) statisticalBarRenderer0.ZERO, barRenderer3D0.DEFAULT_OUTLINE_PAINT, intervalBarRenderer0.DEFAULT_OUTLINE_STROKE);
      categoryLineAnnotation0.setCategory2(3.0);
      Layer layer0 = Layer.FOREGROUND;
      intervalBarRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, layer0);
      boolean boolean0 = statisticalBarRenderer0.equals(intervalBarRenderer0);
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      // Undeclared exception!
      try { 
        defaultBoxAndWhiskerCategoryDataset0.getQ1Value(0, 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Shape shape0 = boxAndWhiskerRenderer0.lookupLegendShape(2461);
      LegendItem legendItem0 = boxAndWhiskerRenderer0.getLegendItem(0, 0);
      waterfallBarRenderer0.setBase(0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boolean boolean0 = boxAndWhiskerRenderer0.isMeanVisible();
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      String string0 = "vD/2?";
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      RingPlot ringPlot0 = new RingPlot(defaultPieDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("vD/2?", ringPlot0);
      int int0 = 32;
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(32, 32);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      LevelRenderer levelRenderer0 = new LevelRenderer();
      Point2D.Float point2D_Float0 = new Point2D.Float();
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Float0, point2D_Float0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      CategoryPlot categoryPlot0 = groupedStackedBarRenderer0.getPlot();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        levelRenderer0.initialise(graphics2D0, rectangle0, (CategoryPlot) null, defaultKeyedValues2DDataset0, plotRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = false;
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(90.0, 90.0, false);
      LinkedList<CustomCategoryURLGenerator> linkedList0 = new LinkedList<CustomCategoryURLGenerator>();
      DateTickUnitType dateTickUnitType0 = DateTickUnitType.DAY;
      int int0 = 181;
      DateTickUnit dateTickUnit0 = new DateTickUnit(dateTickUnitType0, 181);
      String string0 = "";
      MockDate mockDate0 = null;
      try {
        mockDate0 = new MockDate("");
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Date", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryURLGenerator categoryURLGenerator0 = lineRenderer3D0.getSeriesURLGenerator(620);
      lineRenderer3D0.setBaseURLGenerator((CategoryURLGenerator) null);
      CategoryURLGenerator categoryURLGenerator1 = lineRenderer3D0.getSeriesURLGenerator(0);
      DateFormat dateFormat0 = MockDateFormat.getInstance();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator("", dateFormat0);
      lineRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(5, (double) categoryStepRenderer0.ZERO, categoryStepRenderer0.ZERO, 5, categoryStepRenderer0.DEFAULT_OUTLINE_PAINT, categoryStepRenderer0.DEFAULT_STROKE);
      categoryLineAnnotation0.setNotify(true);
      boolean boolean0 = categoryStepRenderer0.removeAnnotation(categoryLineAnnotation0);
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      JFreeChart jFreeChart0 = new JFreeChart(fastScatterPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 1518, 999, (-1), 5, 999, 999, true, true, false, false, true, false, false);
      // Undeclared exception!
      try { 
        chartPanel0.createGraphics2D();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.ChartPanel", e);
      }
  }
}
