/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:23:54 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import javax.swing.JColorChooser;
import javax.swing.JLayeredPane;
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
import org.jfree.data.time.SpreadsheetDate;
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
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(650);
      Date date0 = spreadsheetDate0.toDate();
      Month month0 = new Month(date0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "", "Pp=jR^l$`-T1ud#?wIm", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(0, 1900);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.setMaximumItemAge(1052L);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Day day0 = new Day();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "wPpsdCoB/Jkp", "wPpsdCoB/Jkp", class0);
      timeSeries0.add((RegularTimePeriod) day0, 1.5);
      Float float0 = new Float(0.0);
      timeSeries0.update(0, (Number) float0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Month month0 = new Month(mockDate0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(month0);
      Day day0 = new Day(mockDate0, month0.DEFAULT_TIME_ZONE);
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      timeSeries0.add((RegularTimePeriod) day0, (Number) integer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, (String) null, (String) null, class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, 0.0);
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getNextTimePeriod();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "", "Negative 'maximum' argument.", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (Number) 59);
      int int0 = timeSeries0.getIndex(minute0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, 0.0);
      MockDate mockDate0 = new MockDate(3707L);
      Millisecond millisecond0 = new Millisecond(mockDate0, hour0.DEFAULT_TIME_ZONE);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (double) 999);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.update(23, (Number) 23);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 23, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Class<JColorChooser> class0 = JColorChooser.class;
      timeSeries0.timePeriodClass = class0;
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((long) Integer.MAX_VALUE, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, (String) null, (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-6));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Week week0 = new Week();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "NOID", "NOID", class0);
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
      MockDate mockDate0 = new MockDate(44, 44, 44);
      TimeZone timeZone0 = TimeZone.getTimeZone("+*`-)[0x\u0001");
      Millisecond millisecond0 = new Millisecond(mockDate0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod((-1491));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 29, 29, 29, 29);
      Month month0 = new Month(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(29, 29);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 29, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
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
  public void test15()  throws Throwable  {
      Second second0 = new Second();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "))Te;i", "))Te;i", class0);
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
      Class<Millisecond> class0 = Millisecond.class;
      Week week0 = new Week(2145493282, 1);
      TimeSeries timeSeries0 = new TimeSeries(week0, " but the series already contains an observation", " but the series already contains an observation", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (Number) 1);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.time.Millisecond.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "Requires start on or before end.", "", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Week> class0 = Week.class;
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
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1931), (-1931));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1931
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      timeSeries0.removeAgedItems(true);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Second second0 = new Second();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) second0, (Number) 0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Second, but the TimeSeries is expecting an instance of org.jfree.data.time.Millisecond.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, class0);
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
  public void test24()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "", "Negative 'maximum' argument.", class0);
      int int0 = timeSeries0.getIndex(minute0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Class class0 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "%a>r,%tZj4-?`8s", "%a>r,%tZj4-?`8s", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, 2149.0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of java.lang.Integer.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Week week0 = new Week();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "nD$n8zo5)tLctQd", (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(496);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 496, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries("nD$nzo5)tLtQd", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(53);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 53, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries("M`bD", class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "", "Negative 'maximum' argument.", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (Number) 59);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Week week0 = new Week();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "nD$n8zo5)tLctQd", (String) null, class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Day day0 = new Day();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "wPpsdCoB/Jkp", "wPpsdCoB/Jkp", class0);
      boolean boolean0 = timeSeries0.equals("wPpsdCoB/Jkp");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour((-2721), day0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Day day0 = new Day(mockDate0);
      RegularTimePeriod regularTimePeriod0 = day0.next();
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0);
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
  public void test35()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0, (String) null, (String) null, (Class) null);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(Double.NEGATIVE_INFINITY, 2.0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "X_<F2KQ", "X_<F2KQ", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(528, (-2225));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "", "Negative 'maximum' argument.", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (Number) 59);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) minute0, (RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Year year0 = new Year();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "Time", "Time", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1), (-1607));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-3093), Integer.MAX_VALUE);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.delete((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(3, year0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (Number) 53);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Day day0 = new Day();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "wPpsdCoB/Jkp", "wPpsdCoB/Jkp", class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Day day0 = new Day();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "wPpsdCoB/Jkp", "wPpsdCoB/Jkp", class0);
      timeSeries0.add((RegularTimePeriod) day0, 1.5);
      timeSeries0.removeAgedItems(0L, true);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Day day0 = new Day();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "wPpsdCoB/Jkp", "wPpsdCoB/Jkp", class0);
      timeSeries0.removeAgedItems(0L, true);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0, (String) null, (String) null, (Class) null);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (Number) 53);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-3093), Integer.MAX_VALUE);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries1 = new TimeSeries(fixedMillisecond0, "", "Requires start <= end.", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries1.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 1946.824492152635);
      TimeSeries timeSeries2 = timeSeries0.addAndOrUpdate(timeSeries1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour((-2721), day0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
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
  public void test47()  throws Throwable  {
      Day day0 = new Day();
      RegularTimePeriod regularTimePeriod0 = day0.next();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "wPpsdCoB/Jkp", "wPpsdCoB/Jkp", class0);
      timeSeries0.add(regularTimePeriod0, 1.5);
      timeSeries0.add((RegularTimePeriod) day0, 1.0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Day day0 = new Day();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "wPpsdCoB/Jkp", "wPpsdCoB/Jkp", class0);
      timeSeries0.add((RegularTimePeriod) day0, 1.5);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) day0, 1.0);
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period 14-February-2014 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-3093), (-2147483604));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-3093), (-2147483604));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(3, year0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (Number) 53);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0, (String) null, (String) null, (Class) null);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) week0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0, (String) null, (String) null, (Class) null);
      timeSeries0.setMaximumItemAge(0L);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Month month0 = new Month();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "4^5^V^sASG_Q{u", "j@g|$*m1!nA9xX^K\"L", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (-4113.759595009));
      timeSeries0.setMaximumItemCount(0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "-3'SIySPC4/|;uE", "-3'SIySPC4/|;uE", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-752));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.setMaximumItemCount(609);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-3093), Integer.MAX_VALUE);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(0, year0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "zJ!amdq", "[MbpXE/EZ[]D,S9*(j", class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(0, year0);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (Number) 1);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-3093), Integer.MAX_VALUE);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.setRangeDescription("c9.S.3;9r[_]{wYc~h");
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
      BigInteger bigInteger0 = BigInteger.TEN;
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) month0, (Number) bigInteger0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "", "Negative 'maximum' argument.", class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "g#Y1:kan,-x.y", "?OB$", class0);
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
  public void test64()  throws Throwable  {
      Week week0 = new Week(2152, 2152);
      TimeSeries timeSeries0 = new TimeSeries(week0);
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
  public void test65()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(3, year0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-3093), Integer.MAX_VALUE);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 1946.824492152635);
      // Undeclared exception!
      try { 
        timeSeries0.addAndOrUpdate(timeSeries0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-3093), (-2147483604));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-2147483604), (Number) null);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
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
  public void test70()  throws Throwable  {
      Day day0 = new Day();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "wPpsdCoB/Jkp", "wPpsdCoB/Jkp", class0);
      timeSeries0.setDomainDescription("wPpsdCoB/Jkp");
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Day day0 = new Day();
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "wPpsdCoB/Jkp", "wPpsdCoB/Jkp", class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}