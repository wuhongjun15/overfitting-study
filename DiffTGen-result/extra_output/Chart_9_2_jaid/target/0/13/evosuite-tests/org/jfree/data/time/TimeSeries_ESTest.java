/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 14:04:10 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.temporal.ChronoField;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JLayeredPane;
import javax.swing.table.DefaultTableModel;
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
import org.jfree.data.time.SimpleTimePeriod;
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
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      Day day0 = minute0.getDay();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(0, 1896);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries("?G&;W]I=s0_:K", class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems(0L, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries("1\"-z", "1\"-z", "e|", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-1218));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(400L, 437L);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(2851);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2851, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-653L));
      TimeZone timeZone0 = TimeZone.getDefault();
      Millisecond millisecond0 = new Millisecond(mockDate0, timeZone0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
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
  public void test05()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) year0, (-1.0));
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate(24L);
      Week week0 = new Week(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "`|o0C4z#Il^x@/N", "org.jfree.data.Range", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (Number) 53);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of java.lang.Integer.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, (-5372), (-1002), (-1002));
      Week week0 = new Week(mockDate0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (-383.06819), false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of java.lang.Integer.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1928L);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) fixedMillisecond0, (double) 1928L);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.TimeSeriesDataItem.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "", "KY??6`ry$Xe", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
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
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.removeAgedItems(true);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
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
  public void test14()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      Week week0 = new Week(1800, 1800);
      int int0 = timeSeries0.getIndex(week0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin(0.0, Double.POSITIVE_INFINITY, false, false);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleHistogramBin0, class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, (-487), 2);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(date0, (-2096.37645725), (-2096.37645725), (-2096.37645725), (-2910.0), 1215.671371551456);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(oHLCDataItem0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, (-2910.0), false);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-2609L));
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Second second0 = new Second();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) second0, (Number) 59);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod((-920));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(53L);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Second second0 = new Second(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "V\"[r?=)", "V\"[r?=)", class0);
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
  public void test22()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1045, (-383), 2377, (-3753), 1045);
      TimeSeries timeSeries0 = new TimeSeries(mockDate0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      Class<Object> class1 = Object.class;
      TimeSeries timeSeries1 = new TimeSeries(millisecond0, class1);
      timeSeries1.setDomainDescription(".'lI");
      boolean boolean0 = timeSeries0.equals(timeSeries1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      Class<Object> class1 = Object.class;
      TimeSeries timeSeries1 = new TimeSeries(millisecond0, class1);
      timeSeries1.setRangeDescription("ZS");
      boolean boolean0 = timeSeries0.equals(timeSeries1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Day day0 = new Day();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "<c';wTqbRQ$POiJFRH", "<c';wTqbRQ$POiJFRH", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(0, (-2170));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Month month0 = new Month();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "9", "Null 'series' not permitted.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-2961), (-2961));
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(59, 344);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(30, (-1283));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Year year0 = new Year();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1), (-1));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Year year0 = new Year();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      timeSeries0.delete((RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockDate mockDate0 = new MockDate(366, 305, 0, 0, 305, 305);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Class<DefaultTableModel> class0 = DefaultTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "org.jfree.data.xy.XYIntervalSeries", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (Number) 4);
      timeSeries0.removeAgedItems((long) 1, true);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.removeAgedItems((long) 0, false);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) second0, (Number) 59);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "org.jfree.data.xy.XYIntervalSeries", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (Number) 4);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) quarter0, (Number) 1, true);
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period Q1/2014 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.getIndex((RegularTimePeriod) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, (-487), 2);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Second second0 = new Second();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) second0, (Number) 59);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, (-487), 2);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      timeSeries0.setMaximumItemAge(2907L);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-1233));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(400L, 437L);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      timeSeries0.setMaximumItemCount(2851);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Month month0 = new Month();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "Argument 'd' outside valid range.", "Argument 'd' outside valid range.", class0);
      timeSeries0.add((RegularTimePeriod) month0, (Number) null);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(1347L, 9223372036854775807L);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Day day0 = new Day();
      TimeSeries timeSeries0 = new TimeSeries(day0);
      timeSeries0.add((RegularTimePeriod) day0, (-417.336118));
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getNextTimePeriod();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 5, 2140);
      Minute minute0 = new Minute(mockDate0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, " but the series already contains an observation", "&.v^9!", class0);
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
  public void test49()  throws Throwable  {
      ChronoField chronoField0 = ChronoField.EPOCH_DAY;
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(chronoField0, class0);
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
  public void test50()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(0L, 0L);
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(1928L);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (double) 1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(9223372036854775807L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      // Undeclared exception!
      try { 
        timeSeries0.update(0, (Number) integer0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "p9L1^=^qDN_+ uUV8E_", "p9L1^=^qDN_+ uUV8E_", class0);
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
  public void test55()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      Class<Object> class1 = Object.class;
      TimeSeries timeSeries1 = new TimeSeries(millisecond0, class1);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
  }
}