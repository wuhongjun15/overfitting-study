/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 12:53:19 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Paint;
import java.awt.Stroke;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.annotations.XYPointerAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.needle.ArrowNeedle;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      double[][] doubleArray0 = new double[5][1];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot(defaultIntervalCategoryDataset0, tableOrder0);
      boolean boolean0 = valueAxis0.equals(spiderWebPlot0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("ZpY_ *ef");
      PolarPlot polarPlot0 = new PolarPlot();
      periodAxis0.addChangeListener(polarPlot0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setAxisLineVisible(false);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("Null 'state' argument.");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      dateAxis0.setPlot(combinedDomainCategoryPlot0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("[-*<a;Yh-o0+M![p");
      XYPointerAnnotation xYPointerAnnotation0 = new XYPointerAnnotation("www.markwatson.com", 0.05, 0.0, 915.6107358412);
      Paint paint0 = xYPointerAnnotation0.getPaint();
      dateAxis0.setTickMarkPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("RW9om@");
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      Stroke stroke0 = defaultPolarItemRenderer0.getItemOutlineStroke(66, 2607);
      logarithmicAxis0.setTickMarkStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0);
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
  public void test07()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      ArrowNeedle arrowNeedle0 = new ArrowNeedle(false);
      Stroke stroke0 = arrowNeedle0.getOutlineStroke();
      numberAxis3D0.setAxisLineStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("0'}JvP+c0iz8kmd@&o");
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getBackgroundNonSelectionColor();
      logarithmicAxis0.setAxisLinePaint(color0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[1];
      SymbolAxis symbolAxis0 = new SymbolAxis("org.jfree.chart.resources.JFreeChartResources", stringArray0);
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      Paint paint0 = boxAndWhiskerRenderer0.getArtifactPaint();
      symbolAxis0.setLabelPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "5Wh");
      MeterPlot meterPlot0 = new MeterPlot();
      cyclicNumberAxis0.setLabelFont(meterPlot0.DEFAULT_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "5Wh");
      cyclicNumberAxis0.setLabelFont(cyclicNumberAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("wFj/jC");
      dateAxis0.setLabel("aHbc^gR/36fzAl7");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "5Wh");
      cyclicNumberAxis0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      String string0 = numberAxis3D0.getLabel();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("wFj/jC");
      dateAxis0.setTickMarkInsideLength(0.0F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      categoryAxis3D0.removeChangeListener(multiplePiePlot0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("[-*<a;Yh-o0+M![p");
      dateAxis0.setLabelToolTip((String) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis((String) null);
      categoryAxis0.setLabelAngle(3.0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("5(@5*'k-o'2`s}/h%");
      double double0 = subCategoryAxis0.getLabelAngle();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Null 'order' argument");
      Paint paint0 = numberAxis3D0.getLabelPaint();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      Stroke stroke0 = categoryAxis3D0.getAxisLineStroke();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("*teuU");
      Font font0 = numberAxis3D0.getTickLabelFont();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[4];
      SymbolAxis symbolAxis0 = new SymbolAxis("W", stringArray0);
      Object object0 = symbolAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      Stroke stroke0 = valueAxis0.getTickMarkStroke();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(504.3166050415, "&u4hpNei0)Khtl9 2");
      ModuloAxis moduloAxis0 = new ModuloAxis("", cyclicNumberAxis0.DEFAULT_RANGE);
      boolean boolean0 = moduloAxis0.isVisible();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("b|Vq~N{FO(V`e'{.<");
      Paint paint0 = categoryAxis0.getTickLabelPaint((Comparable) 0.05);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(3688.6776296, 420.0, ", columnKey=");
      cyclicNumberAxis0.setFixedDimension(3688.6776296);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("[-*<a;Yh-o0+M![p");
      boolean boolean0 = dateAxis0.isAxisLineVisible();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1896.0);
      boolean boolean0 = cyclicNumberAxis0.isTickLabelsVisible();
  }
}
