/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:37:19 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.SystemColor;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JTable;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.GapContent;
import javax.swing.text.Style;
import javax.swing.text.StyleContext;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisState;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.renderer.WaferMapRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.WaferMapDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Quarter;
import org.jfree.data.xy.XYDatasetTableModel;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(categoryAxis3D0);
      categoryAxis3D0.notifyListeners(axisChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      NumberAxis numberAxis0 = (NumberAxis)thermometerPlot0.getRangeAxis();
      JFreeChart jFreeChart0 = new JFreeChart((String) null, thermometerPlot0);
      BufferedImage bufferedImage0 = new BufferedImage(2, 500, 1);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      LegendTitle legendTitle0 = jFreeChart0.getLegend();
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)numberAxis0.getLabelEnclosure(sunGraphics2D0, legendTitle0.DEFAULT_POSITION);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.5, 1.5, ",~f_E");
      ModuloAxis moduloAxis0 = new ModuloAxis("[NzcqG4PKGE;,", cyclicNumberAxis0.DEFAULT_RANGE);
      Object object0 = moduloAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D(")f,Hb$8WG!H'%+uT*");
      categoryAxis3D0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-217.04385), "Dialog");
      boolean boolean0 = cyclicNumberAxis0.isVisible();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis(">1}c)8P,nz^ W");
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(5, 388, 1.0F);
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer();
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0, waferMapRenderer0);
      periodAxis0.addChangeListener(waferMapPlot0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("(Ipf/(e!X");
      extendedCategoryAxis0.setAxisLineVisible(true);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      XYPlot xYPlot0 = new XYPlot();
      numberAxis0.setPlot(xYPlot0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      boolean boolean0 = valueAxis0.isTickLabelsVisible();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis((String) null);
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("qj*");
      boolean boolean0 = categoryAxis0.equals(categoryAxis3D0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("3}Z9u98QAi,hsG");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart(combinedDomainCategoryPlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 0.05, (double) 1.0F, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      SystemColor systemColor0 = SystemColor.controlLtHighlight;
      SoftBevelBorder softBevelBorder0 = new SoftBevelBorder(2, systemColor0, systemColor0, systemColor0, systemColor0);
      Object[] objectArray0 = new Object[2];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 35);
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTable jTable0 = new JTable(defaultTableModel0, defaultTableColumnModel0);
      Rectangle rectangle0 = softBevelBorder0.getInteriorRectangle((Component) jTable0, 35, 13, 200, 10);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Rectangle2D rectangle2D0 = plotRenderingInfo0.getPlotArea();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      AxisState axisState0 = new AxisState();
      AxisState axisState1 = categoryAxis3D0.drawLabel("", graphics2D0, rectangle0, rectangle2D0, rectangleEdge0, axisState0, plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("<8$,Ht8m4n+");
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel();
      boolean boolean0 = categoryAxis3D0.hasListener(xYDatasetTableModel0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      BasicStroke basicStroke0 = (BasicStroke)CategoryPlot.DEFAULT_GRIDLINE_STROKE;
      valueAxis0.setTickMarkStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("Null 'font' argument.");
      Instant instant0 = MockInstant.ofEpochSecond((long) 10);
      Date date0 = Date.from(instant0);
      Day day0 = new Day(date0);
      PeriodAxis periodAxis0 = new PeriodAxis("Null 'font' argument.", day0, day0, day0.DEFAULT_TIME_ZONE);
      periodAxis0.setTickMarkStroke(numberAxis0.DEFAULT_AXIS_LINE_STROKE);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis(")f,Hb$8WG!H'%+uT*");
      subCategoryAxis0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("Null 'font' argument.");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(numberAxis0);
      numberAxis0.setTickLabelInsets(combinedRangeCategoryPlot0.DEFAULT_INSETS);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("3{bIw!");
      Color color0 = (Color)LineRenderer3D.DEFAULT_WALL_PAINT;
      numberAxis0.setTickLabelPaint(color0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[4];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      // Undeclared exception!
      try { 
        symbolAxis0.setAxisLineStroke((Stroke) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateAxis dateAxis0 = new DateAxis("", timeZone0);
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      Stroke stroke0 = defaultPolarItemRenderer0.getBaseOutlineStroke();
      dateAxis0.setAxisLineStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("X&9[{>T1H_");
      // Undeclared exception!
      try { 
        logarithmicAxis0.setAxisLinePaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis(">1}c)8P,nz^ W");
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getBackgroundNonSelectionColor();
      logarithmicAxis0.setAxisLinePaint(color0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("N4< !z", categoryPlot0);
      LegendTitle legendTitle0 = jFreeChart0.getLegend();
      dateAxis0.setLabelInsets(legendTitle0.DEFAULT_PADDING);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-217.6), "");
      GapContent gapContent0 = new GapContent(2072);
      StyleContext styleContext0 = new StyleContext();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument(gapContent0, styleContext0);
      Style style0 = defaultStyledDocument0.getLogicalStyle(2072);
      Color color0 = defaultStyledDocument0.getBackground(style0);
      cyclicNumberAxis0.setLabelPaint(color0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.5, 1.5, ",~f_E");
      ModuloAxis moduloAxis0 = new ModuloAxis("[NzcqG4PKGE;,", cyclicNumberAxis0.DEFAULT_RANGE);
      moduloAxis0.setLabelFont(cyclicNumberAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("SansSerif");
      // Undeclared exception!
      try { 
        categoryAxis0.setLabelFont((Font) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[4];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      Instant instant0 = MockInstant.ofEpochMilli(500);
      Date date0 = Date.from(instant0);
      Quarter quarter0 = new Quarter(date0);
      PeriodAxis periodAxis0 = new PeriodAxis("%3A)tm0NeQ(j", quarter0, quarter0);
      symbolAxis0.setLabelFont(periodAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.5, 1.5, ",~f_E");
      cyclicNumberAxis0.setLabel("}-<");
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      extendedCategoryAxis0.setLabel("");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("4%g,gp?j?bKTf&&R");
      subCategoryAxis0.setVisible(false);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("4%g,gp?j?bKTf&&R");
      subCategoryAxis0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      logarithmicAxis0.setTickMarkInsideLength(2960.39F);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset(195.346086);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      float float0 = valueAxis0.getTickMarkOutsideLength();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("kk]yWzLq |Cm2oH;^");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      dateAxis0.removeChangeListener(combinedDomainXYPlot0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("<8$,Ht8m4n+");
      categoryAxis3D0.setLabelToolTip("<8$,Ht8m4n+");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setLabelAngle((-3.0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2648.305);
      cyclicNumberAxis0.setTickMarkOutsideLength(2.0F);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.5, 1.5, ",~f_E");
      ModuloAxis moduloAxis0 = new ModuloAxis("[NzcqG4PKGE;,", cyclicNumberAxis0.DEFAULT_RANGE);
      double double0 = moduloAxis0.getLabelAngle();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("kk]yWzLq |Cm2oH;^");
      RectangleInsets rectangleInsets0 = dateAxis0.getLabelInsets();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("kk]yWzLq |Cm2oH;^");
      boolean boolean0 = dateAxis0.isTickMarksVisible();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-217.04385), "Dialog");
      Stroke stroke0 = cyclicNumberAxis0.getAxisLineStroke();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("(Ipf/(e!X");
      extendedCategoryAxis0.setLabelURL("");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      PeriodAxis periodAxis0 = new PeriodAxis("", fixedMillisecond0, fixedMillisecond0);
      Stroke stroke0 = periodAxis0.getTickMarkStroke();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      numberAxis0.setFixedDimension(1388.769);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String[] stringArray0 = new String[5];
      SymbolAxis symbolAxis0 = new SymbolAxis((String) null, stringArray0);
      CategoryPlot categoryPlot0 = new CategoryPlot();
      RectangleEdge rectangleEdge0 = categoryPlot0.getDomainAxisEdge(235);
      // Undeclared exception!
      try { 
        symbolAxis0.selectHorizontalAutoTickUnit((Graphics2D) null, (Rectangle2D) null, rectangleEdge0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.NumberAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("");
      Paint paint0 = numberAxis3D0.getAxisLinePaint();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis(">1}c)8P,nz^ W");
      float float0 = periodAxis0.getTickMarkInsideLength();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart(combinedDomainCategoryPlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 0.05, (double) 1.0F, chartRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis((String) null);
      Font font0 = categoryAxis0.getLabelFont();
  }
}
