/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:33:25 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.text.DateFormatSymbols;
import java.text.ParsePosition;
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
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Year year0 = new Year();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(1049, 1049);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1049, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate(4279, 414, 0);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, "The 'series' argument is out of bounds (", "The 'series' argument is out of bounds (", class0);
      timeSeries0.setMaximumItemAge(0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Double double0 = new Double((-2.147483648E9));
      XYDataItem xYDataItem0 = new XYDataItem((Number) double0, (Number) double0);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, class0);
      timeSeries0.setMaximumItemCount(2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("");
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Day day0 = new Day();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      // Undeclared exception!
      try { 
        timeSeries0.update(0, (Number) bigInteger0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(1972L, 1972L);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, (String) null, "D8G=CN", class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((-4725L), true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Second second0 = new Second(mockDate0);
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "W,|)gQ\"d/>>w ", "9_dq4VEZ!U08", class0);
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
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-322L));
      Class<Object> class0 = Object.class;
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
  public void test09()  throws Throwable  {
      Week week0 = new Week(875, 4132);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "Domain", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (Number) 1);
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
  public void test10()  throws Throwable  {
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "Time", "permitted.  Try using the addOrUpdate() method.", class0);
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
      Day day0 = new Day();
      Hour hour0 = new Hour(29, day0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Month month0 = new Month(1, 1);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (Number) 59);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Month month0 = new Month();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) month0, (-806.0322320098841));
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.Hour.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "<CGC}VRE=~BJin&o", "F_gB4K5.zOdX=&Lo", class0);
      int int0 = timeSeries0.getIndex(minute0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour((-1884), day0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "=Ok6%,o", class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 1339, 3178, 0, 0, 4281);
      TimeZone timeZone0 = TimeZone.getTimeZone("f]quBf@C=i(de{");
      Minute minute0 = new Minute(mockDate0, timeZone0);
      Day day0 = minute0.getDay();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "e4", "f]quBf@C=i(de{", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(4281);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4281, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(53);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 53, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "", class0);
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
  public void test21()  throws Throwable  {
      Week week0 = new Week(875, 4132);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "", class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<TimeSeries> class0 = TimeSeries.class;
      Class class1 = RegularTimePeriod.downsize(class0);
      TimeSeries timeSeries0 = new TimeSeries("Null 'id' argument.", "TimeSeriesDataset.addSeries(): cannot add more series than specified in c'tor", (String) null, class1);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Week week0 = new Week(875, 4132);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "Domain", class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Month month0 = new Month(1, 1);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      MockDate mockDate0 = new MockDate(0L);
      Minute minute0 = new Minute(mockDate0, month0.DEFAULT_TIME_ZONE);
      boolean boolean0 = timeSeries0.equals(minute0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Day day0 = new Day(serialDate0);
      RegularTimePeriod regularTimePeriod0 = day0.previous();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) day0, regularTimePeriod0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start on or before end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      Quarter quarter0 = new Quarter(4, 4);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) quarter0, (RegularTimePeriod) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'end' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1264), (-1264), 1068, 1068, (-290), 1068);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, (RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(2.0, 2.0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour((-1884), day0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "=Ok6%,o", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-1884), 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate(24L);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "<P");
      Minute minute0 = new Minute(mockDate0, simpleTimeZone0);
      Day day0 = minute0.getDay();
      Hour hour0 = new Hour(0, day0);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, 1.0);
      TimeSeries timeSeries1 = new TimeSeries(day0, class0);
      TimeSeries timeSeries2 = timeSeries1.addAndOrUpdate(timeSeries0);
      timeSeries1.delete(0, 0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(Integer.MAX_VALUE, (-1609), 2909, (-1609), 673, (-2061));
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Quarter quarter0 = new Quarter(date0, zoneInfo0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(2909, 3);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Week week0 = new Week(875, 4132);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "Domain", class0);
      timeSeries0.delete((RegularTimePeriod) week0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "<CGC}VRE=~BJin&o", "F_gB4K5.zOdX=&Lo", class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      ParsePosition parsePosition0 = new ParsePosition(0);
      Date date0 = mockSimpleDateFormat0.parse("org.jfree.data.xy.YIntervalSeries", parsePosition0);
      Year year0 = new Year(date0);
      TimeSeries timeSeries0 = new TimeSeries(year0);
      timeSeries0.removeAgedItems((long) 0, true);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(212, "The 'bins' value must be at least 1.");
      Week week0 = new Week(mockDate0, simpleTimeZone0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "The 'bins' value must be at least 1.", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) week0, (Number) 53);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockDate mockDate0 = new MockDate(24L);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "<P");
      Minute minute0 = new Minute(mockDate0, simpleTimeZone0);
      Day day0 = minute0.getDay();
      Hour hour0 = new Hour(0, day0);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
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
  public void test37()  throws Throwable  {
      Year year0 = new Year();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "PS5S^VQx\"\"[", "PS5S^VQx\"\"[", class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "org.jfree.data.xy.AbstractIntervalXYDataset", "=i\"tKR", class0);
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
  public void test39()  throws Throwable  {
      MockDate mockDate0 = new MockDate(24L);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "<P");
      Minute minute0 = new Minute(mockDate0, simpleTimeZone0);
      Day day0 = minute0.getDay();
      Hour hour0 = new Hour(0, day0);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, 1.0);
      TimeSeries timeSeries1 = new TimeSeries(day0, class0);
      TimeSeries timeSeries2 = timeSeries1.addAndOrUpdate(timeSeries0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "", class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MockDate mockDate0 = new MockDate(60, 501, 60, 60, (-1484));
      Day day0 = new Day(mockDate0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-2505L));
      Date date0 = Date.from(instant0);
      Quarter quarter0 = new Quarter(date0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-501L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Week week0 = new Week(875, 4132);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "Domain", class0);
      timeSeries0.setMaximumItemAge(1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-5));
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
      timeSeries0.setMaximumItemCount(0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour((-1884), day0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "=Ok6%,o", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "", (String) null, class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-48L));
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "A->", (String) null, class0);
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) fixedMillisecond0, (Number) integer0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of java.time.chrono.ChronoLocalDate.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Week week0 = new Week(875, 4132);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "Domain", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (double) 4132);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Week week0 = new Week(875, 4132);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "Domain", class0);
      timeSeries0.setRangeDescription("");
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-662L));
      Second second0 = new Second(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) second0, (Number) 0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Second, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochMilli(156L);
      Date date0 = Date.from(instant0);
      Minute minute0 = new Minute(date0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(0, 3);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour(29, day0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) day0, (double) 29, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Day, but the TimeSeries is expecting an instance of java.lang.String.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Week week0 = new Week(875, 4132);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "Domain", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(1);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "", (String) null, class0);
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
  public void test57()  throws Throwable  {
      MockDate mockDate0 = new MockDate(24L);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "<P");
      Minute minute0 = new Minute(mockDate0, simpleTimeZone0);
      Day day0 = minute0.getDay();
      Hour hour0 = new Hour(0, day0);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Day day0 = new Day();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      // Undeclared exception!
      try { 
        timeSeries0.update((-40), (Number) bigInteger0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Week week0 = new Week(875, 4132);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "Domain", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (double) 0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MockDate mockDate0 = new MockDate(24L);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "<P");
      Minute minute0 = new Minute(mockDate0, simpleTimeZone0);
      Day day0 = minute0.getDay();
      Hour hour0 = new Hour(0, day0);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.setDomainDescription("{16%:3*9#SzM$4GW,_");
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Week week0 = new Week(875, 4132);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "Domain", class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
