/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 03:50:10 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.gantt.SlidingGanttCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = boxAndWhiskerRenderer0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset0 = new DefaultMultiValueCategoryDataset();
      Range range0 = stackedBarRenderer3D0.findRangeBounds(defaultMultiValueCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(128.904803034472, 128.904803034472, true);
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator();
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.setSeriesURLGenerator((-1376), (CategoryURLGenerator) standardCategoryURLGenerator0, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator0 = new BoxAndWhiskerToolTipGenerator();
      groupedStackedBarRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) boxAndWhiskerToolTipGenerator0, true);
      CategoryToolTipGenerator categoryToolTipGenerator0 = groupedStackedBarRenderer0.getToolTipGenerator(643, 643, true);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      stackedBarRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      minMaxCategoryRenderer0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      ganttRenderer0.setPlot(categoryPlot0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryPlot categoryPlot0 = statisticalBarRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      Object object0 = stackedAreaRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Shape shape0 = statisticalBarRenderer0.lookupSeriesShape(1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      LegendItem legendItem0 = minMaxCategoryRenderer0.getLegendItem(1, 1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Range range0 = scatterRenderer0.findRangeBounds((CategoryDataset) null, true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      Range range0 = scatterRenderer0.findRangeBounds(defaultKeyedValues2DDataset0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = groupedStackedBarRenderer0.createState(plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      // Undeclared exception!
      try { 
        scatterRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemLabelGenerator();
      barRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", 1923.17613414, (-9.0));
      Layer layer0 = Layer.FOREGROUND;
      statisticalLineAndShapeRenderer0.addAnnotation((CategoryAnnotation) categoryPointerAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = groupedStackedBarRenderer0.getURLGenerator(0, 643, true);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setSeriesItemLabelGenerator(784, (CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator("", mockSimpleDateFormat0);
      boxAndWhiskerRenderer0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getItemLabelGenerator(3, 680, true);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompassPlot compassPlot0 = new CompassPlot();
      JFreeChart jFreeChart0 = new JFreeChart(compassPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1, 1, (ChartRenderingInfo) null);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      AreaRenderer areaRenderer0 = new AreaRenderer();
      Point2D.Double point2D_Double0 = new Point2D.Double();
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Double0, point2D_Double0);
      Rectangle2D rectangle2D0 = line2D_Double0.getBounds2D();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset(taskSeriesCollection0, 1, 1);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      // Undeclared exception!
      try { 
        areaRenderer0.initialise(graphics2D0, rectangle2D0, (CategoryPlot) null, slidingGanttCategoryDataset0, plotRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LineAndShapeRenderer lineAndShapeRenderer0 = new LineAndShapeRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = lineAndShapeRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      layeredBarRenderer0.setLegendItemToolTipGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getSeriesItemLabelGenerator(784);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      stackedBarRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D((-1005.94), 1944.2465091, true);
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator();
      stackedBarRenderer3D0.setBaseURLGenerator((CategoryURLGenerator) standardCategoryURLGenerator0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      CategoryURLGenerator categoryURLGenerator0 = ganttRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = groupedStackedBarRenderer0.getToolTipGenerator(643, 643, true);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      int int0 = ganttRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      int int0 = ganttRenderer0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot((ValueAxis) null);
      PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(2138.52855656272, 854.1821, 0.0, (-7.0));
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("ZOOM_DOMAIN_BOTH");
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.calculateBarW0((CategoryPlot) null, plotOrientation0, rectangle2D_Double0, extendedCategoryAxis0, (CategoryItemRendererState) null, 0, 200);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.BarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator("zdF=5m,C");
      stackedBarRenderer3D0.setLegendItemURLGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = layeredBarRenderer0.getLegendItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("' +/3#9{VG", scatterRenderer0.ZERO, 2351.7289520165);
      boolean boolean0 = scatterRenderer0.removeAnnotation(categoryTextAnnotation0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("H<Pr5\"[");
      NumberAxis numberAxis0 = new NumberAxis();
      CategoryPlot categoryPlot0 = new CategoryPlot((CategoryDataset) null, subCategoryAxis0, numberAxis0, layeredBarRenderer0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      CategoryAxis categoryAxis0 = layeredBarRenderer0.getDomainAxis(combinedRangeCategoryPlot0, (CategoryDataset) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = statisticalBarRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      // Undeclared exception!
      try { 
        scatterRenderer0.setSeriesItemLabelGenerator((-2872), (CategoryItemLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }
}