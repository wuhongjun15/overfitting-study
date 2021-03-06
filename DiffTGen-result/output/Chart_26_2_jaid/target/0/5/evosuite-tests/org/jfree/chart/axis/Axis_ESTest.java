/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 13:08:59 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.util.SimpleTimeZone;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.data.Range;
import org.jfree.data.time.DynamicTimeSeriesCollection;
import org.jfree.data.time.Minute;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis(":U{r!wA}o");
      boolean boolean0 = logarithmicAxis0.equals(":U{r!wA}o");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1789.4548611, 1342.64828, "org.jfree.chart.axis.DateTickMarkPosition");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("HIQ;-ONL<");
      categoryAxis0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("B|h");
      SpinnerNumberModel spinnerNumberModel0 = new SpinnerNumberModel((-2207), (-2207), 0, (-2207));
      JSpinner jSpinner0 = new JSpinner(spinnerNumberModel0);
      JSpinner.DefaultEditor jSpinner_DefaultEditor0 = new JSpinner.DefaultEditor(jSpinner0);
      boolean boolean0 = extendedCategoryAxis0.hasListener(jSpinner_DefaultEditor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.5707963267948966, "zS7Q#oO5Gc5[8Zj)");
      PiePlot3D piePlot3D0 = new PiePlot3D();
      Stroke stroke0 = piePlot3D0.getBaseSectionOutlineStroke();
      cyclicNumberAxis0.setTickMarkStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[2];
      SymbolAxis symbolAxis0 = new SymbolAxis("syzx7C[g)", stringArray0);
      symbolAxis0.setLabelInsets(symbolAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("HIQ;-ONL<");
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      Paint paint0 = fastScatterPlot0.getDomainGridlinePaint();
      categoryAxis0.setLabelPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("");
      numberAxis0.setTickMarkInsideLength(0.0F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("");
      numberAxis0.setAxisLineVisible(true);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2308, (-940), 266, 266, 266);
      SimpleTimeZone simpleTimeZone0 = (SimpleTimeZone)SegmentedTimeline.NO_DST_TIME_ZONE;
      Minute minute0 = new Minute(mockDate0, simpleTimeZone0);
      DynamicTimeSeriesCollection dynamicTimeSeriesCollection0 = new DynamicTimeSeriesCollection(0, 699, minute0);
      Range range0 = dynamicTimeSeriesCollection0.getRangeBounds(false);
      ModuloAxis moduloAxis0 = new ModuloAxis("E9DD*VNee]^(r*", range0);
      moduloAxis0.setLabelURL("mt82SzjEs*mqMts_@");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis(";:^C,fk?bfJ");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart(",n9uHs!0Bz[/%tT`m3", logarithmicAxis0.DEFAULT_AXIS_LABEL_FONT, combinedRangeCategoryPlot0, true);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1371, (int) (short)100);
  }
}
