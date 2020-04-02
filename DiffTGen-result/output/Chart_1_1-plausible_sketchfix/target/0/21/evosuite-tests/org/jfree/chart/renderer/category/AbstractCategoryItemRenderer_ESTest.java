/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:14:18 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JComponent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.HighLowItemLabelGenerator;
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
import org.jfree.chart.plot.Crosshair;
import org.jfree.chart.plot.DrawingSupplier;
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
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(0.0, true, highLowItemLabelGenerator0);
      Paint paint0 = candlestickRenderer0.getItemFillPaint(42, 42, true);
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(paint0, candlestickRenderer0.DEFAULT_OUTLINE_PAINT, candlestickRenderer0.DEFAULT_VALUE_LABEL_PAINT, candlestickRenderer0.DEFAULT_PAINT);
      waterfallBarRenderer0.setSeriesToolTipGenerator(42, (CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = groupedStackedBarRenderer0.getURLGenerator(3, 0, false);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      String[] stringArray0 = new String[9];
      SymbolAxis symbolAxis0 = new SymbolAxis("i3o+*3f- B", stringArray0);
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultStatisticalCategoryDataset0, categoryAxis3D0, symbolAxis0, boxAndWhiskerRenderer0);
      ValueAxis valueAxis0 = boxAndWhiskerRenderer0.getRangeAxis(categoryPlot0, (-1847));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      double[][] doubleArray0 = new double[7][2];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (-217.08221333577);
      doubleArray0[4] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = areaRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0, false);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      double[][] doubleArray0 = new double[7][2];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 1387.9899765;
      doubleArray0[1] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = areaRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0, false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[5];
      doubleArray0[0] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = defaultCategoryItemRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      boolean boolean0 = waterfallBarRenderer0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = intervalBarRenderer0.createState(plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.setSeriesURLGenerator((-1971), (CategoryURLGenerator) null, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.setSeriesToolTipGenerator((-1), (CategoryToolTipGenerator) null, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.getRangeAxis((CategoryPlot) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      RoundRectangle2D.Double roundRectangle2D_Double0 = new RoundRectangle2D.Double();
      Rectangle2D rectangle2D0 = roundRectangle2D_Double0.getBounds2D();
      // Undeclared exception!
      try { 
        waterfallBarRenderer0.addEntity(standardEntityCollection0, rectangle2D0, (CategoryDataset) null, 544, (-1718), false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DrawingSupplier drawingSupplier0 = statisticalBarRenderer0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", 0.2, (double) ganttRenderer0.ZERO);
      Layer layer0 = Layer.FOREGROUND;
      ganttRenderer0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      statisticalLineAndShapeRenderer0.setSeriesURLGenerator(5, (CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("", numberFormat0);
      ganttRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) standardCategoryToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      statisticalLineAndShapeRenderer0.setSeriesItemLabelGenerator(2620, (CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(0.0, 2104.202295227);
      CategoryToolTipGenerator categoryToolTipGenerator0 = barRenderer3D0.getSeriesToolTipGenerator((-877));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryPlot categoryPlot0 = statisticalBarRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      Rectangle2D rectangle2D0 = chartRenderingInfo0.getChartArea();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        stackedBarRenderer0.addEntity(standardEntityCollection0, rectangle2D0, defaultStatisticalCategoryDataset0, 65535, 65535, false);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 65535, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      LegendItemCollection legendItemCollection0 = statisticalBarRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      ValueAxis valueAxis0 = boxAndWhiskerRenderer0.getRangeAxis(categoryPlot0, 10);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      defaultCategoryItemRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0);
      Object object0 = defaultCategoryItemRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(0.0, true, highLowItemLabelGenerator0);
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      lineRenderer3D0.updateCrosshairValues((CategoryCrosshairState) null, 0, "item", (double) candlestickRenderer0.ZERO, 1, (double) candlestickRenderer0.ZERO, 2, plotOrientation0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Object object0 = statisticalBarRenderer0.clone();
      boolean boolean0 = statisticalBarRenderer0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot((CategoryAxis) null);
      PlotOrientation plotOrientation0 = combinedDomainCategoryPlot0.getOrientation();
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.NO_CHANGE;
      Crosshair crosshair0 = new Crosshair();
      RectangleAnchor rectangleAnchor0 = crosshair0.getLabelAnchor();
      // Undeclared exception!
      try { 
        ganttRenderer0.calculateDomainMarkerTextAnchorPoint((Graphics2D) null, plotOrientation0, (Rectangle2D) null, (Rectangle2D) null, combinedDomainCategoryPlot0.DEFAULT_INSETS, lengthAdjustmentType0, rectangleAnchor0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'base' argument.
         //
         verifyException("org.jfree.chart.util.RectangleInsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Range range0 = scatterRenderer0.findRangeBounds((CategoryDataset) null, false);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      double[][] doubleArray0 = new double[7][2];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = areaRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0, false);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      JFreeChart jFreeChart0 = new JFreeChart("/En[ty5RNV", categoryPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, false);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.initialise((Graphics2D) null, (Rectangle2D) null, categoryPlot0, defaultKeyedValues2DDataset0, plotRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator();
      categoryStepRenderer0.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0, "pIGe`ucqg,i]>|V=-u");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(cyclicNumberAxis0);
      Stroke stroke0 = combinedDomainXYPlot0.getRangeCrosshairStroke();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(stackedAreaRenderer0.ZERO, 0.0, stackedAreaRenderer0.ZERO, 0.0, stackedAreaRenderer0.DEFAULT_VALUE_LABEL_PAINT, stroke0);
      Layer layer0 = Layer.BACKGROUND;
      stackedAreaRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      lineAndShapeRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      stackedBarRenderer0.setSeriesURLGenerator(341, (CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      RoundRectangle2D.Double roundRectangle2D_Double0 = new RoundRectangle2D.Double(0.0, 0.0, 0.0, 2659.466814438, 10000.0, 2659.466814438);
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.addEntity(standardEntityCollection0, roundRectangle2D_Double0, (CategoryDataset) null, 0, 4464, false, 0.0, 10000.0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      lineAndShapeRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      Locale locale0 = JComponent.getDefaultLocale();
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance(locale0);
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator(">AvGlPPqz 3F9bN", numberFormat0);
      groupedStackedBarRenderer0.setSeriesToolTipGenerator(37, (CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = ganttRenderer0.getItemLabelGenerator(0, 0, false);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      // Undeclared exception!
      try { 
        stackedBarRenderer0.setPlot((CategoryPlot) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(3252.90836341657, 3252.90836341657);
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      CategoryAxis categoryAxis0 = new CategoryAxis("0.0");
      NumberAxis numberAxis0 = new NumberAxis();
      CategoryPlot categoryPlot0 = new CategoryPlot(jDBCCategoryDataset0, categoryAxis0, numberAxis0, stackedBarRenderer3D0);
      CategoryAxis categoryAxis1 = stackedBarRenderer3D0.getDomainAxis(categoryPlot0, jDBCCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      statisticalLineAndShapeRenderer0.setSeriesURLGenerator(19, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = minMaxCategoryRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      CategoryURLGenerator categoryURLGenerator0 = lineAndShapeRenderer0.getSeriesURLGenerator((-1688));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = ganttRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      // Undeclared exception!
      try { 
        ganttRenderer0.setSeriesToolTipGenerator((-791), (CategoryToolTipGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator("g}M;", numberFormat0);
      statisticalLineAndShapeRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) intervalCategoryToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = lineAndShapeRenderer0.getSeriesItemLabelGenerator(0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = intervalBarRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      CategoryURLGenerator categoryURLGenerator0 = stackedAreaRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = levelRenderer0.getToolTipGenerator(4657, 1522, false);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      DateAxis dateAxis0 = new DateAxis("Null 'type' argument.");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(dateAxis0);
      Line2D.Double line2D_Double0 = new Line2D.Double(10, 0.0, 1.0E-8, 0.0F);
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      // Undeclared exception!
      try { 
        levelRenderer0.drawOutline((Graphics2D) null, combinedRangeCategoryPlot0, rectangle2D0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.Plot", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      int int0 = intervalBarRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("k*96d");
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0, 0.2, 0.0, (double) statisticalBarRenderer0.ZERO);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.getItemMiddle(minMaxCategoryRenderer0.ZERO, minMaxCategoryRenderer0.ZERO, defaultStatisticalCategoryDataset0, subCategoryAxis0, rectangle2D_Double0, (RectangleEdge) null);
      } catch(IllegalArgumentException e) {
         //
         // Invalid category index: -1
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      int int0 = minMaxCategoryRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = minMaxCategoryRenderer0.getLegendItemLabelGenerator();
      minMaxCategoryRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("\"", "\"", 1440.43658066, 0);
      boolean boolean0 = scatterRenderer0.removeAnnotation(categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(1018.0, 1018.0);
      Range range0 = barRenderer3D0.findRangeBounds((CategoryDataset) null);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.getDomainAxis((CategoryPlot) null, (CategoryDataset) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("Null 'hotspot' argument.", "Null 'hotspot' argument.", (double) defaultCategoryItemRenderer0.ZERO, 0.0);
      defaultCategoryItemRenderer0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = ganttRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Locale locale0 = new Locale("Index 'series' out of range.", "Index 'series' out of range.", "Index 'series' out of range.");
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("Index 'series' out of range.", numberFormat0, numberFormat0);
      statisticalLineAndShapeRenderer0.setSeriesItemLabelGenerator(263, (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0);
  }
}