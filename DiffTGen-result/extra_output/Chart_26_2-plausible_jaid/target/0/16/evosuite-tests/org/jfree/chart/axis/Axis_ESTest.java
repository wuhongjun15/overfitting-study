/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:47:06 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
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
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Second;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultCategoryDataset0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      RescaleOp rescaleOp0 = new RescaleOp((-829.3207F), (-1.0F), ((SunGraphics2D) graphics2D0).hints);
      Rectangle2D rectangle2D0 = rescaleOp0.getBounds2D(bufferedImage0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge(15);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1603.8594);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      AxisState axisState0 = cyclicNumberAxis0.draw(graphics2D0, 10, rectangle2D0, rectangle2D0, rectangleEdge0, plotRenderingInfo0);
      AxisState axisState1 = subCategoryAxis0.drawLabel((String) null, graphics2D0, rectangle2D0, rectangle2D0, rectangleEdge0, axisState0, plotRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.05, 500, "org.jfree.data.time.Week");
      Paint paint0 = cyclicNumberAxis0.getAxisLinePaint();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateAxis dateAxis0 = new DateAxis("Q{MwOu=r$;BG_SO", timeZone0);
      dateAxis0.setAxisLineVisible(false);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("java.awt.geom.Ellipse2D", (Range) null);
      float float0 = moduloAxis0.getTickMarkInsideLength();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("),|e!`IAo%@");
      boolean boolean0 = periodAxis0.isTickLabelsVisible();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Bill Kelemen");
      Paint paint0 = subCategoryAxis0.getTickLabelPaint();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("5h@/_|$%&`bMJU");
      logarithmicAxis0.addChangeListener((AxisChangeListener) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("org.jfree.data.time.Week");
      String string0 = logarithmicAxis0.getLabel();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[9];
      SymbolAxis symbolAxis0 = new SymbolAxis("XQFS3", stringArray0);
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("$!Lq]I%e|P~");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(symbolAxis0);
      logarithmicAxis0.setPlot(combinedDomainXYPlot0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("i0ww;j`z?.\u0003>K");
      ModuloAxis moduloAxis0 = new ModuloAxis("", logarithmicAxis0.DEFAULT_RANGE);
      boolean boolean0 = logarithmicAxis0.equals(moduloAxis0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(987.994082, 0.0);
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      cyclicNumberAxis0.setTickMarkPaint(categoryAxis3D0.DEFAULT_TICK_MARK_PAINT);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      // Undeclared exception!
      try { 
        periodAxis0.setTickMarkStroke((Stroke) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("e0Jcs[b9H.oJyRM>*");
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      ModuloAxis moduloAxis0 = new ModuloAxis((String) null, numberAxis3D0.DEFAULT_RANGE);
      moduloAxis0.setTickMarkStroke(categoryAxis3D0.DEFAULT_AXIS_LINE_STROKE);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setTickLabelInsets(dateAxis0.DEFAULT_AXIS_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      PeriodAxis periodAxis0 = new PeriodAxis("");
      dateAxis0.setTickLabelInsets(periodAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      Paint paint0 = categoryAxis3D0.getTickLabelPaint((Comparable) true);
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setTickLabelPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("i0ww;j`z?.\u0003>K");
      ModuloAxis moduloAxis0 = new ModuloAxis("", logarithmicAxis0.DEFAULT_RANGE);
      moduloAxis0.setTickLabelFont(logarithmicAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Minute minute0 = new Minute();
      Second second0 = new Second(34, minute0);
      PeriodAxis periodAxis0 = new PeriodAxis("", second0, minute0, second0.DEFAULT_TIME_ZONE);
      // Undeclared exception!
      try { 
        periodAxis0.setAxisLineStroke((Stroke) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      BasicStroke basicStroke0 = (BasicStroke)WaferMapPlot.DEFAULT_CROSSHAIR_STROKE;
      categoryAxis3D0.setAxisLineStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1544.87937496);
      cyclicNumberAxis0.setLabelInsets(cyclicNumberAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-379.0), "org.jfree.chart.renderer.xy.XYStepRenderer");
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
  public void test23()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(987.994082, 0.0);
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setLabelPaint(cyclicNumberAxis0.DEFAULT_AXIS_LINE_PAINT);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      cyclicNumberAxis0.setLabelFont(cyclicNumberAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("rp\"`e)t$mB/EJJ");
      logarithmicAxis0.setTickMarkInsideLength(0.0F);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("GS @5%Zg(6^NS");
      String string0 = extendedCategoryAxis0.getLabelToolTip();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("y>w");
      PiePlot3D piePlot3D0 = new PiePlot3D();
      subCategoryAxis0.removeChangeListener(piePlot3D0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setLabelToolTip("bg k`af3#&$");
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("+t'3\"m*QD");
      dateAxis0.setLabelAngle((-922));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("+T{Yq<6rY:G.+R|5B");
      double double0 = numberAxis0.getLabelAngle();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Null 'stroke' argument.");
      Paint paint0 = numberAxis3D0.getLabelPaint();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      double double0 = cyclicNumberAxis0.getFixedDimension();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      RectangleInsets rectangleInsets0 = categoryAxis0.getLabelInsets();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      Object object0 = dateAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Null 'insets' argument.");
      String string0 = numberAxis3D0.getLabelURL();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis((String) null);
      extendedCategoryAxis0.setLabelURL((String) null);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-335L));
      Day day0 = new Day(mockDate0);
      DateAxis dateAxis0 = new DateAxis("org.jfree.chart.axis.CategoryAnchor", day0.DEFAULT_TIME_ZONE);
      Font font0 = dateAxis0.getLabelFont();
  }
}
