/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 13:09:22 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Canvas;
import java.math.BigInteger;
import java.text.ParsePosition;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.TextStyle;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.statistics.SimpleHistogramBin;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.SerialDate;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", "", class0);
      timeSeries0.setMaximumItemCount(365);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      byte[] byteArray0 = new byte[1];
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) year0, (Number) (byte)76);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      timeSeries0.update(0, (Number) bigInteger0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      boolean boolean0 = timeSeries0.equals(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2156, 2, 3);
      Year year0 = new Year(mockDate0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "", "vEu1'Hd8ICF", class0);
      // Undeclared exception!
      try { 
        timeSeries0.update(2, (Number) 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Second second0 = new Second();
      Class<Integer> class0 = Integer.TYPE;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((long) 0, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod((-1091));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3, (-1), 3, (-1006), (-1), 2913);
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(2913);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Quarter quarter0 = new Quarter(mockDate0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(2146244476);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2146244476, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) quarter0, 0.0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Quarter, but the TimeSeries is expecting an instance of java.util.TimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries("", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, (Number) null, false);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      timeSeries0.timePeriodClass = class0;
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) day0, (Number) null);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Day, but the TimeSeries is expecting an instance of java.util.SimpleTimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<TextStyle> class0 = TextStyle.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, (String) null, (String) null, class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Month month0 = new Month(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "", "yyyy-MM-dd", class0);
      timeSeries0.removeAgedItems(true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) quarter0, (Number) 4);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Quarter, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.add((TimeSeriesDataItem) null, false);
      } catch(IllegalArgumentException e) {
         //
         // Null 'item' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Month month0 = new Month(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "", "yyyy-MM-dd", class0);
      int int0 = timeSeries0.getIndex(month0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", locale0);
      ParsePosition parsePosition0 = new ParsePosition(3);
      Date date0 = mockSimpleDateFormat0.parse("", parsePosition0);
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(date0, date0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Week week0 = new Week((-458), (-458));
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      Millisecond millisecond0 = new Millisecond();
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) millisecond0, (double) 1, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Millisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.FixedMillisecond.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      Second second0 = new Second(date0);
      Day day0 = new Day(date0, second0.DEFAULT_TIME_ZONE);
      Hour hour0 = new Hour(1962, day0);
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Second second0 = new Second(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(47);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 47, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-391));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries("", class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(1732L, 1732L);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, (String) null, "?", class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, (RegularTimePeriod) fixedMillisecond0);
      timeSeries1.setRangeDescription("?Y(hH.w^C~j0X*");
      boolean boolean0 = timeSeries0.equals(timeSeries1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries("Value", "", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", class0);
      MockDate mockDate0 = new MockDate(0L);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = JComponent.getDefaultLocale();
      Week week0 = new Week(mockDate0, timeZone0, locale0);
      boolean boolean0 = timeSeries0.equals(week0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, regularTimePeriod0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start on or before end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, (RegularTimePeriod) fixedMillisecond0);
      timeSeries1.setMaximumItemCount(0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Quarter quarter0 = new Quarter(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (Number) 1);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(0, 758);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Quarter quarter0 = new Quarter(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 758);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(343L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-1299), 1);
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Second second0 = new Second();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "Null 'period' argument.", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(59, 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-4083), 670, (-4083), 415, (-4083), (-4083));
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Day day0 = new Day(serialDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(6, 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1097L);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(serialDate0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(0, 1);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      Week week0 = new Week(date0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.delete((RegularTimePeriod) week0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-1506.738414535526), 937.5340195713965);
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Float float0 = new Float(1.0F);
      XYDataItem xYDataItem0 = new XYDataItem((Number) float0, (Number) float0);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      timeSeries0.removeAgedItems(119L, false);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "]:8oUY)#XH3cSkq+1z=", "v++@gNO7~:gAHU5", class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "]:8oUY)#XH3cSkq+1z=", "v++@gNO7~:gAHU5", class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) quarter0, (Number) 4);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, class0);
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getTimeZone("r\"");
      Hour hour0 = new Hour(mockDate0, timeZone0);
      Minute minute0 = new Minute(0, hour0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) minute0, (double) 0);
      timeSeries0.add(timeSeriesDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period Fri Feb 14 20:21:21 GMT 2014 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Second second0 = new Second(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) second0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("The number of categories does not match the data.");
      // Undeclared exception!
      try { 
        timeSeries0.delete((RegularTimePeriod) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Second second0 = new Second(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      Second second0 = new Second(date0);
      Day day0 = new Day(date0, second0.DEFAULT_TIME_ZONE);
      Hour hour0 = new Hour(1962, day0);
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "", class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) year0, (Number) (byte)76);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem((RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-897L));
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      XYDataItem xYDataItem0 = new XYDataItem(bigInteger0, bigInteger0);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      timeSeries0.setMaximumItemAge(1732L);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-1));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-655.192058811), (-655.192058811));
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      Minute minute0 = new Minute(date0);
      Day day0 = minute0.getDay();
      timeSeries0.add((RegularTimePeriod) day0, (Number) 59);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Second second0 = new Second();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "cHvMuhgxAebe</", "cHvMuhgxAebe</", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) second0, (Number) 0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Second, but the TimeSeries is expecting an instance of java.lang.Object.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Month month0 = new Month(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "", "yyyy-MM-dd", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) month0, 0.0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of java.util.SimpleTimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("]");
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-1299));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(0, hour0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "aNurib3\"ossQ", "NbB \"{M", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getNextTimePeriod();
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Second second0 = new Second();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "cHvMuhgxAebe</", "cHvMuhgxAebe</", class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Month month0 = new Month();
      Class<Canvas> class0 = Canvas.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Second second0 = new Second();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, (String) null, (String) null, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, 0.0);
      // Undeclared exception!
      try { 
        timeSeries0.addAndOrUpdate(timeSeries0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Second, but the TimeSeries is expecting an instance of java.lang.String.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      Object object0 = timeSeries0.clone();
      boolean boolean0 = timeSeries0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Month month0 = new Month();
      Class<Canvas> class0 = Canvas.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      Byte byte0 = new Byte((byte) (-108));
      // Undeclared exception!
      try { 
        timeSeries0.update((-844), (Number) byte0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((TimeSeriesDataItem) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'item' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      Week week0 = new Week(date0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.setDomainDescription("TimeSeries.ufdate(+imePeriod, Number)w  periodNdoes not exist.");
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", "", class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
