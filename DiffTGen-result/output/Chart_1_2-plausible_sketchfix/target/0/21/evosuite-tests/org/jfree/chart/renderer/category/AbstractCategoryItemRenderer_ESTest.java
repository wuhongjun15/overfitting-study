/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 07:55:55 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.DateTickUnitType;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
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
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.category.SlidingCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      levelRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      CategoryURLGenerator categoryURLGenerator0 = stackedBarRenderer3D0.getURLGenerator(0, (-2756), true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getToolTipGenerator(0, 0, true);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedBarRenderer3D0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      LegendItem legendItem0 = waterfallBarRenderer0.getLegendItem(105, (-1233));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(true, false);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = lineAndShapeRenderer0.createState(plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Object object0 = scatterRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator("Ws6$T}^/\"", "gfwVi*e", "Ws6$T}^/\"");
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.setSeriesURLGenerator((-2138), (CategoryURLGenerator) standardCategoryURLGenerator0, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.setSeriesToolTipGenerator((-979), (CategoryToolTipGenerator) null, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(356.9, (-487.0));
      CategoryPlot categoryPlot0 = new CategoryPlot();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SlidingCategoryDataset slidingCategoryDataset0 = new SlidingCategoryDataset(taskSeriesCollection0, 10, 10);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.initialise((Graphics2D) null, (Rectangle2D) null, categoryPlot0, slidingCategoryDataset0, plotRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.BarRenderer3D", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      // Undeclared exception!
      try { 
        ganttRenderer0.getRangeAxis((CategoryPlot) null, 684);
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
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      // Undeclared exception!
      try { 
        levelRenderer0.getDomainAxis((CategoryPlot) null, jDBCCategoryDataset0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      CategoryPlot categoryPlot0 = new CategoryPlot();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.getDomainAxis(categoryPlot0, defaultCategoryDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      Line2D.Float line2D_Float0 = new Line2D.Float((-258.82913F), (-258.82913F), (-258.82913F), (-258.82913F));
      String[] stringArray0 = new String[3];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, (Number[][]) null, (Number[][]) null);
      // Undeclared exception!
      try { 
        layeredBarRenderer0.addEntity(standardEntityCollection0, line2D_Float0, defaultIntervalCategoryDataset0, 0, 0, false, 1624.0936870589865, 932.0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.addEntity((EntityCollection) null, scatterRenderer0.DEFAULT_SHAPE, defaultCategoryDataset0, 1, (-1), false, (-1), (-538.672191948564));
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      SlidingCategoryDataset slidingCategoryDataset0 = new SlidingCategoryDataset(defaultKeyedValues2DDataset0, (-1102), (-557));
      // Undeclared exception!
      try { 
        barRenderer0.addEntity(standardEntityCollection0, categoryStepRenderer_State0.line, slidingCategoryDataset0, (-557), 1075, false);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      DrawingSupplier drawingSupplier0 = scatterRenderer0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(3.0, 0.0, 3.0, 0.2, ganttRenderer0.DEFAULT_VALUE_LABEL_PAINT, ganttRenderer0.DEFAULT_OUTLINE_STROKE);
      Layer layer0 = Layer.FOREGROUND;
      ganttRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-643.2160870280895), 4.0);
      stackedBarRenderer3D0.setBaseURLGenerator((CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-643.2160870280895), 4.0);
      stackedBarRenderer3D0.setSeriesURLGenerator(0, (CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getSeriesToolTipGenerator(0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      CategoryPlot categoryPlot0 = lineAndShapeRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      LegendItemCollection legendItemCollection0 = stackedBarRenderer3D0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ValueAxis valueAxis0 = levelRenderer0.getRangeAxis(combinedDomainCategoryPlot0, (-381));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Locale locale0 = Locale.GERMAN;
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance(locale0);
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("4&", numberFormat0);
      scatterRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, false);
      Object object0 = scatterRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      DateTickUnitType dateTickUnitType0 = DateTickUnitType.DAY;
      DateFormat dateFormat0 = MockDateFormat.getDateInstance(0);
      DateTickUnit dateTickUnit0 = new DateTickUnit(dateTickUnitType0, 3, dateFormat0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(3620.62633468, (-43.0));
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(cyclicNumberAxis0);
      PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.updateCrosshairValues(categoryCrosshairState0, groupedStackedBarRenderer0.ZERO, dateTickUnit0, 5.0E-7, 0, (double) groupedStackedBarRenderer0.ZERO, 0.0, plotOrientation0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      CategoryItemRendererState categoryItemRendererState0 = scatterRenderer0.initialise((Graphics2D) null, (Rectangle2D) null, categoryPlot0, (CategoryDataset) null, (PlotRenderingInfo) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      // Undeclared exception!
      try { 
        lineRenderer3D0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      // Undeclared exception!
      try { 
        layeredBarRenderer0.addAnnotation((CategoryAnnotation) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'annotation' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator("E'*");
      layeredBarRenderer0.setSeriesURLGenerator(10, (CategoryURLGenerator) standardCategoryURLGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      EntityCollection entityCollection0 = categoryStepRenderer_State0.getEntityCollection();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      // Undeclared exception!
      try { 
        layeredBarRenderer0.addEntity(entityCollection0, categoryStepRenderer_State0.line, jDBCCategoryDataset0, 1178, 4617, true);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1178, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setSeriesToolTipGenerator(10, (CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      minMaxCategoryRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setSeriesItemLabelGenerator(2273, (CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = groupedStackedBarRenderer0.getItemLabelGenerator(2273, 2273, true);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setSeriesURLGenerator(812, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalLineAndShapeRenderer0.getSeriesURLGenerator(0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = levelRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setLegendItemToolTipGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setSeriesToolTipGenerator(1304, (CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getSeriesItemLabelGenerator(29);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      statisticalLineAndShapeRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      categoryStepRenderer0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      int int0 = scatterRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      int int0 = levelRenderer0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      int int0 = categoryStepRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setLegendItemURLGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalLineAndShapeRenderer0.getLegendItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(scatterRenderer0.ZERO, (double) scatterRenderer0.ZERO, scatterRenderer0.ZERO, (double) scatterRenderer0.ZERO, scatterRenderer0.DEFAULT_PAINT, scatterRenderer0.DEFAULT_OUTLINE_STROKE);
      boolean boolean0 = scatterRenderer0.removeAnnotation(categoryLineAnnotation0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      Range range0 = lineAndShapeRenderer0.findRangeBounds(taskSeriesCollection0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      Rectangle rectangle0 = new Rectangle();
      Rectangle2D rectangle2D0 = numberAxis3D0.DEFAULT_AXIS_LABEL_INSETS.createInsetRectangle((Rectangle2D) rectangle0, true, true);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.initialise((Graphics2D) null, rectangle2D0, combinedRangeCategoryPlot0, jDBCCategoryDataset0, plotRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 0.0);
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("Base item URL generator not cloneable.", 0.2, 3.0);
      stackedBarRenderer3D0.addAnnotation((CategoryAnnotation) categoryTextAnnotation0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = levelRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      // Undeclared exception!
      try { 
        levelRenderer0.setSeriesItemLabelGenerator((-1), (CategoryItemLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }
}