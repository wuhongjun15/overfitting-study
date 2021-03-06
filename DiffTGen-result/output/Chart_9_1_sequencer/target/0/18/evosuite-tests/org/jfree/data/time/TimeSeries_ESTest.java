/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:32:31 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockInstant;
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
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.SpreadsheetDate;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYDatasetTableModel;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Week week0 = new Week();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      timeSeries0.setMaximumItemAge(53);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries("", "+Z/yb", "", class0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1);
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) integer0);
      timeSeries0.setMaximumItemCount(1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, "E`qEPpd8xQz/e", "", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, Double.NEGATIVE_INFINITY);
      int int0 = timeSeries0.getIndex(second0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond(1, 4212, 4212, 643, 1, 1, 4212);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "org.jfree.data.general.SeriesChangeListener", "org.jfree.data.general.SeriesChangeListener", class0);
      timeSeries0.setDomainDescription("");
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Week week0 = new Week(0, 0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "2cHt*htx", "2cHt*htx", class0);
      timeSeries0.setMaximumItemAge(0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries("org.jfree.data.general.DatasetChangeEvent", class0);
      Minute minute0 = Minute.parseMinute("Requires start on or before end.");
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) null, (Number) minute0.FIRST_MINUTE_IN_HOUR);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(2534L, 2534L);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      Float float0 = new Float((float) 2534L);
      // Undeclared exception!
      try { 
        timeSeries0.update((-1), (Number) float0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-757L), (-1088L));
      Date date0 = Date.from(instant0);
      Millisecond millisecond0 = new Millisecond(date0);
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((-1088L), false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.data = null;
      // Undeclared exception!
      try { 
        timeSeries0.getValue((RegularTimePeriod) week0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
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
  public void test11()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "TimeSeriesDataset.addValue(): series #", (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(1);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(94);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 94, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Day day0 = new Day();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "_<e", (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(0, 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, (String) null, "(I~7lpekYs_5ke", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) quarter0, (Number) 4);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Quarter, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Week week0 = new Week(mockDate0);
      Class<JTabbedPane> class0 = JTabbedPane.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, (String) null, "3% [grC", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, 19.489195373328, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of javax.swing.JTabbedPane.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "n~t@+Lk'Fj<z\"w", "n~t@+Lk'Fj<z\"w", class0);
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
      Week week0 = new Week(0, 0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "2cHt*htx", "2cHt*htx", class0);
      MockDate mockDate0 = new MockDate(1);
      Second second0 = new Second(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, (Number) 53);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "2eY1ArQ>;bz.T,QW", "2eY1ArQ>;bz.T,QW", class0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      Minute minute0 = second0.getMinute();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, Double.NEGATIVE_INFINITY);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (Number) 59);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, (String) null, "(I~7lpekYs_5ke", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) quarter0, (Number) 4);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Quarter, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-407L));
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.FRANCE;
      Week week0 = new Week(mockDate0, timeZone0, locale0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
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
  public void test24()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      int int0 = timeSeries0.getIndex(quarter0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("");
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod((-521));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      XYDataItem xYDataItem0 = new XYDataItem((Number) integer0, (Number) integer0);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-6));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeSeries timeSeries0 = new TimeSeries(mockDate0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "2eY1ArQ>;bz.T,QW", "2eY1ArQ>;bz.T,QW", class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      boolean boolean0 = timeSeries0.equals(class0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) second0, (RegularTimePeriod) second0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2958465);
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0);
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
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(53, 4434);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1214L);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(3, "bins");
      Hour hour0 = new Hour(mockDate0, simpleTimeZone0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(3, (-521));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond(1, 4212, 4212, 643, 1, 1, 4212);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "org.jfree.data.general.SeriesChangeListener", "org.jfree.data.general.SeriesChangeListener", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-868), 999);
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(269, 4);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(3606);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1755), (-1373));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "2eY1ArQ>;bz.T,QW", "2eY1ArQ>;bz.T,QW", class0);
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) integer0);
      timeSeries0.delete((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Hour hour0 = new Hour(date0, timeZone0);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.delete((RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Float float0 = new Float(0.0);
      XYDataItem xYDataItem0 = new XYDataItem((Number) float0, (Number) float0);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.removeAgedItems((-1541L), true);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, Double.NEGATIVE_INFINITY);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, 0.0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-1680L));
      Date date0 = Date.from(instant0);
      Year year0 = new Year(date0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(0, year0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) year0, (Number) 1);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
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
  public void test45()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getTimeZone("'9z");
      Hour hour0 = new Hour(mockDate0, timeZone0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "'9z", "'9z", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Hour hour0 = new Hour(date0, timeZone0);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-1666.21671958), 0.0);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Hour hour0 = new Hour(date0, timeZone0);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "2eY1ArQ>;bz.T,QW", "2eY1ArQ>;bz.T,QW", class0);
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) integer0);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond(1, 4212, 4212, 643, 1, 1, 4212);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "org.jfree.data.general.SeriesChangeListener", "org.jfree.data.general.SeriesChangeListener", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockDate mockDate0 = new MockDate(59, 59, 59, 59, 3293);
      Day day0 = new Day(mockDate0);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "permitted.  Try using the addOrUpdate() method.", "H#^oUI[ Jr:.&d@wY", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-666L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "2eY1ArQ>;bz.T,QW", "2eY1ArQ>;bz.T,QW", class0);
      timeSeries0.setMaximumItemAge(0L);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, (RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-1680L));
      Date date0 = Date.from(instant0);
      Year year0 = new Year(date0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-2030));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond(1, 4212, 4212, 643, 1, 1, 4212);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "org.jfree.data.general.SeriesChangeListener", "org.jfree.data.general.SeriesChangeListener", class0);
      timeSeries0.setMaximumItemCount(297);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "2eY1ArQ>;bz.T,QW", "2eY1ArQ>;bz.T,QW", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) second0, (Number) 0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Second, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-3938L));
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) fixedMillisecond0, (-2771.19438371));
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Week.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond(1, 4212, 4212, 643, 1, 1, 4212);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "org.jfree.data.general.SeriesChangeListener", "org.jfree.data.general.SeriesChangeListener", class0);
      timeSeries0.setRangeDescription("[ZIF5W@)");
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Week week0 = new Week(0, 0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "2cHt*htx", "2cHt*htx", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (Number) 0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.time.Hour.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "2eY1ArQ>;bz.T,QW", "2eY1ArQ>;bz.T,QW", class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Float float0 = new Float(0.0);
      XYDataItem xYDataItem0 = new XYDataItem((Number) float0, (Number) float0);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, 0.0, true);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Year year0 = new Year(1919);
      Week week0 = new Week(1919, year0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-3726));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-757L), (-1088L));
      Date date0 = Date.from(instant0);
      Millisecond millisecond0 = new Millisecond(date0);
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
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
  public void test64()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "2eY1ArQ>;bz.T,QW", "2eY1ArQ>;bz.T,QW", class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, (String) null, "(I~7lpekYs_5ke", class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "2eY1ArQ>;bz.T,QW", "2eY1ArQ>;bz.T,QW", class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1066);
      Date date0 = spreadsheetDate0.toDate();
      Year year0 = new Year(date0);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "", "", class0);
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
  public void test68()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "2eY1ArQ>;bz.T,QW", "2eY1ArQ>;bz.T,QW", class0);
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) integer0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, (RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Hour hour0 = new Hour(date0, timeZone0);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
