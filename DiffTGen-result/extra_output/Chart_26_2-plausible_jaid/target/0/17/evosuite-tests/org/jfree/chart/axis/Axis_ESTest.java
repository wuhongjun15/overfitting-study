/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:47:09 GMT 2020
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
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
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
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
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
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      extendedCategoryAxis0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      Paint paint0 = numberAxis3D0.getAxisLinePaint();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      double double0 = categoryAxis3D0.getLabelAngle();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("47)s!*)'");
      RectangleInsets rectangleInsets0 = subCategoryAxis0.getTickLabelInsets();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("ev@uW~,Ck+HB[|/");
      categoryAxis3D0.setAxisLineVisible(true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(0, hour0);
      PeriodAxis periodAxis0 = new PeriodAxis((String) null, minute0, hour0);
      boolean boolean0 = periodAxis0.isTickLabelsVisible();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(668.5121891, 668.5121891);
      boolean boolean0 = cyclicNumberAxis0.isTickMarksVisible();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[9];
      SymbolAxis symbolAxis0 = new SymbolAxis("@rgea=[SZqpt", stringArray0);
      Font font0 = symbolAxis0.getTickLabelFont();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("jLXp?H=D#|!EEz");
      Stroke stroke0 = categoryAxis0.getAxisLineStroke();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("Null 'stroke' argument.");
      Font font0 = dateAxis0.getLabelFont();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("w>=&aM ");
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      CategoryPlot categoryPlot0 = new CategoryPlot(defaultKeyedValues2DDataset0, extendedCategoryAxis0, numberAxis3D0, stackedBarRenderer3D0);
      numberAxis3D0.addChangeListener(categoryPlot0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("5k{-{4");
      double double0 = periodAxis0.getFixedDimension();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[7];
      SymbolAxis symbolAxis0 = new SymbolAxis((String) null, stringArray0);
      String string0 = symbolAxis0.getLabel();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[5];
      SymbolAxis symbolAxis0 = new SymbolAxis("$* \"]J<ixp#C5-?P8", stringArray0);
      boolean boolean0 = symbolAxis0.isAxisLineVisible();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("6mlh?wmlx");
      ExtendedCategoryAxis extendedCategoryAxis1 = new ExtendedCategoryAxis("6mlh?wmlx");
      boolean boolean0 = extendedCategoryAxis0.equals(extendedCategoryAxis1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((-952.3514538642665));
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      ModuloAxis moduloAxis0 = new ModuloAxis("", logarithmicAxis0.DEFAULT_RANGE);
      moduloAxis0.setTickMarkPaint(logarithmicAxis0.DEFAULT_AXIS_LINE_PAINT);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("u=*^qXPoFm`2v`<uB");
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("n%@Kl}GLDIRDcrX");
      subCategoryAxis0.setTickMarkStroke(logarithmicAxis0.DEFAULT_AXIS_LINE_STROKE);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      // Undeclared exception!
      try { 
        numberAxis3D0.setTickMarkStroke((Stroke) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("Null 'stroke' argument.");
      BasicStroke basicStroke0 = (BasicStroke)CategoryPlot.DEFAULT_GRIDLINE_STROKE;
      dateAxis0.setTickMarkStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      extendedCategoryAxis0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      symbolAxis0.setTickLabelInsets(symbolAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("kCkr$1mr");
      Color color0 = (Color)SpiderWebPlot.DEFAULT_LABEL_OUTLINE_PAINT;
      categoryAxis3D0.setTickLabelPaint(color0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis(")C ");
      // Undeclared exception!
      try { 
        dateAxis0.setTickLabelFont((Font) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("\t|]Z}C;lbmGQQEWu");
      logarithmicAxis0.setTickLabelFont(logarithmicAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setTickLabelsVisible(false);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(641.701);
      cyclicNumberAxis0.setTickLabelsVisible(true);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("oT<Vw");
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
  public void test29()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Stroke stroke0 = combinedDomainXYPlot0.getRangeGridlineStroke();
      dateAxis0.setAxisLineStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("S");
      // Undeclared exception!
      try { 
        logarithmicAxis0.setAxisLinePaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      SystemColor systemColor0 = SystemColor.textText;
      categoryAxis3D0.setAxisLinePaint(systemColor0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
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
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("\t|]Z}C;lbmGQQEWu");
      logarithmicAxis0.setLabelInsets(logarithmicAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("jLXp?H=D#|!EEz");
      Color color0 = Color.CYAN;
      categoryAxis0.setLabelPaint(color0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.setLabel("fVr0[[w\"#V3c2");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("ev@uW~,Ck+HB[|/");
      categoryAxis3D0.setVisible(false);
      categoryAxis3D0.setVisible(false);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setTickMarkInsideLength((-1066.3724F));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      String string0 = numberAxis0.getLabelToolTip();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      categoryAxis3D0.setLabelToolTip("SYhMB^<9IE$Y/");
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("u=*^qXPoFm`2v`<uB");
      subCategoryAxis0.setLabelAngle((-167));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Null 'insets' argument.");
      numberAxis3D0.setTickMarkOutsideLength((-1282.965F));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("Null 'last' argument.");
      Paint paint0 = categoryAxis3D0.getLabelPaint();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("MGou");
      Object object0 = categoryAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[7];
      SymbolAxis symbolAxis0 = new SymbolAxis(" m21B<*qiM", stringArray0);
      symbolAxis0.setLabelURL("org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator");
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("");
      Paint paint0 = numberAxis3D0.getTickLabelPaint();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(187.38682771, 187.38682771, "org.jfree.chart.event.MarkerChangeListener");
      cyclicNumberAxis0.setFixedDimension((-1310.7158));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D((String) null);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart((String) null, numberAxis3D0.DEFAULT_TICK_LABEL_FONT, combinedDomainCategoryPlot0, true);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 1765, chartRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("H");
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(periodAxis0);
      JFreeChart jFreeChart0 = new JFreeChart(combinedRangeXYPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(55, 10, chartRenderingInfo0);
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.jfree.chart.axis.PeriodAxis", e);
      }
  }
}
