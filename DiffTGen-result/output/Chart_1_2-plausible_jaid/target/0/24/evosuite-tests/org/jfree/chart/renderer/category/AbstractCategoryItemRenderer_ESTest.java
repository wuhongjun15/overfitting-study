/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:11:15 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
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
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.pie.PieDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      LogAxis logAxis0 = new LogAxis("V'X");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(logAxis0);
      waterfallBarRenderer0.setPlot(combinedRangeCategoryPlot0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryURLGenerator categoryURLGenerator0 = scatterRenderer0.getSeriesURLGenerator((-7));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, true);
      int int0 = lineAndShapeRenderer0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = ganttRenderer0.getLegendItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 0.0);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      CategoryAxis categoryAxis0 = stackedBarRenderer3D0.getDomainAxis(combinedDomainCategoryPlot0, (CategoryDataset) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "Not implemented.";
      Number[][] numberArray0 = new Number[2][3];
      Number[] numberArray1 = new Number[7];
      numberArray1[0] = (Number) statisticalBarRenderer0.ZERO;
      numberArray1[1] = (Number) 5;
      numberArray0[0] = numberArray1;
      numberArray0[1] = numberArray0[0];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, numberArray0, numberArray0);
      Range range0 = categoryStepRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0, false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "Not implemented.";
      Number[][] numberArray0 = new Number[2][3];
      Number[] numberArray1 = new Number[7];
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      numberArray1[1] = (Number) integer0;
      numberArray0[1] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, numberArray0, numberArray0);
      Range range0 = categoryStepRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0, false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      boolean boolean0 = statisticalLineAndShapeRenderer0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.setSeriesURLGenerator((-770), (CategoryURLGenerator) null, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.setSeriesURLGenerator((-3415), (CategoryURLGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.setSeriesItemLabelGenerator((-1070), (CategoryItemLabelGenerator) null, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      // Undeclared exception!
      try { 
        levelRenderer0.getDomainAxis(combinedDomainCategoryPlot0, defaultKeyedValues2DDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0, 1567.0F, 10.0F, (-2670.29F));
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      // Undeclared exception!
      try { 
        scatterRenderer0.addEntity(standardEntityCollection0, rectangle2D_Float0, defaultKeyedValues2DDataset0, (-3417), 754, true, 1567.0F, 0.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Object object0 = statisticalBarRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("u<:", "u<:", 0.005);
      Layer layer0 = Layer.FOREGROUND;
      scatterRenderer0.addAnnotation((CategoryAnnotation) categoryTextAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      Paint paint0 = piePlot3D0.getLabelBackgroundPaint();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(paint0, piePlot3D0.DEFAULT_OUTLINE_PAINT, paint0, piePlot3D0.DEFAULT_OUTLINE_PAINT);
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation(">&r8/(hlzM|lIhJ", 1.0F, 1.0F, 0.0);
      // Undeclared exception!
      try { 
        waterfallBarRenderer0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0, (Layer) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator("org.jfree.chart.needle.PointerNeedle", "org.jfree.chart.needle.PointerNeedle", "jHZ8b]fp'");
      lineAndShapeRenderer0.setBaseURLGenerator((CategoryURLGenerator) standardCategoryURLGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      categoryStepRenderer0.setSeriesToolTipGenerator(334, (CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      areaRenderer0.setSeriesItemLabelGenerator(1, (CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      CategoryToolTipGenerator categoryToolTipGenerator0 = lineAndShapeRenderer0.getSeriesToolTipGenerator(2730);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      // Undeclared exception!
      try { 
        lineRenderer3D0.addEntity(standardEntityCollection0, boxAndWhiskerRenderer0.DEFAULT_SHAPE, defaultKeyedValues2DDataset0, (-816), 920, true);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ValueAxis valueAxis0 = boxAndWhiskerRenderer0.getRangeAxis(combinedDomainCategoryPlot0, (-1484));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Shape shape0 = boxAndWhiskerRenderer0.lookupSeriesShape(232);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      LegendItem legendItem0 = minMaxCategoryRenderer0.getLegendItem(40, (-2960));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((Number) null);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.NO_CHANGE;
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_LEFT;
      // Undeclared exception!
      try { 
        lineRenderer3D0.calculateRangeMarkerTextAnchorPoint((Graphics2D) null, plotOrientation0, (Rectangle2D) null, (Rectangle2D) null, thermometerPlot0.DEFAULT_INSETS, lengthAdjustmentType0, rectangleAnchor0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'base' argument.
         //
         verifyException("org.jfree.chart.util.RectangleInsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      PiePlot piePlot0 = new PiePlot((PieDataset) null);
      JFreeChart jFreeChart0 = new JFreeChart("Unknown layer.", minMaxCategoryRenderer0.DEFAULT_VALUE_LABEL_FONT, piePlot0, false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      CategoryPlot categoryPlot0 = minMaxCategoryRenderer0.getPlot();
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      IntervalMarker intervalMarker0 = new IntervalMarker(1166.01370234359, 3.0, categoryPlot0.DEFAULT_CROSSHAIR_PAINT, boxAndWhiskerRenderer0.DEFAULT_STROKE, piePlot0.DEFAULT_LABEL_SHADOW_PAINT, boxAndWhiskerRenderer0.DEFAULT_OUTLINE_STROKE, 0.0F);
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.drawRangeMarker(graphics2D0, (CategoryPlot) null, (ValueAxis) null, intervalMarker0, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      PiePlot piePlot0 = new PiePlot((PieDataset) null);
      JFreeChart jFreeChart0 = new JFreeChart("Unknown layer.", minMaxCategoryRenderer0.DEFAULT_VALUE_LABEL_FONT, piePlot0, false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      CategoryPlot categoryPlot0 = minMaxCategoryRenderer0.getPlot();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      statisticalBarRenderer0.drawRangeLine(graphics2D0, (CategoryPlot) null, numberAxis3D0, (Rectangle2D) null, 2.0, categoryPlot0.DEFAULT_OUTLINE_PAINT, minMaxCategoryRenderer0.DEFAULT_OUTLINE_STROKE);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds((CategoryDataset) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      double[][] doubleArray0 = new double[1][6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("ftl!y+j`");
      LogAxis logAxis0 = new LogAxis("");
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultIntervalCategoryDataset0, categoryAxis3D0, logAxis0, ganttRenderer0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.initialise((Graphics2D) null, (Rectangle2D) null, categoryPlot0, defaultIntervalCategoryDataset0, plotRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = layeredBarRenderer0.createState(plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      // Undeclared exception!
      try { 
        scatterRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot(defaultMultiValueCategoryDataset0);
      Paint paint0 = spiderWebPlot0.getBaseSeriesOutlinePaint();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(paint0, spiderWebPlot0.DEFAULT_LABEL_PAINT, spiderWebPlot0.DEFAULT_LABEL_OUTLINE_PAINT, spiderWebPlot0.DEFAULT_LABEL_SHADOW_PAINT);
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
  public void test33()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      CategoryURLGenerator categoryURLGenerator0 = categoryStepRenderer0.getURLGenerator(0, 0, true);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      DecimalFormat decimalFormat0 = new DecimalFormat("R*og", decimalFormatSymbols0);
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("R*og", decimalFormat0);
      stackedBarRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) standardCategoryToolTipGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setSeriesToolTipGenerator(174, (CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator("by;G2;C(lCi", mockSimpleDateFormat0);
      minMaxCategoryRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(0.0, 0.0);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = barRenderer3D0.getItemLabelGenerator(750, 0, false);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      Rectangle rectangle0 = new Rectangle();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.initialise((Graphics2D) null, rectangle0, (CategoryPlot) null, taskSeriesCollection0, plotRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = categoryStepRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      stackedBarRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      areaRenderer0.setLegendItemToolTipGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      int int0 = groupedStackedBarRenderer0.getRowCount();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      statisticalLineAndShapeRenderer0.setSeriesToolTipGenerator(25, (CategoryToolTipGenerator) standardCategoryToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      stackedBarRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = ganttRenderer0.getSeriesItemLabelGenerator(21);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = ganttRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      categoryStepRenderer0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      CategoryURLGenerator categoryURLGenerator0 = stackedBarRenderer3D0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = categoryStepRenderer0.getToolTipGenerator(1, 1, true);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      int int0 = areaRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(0.0, 0.0);
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot((ValueAxis) null);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getDomainAxisEdge(576);
      // Undeclared exception!
      try { 
        barRenderer3D0.getItemMiddle(lineAndShapeRenderer0.ZERO, lineAndShapeRenderer0.ZERO, defaultKeyedValues2DDataset0, categoryAxis0, (Rectangle2D) null, rectangleEdge0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid category index: -1
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      int int0 = statisticalLineAndShapeRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setLegendItemURLGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(0.0, (double) scatterRenderer0.ZERO);
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("org.jfree.data.general.DefaultValueDataset", 10, 1.0F);
      boolean boolean0 = barRenderer3D0.removeAnnotation(categoryTextAnnotation0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        ganttRenderer0.getDomainAxis((CategoryPlot) null, defaultCategoryDataset0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(areaRenderer0.ZERO, 0.0, areaRenderer0.ZERO, 0.0, areaRenderer0.DEFAULT_PAINT, areaRenderer0.DEFAULT_STROKE);
      areaRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = waterfallBarRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      stackedBarRenderer3D0.setSeriesItemLabelGenerator(232, (CategoryItemLabelGenerator) null);
  }
}
