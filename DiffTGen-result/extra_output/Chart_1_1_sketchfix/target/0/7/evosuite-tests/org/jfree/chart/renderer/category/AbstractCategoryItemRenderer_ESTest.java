/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 11:05:55 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Stack;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getToolTipGenerator(0, (-2438), true);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("Vz%Wq#kjoGRn>^7");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1797, "Vz%Wq#kjoGRn>^7");
      CategoryPlot categoryPlot0 = new CategoryPlot((CategoryDataset) null, extendedCategoryAxis0, cyclicNumberAxis0, scatterRenderer0);
      ValueAxis valueAxis0 = categoryStepRenderer0.getRangeAxis(categoryPlot0, 1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = categoryStepRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("Vz%Wq#kjoGRn>^7");
      JInternalFrame jInternalFrame0 = new JInternalFrame("Vz%Wq#kjoGRn>^7", true, false, true);
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1797, "Vz%Wq#kjoGRn>^7");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(cyclicNumberAxis0);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getDomainAxisEdge();
      // Undeclared exception!
      try { 
        scatterRenderer0.getItemMiddle(categoryStepRenderer0.ZERO, categoryStepRenderer0.ZERO, (CategoryDataset) null, extendedCategoryAxis0, rectangle0, rectangleEdge0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      Locale locale0 = Locale.JAPAN;
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance(locale0);
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("?7dyQV10v@(VWe!+Y@v", numberFormat0);
      layeredBarRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) standardCategoryToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      CategoryPlot categoryPlot0 = stackedBarRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      LegendItemCollection legendItemCollection0 = waterfallBarRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("xVHh");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      ValueAxis valueAxis0 = boxAndWhiskerRenderer0.getRangeAxis(combinedDomainCategoryPlot0, 10);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      Object object0 = categoryStepRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((Comparable[]) null, (Comparable[]) null, (Number[][]) null, (Number[][]) null);
      // Undeclared exception!
      try { 
        scatterRenderer0.findRangeBounds(defaultIntervalCategoryDataset0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, true);
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator();
      statisticalLineAndShapeRenderer0.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = layeredBarRenderer0.getURLGenerator(1166, 3504, true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator();
      statisticalLineAndShapeRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = stackedBarRenderer0.getItemLabelGenerator(0, 0, true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = minMaxCategoryRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryURLGenerator categoryURLGenerator0 = ganttRenderer0.getSeriesURLGenerator((-1269));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setSeriesToolTipGenerator(4140, (CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      lineRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) standardCategoryToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      stackedBarRenderer0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CategoryURLGenerator categoryURLGenerator0 = stackedAreaRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Shape shape0 = scatterRenderer0.lookupLegendShape((-1269));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      CategoryAxis categoryAxis0 = new CategoryAxis("r44fE");
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.getItemMiddle(scatterRenderer0.ZERO, 3.0, defaultBoxAndWhiskerCategoryDataset0, categoryAxis0, (Rectangle2D) null, rectangleEdge0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid category index: -1
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Stack<CategoryPointerAnnotation> stack0 = new Stack<CategoryPointerAnnotation>();
      JList<CategoryTextAnnotation> jList0 = new JList<CategoryTextAnnotation>(stack0);
      Color color0 = jList0.getSelectionBackground();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(statisticalBarRenderer0.DEFAULT_PAINT, color0, statisticalBarRenderer0.DEFAULT_PAINT, statisticalBarRenderer0.DEFAULT_OUTLINE_PAINT);
      int int0 = waterfallBarRenderer0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("Null 'hotspot' argument.", "Null 'hotspot' argument.", (double) lineAndShapeRenderer0.ZERO, 2.5E-7);
      boolean boolean0 = lineAndShapeRenderer0.removeAnnotation(categoryPointerAnnotation0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot((ValueAxis) null);
      double[][] doubleArray0 = new double[6][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.getDomainAxis(combinedRangeCategoryPlot0, defaultIntervalCategoryDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = boxAndWhiskerRenderer0.getBaseToolTipGenerator();
  }
}