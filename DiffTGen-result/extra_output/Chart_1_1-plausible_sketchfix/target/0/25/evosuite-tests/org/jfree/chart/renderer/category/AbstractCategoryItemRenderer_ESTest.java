/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:17:42 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;
import java.text.NumberFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.TickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.IntervalBarRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.CustomCategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.SlidingGanttCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.Month;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = stackedAreaRenderer0.getToolTipGenerator(2795, 9999, true);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(0.0, 0.0);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = barRenderer3D0.getItemLabelGenerator(255, 3, false);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      boolean boolean0 = intervalBarRenderer0.equals(scatterRenderer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.setSeriesURLGenerator((-850), (CategoryURLGenerator) null, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      // Undeclared exception!
      try { 
        scatterRenderer0.setSeriesToolTipGenerator((-495), (CategoryToolTipGenerator) standardCategoryToolTipGenerator0, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      // Undeclared exception!
      try { 
        defaultCategoryItemRenderer0.setSeriesItemLabelGenerator((-7), (CategoryItemLabelGenerator) null, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.getRangeAxis((CategoryPlot) null, 10);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.getDomainAxis((CategoryPlot) null, defaultStatisticalCategoryDataset0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      Number[][] numberArray0 = new Number[4][4];
      Number[] numberArray1 = new Number[9];
      numberArray0[0] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        areaRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("JIp-E(42hV^", statisticalLineAndShapeRenderer0.ZERO, (double) statisticalLineAndShapeRenderer0.ZERO);
      // Undeclared exception!
      try { 
        levelRenderer0.addAnnotation((CategoryAnnotation) categoryTextAnnotation0, (Layer) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      Object object0 = categoryStepRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      DrawingSupplier drawingSupplier0 = stackedBarRenderer3D0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("Null 'orientation' argument.", "Null 'orientation' argument.", 3.0, 0.2);
      Layer layer0 = Layer.FOREGROUND;
      waterfallBarRenderer0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      levelRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      CategoryURLGenerator categoryURLGenerator0 = minMaxCategoryRenderer0.getURLGenerator((-850), (-850), false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(true, true);
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      lineAndShapeRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      stackedBarRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      CategoryPlot categoryPlot0 = areaRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      LegendItemCollection legendItemCollection0 = intervalBarRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      ValueAxis valueAxis0 = lineAndShapeRenderer0.getRangeAxis(categoryPlot0, 73);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      XYDataItem xYDataItem0 = new XYDataItem((double) ganttRenderer0.ZERO, (double) ganttRenderer0.ZERO);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
      ganttRenderer0.updateCrosshairValues((CategoryCrosshairState) null, xYDataItem0, xYDataItem0, 1040.34801556668, 10, 10, 51.744, plotOrientation0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      Month month0 = new Month();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(valueAxis0);
      PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.updateCrosshairValues(categoryCrosshairState0, "%d]Lo|fW7>YXGPqH", month0, (-1310.0), (-1854), (-304.90430409), (-304.90430409), plotOrientation0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      boolean boolean0 = areaRenderer0.equals(stackedAreaRenderer0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      Range range0 = lineAndShapeRenderer0.findRangeBounds((CategoryDataset) null, true);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryItemRendererState categoryItemRendererState0 = ganttRenderer0.createState((PlotRenderingInfo) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-1.5707963267948966), (-1.5707963267948966));
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemLabelGenerator();
      boxAndWhiskerRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      PolarPlot polarPlot0 = new PolarPlot();
      TickUnit tickUnit0 = polarPlot0.getAngleTickUnit();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("org.jfree.chart.plot.CategoryMarker", tickUnit0, 8.0, 8.0);
      Layer layer0 = Layer.BACKGROUND;
      lineRenderer3D0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Layer layer0 = Layer.FOREGROUND;
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.addAnnotation((CategoryAnnotation) null, layer0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'annotation' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      CustomCategoryURLGenerator customCategoryURLGenerator0 = new CustomCategoryURLGenerator();
      areaRenderer0.setBaseURLGenerator((CategoryURLGenerator) customCategoryURLGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setSeriesURLGenerator(13, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      Paint paint0 = xYBoxAndWhiskerRenderer0.getBoxPaint();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(paint0, xYBoxAndWhiskerRenderer0.DEFAULT_OUTLINE_PAINT, xYBoxAndWhiskerRenderer0.DEFAULT_VALUE_LABEL_PAINT, xYBoxAndWhiskerRenderer0.DEFAULT_OUTLINE_PAINT);
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator("", "kBOC}UBR", "Base tool tip generator not cloneable.");
      waterfallBarRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) standardCategoryURLGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator("", numberFormat0);
      boxAndWhiskerRenderer0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) intervalCategoryToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      statisticalLineAndShapeRenderer0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = spiderWebPlot0.getLabelGenerator();
      minMaxCategoryRenderer0.setSeriesItemLabelGenerator(0, categoryItemLabelGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      minMaxCategoryRenderer0.setSeriesItemLabelGenerator(49, (CategoryItemLabelGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      // Undeclared exception!
      try { 
        areaRenderer0.setPlot((CategoryPlot) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Color color0 = Color.DARK_GRAY;
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(color0, color0, color0, color0);
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Sam (oldman)");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-4088.004300765243), (double) boxAndWhiskerRenderer0.ZERO, (String) null);
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultStatisticalCategoryDataset0, subCategoryAxis0, cyclicNumberAxis0, waterfallBarRenderer0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.initialise((Graphics2D) null, (Rectangle2D) null, categoryPlot0, defaultStatisticalCategoryDataset0, plotRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator("c%}ZEJC;U");
      // Undeclared exception!
      try { 
        areaRenderer0.setSeriesURLGenerator((-1), (CategoryURLGenerator) standardCategoryURLGenerator0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryURLGenerator categoryURLGenerator0 = levelRenderer0.getSeriesURLGenerator(0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = levelRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance();
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator("", numberFormat0);
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((-2011), (CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = boxAndWhiskerRenderer0.getSeriesItemLabelGenerator((-1));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = defaultCategoryItemRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      waterfallBarRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator();
      lineRenderer3D0.setBaseURLGenerator((CategoryURLGenerator) standardCategoryURLGenerator0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, (double) waterfallBarRenderer0.ZERO, 3.0, (-2895.583));
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset(taskSeriesCollection0, 4877, 4877);
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.addEntity((EntityCollection) null, rectangle2D_Double0, slidingGanttCategoryDataset0, 0, (-524), false, 83.06, 973.8972);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      int int0 = intervalBarRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      LegendItem legendItem0 = waterfallBarRenderer0.getLegendItem((-2429), (-2429));
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      int int0 = boxAndWhiskerRenderer0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      int int0 = stackedAreaRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      stackedAreaRenderer0.setLegendItemURLGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = waterfallBarRenderer0.getLegendItemLabelGenerator();
      waterfallBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator0);
      Object object0 = waterfallBarRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("org.jfree.data.Range", "org.jfree.data.Range", 0.0, 0.2);
      boolean boolean0 = scatterRenderer0.removeAnnotation(categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      Number[][] numberArray0 = new Number[4][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      Range range0 = areaRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("1u7~5Y7$Khqbx");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
      // Undeclared exception!
      try { 
        intervalBarRenderer0.getDomainAxis(combinedDomainCategoryPlot0, defaultStatisticalCategoryDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("Joao Guilherme Del Valle", 8.0, (double) lineRenderer3D0.ZERO);
      lineRenderer3D0.addAnnotation((CategoryAnnotation) categoryTextAnnotation0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      // Undeclared exception!
      try { 
        ganttRenderer0.setSeriesItemLabelGenerator((-3181), (CategoryItemLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }
}
