/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 10:46:55 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormatSymbols;
import java.time.Instant;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.Stack;
import java.util.TimeZone;
import javax.swing.JTabbedPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
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
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Second second0 = new Second();
      Class<JTabbedPane> class0 = JTabbedPane.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Month month0 = new Month(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(month0);
      Year year0 = month0.getYear();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) year0, 1.0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 29, 105);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(mockDate0, class0);
      Millisecond millisecond0 = new Millisecond();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (Number) 0);
      Number number0 = timeSeries0.getValue(0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "Requires start >= 0.", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, 0.0);
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getTimePeriod(0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, (String) null, (String) null, class0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "No bin.", "No bin.", class0);
      timeSeries0.setMaximumItemCount(0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 45);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(3587);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, (String) null, (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) null, (Number) 2);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-888L));
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      Double double0 = new Double(1359.7108429);
      Stack<TimeZone> stack0 = new Stack<TimeZone>();
      timeSeries0.data = (List) stack0;
      // Undeclared exception!
      try { 
        timeSeries0.update(2005, (Number) double0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 2005
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Week week0 = new Week();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((long) 1, false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Second second0 = new Second(mockDate0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "", "", class0);
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
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate(30, 30, (-1416));
      Second second0 = new Second(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod((-1213));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Day day0 = new Day();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "B", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(592);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 592, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "org.jfree.data.time.SpreadsheetDate", "org.jfree.data.time.SpreadsheetDate", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Object> class0 = Object.class;
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
      MockDate mockDate0 = new MockDate(29, 29, (-1350));
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "$^", "E7Yy#d^P}_<P4&y]", class0);
      timeSeries0.removeAgedItems(true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Year year0 = new Year(mockDate0, timeZone0);
      Week week0 = new Week((-1293), year0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      Month month0 = new Month();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) month0, (Number) 1);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
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
  public void test18()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, (String) null, (String) null, class0);
      int int0 = timeSeries0.getIndex(minute0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "Requires start >= 0.", "", class0);
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
  public void test20()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, (String) null, (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-3505));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, (String) null, (String) null, class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, (String) null, (String) null, class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1739, (-2704), (-2704), 1739, 0, (-2178));
      Week week0 = new Week(mockDate0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "M]b%C7RhmZ", "", class0);
      Object object0 = timeSeries0.clone();
      boolean boolean0 = timeSeries0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1739, (-2704), (-2704), 1739, 0, (-2178));
      Week week0 = new Week(mockDate0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "M]b%C7RhmZ", "", class0);
      boolean boolean0 = timeSeries0.equals(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Week week0 = new Week();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      boolean boolean0 = timeSeries0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      MockDate mockDate0 = new MockDate();
      Hour hour0 = new Hour(mockDate0);
      Minute minute0 = new Minute(0, hour0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) null, (RegularTimePeriod) minute0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'start' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) second0, (RegularTimePeriod) second0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute((-220), hour0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, (String) null, (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-5), (-5));
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "No bin.", "No bin.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(10, (-1238));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(4748, 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "No bin.", "No bin.", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (double) 1392409281320L);
      timeSeries0.delete((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockDate mockDate0 = new MockDate(754, (-5741), 754, (-524), (-5741));
      Day day0 = new Day(mockDate0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      timeSeries0.delete((RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Year year0 = new Year(mockDate0, timeZone0);
      Week week0 = new Week((-1293), year0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      timeSeries0.removeAgedItems((long) 0, true);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "No bin.", "No bin.", class0);
      timeSeries0.setMaximumItemCount(0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (-1.0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "No bin.", "No bin.", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (double) 1392409281321L);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (-1.0));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(3394);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, "--", "g2E#Id", class0);
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
  public void test39()  throws Throwable  {
      Second second0 = new Second();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) second0, (Number) 59);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "Requires start >= 0.", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, 0.0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochMilli((-1434L));
      Date date0 = Date.from(instant0);
      TimeZone timeZone0 = TimeZone.getTimeZone("XUJC@v4FneoK_^Y");
      Locale locale0 = Locale.ITALIAN;
      Week week0 = new Week(date0, timeZone0, locale0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) week0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Second second0 = new Second();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "", "&1QT*c(", class0);
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
  public void test43()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(2852.166241, 0.0);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries1 = new TimeSeries(xYDataItem0, class0);
      Locale locale0 = Locale.GERMAN;
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance(locale0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      Month month0 = new Month(date0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, 1.0);
      Collection collection0 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(2852.166241, 0.0);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      Locale locale0 = Locale.GERMAN;
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance(locale0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      Month month0 = new Month(date0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, 1.0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "No bin.", "No bin.", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (double) 1392409281321L);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "Requires start >= 0.", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, 0.0);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem((RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Week week0 = new Week();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) week0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Week week0 = new Week();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-2658L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, (String) null, (String) null, class0);
      timeSeries0.setMaximumItemAge(2);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "No bin.", "No bin.", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (double) 1392409281321L);
      timeSeries0.setMaximumItemCount(0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "No bin.", "No bin.", class0);
      timeSeries0.setMaximumItemCount(10);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "No bin.", "No bin.", class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) fixedMillisecond0, 0.0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1000L);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      timeSeries0.setRangeDescription("K-E4leNwdZ'y!</4G+T");
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (Number) 0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      MockDate mockDate0 = new MockDate(305, (-1019), (-481));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) fixedMillisecond0, (double) 4694544000000L, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of java.lang.Object.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochMilli((-806L));
      Date date0 = Date.from(instant0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(4751, "Null 'period' argument.");
      Day day0 = new Day(date0, simpleTimeZone0);
      Hour hour0 = new Hour(4751, day0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(4751);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4751, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MockDate mockDate0 = new MockDate(305, (-1019), (-481));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
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
  public void test60()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(2852.166241, 0.0);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Week week0 = new Week((-380), (-380));
      TimeSeries timeSeries0 = new TimeSeries(week0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      MockDate mockDate0 = new MockDate(305, (-1019), (-481));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 0.0);
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getNextTimePeriod();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Second second0 = new Second();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-888L));
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      Double double0 = new Double(1359.7108429);
      // Undeclared exception!
      try { 
        timeSeries0.update(2005, (Number) double0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2005, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      MockDate mockDate0 = new MockDate(754, (-5741), 754, (-524), (-5741));
      Day day0 = new Day(mockDate0);
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
  public void test66()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, (String) null, (String) null, class0);
      timeSeries0.setDomainDescription("Null 'values' argument.");
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      MockDate mockDate0 = new MockDate(305, (-1019), (-481));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
