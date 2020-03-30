/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 06:48:24 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ByteLookupTable;
import java.awt.image.LookupOp;
import java.sql.Connection;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.BufferedImageRenderingSource;
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
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxisLabelInfo;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
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
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PiePlot3D;
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
import org.jfree.chart.renderer.category.LayeredBarRenderer;
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
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.CustomCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator();
      boxAndWhiskerRenderer0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("NOID", 0.2, 0.0, (-1447.753789001376));
      boolean boolean0 = barRenderer3D0.removeAnnotation(categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategoryURLGenerator categoryURLGenerator0 = defaultCategoryItemRenderer0.getURLGenerator(0, (-562), false);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = defaultCategoryItemRenderer0.getSeriesToolTipGenerator(0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      String[] stringArray0 = new String[7];
      SymbolAxis symbolAxis0 = new SymbolAxis("^aQ7|` ;B)C0$II.", stringArray0);
      CategoryPlot categoryPlot0 = new CategoryPlot(jDBCCategoryDataset0, (CategoryAxis) null, symbolAxis0, lineAndShapeRenderer0);
      CategoryAxis categoryAxis0 = lineAndShapeRenderer0.getDomainAxis(categoryPlot0, jDBCCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(true, true);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = lineAndShapeRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      boolean boolean0 = groupedStackedBarRenderer0.equals(boxAndWhiskerToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.setSeriesURLGenerator((-447), (CategoryURLGenerator) null, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      // Undeclared exception!
      try { 
        scatterRenderer0.setSeriesToolTipGenerator((-40), (CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      // Undeclared exception!
      try { 
        layeredBarRenderer0.setSeriesItemLabelGenerator((-2223), (CategoryItemLabelGenerator) null, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      PiePlot3D piePlot3D0 = new PiePlot3D();
      JFreeChart jFreeChart0 = new JFreeChart(piePlot3D0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 10, 6, 0, 0, 1, 6, true, true, true, true, true, true);
      DefaultCaret defaultCaret0 = new DefaultCaret();
      String[] stringArray0 = new String[0];
      SymbolAxis symbolAxis0 = new SymbolAxis("ZOOM_RANGE_BOTH", stringArray0);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(symbolAxis0);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        ganttRenderer0.initialise((Graphics2D) null, defaultCaret0, combinedRangeCategoryPlot0, taskSeriesCollection0, plotRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot((CategoryDataset) null);
      JFreeChart jFreeChart0 = new JFreeChart("?)%e|v}VNemyuDc43", multiplePiePlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(70, 70, (double) 70, (double) 10, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("({0}, {1}) = {2}");
      CategoryMarker categoryMarker0 = new CategoryMarker(1.0F);
      byte[] byteArray0 = new byte[5];
      ByteLookupTable byteLookupTable0 = new ByteLookupTable(0, byteArray0);
      LookupOp lookupOp0 = new LookupOp(byteLookupTable0, ((SunGraphics2D) graphics2D0).hints);
      Rectangle2D rectangle2D0 = lookupOp0.getBounds2D(bufferedImage0);
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.drawDomainMarker(graphics2D0, (CategoryPlot) null, subCategoryAxis0, categoryMarker0, rectangle2D0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        scatterRenderer0.addEntity(standardEntityCollection0, levelRenderer0.DEFAULT_SHAPE, defaultStatisticalCategoryDataset0, 151, 151, true, (double) levelRenderer0.ZERO, 0.0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 151, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      Range range0 = lineAndShapeRenderer0.findRangeBounds((CategoryDataset) taskSeriesCollection0, true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(scatterRenderer0.ZERO, 50000.0, scatterRenderer0.ZERO, 50000.0, scatterRenderer0.DEFAULT_VALUE_LABEL_PAINT, scatterRenderer0.DEFAULT_STROKE);
      Layer layer0 = Layer.FOREGROUND;
      scatterRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CustomCategoryURLGenerator customCategoryURLGenerator0 = new CustomCategoryURLGenerator();
      ganttRenderer0.setBaseURLGenerator((CategoryURLGenerator) customCategoryURLGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      waterfallBarRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      statisticalLineAndShapeRenderer0.setPlot(categoryPlot0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      CategoryPlot categoryPlot0 = areaRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      Range range0 = boxAndWhiskerRenderer0.findRangeBounds(taskSeriesCollection0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      float[][] floatArray0 = new float[7][1];
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-4.0F), "");
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot(floatArray0, cyclicNumberAxis0, cyclicNumberAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.renderer.xy.GradientXYBarPainter", fastScatterPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 500);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      GeneralPath generalPath0 = new GeneralPath(fastScatterPlot0.DEFAULT_LEGEND_ITEM_BOX);
      Rectangle rectangle0 = generalPath0.getBounds();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = scatterRenderer0.createState(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        scatterRenderer0.createHotSpotBounds(graphics2D0, rectangle0, combinedRangeCategoryPlot0, categoryAxis3D0, cyclicNumberAxis0, defaultBoxAndWhiskerCategoryDataset0, 15, 8, true, categoryItemRendererState0, rectangle0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 8, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      String[] stringArray0 = new String[3];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, (Number[][]) null, (Number[][]) null);
      // Undeclared exception!
      try { 
        barRenderer3D0.addEntity(standardEntityCollection0, (Shape) null, defaultIntervalCategoryDataset0, 0, 0, false, 0.0, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.addEntity((EntityCollection) null, waterfallBarRenderer0.DEFAULT_SHAPE, defaultKeyedValues2DDataset0, 3, (-2388), true);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Color color0 = (Color)PeriodAxisLabelInfo.DEFAULT_LABEL_PAINT;
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(color0, color0, color0, color0);
      LegendItemCollection legendItemCollection0 = waterfallBarRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      LogAxis logAxis0 = new LogAxis();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(logAxis0);
      ValueAxis valueAxis0 = minMaxCategoryRenderer0.getRangeAxis(combinedRangeCategoryPlot0, 10);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(0.0, 0.0);
      Object object0 = barRenderer3D0.clone();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      PlotOrientation plotOrientation0 = combinedDomainCategoryPlot0.getOrientation();
      waterfallBarRenderer0.updateCrosshairValues((CategoryCrosshairState) null, 0.2, 0, 0.0025, 3, 1.0E-5, 0.0, plotOrientation0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      DrawingSupplier drawingSupplier0 = groupedStackedBarRenderer0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      boolean boolean0 = intervalBarRenderer0.equals(ganttRenderer0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds((CategoryDataset) null);
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
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", (double) scatterRenderer0.ZERO, (double) scatterRenderer0.ZERO);
      Layer layer0 = Layer.BACKGROUND;
      scatterRenderer0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      Layer layer0 = Layer.BACKGROUND;
      // Undeclared exception!
      try { 
        intervalBarRenderer0.addAnnotation((CategoryAnnotation) null, layer0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'annotation' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setSeriesToolTipGenerator(2, (CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryToolTipGenerator categoryToolTipGenerator0 = lineRenderer3D0.getToolTipGenerator(0, 4766, false);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator("", numberFormat0);
      statisticalLineAndShapeRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      ChoiceFormat choiceFormat0 = new ChoiceFormat("TextAnchor.BOTTOM_RIGHT");
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("TextAnchor.BOTTOM_RIGHT", choiceFormat0, choiceFormat0);
      stackedAreaRenderer0.setSeriesItemLabelGenerator(664, (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = stackedBarRenderer3D0.getItemLabelGenerator((-1555), 0, true);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      // Undeclared exception!
      try { 
        ganttRenderer0.setPlot((CategoryPlot) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      // Undeclared exception!
      try { 
        lineRenderer3D0.setSeriesURLGenerator((-692), (CategoryURLGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, true);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = lineAndShapeRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CategoryURLGenerator categoryURLGenerator0 = stackedAreaRenderer0.getSeriesURLGenerator((-1));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator("Base tool tip generator not cloneable.");
      scatterRenderer0.setLegendItemToolTipGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      int int0 = boxAndWhiskerRenderer0.getRowCount();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator();
      // Undeclared exception!
      try { 
        scatterRenderer0.setSeriesToolTipGenerator((-948), (CategoryToolTipGenerator) intervalCategoryToolTipGenerator0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      DecimalFormat decimalFormat0 = new DecimalFormat();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("M", decimalFormat0);
      statisticalLineAndShapeRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) standardCategoryToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = boxAndWhiskerRenderer0.getSeriesItemLabelGenerator(3231);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalLineAndShapeRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-1133.0), (-1133.0), false);
      stackedBarRenderer3D0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      stackedAreaRenderer0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategoryURLGenerator categoryURLGenerator0 = defaultCategoryItemRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      int int0 = categoryStepRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 2.0);
      int int0 = stackedBarRenderer3D0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      int int0 = ganttRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      statisticalLineAndShapeRenderer0.setLegendItemURLGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = categoryStepRenderer0.getLegendItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Number[][] numberArray0 = new Number[7][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((String[]) null, numberArray0, numberArray0);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("");
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultIntervalCategoryDataset0, categoryAxis0, numberAxis3D0, boxAndWhiskerRenderer0);
      JFreeChart jFreeChart0 = new JFreeChart(categoryPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 73, 457.59453300773, (double) 0.0F, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.initialise(graphics2D0, (Rectangle2D) null, categoryPlot0, defaultIntervalCategoryDataset0, plotRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("Joao Guilherme Del Valle");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        waterfallBarRenderer0.getDomainAxis(combinedDomainCategoryPlot0, defaultStatisticalCategoryDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(levelRenderer0.ZERO, 0.0, 0.2, 0.0, levelRenderer0.DEFAULT_PAINT, levelRenderer0.DEFAULT_OUTLINE_STROKE);
      levelRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = boxAndWhiskerRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-538.094982), 2.0);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.setSeriesItemLabelGenerator((-1744), (CategoryItemLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }
}