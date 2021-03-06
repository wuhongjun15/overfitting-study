/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 13:12:47 GMT 2020
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
import java.util.Locale;
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
import org.jfree.data.time.SpreadsheetDate;
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
      Double double0 = new Double(0.0);
      XYDataItem xYDataItem0 = new XYDataItem((Number) double0, (Number) double0);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "T6SrDM^wWUhZna/__;n", "0;N'LCHyRGH:@sfo~", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 404);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Double double0 = new Double(0.0);
      XYDataItem xYDataItem0 = new XYDataItem((Number) double0, (Number) double0);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "T6SrDM^wWUhZna/__;n", "0;N'LCHyRGH:@sfo~", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      timeSeries0.setMaximumItemAge(0L);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3677, 3677, 3677, 1553, 560);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Day day0 = new Day(serialDate0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, (-1.0));
      Number number0 = timeSeries0.getValue(0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Week week0 = new Week();
      Class<Integer> class0 = Integer.TYPE;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Month month0 = new Month();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-1372), (Number) null);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Month month0 = new Month();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
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
  public void test08()  throws Throwable  {
      Month month0 = new Month();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod((-4222));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(1982);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1982, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries("", "org.jfree.data.DefaultKeyedValue", (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1194), 1431655765);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1194
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Week week0 = new Week((-3209), 1828);
      TimeSeries timeSeries0 = new TimeSeries(week0);
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
  public void test12()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
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
  public void test13()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "LQ'", "*^1mMBm>m?y", class0);
      Short short0 = new Short((short)0);
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
  public void test14()  throws Throwable  {
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "fn.S$,L7Z 'RG5:Qom", "Negative 'periods' argument.", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
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
      MockDate mockDate0 = new MockDate(1394, 506, 3647);
      Hour hour0 = new Hour(mockDate0);
      Minute minute0 = new Minute(1394, hour0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Month month0 = new Month();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (-981.0));
      BigInteger bigInteger0 = BigInteger.ZERO;
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (Number) bigInteger0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Integer integer0 = new Integer(305);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, (Number) integer0);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) integer0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (double) 1);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      TimeSeries timeSeries0 = new TimeSeries(integer0);
      MockDate mockDate0 = new MockDate();
      Hour hour0 = new Hour(mockDate0);
      int int0 = timeSeries0.getIndex(hour0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      XYDataItem xYDataItem0 = new XYDataItem(bigInteger0, bigInteger0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(243);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 243, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-1440));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Month month0 = new Month();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Month month0 = new Month();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      boolean boolean0 = timeSeries0.equals(month0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1836, 1836, 3);
      TimeZone timeZone0 = TimeZone.getTimeZone("6eg^z#1^or6ifp");
      Millisecond millisecond0 = new Millisecond(mockDate0, timeZone0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) millisecond0, (RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(163, (-1344));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      TimeSeries timeSeries0 = new TimeSeries(integer0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-1), 23);
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(59, (-1));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(59, 1549);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 59, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Month month0 = new Month();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (double) 29);
      timeSeries0.delete((RegularTimePeriod) month0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Month month0 = new Month();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      timeSeries0.delete((RegularTimePeriod) month0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Month month0 = new Month();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (double) 29);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Month month0 = new Month();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Month month0 = new Month();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      timeSeries0.removeAgedItems(0L, false);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Month month0 = new Month();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(29, 29);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (double) 29);
      TimeSeries timeSeries2 = timeSeries1.addAndOrUpdate(timeSeries0);
      int int0 = timeSeries1.hashCode();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-661.1395211669857), 0.0, false, false);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0, class0);
      Week week0 = new Week();
      Year year0 = week0.getYear();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (double) 1);
      Short short0 = new Short((short)1309);
      timeSeries0.update((RegularTimePeriod) year0, (Number) short0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) year0, (Number) null);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-661.1395211669857), 0.0, false, false);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0, class0);
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
  public void test41()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-661.1395211669857), 0.0, false, false);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0, class0);
      Week week0 = new Week();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (double) 1);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) week0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Month month0 = new Month();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) month0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries("qH88.#-LQi(a%", "", "d'J-2M/)=#l5", class0);
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
  public void test44()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3677, 3677, 3677, 1553, 560);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Day day0 = new Day(serialDate0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1836, 1836, 3);
      TimeZone timeZone0 = TimeZone.getTimeZone("6eg^z#1^or6ifp");
      Millisecond millisecond0 = new Millisecond(mockDate0, timeZone0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(3653);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, "", "rTf,jK4(+@}(", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-447L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3677, 3677, 3677, 1553, 560);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Day day0 = new Day(serialDate0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      timeSeries0.setMaximumItemAge(2);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(31);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Month month0 = new Month(mockDate0, timeZone0);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-273));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      timeSeries0.setMaximumItemCount(2321);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Week week0 = new Week(date0);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "Null 'values' argument.", "Null 'values' argument.", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 29, 29, 29, 1516, 29);
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(300);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.GERMANY;
      Week week0 = new Week(mockDate0, timeZone0, locale0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1871, 1871, 1564);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Hour hour0 = new Hour(mockDate0, zoneInfo0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of java.lang.Integer.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Month month0 = new Month();
      Year year0 = month0.getYear();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) year0, 0.0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1836, 1836, 3);
      TimeZone timeZone0 = TimeZone.getTimeZone("6eg^z#1^or6ifp");
      Millisecond millisecond0 = new Millisecond(mockDate0, timeZone0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      timeSeries0.setRangeDescription((String) null);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Integer integer0 = new Integer(305);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, (Number) integer0);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) fixedMillisecond0, (Number) integer0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Month month0 = new Month();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, 0.0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of org.jfree.data.time.FixedMillisecond.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3677, 3677, 3677, 1553, 560);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Day day0 = new Day(serialDate0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
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
  public void test60()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Second> class0 = Second.class;
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
  public void test61()  throws Throwable  {
      Year year0 = new Year(4467);
      TimeSeries timeSeries0 = new TimeSeries(year0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Month month0 = new Month();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (double) 29);
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
  public void test63()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Month month0 = new Month();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      Float float0 = new Float((double) (-1));
      // Undeclared exception!
      try { 
        timeSeries0.update(87, (Number) float0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 87, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Second second0 = new Second(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) second0, (double) 59);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, "Unknown key: ", "Unknown key: ", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Second, but the TimeSeries is expecting an instance of java.lang.String.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3677, 3677, 3677, 1553, 560);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Day day0 = new Day(serialDate0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      timeSeries0.setDomainDescription("DU7Fd!0i[6*");
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
