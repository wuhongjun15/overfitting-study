/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 28 13:09:13 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.TimeZone;
import javax.swing.JList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
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
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.text.TextFragment;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.time.Month;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("Null 'time' argument.", (Range) null);
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(moduloAxis0);
      moduloAxis0.notifyListeners(axisChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      boolean boolean0 = dateAxis0.equals(logarithmicAxis0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("(");
      Object object0 = dateAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("pzb<0%~:2|!ie");
      double double0 = dateAxis0.getLabelAngle();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-4796.5), (-4796.5), "");
      RectangleInsets rectangleInsets0 = cyclicNumberAxis0.getTickLabelInsets();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("|F3[6p:cepIYHp3Ps");
      XYPlot xYPlot0 = new XYPlot();
      logarithmicAxis0.addChangeListener(xYPlot0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Month month0 = new Month();
      PeriodAxis periodAxis0 = new PeriodAxis("VnY,Eu(z/:UW", month0, month0, month0.DEFAULT_TIME_ZONE);
      periodAxis0.setAxisLineVisible(false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateAxis dateAxis0 = new DateAxis("", timeZone0);
      String string0 = dateAxis0.getLabel();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1019.1));
      boolean boolean0 = cyclicNumberAxis0.isAxisLineVisible();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D((String) null);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      numberAxis3D0.removeChangeListener(thermometerPlot0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("mITa;$,4Lnk");
      logarithmicAxis0.setPlot((Plot) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.5707963267948966);
      Paint paint0 = cyclicNumberAxis0.getTickMarkPaint();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("DateTickUnit.getMillisecondCount() : unit must be one of the constants YEAR, MONTH, DAY, HOUR, MINUTE, SECOND or MILLISECOND defined in the DateTickUnit class. Do *not* use the constants defined in java.util.Calendar.");
      boolean boolean0 = numberAxis0.isTickMarksVisible();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("org.jfree.chart.needle.PlumNeedle");
      SubCategoryAxis subCategoryAxis1 = new SubCategoryAxis("org.jfree.chart.needle.PlumNeedle");
      boolean boolean0 = subCategoryAxis0.equals(subCategoryAxis1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      JFreeChart jFreeChart0 = new JFreeChart(meterPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(270, 500);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      Point2D.Double point2D_Double0 = new Point2D.Double(500, 0.05);
      Line2D.Double line2D_Double0 = new Line2D.Double(point2D_Double0, point2D_Double0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      // Undeclared exception!
      try { 
        subCategoryAxis0.draw(graphics2D0, 270, rectangle0, rectangle0, (RectangleEdge) null, plotRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.geom.Path2D$Float", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      Color color0 = (Color)PiePlot.DEFAULT_LABEL_SHADOW_PAINT;
      cyclicNumberAxis0.setTickMarkPaint(color0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.5707963267948966);
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("?^`KU+1]K;Bs", 0.05, 0.0F, 2.0F);
      Stroke stroke0 = categoryPointerAnnotation0.getArrowStroke();
      cyclicNumberAxis0.setTickMarkStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(3.0, 3.0, "");
      cyclicNumberAxis0.setTickMarksVisible(true);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.5707963267948966);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot(taskSeriesCollection0);
      cyclicNumberAxis0.setTickLabelInsets(spiderWebPlot0.DEFAULT_INSETS);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      // Undeclared exception!
      try { 
        dateAxis0.setTickLabelPaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("Null 'time' argument.", (Range) null);
      moduloAxis0.setTickLabelPaint(moduloAxis0.DEFAULT_AXIS_LINE_PAINT);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      Font font0 = TextFragment.DEFAULT_FONT;
      subCategoryAxis0.setTickLabelFont(font0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setTickLabelFont(subCategoryAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setTickLabelsVisible(false);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      BasicStroke basicStroke0 = (BasicStroke)CategoryPlot.DEFAULT_GRIDLINE_STROKE;
      dateAxis0.setAxisLineStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
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
  public void test27()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-594.4), "");
      AreaRenderer areaRenderer0 = new AreaRenderer();
      Paint paint0 = areaRenderer0.getItemPaint(0, (-3240));
      cyclicNumberAxis0.setAxisLinePaint(paint0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setLabelInsets(logarithmicAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D((String) null);
      // Undeclared exception!
      try { 
        numberAxis3D0.setLabelPaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      JList<CategoryAxis3D> jList0 = new JList<CategoryAxis3D>();
      Color color0 = jList0.getSelectionBackground();
      numberAxis3D0.setLabelPaint(color0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("aDDt6M-=N0yi7;-");
      DateAxis dateAxis0 = new DateAxis("aDDt6M-=N0yi7;-");
      dateAxis0.setLabelFont(subCategoryAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("xEmKfIe6V+YS?J!]", (Range) null);
      // Undeclared exception!
      try { 
        moduloAxis0.setLabelFont((Font) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("(");
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("~:J<VY$rQ~tMNSl[n");
      dateAxis0.setLabelFont(extendedCategoryAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setLabel("");
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("aDDt6M-=N0yi7;-");
      dateAxis0.setLabel((String) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("mITa;$,4Lnk");
      logarithmicAxis0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Null 'state' argument.");
      numberAxis3D0.setTickMarkInsideLength(4.0F);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("aDDt6M-=N0yi7;-");
      dateAxis0.setLabelAngle(0.2);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("mITa;$,4Lnk");
      logarithmicAxis0.setTickMarkOutsideLength(0.0F);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      Paint paint0 = categoryAxis0.getLabelPaint();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setLabelURL("");
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setFixedDimension(0.0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(5001.0, 5001.0);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(cyclicNumberAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("sk8Kg\"", combinedRangeCategoryPlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 221, chartRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("[left=");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      JFreeChart jFreeChart0 = new JFreeChart(combinedDomainCategoryPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(10, 500, (-3111.143692286), (double) 0, chartRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.SubCategoryAxis", e);
      }
  }
}
