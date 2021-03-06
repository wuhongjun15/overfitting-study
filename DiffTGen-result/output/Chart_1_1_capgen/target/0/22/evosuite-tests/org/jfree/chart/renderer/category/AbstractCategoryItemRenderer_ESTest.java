/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 10:10:41 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.SystemColor;
import java.text.NumberFormat;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
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
import org.jfree.chart.util.TableOrder;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.SlidingCategoryDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      CategoryPlot categoryPlot0 = barRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.controlHighlight;
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(systemColor0, systemColor0, systemColor0, systemColor0);
      LegendItem legendItem0 = waterfallBarRenderer0.getLegendItem((-2635), 2985);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      CategoryURLGenerator categoryURLGenerator0 = barRenderer3D0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      CategoryToolTipGenerator categoryToolTipGenerator0 = stackedAreaRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.setSeriesURLGenerator((-788), (CategoryURLGenerator) null, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      // Undeclared exception!
      try { 
        ganttRenderer0.setSeriesItemLabelGenerator((-1533), (CategoryItemLabelGenerator) null, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(10000.0, 10000.0);
      // Undeclared exception!
      try { 
        barRenderer3D0.setSeriesItemLabelGenerator((-348), (CategoryItemLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      SlidingCategoryDataset slidingCategoryDataset0 = new SlidingCategoryDataset(defaultMultiValueCategoryDataset0, 10, 0);
      // Undeclared exception!
      try { 
        levelRenderer0.getDomainAxis((CategoryPlot) null, slidingCategoryDataset0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      DrawingSupplier drawingSupplier0 = boxAndWhiskerRenderer0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getURLGenerator(0, 1374, false);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalLineAndShapeRenderer0.getToolTipGenerator(0, 0, true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator();
      boxAndWhiskerRenderer0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      LegendItemCollection legendItemCollection0 = levelRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      Object object0 = defaultCategoryItemRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      Range range0 = stackedBarRenderer3D0.findRangeBounds((CategoryDataset) defaultKeyedValues2DDataset0, true);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = lineAndShapeRenderer0.createState(plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator("~@&TMARkN\"&ze r", " 3v`}ldN", "4v1}@AfbPQl;/1[");
      levelRenderer0.setBaseURLGenerator((CategoryURLGenerator) standardCategoryURLGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      // Undeclared exception!
      try { 
        lineRenderer3D0.addEntity(standardEntityCollection0, barRenderer0.DEFAULT_SHAPE, (CategoryDataset) null, (-223), 0, false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = lineAndShapeRenderer0.getItemLabelGenerator((-348), (-348), true);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      scatterRenderer0.setPlot(categoryPlot0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      barRenderer3D0.setSeriesURLGenerator(3387, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = ganttRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      TableOrder tableOrder0 = multiplePiePlot0.getDataExtractOrder();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot(defaultKeyedValues2DDataset0, tableOrder0);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = spiderWebPlot0.getLabelGenerator();
      boxAndWhiskerRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator0);
      Object object0 = boxAndWhiskerRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      int int0 = stackedBarRenderer0.getRowCount();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      levelRenderer0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(983.972186777, 1938.0);
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      stackedBarRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = categoryStepRenderer0.getSeriesItemLabelGenerator(127);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = boxAndWhiskerRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      stackedAreaRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = boxAndWhiskerRenderer0.getSeriesToolTipGenerator((-525));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      int int0 = ganttRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      int int0 = categoryStepRenderer0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = waterfallBarRenderer0.getLegendItemLabelGenerator();
      waterfallBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      SegmentedTimeline segmentedTimeline0 = SegmentedTimeline.newFifteenMinuteTimeline();
      MockDate mockDate0 = new MockDate();
      SegmentedTimeline.Segment segmentedTimeline_Segment0 = segmentedTimeline0.getSegment((Date) mockDate0);
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("T3:VU/PMb3q|$.b6Z9", segmentedTimeline_Segment0, 3600000L, (-1183.70075));
      stackedBarRenderer0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(983.972186777, 1938.0);
      MeterPlot meterPlot0 = new MeterPlot();
      NumberFormat numberFormat0 = meterPlot0.getTickLabelFormat();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("n7drcJK|~Hd?", numberFormat0, numberFormat0);
      stackedBarRenderer3D0.setSeriesItemLabelGenerator(1, (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0);
  }
}
