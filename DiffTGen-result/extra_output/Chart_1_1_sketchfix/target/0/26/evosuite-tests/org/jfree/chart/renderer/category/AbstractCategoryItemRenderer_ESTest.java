/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:16:34 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.SystemColor;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.NumberFormat;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
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
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.Week;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      int int0 = groupedStackedBarRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      minMaxCategoryRenderer0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = groupedStackedBarRenderer0.getToolTipGenerator(0, 0, true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      ValueAxis valueAxis0 = categoryStepRenderer0.getRangeAxis(combinedRangeCategoryPlot0, 2018);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      LegendItem legendItem0 = barRenderer3D0.getLegendItem(1356, 1356);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(1881.9, 1881.9);
      boolean boolean0 = scatterRenderer0.equals(barRenderer3D0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = stackedBarRenderer0.createState(plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(Double.NaN, 906.589384);
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.setSeriesToolTipGenerator((-3300), (CategoryToolTipGenerator) standardCategoryToolTipGenerator0, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator();
      // Undeclared exception!
      try { 
        stackedBarRenderer0.setSeriesItemLabelGenerator((-557), (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("", numberFormat0, numberFormat0);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.setSeriesItemLabelGenerator((-2784), (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      // Undeclared exception!
      try { 
        scatterRenderer0.getDomainAxis((CategoryPlot) null, defaultMultiValueCategoryDataset0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float((-4712.6177F), (-4712.6177F), (-4712.6177F), 2492.5437F, 2492.5437F, 3615.0F);
      Rectangle2D rectangle2D0 = roundRectangle2D_Float0.getBounds2D();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.addEntity(standardEntityCollection0, rectangle2D0, defaultBoxAndWhiskerCategoryDataset0, 0, 0, false, 3615.0F, 0.2F);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.addEntity(standardEntityCollection0, barRenderer3D0.DEFAULT_SHAPE, (CategoryDataset) null, 1369, 1369, true);
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
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.addEntity(standardEntityCollection0, defaultCaret0, defaultBoxAndWhiskerCategoryDataset0, 0, 1, true);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator("3rFLn=L|#!Nx-G");
      statisticalBarRenderer0.setBaseURLGenerator((CategoryURLGenerator) standardCategoryURLGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator();
      stackedBarRenderer0.setSeriesURLGenerator(2, (CategoryURLGenerator) standardCategoryURLGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      CategoryURLGenerator categoryURLGenerator0 = stackedBarRenderer0.getURLGenerator(4999, (-638), false);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 0.0, false);
      DateFormat dateFormat0 = MockDateFormat.getInstance();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator("0`+!=B,$M", dateFormat0);
      stackedBarRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) intervalCategoryToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      levelRenderer0.setPlot(categoryPlot0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      CategoryToolTipGenerator categoryToolTipGenerator0 = stackedBarRenderer3D0.getSeriesToolTipGenerator(83);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryPlot categoryPlot0 = boxAndWhiskerRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultCategoryItemRenderer0.addEntity(standardEntityCollection0, (Shape) null, defaultStatisticalCategoryDataset0, (-1420), 0, true, 200000.0, 200000.0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      LegendItemCollection legendItemCollection0 = stackedAreaRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      ValueAxis valueAxis0 = stackedAreaRenderer0.getRangeAxis(categoryPlot0, 2568);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Object object0 = boxAndWhiskerRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      // Undeclared exception!
      try { 
        lineRenderer3D0.updateCrosshairValues((CategoryCrosshairState) null, 0.2, 0.2, 3.0, 779, 1.0, 779, (PlotOrientation) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'orientation' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(true, true);
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      Week week0 = new Week();
      PeriodAxis periodAxis0 = new PeriodAxis((String) null, week0, week0);
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      PolarPlot polarPlot0 = new PolarPlot((XYDataset) null, periodAxis0, defaultPolarItemRenderer0);
      PlotOrientation plotOrientation0 = polarPlot0.getOrientation();
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.updateCrosshairValues(categoryCrosshairState0, week0, week0, 1, 1, 1, 0.0, plotOrientation0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      Number[][] numberArray0 = new Number[7][2];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      Range range0 = intervalBarRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Number[][] numberArray0 = new Number[2][9];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, (Number[][]) null);
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-2543.8253), (-2543.8253));
      Size2D size2D0 = new Size2D((-2543.8253), 8.0);
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      Rectangle2D rectangle2D0 = RectangleAnchor.createRectangle(size2D0, 0.0, (-863.98026126), rectangleAnchor0);
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      String[] stringArray0 = new String[1];
      SymbolAxis symbolAxis0 = new SymbolAxis("/7v\"I$%jr?PDLwgV}-", stringArray0);
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultMultiValueCategoryDataset0, categoryAxis3D0, symbolAxis0, stackedBarRenderer3D0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.initialise((Graphics2D) null, rectangle2D0, categoryPlot0, defaultMultiValueCategoryDataset0, plotRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 0.0, false);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedBarRenderer3D0.getLegendItemLabelGenerator();
      stackedBarRenderer3D0.setLegendItemLabelGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      SystemColor systemColor0 = SystemColor.window;
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(12.0, 8.0, lineRenderer3D0.ZERO, 8.0, systemColor0, lineRenderer3D0.DEFAULT_OUTLINE_STROKE);
      Layer layer0 = Layer.BACKGROUND;
      minMaxCategoryRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      stackedAreaRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator("");
      scatterRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) standardCategoryURLGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator();
      minMaxCategoryRenderer0.setSeriesToolTipGenerator(49, (CategoryToolTipGenerator) intervalCategoryToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setSeriesToolTipGenerator(2654, (CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      levelRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getItemLabelGenerator(0, 0, false);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        levelRenderer0.initialise((Graphics2D) null, (Rectangle2D) null, (CategoryPlot) null, jDBCCategoryDataset0, plotRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setSeriesURLGenerator(0, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = boxAndWhiskerRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryURLGenerator categoryURLGenerator0 = lineRenderer3D0.getSeriesURLGenerator(0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = areaRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = spiderWebPlot0.getLabelGenerator();
      scatterRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-2543.8253), (-2543.8253));
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator("/7v\"I$%jr?PDLwgV}-");
      stackedBarRenderer3D0.setLegendItemToolTipGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      int int0 = statisticalLineAndShapeRenderer0.getRowCount();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      // Undeclared exception!
      try { 
        lineRenderer3D0.setSeriesToolTipGenerator((-2619), (CategoryToolTipGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.drawBackground((Graphics2D) null, (CategoryPlot) null, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = levelRenderer0.getSeriesItemLabelGenerator((-2154));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = minMaxCategoryRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      minMaxCategoryRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      stackedAreaRenderer0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      CategoryURLGenerator categoryURLGenerator0 = lineAndShapeRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      // Undeclared exception!
      try { 
        layeredBarRenderer0.addEntity(standardEntityCollection0, waterfallBarRenderer0.DEFAULT_SHAPE, jDBCCategoryDataset0, (-365), (-671), false);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      Paint paint0 = stackedBarRenderer0.lookupSeriesPaint(0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(taskSeriesCollection0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, true, true, false, false, true);
      Rectangle rectangle0 = chartPanel0.getVisibleRect();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge(180);
      // Undeclared exception!
      try { 
        categoryStepRenderer0.getItemMiddle(0.05, true, taskSeriesCollection0, subCategoryAxis0, rectangle0, rectangleEdge0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid category index: -1
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      int int0 = intervalBarRenderer0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      lineAndShapeRenderer0.setLegendItemURLGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("", lineRenderer3D0.ZERO, 12.0);
      boolean boolean0 = lineRenderer3D0.removeAnnotation(categoryTextAnnotation0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      Range range0 = lineAndShapeRenderer0.findRangeBounds((CategoryDataset) null);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      String[] stringArray0 = new String[2];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, (Number[][]) null, (Number[][]) null);
      // Undeclared exception!
      try { 
        lineRenderer3D0.getDomainAxis(categoryPlot0, defaultIntervalCategoryDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(stackedBarRenderer3D0.ZERO, 8.0, 0.2, 2242.883346261, stackedBarRenderer3D0.DEFAULT_VALUE_LABEL_PAINT, stackedBarRenderer3D0.DEFAULT_STROKE);
      stackedBarRenderer3D0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator();
      groupedStackedBarRenderer0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0);
  }
}
