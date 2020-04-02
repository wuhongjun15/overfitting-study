/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 12:53:18 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.EventListener;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.block.CenterArrangement;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.DefaultDrawingSupplier;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryToPieDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Week;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(categoryAxis3D0);
      categoryAxis3D0.notifyListeners(axisChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("`A");
      DateAxis dateAxis0 = new DateAxis("@0XfBzhEmc", timeZone0);
      ModuloAxis moduloAxis0 = new ModuloAxis("", dateAxis0.DEFAULT_DATE_RANGE);
      moduloAxis0.configure();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge(0);
      Rectangle2D rectangle2D0 = categoryAxis0.getLabelEnclosure((Graphics2D) null, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("@0XfBzhEmc");
      boolean boolean0 = logarithmicAxis0.equals("@0XfBzhEmc");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Week week0 = new Week();
      PeriodAxis periodAxis0 = new PeriodAxis("WbyNVDuR:TmjX", week0, week0, week0.DEFAULT_TIME_ZONE);
      Object object0 = periodAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("GEb>paG=N(M<>j>K");
      periodAxis0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("Jelai Wang");
      Font font0 = numberAxis0.getTickLabelFont();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      boolean boolean0 = categoryAxis3D0.isVisible();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = (MockDate)DateAxis.DEFAULT_ANCHOR_DATE;
      Hour hour0 = new Hour(mockDate0);
      Minute minute0 = new Minute(0, hour0);
      Day day0 = minute0.getDay();
      PeriodAxis periodAxis0 = new PeriodAxis("", day0, hour0, day0.DEFAULT_TIME_ZONE);
      Plot plot0 = periodAxis0.getPlot();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      Paint paint0 = logarithmicAxis0.getTickLabelPaint();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D((String) null);
      RectangleInsets rectangleInsets0 = categoryAxis3D0.getTickLabelInsets();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(4.0, 4.0, "Null 'insets' argument.");
      Stroke stroke0 = cyclicNumberAxis0.getTickMarkStroke();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("cMu//r");
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      categoryAxis3D0.addChangeListener(spiderWebPlot0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(4.0);
      double double0 = cyclicNumberAxis0.getFixedDimension();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(25.0);
      cyclicNumberAxis0.setAxisLineVisible(false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D((String) null);
      float float0 = categoryAxis3D0.getTickMarkInsideLength();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      String string0 = numberAxis0.getLabel();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset(defaultStatisticalCategoryDataset0, tableOrder0, 221);
      PiePlot piePlot0 = new PiePlot(categoryToPieDataset0);
      categoryAxis3D0.setPlot(piePlot0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      boolean boolean0 = categoryAxis0.isTickLabelsVisible();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("");
      Paint paint0 = numberAxis0.getTickMarkPaint();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("Null 'state' argument.");
      boolean boolean0 = logarithmicAxis0.isTickMarksVisible();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "");
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("\"<[i`6}Se_k");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
      JFreeChart jFreeChart0 = new JFreeChart("\"<[i`6}Se_k", cyclicNumberAxis0.DEFAULT_TICK_LABEL_FONT, combinedDomainCategoryPlot0, true);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2296, 841);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      boolean boolean0 = dateAxis0.hasListener((EventListener) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      // Undeclared exception!
      try { 
        numberAxis0.setTickMarkPaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      Paint[] paintArray0 = new Paint[4];
      Stroke[] strokeArray0 = new Stroke[9];
      Shape[] shapeArray0 = new Shape[5];
      DefaultDrawingSupplier defaultDrawingSupplier0 = new DefaultDrawingSupplier(paintArray0, paintArray0, strokeArray0, strokeArray0, shapeArray0);
      Paint paint0 = defaultDrawingSupplier0.getNextFillPaint();
      categoryAxis0.setTickMarkPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("lonkHc?\u0000/d");
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      Stroke stroke0 = spiderWebPlot0.getAxisLineStroke();
      categoryAxis0.setTickMarkStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
      categoryAxis3D0.setTickLabelInsets(combinedDomainCategoryPlot0.DEFAULT_INSETS);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis(":iWa'{");
      PeriodAxis periodAxis0 = new PeriodAxis(":iWa'{");
      logarithmicAxis0.setTickLabelInsets(periodAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("@|;G6r0vY");
      // Undeclared exception!
      try { 
        periodAxis0.setTickLabelPaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateAxis dateAxis0 = new DateAxis((String) null, timeZone0);
      Color color0 = Color.black;
      dateAxis0.setTickLabelPaint(color0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setTickLabelFont(categoryAxis3D0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("jNYd");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "jNYd");
      cyclicNumberAxis0.setTickLabelFont(subCategoryAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1816.0534346373631, "%UoD`YYeJfR");
      cyclicNumberAxis0.setTickLabelsVisible(false);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-2720.0), (-3860.751583401));
      cyclicNumberAxis0.setTickLabelsVisible(true);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(65535, "org.jfree.chart.axis.Axis");
      DateAxis dateAxis0 = new DateAxis("org.jfree.chart.axis.Axis", simpleTimeZone0);
      // Undeclared exception!
      try { 
        dateAxis0.setAxisLineStroke((Stroke) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("h0 >*}91P4t");
      BasicStroke basicStroke0 = (BasicStroke)AbstractRenderer.DEFAULT_OUTLINE_STROKE;
      logarithmicAxis0.setAxisLineStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("Chart_Properties");
      Color color0 = Color.red;
      categoryAxis0.setAxisLinePaint(color0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Paint paint0 = stackedAreaRenderer0.lookupSeriesOutlinePaint(500);
      logarithmicAxis0.setLabelPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-2720.0), (-3860.751583401));
      Font font0 = JFreeChart.DEFAULT_TITLE_FONT;
      cyclicNumberAxis0.setLabelFont(font0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-2720.0), (-3860.751583401));
      cyclicNumberAxis0.setLabelFont(cyclicNumberAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("I<YzP`0Qp&>L");
      numberAxis3D0.setLabel("I<YzP`0Qp&>L");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.setLabel("Null 'paint' argument.");
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1340.17556843167, (-2259.72989), "'>'z'w");
      cyclicNumberAxis0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("");
      CategoryPlot categoryPlot0 = new CategoryPlot();
      numberAxis3D0.removeChangeListener(categoryPlot0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("GEb>paG=N(M<>j>K");
      String string0 = periodAxis0.getLabelURL();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Jelai Wang");
      subCategoryAxis0.setLabelToolTip("Jelai Wang");
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      logarithmicAxis0.setLabelAngle(0.0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("lonkHc?\u0000/d");
      categoryAxis0.setTickMarkOutsideLength((-541.6511F));
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      double double0 = categoryAxis0.getLabelAngle();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(4.0);
      Paint paint0 = cyclicNumberAxis0.getLabelPaint();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("");
      RectangleInsets rectangleInsets0 = numberAxis3D0.getLabelInsets();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-2720.0), (-3860.751583401));
      Stroke stroke0 = cyclicNumberAxis0.getAxisLineStroke();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateAxis dateAxis0 = new DateAxis((String) null, timeZone0);
      dateAxis0.setLabelURL((String) null);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setFixedDimension(0.0F);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("Chart_Properties");
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("");
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(numberAxis3D0);
      JFreeChart jFreeChart0 = new JFreeChart((String) null, categoryAxis0.DEFAULT_TICK_LABEL_FONT, combinedRangeXYPlot0, true);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 12, (ChartRenderingInfo) null);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("U)05_hM[ORWZ");
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      CenterArrangement centerArrangement0 = new CenterArrangement();
      LegendTitle legendTitle0 = new LegendTitle(waferMapPlot0, centerArrangement0, centerArrangement0);
      // Undeclared exception!
      try { 
        logarithmicAxis0.getLabelEnclosure((Graphics2D) null, legendTitle0.DEFAULT_POSITION);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }
}