/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 03:14:26 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Node node0 = Node.newNumber(Double.NaN, 0, 0);
      node0.setType((-1517));
      // Undeclared exception!
      try { 
        NodeUtil.functionCallHasSideEffects(node0);
      } catch(IllegalStateException e) {
         //
         // -1517
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Node node0 = Node.newString("", 85, 85);
      Node node1 = NodeUtil.newVarNode("", node0);
      Node node2 = node0.clonePropsFrom(node1);
      boolean boolean0 = NodeUtil.isObjectLitKey(node2, node1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Node node0 = Node.newNumber(773.845967236434);
      Node node1 = NodeUtil.newUndefinedNode(node0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Node node0 = Node.newString("", 256, 256);
      boolean boolean0 = NodeUtil.isGetProp(node0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Node node0 = Node.newNumber(Double.NaN, 0, 0);
      boolean boolean0 = NodeUtil.isFunction(node0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Node node0 = Node.newString("", 85, 85);
      boolean boolean0 = NodeUtil.isControlStructure(node0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.newExpr((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }
}
