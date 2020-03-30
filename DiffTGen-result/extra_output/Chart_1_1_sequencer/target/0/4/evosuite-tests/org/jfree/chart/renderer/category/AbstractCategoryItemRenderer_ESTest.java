/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:11:41 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.labels.IntervalCategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
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
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.GanttCategoryDataset;
import org.jfree.data.gantt.SlidingGanttCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setSeriesURLGenerator(1, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      LegendItem legendItem0 = boxAndWhiskerRenderer0.getLegendItem(0, 0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryURLGenerator categoryURLGenerator0 = scatterRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Range range0 = lineAndShapeRenderer0.findRangeBounds(defaultStatisticalCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      double[][] doubleArray0 = new double[2][3];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) 5;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray0[0];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = categoryStepRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      double[][] doubleArray0 = new double[2][3];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) 5;
      doubleArray0[0] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = categoryStepRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator();
      boolean boolean0 = groupedStackedBarRenderer0.equals(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(1520.5, 1520.5);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = barRenderer3D0.createState(plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      // Undeclared exception!
      try { 
        barRenderer3D0.getRangeAxis((CategoryPlot) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset(taskSeriesCollection0, 0, 0);
      Range range0 = stackedAreaRenderer0.findRangeBounds((CategoryDataset) slidingGanttCategoryDataset0, false);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("", scatterRenderer0.ZERO, 1245.597332);
      Layer layer0 = Layer.FOREGROUND;
      minMaxCategoryRenderer0.addAnnotation((CategoryAnnotation) categoryTextAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryURLGenerator categoryURLGenerator0 = lineRenderer3D0.getURLGenerator(2397, 1331, true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator();
      levelRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) intervalCategoryToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      CategoryToolTipGenerator categoryToolTipGenerator0 = categoryStepRenderer0.getToolTipGenerator(0, (-1368), false);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(numberAxis0);
      lineRenderer3D0.setPlot(combinedRangeCategoryPlot0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CategoryPlot categoryPlot0 = stackedAreaRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset((GanttCategoryDataset) null, 0, 0);
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.addEntity(standardEntityCollection0, (Shape) null, slidingGanttCategoryDataset0, 0, 0, true, 1305.3092812971, (-1514.1835));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      LegendItemCollection legendItemCollection0 = lineRenderer3D0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      ValueAxis valueAxis0 = levelRenderer0.getRangeAxis(combinedRangeCategoryPlot0, 10);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      Object object0 = stackedBarRenderer3D0.clone();
      boolean boolean0 = stackedBarRenderer3D0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      PeriodAxis periodAxis0 = new PeriodAxis("I-zI$h^+jH");
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultStatisticalCategoryDataset0, (CategoryAxis) null, periodAxis0, intervalBarRenderer0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.initialise((Graphics2D) null, rectangle0, categoryPlot0, defaultStatisticalCategoryDataset0, plotRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      // Undeclared exception!
      try { 
        ganttRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator();
      scatterRenderer0.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      waterfallBarRenderer0.setSeriesURLGenerator(2397, (CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setSeriesURLGenerator(6, (CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      DecimalFormat decimalFormat0 = new DecimalFormat();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator("", decimalFormat0);
      lineRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) intervalCategoryToolTipGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setSeriesToolTipGenerator(214, (CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      DecimalFormat decimalFormat0 = new DecimalFormat();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("d=#=M{HAO;}PL4", decimalFormat0);
      intervalBarRenderer0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) standardCategoryToolTipGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.addEntity(standardEntityCollection0, layeredBarRenderer0.DEFAULT_SHAPE, jDBCCategoryDataset0, (-3338), 0, true, (double) layeredBarRenderer0.ZERO, (-3338));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator();
      barRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      DecimalFormat decimalFormat0 = new DecimalFormat("edZ%*I/oV7j&M", decimalFormatSymbols0);
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("edZ%*I/oV7j&M", decimalFormat0);
      levelRenderer0.setSeriesItemLabelGenerator(2134, (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 0.0);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = stackedBarRenderer3D0.getItemLabelGenerator(366, 366, false);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1, 10, 2061.003264947967, (double) 1.0F, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Size2D size2D0 = new Size2D(1.0F, 10);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 2.0, 1, rectangleAnchor0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        categoryStepRenderer0.initialise(graphics2D0, rectangle2D0, (CategoryPlot) null, taskSeriesCollection0, plotRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.setSeriesURLGenerator((-497), (CategoryURLGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = ganttRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = groupedStackedBarRenderer0.getSeriesURLGenerator(0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = scatterRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 0.0);
      stackedBarRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, true);
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemLabelGenerator();
      lineAndShapeRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, true);
      MeterPlot meterPlot0 = new MeterPlot();
      NumberFormat numberFormat0 = meterPlot0.getTickLabelFormat();
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator("org.jfree.chart.urls.TimeSeriesURLGenerator", numberFormat0);
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.setSeriesToolTipGenerator((-755), (CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, true);
      statisticalLineAndShapeRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = barRenderer0.getSeriesItemLabelGenerator(967);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = lineRenderer3D0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getSeriesToolTipGenerator(3);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      int int0 = lineAndShapeRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      Shape shape0 = barRenderer3D0.lookupSeriesShape(34);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      int int0 = barRenderer3D0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-3227.3074353223983), (-3227.3074353223983), true);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedBarRenderer3D0.getLegendItemLabelGenerator();
      stackedBarRenderer3D0.setLegendItemURLGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, true);
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("UoJcDSBeA}P", stackedBarRenderer0.ZERO, 12.0, (double) stackedBarRenderer0.ZERO);
      boolean boolean0 = lineAndShapeRenderer0.removeAnnotation(categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      double[][] doubleArray0 = new double[2][3];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = categoryStepRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 0.0F, 0.0F, 0.0F);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      LevelRenderer levelRenderer0 = new LevelRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        levelRenderer0.initialise((Graphics2D) null, rectangle2D_Float0, combinedDomainCategoryPlot0, defaultCategoryDataset0, plotRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(categoryStepRenderer0.ZERO, 0.0, barRenderer3D0.ZERO, 1.0E9, categoryStepRenderer0.DEFAULT_OUTLINE_PAINT, boxAndWhiskerRenderer0.DEFAULT_STROKE);
      barRenderer3D0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, true);
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalLineAndShapeRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.setSeriesItemLabelGenerator((-446), (CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }
}