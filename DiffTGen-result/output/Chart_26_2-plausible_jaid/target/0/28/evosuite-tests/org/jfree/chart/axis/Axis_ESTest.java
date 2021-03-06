/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:50:33 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.Axis;
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
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.labels.XYToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.time.Day;
import org.jfree.data.time.Minute;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(logarithmicAxis0);
      logarithmicAxis0.notifyListeners(axisChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2917.5695394749396, 2917.5695394749396);
      cyclicNumberAxis0.configure();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-152L));
      Minute minute0 = new Minute(mockDate0);
      Day day0 = minute0.getDay();
      PeriodAxis periodAxis0 = new PeriodAxis("Null 'insets' argument.", day0, minute0);
      String string0 = periodAxis0.getLabel();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      Locale locale0 = Locale.KOREA;
      boolean boolean0 = categoryAxis3D0.equals(locale0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      periodAxis0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      Paint paint0 = subCategoryAxis0.getAxisLinePaint();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("W[`<iYi ");
      RectangleInsets rectangleInsets0 = subCategoryAxis0.getTickLabelInsets();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("&Y]{sIl_h");
      numberAxis3D0.setAxisLineVisible(true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      float float0 = cyclicNumberAxis0.getTickMarkInsideLength();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Day day0 = new Day();
      PeriodAxis periodAxis0 = new PeriodAxis("", day0, day0);
      boolean boolean0 = periodAxis0.isTickLabelsVisible();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("KcbcDK?");
      Font font0 = categoryAxis0.getTickLabelFont();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.addChangeListener(combinedDomainXYPlot0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("wJGX$QreWnOk");
      double double0 = numberAxis0.getFixedDimension();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      String string0 = categoryAxis3D0.getLabel();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Day day0 = new Day();
      PeriodAxis periodAxis0 = new PeriodAxis("", day0, day0);
      CompassPlot compassPlot0 = new CompassPlot();
      periodAxis0.setPlot(compassPlot0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      float[][] floatArray0 = new float[6][3];
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot(floatArray0, numberAxis3D0, numberAxis3D0);
      ModuloAxis moduloAxis0 = new ModuloAxis("t`wrR:FlJi#eD", numberAxis3D0.DEFAULT_RANGE);
      boolean boolean0 = moduloAxis0.hasListener(fastScatterPlot0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("&7");
      Color color0 = (Color)SpiderWebPlot.DEFAULT_LABEL_SHADOW_PAINT;
      numberAxis0.setTickMarkPaint(color0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1170.58, "");
      BasicStroke basicStroke0 = (BasicStroke)CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
      cyclicNumberAxis0.setTickMarkStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("Null 'font' argument.");
      extendedCategoryAxis0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("Null 'insets' argument.");
      periodAxis0.setTickLabelInsets(periodAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(25.0, 25.0);
      Color color0 = (Color)SpiderWebPlot.DEFAULT_LABEL_SHADOW_PAINT;
      cyclicNumberAxis0.setTickLabelPaint(color0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("");
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.setTickLabelFont(dateAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      cyclicNumberAxis0.setTickLabelsVisible(false);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(3.0, 3.0);
      cyclicNumberAxis0.setTickLabelsVisible(true);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.setAxisLineStroke(combinedDomainXYPlot0.DEFAULT_GRIDLINE_STROKE);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(734.0);
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(0.05, true, (XYToolTipGenerator) null);
      Paint paint0 = candlestickRenderer0.getBasePaint();
      cyclicNumberAxis0.setAxisLinePaint(paint0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("Null 'insets' argument.");
      RectangleInsets rectangleInsets0 = Axis.DEFAULT_AXIS_LABEL_INSETS;
      periodAxis0.setLabelInsets(rectangleInsets0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("Null 'insets' argument.");
      periodAxis0.setLabelInsets(periodAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(0.05);
      Paint paint0 = candlestickRenderer0.getItemLabelPaint(0, (-687));
      subCategoryAxis0.setLabelPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(940.40366);
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.setLabelFont((Font) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setLabelFont(categoryAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-2885.0), "");
      cyclicNumberAxis0.setLabel("");
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      categoryAxis3D0.setLabel("]kkx1xF_w2%v+)X");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1805.92917533081), (-1805.92917533081));
      cyclicNumberAxis0.setLabel("Unrecognised constraint type.");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-2885.0), "");
      cyclicNumberAxis0.setVisible(false);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis((String) null);
      dateAxis0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      categoryAxis3D0.setTickMarkInsideLength(1985.3881F);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      categoryAxis3D0.removeChangeListener(combinedDomainXYPlot0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("W[`<iYi ");
      subCategoryAxis0.setLabelToolTip("W[`<iYi ");
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("5!");
      subCategoryAxis0.setLabelAngle(0.0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("*,sZka{L(Ju;Rmx'4g");
      logarithmicAxis0.setTickMarkOutsideLength(0.8F);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      double double0 = categoryAxis0.getLabelAngle();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      Paint paint0 = categoryAxis0.getLabelPaint();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1170.58, "");
      boolean boolean0 = cyclicNumberAxis0.isTickMarksVisible();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      Object object0 = categoryAxis3D0.clone();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      boolean boolean0 = valueAxis0.isVisible();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      categoryAxis3D0.setLabelURL("");
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      Stroke stroke0 = categoryAxis3D0.getTickMarkStroke();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("Null 'font' argument.");
      Paint paint0 = extendedCategoryAxis0.getTickLabelPaint();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1170.58, "");
      cyclicNumberAxis0.setFixedDimension((-1049.216815));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("key");
      Paint paint0 = dateAxis0.getTickMarkPaint();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(dateAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("", dateAxis0.DEFAULT_AXIS_LABEL_FONT, combinedRangeCategoryPlot0, false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 1600, chartRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      Font font0 = logarithmicAxis0.getLabelFont();
  }
}
