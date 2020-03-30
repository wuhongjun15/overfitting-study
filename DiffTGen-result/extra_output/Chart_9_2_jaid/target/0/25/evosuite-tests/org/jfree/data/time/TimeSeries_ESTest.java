/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 14:10:19 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.VetoableChangeListenerProxy;
import java.math.BigInteger;
import java.time.Instant;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.Vector;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.SpreadsheetDate;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      Class<VetoableChangeListenerProxy> class0 = VetoableChangeListenerProxy.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(2, 2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      XYDataItem xYDataItem0 = new XYDataItem(bigInteger0, integer0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "uW={m-s'b|z~6hm0yMx", (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(Integer.MAX_VALUE, Integer.MAX_VALUE);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2147483647, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      timeSeries0.setMaximumItemAge(2106L);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Second second0 = new Second();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.setMaximumItemCount(0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (double) 304);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (double) 304);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochMilli((-2836L));
      Date date0 = Date.from(instant0);
      Year year0 = new Year(date0);
      Week week0 = new Week((-232), year0);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-1), (Number) 1);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Day day0 = new Day();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "org.jfree.data.statistics.SimpleHistogramBin", "org.jfree.data.statistics.SimpleHistogramBin", class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems(0L, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(2243L, 2243L);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod((-1955));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Millisecond millisecond0 = new Millisecond(mockDate0, zoneInfo0);
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      Vector<TimeSeries> vector0 = new Vector<TimeSeries>();
      timeSeries0.data = (List) vector0;
      // Undeclared exception!
      try { 
        timeSeries0.delete(0, 999);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1860L);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, (-1825.01782));
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.TimeSeries.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "", " Lh4k2{U%mAMe[@", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
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
      Quarter quarter0 = new Quarter();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "SerialDate.monthCodeToString: month outside valid range.", "SerialDate.monthCodeToString: month outside valid range.", class0);
      timeSeries0.removeAgedItems(true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Second second0 = new Second();
      Minute minute0 = second0.getMinute();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      Class<Date> class1 = Date.class;
      TimeSeries timeSeries1 = new TimeSeries(second0, class1);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries1.addOrUpdate((RegularTimePeriod) second0, (Number) 0);
      TimeSeries timeSeries2 = timeSeries0.addAndOrUpdate(timeSeries1);
      Long long0 = new Long((-1287L));
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (Number) long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1503L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, 902.0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Week week0 = new Week(992, 0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "/ST`;\"h,/x-i9-xdKT", "N|7]^k/'C2yos\"rSV", class0);
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
      MockDate mockDate0 = new MockDate(1, 1, (-1));
      TimeZone timeZone0 = TimeZone.getDefault();
      Year year0 = new Year(mockDate0, timeZone0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "buN'.#v-Zp14Q", (String) null, class0);
      int int0 = timeSeries0.getIndex(year0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, 1, (-1));
      TimeZone timeZone0 = TimeZone.getDefault();
      Year year0 = new Year(mockDate0, timeZone0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "buN'.#v-Zp14Q", (String) null, class0);
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
  public void test19()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
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
  public void test20()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, 1, (-1));
      TimeZone timeZone0 = TimeZone.getDefault();
      Year year0 = new Year(mockDate0, timeZone0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "buN'.#v-Zp14Q", (String) null, class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (double) 304);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", "", class0);
      boolean boolean0 = timeSeries0.equals(class0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1166);
      Day day0 = new Day(spreadsheetDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Hour hour0 = new Hour(mockDate0);
      Minute minute0 = new Minute((-1), hour0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "QV7&$", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(0, (-1129));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", "", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(1, 29);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 1, 0, 1, 1);
      Year year0 = new Year(mockDate0);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "C=*WQ(|d", (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(766, 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1503L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.delete((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(1.0, 0.0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "", "", class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      timeSeries0.removeAgedItems((long) 0, false);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Second second0 = new Second();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, (Number) 0);
      // Undeclared exception!
      try { 
        timeSeries0.addAndOrUpdate(timeSeries0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Second, but the TimeSeries is expecting an instance of org.jfree.data.time.Quarter.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      BigInteger bigInteger0 = BigInteger.ONE;
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) fixedMillisecond0, (Number) bigInteger0);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      Day day0 = new Day();
      timeSeries0.add((RegularTimePeriod) day0, (-2.147483648E9), true);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      Class<VetoableChangeListenerProxy> class0 = VetoableChangeListenerProxy.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "SerialDate.monthCodeToString: month outside valid range.", "SerialDate.monthCodeToString: month outside valid range.", class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "SerialDate.monthCodeToString: month outside valid range.", "SerialDate.monthCodeToString: month outside valid range.", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) quarter0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-1287L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Integer integer0 = new Integer(0);
      XYDataItem xYDataItem0 = new XYDataItem((Number) integer0, (Number) integer0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, (String) null, "createInstance", class0);
      timeSeries0.setMaximumItemAge(0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Year year0 = new Year(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(year0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-1624));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1503L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.setMaximumItemCount(212);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Year year0 = new Year();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "8}", "permitted.  Try using the addOrUpdate() method.", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Week week0 = new Week();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, (String) null, (String) null, class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) fixedMillisecond0, (Number) null);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Week week0 = new Week(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (double) 1);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Second second0 = new Second();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.setRangeDescription("");
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Day day0 = new Day();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "*", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) day0, (Number) null, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Day, but the TimeSeries is expecting an instance of java.lang.Object.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", "", class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "nj>['ybxFTk8Ii]s78", "Series index out of bounds.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) fixedMillisecond0, 0.0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.TimeSeries.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, (-1.0), (-1.0), 0.0, 0.0, (-336.4761));
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(oHLCDataItem0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(2201);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2201, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", "", class0);
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
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(596L);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (double) 304);
      timeSeries0.update((RegularTimePeriod) millisecond0, (Number) 0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      XYDataItem xYDataItem0 = new XYDataItem(bigInteger0, integer0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "uW={m-s'b|z~6hm0yMx", (String) null, class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-582L), (-582L));
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, class0);
      Long long0 = new Long(0);
      // Undeclared exception!
      try { 
        timeSeries0.update(0, (Number) long0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
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
      Quarter quarter0 = new Quarter();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "SerialDate.monthCodeToString: month outside valid range.", "SerialDate.monthCodeToString: month outside valid range.", class0);
      timeSeries0.setDomainDescription("SerialDate.monthCodeToString: month outside valid range.");
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}