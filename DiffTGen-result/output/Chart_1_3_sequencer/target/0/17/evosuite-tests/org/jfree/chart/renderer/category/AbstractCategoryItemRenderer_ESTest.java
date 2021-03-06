/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 06:29:38 GMT 2020
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
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.text.NumberFormat;
import java.util.Vector;
import javax.swing.JEditorPane;
import javax.swing.JTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.renderer.xy.XYLine3DRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.CustomCategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.category.SlidingCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.jdbc.JDBCXYDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.xy.XYDatasetTableModel;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalLineAndShapeRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CategoryAxis categoryAxis0 = new CategoryAxis("YetvJo:");
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultStatisticalCategoryDataset0, categoryAxis0, (ValueAxis) null, ganttRenderer0);
      CategoryAxis categoryAxis1 = ganttRenderer0.getDomainAxis(categoryPlot0, defaultStatisticalCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel(jDBCXYDataset0);
      boolean boolean0 = groupedStackedBarRenderer0.equals(xYDatasetTableModel0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getURLGenerator(0, (-437), false);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      stackedBarRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getItemLabelGenerator(0, 0, true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = ganttRenderer0.getSeriesToolTipGenerator(0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategoryPlot categoryPlot0 = waterfallBarRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      LegendItemCollection legendItemCollection0 = stackedBarRenderer3D0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot((ValueAxis) null);
      ValueAxis valueAxis0 = statisticalLineAndShapeRenderer0.getRangeAxis(combinedRangeCategoryPlot0, 0);
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.2, 2.0F, 5000.0, (-1688.73));
      Rectangle2D rectangle2D0 = ellipse2D_Double0.getBounds2D();
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.drawRangeLine((Graphics2D) null, combinedRangeCategoryPlot0, (ValueAxis) null, rectangle2D0, 0.0F, combinedRangeCategoryPlot0.DEFAULT_BACKGROUND_PAINT, valueAxis0.DEFAULT_AXIS_LINE_STROKE);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      Object object0 = stackedBarRenderer3D0.clone();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(213.108968985, 213.108968985, true);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      Rectangle rectangle0 = new Rectangle(5067, 10);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.drawDomainLine((Graphics2D) null, combinedRangeCategoryPlot0, rectangle0, 2.5E-4, combinedRangeCategoryPlot0.DEFAULT_BACKGROUND_PAINT, (Stroke) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CategoryPlot categoryPlot0 = new CategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("", categoryPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0);
      Rectangle2D rectangle2D0 = chartPanel0.getScreenDataArea();
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(420, 10, 0.0, 2476.4, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.initialise(graphics2D0, rectangle2D0, categoryPlot0, defaultMultiValueCategoryDataset0, (PlotRenderingInfo) null);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategoryItemRendererState categoryItemRendererState0 = statisticalLineAndShapeRenderer0.createState((PlotRenderingInfo) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemLabelGenerator();
      waterfallBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("/!&PYDj0KE^m.", 3.0, 0.0);
      Layer layer0 = Layer.FOREGROUND;
      statisticalBarRenderer0.addAnnotation((CategoryAnnotation) categoryTextAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Color color0 = (Color)XYLine3DRenderer.DEFAULT_WALL_PAINT;
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(statisticalBarRenderer0.DEFAULT_VALUE_LABEL_PAINT, color0, color0, scatterRenderer0.DEFAULT_OUTLINE_PAINT);
      waterfallBarRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("e\"'7:Mo</W&6pfW6", numberFormat0);
      lineRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) standardCategoryToolTipGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setSeriesToolTipGenerator(1, (CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((double) 1.0F);
      MeterPlot meterPlot0 = new MeterPlot(defaultValueDataset0);
      NumberFormat numberFormat0 = meterPlot0.getTickLabelFormat();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("", numberFormat0);
      waterfallBarRenderer0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      PolarPlot polarPlot0 = new PolarPlot();
      JFreeChart jFreeChart0 = new JFreeChart((String) null, polarPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 529, 1938.0, 0.0, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
      scatterRenderer0.drawItemLabel(graphics2D0, plotOrientation0, (CategoryDataset) null, 3, 10, false, 0, 1, true);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JEditorPane jEditorPane0 = new JEditorPane();
      Color color0 = jEditorPane0.getDisabledTextColor();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(color0, color0, color0, color0);
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator("");
      // Undeclared exception!
      try { 
        waterfallBarRenderer0.setSeriesURLGenerator((-2232), (CategoryURLGenerator) standardCategoryURLGenerator0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      CategoryURLGenerator categoryURLGenerator0 = stackedBarRenderer0.getSeriesURLGenerator(0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      minMaxCategoryRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      statisticalLineAndShapeRenderer0.setLegendItemToolTipGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      int int0 = ganttRenderer0.getRowCount();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      defaultCategoryItemRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CustomCategoryURLGenerator customCategoryURLGenerator0 = new CustomCategoryURLGenerator();
      lineRenderer3D0.setBaseURLGenerator((CategoryURLGenerator) customCategoryURLGenerator0);
      Object object0 = lineRenderer3D0.clone();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SlidingCategoryDataset slidingCategoryDataset0 = new SlidingCategoryDataset(taskSeriesCollection0, 1400, 1400);
      // Undeclared exception!
      try { 
        areaRenderer0.addEntity(standardEntityCollection0, statisticalBarRenderer0.DEFAULT_SHAPE, slidingCategoryDataset0, 1400, 0, true);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1400, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      int int0 = statisticalBarRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Shape shape0 = minMaxCategoryRenderer0.lookupSeriesShape(0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      JTable jTable0 = new JTable((Vector) null, (Vector) null);
      Rectangle rectangle0 = jTable0.getCellRect(0, 0, false);
      AxisLocation axisLocation0 = AxisLocation.BOTTOM_OR_LEFT;
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      RectangleEdge rectangleEdge0 = Plot.resolveDomainAxisLocation(axisLocation0, plotOrientation0);
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.getItemMiddle("7Szg`I7@H E8Eyu4|[", "7Szg`I7@H E8Eyu4|[", taskSeriesCollection0, categoryAxis3D0, rectangle0, rectangleEdge0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid category index: -1
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      int int0 = barRenderer0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = barRenderer0.getLegendItemLabelGenerator();
      barRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.2, 2.0);
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultKeyedValues2DDataset0, categoryAxis3D0, cyclicNumberAxis0, categoryStepRenderer0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      LogAxis logAxis0 = new LogAxis(")");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(logAxis0);
      double[][] doubleArray0 = new double[6][0];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        barRenderer0.getDomainAxis(combinedRangeCategoryPlot0, defaultIntervalCategoryDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, false);
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalLineAndShapeRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((double) 1.0F);
      MeterPlot meterPlot0 = new MeterPlot(defaultValueDataset0);
      NumberFormat numberFormat0 = meterPlot0.getTickLabelFormat();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("", numberFormat0);
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      categoryStepRenderer0.setSeriesItemLabelGenerator(293, (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0);
  }
}
