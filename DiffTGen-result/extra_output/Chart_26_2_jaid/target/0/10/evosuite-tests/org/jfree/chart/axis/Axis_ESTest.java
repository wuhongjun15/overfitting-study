/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 13:13:11 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Font;
import java.awt.Paint;
import java.awt.Stroke;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.renderer.WaferMapRenderer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.general.WaferMapDataset;
import org.jfree.data.time.Month;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("|0");
      periodAxis0.addChangeListener((AxisChangeListener) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis(")>K2y53s}y&Mu%Ohb");
      WaferMapDataset waferMapDataset0 = new WaferMapDataset((-1690), (-1690), 0.05);
      WaferMapRenderer waferMapRenderer0 = new WaferMapRenderer((-1690), (-1690));
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0, waferMapRenderer0);
      periodAxis0.setPlot(waferMapPlot0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis((String) null);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Stroke stroke0 = combinedDomainXYPlot0.getRangeCrosshairStroke();
      categoryAxis0.setTickMarkStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2398.80157859);
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.setTickLabelPaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[7];
      SymbolAxis symbolAxis0 = new SymbolAxis("123g", stringArray0);
      // Undeclared exception!
      try { 
        symbolAxis0.setAxisLineStroke((Stroke) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Month month0 = new Month();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      PeriodAxis periodAxis0 = new PeriodAxis("", month0, month0, timeZone0);
      // Undeclared exception!
      try { 
        periodAxis0.setAxisLinePaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis(")>K2y53s}y&Mu%Ohb");
      // Undeclared exception!
      try { 
        periodAxis0.setLabelInsets((RectangleInsets) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'insets' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-112.273), (-112.273), (String) null);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      cyclicNumberAxis0.setLabelInsets(combinedDomainXYPlot0.DEFAULT_INSETS);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis((String) null);
      PeriodAxis periodAxis0 = new PeriodAxis("3AmtY9_q[Og'\"9m");
      categoryAxis0.setLabelPaint(periodAxis0.DEFAULT_AXIS_LINE_PAINT);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("SansSerif");
      // Undeclared exception!
      try { 
        subCategoryAxis0.setLabelFont((Font) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-250.582265), "BxT`KnB3*CcR");
      String string0 = cyclicNumberAxis0.getLabelURL();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[8];
      SymbolAxis symbolAxis0 = new SymbolAxis("UM];PL6Ug7", stringArray0);
      symbolAxis0.setLabelToolTip("UM];PL6Ug7");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("3AmtY9_q[Og'\"9m");
      periodAxis0.setLabelAngle(225.0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-250.582265), "BxT`KnB3*CcR");
      cyclicNumberAxis0.setTickMarkOutsideLength(0.0F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1544.892352629), (-1544.892352629), "?&Fa]RqNYm");
      cyclicNumberAxis0.setLabelURL("k 3.UsEWgtBAX&cRFXx");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis(")>K2y53s}y&Mu%Ohb");
      boolean boolean0 = periodAxis0.isVisible();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis((String) null);
      RectangleInsets rectangleInsets0 = categoryAxis0.getTickLabelInsets();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1544.892352629), (-1544.892352629), "?&Fa]RqNYm");
      float float0 = cyclicNumberAxis0.getTickMarkInsideLength();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1166.0653));
      boolean boolean0 = cyclicNumberAxis0.isTickLabelsVisible();
  }
}