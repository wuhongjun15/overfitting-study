/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 04:34:59 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.IntervalBarRenderer;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = defaultCategoryItemRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      CategoryAxis categoryAxis0 = layeredBarRenderer0.getDomainAxis(combinedDomainCategoryPlot0, (CategoryDataset) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      boolean boolean0 = statisticalLineAndShapeRenderer0.equals(intervalBarRenderer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.setSeriesToolTipGenerator((-1526), (CategoryToolTipGenerator) null, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      Object object0 = stackedBarRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getToolTipGenerator(547, 547, true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(586.8, 586.8);
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator();
      barRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(true, true);
      CategoryPlot categoryPlot0 = lineAndShapeRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      PeriodAxis periodAxis0 = new PeriodAxis("");
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(periodAxis0);
      PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.updateCrosshairValues(categoryCrosshairState0, 500, statisticalBarRenderer0.ZERO, 0.05, 500, (-160.40522612558962), 0.0, plotOrientation0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Shape shape0 = minMaxCategoryRenderer0.lookupLegendShape(0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      TimeZone timeZone0 = TimeZone.getTimeZone("QY%MF=-dnf0(V");
      DateAxis dateAxis0 = new DateAxis("QY%MF=-dnf0(V", timeZone0);
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      PolarPlot polarPlot0 = new PolarPlot(defaultIntervalXYDataset0, dateAxis0, defaultPolarItemRenderer0);
      PlotOrientation plotOrientation0 = polarPlot0.getOrientation();
      IntervalMarker intervalMarker0 = new IntervalMarker(1.0E-4, (-3376.072311), lineRenderer3D0.DEFAULT_PAINT);
      LengthAdjustmentType lengthAdjustmentType0 = intervalMarker0.getLabelOffsetType();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.RIGHT;
      // Undeclared exception!
      try { 
        lineRenderer3D0.calculateDomainMarkerTextAnchorPoint((Graphics2D) null, plotOrientation0, (Rectangle2D) null, (Rectangle2D) null, polarPlot0.DEFAULT_INSETS, lengthAdjustmentType0, rectangleAnchor0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'base' argument.
         //
         verifyException("org.jfree.chart.util.RectangleInsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      Layer layer0 = Layer.FOREGROUND;
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.addAnnotation((CategoryAnnotation) null, layer0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'annotation' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator("ahe(P!y", mockSimpleDateFormat0);
      minMaxCategoryRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) intervalCategoryToolTipGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      stackedBarRenderer0.setSeriesToolTipGenerator(1, (CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-382.170928), (-382.170928), true);
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.addEntity(standardEntityCollection0, stackedBarRenderer3D0.DEFAULT_SHAPE, defaultBoxAndWhiskerCategoryDataset0, 1674, 1674, true, 0.0, 8.0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1674, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getItemLabelGenerator(1922, 5, true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      BarRenderer3D barRenderer3D0 = new BarRenderer3D((double) defaultCategoryItemRenderer0.ZERO, 0.0);
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(4.0, "Null 'stroke' argument.");
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultBoxAndWhiskerCategoryDataset0, categoryAxis0, cyclicNumberAxis0, barRenderer3D0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = levelRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      stackedAreaRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(586.8, 586.8);
      barRenderer3D0.setLegendItemToolTipGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D(586.8, 586.8);
      barRenderer3D0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 0.0);
      CategoryToolTipGenerator categoryToolTipGenerator0 = stackedBarRenderer3D0.getSeriesToolTipGenerator((-1677));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      int int0 = statisticalLineAndShapeRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("ItemLabelGenerator not cloneable.", stackedAreaRenderer0.ZERO, 3);
      boolean boolean0 = stackedAreaRenderer0.removeAnnotation(categoryTextAnnotation0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      Range range0 = defaultCategoryItemRenderer0.findRangeBounds(taskSeriesCollection0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      Number[][] numberArray0 = new Number[1][8];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((Comparable[]) null, (Comparable[]) null, numberArray0, numberArray0);
      CategoryPlot categoryPlot0 = new CategoryPlot();
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.getDomainAxis(categoryPlot0, defaultIntervalCategoryDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("Null 'subtitle' argument.", "Null 'subtitle' argument.", 3.0);
      stackedBarRenderer0.addAnnotation((CategoryAnnotation) categoryTextAnnotation0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = boxAndWhiskerRenderer0.getBaseToolTipGenerator();
  }
}
