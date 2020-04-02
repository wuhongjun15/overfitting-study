/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 11:50:34 GMT 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Paint;
import java.awt.geom.AffineTransform;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.util.Stack;
import javax.swing.JList;
import javax.swing.plaf.basic.BasicListUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.util.ObjectList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      PiePlot piePlot0 = new PiePlot();
      PieSectionLabelGenerator pieSectionLabelGenerator0 = piePlot0.getLegendLabelToolTipGenerator();
      piePlot0.setLegendLabelToolTipGenerator((PieSectionLabelGenerator) null);
      Paint paint0 = piePlot0.lookupSectionPaint(10);
      combinedDomainXYPlot0.setBackgroundPaint(paint0);
      combinedDomainXYPlot0.mapDatasetToDomainAxis(628, 628);
      // Undeclared exception!
      try { 
        combinedDomainXYPlot0.removeRangeMarker((Marker) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'marker' argument.
         //
         verifyException("org.jfree.chart.plot.XYPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(numberAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("$n3O", numberAxis0.DEFAULT_TICK_LABEL_FONT, combinedRangeXYPlot0, true);
      int int0 = 3792;
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 15, (-2729), (-2729), 3535, 3792, 531, true, true, true, false, false, false, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        plotRenderingInfo0.getSubplotInfo(10);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 10, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(periodAxis0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 2.0F;
      doubleArray0[1] = 1.0E-8;
      doubleArray0[2] = (double) 2.0F;
      doubleArray0[3] = (double) 0.0F;
      doubleArray0[4] = (double) 1.0F;
      doubleArray0[5] = (double) 2.0F;
      doubleArray0[6] = (double) 1.0F;
      doubleArray0[7] = 0.05;
      AffineTransform affineTransform0 = new AffineTransform(doubleArray0);
      BasicListUI basicListUI0 = new BasicListUI();
      Stack<ObjectList> stack0 = new Stack<ObjectList>();
      JList<ObjectList> jList0 = new JList<ObjectList>(stack0);
      // Undeclared exception!
      try { 
        basicListUI0.indexToLocation(jList0, 2664);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.plaf.basic.BasicListUI", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      ValueAxis[] valueAxisArray0 = new ValueAxis[4];
      String string0 = "";
      DayOfWeek dayOfWeek0 = DayOfWeek.TUESDAY;
      // Undeclared exception!
      try { 
        MockThaiBuddhistDate.from(dayOfWeek0);
      } catch(DateTimeException e) {
         //
         // Unable to obtain LocalDate from TemporalAccessor: TUESDAY of type java.time.DayOfWeek
         //
         verifyException("java.time.LocalDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = (-986.589221687);
      boolean boolean0 = false;
      DateFormat dateFormat0 = DateFormat.getTimeInstance();
      DecimalFormat decimalFormat0 = null;
      try {
        decimalFormat0 = new DecimalFormat((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }
}