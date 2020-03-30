/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 14:01:01 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Window;
import java.text.ParsePosition;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
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
import org.jfree.data.time.SimpleTimePeriod;
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
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(147);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, class0);
      Month month0 = new Month();
      RegularTimePeriod regularTimePeriod0 = month0.previous();
      TimeSeries timeSeries1 = timeSeries0.createCopy(regularTimePeriod0, (RegularTimePeriod) month0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "org.jfree.data.gantt.Task", "org.jfree.data.gantt.Task", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate(53, 53, 53, 0, 53, 53);
      Month month0 = new Month(mockDate0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "V:4mm3tfE]<e* 6YBa", "V:4mm3tfE]<e* 6YBa", class0);
      timeSeries0.setMaximumItemAge(0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1169, 0, 1285, 1014, 0, 1169);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Year year0 = new Year(mockDate0, zoneInfo0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      timeSeries0.setMaximumItemCount(1285);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "\"T#B/5egR(.!_", "\"T#B/5egR(.!_", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 3714.1912986478937);
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getNextTimePeriod();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Second> class0 = Second.class;
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, (String) null, "Ltl0- ", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (Number) 999);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Window.Type window_Type0 = Window.Type.UTILITY;
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(window_Type0, (String) null, "5+4>x;JU%zUVp0TA>:4", class0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-1344L), (-1344L));
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) null, (Number) 0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate(926L);
      Second second0 = new Second(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.update(Integer.MAX_VALUE, (Number) 59);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2147483647, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "org.jfree.data.gantt.Task", "org.jfree.data.gantt.Task", class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((-57L), false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, 2, 3716);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-307));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
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
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-189.859398124117), 0.0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-3378));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(147);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-4), 1);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "K9QcQxuQ31ZPnK#F", "8'{ni_tgjAEGl", class0);
      Stack<TimeZone> stack0 = new Stack<TimeZone>();
      timeSeries0.data = (List) stack0;
      boolean boolean0 = stack0.add(minute0.DEFAULT_TIME_ZONE);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) minute0, (RegularTimePeriod) minute0);
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(fixedMillisecond0, (Number) null);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
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
  public void test16()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "\"T#B/5egR(.!_", "\"T#B/5egR(.!_", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) fixedMillisecond0, (Number) null, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of java.lang.String.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getTimeZone("h>Ls:&OHSHQKR/eI81");
      Week week0 = new Week(mockDate0, timeZone0);
      Class<Window.Type> class0 = Window.Type.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "hi;rwo]`&].", "Requires start on or before end.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, 2724.188322388, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of java.awt.Window$Type.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate(872, 0, 0);
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(mockDate0, mockDate0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, "7};_N5;/RdlyDso", "Yrpjo", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, (double) 23, false);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "", "K@G&\"0{DdLT&4K!", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-1344L), (-1344L));
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Week week0 = new Week();
      Class<Quarter> class0 = Quarter.class;
      Class<TimeZone> class1 = TimeZone.class;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      ParsePosition parsePosition0 = new ParsePosition(53);
      Date date0 = mockSimpleDateFormat0.parse("Time", parsePosition0);
      RegularTimePeriod regularTimePeriod0 = RegularTimePeriod.createInstance(class0, date0, week0.DEFAULT_TIME_ZONE);
      TimeSeries timeSeries0 = new TimeSeries(week0, class1);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, (-2151.58300534218));
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Quarter, but the TimeSeries is expecting an instance of java.util.TimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Week week0 = new Week();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      ParsePosition parsePosition0 = new ParsePosition(53);
      Date date0 = mockSimpleDateFormat0.parse("Time", parsePosition0);
      RegularTimePeriod regularTimePeriod0 = RegularTimePeriod.createInstance(class0, date0, week0.DEFAULT_TIME_ZONE);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, (-2151.58300534218));
      timeSeries0.add(timeSeriesDataItem0, false);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1169, 0, 1285, 1014, 0, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Year year0 = new Year(mockDate0, zoneInfo0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      int int0 = timeSeries0.getIndex(year0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-4185L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(Integer.MAX_VALUE);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2147483647, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
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
  public void test28()  throws Throwable  {
      Class<Second> class0 = Second.class;
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, (String) null, "Ltl0- ", class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Month month0 = new Month();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-1042L), 416L);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, "", "", class0);
      Class<Integer> class1 = Integer.class;
      TimeSeries timeSeries1 = new TimeSeries("", "", "", class1);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Week week0 = new Week();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      ParsePosition parsePosition0 = new ParsePosition(53);
      Date date0 = mockSimpleDateFormat0.parse("Time", parsePosition0);
      RegularTimePeriod regularTimePeriod0 = RegularTimePeriod.createInstance(class0, date0, week0.DEFAULT_TIME_ZONE);
      boolean boolean0 = timeSeries0.equals(regularTimePeriod0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "org.jfree.data.gantt.Task", "org.jfree.data.gantt.Task", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1169, 0, 1285, 1014, 0, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Year year0 = new Year(mockDate0, zoneInfo0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(2319, 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Month month0 = new Month();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(Integer.MAX_VALUE, Integer.MAX_VALUE);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2147483647, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, class0);
      Minute minute0 = new Minute(mockDate0);
      timeSeries0.delete((RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1169, 0, 1285, 1014, 0, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Year year0 = new Year(mockDate0, zoneInfo0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Week week0 = new Week();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      timeSeries0.removeAgedItems(1L, true);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(434);
      Date date0 = spreadsheetDate0.toDate();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Day day0 = new Day(date0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.setMaximumItemCount(0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) 2);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0);
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, class0);
      Minute minute0 = new Minute(mockDate0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) minute0, (Number) (-1));
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(1550.396554598549, (-1.0));
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
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
  public void test41()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "org.jfree.data.gantt.Task", "org.jfree.data.gantt.Task", class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(719);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, class0);
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
      Week week0 = new Week();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "\"T#B/5egR(.!_", "\"T#B/5egR(.!_", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 3714.1912986478937);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<Second> class0 = Second.class;
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, (String) null, "Ltl0- ", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (Number) 999);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem((RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "Z^Jj[sXlP4n[&;", "Z^Jj[sXlP4n[&;", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "Z^Jj[sXlP4n[&;", "Z^Jj[sXlP4n[&;", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-1306L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Month month0 = new Month();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      timeSeries0.setMaximumItemAge(60L);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Week week0 = new Week();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-1444));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "\"T#B/5egR(.!_", "\"T#B/5egR(.!_", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1169, 0, 1285, 1014, 0, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Year year0 = new Year(mockDate0, zoneInfo0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week((-3391), year0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "5u'`)?AM\",j", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (Number) 1);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of java.lang.Integer.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Locale locale0 = Locale.KOREAN;
      Week week0 = new Week(mockDate0, zoneInfo0, locale0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (double) 53);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.time.Minute.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "org.jfree.data.gantt.Task", "org.jfree.data.gantt.Task", class0);
      timeSeries0.setRangeDescription("org.jfree.data.gantt.Task");
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MockDate mockDate0 = new MockDate(872, 0, 0);
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(mockDate0, mockDate0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, "7};_N5;/RdlyDso", "Yrpjo", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, (Number) 23, false);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MockDate mockDate0 = new MockDate(872, 0, 0);
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(mockDate0, mockDate0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, "7};_N5;/RdlyDso", "Yrpjo", class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Week week0 = new Week();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      ParsePosition parsePosition0 = new ParsePosition(53);
      Date date0 = mockSimpleDateFormat0.parse("Time", parsePosition0);
      RegularTimePeriod regularTimePeriod0 = RegularTimePeriod.createInstance(class0, date0, week0.DEFAULT_TIME_ZONE);
      timeSeries0.add(regularTimePeriod0, (-48.47588403178796), false);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(serialDate0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(4416);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4416, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "\"T#B/5egR(.!_", "\"T#B/5egR(.!_", class0);
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
      MockDate mockDate0 = new MockDate(1169, 0, 1285, 1014, 0, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Year year0 = new Year(mockDate0, zoneInfo0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "K9QcQxuQ31ZPnK#F", "8'{ni_tgjAEGl", class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3101L);
      Week week0 = new Week(mockDate0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "", class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Week week0 = new Week((-5502), (-5502));
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "Tx^X($\"I2F;[cONziPa", "f_+\"Qro&", class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-5502), (Number) 53);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Month month0 = new Month();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) month0, (double) Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.Minute.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "org.jfree.data.gantt.Task", "org.jfree.data.gantt.Task", class0);
      timeSeries0.setDomainDescription("org.jfree.data.gantt.Task");
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
