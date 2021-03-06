/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 06:59:14 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.SlidingGanttCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      LevelRenderer levelRenderer0 = new LevelRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      Number[][] numberArray0 = new Number[1][6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((String[]) null, numberArray0, numberArray0);
      barRenderer0.addEntity(standardEntityCollection0, levelRenderer0.DEFAULT_SHAPE, defaultIntervalCategoryDataset0, 0, 0, true, 0, 0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds(defaultCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      boolean boolean0 = levelRenderer0.equals(scatterRenderer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryURLGenerator categoryURLGenerator0 = lineRenderer3D0.getURLGenerator(650, (-1), false);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getToolTipGenerator(0, 64, true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, (-3179.0));
      CategoryPlot categoryPlot0 = stackedBarRenderer3D0.getPlot();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      LegendItemCollection legendItemCollection0 = statisticalLineAndShapeRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Object object0 = scatterRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset(taskSeriesCollection0, 193, 2890);
      Range range0 = groupedStackedBarRenderer0.findRangeBounds((CategoryDataset) slidingGanttCategoryDataset0, false);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      // Undeclared exception!
      try { 
        areaRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      areaRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      lineAndShapeRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      statisticalLineAndShapeRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, (-3179.0));
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.setPlot((CategoryPlot) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = minMaxCategoryRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemLabelGenerator();
      minMaxCategoryRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalLineAndShapeRenderer0.getSeriesItemLabelGenerator(1801);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = barRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      Ellipse2D.Double ellipse2D_Double0 = new Ellipse2D.Double(0.0, (-1.0), 0.0, (-2791.7688325189));
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.addEntity(standardEntityCollection0, ellipse2D_Double0, defaultKeyedValues2DDataset0, 49, 1801, true, 0.0, (-2791.7688325189));
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 49, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Stroke stroke0 = boxAndWhiskerRenderer0.lookupSeriesStroke(3442);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      int int0 = levelRenderer0.getColumnCount();
  }
}
