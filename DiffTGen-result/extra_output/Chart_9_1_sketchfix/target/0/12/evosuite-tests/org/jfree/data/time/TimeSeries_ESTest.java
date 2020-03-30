/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 10:49:55 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.time.chrono.ChronoLocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.TimeZone;
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
import org.jfree.data.time.SerialDate;
import org.jfree.data.time.SimpleTimePeriod;
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
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      timeSeries0.setMaximumItemCount(0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-1L), (-1L));
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      Stack<TimeSeriesDataItem> stack0 = new Stack<TimeSeriesDataItem>();
      timeSeries0.data = (List) stack0;
      Float float0 = new Float((-2.147483648E9));
      boolean boolean0 = stack0.add((TimeSeriesDataItem) null);
      // Undeclared exception!
      try { 
        timeSeries0.update(0, (Number) float0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.update(0, (Number) 59);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(2048);
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TimeSeries timeSeries0 = new TimeSeries(serialDate0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-275));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "Overwritten values from: ", "Overwritten values from: ", class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-2574));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(5777L);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
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
  public void test07()  throws Throwable  {
      Day day0 = new Day();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
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
  public void test08()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0, (String) null, (String) null, (Class) null);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) second0, (Number) 0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "", (String) null, class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Day> class0 = Day.class;
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
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) minute0, 3649.7825572702313);
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of org.jfree.data.time.Millisecond.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Week week0 = new Week();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "NOID", "NOID", class0);
      int int0 = timeSeries0.getIndex(week0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries("3wL$*LFKPaa", class0);
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
  public void test16()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(758L);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, (String) null, "!}`/h", class0);
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
      Week week0 = new Week(0, 4445);
      Class<Day> class0 = Day.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
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
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate(11, 0, 0, 0, 11, 0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(mockDate0, "fvX%nungqq}z", (String) null, class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockDate mockDate0 = new MockDate(11, 0, 0, 0, 11, 0);
      Quarter quarter0 = new Quarter(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) millisecond0, (RegularTimePeriod) millisecond0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) quarter0, (Number) 4);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(1, 91);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Minute minute0 = new Minute();
      Second second0 = new Second(1815, minute0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, ").", "[,", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-1979), 0);
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(445, (-2407));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries("", "TimePeriodAnchor.END", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-905), 0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -905
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Week week0 = new Week();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "NOID", "NOID", class0);
      timeSeries0.removeAgedItems((long) 53, false);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "2b|nS5r4To<E'YsQ", "", class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1076), 0, 2397, 1, (-1076), 1);
      Quarter quarter0 = new Quarter(mockDate0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "Xg@Sc/YvIWS`7u=lf", "Xg@Sc/YvIWS`7u=lf", class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) quarter0, (Number) 4);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "2b|nS5r4To<E'YsQ", "", class0);
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
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate(11, 12, 12, 12, 11, 0);
      Quarter quarter0 = new Quarter(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) quarter0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((-1.0), (-1.0));
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, class0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-2357));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries("", "TimePeriodAnchor.END", "", class0);
      timeSeries0.setMaximumItemCount(1083);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "Overwritten values from: ", "Overwritten values from: ", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, 1051.005008218287);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) millisecond0, (Number) 0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Millisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Hour.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), 228, (-2532));
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(mockDate0, mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      Month month0 = new Month();
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) month0, 0.0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Day day0 = new Day();
      Hour hour0 = new Hour(2772, day0);
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.setRangeDescription("yBx\u0000E4.?\"<");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      Second second0 = new Second(0, minute0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) minute0, (Number) 59, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of org.jfree.data.time.Month.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      XYDataItem xYDataItem0 = new XYDataItem((Number) integer0, (Number) integer0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "org.jfree.data.general.AbstractDataset", "org.jfree.data.general.AbstractDataset", class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) millisecond0, (-1689.3633610908505), true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Millisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Hour.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, "permitted.  Try using the addOrUpdate() method.", "permitted.  Try using the addOrUpdate() method.", class0);
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
  public void test45()  throws Throwable  {
      Week week0 = new Week();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "NOID", "NOID", class0);
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
  public void test46()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      List list0 = timeSeries0.getItems();
      boolean boolean0 = timeSeries0.equals(list0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      XYDataItem xYDataItem0 = new XYDataItem((Number) integer0, (Number) integer0);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(xYDataItem0, "org.jfree.data.general.AbstractDataset", "org.jfree.data.general.AbstractDataset", class0);
      Millisecond millisecond0 = new Millisecond();
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) millisecond0, 0.0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("");
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "Overwritten values from: ", "Overwritten values from: ", class0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      // Undeclared exception!
      try { 
        timeSeries0.update((-1526), (Number) bigInteger0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "2b|nS5r4To<E'YsQ", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) minute0, (Number) 59);
      // Undeclared exception!
      try { 
        timeSeries0.addAndOrUpdate(timeSeries0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of java.lang.Integer.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockDate mockDate0 = new MockDate(11, 0, 0, 0, 11, 0);
      Quarter quarter0 = new Quarter(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      timeSeries0.setDomainDescription("j?;Hv:ki");
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockDate mockDate0 = new MockDate(11, 0, 0, 0, 11, 0);
      Quarter quarter0 = new Quarter(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(quarter0);
      String string0 = timeSeries0.getDomainDescription();
  }
}