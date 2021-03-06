/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 05:19:46 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Level;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.AbstractPeepholeOptimization;
import com.google.javascript.jscomp.AstParallelizer;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.ControlFlowAnalysis;
import com.google.javascript.jscomp.DefaultCodingConvention;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSModuleGraph;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.NameReferenceGraph;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.RemoveUnusedVars;
import com.google.javascript.jscomp.RuntimeTypeCheck;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SimpleDefinitionFinder;
import com.google.javascript.jscomp.SourceInformationAnnotator;
import com.google.javascript.jscomp.StrictModeCheck;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.rhino.EvaluatorException;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.Set;
import java.util.Spliterator;
import java.util.Stack;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "8";
      Node node0 = Node.newString("8");
      Node.AncestorIterable node_AncestorIterable0 = node0.getAncestors();
      node0.setVarArgs(true);
      boolean boolean0 = NodeUtil.isFunctionExpression(node0);
      NodeUtil.MatchNodeType nodeUtil_MatchNodeType0 = new NodeUtil.MatchNodeType(39);
      Object object0 = new Object();
      boolean boolean1 = nodeUtil_MatchNodeType0.equals(object0);
      boolean boolean2 = nodeUtil_MatchNodeType0.apply(node0);
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
  public void test01()  throws Throwable  {
      Node node0 = Node.newString("a\".2`B_ydL", 1470, 1470);
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
      Node node0 = null;
      Node[] nodeArray0 = new Node[4];
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
  public void test03()  throws Throwable  {
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
      String string0 = "$1H?p@+d:rE}B=/~@pN";
      Node node0 = NodeUtil.newQualifiedNameNode(defaultCodingConvention0, "$1H?p@+d:rE}B=/~@pN", 813, 813);
      boolean boolean0 = nodeUtil_MatchShallowStatement0.equals("$1H?p@+d:rE}B=/~@pN");
      boolean boolean1 = NodeUtil.isConstantName(node0);
      Node node1 = node0.cloneTree();
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
  public void test04()  throws Throwable  {
      Node node0 = null;
      Node node1 = NodeUtil.newUndefinedNode((Node) null);
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
  public void test05()  throws Throwable  {
      Node node0 = null;
      // Undeclared exception!
      try { 
        NodeUtil.hasFinally((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = new Node((-341));
      DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
      String string0 = "kV%)-f|j&nb6C%-";
      // Undeclared exception!
      try { 
        NodeUtil.getConditionExpression(node0);
      } catch(IllegalStateException e) {
         //
         // -341
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = NodeUtil.isSimpleOperatorType((-1472));
      boolean boolean1 = NodeUtil.isAssociative(111);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      Vector<JSType> vector0 = new Vector<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) vector0);
      Node node1 = ControlFlowAnalysis.computeFallThrough(node0);
      boolean boolean2 = NodeUtil.isGet(node1);
      EvaluatorException evaluatorException0 = simpleErrorReporter0.runtimeError("D0!:", "D0!:", 45, "\"A$&->", 1439);
      node0.addChildToFront(node1);
      boolean boolean3 = NodeUtil.isEmptyFunctionExpression(node1);
      jSTypeRegistry0.resetForTypeCheck();
      Node node2 = null;
      try {
        node2 = new Node(40, node1, node1, 3, 0);
      } catch(IllegalArgumentException e) {
         //
         // first new child has existing parent
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NodeUtil.MatchNotFunction nodeUtil_MatchNotFunction0 = new NodeUtil.MatchNotFunction();
      Node node0 = new Node(132, 132, 132);
      // Undeclared exception!
      try { 
        SimpleDefinitionFinder.getNameNodeFromFunctionNode(node0);
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = null;
      // Undeclared exception!
      try { 
        NodeUtil.isWithinLoop((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node node0 = Node.newNumber(32.0, 2677, 2677);
      boolean boolean0 = NodeUtil.isEmptyFunctionExpression(node0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NodeUtil.MatchNodeType nodeUtil_MatchNodeType0 = new NodeUtil.MatchNodeType(11);
      String string0 = ".r-q";
      Node node0 = Node.newString(800, ".r-q");
      Node.FileLevelJsDocBuilder node_FileLevelJsDocBuilder0 = node0.getJsDocBuilderForNode();
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForCallOrNew(node0, 42);
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NodeUtil.MatchNodeType nodeUtil_MatchNodeType0 = new NodeUtil.MatchNodeType((-2283));
      String string0 = ")}";
      boolean boolean0 = nodeUtil_MatchNodeType0.equals(")}");
      boolean boolean1 = nodeUtil_MatchNodeType0.equals(")}");
      Integer integer0 = Level.ERROR_INTEGER;
      boolean boolean2 = nodeUtil_MatchNodeType0.equals(integer0);
      boolean boolean3 = nodeUtil_MatchNodeType0.equals((Object) null);
      Node node0 = null;
      try {
        node0 = new Node(2989, (Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = null;
      // Undeclared exception!
      try { 
        NodeUtil.isControlStructureCodeBlock((Node) null, (Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Node node0 = null;
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
      Node node0 = null;
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
  public void test16()  throws Throwable  {
      NodeUtil.MatchNotFunction nodeUtil_MatchNotFunction0 = new NodeUtil.MatchNotFunction();
      Node node0 = null;
      try {
        node0 = new Node((-633), (Node) null, (-633), 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = NodeUtil.isLatin("OM+T");
      DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(defaultCodingConvention0, "OM+T", (-2580), (-2580));
      boolean boolean1 = defaultCodingConvention0.isValidEnumKey("OM+T");
      Node node1 = Node.newString("+=zgj\"(DzVp", 583, 29);
      node1.setLineno((-1398));
      boolean boolean2 = NodeUtil.evaluatesToLocalValue(node0);
      Node.FileLevelJsDocBuilder node_FileLevelJsDocBuilder0 = node1.getJsDocBuilderForNode();
      TernaryValue ternaryValue0 = NodeUtil.getBooleanValue(node0);
      boolean boolean3 = NodeUtil.isGetProp(node1);
      boolean boolean4 = NodeUtil.isGet(node1);
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(lightweightMessageFormatter0, (PrintStream) null);
      Compiler compiler0 = null;
      try {
        compiler0 = new Compiler(printStreamErrorManager0);
      } catch(NoSuchMethodError e) {
         //
         // com.google.common.collect.ImmutableSet.of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/common/collect/ImmutableSet;
         //
         verifyException("com.google.javascript.jscomp.ClosureCodingConvention", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
      Node node0 = Node.newString("", (-2270), (-2270));
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForFunction(node0, 46);
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(2, nodeArray0);
      // Undeclared exception!
      try { 
        NodeUtil.isVarArgsFunction(node0);
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = 2671;
      // Undeclared exception!
      try { 
        NodeUtil.precedence(2671);
      } catch(Error e) {
         //
         // Unknown precedence for <unknown=2671> (type 2671)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.precedence(1579);
      } catch(Error e) {
         //
         // Unknown precedence for <unknown=1579> (type 1579)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Node node0 = null;
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
  public void test23()  throws Throwable  {
      int int0 = (-146);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      Node node0 = Node.newNumber(5482.02774888919, 77, 77);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.getExceptionHandler(node0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 352;
      boolean boolean0 = NodeUtil.isSimpleOperatorType(352);
      NodeUtil.MatchDeclaration nodeUtil_MatchDeclaration0 = new NodeUtil.MatchDeclaration();
      GoogleCodingConvention googleCodingConvention0 = null;
      try {
        googleCodingConvention0 = new GoogleCodingConvention();
      } catch(NoSuchMethodError e) {
         //
         // com.google.common.collect.ImmutableSet.of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/common/collect/ImmutableSet;
         //
         verifyException("com.google.javascript.jscomp.ClosureCodingConvention", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Node node0 = Node.newNumber(1151.201);
      Node node1 = Node.newString((-3921), "", 16, 3);
      boolean boolean0 = NodeUtil.containsFunction(node0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Node node0 = null;
      JSDocInfo jSDocInfo0 = NodeUtil.getInfoForNameNode((Node) null);
      // Undeclared exception!
      try { 
        NodeUtil.isSimpleFunctionObjectCall((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Node node0 = new Node(991, 0, 830);
      boolean boolean0 = NodeUtil.isObjectCallMethod(node0, ">>");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      Node node0 = null;
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
  public void test29()  throws Throwable  {
      Node node0 = null;
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
  public void test30()  throws Throwable  {
      boolean boolean0 = NodeUtil.isCommutative((-123));
      Node node0 = Node.newString("[pVrBL~8\"?9AlYM", 0, (-123));
      Node node1 = NodeUtil.newVarNode("[pVrBL~8\"?9AlYM", node0);
      // Undeclared exception!
      try { 
        node0.getChildBefore(node1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
      Node node0 = null;
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
  public void test32()  throws Throwable  {
      Node node0 = null;
      // Undeclared exception!
      try { 
        NodeUtil.mayHaveSideEffects((Node) null);
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
        NodeUtil.newVarNode((String) null, (Node) null);
      } catch(IllegalArgumentException e) {
         //
         // StringNode: str is null
         //
         verifyException("com.google.javascript.rhino.Node$StringNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = NodeUtil.isCommutative((-1779));
      Node node0 = null;
      // Undeclared exception!
      try { 
        NodeUtil.isConstantName((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }
}
