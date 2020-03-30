/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:32:30 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
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
import org.jfree.data.time.SimpleTimePeriod;
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
      MockDate mockDate0 = new MockDate(29, 2000, 44, (-266), (-266), (-2217));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "zT5s|", (String) null, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(regularTimePeriod0, (RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(213, 4187);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1800, 1800, 1800);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      timeSeries0.setMaximumItemAge(0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 2000, 44, (-266), (-266), (-2217));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "zT5s|", (String) null, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (double) 44);
      int int0 = timeSeries0.getIndex(fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 2000, 44, (-266), (-266), (-2217));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "zT5s|", (String) null, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (double) 44);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem(0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1657L);
      TimeZone timeZone0 = TimeZone.getDefault();
      Minute minute0 = new Minute(mockDate0, timeZone0);
      Day day0 = minute0.getDay();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) 59);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, (double) (-3344));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, ") is not recognised.", ") is not recognised.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((long) 4, false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-1));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Year year0 = new Year();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3197, (-698), 3197, (-698), (-2564));
      TimeZone timeZone0 = TimeZone.getTimeZone("org.jfree.data.time.TimeSeriesDataItem");
      Year year0 = new Year(mockDate0, timeZone0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-2564), 1623);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2564
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
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
  public void test12()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (Number) 59);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of java.lang.Object.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Object> class0 = Object.class;
      Locale locale0 = Locale.CHINA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Month month0 = new Month(date0, hour0.DEFAULT_TIME_ZONE);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) month0, (double) 1392409281320L);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of java.lang.Object.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "", "", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "[_}=q=", "[_}=q=", class0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      TimeSeries timeSeries0 = new TimeSeries(mockGregorianCalendar0);
      Day day0 = new Day();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) integer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(456L);
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "!", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, 1298.784884795);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Second.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 2000, 44, (-266), (-266), (-2217));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "zT5s|", (String) null, class0);
      int int0 = timeSeries0.getIndex(fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1657L);
      TimeZone timeZone0 = TimeZone.getDefault();
      Minute minute0 = new Minute(mockDate0, timeZone0);
      Day day0 = minute0.getDay();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Class class0 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      Month month0 = new Month(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) month0, (double) 0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of java.lang.Integer.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Second second0 = new Second();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "qtrz7ct|ymWmAV", "qtrz7ct|ymWmAV", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) second0, (Number) 59, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Second, but the TimeSeries is expecting an instance of java.lang.Object.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod((-619));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(1861);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1861, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Second second0 = new Second();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) second0, (-3200.8910749142));
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, ") is not recognised.", ") is not recognised.", class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      boolean boolean0 = timeSeries0.equals(class0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 2000, 44, (-266), (-266), (-2217));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "zT5s|", (String) null, class0);
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
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1800, 1800, 1800);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(1800, 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-3376), (-3376));
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (double) 0);
      timeSeries0.delete(0, 0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "Null 'end' argument.", "Null 'end' argument.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(181, 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 2839.0862147, false, true);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(0, 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.delete((RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 2839.0862147, false, true);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0, class0);
      Day day0 = new Day();
      timeSeries0.add((RegularTimePeriod) day0, (double) 351L);
      timeSeries0.removeAgedItems(351L, true);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Week week0 = new Week();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, 0.0);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      timeSeries0.removeAgedItems(414L, true);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1657L);
      TimeZone timeZone0 = TimeZone.getDefault();
      Minute minute0 = new Minute(mockDate0, timeZone0);
      Day day0 = minute0.getDay();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) 59);
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getNextTimePeriod();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(regularTimePeriod0, (double) (-3344));
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockDate mockDate0 = new MockDate(243, 29, 9, 4, 243, 9);
      Week week0 = new Week(mockDate0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (Number) week0.FIRST_WEEK_IN_YEAR);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1657L);
      TimeZone timeZone0 = TimeZone.getDefault();
      Minute minute0 = new Minute(mockDate0, timeZone0);
      Day day0 = minute0.getDay();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) minute0, (RegularTimePeriod) day0);
      timeSeries1.add((RegularTimePeriod) day0, (Number) 59);
      TimeSeries timeSeries2 = timeSeries0.addAndOrUpdate(timeSeries1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1657L);
      TimeZone timeZone0 = TimeZone.getDefault();
      Minute minute0 = new Minute(mockDate0, timeZone0);
      Day day0 = minute0.getDay();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) 59);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) minute0, (Number) 53);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(29, year0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
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
  public void test45()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1657L);
      TimeZone timeZone0 = TimeZone.getDefault();
      Minute minute0 = new Minute(mockDate0, timeZone0);
      Day day0 = minute0.getDay();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) 59);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "gap,", "gap,", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((RegularTimePeriod) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-372.7), 0.0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "K<om*aE#N,8yUA", "K<om*aE#N,8yUA", class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Second second0 = new Second();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "qtrz7ct|ymWmAV", "qtrz7ct|ymWmAV", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) second0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, "Nearest", "Nearest", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-1154L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, ") is not recognised.", ") is not recognised.", class0);
      timeSeries0.setMaximumItemAge(1);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1657L);
      TimeZone timeZone0 = TimeZone.getDefault();
      Minute minute0 = new Minute(mockDate0, timeZone0);
      Day day0 = minute0.getDay();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-1928));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(29, year0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      timeSeries0.setMaximumItemCount(1);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, 396.2850987919);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1657L);
      TimeZone timeZone0 = TimeZone.getDefault();
      Minute minute0 = new Minute(mockDate0, timeZone0);
      Day day0 = minute0.getDay();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1657L);
      TimeZone timeZone0 = TimeZone.getDefault();
      Minute minute0 = new Minute(mockDate0, timeZone0);
      Day day0 = minute0.getDay();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.setRangeDescription("org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset");
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour((-467), day0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, (double) 23);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0.FIRST_QUARTER, "S'[L;8ovXQ$ZU", "QxF", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-372.7), 0.0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "K<om*aE#N,8yUA", "K<om*aE#N,8yUA", class0);
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
      XYDataItem xYDataItem0 = new XYDataItem((-372.7), 0.0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "K<om*aE#N,8yUA", "K<om*aE#N,8yUA", class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-372.7), 0.0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "K<om*aE#N,8yUA", "K<om*aE#N,8yUA", class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-1553L), (-1553L));
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.update(59, (Number) 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 59, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Week week0 = new Week();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, 0.0);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Second second0 = new Second();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "qtrz7ct|ymWmAV", "qtrz7ct|ymWmAV", class0);
      timeSeries0.setDomainDescription("Overwritten values from: ");
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-372.7), 0.0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "K<om*aE#N,8yUA", "K<om*aE#N,8yUA", class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}