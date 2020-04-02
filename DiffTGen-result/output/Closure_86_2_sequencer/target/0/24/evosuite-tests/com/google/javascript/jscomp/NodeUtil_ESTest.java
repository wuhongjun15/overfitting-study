/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 03:38:57 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.DefaultCodingConvention;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Node node0 = new Node(0);
      // Undeclared exception!
      try { 
        NodeUtil.getFunctionInfo(node0);
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = Node.newNumber(100.0, 3802, 3802);
      // Undeclared exception!
      try { 
        NodeUtil.getFnParameters(node0);
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Node node0 = new Node(2367);
      // Undeclared exception!
      try { 
        NodeUtil.getFunctionBody(node0);
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Node node0 = Node.newString(0, "=");
      // Undeclared exception!
      try { 
        NodeUtil.getAssignedValue(node0);
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = new Node(8448, 8448, 1268);
      Node node1 = NodeUtil.newUndefinedNode(node0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = NodeUtil.isSimpleOperatorType(827);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = new Node(8448, 8448, 1268);
      boolean boolean0 = NodeUtil.isFunctionObjectApply(node0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = Node.newString("e[:Ui7 guxh0Tw");
      boolean boolean0 = NodeUtil.isFunction(node0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.removeChild((Node) null, (Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.newVarNode((String) null, (Node) null);
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
        NodeUtil.newQualifiedNameNode((CodingConvention) null, (String) null, 1603, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = Node.newString(1237, "");
      // Undeclared exception!
      try { 
        NodeUtil.newFunctionNode("", (List<Node>) null, node0, 120, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Node node0 = Node.newNumber((-1101.4672), 5178, 0);
      Node[] nodeArray0 = new Node[2];
      nodeArray0[0] = node0;
      // Undeclared exception!
      try { 
        NodeUtil.newCallNode(node0, nodeArray0);
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      // Undeclared exception!
      try { 
        NodeUtil.isValidDefineValue((Node) null, treeSet0);
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
        NodeUtil.isThis((Node) null);
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
        NodeUtil.isString((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.isObjectCallMethod((Node) null, "7{Qus:OlN|P=id*");
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
        NodeUtil.isLatin((String) null);
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
        NodeUtil.isGetOrSetKey((Node) null);
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
        NodeUtil.isForIn((Node) null);
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
        NodeUtil.isExprAssign((Node) null);
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
        NodeUtil.isEmptyFunctionExpression((Node) null);
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
        NodeUtil.isAssignmentOp((Node) null);
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
      // Undeclared exception!
      try { 
        NodeUtil.getRootOfQualifiedName((Node) null);
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
        NodeUtil.getPrototypeClassName((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Node node0 = Node.newString("", (-2196), (-2196));
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
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      Node node0 = Node.newString((-1797), "", (-2750), (-2154));
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
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
      Node node0 = new Node(1816);
      String string0 = NodeUtil.getSourceName(node0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Node node0 = NodeUtil.newUndefinedNode((Node) null);
      // Undeclared exception!
      try { 
        NodeUtil.getFunctionInfo(node0);
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Node node0 = new Node(981, 446, 446);
      // Undeclared exception!
      try { 
        NodeUtil.getFnParameters(node0);
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Node node0 = new Node(1816);
      // Undeclared exception!
      try { 
        NodeUtil.hasCatchHandler(node0);
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Node node0 = Node.newString(2, "");
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
  public void test42()  throws Throwable  {
      Node node0 = Node.newString(129, "");
      // Undeclared exception!
      try { 
        NodeUtil.hasFinally(node0);
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Node node0 = new Node(8448, 8448, 1268);
      NodeUtil.MatchNodeType nodeUtil_MatchNodeType0 = new NodeUtil.MatchNodeType(1);
      int int0 = NodeUtil.getCount(node0, nodeUtil_MatchNodeType0, nodeUtil_MatchNodeType0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Node node0 = NodeUtil.newVarNode("7Db", (Node) null);
      boolean boolean0 = NodeUtil.isNameReferenced(node0, "7Db");
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Node node0 = Node.newString(0, "", (-1243), 2608);
      Node node1 = NodeUtil.newVarNode("", node0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Node node0 = NodeUtil.newUndefinedNode((Node) null);
      JSDocInfo jSDocInfo0 = NodeUtil.getInfoForNameNode(node0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidPropertyName("Easn");
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidPropertyName("mpuS1:_&A1;ifwMS-R");
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      boolean boolean0 = NodeUtil.isLatin("Easn");
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Node node0 = Node.newString(8, ">>", 8, 8);
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
  public void test51()  throws Throwable  {
      DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(defaultCodingConvention0, "-=", 111, 19);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(defaultCodingConvention0, "com.google.javascript.jscomp.StrictModeCheck$NonExternChecks", 1060, 512);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Node node0 = Node.newString(129, "");
      ArrayList<Node> arrayList0 = new ArrayList<Node>();
      Node node1 = NodeUtil.newFunctionNode("r9gW,", arrayList0, node0, 16, 7);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Node node0 = Node.newNumber(0.5);
      NodeUtil.copyNameAnnotations(node0, node0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail((-1743));
      } catch(IllegalStateException e) {
         //
         // -1743
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = NodeUtil.opToStr(1060);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Node node0 = Node.newString((-3463), "typeof");
      boolean boolean0 = NodeUtil.isGetOrSetKey(node0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Node node0 = Node.newString("e[:Ui7 guxh0Tw");
      boolean boolean0 = NodeUtil.isObjectLitKey(node0, node0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Node node0 = Node.newString("e[:Ui7 guxh0Tw");
      boolean boolean0 = NodeUtil.isLhs(node0, node0);
  }
}