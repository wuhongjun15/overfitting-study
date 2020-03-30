/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 13:19:20 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.util.TimeZone;
import javax.swing.plaf.synth.SynthSeparatorUI;
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
import org.jfree.chart.axis.PeriodAxisLabelInfo;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import org.jfree.chart.text.TextBox;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.xy.XYIntervalSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("Y");
      DateAxis dateAxis0 = new DateAxis("", timeZone0);
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      XYDifferenceRenderer xYDifferenceRenderer0 = new XYDifferenceRenderer(dateAxis0.DEFAULT_AXIS_LABEL_PAINT, dateAxis0.DEFAULT_TICK_LABEL_PAINT, false);
      XYPlot xYPlot0 = new XYPlot(xYIntervalSeriesCollection0, dateAxis0, dateAxis0, xYDifferenceRenderer0);
      JFreeChart jFreeChart0 = new JFreeChart(xYPlot0);
      LegendTitle legendTitle0 = jFreeChart0.getLegend();
      dateAxis0.setTickLabelInsets(legendTitle0.DEFAULT_PADDING);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(extendedCategoryAxis0);
      extendedCategoryAxis0.notifyListeners(axisChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1929.178465, 2.0, "X|z#aUjY$qbCs_");
      cyclicNumberAxis0.configure();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("C:");
      boolean boolean0 = extendedCategoryAxis0.equals("C:");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis(":,Eed");
      logarithmicAxis0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      Paint paint0 = subCategoryAxis0.getAxisLinePaint();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      double double0 = logarithmicAxis0.getLabelAngle();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(81.04864095523);
      float float0 = cyclicNumberAxis0.getTickMarkOutsideLength();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("Null 'stroke' argument.");
      float float0 = periodAxis0.getTickMarkInsideLength();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(4307.223855125639, 1.0, "1@");
      Paint paint0 = cyclicNumberAxis0.getTickMarkPaint();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.0E-8);
      Font font0 = cyclicNumberAxis0.getTickLabelFont();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("z[OF:'RcU@@Y");
      Stroke stroke0 = categoryAxis3D0.getAxisLineStroke();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis((String) null);
      Plot plot0 = periodAxis0.getPlot();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      Paint paint0 = dateAxis0.getTickLabelPaint();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("o{-Qk@,>xr^o%_@M.U<");
      RectangleInsets rectangleInsets0 = categoryAxis0.getLabelInsets();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      String string0 = periodAxis0.getLabel();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("@NO");
      boolean boolean0 = dateAxis0.isAxisLineVisible();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("");
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(numberAxis0);
      JFreeChart jFreeChart0 = new JFreeChart(combinedRangeXYPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(696, 10, 500000.0, 4.0, chartRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[2];
      SymbolAxis symbolAxis0 = new SymbolAxis((String) null, stringArray0);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart(stringArray0[1], symbolAxis0.DEFAULT_AXIS_LABEL_FONT, combinedRangeCategoryPlot0, false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 557, chartRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("Y");
      DateAxis dateAxis0 = new DateAxis("", timeZone0);
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      PiePlot piePlot0 = new PiePlot(defaultKeyedValuesDataset0);
      dateAxis0.addChangeListener(piePlot0);
      dateAxis0.setTickLabelInsets(dateAxis0.DEFAULT_AXIS_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      SynthSeparatorUI synthSeparatorUI0 = new SynthSeparatorUI();
      boolean boolean0 = extendedCategoryAxis0.hasListener(synthSeparatorUI0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("C:");
      Color color0 = (Color)LegendTitle.DEFAULT_ITEM_PAINT;
      extendedCategoryAxis0.setTickMarkPaint(color0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("xs~;'`MO{{hau");
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
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      PiePlot piePlot0 = new PiePlot();
      Stroke stroke0 = piePlot0.getBaseSectionOutlineStroke();
      symbolAxis0.setTickMarkStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("Null 'paint' argument.");
      logarithmicAxis0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D(" ,BSh&#`QF;%8\"/3R3");
      // Undeclared exception!
      try { 
        categoryAxis3D0.setTickLabelInsets((RectangleInsets) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'insets' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("Wxd+3s+om?8R_");
      Color color0 = Color.getHSBColor(3137.38F, 0.0F, 1.0F);
      logarithmicAxis0.setTickLabelPaint(color0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("org.jfree.chart.axis.Axis");
      categoryAxis3D0.setTickLabelFont(categoryAxis3D0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("CategoryAnchor.END");
      categoryAxis3D0.setTickLabelsVisible(false);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      // Undeclared exception!
      try { 
        extendedCategoryAxis0.setAxisLineStroke((Stroke) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("V[3N]b:)y(}zew:!");
      TextBox textBox0 = new TextBox("V[3N]b:)y(}zew:!");
      Stroke stroke0 = textBox0.getOutlineStroke();
      extendedCategoryAxis0.setAxisLineStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Color color0 = (Color)PeriodAxisLabelInfo.DEFAULT_DIVIDER_PAINT;
      String[] stringArray0 = new String[6];
      SymbolAxis symbolAxis0 = new SymbolAxis("cof>!x-zpf$kwv", stringArray0);
      symbolAxis0.setAxisLinePaint(color0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("CategoryAnchor.END");
      // Undeclared exception!
      try { 
        categoryAxis3D0.setLabelInsets((RectangleInsets) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'insets' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("@NO");
      DateAxis dateAxis0 = new DateAxis("@NO");
      dateAxis0.setLabelInsets(logarithmicAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("9n");
      // Undeclared exception!
      try { 
        logarithmicAxis0.setLabelPaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "cof>!x-zpf$kwv");
      Color color0 = (Color)PeriodAxisLabelInfo.DEFAULT_DIVIDER_PAINT;
      cyclicNumberAxis0.setLabelPaint(color0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[9];
      SymbolAxis symbolAxis0 = new SymbolAxis("project.info", stringArray0);
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      symbolAxis0.setLabelFont(spiderWebPlot0.DEFAULT_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("@NO");
      DateAxis dateAxis0 = new DateAxis("@NO");
      dateAxis0.setLabelFont(logarithmicAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SymbolAxis symbolAxis0 = new SymbolAxis("e$nB9UQ9jd", stringArray0);
      symbolAxis0.setLabel("");
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "");
      cyclicNumberAxis0.setVisible(false);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("o{-Qk@,>xr^o%_@M.U<");
      categoryAxis0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setTickMarkInsideLength(0.0F);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D((String) null);
      String string0 = numberAxis3D0.getLabelToolTip();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.05, "qf-O~A])5'Tr3Cl");
      String string0 = cyclicNumberAxis0.getLabelURL();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("o{-Qk@,>xr^o%_@M.U<");
      categoryAxis0.setLabelToolTip("o{-Qk@,>xr^o%_@M.U<");
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("%d`-");
      categoryAxis0.setLabelAngle((-1.7976931348623157E308));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("CategoryAnchor.END");
      categoryAxis3D0.setTickMarkOutsideLength((-2248.41F));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("project.name");
      Object object0 = categoryAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.05, "qf-O~A])5'Tr3Cl");
      cyclicNumberAxis0.setLabelURL((String) null);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      PeriodAxis periodAxis0 = new PeriodAxis("");
      JFreeChart jFreeChart0 = new JFreeChart("", periodAxis0.DEFAULT_AXIS_LABEL_FONT, fastScatterPlot0, true);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(51, 10, 0.05, (double) (-3871.65F), chartRenderingInfo0);
  }
}
