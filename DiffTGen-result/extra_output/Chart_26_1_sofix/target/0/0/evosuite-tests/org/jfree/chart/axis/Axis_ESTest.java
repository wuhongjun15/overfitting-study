/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 12:08:48 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.block.ColumnArrangement;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Week;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Week week0 = new Week((-2658), (-2658));
      PeriodAxis periodAxis0 = new PeriodAxis("org.jfree.chart.axis.Axis", week0, week0, week0.DEFAULT_TIME_ZONE);
      Font font0 = periodAxis0.getTickLabelFont();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("Null 'stroke' argument.");
      BasicStroke basicStroke0 = (BasicStroke)XYPlot.DEFAULT_GRIDLINE_STROKE;
      categoryAxis0.setTickMarkStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("?UgL|");
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      Stroke stroke0 = defaultPolarItemRenderer0.getItemOutlineStroke(0, 0);
      categoryAxis3D0.setTickMarkStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("w{0=hB57%4");
      RectangleInsets rectangleInsets0 = Plot.DEFAULT_INSETS;
      dateAxis0.setTickLabelInsets(rectangleInsets0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("w{0=hB57%4");
      dateAxis0.setTickLabelInsets(dateAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("org.jfree.chart.axis.Axis");
      periodAxis0.setTickLabelFont(periodAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleInsets rectangleInsets0 = combinedDomainXYPlot0.getAxisOffset();
      subCategoryAxis0.setLabelInsets(rectangleInsets0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setLabelInsets(subCategoryAxis0.DEFAULT_AXIS_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1540.1492, (String) null);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      cyclicNumberAxis0.setLabelFont(subCategoryAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      extendedCategoryAxis0.setVisible(false);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setLabelToolTip("");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("org.jfree.chart.axis.Axis");
      periodAxis0.setTickMarkOutsideLength(2.0F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      Object object0 = categoryAxis3D0.clone();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1540.1492, (String) null);
      boolean boolean0 = cyclicNumberAxis0.isVisible();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Paint paint0 = categoryAxis0.getTickLabelPaint((Comparable) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1540.1492, (String) null);
      cyclicNumberAxis0.setFixedDimension(1.0F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-3303.38750594555), (-3303.38750594555), "");
      CompassPlot compassPlot0 = new CompassPlot();
      ColumnArrangement columnArrangement0 = new ColumnArrangement();
      LegendTitle legendTitle0 = new LegendTitle(compassPlot0, columnArrangement0, columnArrangement0);
      Rectangle2D rectangle2D0 = legendTitle0.getBounds();
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.selectAutoTickUnit((Graphics2D) null, rectangle2D0, legendTitle0.DEFAULT_POSITION);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.NumberAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2433.8217675, 2433.8217675, "_=Wo}!+L-ix`M/_R");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      RectangleEdge rectangleEdge0 = combinedDomainXYPlot0.getDomainAxisEdge(500);
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.getLabelEnclosure((Graphics2D) null, rectangleEdge0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }
}