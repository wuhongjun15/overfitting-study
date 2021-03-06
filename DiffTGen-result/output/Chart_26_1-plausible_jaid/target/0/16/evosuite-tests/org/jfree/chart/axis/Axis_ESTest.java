/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:40:51 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.SystemColor;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.util.Date;
import java.util.EventListener;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.Second;
import org.jfree.data.time.Week;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(categoryAxis3D0);
      categoryAxis3D0.notifyListeners(axisChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentedTimeline segmentedTimeline0 = SegmentedTimeline.newMondayThroughFridayTimeline();
      Date date0 = segmentedTimeline0.getDate(0L);
      Second second0 = new Second(date0);
      PeriodAxis periodAxis0 = new PeriodAxis("Aq~NYMY&KyT0$`(", second0, second0);
      boolean boolean0 = periodAxis0.isTickMarksVisible();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultStatisticalCategoryDataset0);
      boolean boolean0 = numberAxis0.equals(multiplePiePlot0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("R]h-G#,#FZbM^c");
      Object object0 = dateAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(symbolAxis0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setPlot(combinedRangeXYPlot0);
      JFreeChart jFreeChart0 = new JFreeChart("", combinedRangeXYPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 500, (ChartRenderingInfo) null);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      float[] floatArray0 = new float[4];
      Kernel kernel0 = new Kernel(10, 0, floatArray0);
      ConvolveOp convolveOp0 = new ConvolveOp(kernel0);
      Rectangle2D rectangle2D0 = convolveOp0.getBounds2D(bufferedImage0);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      AxisSpace axisSpace0 = new AxisSpace();
      // Undeclared exception!
      try { 
        subCategoryAxis0.reserveSpace(graphics2D0, combinedRangeXYPlot0, rectangle2D0, rectangleEdge0, axisSpace0);
      } catch(ClassCastException e) {
         //
         // org.jfree.chart.plot.CombinedRangeXYPlot cannot be cast to org.jfree.chart.plot.CategoryPlot
         //
         verifyException("org.jfree.chart.axis.CategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      Paint paint0 = subCategoryAxis0.getAxisLinePaint();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-852.41));
      Stroke stroke0 = cyclicNumberAxis0.getAxisLineStroke();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("r{5)9m");
      boolean boolean0 = periodAxis0.isVisible();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      Plot plot0 = categoryAxis3D0.getPlot();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      Paint paint0 = cyclicNumberAxis0.getTickLabelPaint();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1113.618171));
      RectangleInsets rectangleInsets0 = cyclicNumberAxis0.getTickLabelInsets();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      Stroke stroke0 = extendedCategoryAxis0.getTickMarkStroke();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[3];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot(defaultKeyedValues2DDataset0);
      symbolAxis0.addChangeListener(spiderWebPlot0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis((String) null);
      double double0 = dateAxis0.getFixedDimension();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("nrK0/*AO;'^]]!");
      float float0 = numberAxis3D0.getTickMarkOutsideLength();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      cyclicNumberAxis0.setAxisLineVisible(true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1231.72575877934), "f#3BjDHNf'Z@");
      float float0 = cyclicNumberAxis0.getTickMarkInsideLength();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("y");
      boolean boolean0 = extendedCategoryAxis0.isTickLabelsVisible();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      boolean boolean0 = categoryAxis3D0.isTickMarksVisible();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[6];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(symbolAxis0);
      symbolAxis0.setLabelToolTip("y#");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = (SimpleTimeZone)SegmentedTimeline.NO_DST_TIME_ZONE;
      DateAxis dateAxis0 = new DateAxis("-O('wlCHAx >RSK", simpleTimeZone0);
      boolean boolean0 = dateAxis0.hasListener((EventListener) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setTickMarkStroke(logarithmicAxis0.DEFAULT_AXIS_LINE_STROKE);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      // Undeclared exception!
      try { 
        dateAxis0.setTickLabelInsets((RectangleInsets) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'insets' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Dx\" xM9");
      CategoryAxis categoryAxis0 = new CategoryAxis();
      categoryAxis0.setTickLabelInsets(numberAxis3D0.DEFAULT_AXIS_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(30.0, 30.0, ":af-.O7BrqR[`");
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      Paint paint0 = stackedAreaRenderer0.getItemLabelPaint(500, 500);
      cyclicNumberAxis0.setTickLabelPaint(paint0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      // Undeclared exception!
      try { 
        logarithmicAxis0.setTickLabelFont((Font) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("org.jfree.chart.axis.Axis");
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("org.jfree.chart.axis.Axis");
      logarithmicAxis0.setTickLabelFont(extendedCategoryAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setTickLabelsVisible(false);
      dateAxis0.setTickLabelsVisible(false);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2.0F, "~eMX339 t");
      PeriodAxis periodAxis0 = new PeriodAxis((String) null);
      periodAxis0.setAxisLineStroke(cyclicNumberAxis0.DEFAULT_AXIS_LINE_STROKE);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      // Undeclared exception!
      try { 
        categoryAxis0.setAxisLinePaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      SystemColor systemColor0 = SystemColor.textHighlight;
      dateAxis0.setAxisLinePaint(systemColor0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("!kcDfs^CE8*wb%xFa4");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1983.1063));
      cyclicNumberAxis0.setLabelInsets(extendedCategoryAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[0];
      SymbolAxis symbolAxis0 = new SymbolAxis("uFpQ:&Y5!8o=4", stringArray0);
      symbolAxis0.setLabelFont(symbolAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Week week0 = new Week(1163, 1163);
      PeriodAxis periodAxis0 = new PeriodAxis("Dx\" xM9", week0, week0, week0.DEFAULT_TIME_ZONE);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      periodAxis0.setLabelFont(categoryAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setLabel("Null 'font' argument.");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("~eMX339 t");
      logarithmicAxis0.setLabel("~eMX339 t");
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      logarithmicAxis0.setLabel("|#}j^6D~!{,!8lh,02");
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("]Nv");
      categoryAxis3D0.setVisible(false);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setTickMarkInsideLength(987.833F);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(3092.2, 0.0, "Null 'stroke' argument.");
      String string0 = cyclicNumberAxis0.getLabelToolTip();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("y");
      DateAxis dateAxis0 = new DateAxis("y");
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(dateAxis0);
      extendedCategoryAxis0.removeChangeListener(combinedRangeCategoryPlot0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      String string0 = dateAxis0.getLabelURL();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Aq~NYMY&KyT0$`(");
      subCategoryAxis0.setLabelAngle(3600000L);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("y");
      dateAxis0.setTickMarkOutsideLength(2.0F);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      double double0 = categoryAxis3D0.getLabelAngle();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("org.jfree.chart.axis.Axis");
      Paint paint0 = extendedCategoryAxis0.getLabelPaint();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1.0), 2380.870820943, "DAY");
      RectangleInsets rectangleInsets0 = cyclicNumberAxis0.getLabelInsets();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("MvVKyG`Z _\"/");
      logarithmicAxis0.setLabelURL("MvVKyG`Z _\"/");
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(cyclicNumberAxis0);
      JFreeChart jFreeChart0 = new JFreeChart(combinedDomainXYPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 10);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Null 'stroke' argument.");
      Font font0 = numberAxis3D0.getLabelFont();
  }
}
