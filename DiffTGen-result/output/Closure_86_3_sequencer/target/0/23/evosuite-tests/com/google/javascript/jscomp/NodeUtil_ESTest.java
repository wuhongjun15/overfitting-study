/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 05:19:24 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.DefaultCodingConvention;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Node node0 = Node.newString("");
      Node node1 = new Node(3395, node0);
      // Undeclared exception!
      try { 
        NodeUtil.getCatchBlock(node1);
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = Node.newString("DQ5Q#WVwQ", 0, 0);
      // Undeclared exception!
      try { 
        NodeUtil.getRootOfQualifiedName(node0);
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = NodeUtil.isSimpleOperatorType(65136);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Node node0 = new Node(2593);
      boolean boolean0 = NodeUtil.isGetProp(node0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = Node.newNumber(1257.674335388409, 0, 0);
      boolean boolean0 = NodeUtil.isFunctionObjectCall(node0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node node0 = Node.newString("sign operator");
      boolean boolean0 = NodeUtil.isFunction(node0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = Node.newNumber(1436.304, 2600, 963);
      boolean boolean0 = NodeUtil.isCall(node0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = new Node((-91));
      boolean boolean0 = NodeUtil.isAssignmentOp(node0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.tryMergeBlock((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(defaultCodingConvention0, "L791 +qSG6&}\"", 27591, 27591);
      // Undeclared exception!
      try { 
        NodeUtil.newVarNode((String) null, node0);
      } catch(IllegalArgumentException e) {
         //
         // StringNode: str is null
         //
         verifyException("com.google.javascript.rhino.Node$StringNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.newQualifiedNameNode((CodingConvention) null, (String) null, 92, (-2105));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.newName((CodingConvention) null, "", (Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node[] nodeArray0 = new Node[3];
      // Undeclared exception!
      try { 
        NodeUtil.newCallNode((Node) null, nodeArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.isVarArgsFunction((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.isValidPropertyName((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.TokenStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.isSwitchCase((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.isPrototypePropertyDeclaration((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.isPrototypeProperty((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.isObjectLitKey((Node) null, (Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.isName((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.isGetProp((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.isExprCall((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.isAssignmentOp((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.isAssign((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.hasCatchHandler((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.getStringValue((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Node node0 = new Node(0, (-1239), 0);
      // Undeclared exception!
      try { 
        NodeUtil.getNearestFunctionName(node0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.getLoopCodeBlock((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Node node0 = new Node((-91));
      // Undeclared exception!
      try { 
        NodeUtil.getFunctionName(node0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.getFunctionBody((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.getFnParameters((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.getExpressionBooleanValue((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.getConditionExpression((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.getCatchBlock((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.getAssignedValue((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.evaluatesToLocalValue((Node) null, (Predicate<Node>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.canBeSideEffected((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.callHasLocalResult((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Node node0 = Node.newString("");
      // Undeclared exception!
      try { 
        NodeUtil.getCatchBlock(node0);
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Node node0 = NodeUtil.newVarNode("V~XZ ,J1gJ", (Node) null);
  }
}
