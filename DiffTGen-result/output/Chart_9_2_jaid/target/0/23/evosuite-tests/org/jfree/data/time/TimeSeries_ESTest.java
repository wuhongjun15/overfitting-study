/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 14:07:24 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.OHLCDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries("", "", "", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "TableOrder.BY_COLUMN", "TableOrder.BY_COLUMN", class0);
      timeSeries0.setMaximumItemCount(0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(0L, 2068L);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((-4237L), true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<String> class0 = String.class;
      Class class1 = RegularTimePeriod.downsize(class0);
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class1);
      timeSeries0.data = null;
      // Undeclared exception!
      try { 
        timeSeries0.getValue((RegularTimePeriod) millisecond0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, ", nn2k|Py", ", nn2k|Py", class0);
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
  public void test06()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<String> class0 = String.class;
      Class class1 = RegularTimePeriod.downsize(class0);
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class1);
      timeSeries0.data = null;
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod((-2290));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("|7^-B");
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod((-6519));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Week week0 = new Week((-1), (-1));
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "%/rsIT", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(2);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 3517, (-789), 3517, 0, 0);
      Second second0 = new Second(mockDate0);
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
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
  public void test10()  throws Throwable  {
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "I:i:)GShcno+wE_", "I:i:)GShcno+wE_", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<String> class0 = String.class;
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
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "TableOrder.BY_COLUMN", "TableOrder.BY_COLUMN", class0);
      timeSeries0.removeAgedItems(true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<DefaultTableModel> class0 = DefaultTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2979, 2979, 2979, 2979, 0);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) millisecond0, (double) 0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Millisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.TimeSeriesDataItem.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond(875, second0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) millisecond0, (-2.147483648E9));
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
      int int0 = timeSeries0.getIndex(second0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Day day0 = new Day();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, ">g&#O8>K*&W_p,HF", ">g&#O8>K*&W_p,HF", class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1408, 1316, 0);
      Week week0 = new Week(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (Number) 53, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
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
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Hour hour0 = new Hour(mockDate0, timeZone0);
      Minute minute0 = new Minute(100, hour0);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-1646));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Float float0 = new Float((-3848.988));
      timeSeries0.add((RegularTimePeriod) day0, (Number) float0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3373L);
      Minute minute0 = new Minute(mockDate0);
      Day day0 = minute0.getDay();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      boolean boolean0 = timeSeries0.equals("");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      MockDate mockDate0 = new MockDate(1, 1, 1, 2024, 1);
      Second second0 = new Second(mockDate0, day0.DEFAULT_TIME_ZONE);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) second0, (RegularTimePeriod) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'end' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Second second0 = new Second();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, (String) null, "RNfP: 9|", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) second0, (RegularTimePeriod) second0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockDate mockDate0 = new MockDate(64, 64, 64);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(mockDate0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(Integer.MAX_VALUE, 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1550L);
      Month month0 = new Month(mockDate0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "rw=sDJ\"?SV", "z", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-1131), 12);
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<DefaultTableModel> class0 = DefaultTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 1187);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(11, (-706));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      TimeZone timeZone0 = TimeZone.getDefault();
      Year year0 = new Year(date0, timeZone0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(27, 27);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 27, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Year year0 = new Year();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      timeSeries0.delete((RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<DefaultTableModel> class0 = DefaultTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries("Null 'item' argument.", "Null 'item' argument.", ") is not recognised.", class0);
      timeSeries0.removeAgedItems(1L, false);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.next();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, "TableOrder.BY_COLUMN", "TableOrder.BY_COLUMN", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(regularTimePeriod0, (double) 9223372036854775807L);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (double) Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Float float0 = new Float((-3848.988));
      timeSeries0.add((RegularTimePeriod) day0, (Number) float0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) float0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Float float0 = new Float((-3848.988));
      timeSeries0.add((RegularTimePeriod) day0, (Number) float0);
      timeSeries0.update((RegularTimePeriod) day0, (Number) float0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<DefaultTableModel> class0 = DefaultTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) hour0, (Number) 23);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<DefaultTableModel> class0 = DefaultTableModel.class;
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
  public void test40()  throws Throwable  {
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond(0, second0);
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) second0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries("Null 'item' argument.", "Null 'item' argument.", ") is not recognised.", class0);
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
  public void test42()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "TableOrder.BY_COLUMN", "TableOrder.BY_COLUMN", class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      timeSeries0.setMaximumItemAge(9223372036854775807L);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(date0, 4L, 4L, 4L, 4L, 4L);
      Class<DefaultTableModel> class0 = DefaultTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(oHLCDataItem0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-384));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      timeSeries0.setMaximumItemCount(1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "TableOrder.BY_COLUMN", "TableOrder.BY_COLUMN", class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) millisecond0, (double) 999);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Millisecond, but the TimeSeries is expecting an instance of java.lang.Object.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.setRangeDescription((String) null);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Float float0 = new Float((-3848.988));
      timeSeries0.add((RegularTimePeriod) day0, (Number) float0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) day0, (-3848.988), true);
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period 14-February-2014 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (-3848.988), true);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-1984), (-1275));
      Month month0 = new Month(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "Domain", "Domain", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-1275));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<String> class0 = String.class;
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
  public void test57()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<DefaultTableModel> class0 = DefaultTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Minute minute0 = new Minute();
      Day day0 = minute0.getDay();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "Time", "Time", class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-673L));
      Week week0 = new Week(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.update(2, (Number) week0.FIRST_WEEK_IN_YEAR);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Year year0 = new Year();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      Long long0 = new Long(4L);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) year0, (Number) long0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of org.jfree.data.time.TimeSeriesDataItem.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      timeSeries0.setDomainDescription("#+0x%_@z,?");
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Second second0 = new Second();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, (String) null, "RNfP: 9|", class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}