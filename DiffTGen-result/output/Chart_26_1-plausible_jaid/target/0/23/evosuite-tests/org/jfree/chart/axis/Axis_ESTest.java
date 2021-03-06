/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:41:24 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.Date;
import java.util.EventListener;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisState;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTickMarkPosition;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.PeriodAxisLabelInfo;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.text.TextBlock;
import org.jfree.chart.text.TextFragment;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.WaferMapDataset;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.Week;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SegmentedTimeline segmentedTimeline0 = SegmentedTimeline.newMondayThroughFridayTimeline();
      boolean boolean0 = segmentedTimeline0.containsDomainRange(0L, 0L);
      Date date0 = segmentedTimeline0.getDate(0L);
      Second second0 = new Second(date0);
      Date date1 = second0.getEnd();
      boolean boolean1 = segmentedTimeline0.equals(date0);
      RegularTimePeriod regularTimePeriod0 = second0.previous();
      PeriodAxis periodAxis0 = new PeriodAxis("Aq~NYMY&KyT0$`(", regularTimePeriod0, second0);
      boolean boolean2 = periodAxis0.isTickMarksVisible();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Aq~NYMY&KyT0$`(");
      subCategoryAxis0.setLabelAngle(3600000L);
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      JFreeChart jFreeChart0 = null;
      try {
        jFreeChart0 = new JFreeChart("o~ZP", (Plot) null);
      } catch(NullPointerException e) {
         //
         // Null 'plot' argument.
         //
         verifyException("org.jfree.chart.JFreeChart", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      extendedCategoryAxis0.setMaximumCategoryLabelLines(2383);
      thermometerPlot0.setUnits(0);
      extendedCategoryAxis0.removeChangeListener(thermometerPlot0);
      Font font0 = TextFragment.DEFAULT_FONT;
      extendedCategoryAxis0.setTickLabelFont((Comparable) "", font0);
      CategoryLabelPositions categoryLabelPositions0 = extendedCategoryAxis0.getCategoryLabelPositions();
      Stroke stroke0 = extendedCategoryAxis0.getTickMarkStroke();
      extendedCategoryAxis0.setSubLabelPaint(thermometerPlot0.DEFAULT_BACKGROUND_PAINT);
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("=sEdXF0]kz<J{");
      String string0 = logarithmicAxis0.makeTickLabel(2.0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setMaximumCategoryLabelLines(2);
      Quarter quarter0 = new Quarter(2, 2);
      categoryAxis3D0.removeCategoryLabelToolTip(quarter0);
      Plot plot0 = categoryAxis3D0.getPlot();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      boolean boolean0 = valueAxis0.isTickMarksVisible();
      Minute minute0 = new Minute();
      PeriodAxis periodAxis0 = new PeriodAxis("=P-,6n", minute0, minute0);
      Graphics2D graphics2D0 = null;
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(9.0, (-27.619));
      cyclicNumberAxis0.setUpperBound(500);
      Rectangle2D rectangle2D0 = null;
      AxisLocation axisLocation0 = AxisLocation.BOTTOM_OR_LEFT;
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      RectangleEdge rectangleEdge0 = Plot.resolveDomainAxisLocation(axisLocation0, plotOrientation0);
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.drawTickMarksAndLabels((Graphics2D) null, 0.0, (Rectangle2D) null, (Rectangle2D) null, rectangleEdge0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.ValueAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("~eMX339 t");
      logarithmicAxis0.setAutoRangeNextLogFlag(true);
      logarithmicAxis0.setLabel("~eMX339 t");
      double double0 = logarithmicAxis0.adjustedLog10(0.0);
      logarithmicAxis0.setExpTickLabelsFlag(false);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2.0F, "~eMX339 t");
      cyclicNumberAxis0.setAdvanceLineVisible(false);
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("y=/]`|wULdq");
      Font font0 = extendedCategoryAxis0.getTickLabelFont((Comparable) true);
      boolean boolean0 = cyclicNumberAxis0.equals(extendedCategoryAxis0);
      PeriodAxis periodAxis0 = new PeriodAxis((String) null);
      periodAxis0.setFixedAutoRange((-1329.99882));
      periodAxis0.setAxisLineStroke(cyclicNumberAxis0.DEFAULT_AXIS_LINE_STROKE);
      periodAxis0.setLabelInfo((PeriodAxisLabelInfo[]) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.0, "A{FhnS~]Dk");
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((Number) 0.05);
      MeterPlot meterPlot0 = new MeterPlot(defaultValueDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("[.hx:1!=9E^*+/", cyclicNumberAxis0.DEFAULT_TICK_LABEL_FONT, meterPlot0, false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(5.0E-7, 10, 0.05, 2.0);
      Rectangle rectangle0 = rectangle2D_Double0.getBounds();
      Rectangle2D rectangle2D0 = rectangle0.createUnion(rectangle2D_Double0);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      AxisState axisState0 = cyclicNumberAxis0.drawTickMarksAndLabels(graphics2D0, (-2371.5820372), rectangle0, rectangle2D0, rectangleEdge0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.setTickMarkOutsideLength(0.0F);
      boolean boolean0 = subCategoryAxis0.equals("");
      subCategoryAxis0.setTickMarkOutsideLength(0.0F);
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(10, 0, 2.0F);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      String string0 = "Gax?N[";
      SimpleTimeZone simpleTimeZone0 = null;
      try {
        simpleTimeZone0 = new SimpleTimeZone(270, "[.hx:1!=9E^*+/", 685, 1, 0, 10, 435, 10, 685, (-1876), 10, (-4180), (-127));
      } catch(IllegalArgumentException e) {
         //
         // Illegal start month 685
         //
         verifyException("java.util.SimpleTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("r{5)9m");
      boolean boolean0 = periodAxis0.isVisible();
      periodAxis0.setMinorTickMarkInsideLength(1913.78F);
      boolean boolean1 = periodAxis0.equals("r{5)9m");
      Object object0 = periodAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      boolean boolean0 = false;
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      JFreeChart jFreeChart0 = new JFreeChart((String) null, combinedDomainXYPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 5);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float(0.0F, 500, (-2190.677F), (-1994.621F));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Rectangle2D rectangle2D0 = rectangle2D_Double0.getFrame();
      Rectangle2D rectangle2D1 = rectangle2D_Float0.createIntersection(rectangle2D0);
      List list0 = numberAxis0.refreshTicksHorizontal(graphics2D0, rectangle2D1, (RectangleEdge) null);
      // Undeclared exception!
      try { 
        numberAxis0.setAutoRangeMinimumSize((-1914.8071289046295), false);
      } catch(IllegalArgumentException e) {
         //
         // NumberAxis.setAutoRangeMinimumSize(double): must be > 0.0.
         //
         verifyException("org.jfree.chart.axis.ValueAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0F, 2.0F, "A#X%euF~|/D{ut");
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      JFreeChart jFreeChart0 = new JFreeChart(thermometerPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(0, 10, 0.05, (-431.06582019), chartRenderingInfo0);
      } catch(IllegalArgumentException e) {
         //
         // Width (0) and height (10) cannot be <= 0
         //
         verifyException("java.awt.image.DirectColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Dx\" xM9");
      Week week0 = new Week(1163, 1163);
      RegularTimePeriod regularTimePeriod0 = week0.next();
      PeriodAxis periodAxis0 = new PeriodAxis("Dx\" xM9", regularTimePeriod0, regularTimePeriod0, regularTimePeriod0.DEFAULT_TIME_ZONE);
      Class class0 = periodAxis0.getAutoRangeTimePeriodClass();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      RectangleInsets rectangleInsets0 = Axis.DEFAULT_AXIS_LABEL_INSETS;
      categoryAxis0.setTickLabelInsets(rectangleInsets0);
      double double0 = categoryAxis0.getLowerMargin();
      periodAxis0.setLabelFont(categoryAxis0.DEFAULT_AXIS_LABEL_FONT);
      DateAxis dateAxis0 = new DateAxis("Dx\" xM9");
      DateTickUnit dateTickUnit0 = dateAxis0.getTickUnit();
      dateAxis0.setTickUnit(dateTickUnit0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = (SimpleTimeZone)SegmentedTimeline.NO_DST_TIME_ZONE;
      DateAxis dateAxis0 = new DateAxis("-O('wlCHAx >RSK", simpleTimeZone0);
      Locale locale0 = Locale.GERMANY;
      String string0 = simpleTimeZone0.getDisplayName(locale0);
      boolean boolean0 = dateAxis0.hasListener((EventListener) null);
      DateTickMarkPosition dateTickMarkPosition0 = DateTickMarkPosition.MIDDLE;
      dateAxis0.setTickMarkPosition(dateTickMarkPosition0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.05, (-30.5505883854));
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("-O('wlCHAx >RSK");
      boolean boolean1 = logarithmicAxis0.getStrictValuesFlag();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setVisible(true);
      Font font0 = dateAxis0.getLabelFont();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0);
      cyclicNumberAxis0.setTickMarkInsideLength(0.95F);
      cyclicNumberAxis0.setLabelURL("");
      int int0 = (-2751);
      BufferedImage bufferedImage0 = null;
      try {
        bufferedImage0 = new BufferedImage(500, (-2751), (-2751));
      } catch(IllegalArgumentException e) {
         //
         // Unknown image type -2751
         //
         verifyException("java.awt.image.BufferedImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("");
      RectangleInsets rectangleInsets0 = Axis.DEFAULT_TICK_LABEL_INSETS;
      categoryAxis0.setLabelInsets(rectangleInsets0);
      String string0 = "rE*I#";
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("rE*I#");
      String string1 = logarithmicAxis0.makeTickLabel(0.0F, true);
      String string2 = logarithmicAxis0.makeTickLabel(1.0, true);
      Minute minute0 = null;
      try {
        minute0 = new Minute(500, 2821, 2821, 0, 1735);
      } catch(IllegalArgumentException e) {
         //
         // The 'year' argument must be in range 1900 to 9999.
         //
         verifyException("org.jfree.data.time.SpreadsheetDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      int int0 = categoryAxis3D0.getMaximumCategoryLabelLines();
      ZoneInfo zoneInfo0 = (ZoneInfo)SegmentedTimeline.DEFAULT_TIME_ZONE;
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(categoryAxis3D0);
      categoryAxis3D0.notifyListeners(axisChangeEvent0);
      DateAxis dateAxis0 = new DateAxis("Null 'paint' argument.", zoneInfo0);
      // Undeclared exception!
      try { 
        dateAxis0.setRange(0.2, 0.05);
      } catch(IllegalArgumentException e) {
         //
         // Requires 'lower' < 'upper'.
         //
         verifyException("org.jfree.chart.axis.DateAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Second second0 = new Second();
      PeriodAxis periodAxis0 = new PeriodAxis("", second0, second0);
      RectangleInsets rectangleInsets0 = new RectangleInsets();
      periodAxis0.setTickLabelInsets(rectangleInsets0);
      periodAxis0.autoAdjustRange();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(500, "T:o}:W");
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      Stroke stroke0 = stackedAreaRenderer0.getItemStroke((-2050), 0);
      cyclicNumberAxis0.setAdvanceLineStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      double double0 = logarithmicAxis0.computeLogFloor(2.5E8);
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("M]u[xIx)6!Ygx!");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(logarithmicAxis0);
      AxisLocation axisLocation0 = combinedDomainXYPlot0.getRangeAxisLocation(500);
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      RectangleEdge rectangleEdge0 = Plot.resolveDomainAxisLocation(axisLocation0, plotOrientation0);
      JFreeChart jFreeChart0 = new JFreeChart("?B3]bjr&KD?NB1P4", logarithmicAxis0.DEFAULT_AXIS_LABEL_FONT, combinedDomainXYPlot0, false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1208, 10, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      TextBlock textBlock0 = extendedCategoryAxis0.createLabel("M]u[xIx)6!Ygx!", (-1577.1F), rectangleEdge0, graphics2D0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      Line2D.Double line2D_Double0 = new Line2D.Double();
      line2D_Double0.setLine(0.0, 0.0, 0.0, (double) 2.0F);
      periodAxis0.setDownArrow(line2D_Double0);
      Class<Integer> class0 = Integer.class;
      periodAxis0.setMinorTickTimePeriodClass(class0);
  }
}
