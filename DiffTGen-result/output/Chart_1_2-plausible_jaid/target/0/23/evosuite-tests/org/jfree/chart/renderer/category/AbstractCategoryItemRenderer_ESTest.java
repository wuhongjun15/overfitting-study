/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:07:29 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.sql.Connection;
import java.util.Date;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.axis.SubCategoryAxis;
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
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
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
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.CustomCategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.gantt.SlidingGanttCategoryDataset;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.jdbc.JDBCPieDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Millisecond;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      stackedAreaRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      boxAndWhiskerRenderer0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      LegendItem legendItem0 = areaRenderer0.getLegendItem(1818, 3099);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("*X]");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      CategoryAxis categoryAxis0 = levelRenderer0.getDomainAxis(combinedDomainCategoryPlot0, (CategoryDataset) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Color color0 = (Color)SpiderWebPlot.DEFAULT_LABEL_SHADOW_PAINT;
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(color0, color0, color0, color0);
      CategoryURLGenerator categoryURLGenerator0 = waterfallBarRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = levelRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      boolean boolean0 = boxAndWhiskerRenderer0.equals(jDBCCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator();
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.setSeriesURLGenerator((-1918), (CategoryURLGenerator) standardCategoryURLGenerator0, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      CustomCategoryURLGenerator customCategoryURLGenerator0 = new CustomCategoryURLGenerator();
      // Undeclared exception!
      try { 
        areaRenderer0.setSeriesURLGenerator((-579), (CategoryURLGenerator) customCategoryURLGenerator0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(9223372036854775807L);
      CategoryAxis categoryAxis0 = new CategoryAxis("Fp$Sn");
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.1F, (-3993.4124F), 0.3F, 0.3F);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot((ValueAxis) null);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getDomainAxisEdge((-1282));
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.getItemMiddle(fixedMillisecond0, fixedMillisecond0, (CategoryDataset) null, categoryAxis0, rectangle2D_Float0, rectangleEdge0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      // Undeclared exception!
      try { 
        levelRenderer0.getDomainAxis(categoryPlot0, jDBCCategoryDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setSeriesURLGenerator(3, (CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator();
      ganttRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) intervalCategoryToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      boxAndWhiskerRenderer0.setSeriesItemLabelGenerator(1, (CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = boxAndWhiskerRenderer0.getItemLabelGenerator(3608, 1, true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Range length must be positive.");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(numberAxis3D0);
      ganttRenderer0.setPlot(combinedRangeCategoryPlot0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      ModuloAxis moduloAxis0 = new ModuloAxis("Unknown layer.", (Range) null);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset(taskSeriesCollection0, 0, 10);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = minMaxCategoryRenderer0.createState(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        lineRenderer3D0.hitTest(0.4, (double) minMaxCategoryRenderer0.ZERO, (Graphics2D) null, (Rectangle2D) null, categoryPlot0, (CategoryAxis) null, moduloAxis0, slidingGanttCategoryDataset0, 0, (-885), true, categoryItemRendererState0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      // Undeclared exception!
      try { 
        scatterRenderer0.addEntity(standardEntityCollection0, (Shape) null, (CategoryDataset) null, 2652, 2652, true, 2652, (-587.452805));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      LegendItemCollection legendItemCollection0 = categoryStepRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(3482.425797993, (-20.6));
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      ValueAxis valueAxis0 = stackedBarRenderer3D0.getRangeAxis(combinedDomainCategoryPlot0, 0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      SimpleTimeZone simpleTimeZone0 = (SimpleTimeZone)SegmentedTimeline.NO_DST_TIME_ZONE;
      Millisecond millisecond0 = new Millisecond(date0, simpleTimeZone0);
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      // Undeclared exception!
      try { 
        stackedBarRenderer0.updateCrosshairValues(categoryCrosshairState0, millisecond0, millisecond0, 7.2E7, 0, 0, 0.0, plotOrientation0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      DrawingSupplier drawingSupplier0 = lineAndShapeRenderer0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      Object object0 = levelRenderer0.clone();
      boolean boolean0 = levelRenderer0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      TaskSeries taskSeries0 = new TaskSeries("pfEO\"|T8Ul\"A;am");
      taskSeriesCollection0.add(taskSeries0);
      Range range0 = barRenderer3D0.findRangeBounds(taskSeriesCollection0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("*X]");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      JFreeChart jFreeChart0 = new JFreeChart("*X]", subCategoryAxis0.DEFAULT_TICK_LABEL_FONT, thermometerPlot0, true);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false);
      Rectangle rectangle0 = chartPanel0.getVisibleRect();
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = levelRenderer0.initialise((Graphics2D) null, rectangle0, combinedDomainCategoryPlot0, (CategoryDataset) null, plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator("");
      intervalBarRenderer0.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(true, true);
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("Null 'paint' argument.", 12.0, (-1580.11), (-67.945660136));
      Layer layer0 = Layer.BACKGROUND;
      lineAndShapeRenderer0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator("");
      lineRenderer3D0.setSeriesURLGenerator(3434, (CategoryURLGenerator) standardCategoryURLGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryURLGenerator categoryURLGenerator0 = scatterRenderer0.getURLGenerator(0, 288, true);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      scatterRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      intervalBarRenderer0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(3482.425797993, (-20.6));
      CategoryToolTipGenerator categoryToolTipGenerator0 = stackedBarRenderer3D0.getToolTipGenerator(0, 0, false);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      levelRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      statisticalLineAndShapeRenderer0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      CategoryAxis categoryAxis0 = new CategoryAxis((String) null);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      PlotOrientation plotOrientation0 = combinedDomainCategoryPlot0.getOrientation();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      groupedStackedBarRenderer0.drawItemLabel((Graphics2D) null, plotOrientation0, defaultBoxAndWhiskerCategoryDataset0, 10, (-1), false, (double) lineAndShapeRenderer0.ZERO, 0.0, false);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      CategoryAxis categoryAxis0 = new CategoryAxis((String) null);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(370.0887004436, 3.0, (-81.177208), (double) lineAndShapeRenderer0.ZERO);
      ChartPanel chartPanel0 = new ChartPanel((JFreeChart) null, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.initialise((Graphics2D) null, rectangle2D_Double0, combinedDomainCategoryPlot0, taskSeriesCollection0, plotRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalLineAndShapeRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryURLGenerator categoryURLGenerator0 = ganttRenderer0.getSeriesURLGenerator(1301);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      barRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setLegendItemToolTipGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(277.90129464391, 277.90129464391, false);
      int int0 = stackedBarRenderer3D0.getRowCount();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Color color0 = (Color)TextTitle.DEFAULT_TEXT_PAINT;
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(color0, color0, color0, color0);
      // Undeclared exception!
      try { 
        waterfallBarRenderer0.setSeriesToolTipGenerator((-4416), (CategoryToolTipGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator();
      scatterRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) intervalCategoryToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = levelRenderer0.getSeriesItemLabelGenerator(400);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = levelRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      waterfallBarRenderer0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getSeriesToolTipGenerator((-1));
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      int int0 = categoryStepRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryPlot categoryPlot0 = ganttRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCPieDataset jDBCPieDataset0 = new JDBCPieDataset(connection0);
      RingPlot ringPlot0 = new RingPlot(jDBCPieDataset0);
      Paint paint0 = ringPlot0.getLabelOutlinePaint();
      AxisLocation axisLocation0 = AxisLocation.BOTTOM_OR_RIGHT;
      ChartPanel chartPanel0 = new ChartPanel((JFreeChart) null);
      PlotOrientation plotOrientation0 = chartPanel0.getOrientation();
      RectangleEdge rectangleEdge0 = Plot.resolveRangeAxisLocation(axisLocation0, plotOrientation0);
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(paint0, ringPlot0.DEFAULT_LABEL_BACKGROUND_PAINT, ringPlot0.DEFAULT_OUTLINE_PAINT, ringPlot0.DEFAULT_LABEL_OUTLINE_PAINT);
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      // Undeclared exception!
      try { 
        waterfallBarRenderer0.getItemMiddle(300, "ZOOM_RESET_DOMAIN", defaultMultiValueCategoryDataset0, categoryAxis3D0, (Rectangle2D) null, rectangleEdge0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid category index: -1
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      int int0 = intervalBarRenderer0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      int int0 = intervalBarRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      levelRenderer0.setLegendItemURLGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedBarRenderer3D0.getLegendItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", ganttRenderer0.ZERO, (double) ganttRenderer0.ZERO, (double) ganttRenderer0.ZERO);
      boolean boolean0 = ganttRenderer0.removeAnnotation(categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset(taskSeriesCollection0, 3, 0);
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.getDomainAxis((CategoryPlot) null, slidingGanttCategoryDataset0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("RSn%)/&gagnk9", 1.0F, (-1915.5), (-2919.9571));
      scatterRenderer0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Color color0 = (Color)TextTitle.DEFAULT_TEXT_PAINT;
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(color0, color0, color0, color0);
      CategoryToolTipGenerator categoryToolTipGenerator0 = waterfallBarRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) null);
  }
}
