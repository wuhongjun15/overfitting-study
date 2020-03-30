/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:14:44 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.text.DateFormatSymbols;
import java.text.ParsePosition;
import java.time.Instant;
import java.time.chrono.JapaneseDate;
import java.time.chrono.ThaiBuddhistEra;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JSpinner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
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
import org.jfree.data.time.SerialDate;
import org.jfree.data.time.SpreadsheetDate;
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
      MockDate mockDate0 = new MockDate(1008, 274, 274, 491, (-263), (-263));
      TimeZone timeZone0 = TimeZone.getTimeZone("org.jfree.data.time.Day");
      Year year0 = new Year(mockDate0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(year0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(274, 721);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "", class0);
      timeSeries0.setMaximumItemAge(3840L);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond(1423, second0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "]T;*i:.ZkAc056HC$)", "]T;*i:.ZkAc056HC$)", class0);
      timeSeries0.setMaximumItemCount(0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(28.861475760995887, 28.861475760995887);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      timeSeries0.setMaximumItemAge(0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1136, 1136, 1136, 1136, 30);
      Day day0 = new Day(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) null, (Number) 23);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-1048.2754702), 1.0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, class0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      // Undeclared exception!
      try { 
        timeSeries0.update(4616, (Number) bigInteger0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4616, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "Null 'extract' argument.", ";@uFH8#L)v.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((-730L), false);
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
      Class<JSpinner.ListEditor> class0 = JSpinner.ListEditor.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
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
  public void test08()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(2277);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2277, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Week week0 = new Week();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-576));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1196);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1712), 4);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1712
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(3);
      Day day0 = new Day(serialDate0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "%$ubCWUk-mUIm*c.", "%$ubCWUk-mUIm*c.", class0);
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
  public void test12()  throws Throwable  {
      Week week0 = new Week(0, 0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (double) 1);
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
  public void test13()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("");
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, (-1637.76476786911), true);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<TimeSeries> class0 = TimeSeries.class;
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
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
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
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      ParsePosition parsePosition0 = new ParsePosition(0);
      Date date0 = mockSimpleDateFormat0.parse("3N,tltSh`,:WbgK~U", parsePosition0);
      Quarter quarter0 = new Quarter(date0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1880);
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (Number) 3);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
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
  public void test20()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      int int0 = timeSeries0.getIndex(fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod((-3116));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(1120);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1120, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JapaneseDate japaneseDate0 = MockJapaneseDate.now();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(japaneseDate0, ")R>", "`lzl-|b#cd]^4im*", class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      SerialDate serialDate0 = SerialDate.createInstance(date0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, (String) null, "", class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<JSpinner.ListEditor> class0 = JSpinner.ListEditor.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      boolean boolean0 = timeSeries0.equals(class0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.next();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(regularTimePeriod0, (RegularTimePeriod) fixedMillisecond0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start on or before end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, (RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockDate mockDate0 = new MockDate(304, 0, (-3013), 304, (-633), 1088);
      TimeZone timeZone0 = TimeZone.getDefault();
      Year year0 = new Year(mockDate0, timeZone0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "org.jfree.data.general.DefaultKeyedValueDataset", "org.jfree.data.general.DefaultKeyedValueDataset", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(919, (-383));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-34), (-306));
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(2277, 2277);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JapaneseDate japaneseDate0 = MockJapaneseDate.now();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(japaneseDate0, ")R>", "`lzl-|b#cd]^4im*", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(Integer.MAX_VALUE, 53);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<ThaiBuddhistEra> class0 = ThaiBuddhistEra.class;
      TimeSeries timeSeries0 = new TimeSeries("%AA_`bO)&#D", "%AA_`bO)&#D", "%AA_`bO)&#D", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(1618, 1618);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1618, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "Negative 'w' argument.", "Negative 'w' argument.", class0);
      timeSeries0.delete((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1232, 1232, 1232, (-1249), (-1249), (-4));
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Minute minute0 = new Minute(mockDate0, zoneInfo0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, (String) null, "|XH[~-c?$h?}b`", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (Number) 0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1136, 1136, 1136, 1136, 30);
      Day day0 = new Day(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Week week0 = new Week();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      timeSeries0.removeAgedItems((long) 1, false);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1232, 1232, 1232, (-1249), (-1249), (-4));
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Minute minute0 = new Minute(mockDate0, zoneInfo0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, (String) null, "|XH[~-c?$h?}b`", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (Number) 0);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (Number) 0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries("%AA_`bO)&#D", class0);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, 2817.43690872);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JapaneseDate japaneseDate0 = MockJapaneseDate.now();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(japaneseDate0, ")R>", "`lzl-|b#cd]^4im*", class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Minute minute0 = new Minute();
      Day day0 = minute0.getDay();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) day0, (Number) 0);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries("S!Q&Y", "S!Q&Y", "#_", class0);
      Year year0 = new Year();
      Integer integer0 = new Integer((-508));
      timeSeries0.add((RegularTimePeriod) year0, (Number) integer0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Float float0 = new Float((double) (-3116));
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(float0, "createInstance", "createInstance", class0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Number number0 = timeSeries0.getValue((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1196);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, class0);
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
  public void test45()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      Day day0 = new Day();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-413L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-60));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Year year0 = new Year();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      timeSeries0.setMaximumItemCount(1232);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1136, 1136, 1136, 1136, 30);
      Day day0 = new Day(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(28.861475760995887, 28.861475760995887);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockDate mockDate0 = new MockDate(798, 0, (-4445));
      Minute minute0 = new Minute(mockDate0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "org.jfree.data.xy.XYBarDataset", "org.jfree.data.statistics.HistogramType", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (Number) 0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of java.lang.Object.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2428, 720, 2428);
      Year year0 = new Year(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, ".4C%A}u^tkvec", ".4C%A}u^tkvec", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) year0, (double) 720);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of java.lang.Integer.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2428, 720, 2428);
      Year year0 = new Year(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, ".4C%A}u^tkvec", ".4C%A}u^tkvec", class0);
      timeSeries0.setRangeDescription(".4C%A}u^tkvec");
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      SerialDate serialDate0 = SerialDate.createInstance(date0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, class0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Week week0 = new Week(date0, timeZone0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (Number) 1900, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.time.Month.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Hour hour0 = new Hour(mockDate0);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "O)wzAL%\u0000?s/", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, 1.0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of org.jfree.data.time.Year.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-3411), (-2501), (-3411));
      Month month0 = new Month(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-2501));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
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
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JapaneseDate japaneseDate0 = MockJapaneseDate.now();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(japaneseDate0, ")R>", "`lzl-|b#cd]^4im*", class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Second second0 = new Second();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-870), (Number) 0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Week week0 = new Week(0, 0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (double) 53);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'item' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1232, 1232, 1232, (-1249), (-1249), (-4));
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Minute minute0 = new Minute(mockDate0, zoneInfo0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, (String) null, "|XH[~-c?$h?}b`", class0);
      timeSeries0.setDomainDescription("|XH[~-c?$h?}b`");
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      String string0 = timeSeries0.getDomainDescription();
  }
}