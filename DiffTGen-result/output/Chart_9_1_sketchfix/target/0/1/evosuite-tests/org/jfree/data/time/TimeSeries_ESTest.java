/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 10:47:00 GMT 2020
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
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
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "MQhU=e-", "MQhU=e-", class0);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(1556);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(spreadsheetDate0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete((-1), 3);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1672, 2, 2, 2, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Locale locale0 = JComponent.getDefaultLocale();
      Week week0 = new Week(mockDate0, zoneInfo0, locale0);
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, "}\"'NcyE)_K{X*", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, (-1301.40208667096));
      timeSeries0.add(timeSeriesDataItem0, false);
      timeSeries0.add((RegularTimePeriod) week0, (-1301.40208667096));
      timeSeries0.delete((RegularTimePeriod) week0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, 0, 2, 2, 2, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Locale locale0 = JComponent.getDefaultLocale();
      Week week0 = new Week(mockDate0, zoneInfo0, locale0);
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, "}\"'NcyE)_K{X*", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, (-1301.40208667096));
      timeSeries0.add(timeSeriesDataItem0, false);
      timeSeries0.add((RegularTimePeriod) week0, (-1301.40208667096));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1672, 2, 2, 2, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Locale locale0 = JComponent.getDefaultLocale();
      Week week0 = new Week(mockDate0, zoneInfo0, locale0);
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, "}\"'NcyE)_K{X*", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, (-1301.40208667096));
      timeSeries0.add(timeSeriesDataItem0, false);
      timeSeries0.add((RegularTimePeriod) week0, (-1301.40208667096));
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (Number) 53);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1672, 2, 2, 2, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Locale locale0 = JComponent.getDefaultLocale();
      Week week0 = new Week(mockDate0, zoneInfo0, locale0);
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, "}\"'NcyE)_K{X*", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, (-1301.40208667096));
      timeSeries0.add(timeSeriesDataItem0, false);
      timeSeries0.add((RegularTimePeriod) week0, (-1301.40208667096));
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem((RegularTimePeriod) week0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "=*{0UavY", "[", class0);
      timeSeries0.setMaximumItemAge(26L);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1672, 2, 2, 2, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Locale locale0 = JComponent.getDefaultLocale();
      Week week0 = new Week(mockDate0, zoneInfo0, locale0);
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, "}\"'NcyE)_K{X*", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, (-1301.40208667096));
      timeSeries0.add(timeSeriesDataItem0, false);
      timeSeries0.add((RegularTimePeriod) week0, (-1301.40208667096));
      Number number0 = timeSeries0.getValue(1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1672, 2, 2, 2, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Locale locale0 = JComponent.getDefaultLocale();
      Week week0 = new Week(mockDate0, zoneInfo0, locale0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "}\"'NcyE)_K{X*", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (-1301.40208667096));
      timeSeries0.add(timeSeriesDataItem0, false);
      RegularTimePeriod regularTimePeriod0 = timeSeries0.getNextTimePeriod();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", (String) null, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (double) 0);
      int int0 = timeSeries0.getIndex(hour0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", (String) null, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (double) 0);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.getDataItem(0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", (String) null, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
      TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (double) 0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries("{^R7!", " for that time period. Duplicates are not ", (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.removeAgedItems(9223372036854775807L, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", (String) null, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue((-1146));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-1762));
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(integer0, class0);
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
  public void test15()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0, (Class) null);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((-3033));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Year year0 = new Year();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, class0);
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
  public void test17()  throws Throwable  {
      Week week0 = new Week();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, (String) null, "", class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (Number) 53);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Week, but the TimeSeries is expecting an instance of java.util.SimpleTimeZone.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<FixedMillisecond> class0 = FixedMillisecond.class;
      TimeSeries timeSeries0 = null;
      try {
        timeSeries0 = new TimeSeries((Comparable) null, "V+bSCq", "V+bSCq", class0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.general.Series", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "=*{0UavY", "[", class0);
      timeSeries0.removeAgedItems(false);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Minute minute0 = new Minute(mockDate0);
      Class<Year> class0 = Year.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) minute0, (Number) 0);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of org.jfree.data.time.Year.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", (String) null, class0);
      int int0 = timeSeries0.getIndex(hour0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Year year0 = new Year();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(year0, "", "", class0);
      Class class1 = timeSeries0.getTimePeriodClass();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "}sBIO", "5rBQe5Ym*%t2(`wo}}", class0);
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) fixedMillisecond0, (Number) integer0, false);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.FixedMillisecond, but the TimeSeries is expecting an instance of org.jfree.data.time.TimeSeriesDataItem.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, ";JwZfa;li0=t", ";JwZfa;li0=t", class0);
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
  public void test27()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", (String) null, class0);
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
  public void test28()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      MockDate mockDate0 = new MockDate(2, 45, 0);
      Minute minute0 = new Minute(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) minute0, (Number) 53);
      // Undeclared exception!
      try { 
        timeSeries0.add(timeSeriesDataItem0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Minute, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<Month> class0 = Month.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "6vcG#>e", "6vcG#>e", class0);
      int int0 = timeSeries0.getItemCount();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1672, 2, 2, 2, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Locale locale0 = JComponent.getDefaultLocale();
      Week week0 = new Week(mockDate0, zoneInfo0, locale0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "}\"'NcyE)_K{X*", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (-1301.40208667096));
      timeSeries0.add(timeSeriesDataItem0, false);
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Minute minute0 = new Minute();
      TimeSeries timeSeries0 = new TimeSeries(minute0, (Class) null);
      Week week0 = new Week(0, 0);
      boolean boolean0 = timeSeries0.equals(week0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Integer integer0 = Integer.valueOf(0);
      TimeSeries timeSeries0 = new TimeSeries(integer0);
      SerialDate serialDate0 = SerialDate.createInstance(334);
      Date date0 = serialDate0.toDate();
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Hour hour0 = new Hour(date0, zoneInfo0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "MQhU=e-", "MQhU=e-", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 59);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(0, year0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy(53, 3);
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(2583L, 2583L);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-2280), (-2280));
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries(quarter0, "=*{0UavY", "[", class0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(4, (-233));
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1672, 2, 2, 2, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Locale locale0 = JComponent.getDefaultLocale();
      Week week0 = new Week(mockDate0, zoneInfo0, locale0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "}\"'NcyE)_K{X*", "", class0);
      timeSeries0.add((RegularTimePeriod) week0, (-1301.40208667096));
      timeSeries0.delete((RegularTimePeriod) week0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "MQhU=e-", "MQhU=e-", class0);
      timeSeries0.delete((RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      Class<TimeSeriesDataItem> class0 = TimeSeriesDataItem.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "}sBIO", "5rBQe5Ym*%t2(`wo}}", class0);
      timeSeries0.clear();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1672, 2, 2, 2, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Locale locale0 = JComponent.getDefaultLocale();
      Week week0 = new Week(mockDate0, zoneInfo0, locale0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "}\"'NcyE)_K{X*", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (-1301.40208667096));
      timeSeries0.add(timeSeriesDataItem0, false);
      timeSeries0.removeAgedItems(2291L, true);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      timeSeries0.removeAgedItems((long) 1, false);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-1349L), 26L);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      Integer integer0 = new Integer(5824);
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
  public void test43()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(366, year0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) year0, 1749.0);
      // Undeclared exception!
      try { 
        timeSeries0.addAndOrUpdate(timeSeries0);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of java.lang.Integer.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(366, year0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) year0, 1749.0);
      timeSeries0.update((RegularTimePeriod) week0, (Number) 1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(366, year0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) year0, (Number) 53);
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1672, 2, 2, 2, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Locale locale0 = JComponent.getDefaultLocale();
      Week week0 = new Week(mockDate0, zoneInfo0, locale0);
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(regularTimePeriod0, "}\"'NcyE)_K{X*", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(regularTimePeriod0, (-1301.40208667096));
      timeSeries0.add(timeSeriesDataItem0, false);
      timeSeries0.add((RegularTimePeriod) week0, (-1301.40208667096));
      int int0 = timeSeries0.hashCode();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1672, 2, 2, 2, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Locale locale0 = JComponent.getDefaultLocale();
      Week week0 = new Week(mockDate0, zoneInfo0, locale0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "}\"'NcyE)_K{X*", "", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) week0, (-1301.40208667096));
      timeSeries0.add(timeSeriesDataItem0, false);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) week0, (-1301.40208667096));
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period Week 10, 3572 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, 0, 2, 2, 29);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(29, "2nD[dv07F|b{Z~1${");
      Minute minute0 = new Minute(mockDate0, simpleTimeZone0);
      TimeSeries timeSeries0 = new TimeSeries(minute0);
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
  public void test49()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<String> class0 = String.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "", (String) null, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Object> class0 = Object.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, ";JwZfa;li0=t", ";JwZfa;li0=t", class0);
      Number number0 = timeSeries0.getValue((RegularTimePeriod) minute0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, "MQhU=e-", "MQhU=e-", class0);
      Collection collection0 = timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Week week0 = new Week();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "Md:hU<Q`7(t", "Md:hU<Q`7(t", class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) week0, (-1510.451));
      Collection collection0 = timeSeries0.getTimePeriods();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(0L, 0L);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      MockDate mockDate0 = new MockDate(3, 1100, 2095, 2095, 2095, 0);
      Hour hour0 = new Hour(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) hour0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, (-2941), 3, Integer.MAX_VALUE, 4923);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      OHLCDataItem oHLCDataItem0 = new OHLCDataItem(date0, 0, (-2941), 0, (-2.147483648E9), 0);
      TimeSeries timeSeries0 = new TimeSeries(oHLCDataItem0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-6289L));
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1060L));
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      timeSeries0.setMaximumItemAge(0L);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(0L, 0L);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      timeSeries0.setMaximumItemCount(2095);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      String string0 = timeSeries0.getRangeDescription();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Week week0 = new Week();
      Class<Date> class0 = Date.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "Md:hU<Q`7(t", "Md:hU<Q`7(t", class0);
      long long0 = timeSeries0.getMaximumItemAge();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1672, 2, 2, 2, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Locale locale0 = JComponent.getDefaultLocale();
      Week week0 = new Week(mockDate0, zoneInfo0, locale0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "}\"'NcyE)_K{X*", "", class0);
      timeSeries0.add((RegularTimePeriod) week0, (-1301.40208667096));
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem((RegularTimePeriod) week0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(366, year0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      timeSeries0.setRangeDescription("Time");
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Class<SimpleTimeZone> class0 = SimpleTimeZone.class;
      TimeSeries timeSeries0 = new TimeSeries("qz4+!p", class0);
      Float float0 = new Float(0.0F);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) null, (Number) float0);
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeriesDataItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      Object object0 = timeSeries0.clone();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(366, year0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) year0, 1749.0, true);
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Year, but the TimeSeries is expecting an instance of java.lang.Integer.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1060L));
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getValue(1742);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1742, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1060L));
      Class<Second> class0 = Second.class;
      TimeSeries timeSeries0 = new TimeSeries(fixedMillisecond0, "", "", class0);
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
  public void test66()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(0L, 0L);
      TimeSeries timeSeries0 = new TimeSeries(simpleTimePeriod0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1672, 2, 2, 2, 0);
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Locale locale0 = JComponent.getDefaultLocale();
      Week week0 = new Week(mockDate0, zoneInfo0, locale0);
      Class<Week> class0 = Week.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, "}\"'NcyE)_K{X*", "", class0);
      List list0 = timeSeries0.getItems();
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(0, year0);
      TimeSeries timeSeries0 = new TimeSeries(week0);
      int int0 = timeSeries0.getMaximumItemCount();
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Week week0 = new Week();
      TimeSeries timeSeries0 = new TimeSeries(week0);
      // Undeclared exception!
      try { 
        timeSeries0.update(53, (Number) 1);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 53, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(366, year0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate((RegularTimePeriod) year0, 1749.0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) week0, (RegularTimePeriod) year0);
      TimeSeries timeSeries2 = timeSeries1.addAndOrUpdate(timeSeries0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Minute minute0 = new Minute();
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries0 = new TimeSeries(minute0, class0);
      timeSeries0.setDomainDescription("Hj)yx");
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(366, year0);
      Class<Integer> class0 = Integer.class;
      TimeSeries timeSeries0 = new TimeSeries(week0, class0);
      String string0 = timeSeries0.getDomainDescription();
  }
}
