/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 13:21:13 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.text.AttributedCharacterIterator;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
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
import org.jfree.chart.block.FlowArrangement;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.util.HorizontalAlignment;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.VerticalAlignment;
import org.jfree.data.general.ValueDataset;
import org.junit.runner.RunWith;

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
      DateAxis dateAxis0 = new DateAxis("Null 'state' argument.");
      String string0 = dateAxis0.getLabel();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0, "");
      String string0 = cyclicNumberAxis0.getLabel();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      Object object0 = dateAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1182.0, 1182.0, "");
      ModuloAxis moduloAxis0 = new ModuloAxis("", cyclicNumberAxis0.DEFAULT_RANGE);
      moduloAxis0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("org.jfree.chart.renderer.category.GroupedStackedBarRenderer");
      Paint paint0 = numberAxis0.getAxisLinePaint();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-30.0), "Null 'font' argument.");
      Font font0 = cyclicNumberAxis0.getTickLabelFont();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      double double0 = categoryAxis0.getLabelAngle();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[2];
      SymbolAxis symbolAxis0 = new SymbolAxis("org.jfree.chart.axis.PeriodAxis", stringArray0);
      Stroke stroke0 = symbolAxis0.getAxisLineStroke();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("sj_eD3z5B");
      Font font0 = numberAxis3D0.getLabelFont();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      boolean boolean0 = categoryAxis0.isVisible();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("Null 'font' argument.");
      PolarPlot polarPlot0 = new PolarPlot();
      periodAxis0.addChangeListener(polarPlot0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      double double0 = categoryAxis3D0.getFixedDimension();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("!hw}Kn<");
      float float0 = numberAxis0.getTickMarkOutsideLength();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setAxisLineVisible(false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      RectangleInsets rectangleInsets0 = logarithmicAxis0.getLabelInsets();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-3782.75), "T%nD^u4<\f");
      float float0 = cyclicNumberAxis0.getTickMarkInsideLength();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1.0));
      String string0 = cyclicNumberAxis0.getLabel();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis((String) null);
      MeterPlot meterPlot0 = new MeterPlot();
      dateAxis0.setPlot(meterPlot0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      boolean boolean0 = categoryAxis3D0.isTickMarksVisible();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis(".b~@7Qs;6(*w");
      SubCategoryAxis subCategoryAxis1 = new SubCategoryAxis("SansSerif");
      boolean boolean0 = subCategoryAxis0.equals(subCategoryAxis1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("sj_eD3z5B");
      ModuloAxis moduloAxis0 = new ModuloAxis("sj_eD3z5B", numberAxis3D0.DEFAULT_RANGE);
      boolean boolean0 = numberAxis3D0.equals(moduloAxis0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart(combinedDomainCategoryPlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2, 2, 0.0, (double) 0.0F, chartRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ThermometerPlot thermometerPlot0 = new ThermometerPlot((ValueDataset) null);
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      boolean boolean0 = valueAxis0.hasListener(thermometerPlot0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      numberAxis3D0.setTickMarkPaint(fastScatterPlot0.DEFAULT_GRIDLINE_PAINT);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D((String) null);
      BasicStroke basicStroke0 = (BasicStroke)XYPlot.DEFAULT_GRIDLINE_STROKE;
      categoryAxis3D0.setTickMarkStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-30.0), "Null 'font' argument.");
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D(false);
      HorizontalAlignment horizontalAlignment0 = HorizontalAlignment.RIGHT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.TOP;
      FlowArrangement flowArrangement0 = new FlowArrangement(horizontalAlignment0, verticalAlignment0, (-2993.242673789527), 1.0E-8);
      LegendTitle legendTitle0 = new LegendTitle(stackedBarRenderer3D0, flowArrangement0, flowArrangement0);
      RectangleInsets rectangleInsets0 = legendTitle0.getMargin();
      cyclicNumberAxis0.setTickLabelInsets(rectangleInsets0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-2842.6158574439), (-2842.6158574439), "dR}k[#}Pu7+0k]:x`");
      cyclicNumberAxis0.setTickLabelInsets(cyclicNumberAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      NumberAxis numberAxis0 = new NumberAxis("!hw}Kn<");
      numberAxis0.setTickLabelPaint(dateAxis0.DEFAULT_AXIS_LINE_PAINT);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis((String) null);
      HashMap<AttributedCharacterIterator.Attribute, ModuloAxis> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, ModuloAxis>();
      Font font0 = Font.getFont((Map<? extends AttributedCharacterIterator.Attribute, ?>) hashMap0);
      periodAxis0.setTickLabelFont(font0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "3YUf[_A;<?9n");
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.setTickLabelFont((Font) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("]");
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("]");
      dateAxis0.setTickLabelFont(extendedCategoryAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("sj_eD3z5B");
      numberAxis3D0.setTickLabelsVisible(false);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("");
      dateAxis0.setTickLabelsVisible(true);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SymbolAxis symbolAxis0 = new SymbolAxis("{", stringArray0);
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      Stroke stroke0 = fastScatterPlot0.getRangeGridlineStroke();
      symbolAxis0.setAxisLineStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      categoryAxis0.setLabelInsets(categoryAxis0.DEFAULT_AXIS_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis(".b~@7Qs;6(*w");
      PeriodAxis periodAxis0 = new PeriodAxis("Null 'font' argument.");
      periodAxis0.setLabelPaint(subCategoryAxis0.DEFAULT_AXIS_LABEL_PAINT);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D((String) null);
      categoryAxis3D0.setLabelFont(categoryAxis3D0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      cyclicNumberAxis0.setLabel("Null 'stroke' argument.");
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setLabel("pbs");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1668.7905737885135);
      cyclicNumberAxis0.setLabel((String) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      categoryAxis0.setVisible(false);
      boolean boolean0 = categoryAxis0.isVisible();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 1.0);
      cyclicNumberAxis0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D((String) null);
      categoryAxis3D0.setTickMarkInsideLength(8.0F);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(387.4921782773124, 1686.006, "ywCM~qZL@*[");
      String string0 = cyclicNumberAxis0.getLabelToolTip();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("Null 'positions' argument.");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(dateAxis0);
      dateAxis0.removeChangeListener(combinedDomainXYPlot0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("");
      String string0 = dateAxis0.getLabelURL();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0, "");
      cyclicNumberAxis0.setLabelToolTip("");
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("org.jfree.chart.axis.Axis");
      dateAxis0.setLabelAngle(4.0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 1.0);
      cyclicNumberAxis0.setTickMarkOutsideLength((-1380.0F));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      Paint paint0 = cyclicNumberAxis0.getLabelPaint();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setLabelURL((String) null);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      JFreeChart jFreeChart0 = new JFreeChart((String) null, combinedRangeXYPlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1020, 1239, chartRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      DateAxis dateAxis0 = new DateAxis("E?V+", timeZone0);
      Paint paint0 = dateAxis0.getTickLabelPaint();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      categoryAxis0.setFixedDimension(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("`Hk~5a2L(");
      Paint paint0 = subCategoryAxis0.getTickMarkPaint();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis((String) null);
      RectangleInsets rectangleInsets0 = extendedCategoryAxis0.getTickLabelInsets();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis((String) null);
      boolean boolean0 = periodAxis0.isTickLabelsVisible();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("+i:5o");
      float[][] floatArray0 = new float[5][4];
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot(floatArray0, periodAxis0, periodAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("", fastScatterPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      // Undeclared exception!
      jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
  }
}