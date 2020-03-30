/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:36:17 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.ChronoLocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JLayeredPane;
import javax.swing.JViewport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
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
import org.jfree.data.time.SpreadsheetDate;
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
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries("Nll 'period' rguent.", class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-213L));
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(0, 0);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Month month0 = new Month(mockDate0, timeZone0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, (String) null, "First", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 93);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(1310, 1310);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1310, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries("`sBPG~6;cY(/CT", "`sBPG~6;cY(/CT", "`sBPG~6;cY(/CT", class0);
      timeSeries0.setMaximumItemAge(1L);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      timeSeries0.add((RegularTimePeriod) day0, (Number) integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2476L);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "$)INVXsfk(K!2", "$)INVXsfk(K!2", class0);
      timeSeries0.add((RegularTimePeriod) fixedMillisecond0, 471.804911183004, false);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(273);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, (String) null, "", class0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate(304, 304, 304, 2265, 304);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Quarter quarter0 = new Quarter(mockDate0, zoneInfo0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-5), (Number) 4);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Day day0 = new Day();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, (String) null, (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((long) 795, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2624L);
      Class<JViewport> class0 = JViewport.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, (String) null, (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(2);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 1171, 0, (-2108));
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(date0, (-1530.8354925817894), 0.0, 2428.5663, 0.0, 191.379988747);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(oHLCDataItem0, class0);
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
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(101);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 101, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1813, (-1040), 1813, 1813, (-1040));
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(91, 2179);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 91, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockDate mockDate0 = new MockDate(304, 304, 304, 2265, 304);
      TimeSeries timeSeries0 = new TimeSeries(mockDate0);
      Month month0 = new Month();
      BigInteger bigInteger0 = BigInteger.ONE;
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(month0, bigInteger0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Week week0 = new Week();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (double) 1, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of java.util.SimpleTimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "", "org.jfree.data.time.Second", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2624L);
      Class<JViewport> class0 = JViewport.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, (String) null, (String) null, class0);
      Integer integer0 = new Integer(2221);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) integer0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, "org.jfree.data.time.TimeSeries", "", class0);
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
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "$)INVXsfk(K!2", "$)INVXsfk(K!2", class0);
      int int0 = timeSeries0.getIndex(fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Year year0 = new Year();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "Range", "Range", class0);
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
  public void test24()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-704));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "$)INVXsfk(K!2", "$)INVXsfk(K!2", class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 1596, 29, 29, (-2898), (-3464));
      TimeZone timeZone0 = TimeZone.getTimeZone("DDcF0nxbm7XlH(");
      Millisecond millisecond0 = new Millisecond(mockDate0, timeZone0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "Negative 'periods' argument.", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (double) (-3464));
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      boolean boolean0 = timeSeries0.equals(week0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockDate mockDate0 = new MockDate(501, 501, 501, 501, 501);
      Second second0 = new Second(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "", "}Cc??y8j81.`tFlnJ8Y", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) null, (RegularTimePeriod) second0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'start' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      Hour hour0 = new Hour();
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-1), 62);
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Year year0 = new Year();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(817, 817);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockDate mockDate0 = new MockDate(30, 0, 30);
      Year year0 = new Year(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) year0, (double) 0);
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, "a", "'C2VLb7gPI]'Y>pj$xu", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(953, 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1552), 261);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1552
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
      Date date0 = spreadsheetDate0.toDate();
      Millisecond millisecond0 = new Millisecond(date0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "mWc8*!8@,", " but the series already contains an observation", class0);
      timeSeries0.delete((RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      timeSeries0.removeAgedItems((-321L), false);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
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
  public void test38()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "$)INVXsfk(K!2", "$)INVXsfk(K!2", class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Day day0 = new Day(mockDate0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
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
  public void test40()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1177L));
      Day day0 = new Day(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(mockDate0);
      byte[] byteArray0 = new byte[2];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(day0, bigInteger0);
      timeSeries0.add(timeSeriesDataItem0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
      Date date0 = spreadsheetDate0.toDate();
      Millisecond millisecond0 = new Millisecond(date0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "mWc8*!8@,", " but the series already contains an observation", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, 732.7);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "$)INVXsfk(K!2", "$)INVXsfk(K!2", class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Week week0 = new Week();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "zkkr$*72Z+[Ka'azn7", (String) null, class0);
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
  public void test44()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2476L);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "$)INVXsfk(K!2", "$)INVXsfk(K!2", class0);
      timeSeries0.add((RegularTimePeriod) fixedMillisecond0, 471.804911183004, false);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, "org.jfree.data.time.TimeSeries", "", class0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      Year year0 = new Year(date0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-3216L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Second second0 = new Second();
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "jC", (String) null, class0);
      timeSeries0.setMaximumItemAge(0L);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Day day0 = new Day();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, (String) null, (String) null, class0);
      timeSeries0.setMaximumItemCount(795);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, "org.jfree.data.time.TimeSeries", "", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, "org.jfree.data.time.TimeSeries", "", class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      MockDate mockDate0 = new MockDate(475, 1, (-800), 0, 2, 273);
      Minute minute0 = new Minute(mockDate0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (Number) 1);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 1171, 0, (-2108));
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(date0, (-1530.8354925817894), 0.0, 2428.5663, 0.0, 191.379988747);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(oHLCDataItem0, class0);
      timeSeries0.setRangeDescription("q& coa )|Dj%");
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      Hour hour0 = new Hour();
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, (Number) 23, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of java.lang.Object.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, "org.jfree.data.time.TimeSeries", "", class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Day day0 = new Day();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, (String) null, (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) day0, (double) 2);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Day, but the TimeSeries is expecting an instance of java.util.SimpleTimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Year year0 = new Year();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-2759));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2969), (-2969), (-2969), (-2969), 549);
      Week week0 = new Week(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
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
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, "org.jfree.data.time.TimeSeries", "", class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "$)INVXsfk(K!2", "$)INVXsfk(K!2", class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 1596, 29, 29, (-2898), (-3464));
      TimeZone timeZone0 = TimeZone.getTimeZone("DDcF0nxbm7XlH(");
      Millisecond millisecond0 = new Millisecond(mockDate0, timeZone0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "Negative 'periods' argument.", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (double) (-3464));
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) millisecond0, (-2236.896847254859));
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period Sat Jan 28 03:44:16 GMT 2062 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-213L));
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(0, 0);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Month month0 = new Month(mockDate0, timeZone0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, (String) null, "First", class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update(0, (Number) 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(date0);
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
  public void test66()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.setDomainDescription((String) null);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Year year0 = new Year();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
