/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:25:57 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.time.chrono.ChronoLocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JToggleButton;
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
      Year year0 = new Year();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(3326, 2145336164);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Second second0 = new Second();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1491), 0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1491
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour(0, day0);
      Minute minute0 = new Minute((-1196), hour0);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      Year year0 = new Year(date0, minute0.DEFAULT_TIME_ZONE);
      timeSeries0.add((RegularTimePeriod) year0, (-280.0));
      timeSeries0.update(0, (Number) 23);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Second second0 = new Second();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "", (String) null, class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "q)a&wxf5E", "#_`4q@D", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      byte[] byteArray0 = new byte[6];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) bigInteger0, true);
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getNextTimePeriod();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Year year0 = new Year();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      timeSeries0.setMaximumItemAge(0L);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Day day0 = new Day();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "", class0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Year year0 = new Year();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      timeSeries0.setMaximumItemAge(0L);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) year0, (RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Year year0 = new Year();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      timeSeries0.setMaximumItemAge(0L);
      TimeSeries timeSeries1 = timeSeries0.createCopy(2145336164, 2145336164);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.update(0, (Number) 999);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(mockDate0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((-3645L), false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-2276L));
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-1555));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 2);
      Year year0 = new Year(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) year0, (double) 0);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
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
  public void test14()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(999);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 999, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(53, 53);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 53, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "6+#_", "R/*Vpj[)n0Fl@I4Lq", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Quarter> class0 = Quarter.class;
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
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.removeAgedItems(true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(date0, "h|:]UP.33u2cO91q", "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", class0);
      Millisecond millisecond0 = new Millisecond();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (Number) 0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) millisecond0, 0.0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Millisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.TimeSeries.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "q)a&wxf5E", "#_`4q@D", class0);
      int int0 = timeSeries0.getIndex(quarter0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Day day0 = new Day();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "", class0);
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
  public void test24()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(1268);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1268, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "org.jfree.data.time.TimeSeries", "org.jfree.data.time.TimeSeries", class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Year year0 = new Year();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, (String) null, "org.jfree.data.ComparableObjectSeries", class0);
      Object object0 = timeSeries0.clone();
      boolean boolean0 = timeSeries0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "M95sT8;-oOuJTT5", "M95sT8;-oOuJTT5", class0);
      boolean boolean0 = timeSeries0.equals(xYDataItem0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, (String) null, "org.jfree.data.ComparableObjectSeries", class0);
      boolean boolean0 = timeSeries0.equals(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1767L));
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, ".", ".", class0);
      Month month0 = new Month();
      TimeSeries timeSeries1 = new TimeSeries(month0, "org.jfree.data.time.TimePeriodValues", ".", class0);
      boolean boolean0 = timeSeries1.equals(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries("", "", (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) null, (RegularTimePeriod) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'start' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Year year0 = new Year();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) year0, (RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(1, 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(0, (-194));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      timeSeries0.delete((RegularTimePeriod) quarter0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1767L));
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, ".", ".", class0);
      Month month0 = new Month();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (double) 1);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Year year0 = new Year();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      timeSeries0.removeAgedItems((-1354L), false);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1767L));
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, ".", ".", class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "@ZQ)8;?O6", "@ZQ)8;?O6", class0);
      BigInteger bigInteger0 = BigInteger.TEN;
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) fixedMillisecond0, (Number) bigInteger0);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-182L));
      Locale locale0 = Locale.ENGLISH;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", locale0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Day day0 = new Day(mockDate0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (-1.0), false);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Second second0 = new Second();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
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
  public void test43()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(2355.383028606208, 2355.383028606208);
      Class<JToggleButton> class0 = JToggleButton.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, (String) null, "Negative 'maximum' argument.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((RegularTimePeriod) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Second second0 = new Second(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      byte[] byteArray0 = new byte[6];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      timeSeries0.add((RegularTimePeriod) day0, (Number) bigInteger0, true);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, (-610), 106, (-610), 0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Year year0 = new Year(date0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-610));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      timeSeries0.setMaximumItemAge(4);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries("", "fD6!{z:@S", (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-2923));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.setMaximumItemCount(1268);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Day day0 = new Day();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1767L));
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, ".", ".", class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Week week0 = new Week(2244, 2244);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "ujYJX5n-+", "ujYJX5n-+", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (Number) 53);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.time.TimeSeriesDataItem.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) fixedMillisecond0, (double) 244);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.setRangeDescription("OZ");
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (Number) 59, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of java.time.chrono.ChronoLocalDate.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1767L));
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, ".", ".", class0);
      Month month0 = new Month();
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) month0, (double) 1900, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.Year.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-2276L));
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
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
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
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
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Class class0 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, 0.0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(date0, "h|:]UP.33u2cO91q", "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-1196), (Number) null);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Month month0 = new Month();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      Long long0 = new Long(0L);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) month0, (Number) long0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.FixedMillisecond.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-2276L));
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      timeSeries0.setDomainDescription("a3br%t3C;");
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
