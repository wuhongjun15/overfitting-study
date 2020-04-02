/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:03:12 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.labels.IntervalCategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
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
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.pie.PieDataset;
import org.jfree.data.time.Week;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      lineAndShapeRenderer0.setPlot(combinedDomainCategoryPlot0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      scatterRenderer0.setSeriesItemLabelGenerator(1, (CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      CategoryURLGenerator categoryURLGenerator0 = minMaxCategoryRenderer0.getURLGenerator((-1222), 0, true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = layeredBarRenderer0.getToolTipGenerator(1757, 0, true);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, true);
      CategoryURLGenerator categoryURLGenerator0 = lineAndShapeRenderer0.getSeriesURLGenerator(0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = scatterRenderer0.getSeriesItemLabelGenerator((-187));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      CategoryPlot categoryPlot0 = barRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      int int0 = groupedStackedBarRenderer0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      LegendItem legendItem0 = ganttRenderer0.getLegendItem(3150, (-3658));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      // Undeclared exception!
      try { 
        categoryStepRenderer0.setSeriesURLGenerator((-1107), (CategoryURLGenerator) null);
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
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator();
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.setSeriesToolTipGenerator((-3026), (CategoryToolTipGenerator) intervalCategoryToolTipGenerator0, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.setSeriesItemLabelGenerator((-373), (CategoryItemLabelGenerator) null, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(12.0, 4.0, 12.0, (-765.399958324), lineRenderer3D0.DEFAULT_PAINT, lineRenderer3D0.DEFAULT_OUTLINE_STROKE);
      // Undeclared exception!
      try { 
        lineRenderer3D0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, (Layer) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
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
  public void test14()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      Range range0 = lineRenderer3D0.findRangeBounds((CategoryDataset) taskSeriesCollection0, true);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("S!ND%m3v~gKfqa", stackedBarRenderer0.ZERO, (-370.7), 5.0E9);
      Layer layer0 = Layer.FOREGROUND;
      stackedBarRenderer0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      stackedBarRenderer3D0.setBaseURLGenerator((CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      layeredBarRenderer0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = lineAndShapeRenderer0.getSeriesToolTipGenerator(62);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      double[][] doubleArray0 = new double[7][5];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        layeredBarRenderer0.addEntity(standardEntityCollection0, categoryStepRenderer_State0.line, defaultIntervalCategoryDataset0, 82, 82, true, 0.0, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // The 'row' argument is out of bounds.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      LegendItemCollection legendItemCollection0 = categoryStepRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CategoryPlot categoryPlot0 = new CategoryPlot();
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-1760.542277), 0.0, true);
      ValueAxis valueAxis0 = stackedBarRenderer3D0.getRangeAxis(categoryPlot0, 10);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      Object object0 = ganttRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(true, true);
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.updateCrosshairValues(categoryCrosshairState0, 10.0, 3.0, 0, 0, (-1910.99577648712), (-2338.24779), plotOrientation0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(ganttRenderer0.DEFAULT_PAINT, ganttRenderer0.DEFAULT_PAINT, ganttRenderer0.DEFAULT_VALUE_LABEL_PAINT, ganttRenderer0.DEFAULT_VALUE_LABEL_PAINT);
      Stroke stroke0 = waterfallBarRenderer0.lookupSeriesStroke(3150);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      float[][] floatArray0 = new float[8][3];
      NumberAxis numberAxis0 = new NumberAxis();
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot(floatArray0, numberAxis0, numberAxis0);
      PlotOrientation plotOrientation0 = fastScatterPlot0.getOrientation();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      Point2D point2D0 = boxAndWhiskerRenderer0.calculateDomainMarkerTextAnchorPoint((Graphics2D) null, plotOrientation0, defaultCaret0, defaultCaret0, fastScatterPlot0.DEFAULT_INSETS, (LengthAdjustmentType) null, (RectangleAnchor) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Paint paint0 = statisticalBarRenderer0.getErrorIndicatorPaint();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 967, 0.2, 300.3266427567265, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      CategoryPlot categoryPlot0 = statisticalBarRenderer0.getPlot();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      PiePlot piePlot0 = new PiePlot((PieDataset) null);
      CategoryMarker categoryMarker0 = new CategoryMarker("SAVE", paint0, piePlot0.DEFAULT_OUTLINE_STROKE, cyclicNumberAxis0.DEFAULT_AXIS_LINE_PAINT, categoryPlot0.DEFAULT_OUTLINE_STROKE, 1.0F);
      Rectangle rectangle0 = chartPanel0.getBounds();
      statisticalBarRenderer0.drawRangeMarker(graphics2D0, (CategoryPlot) null, cyclicNumberAxis0, categoryMarker0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      CategoryAxis categoryAxis0 = new CategoryAxis((String) null);
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("A^XHr=UyNBUFv+hu");
      CategoryPlot categoryPlot0 = new CategoryPlot((CategoryDataset) null, categoryAxis0, numberAxis3D0, statisticalLineAndShapeRenderer0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = ganttRenderer0.createState(plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemLabelGenerator();
      ganttRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation("({0}, {1}) = {3} - {4}", (double) scatterRenderer0.ZERO, "{2}", 1832.197, scatterRenderer0.DEFAULT_PAINT, scatterRenderer0.DEFAULT_STROKE);
      Layer layer0 = Layer.BACKGROUND;
      scatterRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Layer layer0 = Layer.FOREGROUND;
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.addAnnotation((CategoryAnnotation) null, layer0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'annotation' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator("VHbQ6DV*59QhAYqXb", "VHbQ6DV*59QhAYqXb", "Null 'generator' argument.");
      minMaxCategoryRenderer0.setBaseURLGenerator((CategoryURLGenerator) standardCategoryURLGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setSeriesURLGenerator(3540, (CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      minMaxCategoryRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setSeriesToolTipGenerator(71, (CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D((-964.6493426579063), (-2137.0857169022));
      barRenderer3D0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      stackedBarRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setSeriesItemLabelGenerator(5, (CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = categoryStepRenderer0.getItemLabelGenerator(0, (-1398), true);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      // Undeclared exception!
      try { 
        barRenderer0.setPlot((CategoryPlot) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(lineRenderer3D0.DEFAULT_VALUE_LABEL_PAINT, lineRenderer3D0.DEFAULT_OUTLINE_PAINT, lineRenderer3D0.DEFAULT_VALUE_LABEL_PAINT, lineRenderer3D0.DEFAULT_PAINT);
      waterfallBarRenderer0.setSeriesURLGenerator(3540, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedBarRenderer3D0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalLineAndShapeRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      int int0 = stackedAreaRenderer0.getRowCount();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(minMaxCategoryRenderer0.DEFAULT_PAINT, minMaxCategoryRenderer0.DEFAULT_OUTLINE_PAINT, minMaxCategoryRenderer0.DEFAULT_PAINT, minMaxCategoryRenderer0.DEFAULT_PAINT);
      // Undeclared exception!
      try { 
        waterfallBarRenderer0.setSeriesToolTipGenerator((-1416), (CategoryToolTipGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      lineAndShapeRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = barRenderer3D0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      stackedBarRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      categoryStepRenderer0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      int int0 = lineRenderer3D0.hashCode();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Week week0 = new Week((-1238), 0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("v MBm");
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0F, (-1238), 53, 1.0E-8);
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      PiePlot3D piePlot3D0 = new PiePlot3D(defaultKeyedValuesDataset0);
      JFreeChart jFreeChart0 = new JFreeChart(piePlot3D0);
      LegendTitle legendTitle0 = jFreeChart0.getLegend(0);
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.getItemMiddle(week0, week0, (CategoryDataset) null, subCategoryAxis0, rectangle2D_Double0, legendTitle0.DEFAULT_POSITION);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      int int0 = minMaxCategoryRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator();
      scatterRenderer0.setLegendItemURLGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedBarRenderer0.getLegendItemLabelGenerator();
      stackedBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation(")=e&3{pJL;Z`e", ")=e&3{pJL;Z`e", (double) scatterRenderer0.ZERO, (-652.8966291154073));
      boolean boolean0 = scatterRenderer0.removeAnnotation(categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Range range0 = categoryStepRenderer0.findRangeBounds(defaultCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      // Undeclared exception!
      try { 
        defaultCategoryItemRenderer0.getDomainAxis(combinedDomainCategoryPlot0, defaultKeyedValues2DDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(true, false);
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(lineAndShapeRenderer0.ZERO, (double) lineAndShapeRenderer0.ZERO, lineAndShapeRenderer0.ZERO, (double) lineAndShapeRenderer0.ZERO, lineAndShapeRenderer0.DEFAULT_OUTLINE_PAINT, lineAndShapeRenderer0.DEFAULT_STROKE);
      lineAndShapeRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = defaultCategoryItemRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.setSeriesItemLabelGenerator((-959), (CategoryItemLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }
}