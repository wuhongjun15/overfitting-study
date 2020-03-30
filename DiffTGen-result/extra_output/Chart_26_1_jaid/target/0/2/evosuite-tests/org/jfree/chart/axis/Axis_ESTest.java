/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 13:19:20 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.AWTEventMulticaster;
import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.text.DefaultEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisLocation;
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
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.Range;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Month;
import org.jfree.data.time.Week;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0);
      float[][] floatArray0 = new float[6][1];
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot(floatArray0, cyclicNumberAxis0, cyclicNumberAxis0);
      Stroke stroke0 = fastScatterPlot0.getDomainGridlineStroke();
      cyclicNumberAxis0.setTickMarkStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      periodAxis0.configure();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.5707963267948966);
      CategoryPlot categoryPlot0 = new CategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("", categoryPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 10, 1, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      AxisLocation axisLocation0 = AxisLocation.BOTTOM_OR_RIGHT;
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
      RectangleEdge rectangleEdge0 = Plot.resolveRangeAxisLocation(axisLocation0, plotOrientation0);
      Rectangle2D rectangle2D0 = cyclicNumberAxis0.getLabelEnclosure(graphics2D0, rectangleEdge0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Week week0 = new Week(mockDate0);
      PeriodAxis periodAxis0 = new PeriodAxis("org.jfree.chart.axis.Axis", week0, week0, week0.DEFAULT_TIME_ZONE);
      float float0 = periodAxis0.getTickMarkOutsideLength();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("(MQtm");
      extendedCategoryAxis0.setAxisLineVisible(true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      boolean boolean0 = subCategoryAxis0.isTickMarksVisible();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      Font font0 = categoryAxis3D0.getTickLabelFont();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0);
      Stroke stroke0 = cyclicNumberAxis0.getAxisLineStroke();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D(" and");
      Plot plot0 = numberAxis3D0.getPlot();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("dataset (type ");
      Paint paint0 = categoryAxis0.getTickLabelPaint();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("IBsrBK<");
      dateAxis0.addChangeListener((AxisChangeListener) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-165.130466446491), (-165.130466446491));
      double double0 = cyclicNumberAxis0.getFixedDimension();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("C^+lMF_7[PhxyFPBgK");
      String string0 = categoryAxis0.getLabel();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("(MQtm");
      boolean boolean0 = extendedCategoryAxis0.isAxisLineVisible();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      CompassPlot compassPlot0 = new CompassPlot();
      logarithmicAxis0.setPlot(compassPlot0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("IBsrBK<");
      DefaultEditorKit.PasteAction defaultEditorKit_PasteAction0 = new DefaultEditorKit.PasteAction();
      ActionListener actionListener0 = AWTEventMulticaster.add((ActionListener) defaultEditorKit_PasteAction0, (ActionListener) defaultEditorKit_PasteAction0);
      boolean boolean0 = dateAxis0.hasListener(actionListener0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("rqBw");
      // Undeclared exception!
      try { 
        categoryAxis3D0.setTickMarkPaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      DateAxis dateAxis0 = new DateAxis();
      numberAxis3D0.setTickMarkStroke(dateAxis0.DEFAULT_TICK_MARK_STROKE);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("/P$/}(<fm9^,*");
      categoryAxis3D0.setTickLabelInsets(categoryAxis3D0.DEFAULT_AXIS_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      PeriodAxis periodAxis0 = new PeriodAxis("");
      subCategoryAxis0.setTickLabelInsets(periodAxis0.DEFAULT_TICK_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      SystemColor systemColor0 = SystemColor.windowText;
      logarithmicAxis0.setTickLabelPaint(systemColor0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Month month0 = new Month();
      PeriodAxis periodAxis0 = new PeriodAxis("v1gD0e/eC:[i", month0, month0, month0.DEFAULT_TIME_ZONE);
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("(MQtm");
      extendedCategoryAxis0.setTickLabelFont(periodAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      categoryAxis3D0.setTickLabelFont(categoryAxis3D0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[1];
      SymbolAxis symbolAxis0 = new SymbolAxis("-eB>", stringArray0);
      symbolAxis0.setTickLabelsVisible(true);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      BasicStroke basicStroke0 = (BasicStroke)SpiderWebPlot.DEFAULT_LABEL_OUTLINE_STROKE;
      logarithmicAxis0.setAxisLineStroke(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      CategoryPlot categoryPlot0 = new CategoryPlot();
      Paint paint0 = categoryPlot0.getRangeCrosshairPaint();
      cyclicNumberAxis0.setAxisLinePaint(paint0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setLabelInsets(logarithmicAxis0.DEFAULT_AXIS_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      PeriodAxis periodAxis0 = new PeriodAxis("", fixedMillisecond0, fixedMillisecond0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.05);
      cyclicNumberAxis0.setLabelPaint(periodAxis0.DEFAULT_TICK_LABEL_PAINT);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-878.97253092), 2788.8);
      cyclicNumberAxis0.setLabelFont(cyclicNumberAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-878.97253092), 2788.8);
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      TableOrder tableOrder0 = TableOrder.BY_COLUMN;
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot(defaultKeyedValues2DDataset0, tableOrder0);
      cyclicNumberAxis0.setLabelFont(spiderWebPlot0.DEFAULT_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setLabel("VerticalAlignment.TOP");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("'3(V|tE%=g");
      categoryAxis0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("SansSerif");
      dateAxis0.setTickMarkInsideLength(0.0F);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((Number) 2.0F);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      categoryAxis3D0.removeChangeListener(thermometerPlot0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2.0F, 0.0, "apQetp#nK%Ml$>{P8");
      cyclicNumberAxis0.setLabelToolTip("T!YLvu|6B@wXdn5Ri");
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.0, 2.0, "Iz;fG<-");
      cyclicNumberAxis0.setLabelAngle(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setTickMarkOutsideLength(0.0F);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1445.40844755), (-1445.40844755), "");
      Paint paint0 = cyclicNumberAxis0.getLabelPaint();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.renderer.category.WaterfallBarRenderer", combinedDomainXYPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 500, (double) (-4.0F), (double) (-4.0F), (ChartRenderingInfo) null);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MeterPlot meterPlot0 = new MeterPlot();
      Range range0 = meterPlot0.getRange();
      ModuloAxis moduloAxis0 = new ModuloAxis("", range0);
      Object object0 = moduloAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      numberAxis0.setLabelURL("0@X~6J6--s@=+M$v");
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setFixedDimension((-1.0));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("IBsrBK<");
      Paint paint0 = dateAxis0.getAxisLinePaint();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      Font font0 = dateAxis0.getLabelFont();
  }
}
