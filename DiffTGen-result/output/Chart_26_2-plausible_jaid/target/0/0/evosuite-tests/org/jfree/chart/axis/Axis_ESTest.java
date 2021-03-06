/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:39:59 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.TimeZone;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.JTableHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.ValueDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.RegularTimePeriod;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("30Rm`6rlbt?1.es;");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(logarithmicAxis0);
      Color color0 = Color.YELLOW;
      combinedDomainXYPlot0.setDomainAxis(500, (ValueAxis) logarithmicAxis0);
      logarithmicAxis0.setAxisLinePaint(color0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(numberAxis0);
      numberAxis0.notifyListeners(axisChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("lbZw)6qIS$2O9ruY~l");
      Paint paint0 = subCategoryAxis0.getTickLabelPaint((Comparable) "lbZw)6qIS$2O9ruY~l");
      boolean boolean0 = subCategoryAxis0.equals(paint0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      categoryAxis0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("j EnS\"W(St4?/");
      double double0 = periodAxis0.getLabelAngle();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateAxis dateAxis0 = new DateAxis("-:|qS!OpAb", timeZone0);
      Stroke stroke0 = dateAxis0.getTickMarkStroke();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      float float0 = subCategoryAxis0.getTickMarkOutsideLength();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      categoryAxis3D0.setAxisLineVisible(true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2000000.0);
      Paint paint0 = cyclicNumberAxis0.getTickMarkPaint();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("T)E/KV<(D<");
      boolean boolean0 = subCategoryAxis0.isTickMarksVisible();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2.0, 2418.952686585);
      Font font0 = cyclicNumberAxis0.getTickLabelFont();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.25, 0.0, "W G2B+5ct3'Y");
      Stroke stroke0 = cyclicNumberAxis0.getAxisLineStroke();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("o]y'0P");
      Plot plot0 = logarithmicAxis0.getPlot();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(10.0);
      double double0 = cyclicNumberAxis0.getFixedDimension();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2000000.0);
      RectangleInsets rectangleInsets0 = cyclicNumberAxis0.getLabelInsets();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(10.0);
      Paint paint0 = cyclicNumberAxis0.getLabelPaint();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("},m\tdI8X~7AP&M");
      String string0 = categoryAxis3D0.getLabel();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("v28f9;5\"]:s");
      extendedCategoryAxis0.setPlot((Plot) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultBoxAndWhiskerCategoryDataset0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 582, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(dimension0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        subCategoryAxis0.draw(graphics2D0, 0.0F, rectangle0, rectangle0, (RectangleEdge) null, plotRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.geom.Path2D$Float", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("org.jfree.data.xy.AbstractXYDataset");
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTableHeader jTableHeader0 = new JTableHeader(defaultTableColumnModel0);
      boolean boolean0 = logarithmicAxis0.hasListener(jTableHeader0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("A36b}q@2d,q");
      extendedCategoryAxis0.setTickMarkPaint(categoryAxis3D0.DEFAULT_AXIS_LABEL_PAINT);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("2zJj '\"]26D");
      subCategoryAxis0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      valueAxis0.setTickLabelInsets(thermometerPlot0.DEFAULT_INSETS);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      // Undeclared exception!
      try { 
        logarithmicAxis0.setTickLabelInsets((RectangleInsets) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'insets' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      DateAxis dateAxis0 = new DateAxis("wa", zoneInfo0);
      cyclicNumberAxis0.setTickLabelInsets(dateAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      subCategoryAxis0.setTickLabelPaint(logarithmicAxis0.DEFAULT_AXIS_LABEL_PAINT);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("},m\tdI8X~7AP&M");
      ThermometerPlot thermometerPlot0 = new ThermometerPlot((ValueDataset) null);
      Font font0 = thermometerPlot0.getValueFont();
      categoryAxis3D0.setTickLabelFont(font0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("/qi3JQ7U>Pv!aJahS");
      // Undeclared exception!
      try { 
        numberAxis3D0.setTickLabelFont((Font) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("},m\tdI8X~7AP&M");
      categoryAxis3D0.setTickLabelFont(categoryAxis3D0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      PeriodAxis periodAxis0 = new PeriodAxis("", fixedMillisecond0, fixedMillisecond0, fixedMillisecond0.DEFAULT_TIME_ZONE);
      periodAxis0.setTickLabelsVisible(true);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("@krH. byJ^bKcH");
      // Undeclared exception!
      try { 
        categoryAxis0.setAxisLineStroke((Stroke) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("SansSerif");
      extendedCategoryAxis0.setAxisLineStroke(subCategoryAxis0.DEFAULT_TICK_MARK_STROKE);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      // Undeclared exception!
      try { 
        extendedCategoryAxis0.setLabelPaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(10, 1.0F);
      extendedCategoryAxis0.setLabelFont(cyclicNumberAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      extendedCategoryAxis0.setVisible(false);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("5");
      extendedCategoryAxis0.setTickMarkInsideLength(445.5F);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      CategoryPlot categoryPlot0 = new CategoryPlot();
      extendedCategoryAxis0.removeChangeListener(categoryPlot0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("y$");
      String string0 = subCategoryAxis0.getLabelURL();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("Null 'font' argument.");
      periodAxis0.setLabelToolTip("");
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(10.0);
      cyclicNumberAxis0.setTickMarkOutsideLength(2.0F);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      Object object0 = subCategoryAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      JFreeChart jFreeChart0 = new JFreeChart(fastScatterPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 53, (double) 1.0F, (double) 0.0F, chartRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      RectangleInsets rectangleInsets0 = numberAxis0.getTickLabelInsets();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      Paint paint0 = subCategoryAxis0.getAxisLinePaint();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.25, 0.0, "W G2B+5ct3'Y");
      float float0 = cyclicNumberAxis0.getTickMarkInsideLength();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("");
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      AxisSpace axisSpace0 = new AxisSpace();
      AxisSpace axisSpace1 = numberAxis0.reserveSpace(graphics2D0, multiplePiePlot0, (Rectangle2D) null, (RectangleEdge) null, axisSpace0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("o]y'0P");
      Font font0 = logarithmicAxis0.getLabelFont();
  }
}
