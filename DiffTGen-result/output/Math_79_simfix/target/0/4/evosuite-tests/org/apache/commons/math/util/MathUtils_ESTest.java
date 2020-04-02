/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 02 13:28:25 GMT 2020
 */

package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import org.apache.commons.math.util.MathUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MathUtils_ESTest extends MathUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = (int) (byte)24;
      int int0 = MathUtils.distanceInf(intArray0, intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = (-5271);
      double double0 = MathUtils.distance(intArray0, intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) (byte)1;
      double double0 = MathUtils.distance(doubleArray0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = MathUtils.pow(4194304, 4194304);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = MathUtils.indicator((int) (short)0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((long) 4194304, 0L);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = MathUtils.sinh(0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = MathUtils.round((-4632.12), 0, 0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long long0 = MathUtils.pow(2020L, 0L);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      long long0 = MathUtils.pow(121645100408832000L, 0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = MathUtils.pow((int) (byte)1, 121645100408832000L);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = MathUtils.pow(3471, 0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = MathUtils.normalizeAngle(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = MathUtils.mulAndCheck(0, 4097);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = MathUtils.mulAndCheck((-1719), (-1719));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 1534;
      int int0 = MathUtils.hash(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = MathUtils.factorialLog(8);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = MathUtils.mulAndCheck((int) (byte)81, (-150));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      float float0 = MathUtils.indicator(0.0F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      float float0 = MathUtils.indicator((-1665.354F));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = MathUtils.gcd(2426, (-3448));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      long long0 = MathUtils.factorial(0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double) 0, 27776.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(1.0, (-1061.4114));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[0];
      int int0 = MathUtils.distance1(intArray0, intArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double double0 = MathUtils.distance1(doubleArray0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, 1L);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      long long0 = MathUtils.pow(2423L, 2423L);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      try { 
        MathUtils.pow((long) (short) (-1), (-8));
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (-1^-8)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      long long0 = MathUtils.pow(0L, (int) (byte)1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = MathUtils.pow(0, 741L);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((long) (short) (-1), (long) (byte) (-64));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = MathUtils.subAndCheck((-906), (-719));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      short short0 = MathUtils.sign((short)0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      short short0 = MathUtils.sign((short) (-1));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      long long0 = MathUtils.sign(0L);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      long long0 = MathUtils.sign((long) (short)1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = MathUtils.sign(0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      float float0 = MathUtils.sign(1.0F);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      float float0 = MathUtils.sign(0.0F);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)87);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte) (-64));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      float float0 = MathUtils.round((-1417.12F), (-1719), 0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) (short) (-1);
      double[] doubleArray1 = MathUtils.normalizeArray(doubleArray0, (-3468.84904));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      try { 
        MathUtils.normalizeArray(doubleArray0, (-3468.84904));
      } catch(ArithmeticException e) {
         //
         // Array sums to zero
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double double0 = MathUtils.scalb(1856.7094579847053, 4097);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double double0 = MathUtils.scalb(0.0, 2954961);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double double0 = MathUtils.nextAfter((byte)1, 2058.7384218107);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double double0 = MathUtils.nextAfter(574.11, 0L);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-9218868437227405313L), (-9218868437227405313L));
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(362880L, 136L);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      int int0 = MathUtils.lcm(0, 0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      short short0 = MathUtils.indicator((short)1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      short short0 = MathUtils.indicator((short) (-1521));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      long long0 = MathUtils.indicator((long) 66);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      long long0 = MathUtils.indicator((-1118L));
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      int int0 = MathUtils.indicator(66);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      double double0 = MathUtils.indicator((-5834.615016));
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      double double0 = MathUtils.indicator(0.0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte)81);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      int int0 = MathUtils.lcm(12, 66);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      int int0 = MathUtils.gcd((-5271), 0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      double double0 = MathUtils.factorialLog(0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialLog((-117));
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!, got n = -117
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      double double0 = MathUtils.factorialDouble(1554);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialDouble((-1129));
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!, got n = -1,129
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial((-1029));
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!, got n = -1,029
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      double double0 = MathUtils.factorialDouble(0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double[]) null, (double[]) null);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(0.0, 0.0, 61);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.equals((-1436.8645253), Double.NaN, 0);
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(1.1102230246251565E-16, 1.1102230246251565E-16, 1.1102230246251565E-16);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((-6143.882096388985), (-6143.882096388985));
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      int int0 = MathUtils.compareTo(6.283185307179586, 1856.7094579847053, 4097);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      int int0 = MathUtils.compareTo(1.0, Double.NEGATIVE_INFINITY, 0.0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientDouble((short)0, 1);
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k), got n = 0, k = 1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(2426, 2426);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(759, 759);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(1176, 0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(0, 0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      long long0 = MathUtils.addAndCheck((long) 0, (long) 0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      long long0 = MathUtils.addAndCheck((long) 0, (-430L));
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      double double0 = MathUtils.log((-85.70563), (-85.70563));
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      double double0 = MathUtils.round((-761.347), (-3686));
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      double double0 = MathUtils.cosh(12);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      float float0 = MathUtils.round(7372.75F, (-2044));
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      double double0 = MathUtils.normalizeAngle(549.5, 305.750216);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      double double0 = MathUtils.sinh((-1926.1368968696));
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      long long0 = MathUtils.addAndCheck((-196L), 681L);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round((float) (short) (-1), (int) (short) (-1), (int) (short) (-1));
      } catch(IllegalArgumentException e) {
         //
         // invalid rounding method -1, valid methods: ROUND_CEILING (2), ROUND_DOWN (1), ROUND_FLOOR (3), ROUND_HALF_DOWN (5), ROUND_HALF_EVEN (6), ROUND_HALF_UP (4), ROUND_UNNECESSARY (7), ROUND_UP (0)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      int int0 = MathUtils.hash(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      int int0 = MathUtils.hash(0.0);
  }
}
