/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 13:12:46 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.time.chrono.ChronoLocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.Vector;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYDatasetTableModel;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      RegularTimePeriod regularTimePeriod0 = quarter0.next();
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) quarter0, regularTimePeriod0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Week week0 = new Week(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "", class0);
      timeSeries0.setMaximumItemAge(19L);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
      Day day0 = new Day(spreadsheetDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (Number) 1);
      timeSeries0.add(timeSeriesDataItem0, false);
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getTimePeriod(0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "", "", class0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries("/kMDx Tgfo", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (Number) 1);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem(0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.update(999, (Number) 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 999, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems((long) 4, false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate(8, 0, 50, 50, 3362);
      Millisecond millisecond0 = new Millisecond(mockDate0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "createInstance", "createInstance", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-1333));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
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
      MockDate mockDate0 = new MockDate();
      Week week0 = new Week(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "", class0);
      Vector<Week> vector0 = new Vector<Week>();
      timeSeries0.data = (List) vector0;
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(152);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 152
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Week week0 = new Week(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(29);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 29, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-3947), 0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Week week0 = new Week();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "$(B{Wh\"h.:/#I^<I^7", class0);
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
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(2000);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, (Number) 0, false);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "^'f~o", "^'f~o", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
      Week week0 = new Week();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (Number) 53);
      timeSeries0.add(timeSeriesDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(413, 1615);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 413, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(3404.9883307, 3404.9883307);
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0);
      Minute minute0 = new Minute();
      Second second0 = new Second(0, minute0);
      int int0 = timeSeries0.getIndex(second0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
      Day day0 = new Day(spreadsheetDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Class class0 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour(2159, day0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Week week0 = new Week(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(152);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 152, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("+[WDA+MW~+6");
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-1680));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries("/kMDx Tgfo", class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1374, 631, 631, 666, 2541);
      Hour hour0 = new Hour(mockDate0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "org.jfree.data.category.CategoryToPieDataset", class0);
      boolean boolean0 = timeSeries0.equals("org.jfree.data.category.CategoryToPieDataset");
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) quarter0, (RegularTimePeriod) quarter0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1034, 1034, 1034, 1034, 0, 0);
      Hour hour0 = new Hour(mockDate0);
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(23, 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries("V6HZ3", "V6HZ3", "mU\"W$]o[g5.aw", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-3595), 1617);
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Week week0 = new Week();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(413, 1615);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-588), "org.jfree.data.general.DefaultKeyedValues2DDataset");
      Month month0 = new Month(mockDate0, simpleTimeZone0);
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "", "{,[-P,L=jrQnOz{", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-974), (-1509));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(0, 23);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      Day day0 = new Day();
      Hour hour0 = new Hour(23, day0);
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      MockDate mockDate0 = new MockDate((-1215), (-1968), 1066, 1066, Integer.MAX_VALUE);
      Quarter quarter0 = new Quarter(mockDate0);
      timeSeries0.delete((RegularTimePeriod) quarter0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Day day0 = new Day(mockDate0, timeZone0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "/kMDx Tgfo", "/kMDx Tgfo", class0);
      Class<Millisecond> class1 = Millisecond.class;
      timeSeries0.timePeriodClass = class1;
      timeSeries0.removeAgedItems(2304L, true);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(1650L, 1650L);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, "TimeSeriesDataset.addSeries(): cannot add null array of values.", (String) null, class0);
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (Number) integer0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      Day day0 = new Day();
      Hour hour0 = new Hour(23, day0);
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (double) 0);
      MockDate mockDate0 = new MockDate((-1215), (-1968), 1066, 1066, Integer.MAX_VALUE);
      Quarter quarter0 = new Quarter(mockDate0);
      TimeSeries timeSeries1 = new TimeSeries(quarter0, "", "", class0);
      TimeSeries timeSeries2 = timeSeries1.addAndOrUpdate(timeSeries0);
      timeSeries1.delete((RegularTimePeriod) quarter0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      Day day0 = new Day();
      Hour hour0 = new Hour(23, day0);
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (double) 0);
      // Undeclared exception!
      try { 
        timeSeries0.addAndOrUpdate(timeSeries0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of java.util.SimpleTimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "<SFNV/9\"N&MI", "<SFNV/9\"N&MI", class0);
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
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
  public void test42()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
      Day day0 = new Day(spreadsheetDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (Number) 1);
      timeSeries0.add(timeSeriesDataItem0, false);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) day0, (Number) 3);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
      Day day0 = new Day(spreadsheetDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) day0, (Number) spreadsheetDate0.FIRST_WEEK_IN_MONTH);
      timeSeries0.add(timeSeriesDataItem0, true);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) day0, (double) 1, true);
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period 28-January-1900 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Week week0 = new Week();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (Number) 53);
      timeSeries0.add(timeSeriesDataItem0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) week0, (RegularTimePeriod) week0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
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
  public void test46()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) 53);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1374, 631, 631, 666, 2541);
      Hour hour0 = new Hour(mockDate0);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "org.jfree.data.category.CategoryToPieDataset", class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
      Day day0 = new Day(spreadsheetDate0);
      TimeSeries timeSeries0 = new TimeSeries(day0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Week week0 = new Week();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "Ij~pA_yMh", "\"{", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) week0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries("Ij~pA_yMh", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-1L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Week week0 = new Week(mockDate0);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "", "", class0);
      timeSeries0.setMaximumItemAge(0L);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1864L);
      Minute minute0 = new Minute(mockDate0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "-&G/Zv|(&qM", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-196));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.setMaximumItemCount(14);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Week week0 = new Week(0, 858);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (Number) 53);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(1432, hour0);
      Day day0 = minute0.getDay();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "Null 'series' not permitted.", "fC;#@/6 jC`v]k", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) day0, (-2967.0008457871677));
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Day, but the TimeSeries is expecting an instance of java.util.SimpleTimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, class0);
      timeSeries0.setRangeDescription("");
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      BigInteger bigInteger0 = BigInteger.TEN;
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) fixedMillisecond0, (Number) bigInteger0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries("/kMDx Tgfo", class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0);
      Day day0 = new Day(mockDate0);
      Hour hour0 = new Hour(0, day0);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(44);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 44, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Month month0 = new Month();
      TimeSeries timeSeries0 = new TimeSeries(month0);
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
  public void test62()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "<SFNV/9\"N&MI", "<SFNV/9\"N&MI", class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Week week0 = new Week(152, 152);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      TimeSeries timeSeries1 = new TimeSeries(week0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries("Ij~pA_yMh", class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-4), (Number) null);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Week week0 = new Week(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, 2316.4523591);
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, " but the series already contains an observation", " but the series already contains an observation", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of org.jfree.data.xy.XYDatasetTableModel.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Week week0 = new Week();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      timeSeries0.setDomainDescription("");
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries("/kMDx Tgfo", class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
