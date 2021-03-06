/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 07:50:34 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.ThaiBuddhistDate;
import java.time.format.FormatStyle;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import javax.swing.JLayeredPane;
import javax.swing.JWindow;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.mock.java.util.MockDate;
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
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 3859.6, true, false);
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0);
      timeSeries0.setMaximumItemAge(4257L);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Month month0 = new Month(12, 12);
      Class<JWindow> class0 = JWindow.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "Overwritten values from: ", "Overwritten values from: ", class0);
      Year year0 = new Year();
      Week week0 = new Week(999, year0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (double) 53);
      int int0 = timeSeries0.getIndex(millisecond0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Day day0 = new Day();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems(2864L, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-7));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "Overwritten values from: ", "Overwritten values from: ", class0);
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
  public void test06()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
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
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Hour hour0 = new Hour(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) hour0, (Number) 23);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, "Q found at end of string.", "Q found at end of string.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(0, 4);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-2.147483648E9), 0.0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, (-2.147483648E9), true);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "bnofJ|5XCjR0m1.j", "Second", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
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
      Day day0 = new Day();
      BigInteger bigInteger0 = BigInteger.ONE;
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(day0, bigInteger0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (Number) 999);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(2802);
      TimeSeries timeSeries0 = new TimeSeries(serialDate0);
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
  public void test15()  throws Throwable  {
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries("", class0);
      Quarter quarter0 = new Quarter();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) quarter0, (Number) 1);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Quarter, but the TimeSeries is expecting an instance of org.jfree.data.time.Month.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "Overwritten values from: ", "Overwritten values from: ", class0);
      int int0 = timeSeries0.getIndex(millisecond0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Day day0 = new Day();
      Class<FormatStyle> class0 = FormatStyle.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2992L));
      Minute minute0 = new Minute(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (double) 0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of java.util.SimpleTimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "P%{?W0$ST>nTG^*2:n", "Range", class0);
      Short short0 = new Short((short)31);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (Number) short0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of java.lang.Object.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries("5@NYC", "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(758);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 758, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1L));
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Week week0 = new Week(mockDate0, zoneInfo0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-2147483647));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1L));
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Week week0 = new Week(mockDate0, zoneInfo0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(year0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", locale0);
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(date0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, (-1664.318));
      boolean boolean0 = timeSeries0.equals(timeSeriesDataItem0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Day day0 = new Day();
      RegularTimePeriod regularTimePeriod0 = day0.next();
      BigInteger bigInteger0 = BigInteger.ONE;
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, bigInteger0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(regularTimePeriod0, (RegularTimePeriod) day0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start on or before end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries("", class0);
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) quarter0, (RegularTimePeriod) quarter0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1738, 1738, (-1), (-1), 1738, 3);
      Hour hour0 = new Hour(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) hour0, (Number) 23);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, (String) null, "ej|", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-1), 4);
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(999, (-773));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(2992, (-33));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-206), 72);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -206
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2992L));
      Minute minute0 = new Minute(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      timeSeries0.delete((RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries("", class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, 649.74);
      timeSeries0.removeAgedItems(0L, true);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (-1560.1));
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries1 = new TimeSeries(millisecond0, "", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries1.addOrUpdate((RegularTimePeriod) millisecond0, 649.74);
      TimeSeries timeSeries2 = timeSeries0.addAndOrUpdate(timeSeries1);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (-1560.1));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, 649.74);
      // Undeclared exception!
      try { 
        timeSeries0.addAndOrUpdate(timeSeries0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Millisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Second second0 = millisecond0.getSecond();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "Overwritten values from: ", "Overwritten values from: ", class0);
      Year year0 = new Year();
      Week week0 = new Week(999, year0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (double) 53);
      timeSeries0.update((RegularTimePeriod) second0, (Number) 59);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      Week week0 = new Week(40, year0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
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
  public void test39()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
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
  public void test40()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-160L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries("0WQV027t8Dc<E=!]wvv", "0WQV027t8Dc<E=!]wvv", "sxzO@0 Z%]:Lhtds", class0);
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
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, 3859.6, true, false);
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1224L));
      Hour hour0 = new Hour(mockDate0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "KGwH4lax7`", (String) null, class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Second second0 = millisecond0.getSecond();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "Overwritten values from: ", "Overwritten values from: ", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) second0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-502L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.setMaximumItemAge(0L);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, class0);
      timeSeries0.setMaximumItemCount(175);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1L));
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Week week0 = new Week(mockDate0, zoneInfo0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries("", class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Long long0 = new Long(0L);
      XYDataItem xYDataItem0 = new XYDataItem((Number) long0, (Number) long0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, (String) null, (String) null, class0);
      timeSeries0.setRangeDescription((String) null);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(0, hour0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (Number) 59);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) year0, 1.0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Double double0 = new Double(624.3632);
      XYDataItem xYDataItem0 = new XYDataItem((Number) double0, (Number) double0);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "i", "i", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(2865);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2865, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Long long0 = new Long(0L);
      XYDataItem xYDataItem0 = new XYDataItem((Number) long0, (Number) long0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, (String) null, (String) null, class0);
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
      MockDate mockDate0 = new MockDate(510, 510, 0, 1963, 1963);
      Day day0 = new Day(mockDate0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "d_m2", "", class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "Overwritten values from: ", "Overwritten values from: ", class0);
      Year year0 = new Year();
      Week week0 = new Week(999, year0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (double) 53);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(0);
      ThaiBuddhistDate thaiBuddhistDate0 = MockThaiBuddhistDate.now((ZoneId) zoneOffset0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(thaiBuddhistDate0, class0);
      Byte byte0 = new Byte((byte) (-1));
      // Undeclared exception!
      try { 
        timeSeries0.update(Integer.MAX_VALUE, (Number) byte0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2147483647, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", locale0);
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(date0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, (-1664.318));
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Long long0 = new Long(0L);
      XYDataItem xYDataItem0 = new XYDataItem((Number) long0, (Number) long0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, (String) null, (String) null, class0);
      timeSeries0.setDomainDescription((String) null);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries("", class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
