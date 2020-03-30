/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:36:20 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.text.ParsePosition;
import java.time.Instant;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.SerialDate;
import org.jfree.data.time.SimpleTimePeriod;
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
      MockDate mockDate0 = new MockDate(476, 476, 476, 47, 29);
      TimeZone timeZone0 = TimeZone.getDefault();
      Year year0 = new Year(mockDate0, timeZone0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 1376);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      timeSeries0.setMaximumItemAge(0L);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.setMaximumItemCount(2163);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Float float0 = new Float(235.2605F);
      XYDataItem xYDataItem0 = new XYDataItem((Number) float0, (Number) float0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, " but the series already contains an observation", "2:':)UGs", class0);
      // Undeclared exception!
      try { 
        timeSeries0.update(1, (Number) float0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      Day day0 = new Day(date0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems(3564L, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Week week0 = new Week();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
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
  public void test06()  throws Throwable  {
      Week week0 = new Week();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
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
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      SerialDate serialDate0 = SerialDate.createInstance((Date) mockDate0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, (String) null, ".", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(2);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-2081));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(0.0, (-3533.19819779387));
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-2993), 0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.data = null;
      // Undeclared exception!
      try { 
        timeSeries0.clear();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "", "unV", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Quarter> class0 = Quarter.class;
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (Number) 999);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (Number) 999);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem1, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Millisecond, but the TimeSeries is expecting an instance of java.util.Date.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-2693L));
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
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
  public void test17()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      int int0 = timeSeries0.getIndex(millisecond0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1675), 193, 193, (-1675), 0, 0);
      Month month0 = new Month(mockDate0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "No such series : ", "No such series : ", class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "createInstance", "", class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      ParsePosition parsePosition0 = new ParsePosition(2107715432);
      Date date0 = mockSimpleDateFormat0.parse("mZ]4w*@t-5Z0ca", parsePosition0);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = new Locale("b@h9SJP2", " but the series already contains an observation");
      Week week0 = new Week(date0, timeZone0, locale0);
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, " but the series already contains an observation", "r>5Iv#{xA$R0<m!A", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (Number) 53, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of java.util.Date.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Year year0 = new Year();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getTimePeriod(5814);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 5814, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "createInstance", "", class0);
      String string0 = timeSeries0.getDomainDescription();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
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
  public void test26()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (Number) 999);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Week week0 = new Week();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Week week0 = new Week();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      boolean boolean0 = timeSeries0.equals(week0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Year year0 = new Year();
      RegularTimePeriod regularTimePeriod0 = year0.previous();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) year0, regularTimePeriod0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start on or before end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(1539, 11);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Month month0 = new Month(9, 9);
      TimeSeries timeSeries0 = new TimeSeries(month0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(9, 9);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(1.0, 1778.352979216);
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, (String) null, "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-928), (-2686));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries("A", "hz(jiP", "!];}Z", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(59, 59);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 59, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (Number) 999);
      timeSeries0.delete((RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1675), 193, 193, (-1675), 0, 0);
      Month month0 = new Month(mockDate0);
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "No such series : ", "No such series : ", class0);
      timeSeries0.delete((RegularTimePeriod) month0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Year year0 = new Year();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      Second second0 = new Second();
      Float float0 = new Float(509.805976619722);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) second0, (Number) float0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, 0, 0, (-2832), 2);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MockDate mockDate0 = new MockDate(44, 966, (-1500), (-1500), (-3562), (-2222));
      Month month0 = new Month(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(month0);
      timeSeries0.removeAgedItems((long) (-3562), false);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1675), 193, 193, (-1675), 1539, 0);
      Month month0 = new Month(mockDate0);
      RegularTimePeriod regularTimePeriod0 = month0.next();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, "No su{h series :L ", "No su{h series :L ", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(regularTimePeriod0, 0.0);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (double) 193);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(0L, 2L);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, (String) null, "", class0);
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
  public void test42()  throws Throwable  {
      Year year0 = new Year();
      TimeSeries timeSeries0 = new TimeSeries(year0);
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) year0, (Number) integer0);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, (Number) 999);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Float float0 = new Float(235.2605F);
      XYDataItem xYDataItem0 = new XYDataItem((Number) float0, (Number) float0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, " but the series already contains an observation", "2:':)UGs", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((RegularTimePeriod) null);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Year year0 = new Year();
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "createInstance", "", class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(0L);
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "createInstance", "", class0);
      BigInteger bigInteger0 = BigInteger.ONE;
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (Number) bigInteger0);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem((RegularTimePeriod) fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem1);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Second.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-2693L));
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Month month0 = new Month();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) month0, (-2.147483648E9));
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-1011));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.setMaximumItemAge(53);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      timeSeries0.setMaximumItemCount(0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) minute0, (RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) fixedMillisecond0, (-3227.7737180297986));
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<XYDatasetTableModel> class0 = XYDatasetTableModel.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      timeSeries0.setRangeDescription("A");
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Week week0 = new Week();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (Number) 1);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of java.util.SimpleTimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Float float0 = new Float(235.2605F);
      XYDataItem xYDataItem0 = new XYDataItem((Number) float0, (Number) float0);
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, " but the series already contains an observation", "2:':)UGs", class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (double) 0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockSimpleDateFormat0.get2DigitYearStart();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Second second0 = new Second(date0, timeZone0);
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-3170));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Year year0 = new Year();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
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
      Month month0 = new Month();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) month0, (-2.147483648E9));
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1L));
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, 0.0);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem(0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-269), (Number) 999);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
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
  public void test65()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(0L, 893L);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, class0);
      timeSeries0.setDomainDescription("EgL;1>o<~7H^XcnzQo");
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) millisecond0, (RegularTimePeriod) millisecond0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
  }
}
