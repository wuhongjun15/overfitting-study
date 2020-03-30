/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:07:25 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Paint;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.CustomCategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = lineAndShapeRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      LegendItem legendItem0 = stackedBarRenderer0.getLegendItem(2062, (-3314));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D((-208.959789), 920.0);
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      Range range0 = barRenderer3D0.findRangeBounds((CategoryDataset) defaultMultiValueCategoryDataset0, false);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      CustomCategoryURLGenerator customCategoryURLGenerator0 = new CustomCategoryURLGenerator();
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.setSeriesURLGenerator((-1573), (CategoryURLGenerator) customCategoryURLGenerator0, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, false);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      Line2D.Float line2D_Float0 = new Line2D.Float();
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      double[][] doubleArray0 = new double[6][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.addEntity(standardEntityCollection0, rectangle2D0, defaultIntervalCategoryDataset0, 18, 18, false, 5000000.0, 3831.82263797);
      } catch(IllegalArgumentException e) {
         //
         // The 'row' argument is out of bounds.
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(true);
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator();
      categoryStepRenderer0.setBaseURLGenerator((CategoryURLGenerator) standardCategoryURLGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getURLGenerator(0, 360, false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, false);
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      statisticalLineAndShapeRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) standardCategoryToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getSeriesToolTipGenerator(3);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategoryPlot categoryPlot0 = defaultCategoryItemRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      LegendItemCollection legendItemCollection0 = stackedAreaRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      Object object0 = stackedBarRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      DrawingSupplier drawingSupplier0 = scatterRenderer0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      double[][] doubleArray0 = new double[6][8];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = statisticalBarRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategoryItemRendererState categoryItemRendererState0 = groupedStackedBarRenderer0.createState((PlotRenderingInfo) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator("-Kk<K*7 O~");
      stackedAreaRenderer0.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("org.jfree.chart.event.TitleChangeListener", ganttRenderer0.ZERO, 1.0, 1.0);
      Layer layer0 = Layer.FOREGROUND;
      ganttRenderer0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      DecimalFormat decimalFormat0 = new DecimalFormat("");
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator("%yr+#k9Q_H", decimalFormat0);
      defaultCategoryItemRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Locale locale0 = new Locale("");
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance(locale0);
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("Not implemented.", numberFormat0);
      scatterRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = ganttRenderer0.getItemLabelGenerator((-389), 12, false);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      CategoryAxis categoryAxis0 = new CategoryAxis("org.jfree.chart.event.TitleChangeListener");
      LogAxis logAxis0 = new LogAxis("org.jfree.chart.event.TitleChangeListener");
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultKeyedValues2DDataset0, categoryAxis0, logAxis0, ganttRenderer0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      statisticalLineAndShapeRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = levelRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = spiderWebPlot0.getLabelGenerator();
      scatterRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("5z O");
      Paint paint0 = periodAxis0.getMinorTickMarkPaint();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(paint0, periodAxis0.DEFAULT_AXIS_LINE_PAINT, periodAxis0.DEFAULT_TICK_MARK_PAINT, paint0);
      waterfallBarRenderer0.setLegendItemToolTipGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator();
      // Undeclared exception!
      try { 
        categoryStepRenderer0.setSeriesToolTipGenerator((-110), (CategoryToolTipGenerator) intervalCategoryToolTipGenerator0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      boxAndWhiskerRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Color color0 = Color.BLACK;
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(color0, color0, statisticalBarRenderer0.DEFAULT_OUTLINE_PAINT, statisticalBarRenderer0.DEFAULT_OUTLINE_PAINT);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = waterfallBarRenderer0.getSeriesItemLabelGenerator(215);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedAreaRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      stackedBarRenderer3D0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator("!+{Ap8`R&x'+U\"me.");
      boxAndWhiskerRenderer0.setBaseURLGenerator((CategoryURLGenerator) standardCategoryURLGenerator0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      // Undeclared exception!
      try { 
        stackedBarRenderer0.addEntity(standardEntityCollection0, categoryStepRenderer0.DEFAULT_SHAPE, (CategoryDataset) null, (-539), (-1133), true, (double) categoryStepRenderer0.ZERO, (-975.730305));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      int int0 = scatterRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      int int0 = boxAndWhiskerRenderer0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      int int0 = stackedBarRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator();
      boxAndWhiskerRenderer0.setLegendItemURLGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("AHPT*S4s@B2|D7A", 0.2, (double) levelRenderer0.ZERO);
      boolean boolean0 = levelRenderer0.removeAnnotation(categoryTextAnnotation0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      // Undeclared exception!
      try { 
        ganttRenderer0.setSeriesItemLabelGenerator((-1955), (CategoryItemLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }
}