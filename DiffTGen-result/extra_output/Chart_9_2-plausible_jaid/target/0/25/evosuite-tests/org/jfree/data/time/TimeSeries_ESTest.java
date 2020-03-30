/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:56:48 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.time.Clock;
import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoField;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import javax.swing.JLayeredPane;
import javax.swing.JTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
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
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Clock clock0 = MockClock.systemUTC();
      JapaneseDate japaneseDate0 = MockJapaneseDate.now(clock0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(japaneseDate0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "au/", "]", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(3067, 4138);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3067, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      timeSeries0.setMaximumItemAge(0L);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<JTree> class0 = JTree.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "USg2MT$I$Ybf%Q", "USg2MT$I$Ybf%Q", class0);
      timeSeries0.setMaximumItemCount(59);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 0.0);
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getTimePeriod(0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(164L, 164L);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      Week week0 = new Week();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (-749.4659613));
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getNextTimePeriod();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "", "", class0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 116, 3305, 116, 0);
      Quarter quarter0 = new Quarter(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (double) 0);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem(0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(164L, 164L);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) null, (Number) 0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
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
  public void test11()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 104, 0, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Minute minute0 = new Minute(mockDate0, zoneInfo0);
      Class<ChronoField> class0 = ChronoField.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((long) 0, false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((RegularTimePeriod) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(1229);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1229, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod((-1));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1606), (-1606));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1606
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
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
  public void test17()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) day0, (double) 59, true);
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period 14-February-2014 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "6:'", "y}2{W([2QdL}", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<TimeSeries> class0 = TimeSeries.class;
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
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(1926, hour0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "", "", class0);
      timeSeries0.removeAgedItems(true);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "Null 'end' argument.", "Fx", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (Number) 1);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.time.TimeSeriesDataItem.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Day day0 = new Day();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      int int0 = timeSeries0.getIndex(fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 924.6257631053);
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2389);
      Minute minute0 = new Minute(mockDate0);
      Second second0 = new Second(2389, minute0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "Z-8Q\"a}dtj=}|E2m1", "org.jfree.data.time.TimeSeries", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(59);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 59, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(1, hour0);
      Second second0 = new Second(0, minute0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "9lk2t}b3_Q", "iwIciXiW*~eC_Zoo", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(5);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 5, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2389);
      Minute minute0 = new Minute(mockDate0);
      Second second0 = new Second(2389, minute0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "Z-8Q\"a}dtj=}|E2m1", "org.jfree.data.time.TimeSeries", class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(1926, hour0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      Year year0 = week0.getYear();
      boolean boolean0 = timeSeries0.equals(year0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond(3110, second0);
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(1, 999);
      timeSeries0.setMaximumItemCount(0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 116, 3305, 116, 0);
      Quarter quarter0 = new Quarter(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) null, (RegularTimePeriod) quarter0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'start' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "u4NRTJqT|$W('Jb");
      Second second0 = new Second(mockDate0, simpleTimeZone0);
      Millisecond millisecond0 = new Millisecond(29, second0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "u4NRTJqT|$W('Jb", "Null 'item' argument.", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) second0, (RegularTimePeriod) second0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockDate mockDate0 = new MockDate(244, (-2459), 1, 244, 0, 0);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-1390), (-3069));
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond(3110, second0);
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(3344, 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
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
  public void test36()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, (-128), (-128), (-128), 2);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<JTree> class0 = JTree.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "fTnvyNa #DT7TWyc", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (double) (-128));
      timeSeries0.delete((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "au/", "]", class0);
      timeSeries0.delete((RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "au/", "]", class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(1926, hour0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 0);
      timeSeries0.removeAgedItems((long) 1709, false);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2389);
      Minute minute0 = new Minute(mockDate0);
      Second second0 = new Second(2389, minute0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "Z-8Q\"a}dtj=}|E2m1", "org.jfree.data.time.TimeSeries", class0);
      timeSeries0.removeAgedItems(0L, false);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 116, 3305, 116, 0);
      Quarter quarter0 = new Quarter(mockDate0);
      RegularTimePeriod regularTimePeriod0 = quarter0.next();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(regularTimePeriod0, (double) 0);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (double) 0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(164L, 164L);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      Week week0 = new Week();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (double) 164L);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (-749.4659613));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (double) 1);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "au/", "]", class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "]$", ",XivY2hU?ov", class0);
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
  public void test46()  throws Throwable  {
      Week week0 = new Week();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, ") outside valid range.", "4W5", class0);
      timeSeries0.add((RegularTimePeriod) week0, (Number) 1, false);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(164L, 164L);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
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
  public void test48()  throws Throwable  {
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond(3110, second0);
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) second0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Day day0 = new Day();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, (String) null, (String) null, class0);
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
  public void test50()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(1926, hour0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "", "", class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(1926, hour0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "", "", class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 116, 3305, 116, 0);
      Quarter quarter0 = new Quarter(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (double) 0);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem((RegularTimePeriod) quarter0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Week week0 = new Week();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, (String) null, (String) null, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) week0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-798L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      timeSeries0.setMaximumItemAge(59);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Minute minute0 = new Minute(mockDate0, zoneInfo0);
      Day day0 = minute0.getDay();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "50-T$7zitRCx*,}", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-186));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond(3110, second0);
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      timeSeries0.setMaximumItemCount(0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, 1.7976931348623157E308);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond(3110, second0);
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(1, 999);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "sf py7]-eT+", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, 0.0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.time.TimeSeries.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.setRangeDescription("Time");
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "au/", "]", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (Number) 59, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of org.jfree.data.time.Millisecond.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.add((RegularTimePeriod) day0, (double) 59, true);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-787), 366, (-887), (-3128), (-3128), (-787));
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(mockDate0, mockDate0);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-193));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Day day0 = new Day();
      Class<Hour> class0 = Hour.class;
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
  public void test68()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 116, 3305, 116, 0);
      Quarter quarter0 = new Quarter(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      Class class0 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(164L, 164L);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      Week week0 = new Week();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (-749.4659613));
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(59, 2807);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 59, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(localDate0, "Df", "Df", class0);
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      // Undeclared exception!
      try { 
        timeSeries0.update(2, (Number) integer0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      XYDataItem xYDataItem0 = new XYDataItem(bigInteger0, bigInteger0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, (String) null, (String) null, class0);
      Millisecond millisecond0 = new Millisecond();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) millisecond0, (double) 999);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Millisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.TimeSeriesDataItem.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.setDomainDescription("E");
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
