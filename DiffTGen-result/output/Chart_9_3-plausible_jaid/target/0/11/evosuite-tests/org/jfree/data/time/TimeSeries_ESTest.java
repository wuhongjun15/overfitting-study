/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:17:56 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoField;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
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
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
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
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
      Class<Locale> class0 = Locale.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
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
  public void test02()  throws Throwable  {
      ChronoField chronoField0 = ChronoField.SECOND_OF_DAY;
      TimeSeries timeSeries0 = new TimeSeries(chronoField0);
      timeSeries0.setMaximumItemAge(Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Quarter quarter0 = new Quarter(1, 1);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, (String) null, "oGAu,70M", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, 1707.16);
      timeSeries0.setMaximumItemCount(1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Quarter quarter0 = new Quarter(1, 1);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, (String) null, "oGAu,70M", class0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate(304, 304, 304, 304, 2);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Second second0 = new Second(mockDate0, timeZone0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-1301), (Number) 0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-1389));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1574), 1142);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1574
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(348);
      Class<JTabbedPane> class0 = JTabbedPane.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, "zu!}]KJ1:mg", "Index outside valid range.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, (-1.7976931348623157E308), false);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "rNh\"Iw)jgYwVPdX", "Range", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
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
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "VohTKRl@8]J#", "\"Y$Y'?51bSE;2<),a", class0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Month month0 = new Month();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      Instant instant0 = MockInstant.ofEpochSecond(642L);
      Date date0 = Date.from(instant0);
      Millisecond millisecond0 = new Millisecond(date0, month0.DEFAULT_TIME_ZONE);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) millisecond0, 0.0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Millisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Hour.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      int int0 = timeSeries0.getIndex(fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Class class0 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minute minute0 = new Minute();
      Second second0 = new Second(0, minute0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
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
  public void test17()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
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
  public void test18()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
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
  public void test19()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
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
  public void test20()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, Double.POSITIVE_INFINITY);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      int int0 = timeSeriesCollection0.indexOf(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, (RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(1531);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, class0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1392409255751L));
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.next();
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
  public void test24()  throws Throwable  {
      Week week0 = new Week(Integer.MAX_VALUE, 2147483471);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(1800, Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 1656, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(152, 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, "/ ;,_Y!:Rfby~/Zf0hA", "I28Zh<;4.^Z\"", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-957), (-957));
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "]F", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(23, (-1268));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Byte byte0 = new Byte((byte)94);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) byte0);
      timeSeries0.delete((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, (-2727.728251839853));
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      Minute minute0 = new Minute();
      timeSeries0.delete((RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 5, 0, 0, 0, (-2357));
      Second second0 = new Second(mockDate0);
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "Overwritten values from: ", "c8/2%|_:2OF~n", class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Byte byte0 = new Byte((byte)94);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) byte0);
      timeSeries0.removeAgedItems(0L, true);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 5, 0, 0, 0, (-2357));
      TimeSeries timeSeries0 = new TimeSeries(mockDate0);
      timeSeries0.removeAgedItems(0L, false);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, (String) null, (String) null, class0);
      Double double0 = new Double(Double.POSITIVE_INFINITY);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) fixedMillisecond0, (Number) double0);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<Second> class0 = Second.class;
      MockDate mockDate0 = new MockDate();
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      RegularTimePeriod regularTimePeriod0 = RegularTimePeriod.createInstance(class0, mockDate0, zoneInfo0);
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, "", "", class0);
      timeSeries0.add(regularTimePeriod0, (Number) 23, true);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 5, 0, 0, 0, (-2357));
      Second second0 = new Second(mockDate0);
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "Overwritten values from: ", "c8/2%|_:2OF~n", class0);
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
  public void test36()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, (-2727.728251839853));
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      Minute minute0 = new Minute();
      Number number0 = timeSeries0.getValue((RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochMilli((-269L));
      Date date0 = Date.from(instant0);
      Minute minute0 = new Minute(date0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.getIndex((RegularTimePeriod) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 5, 0, 0, 0, (-2357));
      Second second0 = new Second(mockDate0);
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "Overwritten values from: ", "c8/2%|_:2OF~n", class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Byte byte0 = new Byte((byte)94);
      MockDate mockDate0 = new MockDate((byte)94, 1576, (byte)94, (-300), (byte)94);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) byte0);
      Year year0 = new Year(mockDate0, fixedMillisecond0.DEFAULT_TIME_ZONE);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem((RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1425L);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      Day day0 = new Day();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "VohTKRl@8]J#", "\"Y$Y'?51bSE;2<),a", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-1L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      timeSeries0.setMaximumItemAge(0L);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-1));
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, class0);
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
  public void test45()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      timeSeries0.setMaximumItemCount(1328);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      MockDate mockDate0 = new MockDate(1, 585, (-946), 1213, 999, 0);
      Hour hour0 = new Hour(mockDate0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of java.lang.String.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
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
  public void test50()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 5, 0, 0, 0, (-2357));
      Second second0 = new Second(mockDate0);
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "Overwritten values from: ", "c8/2%|_:2OF~n", class0);
      timeSeries0.setRangeDescription("c8/2%|_:2OF~n");
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Week week0 = new Week();
      Date date0 = week0.getStart();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      Millisecond millisecond0 = new Millisecond(date0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) millisecond0, (Number) 53, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Millisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, (double) 0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of org.jfree.data.time.Minute.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MockDate mockDate0 = new MockDate(304, 304, 304, 304, 2);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Second second0 = new Second(mockDate0, timeZone0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, 0.0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) second0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute((-78), hour0);
      Second second0 = new Second(1031, minute0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
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
  public void test56()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      Float float0 = new Float((double) (short)0);
      // Undeclared exception!
      try { 
        timeSeries0.update((int) (short)0, (Number) float0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Byte byte0 = new Byte((byte)94);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) byte0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, (RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      timeSeries0.setDomainDescription("the time period ");
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, (-2727.728251839853));
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
