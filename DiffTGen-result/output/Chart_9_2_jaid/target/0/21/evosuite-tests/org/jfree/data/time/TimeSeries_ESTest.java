/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 14:07:27 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormatSymbols;
import java.text.ParsePosition;
import java.time.Instant;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JLayeredPane;
import javax.swing.event.RowSorterEvent;
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
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Year year0 = new Year();
      RegularTimePeriod regularTimePeriod0 = year0.previous();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, "You are trying to add data where the time period class ", "o.?K*<$lyvWRD?0", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(regularTimePeriod0, (RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate(213, 213, 213, 0, 0, 213);
      Quarter quarter0 = new Quarter(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 5966);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Hour hour0 = new Hour(mockDate0);
      Minute minute0 = new Minute(1116, hour0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(59, 1505);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 59, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-2280L), 0L);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, class0);
      timeSeries0.setMaximumItemAge(0L);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      Day day0 = minute0.getDay();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, (String) null, (String) null, class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1L);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(mockDate0, "%", "", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (double) 685L);
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getNextTimePeriod();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      ParsePosition parsePosition0 = new ParsePosition(3);
      Date date0 = mockSimpleDateFormat0.parse("", parsePosition0);
      SerialDate serialDate0 = SerialDate.createInstance(date0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, "", (String) null, class0);
      Day day0 = new Day();
      timeSeries0.add((RegularTimePeriod) day0, (Number) 1900, false);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "\"8}`(1dmII", "Null 'categoryKeys' argument.", class0);
      timeSeries0.add((RegularTimePeriod) fixedMillisecond0, (Number) null);
      int int0 = timeSeries0.getIndex(fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "U31(I Zw", class0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "\"8}`(1dmII", "Null 'categoryKeys' argument.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems(1L, false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(1825);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, class0);
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
  public void test12()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(1);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Year year0 = new Year();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "You are trying to add data where the time period class ", "o.?K*<$lyvWRD?0", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) year0, (double) 1392409281320L);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of java.util.Date.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (Number) 0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Minute> class0 = Minute.class;
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
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      Day day0 = new Day();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      timeSeries0.removeAgedItems(true);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      ParsePosition parsePosition0 = new ParsePosition(3);
      Date date0 = mockSimpleDateFormat0.parse("", parsePosition0);
      SerialDate serialDate0 = SerialDate.createInstance(date0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, "", (String) null, class0);
      Day day0 = new Day();
      timeSeries0.add((RegularTimePeriod) day0, (Number) 1900, false);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) 2958465);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Quarter quarter0 = new Quarter(mockDate0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) quarter0, (-739.8003388844664));
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Quarter, but the TimeSeries is expecting an instance of java.util.TimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Quarter quarter0 = new Quarter();
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
  public void test22()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "\"8}`(1dmII", "Null 'categoryKeys' argument.", class0);
      int int0 = timeSeries0.getIndex(fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "h]}{", (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) quarter0, (double) 1, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Quarter, but the TimeSeries is expecting an instance of java.lang.String.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 0;
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(int0, hour0);
      Day day0 = minute0.getDay();
      String string0 = "";
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, string0, string0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(hour0.LAST_HOUR_IN_DAY);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 23, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-2123));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Day day0 = new Day();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Month> class0 = Month.class;
      Week week0 = new Week((-6), 37);
      TimeSeries timeSeries0 = new TimeSeries(week0, "You are trying to add data where the time period class ", "You are trying to add data where the time period class ", class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      Day day0 = minute0.getDay();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, (String) null, (String) null, class0);
      boolean boolean0 = timeSeries0.equals(day0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Year year0 = new Year();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "You are trying to add data where the time period class ", "o.?K*<$lyvWRD?0", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) year0, (RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 1700, 1700, 1700, (-568));
      Year year0 = new Year(mockDate0);
      RegularTimePeriod regularTimePeriod0 = year0.next();
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(regularTimePeriod0, (RegularTimePeriod) year0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start on or before end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1524, 0, 0, (-1210), 0, 0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Millisecond millisecond0 = new Millisecond(mockDate0, timeZone0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) null, (RegularTimePeriod) millisecond0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'start' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "j4IEKHH/~0I,WBj$=", "j4IEKHH/~0I,WBj$=", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(1, (-1));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-1), 3);
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour(0, day0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) 0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(274, 121);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(243, 243);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 243, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour(0, day0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) 0);
      timeSeries0.delete((RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Day day0 = new Day();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      timeSeries0.delete((RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Quarter quarter0 = new Quarter(mockDate0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", "", class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.removeAgedItems(685L, false);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "U31(I Zw", class0);
      timeSeries0.setMaximumItemCount(0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "\"8}`(1dmII", "Null 'categoryKeys' argument.", class0);
      timeSeries0.add((RegularTimePeriod) fixedMillisecond0, (Number) null);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (-3576.3));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) day0, (Number) null);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      ParsePosition parsePosition0 = new ParsePosition(3);
      Date date0 = mockSimpleDateFormat0.parse("", parsePosition0);
      SerialDate serialDate0 = SerialDate.createInstance(date0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, "", (String) null, class0);
      Day day0 = new Day();
      timeSeries0.add((RegularTimePeriod) day0, (Number) 1900, false);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockDate mockDate0 = new MockDate(9223372036854775807L);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(3209, "iW5X");
      Quarter quarter0 = new Quarter(mockDate0, simpleTimeZone0);
      Class<RowSorterEvent.Type> class0 = RowSorterEvent.Type.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
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
  public void test49()  throws Throwable  {
      Day day0 = new Day();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      TimeSeries timeSeries1 = new TimeSeries(day0);
      timeSeries1.add((RegularTimePeriod) day0, (double) 685L);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (double) 685L);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Year year0 = new Year();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "", "", class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) week0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 1, 0, 1, 1968, 1);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-3090L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(840L, 2594L);
      Date date0 = Date.from(instant0);
      Quarter quarter0 = new Quarter(date0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", "+^ XDyg{erxSCs", class0);
      timeSeries0.setMaximumItemAge(840L);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Week week0 = new Week(334, 334);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-6));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Day day0 = new Day();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      timeSeries0.setMaximumItemCount(5966);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Day day0 = new Day();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour(0, day0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour(0, day0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.setRangeDescription("Q4zR#v");
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      TimeSeries timeSeries0 = new TimeSeries("|79jHPDVUmLhGCb");
      Hour hour0 = new Hour();
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, (Number) integer0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour(0, day0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Day day0 = new Day();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) day0, (double) 685L);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Day, but the TimeSeries is expecting an instance of java.util.Date.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      Minute minute0 = new Minute(date0, simpleTimeZone0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
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
  public void test64()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1944), 0, 274, 0, 274);
      Week week0 = new Week(mockDate0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "(POfr07-9j?7", class0);
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
  public void test65()  throws Throwable  {
      Day day0 = new Day();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Minute minute0 = new Minute();
      Day day0 = minute0.getDay();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, (double) (-2585));
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      ParsePosition parsePosition0 = new ParsePosition(3);
      Date date0 = mockSimpleDateFormat0.parse("", parsePosition0);
      SerialDate serialDate0 = SerialDate.createInstance(date0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, "", (String) null, class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.update(Integer.MAX_VALUE, (Number) 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2147483647, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Day day0 = new Day();
      Class<Integer> class0 = Integer.class;
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
  public void test71()  throws Throwable  {
      Day day0 = new Day();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      timeSeries0.setDomainDescription("14-February-2014");
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, (-1121), (-1121));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "iKcwVJkcn?VZP>a99^,", "iKcwVJkcn?VZP>a99^,", class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
