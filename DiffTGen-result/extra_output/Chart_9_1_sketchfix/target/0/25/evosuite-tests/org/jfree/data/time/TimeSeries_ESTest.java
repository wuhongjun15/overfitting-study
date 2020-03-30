/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 10:56:09 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.time.Instant;
import java.time.temporal.ChronoField;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.CellRendererPane;
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
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1146, 1146, 1146);
      Minute minute0 = new Minute(mockDate0);
      RegularTimePeriod regularTimePeriod0 = minute0.previous();
      Class<ChronoField> class0 = ChronoField.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(regularTimePeriod0, (RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate(545, 1, (-708), 1, 545);
      Second second0 = new Second(mockDate0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.setMaximumItemAge(0L);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "~M3TT.Wz`79KjI|DNU", class0);
      timeSeries0.setMaximumItemCount(23);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (-2940.698103));
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
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
  public void test05()  throws Throwable  {
      Year year0 = new Year();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
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
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 919, 0, 9999, 0);
      Month month0 = new Month(mockDate0);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(9999);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 9999, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minute minute0 = new Minute();
      Day day0 = minute0.getDay();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (Number) 0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-1417));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1202, 1202, 1202);
      Minute minute0 = new Minute(mockDate0);
      Class<ChronoField> class0 = ChronoField.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
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
  public void test09()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, 0.0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "_O$)FCa", "Null 'end' argument.", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Day> class0 = Day.class;
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
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(59, 400);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 59, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1652L);
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1652L);
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Short short0 = new Short((short)0);
      timeSeries0.setMaximumItemCount(0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) short0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L, 999L);
      Date date0 = Date.from(instant0);
      Day day0 = new Day(date0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "Null 'end' argument.", "Null 'end' argument.", class0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) null);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) null);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period 1-January-1970 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries("", class0);
      MockDate mockDate0 = new MockDate();
      Hour hour0 = new Hour(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Day day0 = new Day();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, (String) null, "_f]g#u`l.pUpqzh ", class0);
      Second second0 = new Second();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) second0, (-1898.79885));
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Second, but the TimeSeries is expecting an instance of org.jfree.data.time.Hour.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((TimeSeriesDataItem) null, true);
      } catch(IllegalArgumentException e) {
         //
         // Null 'item' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "Requires start on or before end.", class0);
      int int0 = timeSeries0.getIndex(fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Class class0 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries("Null 'rowKey' argument.", "Null 'rowKey' argument.", "0WDK;dzDa]i\"sTY?", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod((-225));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "G)2,a8(#+@9<q", (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Second second0 = new Second();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1652L);
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      boolean boolean0 = timeSeries0.equals(day0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1146, 1146, 1146);
      Minute minute0 = new Minute(mockDate0);
      Class<ChronoField> class0 = ChronoField.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      boolean boolean0 = timeSeries0.equals(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries("org.jfree.data.time.Day", class0);
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
  public void test29()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1146, 1146, 1146);
      Minute minute0 = new Minute(mockDate0);
      Class<ChronoField> class0 = ChronoField.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) minute0, (RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 59);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<CellRendererPane> class0 = CellRendererPane.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-1372), 1);
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(">2B", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(Integer.MAX_VALUE, (-1030));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Minute minute0 = new Minute();
      Day day0 = minute0.getDay();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (Number) 0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, "", "", class0);
      timeSeries0.delete((RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1652L);
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.removeAgedItems(1806L, false);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(regularTimePeriod0, (-2940.698103));
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 0.0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-2.147483648E9), 0.0, true, false);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0, class0);
      BigInteger bigInteger0 = BigInteger.TEN;
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (Number) bigInteger0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1652L);
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries1 = new TimeSeries(day0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries1.addOrUpdate((RegularTimePeriod) day0, 1.7976931348623157E308);
      TimeSeries timeSeries2 = timeSeries0.addAndOrUpdate(timeSeries1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1652L);
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Short short0 = new Short((short)0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (Number) short0);
      timeSeries0.add(timeSeriesDataItem0, true);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) minute0, (Number) 59);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1652L);
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Short short0 = new Short((short)0);
      timeSeries0.setMaximumItemCount(0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) short0, false);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1652L);
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Short short0 = new Short((short)0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (Number) short0);
      timeSeries0.add(timeSeriesDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, true);
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period 1-January-1970 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1652L);
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, ", but the TimeSeries is expecting an instance of ", "", class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Second second0 = new Second();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1652L);
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockDate mockDate0 = new MockDate(545, 1, (-707), 1, 545);
      Second second0 = new Second(mockDate0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-7L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1652L);
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.setMaximumItemAge(1652L);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1652L);
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Short short0 = new Short((short)0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (Number) short0);
      timeSeries0.add(timeSeriesDataItem0, true);
      timeSeries0.setMaximumItemCount(0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<CellRendererPane> class0 = CellRendererPane.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-20));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Class<CellRendererPane> class0 = CellRendererPane.class;
      TimeSeries timeSeries0 = new TimeSeries("$_dBppy", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1652L);
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, (-1764), 1255, 1);
      Week week0 = new Week(mockDate0);
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "TimeSeries.update(TimePeriod, Number):  period does not exist.", "TimeSeries.update(TimePeriod, Number):  period does not exist.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (Number) 53);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.time.Second.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) millisecond0, (-947.252455751974));
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      Quarter quarter0 = new Quarter();
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) quarter0, (double) 1);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Quarter, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", locale0);
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      Day day0 = new Day(date0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.setRangeDescription("");
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1146, 1146, 1146);
      Minute minute0 = new Minute(mockDate0);
      Class<ChronoField> class0 = ChronoField.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (Number) 0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of java.time.temporal.ChronoField.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Second second0 = new Second();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries("org.jfree.data.ComparableObjectSeries", "org.jfree.data.ComparableObjectSeries", "org.jfree.data.ComparableObjectSeries", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, (-1544.0), false);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(29);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 29, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Week week0 = new Week(28, 28);
      TimeSeries timeSeries0 = new TimeSeries(week0);
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
  public void test61()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1146, 1146, 1146);
      Minute minute0 = new Minute(mockDate0);
      Class<ChronoField> class0 = ChronoField.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
      boolean boolean0 = timeSeries1.equals(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(Integer.MAX_VALUE, year0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries("", class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "?q*NG%hZ99FQZP", class0);
      // Undeclared exception!
      try { 
        timeSeries0.update(2, (Number) hour0.FIRST_HOUR_IN_DAY);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries("", class0);
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
  public void test66()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Week week0 = new Week(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      timeSeries0.setDomainDescription("");
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
