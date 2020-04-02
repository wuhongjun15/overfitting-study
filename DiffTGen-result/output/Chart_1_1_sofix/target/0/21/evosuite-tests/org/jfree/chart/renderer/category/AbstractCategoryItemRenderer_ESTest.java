/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:39:20 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.IntervalBarRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = intervalBarRenderer0.getSeriesToolTipGenerator(0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("Base tool tip generator not cloneable.");
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultMultiValueCategoryDataset0, categoryAxis3D0, (ValueAxis) null, groupedStackedBarRenderer0);
      CategoryAxis categoryAxis0 = groupedStackedBarRenderer0.getDomainAxis(categoryPlot0, defaultMultiValueCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      // Undeclared exception!
      try { 
        ganttRenderer0.setSeriesURLGenerator((-176), (CategoryURLGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      Object object0 = stackedBarRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator("bj($bN*yOR$>3", "K*Q5N,w3WL", "6Or");
      stackedBarRenderer3D0.setSeriesURLGenerator(65, (CategoryURLGenerator) standardCategoryURLGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryURLGenerator categoryURLGenerator0 = boxAndWhiskerRenderer0.getURLGenerator((-611), (-80), false);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      LegendItemCollection legendItemCollection0 = statisticalBarRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      ValueAxis valueAxis0 = waterfallBarRenderer0.getRangeAxis(categoryPlot0, 0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      PlotOrientation plotOrientation0 = categoryPlot0.getOrientation();
      // Undeclared exception!
      try { 
        scatterRenderer0.updateCrosshairValues(categoryCrosshairState0, false, 10, 10, 33, 0.0, 1.0F, plotOrientation0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      DrawingSupplier drawingSupplier0 = levelRenderer0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      LegendItem legendItem0 = minMaxCategoryRenderer0.getLegendItem((-1), (-1));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Range range0 = scatterRenderer0.findRangeBounds((CategoryDataset) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      double[][] doubleArray0 = new double[1][0];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("%_$wF/?301K7|s~");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultIntervalCategoryDataset0, categoryAxis3D0, cyclicNumberAxis0, scatterRenderer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      // Undeclared exception!
      try { 
        defaultCategoryItemRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      stackedAreaRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      stackedBarRenderer3D0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      intervalBarRenderer0.setSeriesToolTipGenerator(2, (CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      intervalBarRenderer0.setSeriesToolTipGenerator(366, (CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        scatterRenderer0.addEntity(standardEntityCollection0, stackedAreaRenderer0.DEFAULT_SHAPE, defaultCategoryDataset0, 3, 3, true);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator();
      stackedAreaRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      scatterRenderer0.setPlot(categoryPlot0);
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      PlotOrientation plotOrientation0 = categoryPlot0.getOrientation();
      scatterRenderer0.updateCrosshairValues(categoryCrosshairState0, false, 10, 10, 33, 0.0, 1.0F, plotOrientation0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setSeriesURLGenerator(192, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      CategoryURLGenerator categoryURLGenerator0 = stackedAreaRenderer0.getSeriesURLGenerator(0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator();
      scatterRenderer0.setLegendItemToolTipGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      int int0 = stackedAreaRenderer0.getRowCount();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      // Undeclared exception!
      try { 
        waterfallBarRenderer0.setSeriesToolTipGenerator((-1871), (CategoryToolTipGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      // Undeclared exception!
      try { 
        waterfallBarRenderer0.drawBackground((Graphics2D) null, (CategoryPlot) null, (Rectangle2D) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      int int0 = stackedAreaRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategoryPlot categoryPlot0 = waterfallBarRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      levelRenderer0.setLegendItemURLGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      boolean boolean0 = ganttRenderer0.removeAnnotation((CategoryAnnotation) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, (-1.0), true);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.2);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(cyclicNumberAxis0);
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.getDomainAxis(combinedRangeCategoryPlot0, defaultKeyedValues2DDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = waterfallBarRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      stackedBarRenderer3D0.setSeriesItemLabelGenerator(1, (CategoryItemLabelGenerator) null);
  }
}