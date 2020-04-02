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
  public void test000()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[3] = 1;
      int int0 = MathUtils.distanceInf(intArray0, intArray0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 1083893760;
      double double0 = MathUtils.distanceInf(doubleArray0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = 1;
      double double0 = MathUtils.distance(intArray0, intArray0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) (short) (-1);
      double double0 = MathUtils.distance(doubleArray0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = Double.NaN;
      double double0 = MathUtils.distance1(doubleArray0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-2696.2416717);
      double[] doubleArray1 = MathUtils.normalizeArray(doubleArray0, 1240.8557);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      int int0 = MathUtils.indicator(10);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((-380L), 0L);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      double double0 = MathUtils.sinh((-1655.997399348814));
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      double double0 = MathUtils.round(821.221539, 67, 1);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      double double0 = MathUtils.round((double) (byte) (-1), 3740);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, 0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      double double0 = MathUtils.normalizeAngle(0.0, 1.0563534163393342);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      double double0 = MathUtils.normalizeAngle(821.221539, (-1127.374558));
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      int int0 = MathUtils.mulAndCheck((-2496), (-2496));
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      int int0 = MathUtils.hash((double) 0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      int int0 = MathUtils.hash((-3169.08428));
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 1083893760;
      double[] doubleArray1 = new double[5];
      double double0 = MathUtils.distanceInf(doubleArray0, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      long long0 = MathUtils.addAndCheck(0L, (long) (byte)0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      long long0 = MathUtils.addAndCheck((-1015L), (long) 1);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      int int0 = MathUtils.addAndCheck(0, 0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round(0.0, 0, (-1));
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding mode
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.distanceInf((double[]) null, (double[]) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.distance((int[]) null, (int[]) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientDouble((-679), (-1));
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k), got n = -679, k = -1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      double double0 = MathUtils.nextAfter(0.0, 0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(1L, 1007L);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(4503599627370496L, 1L);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      int int0 = MathUtils.mulAndCheck((-1700), 733);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      float float0 = MathUtils.indicator((float) 3740);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(4.9E-324, 4.9E-324, (-3043.1));
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((-366.81865266694), (-1.0), (double) (byte) (-1));
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double) 1007L, (double) (-380L));
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = MathUtils.distance1(doubleArray0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      try { 
        MathUtils.pow(bigInteger0, (-1216L));
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (10^-1,216)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, 0L);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, 2448);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      try { 
        MathUtils.pow((-3704L), (-2131L));
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (-3,704^-2,131)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      long long0 = MathUtils.pow(1L, 10);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      int int0 = MathUtils.pow(2645, (long) 1);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      int int0 = MathUtils.pow(1491, (long) (short)0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      try { 
        MathUtils.pow(2, (int) (byte) (-68));
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (2^-68)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      int int0 = MathUtils.pow(0, 0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      int int0 = MathUtils.subAndCheck(0, 0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      short short0 = MathUtils.sign((short)1825);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      short short0 = MathUtils.sign((short)0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      short short0 = MathUtils.sign((short) (-1));
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      long long0 = MathUtils.sign(0L);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      long long0 = MathUtils.sign((long) (short) (-1));
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      int int0 = MathUtils.sign(0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      int int0 = MathUtils.sign(2);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      float float0 = MathUtils.sign((-3049.6133F));
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      float float0 = MathUtils.sign((float) 1L);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      double double0 = MathUtils.sign((double) (-1372833810));
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte) (-68));
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)28);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1708.9202072393725;
      double[] doubleArray1 = MathUtils.normalizeArray(doubleArray0, 1240.8557);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      try { 
        MathUtils.normalizeArray(doubleArray0, 1240.8557);
      } catch(ArithmeticException e) {
         //
         // Array sums to zero
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      double double0 = MathUtils.scalb(Double.NEGATIVE_INFINITY, 733);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      double double0 = MathUtils.scalb(0.5, 9);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      double double0 = MathUtils.scalb(0.0, 1722);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) 0, (long) 2);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = MathUtils.lcm(1, 0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      short short0 = MathUtils.indicator((short)0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      long long0 = MathUtils.indicator(355687428096000L);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = MathUtils.indicator(0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = MathUtils.indicator((-1089));
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      float float0 = MathUtils.round((-1.0F), 0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      double double0 = MathUtils.indicator((-4700.662348));
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      double double0 = MathUtils.indicator(10.0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte)0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte) (-122));
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      int int0 = MathUtils.lcm((-1089), (-1089));
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialLog((-1464));
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!, got n = -1,464
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialDouble((-2494));
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!, got n = -2,494
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial(1034);
      } catch(ArithmeticException e) {
         //
         // factorial value is too large to fit in a long
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      long long0 = MathUtils.factorial((short)1);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[9];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double) 0L, 0.0, (int) (byte)1);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.equals((double) (-2496), (double) (-2496), 6230016);
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(0.0, 1380.981101893, 1722);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = Double.NaN;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      int int0 = MathUtils.compareTo(2181.05604490635, 2181.05604490635, 493.413343871);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      int int0 = MathUtils.compareTo(0.0, (-2281.338229152787), 2.2250738585072014E-308);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((short) (-1), (short) (-1));
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k), got n = -1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientLog((-3226), (short)1);
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k), got n = -3,226, k = 1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(499, (byte)1);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(0, 0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(0, 0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient(1326524987, 388);
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(0, 0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      long long0 = MathUtils.subAndCheck(355687428096000L, 355687428096000L);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      int int0 = MathUtils.addAndCheck((-137), 66);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      double double0 = MathUtils.log(0.0, 90.2238);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      double double0 = MathUtils.round(0.0, 4133);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      double double0 = MathUtils.cosh(0.0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      float float0 = MathUtils.round(0.0F, 1);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      double double0 = MathUtils.normalizeAngle(271.23332162506154, 0.0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      double double0 = MathUtils.sinh(1722);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      long long0 = MathUtils.addAndCheck((long) 1722, (long) 1722);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round((float) 1L, (-1), 1940);
      } catch(IllegalArgumentException e) {
         //
         // invalid rounding method 1,940, valid methods: ROUND_CEILING (2), ROUND_DOWN (1), ROUND_FLOOR (3), ROUND_HALF_DOWN (5), ROUND_HALF_EVEN (6), ROUND_HALF_UP (4), ROUND_UNNECESSARY (7), ROUND_UP (0)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      int int0 = MathUtils.hash((double) 1722);
  }
}
