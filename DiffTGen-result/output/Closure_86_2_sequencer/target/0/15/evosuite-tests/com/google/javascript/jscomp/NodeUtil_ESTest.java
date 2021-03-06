/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 03:33:20 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.LinkedListMultimap;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.AbstractPeepholeOptimization;
import com.google.javascript.jscomp.AstParallelizer;
import com.google.javascript.jscomp.CheckAccidentalSemicolon;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CheckMissingReturn;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.CodeChangeHandler;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.ControlFlowAnalysis;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.DefaultCodingConvention;
import com.google.javascript.jscomp.DefaultPassConfig;
import com.google.javascript.jscomp.DiagnosticGroups;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.FunctionNames;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.PassConfig;
import com.google.javascript.jscomp.PeepholeFoldWithTypes;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.RecordFunctionInformation;
import com.google.javascript.jscomp.Region;
import com.google.javascript.jscomp.Result;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SourceExcerptProvider;
import com.google.javascript.jscomp.SourceInformationAnnotator;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.jscomp.Tracer;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.jscomp.UnreachableCodeElimination;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.EvaluatorException;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TernaryValue;
import com.google.javascript.rhino.testing.EmptyScope;
import java.io.File;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Node node0 = null;
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedListMultimap<Object, String> linkedListMultimap0 = LinkedListMultimap.create();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "void";
      stringArray0[1] = "";
      stringArray0[2] = "YPNktAr8_x$G";
      stringArray0[3] = "";
      stringArray0[4] = "Internal Error: Don't know how to handle {0}";
      stringArray0[5] = "";
      stringArray0[6] = "";
      ImmutableSet<String> immutableSet0 = ImmutableSet.of(stringArray0);
      List<String> list0 = linkedListMultimap0.replaceValues((Object) null, immutableSet0);
      ImmutableSortedSet<String> immutableSortedSet0 = ImmutableSortedSet.copyOf((Comparator<? super String>) comparator0, (Iterable<? extends String>) list0);
      ImmutableSortedSet<String> immutableSortedSet1 = ImmutableSortedSet.of(stringArray0);
      Stream<String> stream0 = immutableSortedSet0.parallelStream();
      // Undeclared exception!
      try { 
        NodeUtil.isValidDefineValue((Node) null, immutableSortedSet0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
      Node node0 = Node.newString("_Ah#W3HvG0I14>`%", 19, 16);
      Node node1 = NodeUtil.getLoopCodeBlock(node0);
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForFunction((Node) null, (-1));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Node node0 = null;
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForFunction((Node) null, 124);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      Node node0 = new Node(351, 351, (-1681));
      String string0 = "DN&GdQCm";
      node0.addSuppression("DN&GdQCm");
      boolean boolean0 = NodeUtil.isName(node0);
      // Undeclared exception!
      try { 
        NodeUtil.getConditionExpression(node0);
      } catch(IllegalStateException e) {
         //
         // 351
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NodeUtil.MatchDeclaration nodeUtil_MatchDeclaration0 = new NodeUtil.MatchDeclaration();
      PeepholeFoldWithTypes peepholeFoldWithTypes0 = new PeepholeFoldWithTypes();
      int int0 = 304;
      Node node0 = null;
      int int1 = 0;
      Node node1 = null;
      try {
        node1 = new Node(124, (Node) null, (Node) null, 0, 115);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodingConvention codingConvention0 = compilerOptions0.getCodingConvention();
      String string0 = "4lni\"";
      String string1 = "%=";
      Node node0 = Node.newString("%=");
      Node node1 = new Node(115, node0, node0, node0);
      Node node2 = NodeUtil.newExpr(node1);
      // Undeclared exception!
      try { 
        node2.addChildToFront((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "`'l";
      boolean boolean0 = NodeUtil.isValidPropertyName("`'l");
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
  public void test07()  throws Throwable  {
      Node node0 = new Node(41, 41, 41);
      node0.setLineno(41);
      node0.setLineno((-810));
      boolean boolean0 = NodeUtil.nodeTypeMayHaveSideEffects(node0);
      boolean boolean1 = NodeUtil.isCall(node0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Node node0 = null;
      // Undeclared exception!
      try { 
        NodeUtil.containsType((Node) null, 103);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil$MatchNodeType", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = Node.newNumber(2391.445695145619);
      Node node1 = node0.cloneTree();
      Node node2 = node0.removeFirstChild();
      boolean boolean0 = NodeUtil.isEmptyBlock(node0);
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
  public void test10()  throws Throwable  {
      Node node0 = null;
      // Undeclared exception!
      try { 
        NodeUtil.isSimpleOperator((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      int int0 = (-728);
      Node[] nodeArray0 = new Node[7];
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodingConvention codingConvention0 = compilerOptions0.getCodingConvention();
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      Node node0 = Node.newNumber(0.5, (-1594), (-1594));
      Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      // Undeclared exception!
      try { 
        NodeUtil.newQualifiedNameNode((CodingConvention) null, (String) null, node1, "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = ",8uQ$7SF9g+L*m";
      boolean boolean0 = NodeUtil.isLatin(",8uQ$7SF9g+L*m");
      int int0 = 0;
      Node node0 = new Node(0, 0, 0);
      // Undeclared exception!
      try { 
        AbstractPeepholeOptimization.validateResult(node0);
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Node node0 = NodeUtil.newUndefinedNode((Node) null);
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForFunction(node0, 1339);
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Node node0 = null;
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForFunction((Node) null, (-3248));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      Node node0 = Node.newString(0, "<5\u0007E9ls", 0, 0);
      boolean boolean0 = nodeUtil_MatchShallowStatement0.apply(node0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "NvdK.#ur";
      Node node0 = Node.newString("NvdK.#ur", 0, 1524);
      Node node1 = NodeUtil.newUndefinedNode(node0);
      // Undeclared exception!
      try { 
        node0.removeChildAfter(node1);
      } catch(IllegalArgumentException e) {
         //
         // prev is not a child of this node.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = 113;
      Node node0 = Node.newString((-711), "com.google.javascript.jscomp.RuntimeTypeCheck$AddChecks", 0, 113);
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
  public void test19()  throws Throwable  {
      Node node0 = null;
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
  public void test20()  throws Throwable  {
      Node node0 = null;
      // Undeclared exception!
      try { 
        NodeUtil.referencesThis((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil$MatchNodeType", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NodeUtil.MatchNotFunction nodeUtil_MatchNotFunction0 = new NodeUtil.MatchNotFunction();
      CodingConvention codingConvention0 = null;
      String string0 = null;
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
  public void test22()  throws Throwable  {
      DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
      Node node0 = null;
      Node node1 = NodeUtil.newVarNode("z.c?", (Node) null);
      boolean boolean0 = defaultCodingConvention0.isPropertyTestFunction(node1);
      boolean boolean1 = defaultCodingConvention0.isConstantKey("z.c?");
      Node node2 = NodeUtil.newQualifiedNameNode(defaultCodingConvention0, "plume.UtilMDE", 0, 0);
      Node node3 = node2.getAncestor(0);
      List<String> list0 = defaultCodingConvention0.identifyTypeDeclarationCall(node2);
      boolean boolean2 = NodeUtil.isName(node2);
      Node node4 = NodeUtil.newExpr(node2);
      boolean boolean3 = NodeUtil.isControlStructure(node2);
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
  public void test23()  throws Throwable  {
      Node node0 = Node.newNumber(0.0);
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
  public void test24()  throws Throwable  {
      Node node0 = null;
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
  public void test25()  throws Throwable  {
      boolean boolean0 = NodeUtil.isSimpleOperatorType(0);
      ArrayList<Node> arrayList0 = new ArrayList<Node>();
      // Undeclared exception!
      try { 
        NodeUtil.newFunctionNode("", arrayList0, (Node) null, 1896, (-2820));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Node node0 = null;
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
  public void test27()  throws Throwable  {
      Node node0 = Node.newNumber((-790.0), 103, 103);
      Node node1 = Node.newNumber((double) 20);
      TernaryValue ternaryValue0 = NodeUtil.getBooleanValue(node0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Node node0 = Node.newString(0, "?7T;nG[(9#|5MlYt:Y");
      node0.setType(0);
      boolean boolean0 = NodeUtil.containsType(node0, 37);
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
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      boolean boolean0 = false;
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      EvaluatorException evaluatorException0 = simpleErrorReporter0.runtimeError("/Pq.:", "/Pq.:", 0, "/Pq.:", 11);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) arrayList0);
      boolean boolean1 = NodeUtil.isCallOrNew(node0);
      // Undeclared exception!
      try { 
        NodeUtil.getPrototypePropertyName(node0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = NodeUtil.isLatin("");
      Node node0 = Node.newString(1721, "");
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForCallOrNew(node0, (-664));
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      // Undeclared exception!
      try { 
        NodeUtil.newName(defaultCodingConvention0, (String) null, node0);
      } catch(IllegalArgumentException e) {
         //
         // StringNode: str is null
         //
         verifyException("com.google.javascript.rhino.Node$StringNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Node node0 = new Node(945);
      NodeUtil.MatchNodeType nodeUtil_MatchNodeType0 = new NodeUtil.MatchNodeType((-1511));
      boolean boolean0 = NodeUtil.isNameReferenced(node0, "", nodeUtil_MatchNodeType0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Node node0 = null;
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
  public void test35()  throws Throwable  {
      Node node0 = null;
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
}
