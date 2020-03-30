/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 06:52:13 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.IntervalBarRenderer;
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
import org.jfree.chart.urls.CustomCategoryURLGenerator;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      LegendItem legendItem0 = stackedBarRenderer0.getLegendItem((-490), (-788));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      boolean boolean0 = groupedStackedBarRenderer0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      Object object0 = lineAndShapeRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PiePlot piePlot0 = new PiePlot();
      Paint paint0 = piePlot0.getShadowPaint();
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(paint0, piePlot0.DEFAULT_LABEL_SHADOW_PAINT, piePlot0.DEFAULT_BACKGROUND_PAINT, piePlot0.DEFAULT_BACKGROUND_PAINT);
      // Undeclared exception!
      try { 
        waterfallBarRenderer0.setSeriesURLGenerator((-138), (CategoryURLGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      // Undeclared exception!
      try { 
        levelRenderer0.getRangeAxis((CategoryPlot) null, 10);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        ganttRenderer0.getDomainAxis((CategoryPlot) null, defaultCategoryDataset0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      double[][] doubleArray0 = new double[6][7];
      double[] doubleArray1 = new double[6];
      doubleArray0[1] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        levelRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0, false);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.jfree.data.category.DefaultIntervalCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      CategoryMarker categoryMarker0 = new CategoryMarker(lineRenderer3D0.ZERO, categoryPlot0.DEFAULT_CROSSHAIR_PAINT, lineRenderer3D0.DEFAULT_STROKE);
      DefaultCaret defaultCaret0 = new DefaultCaret();
      // Undeclared exception!
      try { 
        lineRenderer3D0.drawDomainMarker((Graphics2D) null, categoryPlot0, (CategoryAxis) null, categoryMarker0, defaultCaret0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer0.addEntity((EntityCollection) null, waterfallBarRenderer0.DEFAULT_SHAPE, (CategoryDataset) null, (-1519), (-1519), true, 4624.18, (-3035.4958));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      DrawingSupplier drawingSupplier0 = groupedStackedBarRenderer0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CustomCategoryURLGenerator customCategoryURLGenerator0 = new CustomCategoryURLGenerator();
      boxAndWhiskerRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) customCategoryURLGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = statisticalBarRenderer0.getURLGenerator(0, (-2845), false);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      intervalBarRenderer0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) standardCategoryToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = defaultCategoryItemRenderer0.getToolTipGenerator(25, 25, false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, true);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      lineAndShapeRenderer0.setPlot(combinedRangeCategoryPlot0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = waterfallBarRenderer0.getSeriesToolTipGenerator((-1012));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      LegendItemCollection legendItemCollection0 = boxAndWhiskerRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ValueAxis valueAxis0 = boxAndWhiskerRenderer0.getRangeAxis(combinedDomainCategoryPlot0, 25);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((Number) stackedAreaRenderer0.ZERO);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
      RectangleAnchor rectangleAnchor0 = RectangleAnchor.TOP_LEFT;
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.calculateRangeMarkerTextAnchorPoint((Graphics2D) null, plotOrientation0, (Rectangle2D) null, (Rectangle2D) null, thermometerPlot0.DEFAULT_INSETS, (LengthAdjustmentType) null, rectangleAnchor0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'base' argument.
         //
         verifyException("org.jfree.chart.util.RectangleInsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      double[][] doubleArray0 = new double[6][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      Range range0 = levelRenderer0.findRangeBounds((CategoryDataset) defaultIntervalCategoryDataset0, false);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      defaultCategoryItemRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance();
      StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator0 = new StandardCategoryItemLabelGenerator("", numberFormat0, numberFormat0);
      waterfallBarRenderer0.setSeriesItemLabelGenerator(242, (CategoryItemLabelGenerator) standardCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = stackedBarRenderer0.getItemLabelGenerator(3, 3, false);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Color color0 = (Color)boxAndWhiskerRenderer0.getArtifactPaint();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      JFreeChart jFreeChart0 = new JFreeChart("f+(Au96", spiderWebPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 3.0, 3.0, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImageRenderingSource0.createGraphics2D();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, (-400), 2142, (-1391), 0, 0, 795, true, true, false, true, true, true, false);
      LineBorder lineBorder0 = new LineBorder(color0);
      Rectangle rectangle0 = AbstractBorder.getInteriorRectangle((Component) chartPanel0, (Border) lineBorder0, 1024, 0, 1630, 2243);
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)chartPanel0.scale(rectangle0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.initialise(sunGraphics2D0, rectangle2D_Double0, (CategoryPlot) null, (CategoryDataset) null, plotRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CustomCategoryURLGenerator customCategoryURLGenerator0 = new CustomCategoryURLGenerator();
      stackedAreaRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) customCategoryURLGenerator0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = waterfallBarRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryURLGenerator categoryURLGenerator0 = levelRenderer0.getSeriesURLGenerator(365);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = groupedStackedBarRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      minMaxCategoryRenderer0.setLegendItemToolTipGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setSeriesToolTipGenerator(135, (CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer(false, true);
      Locale locale0 = new Locale("", "", "");
      DateFormat dateFormat0 = DateFormat.getTimeInstance(0, locale0);
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator("", dateFormat0);
      lineAndShapeRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) intervalCategoryToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      // Undeclared exception!
      try { 
        defaultCategoryItemRenderer0.drawBackground((Graphics2D) null, combinedDomainCategoryPlot0, rectangle2D_Double0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.Plot", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      stackedBarRenderer0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = groupedStackedBarRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      // Undeclared exception!
      try { 
        lineAndShapeRenderer0.addEntity(standardEntityCollection0, categoryStepRenderer_State0.line, defaultBoxAndWhiskerCategoryDataset0, 0, (-607), false, 0.0, (-607));
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      int int0 = scatterRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategoryPlot categoryPlot0 = statisticalLineAndShapeRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator("Null 'plot' argument.");
      stackedBarRenderer0.setLegendItemURLGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(1669.401721, 1669.401721, false);
      boolean boolean0 = stackedBarRenderer3D0.removeAnnotation((CategoryAnnotation) null);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      NumberAxis numberAxis0 = new NumberAxis("lW~>T@Z`S`e|</<\"1>:");
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultCategoryDataset0, (CategoryAxis) null, numberAxis0, levelRenderer0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("+p@8&~'%5R:0CncE@Lk");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(extendedCategoryAxis0);
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.getDomainAxis(combinedDomainCategoryPlot0, defaultBoxAndWhiskerCategoryDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = stackedAreaRenderer0.getBaseToolTipGenerator();
  }
}
