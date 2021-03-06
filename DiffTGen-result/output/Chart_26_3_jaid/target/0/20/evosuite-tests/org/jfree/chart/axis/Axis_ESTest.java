/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 12:53:17 GMT 2020
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
import java.awt.image.BufferedImage;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Week;
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
      DateAxis dateAxis0 = new DateAxis("-)iB6o@C9rV?X~yq1:");
      ModuloAxis moduloAxis0 = new ModuloAxis("-)iB6o@C9rV?X~yq1:", dateAxis0.DEFAULT_RANGE);
      moduloAxis0.configure();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      String string0 = categoryAxis0.getLabel();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      PeriodAxis periodAxis0 = new PeriodAxis("3mE'n", millisecond0, millisecond0, millisecond0.DEFAULT_TIME_ZONE);
      periodAxis0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1376.11, (-769.189182832));
      boolean boolean0 = cyclicNumberAxis0.isVisible();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1013, "");
      DateAxis dateAxis0 = new DateAxis("", simpleTimeZone0);
      Plot plot0 = dateAxis0.getPlot();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setAxisLineVisible(false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      BasicStroke basicStroke0 = (BasicStroke)AbstractRenderer.DEFAULT_STROKE;
      extendedCategoryAxis0.setTickMarkStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("h.8qYR(Q_`#]=Gb_%#");
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
  public void test09()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      BasicStroke basicStroke0 = (BasicStroke)SpiderWebPlot.DEFAULT_LABEL_OUTLINE_STROKE;
      categoryAxis3D0.setTickMarkStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1013, "");
      DateAxis dateAxis0 = new DateAxis("", simpleTimeZone0);
      dateAxis0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GroupedStackedBarRenderer groupedStackedBarRenderer0 = new GroupedStackedBarRenderer();
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      Range range0 = groupedStackedBarRenderer0.findRangeBounds(defaultBoxAndWhiskerCategoryDataset0);
      ModuloAxis moduloAxis0 = new ModuloAxis("1#`", range0);
      // Undeclared exception!
      try { 
        moduloAxis0.setTickLabelInsets((RectangleInsets) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'insets' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("=)zo{!b%B6L7C");
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      LegendTitle legendTitle0 = new LegendTitle(spiderWebPlot0);
      categoryAxis3D0.setTickLabelInsets(legendTitle0.DEFAULT_PADDING);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "Null 'paint' argument.");
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
  public void test14()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
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
  public void test15()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("=wudkfoyq0s3Y");
      CategoryPlot categoryPlot0 = new CategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("Null 'state' argument.", categoryPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, true, true, true, true, false);
      Font font0 = chartPanel0.getFont();
      periodAxis0.setTickLabelFont(font0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("(#\"0_");
      logarithmicAxis0.setTickLabelsVisible(false);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(331.2951070608, (String) null);
      cyclicNumberAxis0.setTickLabelsVisible(true);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis(" j:);#4ix[+");
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis((String) null);
      subCategoryAxis0.setAxisLineStroke(extendedCategoryAxis0.DEFAULT_TICK_MARK_STROKE);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis(" j:);#4ix[+");
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis((String) null);
      extendedCategoryAxis0.setLabelInsets(subCategoryAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis((String) null);
      // Undeclared exception!
      try { 
        numberAxis0.setLabelPaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("org.jfree.data.resources.DataPackageResources");
      subCategoryAxis0.setLabel("org.jfree.data.resources.DataPackageResources");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1013, "");
      DateAxis dateAxis0 = new DateAxis("", simpleTimeZone0);
      dateAxis0.setLabel("Ke\"/\bc/>ZC'fY");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setLabel("");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setVisible(false);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("-W3(ulTw[", (Range) null);
      String string0 = moduloAxis0.getLabel();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("");
      dateAxis0.setTickMarkInsideLength((-4.0F));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("-)iB6o@C9rV?X~yq1:");
      float float0 = dateAxis0.getTickMarkOutsideLength();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      categoryAxis0.removeChangeListener((AxisChangeListener) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("Unknown layer.");
      String string0 = logarithmicAxis0.getLabelURL();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("V3?J#|");
      categoryAxis0.setTickMarkOutsideLength(581.0F);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("=)zo{!b%B6L7C");
      double double0 = categoryAxis3D0.getLabelAngle();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      Paint paint0 = cyclicNumberAxis0.getLabelPaint();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis((String) null);
      RectangleInsets rectangleInsets0 = periodAxis0.getLabelInsets();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis((String) null);
      Stroke stroke0 = extendedCategoryAxis0.getAxisLineStroke();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("V3?J#|");
      Object object0 = categoryAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis((String) null);
      extendedCategoryAxis0.setLabelURL("Null 'state' argument.");
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      valueAxis0.setPlot(thermometerPlot0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(3475.52969185686, 0.0, "XRx#");
      Stroke stroke0 = cyclicNumberAxis0.getTickMarkStroke();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1972.66803479), "V3?J#|");
      Paint paint0 = cyclicNumberAxis0.getTickLabelPaint();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      categoryAxis0.setFixedDimension(3603.15);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3332, 3332, 3122, (-672), (-3569));
      Week week0 = new Week(mockDate0);
      PeriodAxis periodAxis0 = new PeriodAxis("V8dPvj!z?4", week0, week0);
      RectangleInsets rectangleInsets0 = periodAxis0.getTickLabelInsets();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("s5^f$ c}{^^]+z]1c");
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 4, 6, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      RectangleEdge rectangleEdge0 = categoryPlot0.getRangeAxisEdge(273);
      AxisSpace axisSpace0 = new AxisSpace();
      // Undeclared exception!
      try { 
        subCategoryAxis0.reserveSpace(graphics2D0, multiplePiePlot0, (Rectangle2D) null, rectangleEdge0, axisSpace0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }
}
