/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:44:16 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      XYPlot xYPlot0 = new XYPlot();
      ValueAxis[] valueAxisArray0 = new ValueAxis[6];
      valueAxisArray0[0] = (ValueAxis) dateAxis0;
      valueAxisArray0[1] = (ValueAxis) dateAxis0;
      xYPlot0.setRangeAxes(valueAxisArray0);
      dateAxis0.setTickLabelInsets(xYPlot0.DEFAULT_INSETS);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis((String) null);
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(categoryAxis0);
      categoryAxis0.notifyListeners(axisChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0, "_~@m[H#w9HAdsr");
      cyclicNumberAxis0.configure();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("V1PI,");
      Object object0 = periodAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset(1.0E-8);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      double double0 = numberAxis0.getLabelAngle();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("!zN");
      Plot plot0 = extendedCategoryAxis0.getPlot();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      Paint paint0 = dateAxis0.getTickLabelPaint();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis((String) null);
      RectangleInsets rectangleInsets0 = categoryAxis0.getTickLabelInsets();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      Stroke stroke0 = numberAxis3D0.getTickMarkStroke();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("GkrK&=COH`}8[8");
      RingPlot ringPlot0 = new RingPlot();
      categoryAxis3D0.addChangeListener(ringPlot0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("!zN");
      double double0 = extendedCategoryAxis0.getFixedDimension();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[3];
      SymbolAxis symbolAxis0 = new SymbolAxis("Null 'paint' argument.", stringArray0);
      float float0 = symbolAxis0.getTickMarkOutsideLength();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("7Lv0?a))[|P");
      Paint paint0 = periodAxis0.getLabelPaint();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("5>*cyV&@$9&\",ebU+m");
      float float0 = extendedCategoryAxis0.getTickMarkInsideLength();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("EQ]j.Vs''#noO");
      String string0 = extendedCategoryAxis0.getLabel();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2458.3, "IdYb!hGqB}PE[)so[5");
      boolean boolean0 = cyclicNumberAxis0.isAxisLineVisible();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      DateAxis dateAxis0 = new DateAxis();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
      dateAxis0.setPlot(combinedDomainCategoryPlot0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("W7c1cC59nBym1h<79=");
      boolean boolean0 = dateAxis0.isTickLabelsVisible();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      boolean boolean0 = categoryAxis0.isTickMarksVisible();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((Number[][]) null, (Number[][]) null);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      RescaleOp rescaleOp0 = new RescaleOp(10, 15, ((SunGraphics2D) graphics2D0).hints);
      Rectangle2D rectangle2D0 = rescaleOp0.getBounds2D(bufferedImage0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        symbolAxis0.draw(graphics2D0, 0.05, rectangle2D0, rectangle2D0, rectangleEdge0, plotRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.SymbolAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-202.0098));
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(false);
      boolean boolean0 = cyclicNumberAxis0.hasListener(defaultTableXYDataset0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0, "_~@m[H#w9HAdsr");
      DateAxis dateAxis0 = new DateAxis("_~@m[H#w9HAdsr");
      dateAxis0.setTickMarkPaint(cyclicNumberAxis0.DEFAULT_AXIS_LABEL_PAINT);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      // Undeclared exception!
      try { 
        categoryAxis0.setTickMarkStroke((Stroke) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setTickMarkStroke(dateAxis0.DEFAULT_AXIS_LINE_STROKE);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("mYvC]aadm3($q");
      dateAxis0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      // Undeclared exception!
      try { 
        dateAxis0.setTickLabelInsets((RectangleInsets) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'insets' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("SansSerif");
      // Undeclared exception!
      try { 
        logarithmicAxis0.setTickLabelPaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("Null 'paint' argument.");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Paint paint0 = combinedDomainXYPlot0.getDomainGridlinePaint();
      logarithmicAxis0.setTickLabelPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      periodAxis0.setTickLabelFont(periodAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      categoryAxis3D0.setTickLabelsVisible(false);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "{Lgr6luN%<,>B%");
      cyclicNumberAxis0.setTickLabelsVisible(true);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-2955.0), 4273.089461880206, "SECOND");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      cyclicNumberAxis0.setAxisLineStroke(combinedRangeCategoryPlot0.DEFAULT_GRIDLINE_STROKE);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("5>*cyV&@$9&\",ebU+m");
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      Paint paint0 = defaultPolarItemRenderer0.getBaseFillPaint();
      extendedCategoryAxis0.setAxisLinePaint(paint0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis((String) null);
      // Undeclared exception!
      try { 
        categoryAxis0.setLabelPaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("7Lv0?a))[|P");
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      Paint paint0 = fastScatterPlot0.getDomainGridlinePaint();
      periodAxis0.setLabelPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      Font font0 = SpiderWebPlot.DEFAULT_LABEL_FONT;
      periodAxis0.setLabelFont(font0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[3];
      SymbolAxis symbolAxis0 = new SymbolAxis("Null 'paint' argument.", stringArray0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.05, "");
      cyclicNumberAxis0.setLabelFont(symbolAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setLabel("");
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setLabel("b1P~~F}YL2bo10m");
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      categoryAxis3D0.setVisible(false);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("5>*cyV&@$9&\",ebU+m");
      extendedCategoryAxis0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setTickMarkInsideLength((-760.5F));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      String string0 = categoryAxis0.getLabelToolTip();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.removeChangeListener(ringPlot0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("org.jfree.chart.labels.AbstractPieItemLabelGenerator");
      String string0 = extendedCategoryAxis0.getLabelURL();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("GkrK&=COH`}8[8");
      categoryAxis3D0.setLabelToolTip("HorizontalAlignment.RIGHT");
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "{Lgr6luN%<,>B%");
      cyclicNumberAxis0.setLabelAngle(0.0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Requires 'alpha' in the range 0.0 to 1.0.");
      subCategoryAxis0.setTickMarkOutsideLength(0.95F);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("bZwzHC7|KlXx:&(");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(numberAxis0);
      JFreeChart jFreeChart0 = new JFreeChart(";~", combinedRangeCategoryPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1148, 500, chartRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setAxisLineVisible(true);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setLabelURL("SAVE");
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setFixedDimension(154.5);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      JFreeChart jFreeChart0 = new JFreeChart("D@,8qS", combinedDomainXYPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 1, 15, (-2503), 0, (-1759), 212, true, true, true, true, true, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, (double) 0.0F, 0.0, chartRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("Y");
      Font font0 = logarithmicAxis0.getLabelFont();
  }
}