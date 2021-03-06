/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:21:04 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.text.DateFormatSymbols;
import java.text.ParsePosition;
import java.time.Instant;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.general.SubSeriesDataset;
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
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Second second0 = new Second(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) second0, 1.5);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(999, 999);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.add((RegularTimePeriod) quarter0, (double) 4, false);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.add((RegularTimePeriod) hour0, (double) 0);
      int int0 = timeSeries0.getIndex(hour0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-2188L));
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(localDate0, (String) null, (String) null, class0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      byte[] byteArray0 = new byte[3];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) null, (Number) bigInteger0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "\"U't^&'+&\"]", "\"U't^&'+&\"]", class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-787), (Number) 1);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-887.424836), 0.0);
      Class<SubSeriesDataset> class0 = SubSeriesDataset.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0, "L`@", "L`@", class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems(9223372036854775807L, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) hour0, (double) 23);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, "", "~w6l\"ug~", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriodsUniqueToOtherSeries((TimeSeries) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Year year0 = new Year();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "org.jfree.data.time.Quarter", "-9{S]y1PR`wEUmY1", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(1036);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1036, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-887.424836), 0.0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(2063, 2063);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2063, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries("i[hFo]wA|EZwVU5u", (String) null, (String) null, class0);
      timeSeries0.data = null;
      // Undeclared exception!
      try { 
        timeSeries0.clone();
      } catch(IllegalArgumentException e) {
         //
         // Null 'collection' argument.
         //
         verifyException("org.jfree.chart.util.ObjectUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.addAndOrUpdate((TimeSeries) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Week week0 = new Week((-3175), (-2884));
      TimeSeries timeSeries0 = new TimeSeries(week0);
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
  public void test14()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getTimeZone("Negative 'periods' argument.");
      Second second0 = new Second(mockDate0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) second0, (Number) 0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Second, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      timeSeries0.data = null;
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) millisecond0, (Number) 0, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) second0, (Number) 0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Second, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(334);
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, (Number) (-1));
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Day day0 = new Day();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "B", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) day0, (-1.0));
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Day, but the TimeSeries is expecting an instance of java.util.TimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "Null 'item' argument.", "@KsFe&i27#45.L#cE7l", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Date> class0 = Date.class;
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
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockDate mockDate0 = new MockDate(150L);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "mgW0:Kh", "!6fUgUZ/E)", class0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) 999);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Minute minute0 = new Minute();
      Second second0 = new Second(89, minute0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) minute0, (double) 89);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      int int0 = timeSeries0.getIndex(hour0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Month month0 = new Month();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) month0, 0.0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.Week.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Month month0 = new Month();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(212);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 212, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Day day0 = new Day();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, (String) null, " but the series already contains an observation", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(2205);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2205, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Month month0 = new Month();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "Null 'key' argument.", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-2295));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance(locale0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      ParsePosition parsePosition0 = new ParsePosition(1218);
      Date date0 = mockSimpleDateFormat0.parse("", parsePosition0);
      Day day0 = new Day(date0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      boolean boolean0 = timeSeries0.equals(class0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Double double0 = new Double(685.576568544);
      XYDataItem xYDataItem0 = new XYDataItem((Number) double0, (Number) double0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) null, (RegularTimePeriod) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'start' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) hour0, (double) 23);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, "", "~w6l\"ug~", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Month month0 = new Month();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(5254, (-1925));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 23);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Second second0 = new Second();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(511, 59);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockDate mockDate0 = new MockDate(243, 935, (-1619), (-2566), (-456));
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Hour hour0 = new Hour(mockDate0, zoneInfo0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1619), 0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1619
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Second second0 = new Second(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) second0, 1.5);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      timeSeries0.delete((RegularTimePeriod) second0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1348, "");
      Minute minute0 = new Minute(mockDate0, simpleTimeZone0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      Day day0 = minute0.getDay();
      timeSeries0.add((RegularTimePeriod) day0, (Number) 59);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.removeAgedItems(1L, true);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Second second0 = new Second();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, (double) 511);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, (double) 0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeSeries timeSeries0 = new TimeSeries(mockDate0);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (double) (-538));
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance(locale0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      ParsePosition parsePosition0 = new ParsePosition(1218);
      Date date0 = mockSimpleDateFormat0.parse("", parsePosition0);
      Day day0 = new Day(date0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Double double0 = new Double(1218);
      timeSeries0.add((RegularTimePeriod) day0, (Number) double0);
      Year year0 = new Year();
      timeSeries0.update((RegularTimePeriod) year0, (Number) double0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Quarter quarter0 = new Quarter(date0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) quarter0, (Number) 1);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      timeSeries0.add((RegularTimePeriod) millisecond0, (Number) 0, false);
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getNextTimePeriod();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) hour0, (double) 23);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, "", "~w6l\"ug~", class0);
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
  public void test49()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, 0.0);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) hour0, (double) 23);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, "", "~w6l\"ug~", class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) hour0, (double) 23);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, "", "~w6l\"ug~", class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) hour0, (double) 23);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, "", "~w6l\"ug~", class0);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem((RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1348, "");
      Minute minute0 = new Minute(mockDate0, simpleTimeZone0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      timeSeries0.setMaximumItemAge(59);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-767));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      timeSeries0.setMaximumItemCount(999);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries("i[hFo]wA|EZwVU5u", (String) null, (String) null, class0);
      timeSeries0.setRangeDescription("m$]e={{+7I/+r~Dt6BN");
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries("i[hFo]wA|EZwVU5u", (String) null, (String) null, class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.add((RegularTimePeriod) hour0, (double) 0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(0, 23);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1348, "");
      Minute minute0 = new Minute(mockDate0, simpleTimeZone0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      Day day0 = minute0.getDay();
      timeSeries0.add((RegularTimePeriod) day0, (Number) 59);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Number number0 = timeSeries0.getValue((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
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
  public void test63()  throws Throwable  {
      Month month0 = new Month();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, 0.0);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance(locale0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      ParsePosition parsePosition0 = new ParsePosition(1218);
      Date date0 = mockSimpleDateFormat0.parse("", parsePosition0);
      Day day0 = new Day(date0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries("Value", class0);
      BigInteger bigInteger0 = BigInteger.ONE;
      // Undeclared exception!
      try { 
        timeSeries0.update(11, (Number) bigInteger0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 11, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, 0.0);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) hour0, (double) 23);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, "", "~w6l\"ug~", class0);
      timeSeries0.setDomainDescription("");
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-887.424836), 0.0);
      Class<SubSeriesDataset> class0 = SubSeriesDataset.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0, "L`@", "L`@", class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
