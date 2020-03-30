/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 13:13:13 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Paint;
import javax.swing.JTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.labels.XYToolTipGenerator;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.general.DefaultValueDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis(" E(");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-448.837674101));
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(cyclicNumberAxis0);
      extendedCategoryAxis0.notifyListeners(axisChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("");
      dateAxis0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0);
      cyclicNumberAxis0.setAxisLineVisible(true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("lwDHH=13^%", (Range) null);
      PolarPlot polarPlot0 = new PolarPlot();
      // Undeclared exception!
      try { 
        moduloAxis0.setPlot(polarPlot0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'range' argument.
         //
         verifyException("org.jfree.chart.axis.ValueAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      // Undeclared exception!
      try { 
        categoryAxis0.setTickMarkPaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis(">@zygU))&\"sKc9SIj99");
      periodAxis0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("u_-x'L{@E1Es");
      Color color0 = Color.magenta;
      subCategoryAxis0.setTickLabelPaint(color0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[6];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      // Undeclared exception!
      try { 
        symbolAxis0.setTickLabelFont((Font) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis((String) null);
      BasicStroke basicStroke0 = (BasicStroke)PolarPlot.DEFAULT_GRIDLINE_STROKE;
      periodAxis0.setAxisLineStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("Invalid 'percent' (");
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(0.05, false, (XYToolTipGenerator) null);
      Paint paint0 = candlestickRenderer0.getBaseItemLabelPaint();
      dateAxis0.setAxisLinePaint(paint0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("u_-x'L{@E1Es");
      // Undeclared exception!
      try { 
        subCategoryAxis0.setLabelInsets((RectangleInsets) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'insets' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("N7)");
      subCategoryAxis0.setLabelInsets(subCategoryAxis0.DEFAULT_AXIS_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((Number) 0.2);
      MeterPlot meterPlot0 = new MeterPlot(defaultValueDataset0);
      subCategoryAxis0.setLabelFont(meterPlot0.DEFAULT_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setLabelFont(subCategoryAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("u_-x'L{@E1Es");
      subCategoryAxis0.setLabel("MSY7@L");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("d:g3$=gr\"9/a}>Mdh+_");
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) logarithmicAxis0;
      JTree jTree0 = new JTree(objectArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(500, 500, "lkf=3!|MU");
      cyclicNumberAxis0.setTickMarkInsideLength(2.0F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("");
      float float0 = dateAxis0.getTickMarkOutsideLength();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("Invalid 'percent' (");
      dateAxis0.setLabelAngle(1.5707963267948966);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setTickMarkOutsideLength(0.85F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      RectangleInsets rectangleInsets0 = logarithmicAxis0.getLabelInsets();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(4354.937, (-205.7098083576866), (String) null);
      Object object0 = cyclicNumberAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      thermometerPlot0.setSubrangeInfo(0, 0.2, 0.2);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setLabelURL("a%8kKcm<Bew@vbSn");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis(",N?M +g8D9_8");
      Paint paint0 = extendedCategoryAxis0.getTickLabelPaint((Comparable) ",N?M +g8D9_8");
  }
}
