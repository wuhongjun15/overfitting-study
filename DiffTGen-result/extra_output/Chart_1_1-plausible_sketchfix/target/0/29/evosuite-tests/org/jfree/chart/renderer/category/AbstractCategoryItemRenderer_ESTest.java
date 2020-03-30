/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:17:50 GMT 2020
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
import java.awt.SystemColor;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.text.NumberFormat;
import javax.swing.JScrollPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
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
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
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
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.renderer.xy.StackedXYAreaRenderer2;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.SlidingGanttCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.time.Second;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      stackedBarRenderer0.setSeriesURLGenerator(71, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      statisticalLineAndShapeRenderer0.setSeriesToolTipGenerator(10, (CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getURLGenerator(10, (-285), false);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      CategoryURLGenerator categoryURLGenerator0 = stackedAreaRenderer0.getSeriesURLGenerator(334);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalLineAndShapeRenderer0.getSeriesToolTipGenerator(3);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(3.141592653589793, 5000.0);
      boolean boolean0 = stackedBarRenderer3D0.equals("");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = lineRenderer3D0.createState(plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      Object object0 = stackedAreaRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      // Undeclared exception!
      try { 
        lineRenderer3D0.setSeriesItemLabelGenerator((-591), (CategoryItemLabelGenerator) null, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.getDomainAxis((CategoryPlot) null, defaultCategoryDataset0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      // Undeclared exception!
      try { 
        levelRenderer0.getDomainAxis(combinedRangeCategoryPlot0, defaultMultiValueCategoryDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      Second second0 = new Second();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(second0, (double) intervalBarRenderer0.ZERO, 0.2, 3993.14815, defaultCategoryItemRenderer0.DEFAULT_VALUE_LABEL_PAINT, intervalBarRenderer0.DEFAULT_OUTLINE_STROKE);
      // Undeclared exception!
      try { 
        defaultCategoryItemRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, (Layer) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      Object object0 = ganttRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.activeCaptionText;
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(systemColor0, systemColor0, systemColor0, systemColor0);
      DrawingSupplier drawingSupplier0 = waterfallBarRenderer0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Range range0 = scatterRenderer0.findRangeBounds((CategoryDataset) null, false);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      Range range0 = lineAndShapeRenderer0.findRangeBounds((CategoryDataset) defaultKeyedValues2DDataset0, true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, false);
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(3.0, 2.0, statisticalLineAndShapeRenderer0.ZERO, 1.0, waterfallBarRenderer0.DEFAULT_OUTLINE_PAINT, statisticalLineAndShapeRenderer0.DEFAULT_OUTLINE_STROKE);
      Layer layer0 = Layer.FOREGROUND;
      statisticalLineAndShapeRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      minMaxCategoryRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) standardCategoryToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      minMaxCategoryRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("Base tool tip generator not cloneable.");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(extendedCategoryAxis0);
      ganttRenderer0.setPlot(combinedDomainCategoryPlot0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategoryPlot categoryPlot0 = groupedStackedBarRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      LegendItemCollection legendItemCollection0 = defaultCategoryItemRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      ValueAxis valueAxis0 = statisticalBarRenderer0.getRangeAxis(categoryPlot0, 10);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      NumberTickUnit numberTickUnit0 = NumberAxis.DEFAULT_TICK_UNIT;
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((-362.799924434348));
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
      // Undeclared exception!
      try { 
        barRenderer0.updateCrosshairValues(categoryCrosshairState0, numberTickUnit0, numberTickUnit0, 5.0E-8, 3, 2809.5996521719, 5.0E-8, plotOrientation0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Paint paint0 = combinedDomainXYPlot0.getRangeGridlinePaint();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(paint0, paint0, combinedDomainXYPlot0.DEFAULT_OUTLINE_PAINT, combinedDomainXYPlot0.DEFAULT_CROSSHAIR_PAINT);
      // Undeclared exception!
      try { 
        waterfallBarRenderer0.updateCrosshairValues((CategoryCrosshairState) null, 1.0F, 10, 0.0, 15, (-5188.29124614), 2.5E7, (PlotOrientation) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'orientation' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SymbolAxis symbolAxis0 = new SymbolAxis("4bq9%/", stringArray0);
      Paint paint0 = symbolAxis0.getGridBandAlternatePaint();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(paint0, paint0, symbolAxis0.DEFAULT_TICK_LABEL_PAINT, symbolAxis0.DEFAULT_TICK_LABEL_PAINT);
      PolarPlot polarPlot0 = new PolarPlot();
      PlotOrientation plotOrientation0 = polarPlot0.getOrientation();
      waterfallBarRenderer0.updateCrosshairValues((CategoryCrosshairState) null, 500, symbolAxis0.DEFAULT_TICK_UNIT, (-4442.5), 500, 500, 0.05, plotOrientation0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      LegendItem legendItem0 = minMaxCategoryRenderer0.getLegendItem(0, 0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle rectangle0 = line2D_Double0.getBounds();
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.NO_CHANGE;
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.CENTER;
      Point2D point2D0 = intervalBarRenderer0.calculateDomainMarkerTextAnchorPoint((Graphics2D) null, plotOrientation0, rectangle0, rectangle0, combinedDomainXYPlot0.DEFAULT_INSETS, lengthAdjustmentType0, rectangleAnchor0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator("Series index out of bounds");
      minMaxCategoryRenderer0.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      Stroke stroke0 = layeredBarRenderer0.lookupSeriesStroke(2241);
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(layeredBarRenderer0.ZERO, (-1258.2769436193), layeredBarRenderer0.ZERO, 2241, layeredBarRenderer0.DEFAULT_PAINT, stroke0);
      Layer layer0 = Layer.BACKGROUND;
      layeredBarRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      // Undeclared exception!
      try { 
        scatterRenderer0.addAnnotation((CategoryAnnotation) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'annotation' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator();
      boxAndWhiskerRenderer0.setBaseURLGenerator((CategoryURLGenerator) standardCategoryURLGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SymbolAxis symbolAxis0 = new SymbolAxis("4bq9%/", stringArray0);
      Paint paint0 = symbolAxis0.getGridBandAlternatePaint();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(paint0, paint0, symbolAxis0.DEFAULT_TICK_LABEL_PAINT, symbolAxis0.DEFAULT_TICK_LABEL_PAINT);
      waterfallBarRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      intervalBarRenderer0.setSeriesURLGenerator(1, (CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      StackedXYAreaRenderer2 stackedXYAreaRenderer2_0 = new StackedXYAreaRenderer2();
      Shape shape0 = stackedXYAreaRenderer2_0.getLegendArea();
      double[][] doubleArray0 = new double[7][5];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        ganttRenderer0.addEntity(standardEntityCollection0, shape0, defaultIntervalCategoryDataset0, 1904, 30, true);
      } catch(IllegalArgumentException e) {
         //
         // The 'row' argument is out of bounds.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      stackedBarRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      lineRenderer3D0.setSeriesToolTipGenerator(1600, (CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryToolTipGenerator categoryToolTipGenerator0 = lineRenderer3D0.getToolTipGenerator(2771, (-2257), false);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      lineAndShapeRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setSeriesItemLabelGenerator(10, (CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      lineAndShapeRenderer0.setSeriesItemLabelGenerator(3338, (CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = minMaxCategoryRenderer0.getItemLabelGenerator(1778, 1778, true);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.setSeriesURLGenerator((-630), (CategoryURLGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = minMaxCategoryRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("kT}4Su064Vy%XKJ", numberFormat0);
      lineRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Paint paint0 = combinedDomainXYPlot0.getRangeGridlinePaint();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(paint0, paint0, combinedDomainXYPlot0.DEFAULT_OUTLINE_PAINT, combinedDomainXYPlot0.DEFAULT_CROSSHAIR_PAINT);
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemLabelGenerator();
      waterfallBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      int int0 = minMaxCategoryRenderer0.getRowCount();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      // Undeclared exception!
      try { 
        intervalBarRenderer0.setSeriesToolTipGenerator((-291), (CategoryToolTipGenerator) standardCategoryToolTipGenerator0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = minMaxCategoryRenderer0.getSeriesItemLabelGenerator(250);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = layeredBarRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      defaultCategoryItemRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryURLGenerator categoryURLGenerator0 = lineRenderer3D0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      int int0 = areaRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      int int0 = scatterRenderer0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      int int0 = lineAndShapeRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      minMaxCategoryRenderer0.setLegendItemURLGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = scatterRenderer0.getLegendItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(levelRenderer0.ZERO, (-994.0), 0.2, (-994.0), levelRenderer0.DEFAULT_VALUE_LABEL_PAINT, levelRenderer0.DEFAULT_OUTLINE_STROKE);
      boolean boolean0 = levelRenderer0.removeAnnotation(categoryLineAnnotation0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(4.0, 304.014);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset(taskSeriesCollection0, 519, 519);
      Range range0 = barRenderer3D0.findRangeBounds(slidingGanttCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("Base tool tip generator not cloneable.");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(extendedCategoryAxis0);
      LevelRenderer levelRenderer0 = new LevelRenderer();
      ChartPanel chartPanel0 = new ChartPanel((JFreeChart) null, 15, 0, (-1), 2099, 0, (-1), false, true, true, true, false, true);
      JScrollPane jScrollPane0 = new JScrollPane(chartPanel0);
      Rectangle rectangle0 = jScrollPane0.getViewportBorderBounds();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        levelRenderer0.initialise((Graphics2D) null, rectangle0, combinedDomainCategoryPlot0, defaultCategoryDataset0, plotRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      Stroke stroke0 = layeredBarRenderer0.lookupSeriesStroke(2241);
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(layeredBarRenderer0.ZERO, (-1258.2769436193), layeredBarRenderer0.ZERO, 2241, layeredBarRenderer0.DEFAULT_PAINT, stroke0);
      layeredBarRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      double[][] doubleArray0 = new double[4][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot(defaultIntervalCategoryDataset0);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = spiderWebPlot0.getLabelGenerator();
      // Undeclared exception!
      try { 
        areaRenderer0.setSeriesItemLabelGenerator((-1), categoryItemLabelGenerator0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }
}