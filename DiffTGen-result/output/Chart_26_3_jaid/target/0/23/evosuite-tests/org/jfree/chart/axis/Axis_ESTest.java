/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 12:53:46 GMT 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.color.ICC_Profile;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ByteLookupTable;
import java.awt.image.IndexColorModel;
import java.awt.image.Kernel;
import java.awt.image.RescaleOp;
import java.text.NumberFormat;
import java.time.DateTimeException;
import java.time.YearMonth;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.Stack;
import java.util.TimeZone;
import javax.swing.JLayer;
import javax.swing.JTextArea;
import javax.swing.text.DefaultCaret;
import javax.swing.text.JTextComponent;
import javax.swing.text.PlainDocument;
import javax.swing.text.StringContent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.time.MockYearMonth;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.javax.swing.MockJFileChooser;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.TextAnnotation;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTick;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.PeriodAxisLabelInfo;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.axis.StandardTickUnitSource;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.TickUnit;
import org.jfree.chart.axis.TickUnitSource;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.text.TextAnchor;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.Range;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Week;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Null 'padding' argument.");
      int int0 = 2049;
      Rectangle2D rectangle2D0 = null;
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1887.7232634), "Null 'padding' argument.");
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryPlot categoryPlot0 = new CategoryPlot(taskSeriesCollection0, subCategoryAxis0, cyclicNumberAxis0, statisticalBarRenderer0);
      ValueAxis[] valueAxisArray0 = new ValueAxis[3];
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot(taskSeriesCollection0);
      CategoryURLGenerator categoryURLGenerator0 = spiderWebPlot0.getURLGenerator();
      statisticalBarRenderer0.setSeriesURLGenerator(2049, (CategoryURLGenerator) null, true);
      valueAxisArray0[0] = (ValueAxis) cyclicNumberAxis0;
      valueAxisArray0[1] = (ValueAxis) cyclicNumberAxis0;
      CyclicNumberAxis cyclicNumberAxis1 = new CyclicNumberAxis(0.05, (-733.0));
      valueAxisArray0[2] = (ValueAxis) cyclicNumberAxis1;
      categoryPlot0.setRangeAxes(valueAxisArray0);
      RectangleEdge rectangleEdge0 = categoryPlot0.getRangeAxisEdge();
      // Undeclared exception!
      try { 
        RectangleEdge.coordinate((Rectangle2D) null, rectangleEdge0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.RectangleEdge", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("9D4?C3D&gw6D?Il");
      NumberTickUnit numberTickUnit0 = new NumberTickUnit((-188.5));
      String string0 = numberTickUnit0.valueToString(0.0);
      Paint paint0 = extendedCategoryAxis0.getTickLabelPaint((Comparable) numberTickUnit0);
      DateAxis dateAxis0 = new DateAxis("9D4?C3D&gw6D?Il");
      int int0 = 10;
      int int1 = 52;
      int int2 = (-600);
      // Undeclared exception!
      try { 
        MockDateFormat.getTimeInstance(52);
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 52
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      boolean boolean0 = dateAxis0.isHiddenValue(1630L);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      dateAxis0.setTimeZone(zoneInfo0);
      TimeZone.setDefault(zoneInfo0);
      DefaultCaret defaultCaret0 = new DefaultCaret();
      defaultCaret0.setFrameFromCenter((-884.1378), 0.0, 499.5, (-2751.5));
      dateAxis0.setRightArrow(defaultCaret0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(500);
      cyclicNumberAxis0.setAutoTickUnitSelection(true);
      cyclicNumberAxis0.setPeriod((-3.0));
      boolean boolean1 = dateAxis0.equals(zoneInfo0);
      cyclicNumberAxis0.setRange(dateAxis0.DEFAULT_RANGE, false, false);
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("Null 'series' not permitted.");
      logarithmicAxis0.setDefaultAutoRange(cyclicNumberAxis0.DEFAULT_RANGE);
      logarithmicAxis0.setAllowNegativesFlag(true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "q w>7";
      stringArray0[1] = "q w>7";
      stringArray0[2] = "q w>7";
      stringArray0[3] = "q w>7";
      stringArray0[4] = "q w>7";
      SymbolAxis symbolAxis0 = new SymbolAxis("q w>7", stringArray0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("q w>7");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      ValueAxis valueAxis0 = thermometerPlot0.getRangeAxis();
      combinedDomainCategoryPlot0.setRangeAxis(500, valueAxis0, true);
      boolean boolean0 = symbolAxis0.equals(combinedDomainCategoryPlot0);
      subCategoryAxis0.configure();
      Hour hour0 = null;
      try {
        hour0 = new Hour((Date) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'time' argument.
         //
         verifyException("org.jfree.data.time.Hour", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2.0, 2.0);
      cyclicNumberAxis0.zoomRange(2.0, 2.0);
      cyclicNumberAxis0.setAutoTickUnitSelection(true);
      cyclicNumberAxis0.setAutoTickUnitSelection(false, false);
      float float0 = cyclicNumberAxis0.getTickMarkInsideLength();
      boolean boolean0 = cyclicNumberAxis0.getAutoRangeIncludesZero();
      String string0 = "";
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
  public void test05()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-777.58467923), "O3\"@f9OU]}}[xbd8I");
      boolean boolean0 = cyclicNumberAxis0.isTickLabelsVisible();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      NumberTickUnit numberTickUnit0 = new NumberTickUnit(0.05);
      String string0 = numberTickUnit0.valueToString(0.05);
      String string1 = numberTickUnit0.valueToString(1.0E-8);
      logarithmicAxis0.setTickUnit(numberTickUnit0);
      logarithmicAxis0.setupSmallLogFlag();
      logarithmicAxis0.setFixedDimension((-1.0));
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      subCategoryAxis0.addSubCategory(true);
      subCategoryAxis0.setTickLabelPaint((Comparable) true, logarithmicAxis0.DEFAULT_TICK_LABEL_PAINT);
      Object object0 = logarithmicAxis0.clone();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "0.05";
      stringArray0[1] = "0.05";
      stringArray0[2] = "";
      SymbolAxis symbolAxis0 = new SymbolAxis("0.05", stringArray0);
      symbolAxis0.setGridBandsVisible(true);
      DateAxis dateAxis0 = new DateAxis("v");
      boolean boolean0 = dateAxis0.equals(numberTickUnit0);
      String string2 = "";
      Hour hour0 = Hour.parseHour("ItemLabelAnchor.OUTSIDE9");
      YearMonth yearMonth0 = MockYearMonth.now();
      // Undeclared exception!
      try { 
        ZoneOffset.from(yearMonth0);
      } catch(DateTimeException e) {
         //
         // Unable to obtain ZoneOffset from TemporalAccessor: 2014-02 of type java.time.YearMonth
         //
         verifyException("java.time.ZoneOffset", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1625.902), 2.0);
      NumberFormat numberFormat0 = cyclicNumberAxis0.getNumberFormatOverride();
      cyclicNumberAxis0.setLabelToolTip("UnitType.ABSOLUTE");
      cyclicNumberAxis0.zoomRange(2.0, 2.0);
      double double0 = cyclicNumberAxis0.getPeriod();
      cyclicNumberAxis0.setTickMarkOutsideLength(1255.838F);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      PeriodAxis periodAxis0 = new PeriodAxis("=&[BKti,cdJ/1", fixedMillisecond0, fixedMillisecond0);
      periodAxis0.setFixedDimension(1.0E-6);
      Object object0 = periodAxis0.clone();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      MockDate mockDate0 = new MockDate(500);
      DateAxis dateAxis1 = new DateAxis("5m*0U\"Fc/");
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(dateAxis0);
      dateAxis1.notifyListeners(axisChangeEvent0);
      boolean boolean0 = mockDate0.before(dateAxis0.DEFAULT_ANCHOR_DATE);
      DateTickUnit dateTickUnit0 = dateAxis1.getTickUnit();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("5m*0U\"Fc/", combinedRangeCategoryPlot0);
      RenderingHints renderingHints0 = jFreeChart0.getRenderingHints();
      RescaleOp rescaleOp0 = new RescaleOp(500, 0.0F, renderingHints0);
      // Undeclared exception!
      try { 
        ICC_Profile.getInstance(6);
      } catch(IllegalArgumentException e) {
         //
         // Unknown color space
         //
         verifyException("java.awt.color.ICC_Profile", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "org.jfree.chart.axis.Axis";
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(392.41670066553803, (-2.147483648E9), "org.jfree.chart.axis.Axis");
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("org.jfree.data.xy.YIntervalSeriesCollection");
      cyclicNumberAxis0.setTickMarkPaint(logarithmicAxis0.DEFAULT_AXIS_LINE_PAINT);
      logarithmicAxis0.setRangeWithMargins(cyclicNumberAxis0.DEFAULT_RANGE);
      logarithmicAxis0.setAutoRange(true);
      double double0 = logarithmicAxis0.calculateLowestVisibleTickValue();
      logarithmicAxis0.setAllowNegativesFlag(false);
      cyclicNumberAxis0.setTickMarkInsideLength(1830.603F);
      // Undeclared exception!
      try { 
        NumberAxis.createIntegerTickUnits((Locale) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      TickUnitSource tickUnitSource0 = NumberAxis.createIntegerTickUnits(locale0);
      MockDate mockDate0 = (MockDate)DateAxis.DEFAULT_ANCHOR_DATE;
      Hour hour0 = new Hour(mockDate0);
      RegularTimePeriod regularTimePeriod0 = hour0.previous();
      PeriodAxis periodAxis0 = new PeriodAxis("J:33", regularTimePeriod0, regularTimePeriod0);
      MockFile mockFile0 = new MockFile("J:33");
      MockJFileChooser mockJFileChooser0 = new MockJFileChooser(mockFile0);
      JLayer<MockJFileChooser> jLayer0 = new JLayer<MockJFileChooser>(mockJFileChooser0);
      jLayer0.firePropertyChange("J:33", (byte)0, (byte)55);
      boolean boolean0 = periodAxis0.hasListener(jLayer0);
      boolean boolean1 = periodAxis0.isAxisLineVisible();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      String string0 = categoryAxis3D0.getLabelToolTip();
      DateAxis dateAxis0 = new DateAxis("");
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      JFreeChart jFreeChart0 = new JFreeChart("", thermometerPlot0);
      RenderingHints renderingHints0 = jFreeChart0.getRenderingHints();
      RescaleOp rescaleOp0 = new RescaleOp((-365.088F), 0.0F, renderingHints0);
      int int0 = (-795);
      byte[][] byteArray0 = new byte[1][1];
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte) (-40);
      byte byte0 = (byte)28;
      byteArray1[1] = (byte)28;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)0;
      byte byte1 = (byte)79;
      byteArray1[4] = (byte)79;
      byteArray1[5] = (byte)12;
      byteArray0[0] = byteArray1;
      ByteLookupTable byteLookupTable0 = null;
      try {
        byteLookupTable0 = new ByteLookupTable((-795), byteArray0);
      } catch(IllegalArgumentException e) {
         //
         // Offset must be greater than 0
         //
         verifyException("java.awt.image.LookupTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("{|}{4RgzbNr_$9/s8-h");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      ZoneInfo zoneInfo0 = (ZoneInfo)SegmentedTimeline.DEFAULT_TIME_ZONE;
      DateAxis dateAxis0 = new DateAxis("N", zoneInfo0);
      Range range0 = combinedDomainXYPlot0.getDataRange(dateAxis0);
      ModuloAxis moduloAxis0 = new ModuloAxis("{|}{4RgzbNr_$9/s8-h", (Range) null);
      boolean boolean0 = extendedCategoryAxis0.equals(moduloAxis0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      RegularTimePeriod regularTimePeriod0 = millisecond0.next();
      PeriodAxis periodAxis0 = new PeriodAxis("GradientPaintTransformType.HORIZONTAL", regularTimePeriod0, millisecond0, millisecond0.DEFAULT_TIME_ZONE);
      String string0 = "";
      int int0 = (-1);
      float[] floatArray0 = new float[7];
      floatArray0[0] = (float) 500;
      floatArray0[1] = (float) 999;
      floatArray0[2] = (-928.2335F);
      floatArray0[3] = (float) 0L;
      floatArray0[4] = 4617.0F;
      floatArray0[5] = 0.0F;
      floatArray0[6] = (float) 500;
      Kernel kernel0 = null;
      try {
        kernel0 = new Kernel((-1), 500, floatArray0);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.image.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "org.jfree.chart.plot.DatasetRenderingOrder";
      String[] stringArray0 = new String[0];
      SymbolAxis symbolAxis0 = new SymbolAxis("org.jfree.chart.plot.DatasetRenderingOrder", stringArray0);
      StandardTickUnitSource standardTickUnitSource0 = new StandardTickUnitSource();
      TickUnit tickUnit0 = standardTickUnitSource0.getCeilingTickUnit((TickUnit) symbolAxis0.DEFAULT_TICK_UNIT);
      // Undeclared exception!
      try { 
        symbolAxis0.estimateMaximumTickLabelWidth((Graphics2D) null, tickUnit0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.NumberAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1284.057991033));
      cyclicNumberAxis0.setLowerBound((-1592.8));
      boolean boolean0 = cyclicNumberAxis0.getAutoRangeIncludesZero();
      String string0 = "";
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      timeZone0.setRawOffset(500);
      timeZone0.setID("");
      TickUnitSource tickUnitSource0 = DateAxis.createStandardDateTickUnits(timeZone0);
      Object object0 = cyclicNumberAxis0.clone();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      int int0 = 34;
      int int1 = 42;
      BufferedImage bufferedImage0 = null;
      try {
        bufferedImage0 = new BufferedImage(34, 34, 42);
      } catch(IllegalArgumentException e) {
         //
         // Unknown image type 42
         //
         verifyException("java.awt.image.BufferedImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      DateAxis dateAxis0 = new DateAxis("-yQMMIKDP", zoneInfo0);
      DateTickUnit dateTickUnit0 = dateAxis0.getTickUnit();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "?APd'6XyBC1~RdrW4AW";
      MockDate mockDate0 = new MockDate(3182, (-1537), 0, 0, 0);
      SimpleTimeZone simpleTimeZone0 = null;
      try {
        simpleTimeZone0 = new SimpleTimeZone(0, "?APd'6XyBC1~RdrW4AW", (-2306), (-1), (-1014), 0, 3182, 0, (-2306), 3182, 0);
      } catch(IllegalArgumentException e) {
         //
         // Illegal start month -2306
         //
         verifyException("java.util.SimpleTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis((String) null);
      Stack<String> stack0 = new Stack<String>();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-31);
      byteArray0[1] = (byte)0;
      byte byte0 = (byte)0;
      byteArray0[2] = (byte)0;
      byte byte1 = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-87);
      byte byte2 = (byte) (-14);
      byteArray0[5] = (byte) (-14);
      byteArray0[6] = (byte)98;
      byteArray0[7] = (byte)12;
      byteArray0[8] = (byte)0;
      IndexColorModel indexColorModel0 = null;
      try {
        indexColorModel0 = new IndexColorModel(4332, 4332, byteArray0, byteArray0, byteArray0, byteArray0);
      } catch(IllegalArgumentException e) {
         //
         // Number of bits must be between 1 and 16.
         //
         verifyException("java.awt.image.IndexColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1262.042173, 1262.042173);
      TextAnchor textAnchor0 = TextAnnotation.DEFAULT_ROTATION_ANCHOR;
      NumberTick numberTick0 = new NumberTick(0.05, (String) null, textAnchor0, textAnchor0, (-5656.926162900562));
      double double0 = 0.0;
      StringContent stringContent0 = new StringContent();
      PlainDocument plainDocument0 = new PlainDocument(stringContent0);
      JTextArea jTextArea0 = new JTextArea(plainDocument0, (String) null, 500, 500);
      JTextComponent.AccessibleJTextComponent jTextComponent_AccessibleJTextComponent0 = jTextArea0.new AccessibleJTextComponent();
      Rectangle rectangle0 = jTextComponent_AccessibleJTextComponent0.getCharacterBounds(500);
      String string0 = "06OW";
      // Undeclared exception!
      try { 
        Week.parseWeek("");
      } catch(IllegalArgumentException e) {
         //
         // Could not find separator.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("TD[]X|'wyoDg?2");
      logarithmicAxis0.zoomRange(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = "";
      PeriodAxis periodAxis0 = new PeriodAxis("");
      periodAxis0.setUpperMargin(0.0);
      periodAxis0.setMinorTickMarkInsideLength((-1.0F));
      RegularTimePeriod regularTimePeriod0 = periodAxis0.getFirst();
      Font font0 = periodAxis0.getLabelFont();
      String string1 = "rY?e~F#Q2,Gg,]&L";
      DateAxis dateAxis0 = new DateAxis("rY?e~F#Q2,Gg,]&L");
      PeriodAxisLabelInfo[] periodAxisLabelInfoArray0 = periodAxis0.getLabelInfo();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.05);
      double double0 = periodAxis0.getLabelAngle();
      Graphics2D graphics2D0 = null;
      RectangleEdge rectangleEdge0 = null;
      Rectangle2D rectangle2D0 = periodAxis0.getLabelEnclosure((Graphics2D) null, (RectangleEdge) null);
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("Null 'orientation' argument.");
      Font font1 = extendedCategoryAxis0.getSubLabelFont();
      periodAxis0.configure();
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("Null 'numberFormatter' argument.");
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.draw((Graphics2D) null, 0.0, rectangle2D0, rectangle2D0, (RectangleEdge) null, plotRenderingInfo0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.ValueAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("]9vJ7 AL,SR#{1@4<");
      Date date0 = dateAxis0.getMaximumDate();
      DateTickUnit dateTickUnit0 = dateAxis0.getTickUnit();
      Date date1 = dateAxis0.nextStandardDate(date0, dateTickUnit0);
      dateAxis0.setLabelToolTip((String) null);
      ModuloAxis moduloAxis0 = new ModuloAxis("Pna\"z>j9Y#K&(\";8:D", dateAxis0.DEFAULT_RANGE);
      moduloAxis0.resizeRange((-1409.161947053187), 3719.326241170779);
      boolean boolean0 = dateAxis0.isHiddenValue(3208L);
  }
}
