/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 05:37:11 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AstParallelizer;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.ExternExportsPass;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.InferJSDocInfo;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.Result;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.Node;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = NodeUtil.opToStr(0);
      Node node0 = Node.newString(0, "", 0, 0);
      Node node1 = node0.cloneNode();
      boolean boolean0 = NodeUtil.isFunctionExpression(node0);
      boolean boolean1 = NodeUtil.isExprAssign(node1);
      boolean boolean2 = NodeUtil.isFunctionObjectCallOrApply(node0);
      Node.SideEffectFlags node_SideEffectFlags0 = new Node.SideEffectFlags();
      // Undeclared exception!
      try { 
        node0.setSideEffectFlags(node_SideEffectFlags0);
      } catch(IllegalArgumentException e) {
         //
         // setIsNoSideEffectsCall only supports CALL and NEW nodes, got EOF
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Node node0 = Node.newNumber(53.0, 2580, 2580);
      NodeUtil.MatchDeclaration nodeUtil_MatchDeclaration0 = new NodeUtil.MatchDeclaration();
      NodeUtil.MatchNodeType nodeUtil_MatchNodeType0 = new NodeUtil.MatchNodeType(0);
      boolean boolean0 = NodeUtil.has(node0, nodeUtil_MatchDeclaration0, nodeUtil_MatchNodeType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Node node0 = null;
      // Undeclared exception!
      try { 
        NodeUtil.getPrototypePropertyName((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = 1244;
      boolean boolean0 = NodeUtil.isCommutative(1244);
      Compiler compiler0 = null;
      try {
        compiler0 = new Compiler();
      } catch(NoSuchMethodError e) {
         //
         // com.google.common.collect.ImmutableSet.of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/common/collect/ImmutableSet;
         //
         verifyException("com.google.javascript.jscomp.ClosureCodingConvention", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      String string0 = "";
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream("", "");
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }
}
