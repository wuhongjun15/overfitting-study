/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:22:34 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
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
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.category.SlidingCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator("\"uw", numberFormat0);
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setSeriesToolTipGenerator(1378, (CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryToolTipGenerator categoryToolTipGenerator0 = lineRenderer3D0.getToolTipGenerator(71, 0, true);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      LegendItem legendItem0 = waterfallBarRenderer0.getLegendItem((-1652), (-1652));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      CategoryAxis categoryAxis0 = scatterRenderer0.getDomainAxis(categoryPlot0, (CategoryDataset) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      double[][] doubleArray0 = new double[3][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      NumberAxis numberAxis0 = new NumberAxis();
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultIntervalCategoryDataset0, categoryAxis0, numberAxis0, lineRenderer3D0);
      CategoryAxis categoryAxis1 = ganttRenderer0.getDomainAxis(categoryPlot0, defaultIntervalCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryToolTipGenerator categoryToolTipGenerator0 = lineRenderer3D0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      Number[][] numberArray0 = new Number[1][9];
      Number[] numberArray1 = new Number[6];
      numberArray1[0] = (Number) 0.2;
      numberArray0[0] = numberArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      Range range0 = stackedBarRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0, false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      DateFormat dateFormat0 = DateFormat.getTimeInstance();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator("Null 'prefix' argument.", dateFormat0);
      boolean boolean0 = defaultCategoryItemRenderer0.equals(intervalCategoryToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((-577), (CategoryToolTipGenerator) null, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      Arc2D.Float arc2D_Float0 = new Arc2D.Float();
      // Undeclared exception!
      try { 
        defaultCategoryItemRenderer0.addEntity(standardEntityCollection0, arc2D_Float0, (CategoryDataset) null, (-2031), (-3327), false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-1807.81001), (-446.257899274433));
      Object object0 = stackedBarRenderer3D0.clone();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      Range range0 = scatterRenderer0.findRangeBounds((CategoryDataset) taskSeriesCollection0, false);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(true, true);
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation("{2}", 1.0, "", (double) lineAndShapeRenderer0.ZERO, lineAndShapeRenderer0.DEFAULT_VALUE_LABEL_PAINT, lineAndShapeRenderer0.DEFAULT_STROKE);
      Layer layer0 = Layer.FOREGROUND;
      scatterRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CustomCategoryURLGenerator customCategoryURLGenerator0 = new CustomCategoryURLGenerator();
      statisticalBarRenderer0.setBaseURLGenerator((CategoryURLGenerator) customCategoryURLGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryURLGenerator categoryURLGenerator0 = ganttRenderer0.getURLGenerator(0, (-565), false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      stackedBarRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("", numberFormat0, numberFormat0);
      scatterRenderer0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      defaultCategoryItemRenderer0.setPlot(categoryPlot0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 0.0, true);
      CategoryToolTipGenerator categoryToolTipGenerator0 = stackedBarRenderer3D0.getSeriesToolTipGenerator((-1643));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      CategoryPlot categoryPlot0 = stackedBarRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 0, false);
      LegendItemCollection legendItemCollection0 = stackedBarRenderer3D0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      ValueAxis valueAxis0 = levelRenderer0.getRangeAxis(combinedRangeCategoryPlot0, 1598);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(1804.35, 1804.35);
      DrawingSupplier drawingSupplier0 = stackedBarRenderer3D0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      GanttRenderer ganttRenderer1 = new GanttRenderer();
      boolean boolean0 = ganttRenderer0.equals(ganttRenderer1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setDataBoundsIncludesVisibleSeriesOnly(false);
      double[][] doubleArray0 = new double[3][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      NumberAxis numberAxis0 = new NumberAxis();
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultIntervalCategoryDataset0, categoryAxis0, numberAxis0, lineRenderer3D0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Range range0 = scatterRenderer0.findRangeBounds((CategoryDataset) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(0.0, 0.0);
      Number[][] numberArray0 = new Number[2][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((String[]) null, numberArray0, numberArray0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1173.4364));
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultIntervalCategoryDataset0, (CategoryAxis) null, cyclicNumberAxis0, barRenderer3D0);
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float();
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      // Undeclared exception!
      try { 
        barRenderer3D0.initialise((Graphics2D) null, rectangle2D0, categoryPlot0, defaultIntervalCategoryDataset0, (PlotRenderingInfo) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.BarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = minMaxCategoryRenderer0.createState(plotRenderingInfo0);
      EntityCollection entityCollection0 = categoryItemRendererState0.getEntityCollection();
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.0F, 0.0F, 0.0F);
      String[] stringArray0 = new String[6];
      Number[][] numberArray0 = new Number[6][0];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.addEntity(entityCollection0, line2D_Float0, defaultIntervalCategoryDataset0, 0, 768, false);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 768
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setSeriesURLGenerator(3561, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      statisticalLineAndShapeRenderer0.setSeriesURLGenerator(2488, (CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Locale locale0 = Locale.PRC;
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance(locale0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator(")~yy|8)`L", mockSimpleDateFormat0);
      minMaxCategoryRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) intervalCategoryToolTipGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setSeriesToolTipGenerator(3137, (CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      statisticalLineAndShapeRenderer0.setSeriesToolTipGenerator(3154, (CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      levelRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      stackedBarRenderer0.setSeriesItemLabelGenerator(3, (CategoryItemLabelGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = boxAndWhiskerRenderer0.getItemLabelGenerator(1803, 66, true);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      // Undeclared exception!
      try { 
        ganttRenderer0.setSeriesURLGenerator((-1), (CategoryURLGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = barRenderer3D0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      CategoryURLGenerator categoryURLGenerator0 = minMaxCategoryRenderer0.getSeriesURLGenerator(0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = stackedAreaRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      stackedBarRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      // Undeclared exception!
      try { 
        lineRenderer3D0.setSeriesToolTipGenerator((-2555), (CategoryToolTipGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      Paint paint0 = lineRenderer3D0.getWallPaint();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(paint0, paint0, combinedRangeCategoryPlot0.DEFAULT_CROSSHAIR_PAINT, combinedRangeCategoryPlot0.DEFAULT_GRIDLINE_PAINT);
      waterfallBarRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = levelRenderer0.getSeriesItemLabelGenerator(0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = scatterRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      barRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      CategoryURLGenerator categoryURLGenerator0 = statisticalLineAndShapeRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      EntityCollection entityCollection0 = categoryStepRenderer_State0.getEntityCollection();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.addEntity(entityCollection0, categoryStepRenderer_State0.line, defaultKeyedValues2DDataset0, 0, 2113, false, 628.526820053681, (-195.43131));
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      int int0 = scatterRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      CategoryAxis categoryAxis0 = new CategoryAxis("XtACHM0=G;ylC");
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      // Undeclared exception!
      try { 
        waterfallBarRenderer0.getItemMiddle(12.0, (Comparable) null, taskSeriesCollection0, categoryAxis0, rectangle2D_Double0, rectangleEdge0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid category index: -1
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      int int0 = stackedBarRenderer3D0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(514.8035006697653, 514.8035006697653);
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator();
      stackedBarRenderer3D0.setLegendItemURLGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = boxAndWhiskerRenderer0.getLegendItemLabelGenerator();
      boxAndWhiskerRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("GmJ", 3.0, 3, 3.0);
      boolean boolean0 = stackedBarRenderer0.removeAnnotation(categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      Number[][] numberArray0 = new Number[7][2];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((String[]) null, numberArray0, numberArray0);
      SlidingCategoryDataset slidingCategoryDataset0 = new SlidingCategoryDataset(defaultIntervalCategoryDataset0, (short)182, 3);
      // Undeclared exception!
      try { 
        scatterRenderer0.getDomainAxis(combinedDomainCategoryPlot0, slidingCategoryDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("", "", 0.0);
      boxAndWhiskerRenderer0.addAnnotation((CategoryAnnotation) categoryTextAnnotation0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setSeriesItemLabelGenerator(1847, (CategoryItemLabelGenerator) null);
  }
}
