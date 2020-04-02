/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:44:08 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Font;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
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
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.Minute;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.xy.MatrixSeriesCollection;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("org.jfree.chart.axis.Axis");
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(numberAxis0);
      numberAxis0.notifyListeners(axisChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("Null 'font' argument.");
      dateAxis0.configure();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(4528.955194709867, 0.0);
      DateAxis dateAxis0 = new DateAxis();
      boolean boolean0 = cyclicNumberAxis0.equals(dateAxis0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Day day0 = new Day();
      PeriodAxis periodAxis0 = new PeriodAxis("j`QAgq4rl)N(E95", day0, day0, day0.DEFAULT_TIME_ZONE);
      Object object0 = periodAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("b8y@GuO^-+?Q=");
      categoryAxis0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      Paint paint0 = numberAxis3D0.getAxisLinePaint();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("org.jfree.chart.annotations.XYBoxAnnotation");
      double double0 = categoryAxis3D0.getLabelAngle();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      Stroke stroke0 = logarithmicAxis0.getAxisLineStroke();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(365.0);
      Font font0 = cyclicNumberAxis0.getLabelFont();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("{0}");
      boolean boolean0 = extendedCategoryAxis0.isVisible();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      Plot plot0 = dateAxis0.getPlot();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("org.jfree.chart.event.PlotChangeEvent");
      Paint paint0 = logarithmicAxis0.getTickLabelPaint();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-528.2340250999224), "T");
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      PiePlot3D piePlot3D0 = new PiePlot3D(defaultKeyedValuesDataset0);
      cyclicNumberAxis0.addChangeListener(piePlot3D0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      double double0 = categoryAxis0.getFixedDimension();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.0, "");
      float float0 = cyclicNumberAxis0.getTickMarkOutsideLength();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("rn$uE5");
      extendedCategoryAxis0.setAxisLineVisible(true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("Null 'font' argument.");
      boolean boolean0 = dateAxis0.isAxisLineVisible();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("gn'rg");
      String[] stringArray0 = new String[6];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(stringArray0, (Number[][]) null, (Number[][]) null);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      TableOrder tableOrder0 = multiplePiePlot0.getDataExtractOrder();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot(defaultIntervalCategoryDataset0, tableOrder0);
      logarithmicAxis0.setPlot(spiderWebPlot0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(3391.1253);
      Paint paint0 = cyclicNumberAxis0.getTickMarkPaint();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.0, "");
      boolean boolean0 = cyclicNumberAxis0.isTickMarksVisible();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("e_<8j");
      boolean boolean0 = categoryAxis0.equals(categoryAxis3D0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("SansSerif");
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("Null 'font' argument.");
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection();
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      PolarPlot polarPlot0 = new PolarPlot(matrixSeriesCollection0, logarithmicAxis0, defaultPolarItemRenderer0);
      JFreeChart jFreeChart0 = new JFreeChart("I$sGfk.", subCategoryAxis0.DEFAULT_TICK_LABEL_FONT, polarPlot0, false);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(715, 715);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart(combinedRangeCategoryPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 10);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setTickLabelInsets(logarithmicAxis0.DEFAULT_AXIS_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("org.jfree.chart.event.PlotChangeEvent");
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((Number) 1.0E-100);
      MeterPlot meterPlot0 = new MeterPlot(defaultValueDataset0);
      Paint paint0 = meterPlot0.getDialBackgroundPaint();
      logarithmicAxis0.setTickLabelPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2000000.0, 2000000.0);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      categoryAxis0.setTickLabelFont(cyclicNumberAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1267.48475827, (-2062.62164331));
      cyclicNumberAxis0.setTickLabelsVisible(false);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("{0}");
      extendedCategoryAxis0.setAxisLineStroke(categoryAxis0.DEFAULT_AXIS_LINE_STROKE);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2000000.0, 2000000.0);
      CompassPlot compassPlot0 = new CompassPlot();
      Paint paint0 = compassPlot0.getRosePaint();
      cyclicNumberAxis0.setAxisLinePaint(paint0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockDate mockDate0 = (MockDate)DateAxis.DEFAULT_ANCHOR_DATE;
      Minute minute0 = new Minute(mockDate0);
      Second second0 = new Second(1271, minute0);
      PeriodAxis periodAxis0 = new PeriodAxis("&,rDtoAdi>i*", second0, second0, minute0.DEFAULT_TIME_ZONE);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("org.jfree.chart.axis.Axis");
      subCategoryAxis0.setLabelInsets(periodAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((Number) 0.0F);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      Paint paint0 = thermometerPlot0.getSubrangePaint(0);
      categoryAxis0.setLabelPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      DateAxis dateAxis0 = new DateAxis("v:U}q`3ds`/gk", zoneInfo0);
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.setLabelFont(dateAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setLabelFont(logarithmicAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("qNQ`Dm");
      categoryAxis0.setLabel("qNQ`Dm");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.5707963267948966);
      cyclicNumberAxis0.setLabel("");
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("org.jfree.chart.axis.Axis");
      subCategoryAxis0.setVisible(false);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setTickMarkInsideLength(0.0F);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis(")``~ZUj[hAhP");
      String string0 = logarithmicAxis0.getLabelToolTip();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      CategoryAxis categoryAxis0 = new CategoryAxis("org.jfree.chart.axis.Axis");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis0);
      dateAxis0.removeChangeListener(combinedDomainCategoryPlot0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("D3}zm%%V2:oS==1");
      subCategoryAxis0.setLabelToolTip("D3}zm%%V2:oS==1");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("!@\"azW");
      extendedCategoryAxis0.setLabelAngle(3.0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("225");
      logarithmicAxis0.setTickMarkOutsideLength(1237.8804F);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(4528.955194709867, 0.0);
      cyclicNumberAxis0.setLabelURL("Null 'insets' argument.");
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("org.jfree.chart.renderer.xy.XYLine3DRenderer");
      extendedCategoryAxis0.setFixedDimension(1166.611104944488);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String[] stringArray0 = new String[1];
      SymbolAxis symbolAxis0 = new SymbolAxis("8@&8|KF", stringArray0);
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      JFreeChart jFreeChart0 = new JFreeChart("8@&8|KF", symbolAxis0.DEFAULT_TICK_LABEL_FONT, fastScatterPlot0, true);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(35, 500, (ChartRenderingInfo) null);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Null 'insets' argument.");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(numberAxis3D0);
      JFreeChart jFreeChart0 = new JFreeChart("Null 'insets' argument.", combinedRangeCategoryPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, true, true, true, false, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 500, chartRenderingInfo0);
  }
}