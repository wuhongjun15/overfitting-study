/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 07:59:12 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.text.ChoiceFormat;
import java.text.DateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.labels.IntervalCategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.IntervalBarRenderer;
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
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.CustomCategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.category.SlidingCategoryDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.ValueDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.Quarter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      ValueAxis valueAxis0 = minMaxCategoryRenderer0.getRangeAxis(categoryPlot0, 0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = scatterRenderer0.getItemLabelGenerator(3, (-3140), true);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultKeyedValues2DDataset0, (CategoryAxis) null, numberAxis3D0, minMaxCategoryRenderer0);
      CategoryAxis categoryAxis0 = minMaxCategoryRenderer0.getDomainAxis(categoryPlot0, defaultKeyedValues2DDataset0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CustomCategoryURLGenerator customCategoryURLGenerator0 = new CustomCategoryURLGenerator();
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.setSeriesURLGenerator((-2025), (CategoryURLGenerator) customCategoryURLGenerator0, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      // Undeclared exception!
      try { 
        barRenderer0.setSeriesURLGenerator((-203), (CategoryURLGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.setSeriesItemLabelGenerator((-3297), (CategoryItemLabelGenerator) null, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      // Undeclared exception!
      try { 
        scatterRenderer0.setSeriesItemLabelGenerator((-3140), (CategoryItemLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        lineRenderer3D0.getDomainAxis((CategoryPlot) null, defaultCategoryDataset0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-1126.7404932559), 1000.0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("vy");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      Number[][] numberArray0 = new Number[0][6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((String[]) null, numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.getDomainAxis(combinedDomainCategoryPlot0, defaultIntervalCategoryDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((Number[][]) null, (Number[][]) null);
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Object object0 = statisticalBarRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      SlidingCategoryDataset slidingCategoryDataset0 = new SlidingCategoryDataset(defaultMultiValueCategoryDataset0, (-1278), 0);
      Range range0 = scatterRenderer0.findRangeBounds((CategoryDataset) slidingCategoryDataset0, true);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      CustomCategoryURLGenerator customCategoryURLGenerator0 = new CustomCategoryURLGenerator();
      barRenderer3D0.setSeriesURLGenerator(0, (CategoryURLGenerator) customCategoryURLGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryURLGenerator categoryURLGenerator0 = boxAndWhiskerRenderer0.getURLGenerator(0, 0, false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator("labelBackgroundPaint", dateFormat0);
      barRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) intervalCategoryToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator();
      boxAndWhiskerRenderer0.setSeriesToolTipGenerator(4303, (CategoryToolTipGenerator) intervalCategoryToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      levelRenderer0.setPlot(combinedDomainCategoryPlot0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryPlot categoryPlot0 = lineRenderer3D0.getPlot();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      LegendItemCollection legendItemCollection0 = barRenderer3D0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      String[] stringArray0 = new String[7];
      SymbolAxis symbolAxis0 = new SymbolAxis("K,fjn", stringArray0);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(symbolAxis0);
      ValueAxis valueAxis0 = scatterRenderer0.getRangeAxis(combinedRangeCategoryPlot0, 500);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, true);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot((ValueDataset) null);
      PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
      double[][] doubleArray0 = new double[6][3];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      lineAndShapeRenderer0.drawItemLabel((Graphics2D) null, plotOrientation0, defaultIntervalCategoryDataset0, 1, 3, true, 1, 3.0, false);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      Quarter quarter0 = new Quarter();
      ChartPanel chartPanel0 = new ChartPanel((JFreeChart) null, false, false, true, true, true);
      PlotOrientation plotOrientation0 = chartPanel0.getOrientation();
      // Undeclared exception!
      try { 
        intervalBarRenderer0.updateCrosshairValues(categoryCrosshairState0, quarter0, quarter0, 983.076828, 4, (-668.197), 0.0, plotOrientation0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      Shape shape0 = lineRenderer3D0.lookupSeriesShape((-1027));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      boolean boolean0 = lineAndShapeRenderer0.equals(defaultCategoryItemRenderer0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      LegendItem legendItem0 = levelRenderer0.getLegendItem(3050, 74);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 0.0, true);
      PolarPlot polarPlot0 = new PolarPlot();
      JFreeChart jFreeChart0 = new JFreeChart("", stackedBarRenderer3D0.DEFAULT_VALUE_LABEL_FONT, polarPlot0, false);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 10, (ChartRenderingInfo) null);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
      Rectangle rectangle0 = new Rectangle(0, 1);
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.EXPAND;
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.BOTTOM_RIGHT;
      Point2D point2D0 = stackedBarRenderer3D0.calculateRangeMarkerTextAnchorPoint(graphics2D0, plotOrientation0, rectangle0, rectangle0, polarPlot0.DEFAULT_INSETS, lengthAdjustmentType0, rectangleAnchor0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      double[][] doubleArray0 = new double[9][3];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      CategoryAxis categoryAxis0 = new CategoryAxis("AWp");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-2131.95720063435), 0.2);
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultIntervalCategoryDataset0, categoryAxis0, cyclicNumberAxis0, ganttRenderer0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Range range0 = boxAndWhiskerRenderer0.findRangeBounds((CategoryDataset) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((double) groupedStackedBarRenderer0.ZERO, 0.0, "#");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(cyclicNumberAxis0);
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)AbstractRenderer.DEFAULT_SHAPE;
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.initialise((Graphics2D) null, rectangle0, combinedRangeCategoryPlot0, defaultBoxAndWhiskerCategoryDataset0, plotRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      JFreeChart jFreeChart0 = new JFreeChart(combinedRangeXYPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1371, 10);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      LevelRenderer levelRenderer0 = new LevelRenderer();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("jN[AHI");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(extendedCategoryAxis0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        levelRenderer0.initialise(graphics2D0, (Rectangle2D) null, combinedDomainCategoryPlot0, (CategoryDataset) null, plotRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = statisticalBarRenderer0.createState(plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      // Undeclared exception!
      try { 
        areaRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Layer layer0 = Layer.BACKGROUND;
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.addAnnotation((CategoryAnnotation) null, layer0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'annotation' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator("'c1bNKJ'k", "=A4r7b.O0kI7", "'c1bNKJ'k");
      lineAndShapeRenderer0.setBaseURLGenerator((CategoryURLGenerator) standardCategoryURLGenerator0, false);
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      boolean boolean0 = lineAndShapeRenderer0.equals(defaultCategoryItemRenderer0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      lineAndShapeRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-280.8641639890458), 8.0, 1885.54350708, 3.0);
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      SlidingCategoryDataset slidingCategoryDataset0 = new SlidingCategoryDataset(defaultKeyedValues2DDataset0, 74, 74);
      // Undeclared exception!
      try { 
        barRenderer3D0.addEntity(standardEntityCollection0, rectangle2D_Double0, slidingCategoryDataset0, 74, 0, false, 2544.965391555755, 1885.54350708);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 74, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator();
      minMaxCategoryRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      // Undeclared exception!
      try { 
        categoryStepRenderer0.setPlot((CategoryPlot) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator();
      minMaxCategoryRenderer0.setSeriesURLGenerator(1916, (CategoryURLGenerator) standardCategoryURLGenerator0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = areaRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryURLGenerator categoryURLGenerator0 = lineRenderer3D0.getSeriesURLGenerator(495);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      double[] doubleArray0 = new double[7];
      String[] stringArray0 = new String[7];
      ChoiceFormat choiceFormat0 = new ChoiceFormat(doubleArray0, stringArray0);
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator("U!BRWlZD\"", choiceFormat0);
      scatterRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(2.0, (double) intervalBarRenderer0.ZERO, false);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = intervalBarRenderer0.getLegendItemLabelGenerator();
      stackedBarRenderer3D0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      int int0 = groupedStackedBarRenderer0.getRowCount();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      DateFormat dateFormat0 = DateFormat.getTimeInstance(0);
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("", dateFormat0);
      stackedAreaRenderer0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) standardCategoryToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = groupedStackedBarRenderer0.getSeriesItemLabelGenerator(680);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      stackedBarRenderer3D0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      CategoryURLGenerator categoryURLGenerator0 = areaRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = scatterRenderer0.getSeriesToolTipGenerator(335);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D((-2130.0), (-2130.0));
      int int0 = barRenderer3D0.hashCode();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      int int0 = categoryStepRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator("");
      stackedBarRenderer0.setLegendItemURLGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = categoryStepRenderer0.getLegendItemLabelGenerator();
      categoryStepRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      LogAxis logAxis0 = new LogAxis();
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultStatisticalCategoryDataset0, categoryAxis0, logAxis0, defaultCategoryItemRenderer0);
      CategoryAxis categoryAxis1 = defaultCategoryItemRenderer0.getDomainAxis(categoryPlot0, defaultStatisticalCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", (double) stackedAreaRenderer0.ZERO, (-1.0));
      stackedAreaRenderer0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = boxAndWhiskerRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator();
      lineRenderer3D0.setSeriesItemLabelGenerator(10, (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0);
  }
}