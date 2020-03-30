/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:50:35 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.time.chrono.IsoEra;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
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
      Minute minute0 = new Minute();
      Day day0 = minute0.getDay();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-2115.3750372), (-206.0));
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0, " for that time period. Duplicates are not ", " for that time period. Duplicates are not ", class0);
      timeSeries0.setMaximumItemCount(0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, 0.0);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (double) 152);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, 6, 0, 0, 3367, 3367);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Minute minute0 = new Minute(mockDate0, zoneInfo0);
      Second second0 = new Second(0, minute0);
      Class<IsoEra> class0 = IsoEra.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems(9223372036854775807L, false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Week week0 = new Week((-1073741823), (-1833));
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod((-1833));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Week week0 = new Week((-1073741823), (-1833));
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "Q found at end of string.", class0);
      TimeSeries timeSeries1 = (TimeSeries)timeSeries0.clone();
      timeSeries1.data = null;
      // Undeclared exception!
      try { 
        timeSeries0.equals(timeSeries1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(213, 213);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 213, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 1, 0, 100);
      TimeZone timeZone0 = TimeZone.getDefault();
      Minute minute0 = new Minute(mockDate0, timeZone0);
      Day day0 = minute0.getDay();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "D @mQ`jOSMI", "D @mQ`jOSMI", class0);
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
  public void test08()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "Overwritten values from: ", "$~tsxk", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) millisecond0, 621.0);
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
  public void test09()  throws Throwable  {
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "OYEm", "%~HGR=", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
      MockDate mockDate0 = new MockDate(0, 0, 1, 0, 100);
      TimeZone timeZone0 = TimeZone.getDefault();
      Minute minute0 = new Minute(mockDate0, timeZone0);
      Day day0 = minute0.getDay();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "D @mQ`jOSMI", "D @mQ`jOSMI", class0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      Hour hour0 = new Hour();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) hour0, (double) 1);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of org.jfree.data.time.FixedMillisecond.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
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
  public void test15()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      int int0 = timeSeries0.getIndex(hour0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-2115.3750372), (-206.0));
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0, " for that time period. Duplicates are not ", " for that time period. Duplicates are not ", class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-2115.3750372), (-206.0));
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0, " for that time period. Duplicates are not ", " for that time period. Duplicates are not ", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Month month0 = new Month();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "", "org.jfree.data.time.TimeSeries", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(397);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 397, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Month month0 = new Month();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, " ELAy<K'8O^~]/>4", "", class0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 1841);
      Minute minute0 = new Minute(mockDate0);
      Second second0 = new Second(0, minute0);
      Millisecond millisecond0 = new Millisecond(0, second0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(999);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 999, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Week week0 = new Week((-1836), (-322));
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "2J\"MRy1y", "2J\"MRy1y", class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Week week0 = new Week((-1836), (-322));
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "2J\"MRy1y", "2J\"MRy1y", class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
      boolean boolean0 = timeSeries1.equals(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      Millisecond millisecond0 = new Millisecond();
      boolean boolean0 = timeSeries0.equals(millisecond0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 3, 2177, 3, 32);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Quarter quarter0 = new Quarter(date0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) quarter0, (RegularTimePeriod) quarter0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(267, 2186);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Year year0 = new Year();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(44, (-2137));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockDate mockDate0 = new MockDate(82, 734, (-675));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, ") not recognised.", "[d'h<", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-675), 2186);
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "ixJ6<Q$VI7GI!v", "ixJ6<Q$VI7GI!v", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (double) 59);
      timeSeries0.delete(0, 0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Week week0 = new Week((-1836), (-322));
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "2J\"MRy1y", "2J\"MRy1y", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(1168, 1);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Week week0 = new Week((-1836), (-322));
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "2J\"MRy1y", "2J\"MRy1y", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-322), 1);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -322
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 3, 2177, 3, 32);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Quarter quarter0 = new Quarter(date0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      timeSeries0.delete((RegularTimePeriod) quarter0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockDate mockDate0 = new MockDate(365, 1782, 5, 1782, (-1), 5);
      TimeZone timeZone0 = TimeZone.getDefault();
      Second second0 = new Second(mockDate0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, (Number) 59);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      timeSeries0.removeAgedItems((-1874L), true);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-2115.3750372), (-206.0));
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0, " for that time period. Duplicates are not ", " for that time period. Duplicates are not ", class0);
      timeSeries0.setMaximumItemCount(0);
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getTimeZone(" for that time period. Duplicates are not ");
      Quarter quarter0 = new Quarter(mockDate0, timeZone0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (Number) 1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (double) 152);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) month0, (RegularTimePeriod) month0);
      TimeSeries timeSeries2 = timeSeries1.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (double) 152);
      // Undeclared exception!
      try { 
        timeSeries0.addAndOrUpdate(timeSeries0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, 0.0);
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getNextTimePeriod();
      // Undeclared exception!
      try { 
        timeSeries0.update(regularTimePeriod0, (Number) null);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-313L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, 0.0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) month0, (RegularTimePeriod) month0);
      Collection collection0 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, 0.0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, 0.0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      XYDataItem xYDataItem0 = new XYDataItem(bigInteger0, (byte) (-28));
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, class0);
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
  public void test45()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.setMaximumItemAge(23);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 2564.132);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-2137));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      timeSeries0.setMaximumItemCount(2186);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Minute minute0 = new Minute();
      Second second0 = new Second(0, minute0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) second0, (Number) 59);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Second, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.setRangeDescription("org.jfree.data.time.TimeSeries");
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 3, 2177, 3, 32);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Quarter quarter0 = new Quarter(date0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) quarter0, (Number) 1, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Quarter, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-313L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) fixedMillisecond0, (double) (-313L), false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, class0);
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
  public void test53()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(734);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2194L);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, 0.0);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem((RegularTimePeriod) month0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
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
      Day day0 = new Day();
      Class<Second> class0 = Second.class;
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
  public void test58()  throws Throwable  {
      Week week0 = new Week((-1836), (-322));
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "2J\"MRy1y", "2J\"MRy1y", class0);
      timeSeries0.setDomainDescription("");
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Week week0 = new Week((-1073741823), (-1833));
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "Q found at end of string.", class0);
      Object object0 = timeSeries0.clone();
      boolean boolean0 = timeSeries0.equals(object0);
  }
}
