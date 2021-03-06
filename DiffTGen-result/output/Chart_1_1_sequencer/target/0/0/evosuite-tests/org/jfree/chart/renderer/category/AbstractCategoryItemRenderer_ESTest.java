/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:11:32 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Paint;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JSpinner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.CustomCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 0.0);
      CategoryPlot categoryPlot0 = stackedBarRenderer3D0.getPlot();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = lineAndShapeRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      CustomCategoryURLGenerator customCategoryURLGenerator0 = new CustomCategoryURLGenerator();
      boolean boolean0 = statisticalLineAndShapeRenderer0.equals(customCategoryURLGenerator0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      // Undeclared exception!
      try { 
        levelRenderer0.setSeriesToolTipGenerator((-1), (CategoryToolTipGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("", numberFormat0, numberFormat0);
      // Undeclared exception!
      try { 
        barRenderer0.setSeriesItemLabelGenerator((-1), (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      Object object0 = levelRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalLineAndShapeRenderer0.getSeriesToolTipGenerator(789);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
      barRenderer0.updateCrosshairValues((CategoryCrosshairState) null, 0.2, 0.2, 0.0, 978, 0.0, 2747.41239251105, plotOrientation0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      Paint paint0 = categoryStepRenderer0.lookupSeriesPaint(2599);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(2599, 5);
      String[] stringArray0 = new String[4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, (Number[][]) null, (Number[][]) null);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0, false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("5(0!(~P\"U", "5(0!(~P\"U", 2.0);
      Layer layer0 = Layer.BACKGROUND;
      statisticalLineAndShapeRenderer0.addAnnotation((CategoryAnnotation) categoryTextAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("ShzOQ*cF+Wrt", 3.0, 8.0);
      Layer layer0 = Layer.FOREGROUND;
      lineRenderer3D0.addAnnotation((CategoryAnnotation) categoryTextAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      categoryStepRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getURLGenerator(244, 0, false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      barRenderer0.setSeriesToolTipGenerator(762, (CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      scatterRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      JSpinner jSpinner0 = new JSpinner();
      JSpinner.NumberEditor jSpinner_NumberEditor0 = new JSpinner.NumberEditor(jSpinner0);
      DecimalFormat decimalFormat0 = jSpinner_NumberEditor0.getFormat();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("", decimalFormat0, decimalFormat0);
      lineRenderer3D0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = barRenderer0.getItemLabelGenerator(2605, 2605, true);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      DateAxis dateAxis0 = new DateAxis();
      CategoryPlot categoryPlot0 = new CategoryPlot((CategoryDataset) null, (CategoryAxis) null, dateAxis0, levelRenderer0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = scatterRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      CategoryURLGenerator categoryURLGenerator0 = stackedBarRenderer0.getSeriesURLGenerator(5);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = waterfallBarRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setLegendItemToolTipGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setSeriesToolTipGenerator(3, (CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Locale locale0 = new Locale(" %HA[lW", "", "Null 'annotation' argument.");
      DateFormat dateFormat0 = DateFormat.getDateTimeInstance(0, 0, locale0);
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("ItemLabelGenerator not cloneable.", dateFormat0);
      scatterRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) standardCategoryToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = layeredBarRenderer0.getSeriesItemLabelGenerator((-3067));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      stackedAreaRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getToolTipGenerator(3, 0, false);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      int int0 = categoryStepRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      int int0 = scatterRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      Range range0 = lineRenderer3D0.findRangeBounds((CategoryDataset) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(true, true);
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.getDomainAxis((CategoryPlot) null, defaultBoxAndWhiskerCategoryDataset0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      // Undeclared exception!
      try { 
        ganttRenderer0.setSeriesItemLabelGenerator((-345), (CategoryItemLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }
}
