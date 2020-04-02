/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:27:04 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.time.chrono.ChronoLocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
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
import org.jfree.data.xy.OHLCDataItem;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Day day0 = new Day();
      RegularTimePeriod regularTimePeriod0 = day0.next();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) day0, regularTimePeriod0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.setMaximumItemCount(4);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update(1, (Number) 1);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-143L));
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems(2L, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Day day0 = new Day();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
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
  public void test05()  throws Throwable  {
      Second second0 = new Second();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-1));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-3107L));
      Date date0 = Date.from(instant0);
      Quarter quarter0 = new Quarter(date0);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(1, 1);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "Requires start on or before end.", " DqY", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 2, 0, 0, 1050);
      Week week0 = new Week(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      Float float0 = new Float((-2091.3F));
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (Number) float0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(0, 2);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Second second0 = new Second();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "", "", class0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2948L));
      TimeZone timeZone0 = TimeZone.getTimeZone("HAEoL*9<t%5");
      Millisecond millisecond0 = new Millisecond(mockDate0, timeZone0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      int int0 = timeSeries0.getIndex(millisecond0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 29, 29);
      TimeZone timeZone0 = TimeZone.getTimeZone("Null 'description' argument.");
      Minute minute0 = new Minute(mockDate0, timeZone0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
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
  public void test14()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "}B#RZ!of3`T^|>n", "}B#RZ!of3`T^|>n", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(23);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 23, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2948L));
      TimeZone timeZone0 = TimeZone.getTimeZone("HAEoL*9<t%5");
      Millisecond millisecond0 = new Millisecond(mockDate0, timeZone0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
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
  public void test16()  throws Throwable  {
      Year year0 = new Year();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "Rd`.B!", "MO}9w#p", class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, (-1106), (-1106));
      mockDate0.setTime(0L);
      Minute minute0 = new Minute(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "}9", "Tze2", class0);
      boolean boolean0 = timeSeries0.equals(quarter0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Year year0 = new Year();
      Month month0 = new Month(3, year0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "Os6v]:Xy*", "Os6v]:Xy*", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) year0, (RegularTimePeriod) month0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
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
  public void test21()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "G?DI2ny#", ">G[azT~b8 #B4eF", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(29, 59);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(1479);
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(9999, 1);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-1357), 999);
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1460L);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(mockDate0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(1, 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Year year0 = new Year();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-608), (-1));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -608
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, (-1106), (-1106));
      mockDate0.setTime(0L);
      Minute minute0 = new Minute(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      timeSeries0.delete((RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, (-1106), (-1106));
      mockDate0.setTime(0L);
      Minute minute0 = new Minute(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-4449L), 2285L);
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, "JdbcXYDataset: swallowing exception.", "org.jfree.data.jdbc.JDBCPieDataset", class0);
      timeSeries0.removeAgedItems(4L, true);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Year year0 = new Year();
      Month month0 = new Month(3, year0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "Os6v]:Xy*", "Os6v]:Xy*", class0);
      MockDate mockDate0 = new MockDate(1L);
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, 3, 0.0, 0.0, (-919.258136390486), 0.0);
      Number number0 = oHLCDataItem0.getClose();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, number0);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (Number) null);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem1, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((long) (-380));
      Date date0 = Date.from(instant0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Day day0 = new Day(date0, zoneInfo0);
      Hour hour0 = new Hour((-380), day0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) hour0, (Number) 0);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      Day day0 = new Day(date0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, 0.0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Year year0 = new Year();
      Month month0 = new Month(3, year0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "Os6v]:Xy*", "Os6v]:Xy*", class0);
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
  public void test33()  throws Throwable  {
      Year year0 = new Year();
      Month month0 = new Month(3, year0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "Os6v]:Xy*", "Os6v]:Xy*", class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) month0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "G?DI2ny#", ">G[azT~b8 #B4eF", class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Second second0 = new Second();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "", "", class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Year year0 = new Year();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "Rd`.B!", "MO}9w#p", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Day day0 = new Day();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-376L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<Second> class0 = Second.class;
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      timeSeries0.setMaximumItemAge(1000L);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries(" DqY");
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-2141787403));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "G?DI2ny#", ">G[azT~b8 #B4eF", class0);
      timeSeries0.setMaximumItemCount(0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(29, 59);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-4164), 60, (-4164), 2712, 0, 0);
      Year year0 = new Year(mockDate0);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "", "", class0);
      Byte byte0 = new Byte((byte) (-104));
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) year0, (Number) byte0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of org.jfree.data.time.TimeSeries.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Year year0 = new Year();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) year0, (-1.0));
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of java.lang.Integer.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Year year0 = new Year();
      Month month0 = new Month(3, year0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "Os6v]:Xy*", "Os6v]:Xy*", class0);
      timeSeries0.setRangeDescription("Os6v]:Xy*");
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) quarter0, (Number) 4);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) quarter0, (Number) null, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Quarter, but the TimeSeries is expecting an instance of java.lang.Integer.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "G?DI2ny#", ">G[azT~b8 #B4eF", class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, (-1106), (-1106));
      mockDate0.setTime(0L);
      Minute minute0 = new Minute(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (double) 59, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(0, hour0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
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
  public void test50()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 3, 986, (-2389), 0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Quarter quarter0 = new Quarter(date0);
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
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
  public void test51()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, (-1106), (-1106));
      mockDate0.setTime(0L);
      Minute minute0 = new Minute(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      Class class0 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Year year0 = new Year();
      Month month0 = new Month(3, year0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "Os6v]:Xy*", "Os6v]:Xy*", class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Day day0 = new Day();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Second second0 = new Second();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-2141787403), (Number) 0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Year year0 = new Year();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, (String) null, "!({~pZG<}B~", class0);
      timeSeries0.setDomainDescription("Quarter outside valid range.");
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries("h?>}-.of", "h?>}-.of", "h?>}-.of", class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}