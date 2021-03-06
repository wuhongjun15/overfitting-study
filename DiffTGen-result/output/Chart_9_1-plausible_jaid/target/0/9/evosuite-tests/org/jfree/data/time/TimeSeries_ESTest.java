/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:30:14 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JPopupMenu;
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
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.SpreadsheetDate;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2274);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(3, 9999);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      timeSeries0.setMaximumItemCount(813);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate(37, 37, 29);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Month month0 = new Month(mockDate0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(month0);
      Double double0 = new Double(0.0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (Number) double0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2471), (-2471), 9, 9, 4411, (-2471));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "org.jfree.data.statistics.HistogramType", "OU>E9Xja6#UY];hqP8^", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (double) 9);
      int int0 = timeSeries0.getIndex(fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3, 3, 3);
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(mockDate0, 0.0, 1.5, 3, 2381.361523611884, (-482.42));
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(oHLCDataItem0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((-1237L), true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate(302, 302, 0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(302, "\"C:r#\fe!)p");
      Locale locale0 = Locale.forLanguageTag("aWP~vTrc0x");
      Week week0 = new Week(mockDate0, simpleTimeZone0, locale0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "Null 'period' argument.", "\"C:r#\fe!)p", class0);
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
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(date0, date0);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1801), (-805));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1801
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Week week0 = new Week(1535, 1535);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "#I'P>/M+55", "#I'P>/M+55", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) week0, (RegularTimePeriod) week0);
      } catch(IllegalArgumentException e) {
         //
         // Year constructor: year (1535) outside valid range.
         //
         verifyException("org.jfree.data.time.Year", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2274);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, class0);
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
  public void test09()  throws Throwable  {
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "Om&}LiY2jlJt^_`", "koKUR5/0b", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
      Minute minute0 = new Minute();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "jul_1&j%0", "jul_1&j%0", class0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (Number) hour0.FIRST_HOUR_IN_DAY);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-898L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      int int0 = timeSeries0.getIndex(fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, (-2873.5354779), false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
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
  public void test17()  throws Throwable  {
      MockDate mockDate0 = new MockDate(37, 37, 29);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Month month0 = new Month(mockDate0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(month0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<InputStream> class0 = InputStream.class;
      TimeSeries timeSeries0 = new TimeSeries("jul_1&j%0", "jul_1&j%0", "jul_1&j%0", class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      Class<Integer> class1 = Integer.class;
      TimeSeries timeSeries1 = new TimeSeries(mockDate0, class1);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      boolean boolean0 = timeSeries0.equals(class0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.next();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "Requires start <= end.", "", class0);
      Float float0 = new Float(612.4831518);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(regularTimePeriod0, (Number) float0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) fixedMillisecond0, (RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-1.0), (-1.0));
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, class0);
      Week week0 = new Week();
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) week0, (RegularTimePeriod) week0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockDate mockDate0 = new MockDate(37, 37, 29);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Month month0 = new Month(mockDate0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(1, (-2091));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries("permitted.  Try using the addOrUpdate() method.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(1, 112);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "Requires start <= end.", "", class0);
      Float float0 = new Float(612.4831518);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) float0);
      timeSeries0.delete((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "Requires start <= end.", "", class0);
      timeSeries0.delete((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute((-1), hour0);
      Second second0 = new Second(3, minute0);
      Millisecond millisecond0 = new Millisecond((-1505), second0);
      Class<InputStream> class0 = InputStream.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "]", "", class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      timeSeries0.removeAgedItems((long) 59, false);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(121, year0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) week0, (Number) 1);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Day day0 = new Day(serialDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
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
  public void test33()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "Negative 'maximum' argument.", class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2274);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<JPopupMenu> class0 = JPopupMenu.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      timeSeries0.setMaximumItemAge(24L);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond((-416), second0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-153));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.setMaximumItemCount(0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<InputStream> class0 = InputStream.class;
      TimeSeries timeSeries0 = new TimeSeries("jul_1&j%0", "jul_1&j%0", "jul_1&j%0", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) year0, (-46.49494));
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      Day day0 = new Day();
      Hour hour0 = new Hour(695, day0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (Number) 23);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of java.lang.Integer.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Year year0 = new Year();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      timeSeries0.setRangeDescription("*owpS.QLcR$m");
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) quarter0, (Number) 4, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Quarter, but the TimeSeries is expecting an instance of java.util.Date.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) hour0, (Number) 23);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) fixedMillisecond0, 1822.9391858);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) year0, (-46.49494));
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-2744));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2497, 2497, (-1453), 2497, (-1453));
      Hour hour0 = new Hour(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
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
  public void test49()  throws Throwable  {
      MockDate mockDate0 = new MockDate(430L);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(328, "");
      Second second0 = new Second(mockDate0, simpleTimeZone0);
      Millisecond millisecond0 = new Millisecond(0, second0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "", "", class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<JPopupMenu> class0 = JPopupMenu.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) hour0, (Number) 23);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, 1.0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Year year0 = new Year();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.update(1501, (Number) 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1501, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) quarter0, (Number) quarter0.FIRST_QUARTER);
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
  public void test55()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.setDomainDescription("4?.");
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2471), (-2471), 9, 9, 4411, (-2471));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "org.jfree.data.statistics.HistogramType", "OU>E9Xja6#UY];hqP8^", class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
