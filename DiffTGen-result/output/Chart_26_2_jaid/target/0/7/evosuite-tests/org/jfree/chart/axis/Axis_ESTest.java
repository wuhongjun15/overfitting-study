/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 13:09:07 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.AxisSpace;
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
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.Range;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.xy.CategoryTableXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("'*4Hp&7+#\"x");
      logarithmicAxis0.configure();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[3];
      SymbolAxis symbolAxis0 = new SymbolAxis("Z]IE9(v4[dkO", stringArray0);
      symbolAxis0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("#S]^C{X");
      categoryAxis0.addChangeListener((AxisChangeListener) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("Y:co.+9*rnhs85");
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset(0.2);
      MeterPlot meterPlot0 = new MeterPlot(defaultValueDataset0);
      extendedCategoryAxis0.setPlot(meterPlot0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2412.4857102706, ",dCJ7m5*k>W");
      Color color0 = (Color)AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
      cyclicNumberAxis0.setTickMarkPaint(color0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("4D~C0W=}M");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      Stroke stroke0 = combinedRangeCategoryPlot0.getRangeCrosshairStroke();
      categoryAxis3D0.setTickMarkStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      Paint paint0 = stackedAreaRenderer0.getBaseItemLabelPaint();
      periodAxis0.setTickLabelPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      Range range0 = categoryTableXYDataset0.getDomainBounds(false);
      ModuloAxis moduloAxis0 = new ModuloAxis("b", range0);
      // Undeclared exception!
      try { 
        moduloAxis0.setAxisLinePaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("4D~C0W=}M");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      categoryAxis3D0.setLabelInsets(combinedRangeCategoryPlot0.DEFAULT_INSETS);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("4D~C0W=}M");
      categoryAxis3D0.setLabelInsets(categoryAxis3D0.DEFAULT_AXIS_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(416.569, 416.569);
      String string0 = cyclicNumberAxis0.getLabelToolTip();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("#S]^C{X");
      categoryAxis0.removeChangeListener((AxisChangeListener) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("Null 'font' argument.");
      logarithmicAxis0.setLabelToolTip("Null 'font' argument.");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("org.jfree.data.xy.DefaultOHLCDataset");
      subCategoryAxis0.setLabelAngle(0.0F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-2842.0433164854), "Fe+]t#y=~+");
      double double0 = cyclicNumberAxis0.getFixedDimension();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("", (Range) null);
      boolean boolean0 = moduloAxis0.isTickMarksVisible();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      Stroke stroke0 = logarithmicAxis0.getAxisLineStroke();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      Object object0 = categoryAxis3D0.clone();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.setFixedDimension((-2039.694270910074));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("#S]^C{X");
      Paint paint0 = categoryAxis0.getAxisLinePaint();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset(0.2);
      MeterPlot meterPlot0 = new MeterPlot(defaultValueDataset0);
      NumberAxis numberAxis0 = new NumberAxis("SansSerif");
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Y:co.+9*rnhs85");
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(1.0F, (-1927.9F), (-2078.51F), (-525.77F));
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getRangeAxisEdge(270);
      AxisSpace axisSpace0 = new AxisSpace();
      // Undeclared exception!
      try { 
        subCategoryAxis0.reserveSpace((Graphics2D) null, meterPlot0, rectangle2D_Float0, rectangleEdge0, axisSpace0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }
}
