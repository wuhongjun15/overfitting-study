/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 03:07:14 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.DefaultCodingConvention;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Node node0 = Node.newNumber((double) 130);
      Node node1 = new Node(130, node0, 1, 0);
      // Undeclared exception!
      try { 
        NodeUtil.getFunctionInfo(node1);
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = Node.newString(2775, "ZtXx#c9FD", (-3483), 2775);
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
  public void test02()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(148, nodeArray0);
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
  public void test03()  throws Throwable  {
      Node node0 = Node.newString((-4268), "-P", (-250), (-310));
      Node node1 = NodeUtil.newUndefinedNode(node0);
      // Undeclared exception!
      try { 
        NodeUtil.getFunctionBody(node1);
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = Node.newString("", 606, 40);
      NodeUtil.MatchNodeType nodeUtil_MatchNodeType0 = new NodeUtil.MatchNodeType(11);
      boolean boolean0 = nodeUtil_MatchNodeType0.apply(node0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = NodeUtil.opToStr(0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Vector<JSType> vector0 = new Vector<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) vector0);
      boolean boolean0 = NodeUtil.isObjectCallMethod(node0, "com.google.javascript.jscomp.NameAnonymousFunctionsMapped");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(7, nodeArray0, 7, 7);
      boolean boolean0 = NodeUtil.isName(node0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, false);
      Stack<JSType> stack0 = new Stack<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) stack0);
      boolean boolean0 = NodeUtil.isFunctionObjectApply(node0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.newQualifiedNameNode((CodingConvention) null, "*%Rj:iosk@~h", 18, 33);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      Node node0 = new Node((-380), 0, 9);
      Node[] nodeArray0 = new Node[5];
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
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.isTryFinallyNode((Node) null, (Node) null);
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
        NodeUtil.isStatementBlock((Node) null);
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
        NodeUtil.isNew((Node) null);
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
        NodeUtil.isLatin((String) null);
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
        NodeUtil.isHoistedFunctionDeclaration((Node) null);
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
        NodeUtil.isFunctionObjectCallOrApply((Node) null);
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
        NodeUtil.isFunctionObjectCall((Node) null);
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
        NodeUtil.isFunction((Node) null);
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
        NodeUtil.isCallOrNew((Node) null);
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
        NodeUtil.isCall((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      // Undeclared exception!
      try { 
        NodeUtil.getNodeTypeReferenceCount((Node) null, 765, compilerOptions0.sourceMapDetailLevel);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil$MatchNodeType", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
      Node node0 = Node.newString((-4268), "-P", (-250), (-310));
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
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      Predicate<Node> predicate0 = PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE;
      // Undeclared exception!
      try { 
        NodeUtil.getCount((Node) null, predicate0, predicate0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForFunction((Node) null, 1472);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Node node0 = Node.newString(1353, "^", 26, 3773);
      Node[] nodeArray0 = new Node[0];
      Node node1 = NodeUtil.newCallNode(node0, nodeArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Vector<JSType> vector0 = new Vector<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) vector0);
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
  public void test34()  throws Throwable  {
      JSDocInfo jSDocInfo0 = NodeUtil.getInfoForNameNode((Node) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Node node0 = new Node(0, 0, 251);
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
  public void test36()  throws Throwable  {
      Node node0 = Node.newString(">>>");
      Node node1 = new Node(123, node0, node0, node0);
      Predicate<Node> predicate0 = PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE;
      int int0 = NodeUtil.getNodeTypeReferenceCount(node1, (-317), predicate0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Node node0 = new Node(2210, 2210, 2210);
      Node node1 = NodeUtil.newUndefinedNode(node0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Node node0 = NodeUtil.newUndefinedNode((Node) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidPropertyName("");
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = NodeUtil.isLatin("]O&Z_");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
      // Undeclared exception!
      try { 
        NodeUtil.newName(defaultCodingConvention0, "8", (Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Node node0 = Node.newString("W|w", 42, 0);
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
  public void test43()  throws Throwable  {
      Node node0 = Node.newString("", 606, 40);
      NodeUtil.copyNameAnnotations(node0, node0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(811);
      } catch(IllegalStateException e) {
         //
         // 811
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }
}
