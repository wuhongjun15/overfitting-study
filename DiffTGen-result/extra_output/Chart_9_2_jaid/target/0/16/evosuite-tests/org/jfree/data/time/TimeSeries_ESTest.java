/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 14:07:29 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
import org.jfree.data.xy.XYDatasetTableModel;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1233L));
      Millisecond millisecond0 = new Millisecond(mockDate0);
      RegularTimePeriod regularTimePeriod0 = millisecond0.next();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) millisecond0, regularTimePeriod0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "Unrecognised columnKey: ", "&qE~e9As", class0);
      timeSeries0.setMaximumItemAge(23);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      timeSeries0.setMaximumItemCount(1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "The 'year' argument must be in range 1900 to 9999.", "t1eLD8z:$9sq<j", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (-0.6336073567525532));
      Number number0 = timeSeries0.getValue((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "The 'year' argument must be in range 1900 to 9999.", "t1eLD8z:$9sq<j", class0);
      timeSeries0.setMaximumItemAge(0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) null, (Number) 59);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "Unrecognised columnKey: ", "&qE~e9As", class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-801), (Number) 23);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeSeries> class0 = TimeSeries.class;
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
      Week week0 = new Week();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-1881));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(9);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 9, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1), 4);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "^Z^3y[~", "5_%DA", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<TimeZone> class0 = TimeZone.class;
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
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(3076, 3076);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3076, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Year year0 = new Year();
      Quarter quarter0 = new Quarter(3, year0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Week week0 = new Week(181, (-4146));
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, 0.0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of java.lang.String.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      TimeZone timeZone0 = TimeZone.getDefault();
      Quarter quarter0 = new Quarter(mockDate0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
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
  public void test19()  throws Throwable  {
      Week week0 = new Week((-420), (-420));
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "SerialDate.monthCodeToString: month outside valid range.", "SerialDate.monthCodeToString: month outside valid range.", class0);
      int int0 = timeSeries0.getIndex(week0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
      Date date0 = spreadsheetDate0.toDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(7, "");
      Week week0 = new Week(date0, simpleTimeZone0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, 914.0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of java.util.SimpleTimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(59);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 59, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, (Number) 0, true);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod((-2344));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Month month0 = new Month();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "Null 'start' argument.", "Null 'start' argument.", class0);
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
  public void test25()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "The 'year' argument must be in range 1900 to 9999.", "t1eLD8z:$9sq<j", class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "TimeSeries.update(TimePeriod, Number):  period does not exist.", "You are attempting to add an observation for ", class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      boolean boolean0 = timeSeries0.equals(second0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1233L));
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) millisecond0, (RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1010L);
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.next();
      Class<TimeZone> class0 = TimeZone.class;
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
  public void test30()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(1944, 1944);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "The 'year' argument must be in range 1900 to 9999.", "t1eLD8z:$9sq<j", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 0.0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, (RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Year year0 = new Year();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "8$cUh*K T%sm?", "8$cUh*K T%sm?", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(30, 29);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockDate mockDate0 = new MockDate(999L);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.delete((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
      Date date0 = spreadsheetDate0.toDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(7, "");
      Week week0 = new Week(date0, simpleTimeZone0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Year year0 = new Year();
      Quarter quarter0 = new Quarter(3, year0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      timeSeries0.removeAgedItems(1392409281320L, false);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, class0);
      Millisecond millisecond0 = new Millisecond();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, 0.0);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (Number) 2);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2543);
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
  public void test38()  throws Throwable  {
      MockDate mockDate0 = new MockDate(30, 1, 630, 3, 630);
      TimeZone timeZone0 = TimeZone.getDefault();
      Month month0 = new Month(mockDate0, timeZone0);
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "tomHqN_]u<U;", "c(a=#>[YeM", class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Quarter quarter0 = new Quarter(3, 273);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) quarter0, (Number) null);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "The 'year' argument must be in range 1900 to 9999.", "t1eLD8z:$9sq<j", class0);
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
  public void test41()  throws Throwable  {
      Integer integer0 = Integer.valueOf(0);
      TimeSeries timeSeries0 = new TimeSeries(integer0);
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
  public void test42()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Hour hour0 = new Hour();
      Minute minute0 = new Minute((-404), hour0);
      Second second0 = new Second(1498, minute0);
      Millisecond millisecond0 = new Millisecond((-902), second0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (Number) 0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MockDate mockDate0 = new MockDate(30, 1, 630, 3, 630);
      TimeZone timeZone0 = TimeZone.getDefault();
      Month month0 = new Month(mockDate0, timeZone0);
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "tomHqN_]u<U;", "c(a=#>[YeM", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (double) 630);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem((RegularTimePeriod) month0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "The 'year' argument must be in range 1900 to 9999.", "t1eLD8z:$9sq<j", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-568L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "The 'year' argument must be in range 1900 to 9999.", "t1eLD8z:$9sq<j", class0);
      timeSeries0.setMaximumItemAge(0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, (RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "The 'year' argument must be in range 1900 to 9999.", "t1eLD8z:$9sq<j", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 0.0);
      timeSeries0.setMaximumItemCount(0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-410));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "The 'year' argument must be in range 1900 to 9999.", "t1eLD8z:$9sq<j", class0);
      timeSeries0.setMaximumItemCount(0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "The 'year' argument must be in range 1900 to 9999.", "t1eLD8z:$9sq<j", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "The 'year' argument must be in range 1900 to 9999.", "t1eLD8z:$9sq<j", class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "Unrecognised columnKey: ", "&qE~e9As", class0);
      timeSeries0.setRangeDescription("Unrecognised columnKey: ");
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) quarter0, (Number) 1);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Quarter, but the TimeSeries is expecting an instance of java.lang.Object.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MockDate mockDate0 = new MockDate(999L);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
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
  public void test56()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) quarter0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "X-value already exists.", "X-value already exists.", class0);
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
  public void test58()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "TimeSeries.update(TimePeriod, Number):  period does not exist.", "You are attempting to add an observation for ", class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "The 'year' argument must be in range 1900 to 9999.", "t1eLD8z:$9sq<j", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 0.0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) fixedMillisecond0);
      timeSeries0.update(0, number0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "The 'year' argument must be in range 1900 to 9999.", "t1eLD8z:$9sq<j", class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.update(0, number0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "TimeSeries.update(TimePeriod, Number):  period does not exist.", "You are attempting to add an observation for ", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) millisecond0, (-1839.6473871082617));
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Millisecond, but the TimeSeries is expecting an instance of org.jfree.data.xy.XYDatasetTableModel.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "Unrecognised columnKey: ", "&qE~e9As", class0);
      timeSeries0.setDomainDescription("org.jfree.data.xy.MatrixSeries");
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
