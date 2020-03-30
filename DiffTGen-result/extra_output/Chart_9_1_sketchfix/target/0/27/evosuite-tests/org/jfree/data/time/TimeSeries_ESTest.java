/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 10:56:08 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.chrono.ChronoLocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.event.RowSorterEvent;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      MockDate mockDate0 = new MockDate(2000, 2000, 2000);
      Hour hour0 = new Hour(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
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
  public void test01()  throws Throwable  {
      Year year0 = new Year();
      Class<RowSorterEvent.Type> class0 = RowSorterEvent.Type.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, 75.1451316);
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getNextTimePeriod();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(278L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Short short0 = new Short((short)0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) null, (Number) short0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries("} ^kvu+E-KL{0/nk3", "The number of categories does not match the data.", "The number of categories does not match the data.", class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems(1392409281320L, false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Month month0 = new Month(mockDate0);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "|/&f", "(`U2:_L, I", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-600));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TimeSeries timeSeries0 = new TimeSeries("0Pzr8Wf!", "0Pzr8Wf!", "Range", class0);
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
  public void test07()  throws Throwable  {
      Week week0 = new Week();
      Class<DefaultTableModel> class0 = DefaultTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "lj|Y]K@d+b3v()<_", "V.|@A0?d", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (double) 1);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of javax.swing.table.DefaultTableModel.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3876, 0, 3190, 3112, 3876, 0);
      Quarter quarter0 = new Quarter(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      Hour hour0 = new Hour(mockDate0, quarter0.DEFAULT_TIME_ZONE);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("org.jfree.data.jdbc.JDBCCategoryDataset");
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, 1125.6673840919, true);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "<be2P", "<be2P", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
      Class<TimeSeries> class0 = TimeSeries.class;
      Year year0 = new Year();
      Week week0 = new Week(182, year0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (double) 1);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
      timeSeries0.removeAgedItems(true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Week week0 = new Week(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (Number) 53);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "", (String) null, class0);
      int int0 = timeSeries0.getIndex(millisecond0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      Class class0 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Year year0 = new Year(2274);
      TimeSeries timeSeries0 = new TimeSeries(year0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(date0, 0.0, 0.0, 0.0, 2274, (-1250.6));
      Number number0 = oHLCDataItem0.getOpen();
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) year0, number0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
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
  public void test19()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2000, 2000, 2000);
      Hour hour0 = new Hour(mockDate0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, 75.1451316);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, 2, 2, 2, 2, 2);
      Month month0 = new Month(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(month0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      Number number0 = xYDataItem0.getY();
      boolean boolean0 = timeSeries0.equals(number0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
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
      Millisecond millisecond0 = new Millisecond();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) millisecond0, (RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-4L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(1, 1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, 2, 2, 2, 2, 2);
      Month month0 = new Month(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(month0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(7, (-3460));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2000, 2000, 2000);
      Hour hour0 = new Hour(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-828), (-1));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -828
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, 2, 2, 2, 2, 2);
      Month month0 = new Month(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(month0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, 0.0);
      timeSeries0.delete((RegularTimePeriod) month0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Year year0 = new Year();
      Class<RowSorterEvent.Type> class0 = RowSorterEvent.Type.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      timeSeries0.delete((RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2000, 2000, 2000);
      Hour hour0 = new Hour(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Quarter quarter0 = new Quarter(2, 2549);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.removeAgedItems((long) 1, false);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, 0.5);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, 75.1451316);
      Class<TimeSeries> class1 = TimeSeries.class;
      TimeSeries timeSeries1 = new TimeSeries(quarter0, "", "", class1);
      TimeSeries timeSeries2 = timeSeries1.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) hour0, (Number) 0);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2000, 2000, 2000);
      Hour hour0 = new Hour(mockDate0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, 0.0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, (-1.0));
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period Sun Feb 21 00:00:00 GMT 4072 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Minute minute0 = new Minute();
      Second second0 = new Second(28, minute0);
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "", "", class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) second0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries("BWr{|;,~K2qlU.", class0);
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
  public void test38()  throws Throwable  {
      Year year0 = new Year();
      Class<RowSorterEvent.Type> class0 = RowSorterEvent.Type.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Week week0 = new Week(0, 14);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "57|`|2)Y @t", "Key", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) week0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond((-627), second0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-627));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2000, 2000, 2000);
      Hour hour0 = new Hour(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.setMaximumItemAge(9223372036854775807L);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<TimeSeries> class0 = TimeSeries.class;
      Year year0 = new Year();
      Week week0 = new Week(182, year0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (double) 1);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
      timeSeries0.setMaximumItemCount(44);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(278L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2000, 2000, 2000);
      Hour hour0 = new Hour(mockDate0);
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.add((RegularTimePeriod) hour0, (-1.0));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "Null 'period' argument.", class0);
      timeSeries0.setRangeDescription("");
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries("BWr{|;,~K2qlU.", class0);
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
  public void test49()  throws Throwable  {
      Quarter quarter0 = new Quarter(2, 2549);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MockDate mockDate0 = new MockDate(182, 182, 1194);
      Second second0 = new Second(mockDate0);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) second0, 1.0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Second, but the TimeSeries is expecting an instance of org.jfree.data.time.TimeSeries.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
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
  public void test52()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
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
  public void test53()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "", (String) null, class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, 75.1451316);
      // Undeclared exception!
      try { 
        timeSeries0.addAndOrUpdate(timeSeries0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Quarter, but the TimeSeries is expecting an instance of org.jfree.data.time.Second.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "", (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update(23, (Number) 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 23, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
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
  public void test57()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.setDomainDescription(";u?#@REsRf@");
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour(3282, day0);
      Minute minute0 = new Minute(0, hour0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) minute0, 1.0);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
