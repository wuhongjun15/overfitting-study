/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:56:45 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
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
      Hour hour0 = new Hour();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.setMaximumItemCount(0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((long) 29, false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, "z^g4nSb4f7NR:dQd", "DomainOrder.ASCENDING", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(29, 29);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 29, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1969L));
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Day day0 = new Day(mockDate0, zoneInfo0);
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
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2839, 29, 845, (-1152), 29, 0);
      TimeZone timeZone0 = TimeZone.getTimeZone("Time");
      Week week0 = new Week(mockDate0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, 0.5, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(369, 369, 0, 0, 0, 369);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(date0, date0);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, 0.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "Negative 'periods' argument.", "Negative 'periods' argument.", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1843), 91);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Locale> class0 = Locale.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.removeAgedItems(true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) second0, (double) 0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Second, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, (-5237), 1, (-1039), (-5237), (-5237));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "3i~V>/h-Y2RX", "2JvaR2Y_'h7a$", class0);
      int int0 = timeSeries0.getIndex(fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, 0, (-278.86165), (-365.2222501578963), 0.0, (-365.2222501578963));
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(oHLCDataItem0, "Nearest", "Nearest", class0);
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
  public void test14()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-532L));
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(522);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 522, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
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
  public void test16()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-2003L));
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2839, 29, 845, (-1152), 29, 0);
      TimeZone timeZone0 = TimeZone.getTimeZone("Time");
      Week week0 = new Week(mockDate0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Week week0 = new Week((-901), (-427));
      TimeSeries timeSeries0 = new TimeSeries(week0);
      boolean boolean0 = timeSeries0.equals(week0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Week week0 = new Week();
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, "YtY=>TWB_Rs_5", "YtY=>TWB_Rs_5", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) week0, regularTimePeriod0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start on or before end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1511);
      Day day0 = new Day(spreadsheetDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(900, 3393);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockDate mockDate0 = new MockDate(900, 900, 1575, 1575, 1575, 994);
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(mockDate0, mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(994, 900);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(999, 20);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      Second second0 = new Second();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
      timeSeries0.delete((RegularTimePeriod) second0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Minute minute0 = new Minute(date0, zoneInfo0);
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      timeSeries0.delete((RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2839, 29, 845, (-1152), 29, 0);
      TimeZone timeZone0 = TimeZone.getTimeZone("Time");
      Week week0 = new Week(mockDate0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("uy3HZ4$@THd6U.4");
      timeSeries0.removeAgedItems((-1829L), false);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(369.7, (-2342.02651669));
      Class<Object> class0 = Object.class;
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
  public void test30()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
      timeSeries0.update((RegularTimePeriod) hour0, (Number) 23);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) quarter0, (Number) 4);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1511);
      Day day0 = new Day(spreadsheetDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, 329.64473, true);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) day0, (Number) 1, false);
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period 19-February-1904 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1511);
      Day day0 = new Day(spreadsheetDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, 329.64473, false);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
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
  public void test36()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Second second0 = new Second();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "", "", class0);
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
  public void test38()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-2724L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1511);
      Day day0 = new Day(spreadsheetDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.setMaximumItemAge(1900);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
      timeSeries0.setMaximumItemCount(0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1511);
      Day day0 = new Day(spreadsheetDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
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
  public void test44()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.setMaximumItemCount(2);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(228);
      Date date0 = spreadsheetDate0.toDate();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(date0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, ", ", "b$RANy!Xgq5Z;Vb", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Second second0 = new Second();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, ";;N8!-zo J", ";;N8!-zo J", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) second0, (Number) 0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Second, but the TimeSeries is expecting an instance of org.jfree.data.time.Week.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(228);
      Date date0 = spreadsheetDate0.toDate();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(date0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, ", ", "b$RANy!Xgq5Z;Vb", class0);
      timeSeries0.setRangeDescription("b$RANy!Xgq5Z;Vb");
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(localDate0, class0);
      Short short0 = new Short((short) (-1652));
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, (Number) short0, true);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(369, 369, 0, 0, 0, 369);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(date0, date0);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, (double) 2);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of java.util.Date.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(23);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 23, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<String> class0 = String.class;
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
  public void test54()  throws Throwable  {
      Week week0 = new Week();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "YtY=>TWB_Rs_5", "YtY=>TWB_Rs_5", class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Year year0 = new Year(mockDate0, zoneInfo0);
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, (String) null, "46", class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Week week0 = new Week();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "YtY=>TWB_Rs_5", "YtY=>TWB_Rs_5", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, Double.POSITIVE_INFINITY);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (Number) 1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(228);
      Date date0 = spreadsheetDate0.toDate();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(date0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, ", ", "b$RANy!Xgq5Z;Vb", class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Minute minute0 = new Minute(date0, zoneInfo0);
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update(141, (Number) 59);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 141, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) minute0, (double) 0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of java.lang.Integer.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Month month0 = new Month();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      timeSeries0.setDomainDescription("");
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2839, 29, 845, (-1152), 29, 0);
      TimeZone timeZone0 = TimeZone.getTimeZone("Time");
      Week week0 = new Week(mockDate0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
