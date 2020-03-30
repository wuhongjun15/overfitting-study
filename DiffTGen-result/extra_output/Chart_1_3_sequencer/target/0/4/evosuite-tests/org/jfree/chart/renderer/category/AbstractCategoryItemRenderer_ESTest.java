/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 06:22:12 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.renderer.category.WaterfallBarRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CategoryPlot categoryPlot0 = layeredBarRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot((CategoryAxis) null);
      ValueAxis valueAxis0 = levelRenderer0.getRangeAxis(combinedDomainCategoryPlot0, 999);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      Object object0 = scatterRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JTableHeader jTableHeader0 = new JTableHeader();
      Rectangle rectangle0 = jTableHeader0.getHeaderRect(4762);
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      CategoryMarker categoryMarker0 = new CategoryMarker((Comparable) null);
      lineRenderer3D0.drawRangeMarker((Graphics2D) null, combinedDomainCategoryPlot0, numberAxis3D0, categoryMarker0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      // Undeclared exception!
      try { 
        lineRenderer3D0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      CategoryURLGenerator categoryURLGenerator0 = scatterRenderer0.getURLGenerator(0, 0, false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      groupedStackedBarRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) standardCategoryToolTipGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = waterfallBarRenderer0.getToolTipGenerator(366, 0, true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      layeredBarRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.windowText;
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer(systemColor0, systemColor0, systemColor0, systemColor0);
      waterfallBarRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getItemLabelGenerator(0, 0, false);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot((CategoryDataset) null, tableOrder0);
      JFreeChart jFreeChart0 = new JFreeChart(spiderWebPlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, (double) 1.0F, 90.0, chartRenderingInfo0);
      BufferedImageRenderingSource bufferedImageRenderingSource0 = new BufferedImageRenderingSource(bufferedImage0);
      Graphics2D graphics2D0 = bufferedImageRenderingSource0.createGraphics2D();
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 993.0901);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      double[][] doubleArray0 = new double[0][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.initialise(graphics2D0, rectangle2D_Double0, (CategoryPlot) null, defaultIntervalCategoryDataset0, plotRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Too many elements");
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultBoxAndWhiskerCategoryDataset0, categoryAxis3D0, numberAxis3D0, statisticalBarRenderer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = layeredBarRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator();
      barRenderer3D0.setLegendItemToolTipGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      stackedAreaRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = statisticalBarRenderer0.getSeriesItemLabelGenerator(0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = statisticalBarRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      scatterRenderer0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator();
      statisticalBarRenderer0.setBaseURLGenerator((CategoryURLGenerator) standardCategoryURLGenerator0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LayeredBarRenderer layeredBarRenderer0 = new LayeredBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = layeredBarRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      CategoryToolTipGenerator categoryToolTipGenerator0 = stackedBarRenderer3D0.getSeriesToolTipGenerator(3);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Object[][] objectArray0 = new Object[4][2];
      Object[] objectArray1 = new Object[3];
      objectArray1[0] = (Object) stackedAreaRenderer0;
      JTable jTable0 = null;
      try {
        jTable0 = new JTable(objectArray0, objectArray1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.JTable$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BarRenderer3D barRenderer3D0 = new BarRenderer3D((-420.5484), 0.0);
      DrawingSupplier drawingSupplier0 = barRenderer3D0.getDrawingSupplier();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      stackedBarRenderer0.setLegendItemURLGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedBarRenderer3D0.getLegendItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(true);
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("", 0.2, (double) defaultCategoryItemRenderer0.ZERO);
      boolean boolean0 = stackedBarRenderer0.removeAnnotation(categoryTextAnnotation0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      // Undeclared exception!
      try { 
        defaultCategoryItemRenderer0.getDomainAxis((CategoryPlot) null, defaultBoxAndWhiskerCategoryDataset0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator0 = new IntervalCategoryToolTipGenerator();
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.setSeriesToolTipGenerator((-310), (CategoryToolTipGenerator) intervalCategoryToolTipGenerator0);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }
}
