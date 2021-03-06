/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:22:37 GMT 2020
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.renderer.category.IntervalBarRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
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
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.category.SlidingCategoryDataset;
import org.jfree.data.gantt.GanttCategoryDataset;
import org.jfree.data.gantt.SlidingGanttCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Month;
import org.jfree.data.time.SerialDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCategoryItemRenderer_ESTest extends AbstractCategoryItemRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      RoundRectangle2D.Double roundRectangle2D_Double0 = new RoundRectangle2D.Double(0.2, 0.0, (double) levelRenderer0.ZERO, 827.4577455540552, 1017.2657, 0.0);
      Rectangle2D rectangle2D0 = roundRectangle2D_Double0.getBounds2D();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      BufferedImage bufferedImage0 = new BufferedImage(735, 10, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.initialise(graphics2D0, rectangle2D0, (CategoryPlot) null, jDBCCategoryDataset0, plotRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      CategoryToolTipGenerator categoryToolTipGenerator0 = stackedAreaRenderer0.getSeriesToolTipGenerator((-3159));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryPlot categoryPlot0 = levelRenderer0.getPlot();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedBarRenderer3D0.getLegendItemToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = stackedBarRenderer0.getLegendItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = barRenderer0.getBaseToolTipGenerator();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      defaultKeyedValues2DDataset0.addValue((Number) stackedAreaRenderer0.ZERO, (Comparable) stackedAreaRenderer0.ZERO, (Comparable) stackedAreaRenderer0.ZERO);
      Range range0 = stackedAreaRenderer0.findRangeBounds(defaultKeyedValues2DDataset0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator("");
      // Undeclared exception!
      try { 
        scatterRenderer0.setSeriesURLGenerator((-1998), (CategoryURLGenerator) standardCategoryURLGenerator0, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      // Undeclared exception!
      try { 
        lineRenderer3D0.setSeriesToolTipGenerator((-542), (CategoryToolTipGenerator) null, true);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.setSeriesItemLabelGenerator((-691), (CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, false);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      // Undeclared exception!
      try { 
        stackedBarRenderer3D0.getDomainAxis((CategoryPlot) null, (CategoryDataset) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      // Undeclared exception!
      try { 
        boxAndWhiskerRenderer0.getDomainAxis(combinedRangeCategoryPlot0, defaultCategoryDataset0);
      } catch(IllegalArgumentException e) {
         //
         // Negative 'index'.
         //
         verifyException("org.jfree.chart.plot.CategoryPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset((GanttCategoryDataset) null, (-374), (-374));
      // Undeclared exception!
      try { 
        defaultCategoryItemRenderer0.findRangeBounds(slidingGanttCategoryDataset0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.gantt.SlidingGanttCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AreaRenderer areaRenderer0 = new AreaRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Range range0 = areaRenderer0.findRangeBounds((CategoryDataset) defaultStatisticalCategoryDataset0, false);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(lineRenderer3D0.ZERO, 0.0, lineRenderer3D0.ZERO, (double) lineRenderer3D0.ZERO, lineRenderer3D0.DEFAULT_WALL_PAINT, lineRenderer3D0.DEFAULT_STROKE);
      Layer layer0 = Layer.FOREGROUND;
      lineRenderer3D0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      stackedAreaRenderer0.setBaseURLGenerator((CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setSeriesURLGenerator(593, (CategoryURLGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      DateFormat dateFormat0 = MockDateFormat.getDateInstance();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("", dateFormat0);
      stackedAreaRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) standardCategoryToolTipGenerator0, true);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      stackedBarRenderer3D0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, true);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IntervalBarRenderer intervalBarRenderer0 = new IntervalBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = intervalBarRenderer0.getItemLabelGenerator((-4461), 3167, false);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      RectangleInsets rectangleInsets0 = Axis.DEFAULT_AXIS_LABEL_INSETS;
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(dimension0);
      Rectangle2D rectangle2D0 = rectangleInsets0.createOutsetRectangle((Rectangle2D) rectangle0, true, true);
      // Undeclared exception!
      try { 
        lineRenderer3D0.addEntity(standardEntityCollection0, rectangle2D0, (CategoryDataset) null, 0, 0, true, 0, 4.0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      LegendItemCollection legendItemCollection0 = levelRenderer0.getLegendItems();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator();
      lineRenderer3D0.setLegendItemURLGenerator(standardCategorySeriesLabelGenerator0);
      Object object0 = lineRenderer3D0.clone();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
      Object object0 = minMaxCategoryRenderer0.clone();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      Month month0 = new Month();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
      barRenderer0.updateCrosshairValues((CategoryCrosshairState) null, month0, month0, (-1405), (-1405), 4.0, (-1403.560381), plotOrientation0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      CategoryCrosshairState categoryCrosshairState0 = new CategoryCrosshairState();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset(combinedRangeCategoryPlot0.ZERO);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
      // Undeclared exception!
      try { 
        statisticalLineAndShapeRenderer0.updateCrosshairValues(categoryCrosshairState0, 10, 10, 1.0F, 3552, 2566.693421089864, 239.15096, plotOrientation0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      Shape shape0 = waterfallBarRenderer0.lookupSeriesShape((-247));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      LegendItem legendItem0 = levelRenderer0.getLegendItem((-2280), (-2280));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      Number[][] numberArray0 = new Number[8][3];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      SlidingCategoryDataset slidingCategoryDataset0 = new SlidingCategoryDataset(defaultIntervalCategoryDataset0, 0, 0);
      Range range0 = statisticalLineAndShapeRenderer0.findRangeBounds(slidingCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      // Undeclared exception!
      try { 
        barRenderer0.setLegendItemLabelGenerator((CategorySeriesLabelGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'generator' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator0 = new StandardCategorySeriesLabelGenerator("Diego Pierangeli");
      boxAndWhiskerRenderer0.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      MockDate mockDate0 = new MockDate(0L);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      CategoryLineAnnotation categoryLineAnnotation0 = new CategoryLineAnnotation(0.2, 0.0, serialDate0, (-3886.3599), groupedStackedBarRenderer0.DEFAULT_OUTLINE_PAINT, groupedStackedBarRenderer0.DEFAULT_STROKE);
      Layer layer0 = Layer.BACKGROUND;
      groupedStackedBarRenderer0.addAnnotation((CategoryAnnotation) categoryLineAnnotation0, layer0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      // Undeclared exception!
      try { 
        barRenderer0.addAnnotation((CategoryAnnotation) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'annotation' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setSeriesURLGenerator(116, (CategoryURLGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = waterfallBarRenderer0.getURLGenerator((-1608), 81, false);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LineRenderer3D lineRenderer3D0 = new LineRenderer3D();
      lineRenderer3D0.setBaseToolTipGenerator((CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      ganttRenderer0.setSeriesToolTipGenerator(0, (CategoryToolTipGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CategoryToolTipGenerator categoryToolTipGenerator0 = boxAndWhiskerRenderer0.getToolTipGenerator((-832), 0, false);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      SpinnerNumberModel spinnerNumberModel0 = new SpinnerNumberModel();
      JSpinner jSpinner0 = new JSpinner(spinnerNumberModel0);
      JSpinner.NumberEditor jSpinner_NumberEditor0 = new JSpinner.NumberEditor(jSpinner0, "J!h*F{");
      DecimalFormat decimalFormat0 = jSpinner_NumberEditor0.getFormat();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator("J!h*F{", decimalFormat0);
      stackedBarRenderer3D0.setSeriesToolTipGenerator(1864, (CategoryToolTipGenerator) standardCategoryToolTipGenerator0, true);
      CategoryToolTipGenerator categoryToolTipGenerator0 = stackedBarRenderer3D0.getToolTipGenerator(1864, 1864, false);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LevelRenderer levelRenderer0 = new LevelRenderer();
      levelRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null, false);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      groupedStackedBarRenderer0.setSeriesItemLabelGenerator(0, (CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0, false);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      WaterfallBarRenderer waterfallBarRenderer0 = new WaterfallBarRenderer();
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      waterfallBarRenderer0.drawItemLabel((Graphics2D) null, plotOrientation0, taskSeriesCollection0, 274, (-2280), false, 1966.9232145323901, 274, false);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      // Undeclared exception!
      try { 
        groupedStackedBarRenderer0.setPlot((CategoryPlot) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      CategoryPlot categoryPlot0 = new CategoryPlot();
      stackedBarRenderer3D0.setPlot(categoryPlot0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      CategoryURLGenerator categoryURLGenerator0 = stackedAreaRenderer0.getSeriesURLGenerator((-970));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = stackedBarRenderer0.getBaseItemLabelGenerator();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      barRenderer0.setBaseItemLabelGenerator((CategoryItemLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(false, false);
      statisticalLineAndShapeRenderer0.setLegendItemToolTipGenerator((CategorySeriesLabelGenerator) null);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      int int0 = scatterRenderer0.getRowCount();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      // Undeclared exception!
      try { 
        stackedAreaRenderer0.setSeriesToolTipGenerator((-1), (CategoryToolTipGenerator) null);
      } catch(IllegalArgumentException e) {
         //
         // Requires index >= 0.
         //
         verifyException("org.jfree.chart.util.AbstractObjectList", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      StandardCategoryToolTipGenerator standardCategoryToolTipGenerator0 = new StandardCategoryToolTipGenerator();
      scatterRenderer0.setBaseToolTipGenerator((CategoryToolTipGenerator) standardCategoryToolTipGenerator0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      CategoryItemLabelGenerator categoryItemLabelGenerator0 = defaultCategoryItemRenderer0.getSeriesItemLabelGenerator((-1));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      CategorySeriesLabelGenerator categorySeriesLabelGenerator0 = categoryStepRenderer0.getLegendItemURLGenerator();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(true);
      stackedBarRenderer3D0.removeAnnotations();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      groupedStackedBarRenderer0.setBaseURLGenerator((CategoryURLGenerator) null);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      CategoryURLGenerator categoryURLGenerator0 = groupedStackedBarRenderer0.getBaseURLGenerator();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StackedBarRenderer stackedBarRenderer0 = new StackedBarRenderer(false);
      int int0 = stackedBarRenderer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ScatterRenderer scatterRenderer0 = new ScatterRenderer();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      AxisLocation axisLocation0 = AxisLocation.TOP_OR_LEFT;
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      RectangleEdge rectangleEdge0 = Plot.resolveDomainAxisLocation(axisLocation0, plotOrientation0);
      // Undeclared exception!
      try { 
        scatterRenderer0.getItemMiddle(fixedMillisecond0, fixedMillisecond0, defaultStatisticalCategoryDataset0, categoryAxis0, (Rectangle2D) null, rectangleEdge0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid category index: -1
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      int int0 = stackedBarRenderer3D0.getPassCount();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      int int0 = boxAndWhiskerRenderer0.getColumnCount();
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(0.0, 0.0);
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("V]H9Ky($OANzH\"", 12.0, (-27.4138749));
      boolean boolean0 = stackedBarRenderer3D0.removeAnnotation(categoryTextAnnotation0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SlidingGanttCategoryDataset slidingGanttCategoryDataset0 = new SlidingGanttCategoryDataset(taskSeriesCollection0, 9, 5);
      Range range0 = categoryStepRenderer0.findRangeBounds(slidingGanttCategoryDataset0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      BarRenderer barRenderer0 = new BarRenderer();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Line2D.Double line2D_Double0 = new Line2D.Double(2172.43738496, (-2137.7842470000305), 1.0F, 7.2E7);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = statisticalBarRenderer0.createState(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        barRenderer0.calculateBarWidth((CategoryPlot) null, rectangle0, defaultStatisticalCategoryDataset0, categoryItemRendererState0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer(true, false);
      CategoryTextAnnotation categoryTextAnnotation0 = new CategoryTextAnnotation("", "", 263.2747);
      statisticalLineAndShapeRenderer0.addAnnotation((CategoryAnnotation) categoryTextAnnotation0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer0 = new StatisticalLineAndShapeRenderer();
      IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator0 = new IntervalCategoryItemLabelGenerator();
      statisticalLineAndShapeRenderer0.setSeriesItemLabelGenerator(1, (CategoryItemLabelGenerator) intervalCategoryItemLabelGenerator0);
  }
}
