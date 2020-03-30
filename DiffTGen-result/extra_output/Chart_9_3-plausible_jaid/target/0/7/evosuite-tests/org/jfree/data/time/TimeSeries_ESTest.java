/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 08:14:37 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Month month0 = new Month(mockDate0);
      RegularTimePeriod regularTimePeriod0 = month0.previous();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(regularTimePeriod0, (RegularTimePeriod) month0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(30, 2958465);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      Quarter quarter0 = new Quarter(date0);
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, ".", ".", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(1, 4);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, 3345.6);
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0);
      timeSeries0.setMaximumItemAge(0L);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, "", "", class0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "LxJXM*umT=", "LxJXM*umT=", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) fixedMillisecond0, (-32.8110081));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
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
  public void test07()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2038L);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "(Q2=/z}54bW:68{*dhK", "(Q2=/z}54bW:68{*dhK", class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems(2038L, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "dgvr[?97xs`$8<", "Requires start >= 0.", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Second> class0 = Second.class;
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.removeAgedItems(true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("0");
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
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
  public void test13()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, (-1598.9441));
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeZone timeZone0 = TimeZone.getDefault();
      Month month0 = new Month(mockDate0, timeZone0);
      TimeSeries timeSeries0 = new TimeSeries(month0);
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
  public void test15()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "KA", "KA", class0);
      int int0 = timeSeries0.getIndex(fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate(60, 60, 60);
      Month month0 = new Month(mockDate0);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "`$b&IdCRzIt^D&G')V", "`$b&IdCRzIt^D&G')V", class0);
      Byte byte0 = new Byte((byte)57);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) month0, (Number) byte0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of org.jfree.data.time.TimeSeries.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
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
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3, 3, 3, 0, 1049, 3);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem(1049);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1049, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-2267L), (-2267L));
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0, "*~K}Aj*y>m07$ho", "*~K}Aj*y>m07$ho", class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Month month0 = new Month();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "FO=ZQG.MQ", "FO=ZQG.MQ", class0);
      Integer integer0 = new Integer(Integer.MAX_VALUE);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (Number) integer0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Week week0 = new Week((-1145), (-160));
      TimeSeries timeSeries0 = new TimeSeries(week0);
      boolean boolean0 = timeSeries0.equals(week0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Month month0 = new Month(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) month0, (RegularTimePeriod) month0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(0, hour0);
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "", "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(2261, 1564);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, "the time period ", "the time period ", class0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-692), 999);
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(753, 753);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Quarter> class0 = Quarter.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(1803, 590);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Month month0 = new Month();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "FO=ZQG.MQ", "FO=ZQG.MQ", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(2, 2);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, (-3865), 0, 366, (-1));
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Year year0 = new Year(mockDate0, timeZone0);
      Week week0 = new Week((-1), year0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) year0, (Number) 1);
      timeSeries0.delete((RegularTimePeriod) year0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2038L);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "(Q2=/z}54bW:68{*dhK", "(Q2=/z}54bW:68{*dhK", class0);
      timeSeries0.delete((RegularTimePeriod) fixedMillisecond0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Month month0 = new Month();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "$(][Jn6%Pu,*PaZ0x", "", class0);
      Byte byte0 = new Byte((byte)3);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (Number) byte0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "KA", "KA", class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Millisecond millisecond0 = new Millisecond();
      TimeSeries timeSeries0 = new TimeSeries(millisecond0);
      timeSeries0.removeAgedItems(0L, false);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Month month0 = new Month();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "$(][Jn6%Pu,*PaZ0x", "", class0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, (-3865), 0, 366, (-1));
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Year year0 = new Year(mockDate0, timeZone0);
      Week week0 = new Week((-1), year0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) year0, (Number) 1);
      timeSeries0.update((RegularTimePeriod) week0, (Number) 1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
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
  public void test37()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, ".E(rQz +G=;", "*@@+ 3TNI{QvOd", class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) quarter0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1273), (-1273), (-1273), 1513, 3);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(mockDate0, "w}y1a}Z", "q/K(<\":hi2c$)t1/u", class0);
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
  public void test39()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Month month0 = new Month(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Month month0 = new Month();
      Class<TimeZone> class0 = TimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, "FO=ZQG.MQ", "FO=ZQG.MQ", class0);
      Integer integer0 = new Integer(Integer.MAX_VALUE);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) month0, (Number) integer0);
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, "", "", class0);
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Week week0 = new Week((-1145), (-160));
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-1145));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute(0, hour0);
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "", "", class0);
      timeSeries0.setMaximumItemAge(718L);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Day day0 = new Day();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      timeSeries0.setMaximumItemCount(Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "[!NgqVfw%AX", "Unrecognised rowKey: ", class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Month month0 = new Month(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) month0, 774.875800604);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Month, but the TimeSeries is expecting an instance of java.util.SimpleTimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      timeSeries0.setRangeDescription("<Dvvp<kt");
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2768L));
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "v tu.tC|a~sb4] _L=:");
      Millisecond millisecond0 = new Millisecond(mockDate0, simpleTimeZone0);
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(millisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) millisecond0, (Number) 0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Millisecond, but the TimeSeries is expecting an instance of java.lang.Object.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "", class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) fixedMillisecond0, (-92.021213), false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of java.lang.Object.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Year year0 = new Year(mockDate0);
      Week week0 = new Week(1900, year0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (double) 1900);
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(timeSeriesDataItem0, "V[vYNjg0D;MYycL0", "V[vYNjg0D;MYycL0", class0);
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
  public void test53()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", "", class0);
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
  public void test54()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<RegularTimePeriod> class0 = RegularTimePeriod.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("(XND:");
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Month month0 = new Month(mockDate0);
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(month0, class0);
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
  public void test57()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(2038L);
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "(Q2=/z}54bW:68{*dhK", "(Q2=/z}54bW:68{*dhK", class0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Day day0 = new Day();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(day0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((-3022), (Number) null);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeSeries> class0 = TimeSeries.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "LxJXM*umT=", "LxJXM*umT=", class0);
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
  public void test60()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0);
      timeSeries0.setDomainDescription("");
  }
}
