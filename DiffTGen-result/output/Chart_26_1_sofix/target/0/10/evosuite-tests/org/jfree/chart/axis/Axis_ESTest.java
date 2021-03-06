/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 12:13:00 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.ChartRenderingInfo;
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
import org.jfree.chart.block.ColumnArrangement;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(periodAxis0);
      periodAxis0.notifyListeners(axisChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("org.jfree.chart.axis.Axis");
      categoryAxis3D0.configure();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(3977.072143253644, "Null 'font' argument.");
      boolean boolean0 = dateAxis0.equals(cyclicNumberAxis0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis((String) null);
      Object object0 = periodAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2.0F, "");
      cyclicNumberAxis0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("p,bUW/04SdU[E");
      Font font0 = categoryAxis3D0.getTickLabelFont();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("m.2f/_6P");
      boolean boolean0 = numberAxis0.isVisible();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      numberAxis0.addChangeListener(waferMapPlot0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("ttYn!h");
      float float0 = categoryAxis3D0.getTickMarkOutsideLength();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Year year0 = new Year(2249);
      PeriodAxis periodAxis0 = new PeriodAxis("", year0, year0, year0.DEFAULT_TIME_ZONE);
      periodAxis0.setAxisLineVisible(false);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      categoryAxis0.setPlot((Plot) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("Null 'stroke' argument.", (Range) null);
      DateAxis dateAxis0 = new DateAxis("^ Uh_d8U:rdyVO");
      moduloAxis0.setTickMarkPaint(dateAxis0.DEFAULT_AXIS_LABEL_PAINT);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setTickMarkStroke(categoryAxis0.DEFAULT_AXIS_LINE_STROKE);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[7];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      symbolAxis0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("C/i");
      // Undeclared exception!
      try { 
        extendedCategoryAxis0.setTickLabelPaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      Color color0 = Color.RED;
      categoryAxis0.setTickLabelPaint(color0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("DateTickUnit.getMillisecondCount() : unit must be one of the constants YEAR, MONTH, DAY, HOUR, MINUTE, SECOND or MILLISECOND defined in the DateTickUnit class. Do *not* use the constants defined in java.util.Calendar.");
      logarithmicAxis0.setTickLabelsVisible(false);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("^ Uh_d8U:rdyVO");
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("^ Uh_d8U:rdyVO");
      dateAxis0.setAxisLineStroke(categoryAxis3D0.DEFAULT_AXIS_LINE_STROKE);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.5707963267948966);
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.setAxisLinePaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      periodAxis0.setLabelInsets(periodAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("Arial");
      Color color0 = (Color)SpiderWebPlot.DEFAULT_LABEL_OUTLINE_PAINT;
      categoryAxis0.setLabelPaint(color0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset(2128.0);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      ModuloAxis moduloAxis0 = new ModuloAxis("Rw", valueAxis0.DEFAULT_RANGE);
      valueAxis0.setLabelFont(moduloAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockDate mockDate0 = (MockDate)DateAxis.DEFAULT_ANCHOR_DATE;
      Day day0 = new Day(mockDate0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("/");
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      PeriodAxis periodAxis0 = new PeriodAxis("/", day0, day0, timeZone0);
      periodAxis0.setLabel("/");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("^ Uh_d8U:rdyVO");
      logarithmicAxis0.setLabel("");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1118.2724812));
      cyclicNumberAxis0.setVisible(false);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      categoryAxis3D0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis((String) null);
      extendedCategoryAxis0.setTickMarkInsideLength(3497.25F);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("org.jfree.chart.annotations.TextAnnotation");
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot((CategoryDataset) null);
      dateAxis0.removeChangeListener(spiderWebPlot0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("ttYn!h");
      categoryAxis3D0.setLabelToolTip("gM~~.&yCm6IgFRUyJ6");
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      categoryAxis0.setLabelAngle((-241.34));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setTickMarkOutsideLength(10.0F);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      RectangleInsets rectangleInsets0 = logarithmicAxis0.getLabelInsets();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      Object object0 = extendedCategoryAxis0.clone();
      boolean boolean0 = extendedCategoryAxis0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      logarithmicAxis0.setLabelURL((String) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      Stroke stroke0 = categoryAxis0.getTickMarkStroke();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      Paint paint0 = categoryAxis3D0.getTickLabelPaint();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      Rectangle2D rectangle2D0 = chartRenderingInfo0.getChartArea();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge(500);
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.selectHorizontalAutoTickUnit((Graphics2D) null, rectangle2D0, rectangle2D0, rectangleEdge0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.NumberAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[2];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      Paint paint0 = symbolAxis0.getAxisLinePaint();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Null 'state' argument.");
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer();
      ColumnArrangement columnArrangement0 = new ColumnArrangement();
      LegendTitle legendTitle0 = new LegendTitle(candlestickRenderer0, columnArrangement0, columnArrangement0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      // Undeclared exception!
      try { 
        numberAxis3D0.draw((Graphics2D) null, 913.155, rectangle2D_Double0, rectangle2D_Double0, legendTitle0.DEFAULT_POSITION, plotRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.NumberAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("");
      boolean boolean0 = numberAxis0.isTickLabelsVisible();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("0KkK.RR:9=aH;");
      Font font0 = extendedCategoryAxis0.getLabelFont();
  }
}
