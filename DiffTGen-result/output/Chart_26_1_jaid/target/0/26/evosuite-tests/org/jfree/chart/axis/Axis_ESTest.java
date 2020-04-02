/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 13:43:38 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.text.AttributedCharacterIterator;
import java.util.Date;
import java.util.Hashtable;
import java.util.Stack;
import javax.swing.JComboBox;
import javax.swing.JTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(logarithmicAxis0);
      logarithmicAxis0.notifyListeners(axisChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate(496, 496, 496, 496, 496);
      ZoneInfo zoneInfo0 = (ZoneInfo)SegmentedTimeline.DEFAULT_TIME_ZONE;
      Hour hour0 = new Hour(mockDate0, zoneInfo0);
      Minute minute0 = new Minute(496, hour0);
      PeriodAxis periodAxis0 = new PeriodAxis(">p0j3_xV1FGlG7", minute0, hour0);
      periodAxis0.configure();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1117.9));
      boolean boolean0 = cyclicNumberAxis0.isTickMarksVisible();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      logarithmicAxis0.setTickMarksVisible(false);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-24.593199), 4.0);
      double double0 = cyclicNumberAxis0.getLabelAngle();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      logarithmicAxis0.setAxisLineVisible(false);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1000000.0, (String) null);
      Font font0 = cyclicNumberAxis0.getTickLabelFont();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("]", (Range) null);
      Plot plot0 = moduloAxis0.getPlot();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("E%iKWX Clw|5~");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      categoryAxis3D0.addChangeListener(combinedDomainCategoryPlot0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("s|jrrqh~.Va");
      RectangleInsets rectangleInsets0 = logarithmicAxis0.getLabelInsets();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("Null 'paint' argument.");
      MeterPlot meterPlot0 = new MeterPlot();
      dateAxis0.setPlot(meterPlot0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("H6`bn[.TdLJzW?");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("", subCategoryAxis0.DEFAULT_TICK_LABEL_FONT, combinedDomainCategoryPlot0, true);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, (double) 10, (double) 0.0F, chartRenderingInfo0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1989.8800789);
      Stack<WaferMapPlot> stack0 = new Stack<WaferMapPlot>();
      JComboBox<WaferMapPlot> jComboBox0 = new JComboBox<WaferMapPlot>(stack0);
      boolean boolean0 = cyclicNumberAxis0.hasListener(jComboBox0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, (-496.4533522582118));
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.setTickMarkPaint((Paint) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Null 'stroke' argument.");
      numberAxis3D0.setTickMarkStroke(subCategoryAxis0.DEFAULT_TICK_MARK_STROKE);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("Null 'insets' argument.");
      logarithmicAxis0.setTickLabelInsets(logarithmicAxis0.DEFAULT_AXIS_LABEL_INSETS);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "_`tR_{Mf,}ZA;\"m");
      Color color0 = (Color)Axis.DEFAULT_TICK_MARK_PAINT;
      cyclicNumberAxis0.setTickLabelPaint(color0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(3.0);
      Hashtable<AttributedCharacterIterator.Attribute, CompassPlot> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, CompassPlot>();
      Font font0 = new Font(hashtable0);
      cyclicNumberAxis0.setTickLabelFont(font0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("org.jfree.chart.axis.Axis");
      // Undeclared exception!
      try { 
        categoryAxis0.setTickLabelFont((Font) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(3.0);
      cyclicNumberAxis0.setTickLabelFont(cyclicNumberAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "_`tR_{Mf,}ZA;\"m");
      cyclicNumberAxis0.setTickLabelsVisible(false);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      AreaRenderer areaRenderer0 = new AreaRenderer();
      Stroke stroke0 = areaRenderer0.lookupSeriesStroke(1414);
      extendedCategoryAxis0.setAxisLineStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ModuloAxis moduloAxis0 = new ModuloAxis("]", (Range) null);
      Color color0 = Color.GRAY;
      moduloAxis0.setAxisLinePaint(color0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Null 'stroke' argument.");
      ModuloAxis moduloAxis0 = new ModuloAxis("Hf&Dgtc(UT", numberAxis3D0.DEFAULT_RANGE);
      moduloAxis0.setLabelPaint(subCategoryAxis0.DEFAULT_TICK_LABEL_PAINT);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("u2%k1w0ZHx=IO");
      extendedCategoryAxis0.setLabelFont(extendedCategoryAxis0.DEFAULT_TICK_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("u2%k1w0ZHx=IO");
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("u2%k1w0ZHx=IO");
      extendedCategoryAxis0.setLabelFont(periodAxis0.DEFAULT_AXIS_LABEL_FONT);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1987.5), 5.0E7, "v _SHx|<rP>Ig");
      cyclicNumberAxis0.setLabel(" onMouseOver=\"return stm(['");
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      valueAxis0.setLabel("2fH#RKT3");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SegmentedTimeline segmentedTimeline0 = new SegmentedTimeline(500, 500, 500);
      Date date0 = segmentedTimeline0.getDate(500);
      Quarter quarter0 = new Quarter(date0, segmentedTimeline0.NO_DST_TIME_ZONE);
      PeriodAxis periodAxis0 = new PeriodAxis("", quarter0, quarter0);
      periodAxis0.setVisible(true);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      DateAxis dateAxis0 = new DateAxis("v _SHx|<rP>Ig", zoneInfo0);
      dateAxis0.setTickMarkInsideLength((-2608.83F));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("Z");
      logarithmicAxis0.removeChangeListener((AxisChangeListener) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1815.9091803);
      cyclicNumberAxis0.setLabelToolTip("olRC*xB");
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      extendedCategoryAxis0.setLabelAngle(0.0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1117.9));
      double double0 = cyclicNumberAxis0.getFixedDimension();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("SansSerif");
      boolean boolean0 = extendedCategoryAxis0.isTickMarksVisible();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(10.03422936, 10.03422936);
      Stroke stroke0 = cyclicNumberAxis0.getAxisLineStroke();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      Object object0 = extendedCategoryAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      extendedCategoryAxis0.setLabelURL("");
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("#Gh2'ZLRZ&,K");
      XYDataItem xYDataItem0 = new XYDataItem(0.05, (double) 0.0F);
      Paint paint0 = extendedCategoryAxis0.getTickLabelPaint((Comparable) xYDataItem0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis((String) null);
      logarithmicAxis0.setFixedDimension(3141.2314348636);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1989.8800789);
      boolean boolean0 = cyclicNumberAxis0.isAxisLineVisible();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-866.113577504));
      RectangleInsets rectangleInsets0 = cyclicNumberAxis0.getTickLabelInsets();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Month month0 = new Month();
      PeriodAxis periodAxis0 = new PeriodAxis((String) null, month0, month0, month0.DEFAULT_TIME_ZONE);
      float float0 = periodAxis0.getTickMarkInsideLength();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("e&(");
      BufferedImage bufferedImage0 = new BufferedImage(12, 12, 12);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Stack<SymbolAxis> stack0 = new Stack<SymbolAxis>();
      JTable jTable0 = new JTable(stack0, stack0);
      Rectangle rectangle0 = jTable0.getCellRect(12, 12, true);
      LengthAdjustmentType lengthAdjustmentType0 = LengthAdjustmentType.NO_CHANGE;
      Rectangle2D rectangle2D0 = subCategoryAxis0.DEFAULT_AXIS_LABEL_INSETS.createAdjustedRectangle(rectangle0, lengthAdjustmentType0, lengthAdjustmentType0);
      AxisLocation axisLocation0 = AxisLocation.TOP_OR_RIGHT;
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset(0.0);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
      RectangleEdge rectangleEdge0 = Plot.resolveDomainAxisLocation(axisLocation0, plotOrientation0);
      AxisSpace axisSpace0 = subCategoryAxis0.reserveSpace(graphics2D0, thermometerPlot0, rectangle2D0, rectangleEdge0, (AxisSpace) null);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-69.1109), 0.0, (String) null);
      Font font0 = cyclicNumberAxis0.getLabelFont();
  }
}