/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:41:29 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.color.ICC_Profile;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.IndexColorModel;
import java.awt.image.Kernel;
import java.math.BigInteger;
import java.text.AttributedCharacterIterator;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JTabbedPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTickMarkPosition;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.MarkerAxisBand;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.PeriodAxisLabelInfo;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.axis.StandardTickUnitSource;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.TickUnit;
import org.jfree.chart.axis.TickUnitSource;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.PieLabelRecord;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.text.TextBlock;
import org.jfree.chart.text.TextBox;
import org.jfree.chart.title.Title;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.SerialDate;
import org.jfree.data.time.Week;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "_;";
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.0E-5, "_;");
      HashMap<AttributedCharacterIterator.Attribute, CategoryAxis> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, CategoryAxis>();
      AttributedCharacterIterator.Attribute attributedCharacterIterator_Attribute0 = AttributedCharacterIterator.Attribute.READING;
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setTickLabelPaint(cyclicNumberAxis0.DEFAULT_TICK_MARK_PAINT);
      CategoryAxis categoryAxis0 = hashMap0.put(attributedCharacterIterator_Attribute0, categoryAxis3D0);
      Font font0 = new Font(hashMap0);
      cyclicNumberAxis0.setLabelFont(font0);
      AreaRenderer areaRenderer0 = new AreaRenderer();
      Paint paint0 = areaRenderer0.getBaseOutlinePaint();
      cyclicNumberAxis0.setLabelPaint(paint0);
      cyclicNumberAxis0.setFixedAutoRange(1.0E-5);
      PeriodAxis periodAxis0 = new PeriodAxis("Cub#NTy %e");
      periodAxis0.setMinorTickMarkPaint(cyclicNumberAxis0.DEFAULT_AXIS_LABEL_PAINT);
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("0)%l`Bb>||Iw}}");
      MarkerAxisBand markerAxisBand0 = new MarkerAxisBand(logarithmicAxis0, 2.0E9, (-3238.0731300670304), 0.05, 1525.15416381, periodAxis0.DEFAULT_TICK_LABEL_FONT);
      cyclicNumberAxis0.setMarkerBand(markerAxisBand0);
      String string1 = "Null 'insets' argument.";
      ModuloAxis moduloAxis0 = new ModuloAxis("Null 'insets' argument.", periodAxis0.DEFAULT_RANGE);
      ICC_Profile[] iCC_ProfileArray0 = new ICC_Profile[9];
      // Undeclared exception!
      try { 
        ICC_Profile.getInstance(500);
      } catch(IllegalArgumentException e) {
         //
         // Unknown color space
         //
         verifyException("java.awt.color.ICC_Profile", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = 0.0;
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0);
      Font font0 = cyclicNumberAxis0.getLabelFont();
      float[] floatArray0 = new float[6];
      floatArray0[0] = (float) 500;
      floatArray0[1] = 0.0F;
      floatArray0[2] = (float) 500;
      floatArray0[3] = 2.0F;
      floatArray0[4] = 2.0F;
      floatArray0[5] = (float) 500;
      Kernel kernel0 = null;
      try {
        kernel0 = new Kernel(500, 500, floatArray0);
      } catch(IllegalArgumentException e) {
         //
         // Data array too small (is 6 and should be 250000
         //
         verifyException("java.awt.image.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("ML/T~v,+0'");
      logarithmicAxis0.setTickLabelsVisible(true);
      logarithmicAxis0.autoRangeNextLogFlag = true;
      logarithmicAxis0.setFixedDimension(0.0);
      logarithmicAxis0.setupSmallLogFlag();
      logarithmicAxis0.setupSmallLogFlag();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("}3V=$G|{xuF(N");
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Rectangle2D rectangle2D0 = rectangle2D_Double0.getFrame();
      boolean boolean0 = rectangle2D_Double0.intersects(rectangle2D0);
      RectangleEdge rectangleEdge0 = Title.DEFAULT_POSITION;
      double double0 = extendedCategoryAxis0.calculateCategoryGapSize(0, rectangle2D0, rectangleEdge0);
      NumberAxis numberAxis0 = new NumberAxis((String) null);
      boolean boolean1 = numberAxis0.getAutoRangeStickyZero();
      numberAxis0.configure();
      double double1 = extendedCategoryAxis0.getFixedDimension();
      ModuloAxis moduloAxis0 = new ModuloAxis("9&Ipx(l7YbIv oV", numberAxis0.DEFAULT_RANGE);
      double double2 = moduloAxis0.getDisplayEnd();
      CategoryLabelPositions categoryLabelPositions0 = CategoryLabelPositions.DOWN_45;
      extendedCategoryAxis0.setCategoryLabelPositions(categoryLabelPositions0);
      Quarter quarter0 = new Quarter();
      long long0 = quarter0.getMiddleMillisecond();
      RegularTimePeriod regularTimePeriod0 = quarter0.previous();
      PeriodAxis periodAxis0 = new PeriodAxis("l0].4<xOuC)j:0", regularTimePeriod0, regularTimePeriod0, quarter0.DEFAULT_TIME_ZONE);
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot();
      JFreeChart jFreeChart0 = new JFreeChart(spiderWebPlot0);
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(10, 2791);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.SpiderWebPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      Color color0 = new Color(1498, true);
      subCategoryAxis0.setLabelPaint(color0);
      subCategoryAxis0.setCategoryMargin(1108.987472099);
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      BufferedImage bufferedImage0 = null;
      try {
        bufferedImage0 = new BufferedImage((-449), 1498, 1498);
      } catch(IllegalArgumentException e) {
         //
         // Unknown image type 1498
         //
         verifyException("java.awt.image.BufferedImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Week week0 = new Week();
      DateFormatSymbols dateFormatSymbols0 = SerialDate.DATE_FORMAT_SYMBOLS;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      Calendar calendar0 = mockSimpleDateFormat0.getCalendar();
      long long0 = week0.getLastMillisecond(calendar0);
      Object object0 = dateFormatSymbols0.clone();
      PeriodAxis periodAxis0 = new PeriodAxis("project.copyright", week0, week0, week0.DEFAULT_TIME_ZONE);
      periodAxis0.zoomRange(1392409281319L, 1392409281319L);
      periodAxis0.configure();
      MockDate mockDate0 = new MockDate(500, 0, 1);
      Second second0 = new Second(mockDate0, week0.DEFAULT_TIME_ZONE);
      periodAxis0.setLast(second0);
      periodAxis0.setVisible(true);
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      double double0 = logarithmicAxis0.computeLogCeil(2.0F);
      TextBox textBox0 = new TextBox();
      RectangleInsets rectangleInsets0 = textBox0.getInteriorGap();
      periodAxis0.setLabelInsets(rectangleInsets0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("rj ");
      periodAxis0.setTickMarksVisible(true);
      RegularTimePeriod regularTimePeriod0 = periodAxis0.getFirst();
      DateAxis dateAxis0 = new DateAxis("");
      dateAxis0.setRange(periodAxis0.DEFAULT_RANGE, true, true);
      RegularTimePeriod regularTimePeriod1 = periodAxis0.getLast();
      PeriodAxisLabelInfo[] periodAxisLabelInfoArray0 = new PeriodAxisLabelInfo[4];
      Class<CombinedDomainCategoryPlot> class0 = CombinedDomainCategoryPlot.class;
      DateFormat dateFormat0 = MockDateFormat.getInstance();
      boolean boolean0 = false;
      Stroke stroke0 = null;
      JTabbedPane jTabbedPane0 = null;
      try {
        jTabbedPane0 = new JTabbedPane((-692), 500);
      } catch(IllegalArgumentException e) {
         //
         // illegal tab placement: must be TOP, BOTTOM, LEFT, or RIGHT
         //
         verifyException("javax.swing.JTabbedPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "");
      double double0 = cyclicNumberAxis0.getOffset();
      Paint paint0 = cyclicNumberAxis0.getTickLabelPaint();
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      double double1 = logarithmicAxis0.computeLogCeil(3167.1);
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      double double2 = categoryAxis3D0.getLowerMargin();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-700.0), 500, 0.0, 0.05);
      Rectangle2D rectangle2D0 = rectangle2D_Double0.getBounds2D();
      RectangleEdge rectangleEdge0 = Title.DEFAULT_POSITION;
      double double3 = categoryAxis3D0.getCategoryEnd(2, 2, rectangle2D0, rectangleEdge0);
      int int0 = 0;
      int int1 = 439;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-10);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)61;
      IndexColorModel indexColorModel0 = null;
      try {
        indexColorModel0 = new IndexColorModel(48, 0, byteArray0, (byte)61, true, (-2668));
      } catch(IllegalArgumentException e) {
         //
         // Number of bits must be between 1 and 16.
         //
         verifyException("java.awt.image.IndexColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.setAutoTickUnitSelection(false);
      numberAxis3D0.setTickMarkInsideLength(0.0F);
      boolean boolean0 = numberAxis3D0.isVisible();
      Class<SpiderWebPlot> class0 = SpiderWebPlot.class;
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance();
      Font font0 = PiePlot.DEFAULT_LABEL_FONT;
      PeriodAxisLabelInfo periodAxisLabelInfo0 = new PeriodAxisLabelInfo(class0, dateFormat0, numberAxis3D0.DEFAULT_AXIS_LABEL_INSETS, font0, numberAxis3D0.DEFAULT_AXIS_LABEL_PAINT, true, numberAxis3D0.DEFAULT_TICK_MARK_STROKE, numberAxis3D0.DEFAULT_TICK_LABEL_PAINT);
      DateTickUnit dateTickUnit0 = DateAxis.DEFAULT_DATE_TICK_UNIT;
      int int0 = 1891;
      MockDate mockDate0 = new MockDate((-834), 1891, 1891);
      SimpleTimeZone simpleTimeZone0 = (SimpleTimeZone)SegmentedTimeline.NO_DST_TIME_ZONE;
      Date date0 = dateTickUnit0.rollDate((Date) mockDate0, (TimeZone) simpleTimeZone0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      RegularTimePeriod regularTimePeriod0 = periodAxisLabelInfo0.createInstance(date0, zoneInfo0);
      PeriodAxis periodAxis0 = null;
      try {
        periodAxis0 = new PeriodAxis("", (RegularTimePeriod) null, (RegularTimePeriod) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.PeriodAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "SansSerif";
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("SansSerif");
      boolean boolean0 = logarithmicAxis0.isVisible();
      String string1 = "Null 'font' argument.";
      PeriodAxis periodAxis0 = null;
      try {
        periodAxis0 = new PeriodAxis("Null 'font' argument.", (RegularTimePeriod) null, (RegularTimePeriod) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.PeriodAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)SegmentedTimeline.DEFAULT_TIME_ZONE;
      DateAxis dateAxis0 = new DateAxis("9qG(.K?*B}8.", zoneInfo0);
      Instant instant0 = MockInstant.ofEpochMilli(500);
      Date date0 = Date.from(instant0);
      DateTickUnit dateTickUnit0 = dateAxis0.getTickUnit();
      Date date1 = dateAxis0.previousStandardDate(date0, dateTickUnit0);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      thermometerPlot0.setForegroundAlpha(47.0F);
      Paint paint0 = thermometerPlot0.getValuePaint();
      dateAxis0.setAxisLinePaint(paint0);
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("9qG(.K?*B}8.");
      Object object0 = extendedCategoryAxis0.clone();
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("9qG(.K?*B}8.");
      logarithmicAxis0.setAllowNegativesFlag(true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = null;
      stringArray0[1] = null;
      stringArray0[2] = null;
      stringArray0[3] = null;
      stringArray0[4] = null;
      SymbolAxis symbolAxis0 = new SymbolAxis((String) null, stringArray0);
      symbolAxis0.setAutoRange(false, true);
      symbolAxis0.centerRange(3.0);
      Paint paint0 = symbolAxis0.getGridBandPaint();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D(stringArray0[2]);
      Object object0 = categoryAxis3D0.clone();
      symbolAxis0.setTickLabelFont(categoryAxis3D0.DEFAULT_AXIS_LABEL_FONT);
      int int0 = 1;
      int[] intArray0 = new int[7];
      intArray0[0] = 1;
      intArray0[1] = 500;
      intArray0[2] = 1;
      intArray0[3] = 1;
      intArray0[4] = 1;
      intArray0[5] = 1;
      intArray0[6] = 500;
      int int1 = (-135);
      MockRandom mockRandom0 = new MockRandom((-1L));
      // Undeclared exception!
      try { 
        BigInteger.probablePrime(1, mockRandom0);
      } catch(ArithmeticException e) {
         //
         // bitLength < 2
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("Null 'insets' argument.");
      // Undeclared exception!
      try { 
        periodAxis0.setAxisLineStroke((Stroke) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.US;
      String string0 = locale0.getDisplayVariant();
      TickUnitSource tickUnitSource0 = NumberAxis.createStandardTickUnits(locale0);
      CategoryAxis categoryAxis0 = new CategoryAxis((String) null);
      categoryAxis0.setLowerMargin(4.0);
      int int0 = 35;
      Font font0 = categoryAxis0.DEFAULT_TICK_LABEL_FONT.deriveFont(35, (float) 35);
      categoryAxis0.setLabelFont(font0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      int int1 = (-2171);
      float[] floatArray0 = new float[2];
      floatArray0[0] = 2.0F;
      floatArray0[1] = 2.0F;
      Kernel kernel0 = null;
      try {
        kernel0 = new Kernel((-2171), 35, floatArray0);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.image.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Stroke stroke0 = combinedDomainXYPlot0.getRangeGridlineStroke();
      categoryAxis3D0.setTickMarkStroke(stroke0);
      Object object0 = categoryAxis3D0.clone();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(10, 10);
      double double0 = cyclicNumberAxis0.calculateHighestVisibleTickValue();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(299.3326585496);
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(0.0);
      Stroke stroke0 = candlestickRenderer0.getItemOutlineStroke(0, 500);
      cyclicNumberAxis0.setAxisLineStroke(stroke0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 1.0F, "FQU~S{}\":a{Eu%*1W");
      Range range0 = combinedRangeXYPlot0.getDataRange(cyclicNumberAxis0);
      Range range1 = Range.expandToInclude((Range) null, 10);
      ModuloAxis moduloAxis0 = new ModuloAxis("Chuanhao Chiu", (Range) null);
      // Undeclared exception!
      try { 
        moduloAxis0.resizeRange((double) 1.0F, (double) 0.0F);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.ModuloAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "O93K(yzg";
      Second second0 = new Second();
      Class<CategoryAxis3D> class0 = CategoryAxis3D.class;
      Class class1 = RegularTimePeriod.downsize(class0);
      PeriodAxis periodAxis0 = new PeriodAxis("O93K(yzg", second0, second0, second0.DEFAULT_TIME_ZONE);
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(periodAxis0);
      periodAxis0.notifyListeners(axisChangeEvent0);
      Stroke stroke0 = periodAxis0.getMinorTickMarkStroke();
      PeriodAxisLabelInfo[] periodAxisLabelInfoArray0 = new PeriodAxisLabelInfo[1];
      int int0 = 0;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      ArrayList<Locale> arrayList0 = new ArrayList<Locale>();
      Locale locale0 = Locale.lookup(linkedList0, arrayList0);
      // Undeclared exception!
      try { 
        MockDateFormat.getDateTimeInstance(0, 0, (Locale) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 0.0);
      Graphics2D graphics2D0 = null;
      StandardTickUnitSource standardTickUnitSource0 = new StandardTickUnitSource();
      TickUnit tickUnit0 = standardTickUnitSource0.getCeilingTickUnit((TickUnit) cyclicNumberAxis0.DEFAULT_TICK_UNIT);
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.estimateMaximumTickLabelWidth((Graphics2D) null, tickUnit0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.NumberAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Hour hour0 = new Hour();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      PeriodAxis periodAxis0 = new PeriodAxis("", hour0, fixedMillisecond0, fixedMillisecond0.DEFAULT_TIME_ZONE);
      TimeZone timeZone0 = periodAxis0.getTimeZone();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = "I]p2.";
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("I]p2.");
      float float0 = (-189.1F);
      AxisLocation axisLocation0 = AxisLocation.BOTTOM_OR_RIGHT;
      AxisLocation axisLocation1 = AxisLocation.getOpposite(axisLocation0);
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      PlotOrientation plotOrientation0 = fastScatterPlot0.getOrientation();
      RectangleEdge rectangleEdge0 = Plot.resolveDomainAxisLocation(axisLocation1, plotOrientation0);
      BufferedImage bufferedImage0 = null;
      try {
        bufferedImage0 = new BufferedImage(0, 10, 10, (IndexColorModel) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.image.BufferedImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "!V";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-33);
      byteArray0[1] = (byte) (-90);
      byteArray0[2] = (byte)57;
      byteArray0[3] = (byte)12;
      byteArray0[4] = (byte)0;
      byte byte0 = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)70;
      byteArray0[7] = (byte)0;
      IndexColorModel indexColorModel0 = null;
      try {
        indexColorModel0 = new IndexColorModel(766, 500, byteArray0, 0, true);
      } catch(IllegalArgumentException e) {
         //
         // Number of bits must be between 1 and 16.
         //
         verifyException("java.awt.image.IndexColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection();
      Range range0 = xYSeriesCollection0.getDomainBounds(true);
      ModuloAxis moduloAxis0 = new ModuloAxis("^E788", (Range) null);
      Range range1 = xYSeriesCollection0.getDomainBounds(false);
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(132.077278);
      int int0 = xYSeriesCollection0.indexOf(0.05);
      String string0 = numberTickUnit0.valueToString((-4921.138783356268));
      String string1 = numberTickUnit0.valueToString(132.077278);
      moduloAxis0.setTickUnit(numberTickUnit0, true, true);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("^E788");
      boolean boolean0 = subCategoryAxis0.equals((Object) null);
      Paint paint0 = subCategoryAxis0.getTickMarkPaint();
      float float0 = subCategoryAxis0.getTickMarkInsideLength();
      Range range2 = Range.expandToInclude(moduloAxis0.DEFAULT_RANGE, 2.0F);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      int int1 = combinedRangeCategoryPlot0.getDatasetCount();
      boolean boolean1 = moduloAxis0.equals(combinedRangeCategoryPlot0);
      Object object0 = moduloAxis0.clone();
      PeriodAxis periodAxis0 = new PeriodAxis("^E788");
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("^E788");
      logarithmicAxis0.setLog10TickLabelsFlag(true);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("QntiMH.pUhxljqt(<T!");
      TickUnitSource tickUnitSource0 = NumberAxis.createIntegerTickUnits();
      periodAxis0.setStandardTickUnits(tickUnitSource0);
      CompassPlot compassPlot0 = new CompassPlot();
      Paint paint0 = compassPlot0.getRosePaint();
      periodAxis0.setTickMarkPaint(paint0);
      periodAxis0.setAxisLineVisible(true);
      periodAxis0.setLabel("QntiMH.pUhxljqt(<T!");
      Font font0 = periodAxis0.getTickLabelFont();
      DateAxis dateAxis0 = new DateAxis("QntiMH.pUhxljqt(<T!");
      DateTickMarkPosition dateTickMarkPosition0 = dateAxis0.getTickMarkPosition();
      dateAxis0.setTickMarkPosition(dateTickMarkPosition0);
      Stroke stroke0 = periodAxis0.getTickMarkStroke();
      periodAxis0.setLabelInsets(dateAxis0.DEFAULT_TICK_LABEL_INSETS);
      dateAxis0.setAutoTickIndex(500);
      periodAxis0.setLabel("");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(500);
      cyclicNumberAxis0.setAdvanceLineVisible(false);
      ModuloAxis moduloAxis0 = new ModuloAxis("vr2PB{[aizt", periodAxis0.DEFAULT_RANGE);
      moduloAxis0.resizeRange(0.0, 1.0E-8);
      double double0 = cyclicNumberAxis0.getCycleBound();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      TextBlock textBlock0 = new TextBlock();
      TextBox textBox0 = new TextBox(textBlock0);
      PieLabelRecord pieLabelRecord0 = new PieLabelRecord(true, 2.0, 0.0, textBox0, 0.0, (-468.5432788828679), 5.0E-6);
      extendedCategoryAxis0.removeCategoryLabelToolTip(pieLabelRecord0);
  }
}
