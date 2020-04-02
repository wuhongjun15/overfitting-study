/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 13:15:41 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.ChronoLocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-1L), (-1L));
      Date date0 = Date.from(instant0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(date0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Month month0 = new Month();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "", (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(0, 93);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Month month0 = new Month();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "", (String) null, class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(0, year0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "", "", class0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-1107), (Number) 999);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1358);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, ";,w}zx'KtD6ryl%", "*~r%XEq", class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((long) 3, false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
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
  public void test08()  throws Throwable  {
      Year year0 = new Year();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      timeSeries0.data = null;
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-2917L));
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((RegularTimePeriod) fixedMillisecond0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2428, (-765), 0, 2428, 2428, (-1934));
      TimeZone timeZone0 = TimeZone.getTimeZone("}&#");
      Millisecond millisecond0 = new Millisecond(mockDate0, timeZone0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "b`%TM", "b`%TM", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(2935);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2935, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("MCS");
      // Undeclared exception!
      try { 
        timeSeries0.delete((-2147483630), (-2147483630));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2147483630
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) second0, (Number) 59, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Second, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      Clock clock0 = MockClock.system(zoneOffset0);
      LocalDate localDate0 = MockLocalDate.now(clock0);
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TimeSeries timeSeries0 = new TimeSeries(localDate0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, 0.0, false);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "q}D]MD4ba", "q}D]MD4ba", class0);
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
  public void test14()  throws Throwable  {
      Class<JInternalFrame> class0 = JInternalFrame.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "org.jfree.data.time.SerialDate", "org.jfree.data.time.SerialDate", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Year> class0 = Year.class;
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
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      timeSeries0.removeAgedItems(true);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Minute minute0 = new Minute();
      Day day0 = minute0.getDay();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) 59);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Week week0 = new Week();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (double) 1);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of java.lang.String.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
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
  public void test21()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      int int0 = timeSeries0.getIndex(day0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Minute minute0 = new Minute();
      Second second0 = new Second(1865, minute0);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "", "", class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 1, (-1607), 0, Integer.MAX_VALUE, 1);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1607), "");
      Locale locale0 = Locale.KOREAN;
      Week week0 = new Week(mockDate0, simpleTimeZone0, locale0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Month month0 = new Month();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "", "", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(439);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 439, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, class0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Minute minute0 = new Minute();
      Second second0 = new Second(1865, minute0);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-141));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond(3, second0);
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2428, (-765), 0, 2428, 2428, (-1934));
      TimeZone timeZone0 = TimeZone.getTimeZone("}&#");
      Millisecond millisecond0 = new Millisecond(mockDate0, timeZone0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "b`%TM", "b`%TM", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (double) (-765));
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2428, (-765), 0, 2428, 2428, (-1934));
      TimeZone timeZone0 = TimeZone.getTimeZone("}&#");
      Millisecond millisecond0 = new Millisecond(mockDate0, timeZone0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "b`%TM", "b`%TM", class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      boolean boolean0 = timeSeries0.equals(fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Day day0 = new Day();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(92, 92);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(51);
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-1014), 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2285, 2285, 2285);
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Week week0 = new Week(mockDate0, timeZone0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(53, (-1727));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1226L));
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Day day0 = new Day(serialDate0);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(2, 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "", "", class0);
      timeSeries0.delete((RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2428, (-765), 0, 2428, 2428, (-1934));
      TimeZone timeZone0 = TimeZone.getTimeZone("}&#");
      Millisecond millisecond0 = new Millisecond(mockDate0, timeZone0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "b`%TM", "b`%TM", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (double) (-765));
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2428, (-765), 0, 2428, 2428, (-1934));
      TimeZone timeZone0 = TimeZone.getTimeZone("}&#");
      Millisecond millisecond0 = new Millisecond(mockDate0, timeZone0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "b`%TM", "b`%TM", class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      XYDataItem xYDataItem0 = new XYDataItem(bigInteger0, (byte)0);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      timeSeries0.removeAgedItems((long) (byte)0, false);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      XYDataItem xYDataItem0 = new XYDataItem(bigInteger0, (byte)0);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      timeSeries0.setMaximumItemCount((short)0);
      MockDate mockDate0 = new MockDate((short)0, 4118, (short)0, (byte)0, 4118, (short)0);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (Number) 999);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(3979.9, 3979.9);
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "q}D]MD4ba", "q}D]MD4ba", class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Month month0 = new Month();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "", (String) null, class0);
      Short short0 = new Short((short)766);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) month0, (Number) short0);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(426, hour0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      Day day0 = new Day();
      Short short0 = new Short((short)23661);
      timeSeries0.add((RegularTimePeriod) day0, (Number) short0, false);
      timeSeries0.delete((RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Minute minute0 = new Minute();
      Day day0 = minute0.getDay();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
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
  public void test46()  throws Throwable  {
      Month month0 = new Month();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "", "", class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) month0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(9);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, "_8hZarARAX_Up-Zf;A", "_8hZarARAX_Up-Zf;A", class0);
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
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-2371L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      timeSeries0.setMaximumItemAge(3079L);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-2479));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MockDate mockDate0 = new MockDate(637, 0, (-735));
      TimeZone timeZone0 = TimeZone.getDefault();
      Week week0 = new Week(mockDate0, timeZone0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      timeSeries0.setMaximumItemCount(185);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (double) 16);
      int int0 = timeSeries0.getIndex(day0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      timeSeries0.setRangeDescription("");
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (Number) 0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of org.jfree.data.time.Month.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "", "", class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) fixedMillisecond0, 1016.2, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-1L), (-1L));
      Date date0 = Date.from(instant0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(date0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(950);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 950, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      MockDate mockDate0 = new MockDate(999L);
      Second second0 = new Second(mockDate0);
      Class<DefaultTableModel> class0 = DefaultTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
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
  public void test62()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2428, (-765), 0, 2428, 2428, (-1934));
      TimeZone timeZone0 = TimeZone.getTimeZone("}&#");
      Millisecond millisecond0 = new Millisecond(mockDate0, timeZone0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "b`%TM", "b`%TM", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (double) (-765));
      timeSeries0.update((RegularTimePeriod) millisecond0, (Number) 999);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.update(53, (Number) 53);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 53, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(0, hour0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) hour0, (double) 0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of java.lang.Object.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.setDomainDescription("HvE-TOp`}#rRrBu&!OK");
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, (RegularTimePeriod) fixedMillisecond0);
      boolean boolean0 = timeSeries1.equals(timeSeries0);
  }
}