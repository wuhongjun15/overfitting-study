/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:37:20 GMT 2020
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
import java.util.Date;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.time.Month;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.SpreadsheetDate;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis(".'ek7@GJ'/q5");
      extendedCategoryAxis0.notifyListeners((AxisChangeEvent) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Null 'paint' argument.");
      subCategoryAxis0.configure();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("ikuq");
      String string0 = logarithmicAxis0.getLabel();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      numberAxis0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("SECOND");
      Paint paint0 = categoryAxis0.getAxisLinePaint();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0);
      Font font0 = cyclicNumberAxis0.getTickLabelFont();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("");
      RectangleInsets rectangleInsets0 = dateAxis0.getTickLabelInsets();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2);
      Date date0 = spreadsheetDate0.toDate();
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Month month0 = new Month(date0, zoneInfo0);
      PeriodAxis periodAxis0 = new PeriodAxis("org.jfree.data.time.FixedMillisecond", month0, month0);
      Stroke stroke0 = periodAxis0.getTickMarkStroke();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      categoryAxis0.addChangeListener(waferMapPlot0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[1];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      double double0 = symbolAxis0.getFixedDimension();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("org.jfree.data.xy.AbstractIntervalXYDataset");
      DateAxis dateAxis0 = new DateAxis("SansSerif", timeZone0);
      float float0 = dateAxis0.getTickMarkOutsideLength();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[5];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      symbolAxis0.setAxisLineVisible(false);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      float float0 = categoryAxis3D0.getTickMarkInsideLength();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "");
      String string0 = cyclicNumberAxis0.getLabel();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("zH (~zbJy,@");
      boolean boolean0 = logarithmicAxis0.isAxisLineVisible();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(5000.0, 5000.0);
      cyclicNumberAxis0.setPlot((Plot) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "");
      boolean boolean0 = cyclicNumberAxis0.isTickLabelsVisible();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D((String) null);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
      categoryAxis3D0.setTickMarkOutsideLength((-4.0F));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("[x.L/`<K5}P~");
      AreaRenderer areaRenderer0 = new AreaRenderer();
      Stroke stroke0 = areaRenderer0.lookupSeriesOutlineStroke(424);
      extendedCategoryAxis0.setTickMarkStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("org.jfree.data.xy.AbstractIntervalXYDataset");
      DateAxis dateAxis0 = new DateAxis("SansSerif", timeZone0);
      dateAxis0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2.0F);
      cyclicNumberAxis0.setTickLabelInsets(categoryAxis3D0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("(@!c");
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("(@!c");
      logarithmicAxis0.setTickLabelPaint(extendedCategoryAxis0.DEFAULT_AXIS_LABEL_PAINT);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1118.03733), 0.0, "B^euywe1}od9NT3+");
      cyclicNumberAxis0.setTickLabelFont(cyclicNumberAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("[x.L/`<K5}P~");
      extendedCategoryAxis0.setTickLabelsVisible(true);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("u_QA85s#{$:B$u\"?*:");
      BasicStroke basicStroke0 = (BasicStroke)WaferMapPlot.DEFAULT_GRIDLINE_STROKE;
      periodAxis0.setAxisLineStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("ikuq");
      CategoryAxis categoryAxis0 = new CategoryAxis();
      logarithmicAxis0.setAxisLinePaint(categoryAxis0.DEFAULT_AXIS_LABEL_PAINT);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      numberAxis0.setLabelInsets(numberAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1899.973147), (-1899.973147), "!2D");
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.setLabelPaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "");
      Color color0 = (Color)SpiderWebPlot.DEFAULT_LABEL_OUTLINE_PAINT;
      cyclicNumberAxis0.setLabelPaint(color0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      // Undeclared exception!
      try { 
        dateAxis0.setLabelFont((Font) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setLabelFont(categoryAxis3D0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2.0, 50000.0);
      cyclicNumberAxis0.setLabel("");
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("SECOND");
      categoryAxis0.setTickMarkInsideLength(8.0F);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis((String) null);
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D((String) null);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
      periodAxis0.removeChangeListener(combinedDomainCategoryPlot0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      String string0 = numberAxis0.getLabelURL();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setLabelToolTip((String) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setLabelAngle(1.0E9);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("Null 'collection' argument.");
      RectangleInsets rectangleInsets0 = numberAxis0.getLabelInsets();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis((String) null);
      Object object0 = extendedCategoryAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      Plot plot0 = numberAxis3D0.getPlot();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      categoryAxis0.setLabelURL(")Tw2$G(aR^3<.%8[g");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("(@!c");
      extendedCategoryAxis0.setFixedDimension(0.0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      JFreeChart jFreeChart0 = new JFreeChart(combinedRangeXYPlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(71, 1, 3545.0, 8.0, chartRenderingInfo0);
  }
}
