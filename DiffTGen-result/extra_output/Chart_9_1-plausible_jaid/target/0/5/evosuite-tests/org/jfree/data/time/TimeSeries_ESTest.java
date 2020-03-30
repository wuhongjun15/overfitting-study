/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:27:12 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JDialog;
import javax.swing.JLayeredPane;
import javax.swing.table.DefaultTableModel;
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
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.next();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, regularTimePeriod0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Year year0 = new Year();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      timeSeries0.setMaximumItemCount(3);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Day day0 = new Day();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, 0.0);
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getNextTimePeriod();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Day day0 = new Day();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, 0.0);
      int int0 = timeSeries0.getIndex(day0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<DefaultTableModel> class0 = DefaultTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, (String) null, (String) null, class0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) null, (Number) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 29, 91);
      Hour hour0 = new Hour(mockDate0);
      Minute minute0 = new Minute((-4407), hour0);
      Day day0 = minute0.getDay();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((long) 59, false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Minute minute0 = new Minute(date0);
      Second second0 = new Second(4, minute0);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "#]L9nC`Ux<TucKr3?*", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-533));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
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
  public void test09()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "", "org.jfree.data.xy.DefaultIntervalXYDataset", class0);
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
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 243, 3, (-651), 0);
      Day day0 = new Day(mockDate0);
      Hour hour0 = new Hour(0, day0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, (String) null, (String) null, class0);
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
  public void test11()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, "7{\"m<DbdA6", "7{\"m<DbdA6", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(0, 114);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Week week0 = new Week();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "*e5ysDV+Y~SV[Yo8", "", class0);
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
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries("Value", "", "Value", class0);
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, (Number) integer0, false);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Week week0 = new Week((-1343), (-1343));
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "X0VV&U0r:YvaWab2", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (double) (-1343));
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of java.lang.String.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "Cannot add null series.", "Cannot add null series.", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Object> class0 = Object.class;
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
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "", class0);
      timeSeries0.removeAgedItems(true);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) minute0, (Number) 59);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Day day0 = new Day();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      int int0 = timeSeries0.getIndex(day0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod((-454));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Hour hour0 = new Hour(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-229));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Week week0 = new Week();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Year year0 = new Year();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 708, 708);
      TimeZone timeZone0 = TimeZone.getTimeZone("&");
      Hour hour0 = new Hour(mockDate0, timeZone0);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "&", "$agKpLsS", class0);
      boolean boolean0 = timeSeries0.equals("$agKpLsS");
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Day day0 = new Day();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(serialDate0);
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
  public void test30()  throws Throwable  {
      Month month0 = new Month();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(2, 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Day day0 = new Day();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-2172), 2);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockDate mockDate0 = new MockDate(805, 805, 805, 2096, 805);
      Year year0 = new Year(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(year0);
      timeSeries0.delete((RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 708, 708);
      TimeZone timeZone0 = TimeZone.getTimeZone("&");
      Hour hour0 = new Hour(mockDate0, timeZone0);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "&", "$agKpLsS", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Day day0 = new Day();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "", class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      Quarter quarter0 = new Quarter(date0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (Number) 4);
      timeSeries0.removeAgedItems((long) 1, false);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Day day0 = new Day();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "", class0);
      timeSeries0.removeAgedItems((-1273L), true);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "sxf2N1eSod:6/!!q", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (Number) 999);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (double) 0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, class0);
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
  public void test39()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, ",", ",", class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) millisecond0, (Number) 0);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockDate mockDate0 = new MockDate(152, 152, 0, 0, 795, 0);
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.JAPANESE;
      Week week0 = new Week(mockDate0, timeZone0, locale0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "}koRp]'ok?NE", "iw^", class0);
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
      Millisecond millisecond0 = new Millisecond();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "RN", "", class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Year year0 = new Year();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, ", but the TimeSeries is expecting an instance of ", "Null 'locale' argument.", class0);
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
  public void test43()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      Quarter quarter0 = new Quarter(date0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (Number) 4);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries1 = new TimeSeries(quarter0, "\"AI^c!g3MosHK", "\"AI^c!g3MosHK", class0);
      TimeSeries timeSeries2 = timeSeries1.addAndOrUpdate(timeSeries0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Day day0 = new Day();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "J#", "J#", class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Week week0 = new Week(0, 0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-9223372036854775808L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      timeSeries0.setMaximumItemAge(4589L);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1245L);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "TimeSeries.update(TimePeriod, Number):  period does not exist.", "5jV}", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-2634));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Week week0 = new Week();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      timeSeries0.setMaximumItemCount(0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-494), (-2415), (-494), 0, (-494));
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Year year0 = new Year(date0);
      TimeSeries timeSeries0 = new TimeSeries(year0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Day day0 = new Day();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", "", class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) month0, (Number) null);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "sxf2N1eSod:6/!!q", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, 628.3);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(1490, year0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "", class0);
      timeSeries0.setRangeDescription("");
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
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
  public void test56()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "", "org.jfree.data.xy.DefaultIntervalXYDataset", class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Day day0 = new Day();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "J#", "J#", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) day0, (double) (-1), true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Day, but the TimeSeries is expecting an instance of java.util.TimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
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
  public void test59()  throws Throwable  {
      Day day0 = new Day();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
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
      Millisecond millisecond0 = new Millisecond();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "", "org.jfree.data.xy.DefaultIntervalXYDataset", class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      MockDate mockDate0 = new MockDate(43, 43, 43, 0, (-2008), 1519);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(43, "TO?sO");
      Week week0 = new Week(mockDate0, simpleTimeZone0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (-3446.4689202877253));
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-2865), (Number) 0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Week week0 = new Week((-609), 3);
      Class<JDialog> class0 = JDialog.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "w", (String) null, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (-2268.32));
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of javax.swing.JDialog.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, ",", ",", class0);
      timeSeries0.setDomainDescription("");
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1L));
      TimeSeries timeSeries0 = new TimeSeries(mockDate0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
