/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:50:24 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.util.EventListener;
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
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer;
import org.jfree.data.Range;
import org.jfree.data.time.Day;
import org.jfree.data.time.Minute;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(categoryAxis0);
      categoryAxis0.notifyListeners(axisChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2.0F);
      cyclicNumberAxis0.configure();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      double double0 = categoryAxis0.getLabelAngle();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      boolean boolean0 = categoryAxis0.isVisible();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("yg<");
      extendedCategoryAxis0.setAxisLineVisible(false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("SansSerif", (Range) null);
      boolean boolean0 = moduloAxis0.isTickLabelsVisible();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      CompassPlot compassPlot0 = new CompassPlot();
      periodAxis0.addChangeListener(compassPlot0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("", combinedDomainCategoryPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(3385, 10, (double) 500, 2.0, chartRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.SubCategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("cB]");
      boolean boolean0 = categoryAxis0.hasListener((EventListener) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setTickMarkPaint(dateAxis0.DEFAULT_TICK_MARK_PAINT);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("cB]");
      AreaRenderer areaRenderer0 = new AreaRenderer();
      Stroke stroke0 = areaRenderer0.getBaseStroke();
      logarithmicAxis0.setTickMarkStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("SansSerif", (Range) null);
      moduloAxis0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      Paint paint0 = combinedDomainXYPlot0.getRangeCrosshairPaint();
      numberAxis0.setTickLabelPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("a8PBxoT`");
      logarithmicAxis0.setTickLabelFont(logarithmicAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("");
      // Undeclared exception!
      try { 
        numberAxis3D0.setTickLabelFont((Font) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("(");
      categoryAxis0.setTickLabelFont(categoryAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(4.0, 4.0, "");
      cyclicNumberAxis0.setTickLabelsVisible(true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("B)\"F[+nV51");
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      Stroke stroke0 = stackedAreaRenderer0.getBaseOutlineStroke();
      extendedCategoryAxis0.setAxisLineStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(cyclicNumberAxis0);
      Paint paint0 = combinedDomainXYPlot0.getDomainZeroBaselinePaint();
      cyclicNumberAxis0.setAxisLinePaint(paint0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("yg<");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(3462.735746, 531.2509786618579);
      extendedCategoryAxis0.setLabelInsets(cyclicNumberAxis0.DEFAULT_AXIS_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Paolo Cova");
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      Paint paint0 = xYBoxAndWhiskerRenderer0.getBoxPaint();
      numberAxis3D0.setLabelPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      Font font0 = combinedRangeCategoryPlot0.getNoDataMessageFont();
      dateAxis0.setLabelFont(font0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      PeriodAxis periodAxis0 = new PeriodAxis("");
      periodAxis0.setLabelFont(categoryAxis3D0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("ZHX AG");
      logarithmicAxis0.setLabel("dOD?");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-2486.57826514503), "%#\"a");
      cyclicNumberAxis0.setVisible(false);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("B)\"F[+nV51");
      extendedCategoryAxis0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.setTickMarkInsideLength(1.0F);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[9];
      SymbolAxis symbolAxis0 = new SymbolAxis("SansSerif", stringArray0);
      String string0 = symbolAxis0.getLabelToolTip();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      subCategoryAxis0.removeChangeListener(combinedDomainCategoryPlot0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("O,H(}W");
      String string0 = categoryAxis3D0.getLabelURL();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("cB]");
      AreaRenderer areaRenderer0 = new AreaRenderer();
      logarithmicAxis0.setLabelAngle((double) areaRenderer0.ZERO);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      categoryAxis3D0.setTickMarkOutsideLength((-1585.6454F));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Minute minute0 = new Minute();
      Day day0 = minute0.getDay();
      PeriodAxis periodAxis0 = new PeriodAxis("pUl", day0, day0);
      Paint paint0 = periodAxis0.getLabelPaint();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      Stroke stroke0 = periodAxis0.getAxisLineStroke();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("yg<");
      Object object0 = extendedCategoryAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Paolo Cova");
      numberAxis3D0.setLabelURL("Paolo Cova");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("14*Fzs\"zICs");
      Paint paint0 = dateAxis0.getTickLabelPaint();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("?iTK,'4*");
      logarithmicAxis0.setFixedDimension((-1.7976931348623157E308));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "uyBtq{UETT;(#cr");
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.estimateMaximumTickLabelWidth((Graphics2D) null, dateAxis0.DEFAULT_DATE_TICK_UNIT);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.NumberAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Null 'percentFormatter' argument.");
      Paint paint0 = subCategoryAxis0.getAxisLinePaint();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis(".");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("", combinedDomainCategoryPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(3385, 10, (double) 500, 2.0, chartRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.SubCategoryAxis", e);
      }
  }
}
