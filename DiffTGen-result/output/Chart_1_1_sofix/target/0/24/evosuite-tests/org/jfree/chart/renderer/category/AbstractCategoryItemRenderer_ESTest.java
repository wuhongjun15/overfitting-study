/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:43:01 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.text.Format;
import javax.swing.JFormattedTextField;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.labels.IntervalCategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
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
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.Range;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.SlidingGanttCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      Year year0 = new Year();
      String[] stringArray0 = new String[3];
      Number[][] numberArray0 = new Number[0][8];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, numberArray0, numberArray0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Null 'start' argument.");
      Rectangle rectangle0 = new Rectangle((-9999), 9999);
      CategoryPlot categoryPlot0 = new CategoryPlot();
      RectangleEdge rectangleEdge0 = categoryPlot0.getDomainAxisEdge();
      double double0 = ganttRenderer0.getItemMiddle(year0, year0, defaultIntervalCategoryDataset0, subCategoryAxis0, rectangle0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = stackedAreaRenderer0.getSeriesItemLabelGenerator(0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = stackedAreaRenderer0.getItemLabelGenerator(0, 0, false);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(75.0, 3);
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultCategoryDataset0, subCategoryAxis0, cyclicNumberAxis0, stackedBarRenderer3D0);
      CategoryAxis categoryAxis0 = stackedBarRenderer3D0.getDomainAxis(categoryPlot0, defaultCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = barRenderer3D0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.getDomainAxis((CategoryPlot) null, defaultStatisticalCategoryDataset0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      BarRenderer barRenderer0 = new BarRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("ol%`G:4J'vR/#v", boxAndWhiskerRenderer0.ZERO, 0.0, 677.0);
      // Undeclared exception!
      try { 
        barRenderer0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0, (Layer) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      areaRenderer0.setSeriesURLGenerator(408, (CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryURLGenerator categoryURLGenerator0 = ganttRenderer0.getURLGenerator(2697, (-1405), false);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 0.0, true);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset(taskSeriesCollection0, 0, 0);
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot(slidingGanttCategoryDataset0);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = spiderWebPlot0.getLabelGenerator();
      stackedBarRenderer3D0.setSeriesItemLabelGenerator(0, categoryItemLabelGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = scatterRenderer0.getSeriesToolTipGenerator((-4240));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategoryPlot categoryPlot0 = groupedStackedBarRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      Range range0 = levelRenderer0.findRangeBounds(taskSeriesCollection0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(true, false);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultStatisticalCategoryDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("Null 'stroke' argument.", lineAndShapeRenderer0.DEFAULT_VALUE_LABEL_FONT, multiplePiePlot0, true);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("3P+kpxce_</kyEX_");
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = new CategoryItemRendererState(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.createHotSpotBounds(graphics2D0, rectangle2D0, combinedDomainCategoryPlot0, categoryAxis0, logarithmicAxis0, defaultStatisticalCategoryDataset0, 15, 500, true, categoryItemRendererState0, rectangle2D0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 500, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      DateAxis dateAxis0 = new DateAxis();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(dateAxis0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      Number[][] numberArray0 = new Number[2][8];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.addEntity(standardEntityCollection0, combinedRangeCategoryPlot0.DEFAULT_LEGEND_ITEM_BOX, defaultIntervalCategoryDataset0, 102, 500, true);
      } catch(IllegalArgumentException e) {
         //
         // The 'row' argument is out of bounds.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      LegendItemCollection legendItemCollection0 = stackedAreaRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator(")W@h'Vj", ")W@h'Vj", ")W@h'Vj");
      areaRenderer0.setBaseURLGenerator((CategoryURLGenerator) standardCategoryURLGenerator0, true);
      try { 
        areaRenderer0.clone();
      } catch(CloneNotSupportedException e) {
         //
         // Base item URL generator not cloneable.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Object object0 = statisticalBarRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2.0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(cyclicNumberAxis0);
      PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
      ganttRenderer0.updateCrosshairValues((CategoryCrosshairState) null, 5, true, Double.NaN, 0, 0, 20.0, plotOrientation0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      LogAxis logAxis0 = new LogAxis("");
      NumberTickUnit numberTickUnit0 = logAxis0.getTickUnit();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.updateCrosshairValues(categoryCrosshairState0, numberTickUnit0, 500, 1635.901, 1257, (-2941.91774099), 1257, plotOrientation0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      DrawingSupplier drawingSupplier0 = boxAndWhiskerRenderer0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      IntervalBarRenderer intervalBarRenderer1 = new IntervalBarRenderer();
      boolean boolean0 = intervalBarRenderer0.equals(intervalBarRenderer1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      boolean boolean0 = barRenderer3D0.equals(stackedBarRenderer3D0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      LegendItem legendItem0 = minMaxCategoryRenderer0.getLegendItem(0, 0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      PiePlot3D piePlot3D0 = new PiePlot3D();
      JFreeChart jFreeChart0 = new JFreeChart(piePlot3D0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(3, 1570, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      Rectangle rectangle0 = new Rectangle(10, 1570, 1570, 3);
      IntervalMarker intervalMarker0 = new IntervalMarker(1214.717780255, 90.0);
      LengthAdjustmentType lengthAdjustmentType0 = intervalMarker0.getLabelOffsetType();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP;
      Point2D point2D0 = stackedBarRenderer3D0.calculateDomainMarkerTextAnchorPoint(graphics2D0, plotOrientation0, rectangle0, rectangle0, piePlot3D0.DEFAULT_INSETS, lengthAdjustmentType0, rectangleAnchor0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Number[][] numberArray0 = new Number[5][2];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((String[]) null, numberArray0, numberArray0);
      Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(215.59720297123, (-948.0));
      Polygon polygon0 = new Polygon();
      Rectangle2D rectangle2D0 = polygon0.getBounds2D();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.initialise((Graphics2D) null, rectangle2D0, categoryPlot0, defaultCategoryDataset0, plotRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = statisticalBarRenderer0.createState(plotRenderingInfo0);
      EntityCollection entityCollection0 = categoryItemRendererState0.getEntityCollection();
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)Plot.DEFAULT_LEGEND_ITEM_BOX;
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.addEntity(entityCollection0, rectangle2D_Double0, taskSeriesCollection0, (-395), 4784, false, 1000.0, 2.0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      // Undeclared exception!
      try { 
        levelRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedBarRenderer0.getLegendItemLabelGenerator();
      defaultCategoryItemRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      BarRenderer3D barRenderer3D0 = new BarRenderer3D((double) statisticalLineAndShapeRenderer0.ZERO, (-761.4892657736));
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(statisticalLineAndShapeRenderer0.ZERO, 3.0, 0.2, 3.0, barRenderer3D0.DEFAULT_OUTLINE_PAINT, barRenderer3D0.DEFAULT_STROKE);
      Layer layer0 = Layer.BACKGROUND;
      statisticalLineAndShapeRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, false);
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("Null 'plot' argument.", waterfallBarRenderer0.ZERO, 4918.243865772136);
      Layer layer0 = Layer.FOREGROUND;
      statisticalLineAndShapeRenderer0.addAnnotation((CategoryAnnotation) categoryTextAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      stackedAreaRenderer0.setSeriesURLGenerator(420, (CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField((Format) mockSimpleDateFormat0);
      EtchedBorder etchedBorder0 = new EtchedBorder(5, (Color) null, (Color) null);
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) jFormattedTextField0, (Border) etchedBorder0, 3, 5, 3, 0);
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      // Undeclared exception!
      try { 
        categoryStepRenderer0.addEntity(standardEntityCollection0, rectangle0, defaultMultiValueCategoryDataset0, 3, (-533), true, (-1), 1021.628202);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      waterfallBarRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) standardCategoryToolTipGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator();
      statisticalLineAndShapeRenderer0.setSeriesToolTipGenerator(2789, (CategoryToolTipGenerator) intervalCategoryToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setSeriesToolTipGenerator(1, (CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      minMaxCategoryRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setSeriesItemLabelGenerator(381, (CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      // Undeclared exception!
      try { 
        lineRenderer3D0.setPlot((CategoryPlot) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator(" &\"YK/$&4.", " &\"YK/$&4.", " &\"YK/$&4.");
      statisticalBarRenderer0.setSeriesURLGenerator(47, (CategoryURLGenerator) standardCategoryURLGenerator0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = ganttRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = barRenderer0.getSeriesURLGenerator(0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, true);
      statisticalLineAndShapeRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      stackedBarRenderer3D0.setLegendItemToolTipGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      int int0 = statisticalBarRenderer0.getRowCount();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      // Undeclared exception!
      try { 
        stackedBarRenderer0.setSeriesToolTipGenerator((-2272), (CategoryToolTipGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, true);
      lineAndShapeRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = groupedStackedBarRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      areaRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator();
      levelRenderer0.setBaseURLGenerator((CategoryURLGenerator) standardCategoryURLGenerator0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      CategoryURLGenerator categoryURLGenerator0 = lineAndShapeRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = areaRenderer0.getToolTipGenerator(698, 698, true);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      int int0 = stackedBarRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      int int0 = stackedBarRenderer3D0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(0.2);
      Paint paint0 = categoryAxis0.getTickLabelPaint((Comparable) numberTickUnit0);
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(paint0, categoryAxis0.DEFAULT_AXIS_LABEL_PAINT, categoryAxis0.DEFAULT_AXIS_LABEL_PAINT, categoryAxis0.DEFAULT_AXIS_LABEL_PAINT);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = waterfallBarRenderer0.getLegendItemLabelGenerator();
      waterfallBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(ganttRenderer0.ZERO, (-927.0), 3.0, 1163.5, stackedAreaRenderer0.DEFAULT_PAINT, stackedAreaRenderer0.DEFAULT_STROKE);
      boolean boolean0 = ganttRenderer0.removeAnnotation(categoryLineAnnotation0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      CategoryAxis categoryAxis0 = new CategoryAxis("Base tool tip generator not cloneable.");
      LogAxis logAxis0 = new LogAxis("Base tool tip generator not cloneable.");
      CategoryPlot categoryPlot0 = new CategoryPlot(taskSeriesCollection0, categoryAxis0, logAxis0, areaRenderer0);
      areaRenderer0.setPlot(categoryPlot0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.getDomainAxis(combinedDomainCategoryPlot0, taskSeriesCollection0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      CategoryToolTipGenerator categoryToolTipGenerator0 = stackedAreaRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      // Undeclared exception!
      try { 
        ganttRenderer0.setSeriesItemLabelGenerator((-2497), (CategoryItemLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }
}
