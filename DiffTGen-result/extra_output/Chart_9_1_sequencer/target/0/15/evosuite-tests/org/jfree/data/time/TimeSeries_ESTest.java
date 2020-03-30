/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 09:29:12 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.PropertyChangeEvent;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLayeredPane;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.util.MockCalendar;
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
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.SpreadsheetDate;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Minute minute0 = new Minute();
      Day day0 = minute0.getDay();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", ">p/RdGWpQV", class0);
      Calendar calendar0 = MockCalendar.getInstance(day0.DEFAULT_TIME_ZONE);
      LocalDate localDate0 = MockLocalDate.now();
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(localDate0, "", timeSeries0, calendar0);
      String string0 = propertyChangeEvent0.toString();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(0, 59);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2497), 0, (-406), 3262, (-2497), 182);
      Week week0 = new Week(mockDate0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "java.util.TimeZone", "org.jfree.data.general.Series", class0);
      timeSeries0.setMaximumItemCount(0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Month month0 = new Month();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (-1.0));
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.update(344, (Number) null);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 344, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Year year0 = new Year();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "ict/4x6c+s{`nq>^qh", "UA%gI)Irm'E|A", class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((long) (-262), true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 935, 0, 935, 0, 0);
      Second second0 = new Second(mockDate0);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "KLaLkXz@{_+#;nW2J1U", "KLaLkXz@{_+#;nW2J1U", class0);
      timeSeries0.data = null;
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-729));
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
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-60));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 29, 1640, 29, 29, 29);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Locale locale0 = Locale.GERMANY;
      Week week0 = new Week(mockDate0, zoneInfo0, locale0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
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
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate(120, 120, 721, 0, 721, 120);
      TimeZone timeZone0 = TimeZone.getDefault();
      Quarter quarter0 = new Quarter(mockDate0, timeZone0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "JQ3d~$#Z|Vk.<5R'?", "JQ3d~$#Z|Vk.<5R'?", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(4);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minute minute0 = new Minute();
      Day day0 = minute0.getDay();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", ">p/RdGWpQV", class0);
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
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(" Z", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, (Number) 59);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
      Class<DefaultTableModel> class0 = DefaultTableModel.class;
      MockDate mockDate0 = new MockDate(0L);
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, ";|7U8F75.A}iF", "", class0);
      Day day0 = new Day(mockDate0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) day0, (double) 6);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Day, but the TimeSeries is expecting an instance of javax.swing.table.DefaultTableModel.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "W)*G& B'j38", "W)*G& B'j38", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
      Minute minute0 = new Minute();
      Day day0 = minute0.getDay();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", ">p/RdGWpQV", class0);
      timeSeries0.removeAgedItems(true);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate(125, 125, 125, 125, 125, 0);
      TimeZone timeZone0 = TimeZone.getDefault();
      Minute minute0 = new Minute(mockDate0, timeZone0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) minute0, (Number) 59);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
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
  public void test19()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, "` 7#!", "` 7#!", class0);
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
  public void test20()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-13), (-13), (-13));
      Year year0 = new Year(mockDate0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      int int0 = timeSeries0.getIndex(year0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochMilli(53L);
      Date date0 = Date.from(instant0);
      Millisecond millisecond0 = new Millisecond(date0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "", "", class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockDate mockDate0 = new MockDate(9223372036854775807L);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) quarter0, (Number) 4, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Quarter, but the TimeSeries is expecting an instance of java.util.SimpleTimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Millisecond millisecond0 = new Millisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod((-218));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Day day0 = new Day();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-797));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Second second0 = new Second();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
      Class<DefaultTableModel> class0 = DefaultTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, ";|7U8F75.A}iF", "", class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Year year0 = new Year();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, (String) null, "", class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      Object object0 = timeSeries0.clone();
      boolean boolean0 = timeSeries0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      boolean boolean0 = timeSeries0.equals(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, "` 7#!", "` 7#!", class0);
      DefaultListCellRenderer defaultListCellRenderer0 = new DefaultListCellRenderer();
      boolean boolean0 = timeSeries0.equals(defaultListCellRenderer0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Minute minute0 = new Minute();
      Day day0 = minute0.getDay();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) day0, (RegularTimePeriod) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'end' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(2);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, class0);
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
  public void test33()  throws Throwable  {
      MockDate mockDate0 = new MockDate(920, 0, 920, 0, 0);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) millisecond0, (RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(2);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(3, 2);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(421);
      Day day0 = new Day(serialDate0);
      Hour hour0 = new Hour(0, day0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(2136, 2958465);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(53, (-1837));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-13), (-13), (-13));
      Year year0 = new Year(mockDate0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) year0, 1.7976931348623157E308);
      timeSeries0.delete((RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      timeSeries0.delete((RegularTimePeriod) week0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Second second0 = new Second();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "", "createInstance", class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, (-1981), 2, (-1981), 2451);
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, (-1981), 0.0, (-1981), 0.0, 2);
      TimeSeries timeSeries0 = new TimeSeries(oHLCDataItem0);
      timeSeries0.removeAgedItems((-3507L), true);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "Nf/`WBvOzxgxV", "Nf/`WBvOzxgxV", class0);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (-16.50199563736851));
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockDate mockDate0 = new MockDate(125, 125, 125, 125, 125, 0);
      TimeZone timeZone0 = TimeZone.getDefault();
      Minute minute0 = new Minute(mockDate0, timeZone0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) minute0, (Number) 59);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (Number) 0);
      Quarter quarter0 = new Quarter(mockDate0, timeZone0);
      timeSeries0.update((RegularTimePeriod) quarter0, (Number) 4);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) fixedMillisecond0, (Number) integer0);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MockDate mockDate0 = new MockDate(120, 120, 721, 0, 721, 120);
      TimeZone timeZone0 = TimeZone.getDefault();
      Quarter quarter0 = new Quarter(mockDate0, timeZone0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "JQ3d~$#Z|Vk.<5R'?", "JQ3d~$#Z|Vk.<5R'?", class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) quarter0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
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
  public void test46()  throws Throwable  {
      Week week0 = new Week(0, 0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Minute minute0 = new Minute();
      Day day0 = minute0.getDay();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", ">p/RdGWpQV", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) day0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MockDate mockDate0 = new MockDate(87, 87, (-1755), 754, (-1755), (-1755));
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(serialDate0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-1755));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      timeSeries0.setMaximumItemAge(1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
      Class<DefaultTableModel> class0 = DefaultTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, ";|7U8F75.A}iF", "", class0);
      timeSeries0.setMaximumItemCount(12);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", "", class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, (-1.7976931348623157E308));
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, "` 7#!", "` 7#!", class0);
      timeSeries0.setRangeDescription("` 7#!");
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 2384, 2384, 2384, 0, 0);
      Quarter quarter0 = new Quarter(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) quarter0, (Number) 1);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Quarter, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(23, 23);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 23, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Year year0 = new Year(mockDate0, zoneInfo0);
      Week week0 = new Week(0, year0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "_pn.l;vB8]=fqo-xpT", "_pn.l;vB8]=fqo-xpT", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, 0.0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of java.lang.Object.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(53);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 53, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 31, 29, 31, 0, 29);
      Day day0 = new Day(mockDate0);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
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
  public void test61()  throws Throwable  {
      MockDate mockDate0 = new MockDate(920, 0, 920, 0, 0);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Minute minute0 = new Minute();
      Day day0 = minute0.getDay();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "", ">p/RdGWpQV", class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 29, 1640, 29, 29, 29);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Locale locale0 = Locale.GERMANY;
      Week week0 = new Week(mockDate0, zoneInfo0, locale0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Long long0 = new Long(479L);
      XYDataItem xYDataItem0 = new XYDataItem((Number) long0, (Number) long0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "Category", (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-1261), (Number) long0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(0L, 0L);
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, "8Gp90l1G<=~x}b^?G", "Null 'period' argument.", class0);
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
      MockDate mockDate0 = new MockDate((-13), (-13), (-13));
      Year year0 = new Year(mockDate0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      timeSeries0.setDomainDescription("Requires start >= 0.");
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Second second0 = new Second();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "", "createInstance", class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
