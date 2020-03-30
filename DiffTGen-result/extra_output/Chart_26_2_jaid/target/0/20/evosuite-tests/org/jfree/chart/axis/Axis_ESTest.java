/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 13:17:08 GMT 2020
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
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.Range;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(symbolAxis0);
      symbolAxis0.notifyListeners(axisChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("J=.k~}C8JOA");
      subCategoryAxis0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minute minute0 = new Minute();
      Second second0 = new Second(432, minute0);
      PeriodAxis periodAxis0 = new PeriodAxis((String) null, second0, minute0);
      Plot plot0 = periodAxis0.getPlot();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("M`eJghg>");
      dateAxis0.setAxisLineVisible(false);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("rNf;xB#{=f.- Jif3,m");
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((Number) 2.0F);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      boolean boolean0 = subCategoryAxis0.hasListener(thermometerPlot0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      // Undeclared exception!
      try { 
        categoryAxis3D0.setTickMarkPaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("org.jfree.chart.axis.Axis");
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      MeterPlot meterPlot0 = new MeterPlot(defaultValueDataset0);
      extendedCategoryAxis0.setTickMarkPaint(meterPlot0.DEFAULT_BACKGROUND_PAINT);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.5707963267948966, (-1481.36), "There is no database to execute the query.");
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      cyclicNumberAxis0.setTickMarkStroke(thermometerPlot0.DEFAULT_OUTLINE_STROKE);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      BasicStroke basicStroke0 = (BasicStroke)AbstractRenderer.DEFAULT_STROKE;
      dateAxis0.setTickMarkStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, (-691.57841), "");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(cyclicNumberAxis0);
      subCategoryAxis0.setTickLabelInsets(combinedDomainXYPlot0.DEFAULT_INSETS);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setTickLabelInsets(subCategoryAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1208.885), "y-f\"");
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("y-f\"");
      extendedCategoryAxis0.setTickLabelPaint(cyclicNumberAxis0.DEFAULT_TICK_LABEL_PAINT);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("l86Ji");
      subCategoryAxis0.setTickLabelFont(subCategoryAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("d.rivett@ukonline.co.uk");
      periodAxis0.setTickLabelsVisible(true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      TableOrder tableOrder0 = multiplePiePlot0.getDataExtractOrder();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot(defaultStatisticalCategoryDataset0, tableOrder0);
      Stroke stroke0 = spiderWebPlot0.getSeriesOutlineStroke(10);
      logarithmicAxis0.setAxisLineStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      DateAxis dateAxis0 = new DateAxis("Y", zoneInfo0);
      // Undeclared exception!
      try { 
        dateAxis0.setAxisLinePaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("org.jfree.chart.axis.Axis", (Range) null);
      Color color0 = (Color)AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
      moduloAxis0.setAxisLinePaint(color0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateAxis dateAxis0 = new DateAxis("", timeZone0);
      dateAxis0.setLabelInsets(dateAxis0.DEFAULT_AXIS_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      PiePlot piePlot0 = new PiePlot();
      Paint paint0 = piePlot0.getLabelBackgroundPaint();
      categoryAxis3D0.setLabelPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      Font font0 = subCategoryAxis0.getTickLabelFont((Comparable) "");
      subCategoryAxis0.setLabelFont(font0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setLabelFont(subCategoryAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("TimeSeries.update(TimePeriod, Number):  period does not exist.");
      categoryAxis3D0.setLabel("TimeSeries.update(TimePeriod, Number):  period does not exist.");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("q78~/3R");
      PiePlot piePlot0 = new PiePlot();
      subCategoryAxis0.addChangeListener(piePlot0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("rNf;xB#{=f.- Jif3,m");
      String string0 = subCategoryAxis0.getLabel();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setTickMarkInsideLength(0.0F);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      float float0 = dateAxis0.getTickMarkOutsideLength();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.removeChangeListener((AxisChangeListener) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setLabelAngle(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("J=.k~}C8JOA");
      subCategoryAxis0.setTickMarkOutsideLength(0.0F);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateAxis dateAxis0 = new DateAxis("", timeZone0);
      double double0 = dateAxis0.getLabelAngle();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      Paint paint0 = numberAxis0.getLabelPaint();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2444.76223, 2444.76223);
      RectangleInsets rectangleInsets0 = cyclicNumberAxis0.getLabelInsets();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      DateAxis dateAxis0 = new DateAxis("F;F<4UMOv.N@s:o\"DRf", zoneInfo0);
      boolean boolean0 = dateAxis0.isTickMarksVisible();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      Font font0 = numberAxis0.getTickLabelFont();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      Object object0 = dateAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setPlot((Plot) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("org.jfree.chart.axis.Axis");
      Paint paint0 = extendedCategoryAxis0.getTickLabelPaint((Comparable) "org.jfree.chart.axis.Axis");
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis((String) null);
      periodAxis0.setFixedDimension((-381.57532));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Month month0 = new Month();
      TimeZone timeZone0 = TimeZone.getDefault();
      PeriodAxis periodAxis0 = new PeriodAxis(";:?~", month0, month0, timeZone0);
      boolean boolean0 = periodAxis0.isAxisLineVisible();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("xcE((647");
      RectangleInsets rectangleInsets0 = logarithmicAxis0.getTickLabelInsets();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2000000.0, 2000000.0);
      float float0 = cyclicNumberAxis0.getTickMarkInsideLength();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("q78~/3R");
      boolean boolean0 = subCategoryAxis0.isTickLabelsVisible();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      Font font0 = logarithmicAxis0.getLabelFont();
  }
}
