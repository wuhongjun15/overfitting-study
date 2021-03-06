/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:03:37 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Rectangle2D;
import java.sql.Connection;
import java.text.NumberFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.IntervalBarRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, (-2010.18), false);
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator("", "", "ItemLabelGenerator not cloneable.");
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.setSeriesURLGenerator((-1054), (CategoryURLGenerator) standardCategoryURLGenerator0, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator("", numberFormat0);
      // Undeclared exception!
      try { 
        barRenderer0.setSeriesItemLabelGenerator((-285), (CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = intervalBarRenderer0.getURLGenerator((-525), (-525), false);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      // Undeclared exception!
      try { 
        categoryStepRenderer0.addEntity(standardEntityCollection0, statisticalBarRenderer0.DEFAULT_SHAPE, defaultBoxAndWhiskerCategoryDataset0, (-2363), (-2363), false);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      Object object0 = statisticalLineAndShapeRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      Range range0 = intervalBarRenderer0.findRangeBounds((CategoryDataset) defaultKeyedValues2DDataset0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      categoryStepRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      stackedAreaRenderer0.setSeriesItemLabelGenerator(1, (CategoryItemLabelGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      lineAndShapeRenderer0.setSeriesURLGenerator(157, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedBarRenderer3D0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot((CategoryDataset) null);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = spiderWebPlot0.getLabelGenerator();
      minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      stackedBarRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(8.0, (double) lineRenderer3D0.ZERO, true);
      stackedBarRenderer3D0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      AreaRenderer areaRenderer0 = new AreaRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        areaRenderer0.addEntity(standardEntityCollection0, groupedStackedBarRenderer0.DEFAULT_SHAPE, defaultStatisticalCategoryDataset0, 21, 0, true, 1540.7523, 50.0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 21, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      CategoryPlot categoryPlot0 = stackedBarRenderer3D0.getPlot();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      int int0 = stackedBarRenderer3D0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator();
      stackedBarRenderer3D0.setLegendItemURLGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = categoryStepRenderer0.getLegendItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", 3.0, 8.0, (-224.25731582));
      boolean boolean0 = stackedBarRenderer3D0.removeAnnotation(categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      Rectangle2D rectangle2D0 = chartRenderingInfo0.getChartArea();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = categoryStepRenderer0.createState(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        levelRenderer0.calculateItemWidth((CategoryPlot) null, rectangle2D0, jDBCCategoryDataset0, categoryItemRendererState0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("9NPM+", boxAndWhiskerRenderer0.ZERO, 5452.2, (double) boxAndWhiskerRenderer0.ZERO);
      boxAndWhiskerRenderer0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      DrawingSupplier drawingSupplier0 = barRenderer0.getDrawingSupplier();
  }
}
