/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 05:29:29 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Vector<JSType> vector0 = new Vector<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) vector0);
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
  public void test01()  throws Throwable  {
      Node node0 = Node.newNumber(53.0, 0, 29);
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
      Node node0 = Node.newString((-76), "8Cy:1s 52Y]Q");
      boolean boolean0 = NodeUtil.isFunctionDeclaration(node0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
      Node node1 = new Node(461845907, node0);
      boolean boolean0 = NodeUtil.isStatementBlock(node1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = new Node(2999, 2999, 2999);
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForCallOrNew(node0, 16);
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Node> linkedList0 = new LinkedList<Node>();
      Node node0 = new Node(0, 0, 0);
      Node node1 = NodeUtil.newFunctionNode("", linkedList0, node0, 83, 35);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Node> linkedList0 = new LinkedList<Node>();
      Node node0 = new Node(0, 0, 0);
      Node node1 = NodeUtil.newFunctionNode("=[wYgyH_4a%", linkedList0, node0, (-114), (-1866));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = NodeUtil.isSimpleOperatorType(414);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Node node0 = Node.newString((-620), "No input to replace: ", (-620), (-620));
      boolean boolean0 = NodeUtil.isName(node0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
      boolean boolean0 = NodeUtil.isFunctionObjectApply(node0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node node0 = Node.newString((-8), "t^");
      boolean boolean0 = NodeUtil.isAssignmentOp(node0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(873);
      } catch(IllegalStateException e) {
         //
         // 873
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.newQualifiedNameNode((CodingConvention) null, "H", (-494), (-494));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = Node.newNumber(2137.6831614);
      Node[] nodeArray0 = new Node[3];
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
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.isVar((Node) null);
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
        NodeUtil.isThis((Node) null);
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
        NodeUtil.isStatementBlock((Node) null);
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
        NodeUtil.isObjectCallMethod((Node) null, "[");
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
        NodeUtil.isNew((Node) null);
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
        NodeUtil.isLoopStructure((Node) null);
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
        NodeUtil.isLhs((Node) null, (Node) null);
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
        NodeUtil.isLatin((String) null);
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
        NodeUtil.isImmutableValue((Node) null);
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
        NodeUtil.isHoistedFunctionDeclaration((Node) null);
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
        NodeUtil.isFunctionDeclaration((Node) null);
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
        NodeUtil.isEmptyFunctionExpression((Node) null);
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
        NodeUtil.isAssignmentOp((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.has((Node) null, (Predicate<Node>) null, (Predicate<Node>) null);
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
        NodeUtil.getRootOfQualifiedName((Node) null);
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
        NodeUtil.getPrototypeClassName((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Node node0 = Node.newNumber(0.0);
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
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.getFunctionName((Node) null);
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
        NodeUtil.getFunctionInfo((Node) null);
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
        NodeUtil.getFnParameters((Node) null);
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
        NodeUtil.getConditionExpression((Node) null);
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
        NodeUtil.getCatchBlock((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Node node0 = new Node(2223);
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
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForCallOrNew((Node) null, (-3813));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
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
  public void test42()  throws Throwable  {
      Node node0 = Node.newString("Wx.Z");
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
  public void test43()  throws Throwable  {
      Node node0 = new Node((-387), (-387), (-387));
      JSDocInfo jSDocInfo0 = NodeUtil.getInfoForNameNode(node0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Node node0 = Node.newNumber(37.0, (-117), (-3240));
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
  public void test45()  throws Throwable  {
      Node node0 = new Node((-3515), (-3515), (-3515));
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
  public void test46()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      Vector<JSType> vector0 = new Vector<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) vector0);
      Node node1 = NodeUtil.newExpr(node0);
      int int0 = NodeUtil.getNameReferenceCount(node1, "");
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      NodeUtil.MatchNodeType nodeUtil_MatchNodeType0 = new NodeUtil.MatchNodeType(204);
      Node node0 = new Node(204, 1104, 204);
      boolean boolean0 = nodeUtil_MatchNodeType0.apply(node0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Node node0 = new Node(1085, (-1928), 2127);
      Node node1 = NodeUtil.newVarNode("", node0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Node node0 = NodeUtil.newVarNode("8Cy:1s 52Y]Q", (Node) null);
      boolean boolean0 = NodeUtil.isFunctionDeclaration(node0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Node node0 = Node.newNumber(37.0, (-117), (-3240));
      Node node1 = NodeUtil.newUndefinedNode(node0);
      // Undeclared exception!
      try { 
        NodeUtil.getFnParameters(node1);
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(0, nodeArray0, 0, (-712));
      Node node1 = NodeUtil.getPrototypeClassName(node0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidPropertyName("");
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      boolean boolean0 = NodeUtil.isLatin("!==");
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Node node0 = Node.newString((-620), "No input to replace: ", (-620), (-620));
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
  public void test55()  throws Throwable  {
      Vector<Node> vector0 = new Vector<Node>(64, 64);
      // Undeclared exception!
      try { 
        NodeUtil.newFunctionNode("", vector0, (Node) null, 922, 922);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Node node0 = new Node(514, 0, 0);
      NodeUtil.copyNameAnnotations(node0, node0);
  }
}
