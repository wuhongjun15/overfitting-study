/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 14:04:07 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import javax.swing.JTextPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
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
import org.jfree.data.xy.OHLCDataItem;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(0, (-1435));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(2749, 2749);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2749, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Second second0 = new Second(mockDate0, zoneInfo0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
      timeSeries0.setMaximumItemCount(0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Week week0 = new Week(91, (-759));
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "='", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (Number) 1);
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getNextTimePeriod();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Week week0 = new Week(91, (-759));
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "='", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (Number) 1);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Week week0 = new Week(91, (-759));
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "='", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (Number) 1);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem(0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "No such series : ", "is ", class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((long) 999, false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Object> class0 = Object.class;
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
  public void test08()  throws Throwable  {
      Week week0 = new Week(91, (-759));
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "='", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (Number) 1);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((RegularTimePeriod) week0);
      } catch(IllegalArgumentException e) {
         //
         // Year constructor: year (-759) outside valid range.
         //
         verifyException("org.jfree.data.time.Year", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Day day0 = new Day();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, ") outside valid range.", "}D", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-4117), 29);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4117
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-991), (-6), 3);
      Month month0 = new Month(mockDate0);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
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
  public void test11()  throws Throwable  {
      Class<Month> class0 = Month.class;
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
  public void test12()  throws Throwable  {
      Class<Hour> class0 = Hour.class;
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Second second0 = new Second(mockDate0, zoneInfo0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Year year0 = new Year();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) year0, (-216.38436994931));
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of org.jfree.data.time.RegularTimePeriod.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "No such series : ", "is ", class0);
      int int0 = timeSeries0.getIndex(millisecond0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockDate mockDate0 = new MockDate(125L);
      Second second0 = new Second(mockDate0);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "?'$P1U<^K^|-/Ouk-", "[g+3%i3(c", class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour(2, day0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
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
  public void test19()  throws Throwable  {
      Week week0 = new Week(91, (-759));
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "='", class0);
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
  public void test20()  throws Throwable  {
      Week week0 = new Week(91, (-759));
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "='", class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 2, 0, 993);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Month month0 = new Month(mockDate0, timeZone0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(3119);
      TimeSeries timeSeries0 = new TimeSeries(serialDate0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      Millisecond millisecond0 = new Millisecond(date0);
      boolean boolean0 = timeSeries0.equals(millisecond0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries("$%,d7qm.Xg:", class0);
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
  public void test24()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, (RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Second second0 = new Second();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-3083), (-1));
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Second second0 = new Second(mockDate0, zoneInfo0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(59, 29);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(2749, (-755));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockDate mockDate0 = new MockDate(4L);
      Year year0 = new Year(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(year0);
      timeSeries0.delete((RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(3119);
      TimeSeries timeSeries0 = new TimeSeries(serialDate0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate(4L);
      Year year0 = new Year(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(year0);
      timeSeries0.removeAgedItems(4L, false);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Long long0 = new Long((-986L));
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) fixedMillisecond0, (Number) long0);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockDate mockDate0 = new MockDate(Integer.MAX_VALUE, (-3707), 1305, Integer.MAX_VALUE, (-4277));
      Year year0 = new Year(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(year0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Second second0 = new Second();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Second second0 = new Second(mockDate0, zoneInfo0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "No such series : ", "is ", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "j//}Xc|P/", "j//}Xc|P/", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-382L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "No such series : ", "is ", class0);
      timeSeries0.setMaximumItemCount(999);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Week week0 = new Week(91, (-759));
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "='", class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 2, 0, 993);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Month month0 = new Month(mockDate0, timeZone0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) month0, 849.4795198755);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of java.util.TimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Second second0 = new Second();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      timeSeries0.setRangeDescription("");
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, (Number) 0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("DjX{C+$u281`/Q");
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) millisecond0, (double) 999, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Millisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("$SvsxurKGV{}p/MJZ &");
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-1439));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
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
  public void test47()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (double) (-1L));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(3119);
      TimeSeries timeSeries0 = new TimeSeries(serialDate0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Quarter quarter0 = new Quarter(mockDate0, timeZone0);
      Class<JTextPane> class0 = JTextPane.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update(1, (Number) 4);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, 1145.775);
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
  public void test53()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 228, 0, 1, 0);
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, 0, 228, 0.0, 1, (-2461.8934835339));
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(oHLCDataItem0, class0);
      timeSeries0.setDomainDescription((String) null);
  }
}
