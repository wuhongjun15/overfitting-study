/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:33:46 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JPopupMenu;
import javax.swing.border.BevelBorder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      NumberAxis numberAxis0 = (NumberAxis)thermometerPlot0.getRangeAxis();
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(numberAxis0);
      numberAxis0.notifyListeners(axisChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SymbolAxis symbolAxis0 = new SymbolAxis("Null 'stroke' argument.", stringArray0);
      DateAxis dateAxis0 = new DateAxis();
      boolean boolean0 = symbolAxis0.equals(dateAxis0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SymbolAxis symbolAxis0 = new SymbolAxis("l{!^;", stringArray0);
      PolarPlot polarPlot0 = new PolarPlot();
      JFreeChart jFreeChart0 = new JFreeChart("Null 'shape' argument.", polarPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      BevelBorder bevelBorder0 = new BevelBorder(15);
      JPopupMenu jPopupMenu0 = new JPopupMenu("Null 'shape' argument.");
      Rectangle rectangle0 = bevelBorder0.getInteriorRectangle((Component) jPopupMenu0, 10, 0, 0, 0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      AxisLocation axisLocation0 = combinedDomainXYPlot0.getDomainAxisLocation();
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      RectangleEdge rectangleEdge0 = Plot.resolveDomainAxisLocation(axisLocation0, plotOrientation0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        symbolAxis0.draw(graphics2D0, (-1121.184), rectangle0, (Rectangle2D) null, rectangleEdge0, plotRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.ValueAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      Font font0 = categoryAxis3D0.getTickLabelFont();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      Plot plot0 = dateAxis0.getPlot();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      categoryAxis0.addChangeListener((AxisChangeListener) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("tNu_VyS|*eDHf.+");
      logarithmicAxis0.setPlot((Plot) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("QM$I8/n2-8}-nyq=BB(");
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Paint paint0 = stackedAreaRenderer0.lookupSeriesPaint(1353);
      extendedCategoryAxis0.setTickMarkPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("Not implemented in SegmentRange");
      // Undeclared exception!
      try { 
        extendedCategoryAxis0.setTickMarkStroke((Stroke) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      PiePlot piePlot0 = new PiePlot();
      Stroke stroke0 = piePlot0.getLabelOutlineStroke();
      categoryAxis0.setTickMarkStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      categoryAxis0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("LP<Tj$jYbSz]X");
      subCategoryAxis0.setTickLabelInsets(subCategoryAxis0.DEFAULT_AXIS_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("QM$I8/n2-8}-nyq=BB(");
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      extendedCategoryAxis0.setTickLabelPaint(stackedAreaRenderer0.DEFAULT_VALUE_LABEL_PAINT);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("LP<Tj$jYbSz]X");
      // Undeclared exception!
      try { 
        subCategoryAxis0.setTickLabelFont((Font) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[9];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      symbolAxis0.setTickLabelsVisible(false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      BasicStroke basicStroke0 = (BasicStroke)Axis.DEFAULT_TICK_MARK_STROKE;
      categoryAxis0.setAxisLineStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      DateAxis dateAxis0 = new DateAxis();
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      PolarPlot polarPlot0 = new PolarPlot(defaultXYDataset0, dateAxis0, defaultPolarItemRenderer0);
      Paint paint0 = polarPlot0.getAngleLabelPaint();
      categoryAxis0.setAxisLinePaint(paint0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(20000.0, 20000.0);
      Color color0 = Color.BLACK;
      GradientPaint gradientPaint0 = new GradientPaint(500, 500, color0, 500, 0.0F, color0);
      cyclicNumberAxis0.setLabelPaint(gradientPaint0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.0, "org.jfree.chart.renderer.GrayPaintScale");
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("org.jfree.chart.renderer.GrayPaintScale");
      logarithmicAxis0.setLabelFont(cyclicNumberAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(270.0, "%");
      cyclicNumberAxis0.setLabel("%");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("Bill Kelemen");
      extendedCategoryAxis0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("Sow");
      periodAxis0.setTickMarkInsideLength(2.0F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SymbolAxis symbolAxis0 = new SymbolAxis("org.jfree.chart.labels.ItemLabelAnchor", stringArray0);
      float float0 = symbolAxis0.getTickMarkOutsideLength();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("Dt0Yd5q!*|~']f");
      logarithmicAxis0.removeChangeListener((AxisChangeListener) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("m");
      String string0 = categoryAxis3D0.getLabelURL();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("Sow");
      categoryAxis0.setLabelToolTip("");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("Sow");
      categoryAxis0.setLabelAngle(1483.884912841844);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Null 'icon' argument.");
      subCategoryAxis0.setTickMarkOutsideLength(156.3F);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("i<prYgbO<nK(|_M|e>");
      Paint paint0 = logarithmicAxis0.getLabelPaint();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      double double0 = categoryAxis3D0.getFixedDimension();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("QM$I8/n2-8}-nyq=BB(");
      RectangleInsets rectangleInsets0 = extendedCategoryAxis0.getLabelInsets();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis((String) null);
      boolean boolean0 = numberAxis0.isTickMarksVisible();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(270.0, "%");
      Object object0 = cyclicNumberAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("Sow");
      boolean boolean0 = periodAxis0.isVisible();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      Paint paint0 = valueAxis0.getTickLabelPaint();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setFixedDimension(0.05);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset(2.0);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      boolean boolean0 = valueAxis0.isAxisLineVisible();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      RectangleInsets rectangleInsets0 = dateAxis0.getTickLabelInsets();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("PlotOrientation.HORIZONTAL");
      Paint paint0 = periodAxis0.getAxisLinePaint();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      boolean boolean0 = valueAxis0.isTickLabelsVisible();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      Font font0 = categoryAxis0.getLabelFont();
  }
}