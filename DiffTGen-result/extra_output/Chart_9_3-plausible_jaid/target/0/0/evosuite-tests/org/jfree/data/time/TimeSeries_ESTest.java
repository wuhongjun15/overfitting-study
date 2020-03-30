/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:14:45 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.SpreadsheetDate;
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
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(4);
      Day day0 = new Day(spreadsheetDate0);
      Hour hour0 = new Hour(4, day0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-2955.698809), 1.7976931348623157E308);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(46, 62);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "Null 'start' \"rgument.", "Null 'start' \"rgument.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(0, (-938));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1589), 32);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Year year0 = new Year();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      timeSeries0.setMaximumItemAge(0L);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      timeSeries0.setMaximumItemCount(12);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, (double) 59);
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getTimePeriod(0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((long) 23, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Quarter quarter0 = new Quarter(3, 3);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "52WD!v]WsVA3|rr_", "52WD!v]WsVA3|rr_", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(1);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1259L);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "R'R`p\u0001~5hF", "org.jfree.data.time.TimeSeries", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1366), (-1366));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries("", class0);
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
  public void test11()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1525), 2063, 2063, 2063, 0);
      mockDate0.setTime(1L);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2798, "baW");
      Millisecond millisecond0 = new Millisecond(mockDate0, simpleTimeZone0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) millisecond0, (double) 0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Millisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Quarter.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "org.jfree.data.general.SeriesChangeListener", "org.jfree.data.general.SeriesChangeListener", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Hour> class0 = Hour.class;
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
      Week week0 = new Week();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1778L);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Day day0 = new Day(mockDate0, timeZone0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "7JF_GbtSXK5hGh]awE", "7JF_GbtSXK5hGh]awE", class0);
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
  public void test17()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(544L);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "U ~5M+,)J#(%", "U ~5M+,)J#(%", class0);
      int int0 = timeSeries0.getIndex(fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", "I_C4pU1-35(", class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "?ej&G_*5f:kr", "?ej&G_*5f:kr", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(999);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 999, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1762L));
      Week week0 = new Week(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "gVFo4K", class0);
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
  public void test21()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1525), 2063, 2063, 2063, 0);
      mockDate0.setTime(1L);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2798, "baW");
      Millisecond millisecond0 = new Millisecond(mockDate0, simpleTimeZone0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "?ej&G_*5f:kr", "?ej&G_*5f:kr", class0);
      boolean boolean0 = timeSeries0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-986L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(1775, 1775);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-2792), 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(59, 59);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 59, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "", "", class0);
      timeSeries0.delete((RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockDate mockDate0 = new MockDate(913L);
      Year year0 = new Year(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(year0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Quarter quarter0 = new Quarter(3, 3);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "52WD!v]WsVA3|rr_", "52WD!v]WsVA3|rr_", class0);
      timeSeries0.removeAgedItems((long) 4, true);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      TimeZone timeZone0 = TimeZone.getDefault();
      Day day0 = new Day(mockDate0, timeZone0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, 2600.108394459);
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getNextTimePeriod();
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate(regularTimePeriod0, 0.0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-986L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      MockDate mockDate0 = new MockDate(1775, 1775, 1775);
      Day day0 = new Day(mockDate0, fixedMillisecond0.DEFAULT_TIME_ZONE);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) day0, (Number) null);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      timeSeries0.add((RegularTimePeriod) minute0, (Number) 59);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      Day day0 = new Day();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) 0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (double) 0, false);
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period Fri Feb 14 20:21:21 GMT 2014 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      timeSeries0.add((RegularTimePeriod) minute0, (double) 0, false);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      TimeZone timeZone0 = TimeZone.getDefault();
      Day day0 = new Day(mockDate0, timeZone0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Day day0 = new Day();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-1328L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1778L);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Day day0 = new Day(mockDate0, timeZone0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "7JF_GbtSXK5hGh]awE", "7JF_GbtSXK5hGh]awE", class0);
      timeSeries0.setMaximumItemAge(1778L);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(544L);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "U ~5M+,)J#(%", "U ~5M+,)J#(%", class0);
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
  public void test42()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      timeSeries0.setMaximumItemCount(0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1525), 2063, 2063, 2063, 0);
      mockDate0.setTime(1L);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2798, "baW");
      Millisecond millisecond0 = new Millisecond(mockDate0, simpleTimeZone0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1525), 2063, 2063, 2063, 0);
      mockDate0.setTime(1L);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2798, "baW");
      Millisecond millisecond0 = new Millisecond(mockDate0, simpleTimeZone0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) millisecond0, (Number) 999);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Millisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", "I_C4pU1-35(", class0);
      timeSeries0.setRangeDescription("");
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Day day0 = new Day();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) day0, (Number) bigInteger0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Day, but the TimeSeries is expecting an instance of org.jfree.data.time.Minute.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "", "", class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MockDate mockDate0 = new MockDate(913L);
      Year year0 = new Year(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(year0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) year0, (double) 913L);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Month month0 = new Month();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "k[4SDXQpg", "k[4SDXQpg", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-1357));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      TimeZone timeZone0 = TimeZone.getDefault();
      Day day0 = new Day(mockDate0, timeZone0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
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
  public void test52()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "?ej&G_*5f:kr", "?ej&G_*5f:kr", class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "", "", class0);
      List list0 = timeSeries0.getItems();
      timeSeries0.data = list0;
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (Number) millisecond0.LAST_MILLISECOND_IN_SECOND);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableList", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, (double) 59);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.update(0, (Number) 23);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries("5", "French (France)", "5", class0);
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
  public void test58()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      timeSeries0.setDomainDescription("=r! q0U&/E");
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MockDate mockDate0 = new MockDate(913L);
      Year year0 = new Year(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(year0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
