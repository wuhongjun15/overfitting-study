/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 13:43:44 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.AxisState;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.text.TextFragment;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-180.0), 2228.602);
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(cyclicNumberAxis0);
      cyclicNumberAxis0.notifyListeners(axisChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis(")8lp");
      periodAxis0.configure();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      RectangleEdge rectangleEdge0 = combinedDomainCategoryPlot0.getRangeAxisEdge();
      Rectangle2D rectangle2D0 = categoryAxis0.getLabelEnclosure((Graphics2D) null, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D(":");
      String string0 = categoryAxis3D0.getLabel();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset(1981.8986445);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2.5E-7);
      Paint paint0 = cyclicNumberAxis0.getAxisLinePaint();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SymbolAxis symbolAxis0 = new SymbolAxis("Null 'font' argument.", stringArray0);
      boolean boolean0 = symbolAxis0.isVisible();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      RectangleInsets rectangleInsets0 = categoryAxis3D0.getTickLabelInsets();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      Stroke stroke0 = dateAxis0.getTickMarkStroke();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2055.060858, "b*@uS%_dGF");
      float float0 = cyclicNumberAxis0.getTickMarkOutsideLength();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D((String) null);
      numberAxis3D0.setAxisLineVisible(false);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      float float0 = numberAxis0.getTickMarkInsideLength();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      Paint paint0 = categoryAxis0.getTickMarkPaint();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("q 9T=e!7$Ex");
      Font font0 = periodAxis0.getTickLabelFont();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2.5E-7);
      Font font0 = cyclicNumberAxis0.getLabelFont();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "1Nkq");
      Plot plot0 = cyclicNumberAxis0.getPlot();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      Paint paint0 = categoryAxis3D0.getTickLabelPaint();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("9 }^f");
      periodAxis0.addChangeListener((AxisChangeListener) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("org.jfree.data.Range");
      double double0 = dateAxis0.getFixedDimension();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0);
      RectangleInsets rectangleInsets0 = cyclicNumberAxis0.getLabelInsets();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-180.0), 2228.602);
      String string0 = cyclicNumberAxis0.getLabel();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(4);
      DateAxis dateAxis0 = new DateAxis((String) null, fixedMillisecond0.DEFAULT_TIME_ZONE);
      boolean boolean0 = dateAxis0.isAxisLineVisible();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      PiePlot piePlot0 = new PiePlot();
      categoryAxis3D0.setPlot(piePlot0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("* J]vU|zR");
      SubCategoryAxis subCategoryAxis1 = new SubCategoryAxis((String) null);
      boolean boolean0 = subCategoryAxis0.equals(subCategoryAxis1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Point2D point2D0 = combinedDomainXYPlot0.getQuadrantOrigin();
      Line2D.Float line2D_Float0 = new Line2D.Float(point2D0, point2D0);
      Rectangle2D rectangle2D0 = line2D_Float0.getBounds2D();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      RectangleEdge rectangleEdge0 = categoryPlot0.getRangeAxisEdge(10);
      // Undeclared exception!
      try { 
        categoryAxis0.drawAxisLine((Graphics2D) null, (-1.0), rectangle2D0, rectangleEdge0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 12, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getDomainAxisEdge((-1438));
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        subCategoryAxis0.draw(graphics2D0, 1.0F, (Rectangle2D) null, (Rectangle2D) null, rectangleEdge0, plotRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "");
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle rectangle0 = new Rectangle(1110, 213, 1312, 1312);
      DateAxis dateAxis0 = new DateAxis();
      AxisSpace axisSpace0 = dateAxis0.reserveSpace(graphics2D0, multiplePiePlot0, rectangle0, (RectangleEdge) null, (AxisSpace) null);
      AxisSpace axisSpace1 = cyclicNumberAxis0.reserveSpace(graphics2D0, multiplePiePlot0, rectangle0, (RectangleEdge) null, axisSpace0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((double) 2.0F);
      MeterPlot meterPlot0 = new MeterPlot(defaultValueDataset0);
      boolean boolean0 = categoryAxis0.hasListener(meterPlot0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("ItemLabelAnchor.CENTER");
      // Undeclared exception!
      try { 
        extendedCategoryAxis0.setTickMarkPaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1002.4595798098894);
      Color color0 = Color.LIGHT_GRAY;
      cyclicNumberAxis0.setTickMarkPaint(color0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Lfv0.vP_R,j");
      BasicStroke basicStroke0 = (BasicStroke)CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
      subCategoryAxis0.setTickMarkStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2.5E11);
      ModuloAxis moduloAxis0 = new ModuloAxis((String) null, cyclicNumberAxis0.DEFAULT_RANGE);
      moduloAxis0.setTickMarkStroke(cyclicNumberAxis0.DEFAULT_TICK_MARK_STROKE);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      numberAxis0.setTickLabelInsets(numberAxis0.DEFAULT_AXIS_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0F, 0.0, "CpeRpGdE7<()");
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      PolarPlot polarPlot0 = new PolarPlot(timeSeriesCollection0, cyclicNumberAxis0, defaultPolarItemRenderer0);
      Paint paint0 = polarPlot0.getAngleGridlinePaint();
      categoryAxis3D0.setTickLabelPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      Font font0 = TextFragment.DEFAULT_FONT;
      categoryAxis0.setTickLabelFont(font0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Null 'paint' argument.");
      numberAxis3D0.setTickLabelFont(numberAxis3D0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setTickLabelsVisible(false);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "oh");
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("oh");
      subCategoryAxis0.setAxisLineStroke(cyclicNumberAxis0.DEFAULT_AXIS_LINE_STROKE);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getTextSelectionColor();
      GradientPaint gradientPaint0 = new GradientPaint(0.0F, 2.0F, color0, 3731.947F, 2.0F, color0);
      categoryAxis3D0.setAxisLinePaint(gradientPaint0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Range range0 = ValueAxis.DEFAULT_RANGE;
      ModuloAxis moduloAxis0 = new ModuloAxis("Null 'state' argument.", range0);
      moduloAxis0.setLabelInsets(moduloAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.setLabelInsets(dateAxis0.DEFAULT_AXIS_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("org.jfree.chart.urls.CustomXYURLGenerator");
      TimeZone timeZone0 = TimeZone.getDefault();
      DateAxis dateAxis0 = new DateAxis("org.jfree.chart.urls.CustomXYURLGenerator", timeZone0);
      dateAxis0.setLabelPaint(categoryAxis0.DEFAULT_TICK_LABEL_PAINT);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      PeriodAxis periodAxis0 = new PeriodAxis("", fixedMillisecond0, fixedMillisecond0);
      periodAxis0.setLabelFont(periodAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("");
      dateAxis0.setVisible(false);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("q 9T=e!7$Ex");
      periodAxis0.setTickMarkInsideLength(1.0F);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("iI~zp  ");
      String string0 = subCategoryAxis0.getLabelToolTip();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "oh");
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((double) 2.0F);
      MeterPlot meterPlot0 = new MeterPlot(defaultValueDataset0);
      cyclicNumberAxis0.removeChangeListener(meterPlot0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L, 0L);
      Date date0 = Date.from(instant0);
      ZoneInfo zoneInfo0 = (ZoneInfo)SegmentedTimeline.DEFAULT_TIME_ZONE;
      Hour hour0 = new Hour(date0, zoneInfo0);
      Year year0 = new Year(date0);
      PeriodAxis periodAxis0 = new PeriodAxis("Null 'paint' argument.", hour0, year0);
      String string0 = periodAxis0.getLabelURL();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String[] stringArray0 = new String[5];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      symbolAxis0.setLabelToolTip("oh");
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("SO|pS~NH'\"V(_ox");
      extendedCategoryAxis0.setLabelAngle(1575.065342916157);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("org.jfree.chart.urls.CustomXYURLGenerator");
      Paint paint0 = categoryAxis0.getLabelPaint();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("org.jfree.chart.axis.Axis");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      JFreeChart jFreeChart0 = new JFreeChart(combinedDomainCategoryPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 46, 10, 2908, 46, 2908, 46, true, false, true, true, true, false);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(500, 59, 10, chartRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.SubCategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      Object object0 = categoryAxis3D0.clone();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.setTickMarkOutsideLength(0.0F);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String[] stringArray0 = new String[5];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      symbolAxis0.setLabelURL("");
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      subCategoryAxis0.setFixedDimension((-740.929798));
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      JFreeChart jFreeChart0 = new JFreeChart("", categoryAxis0.DEFAULT_TICK_LABEL_FONT, combinedDomainXYPlot0, true);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 2, chartRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "");
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle rectangle0 = new Rectangle(1110, 213, 1312, 1312);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      AxisState axisState0 = cyclicNumberAxis0.drawTickMarksAndLabels(graphics2D0, 0.0, rectangle0, rectangle0, rectangleEdge0);
      List list0 = cyclicNumberAxis0.refreshTicks(graphics2D0, axisState0, rectangle0, (RectangleEdge) null);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis(">6fwUJ%t1\"Z91U");
      // Undeclared exception!
      try { 
        subCategoryAxis0.getLabelEnclosure((Graphics2D) null, (RectangleEdge) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }
}