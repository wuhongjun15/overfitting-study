/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 27 03:14:58 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.jmx.JMXConfigurator;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.AbstractPeepholeOptimization;
import com.google.javascript.jscomp.AliasStrings;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.ClosureReverseAbstractInterpreter;
import com.google.javascript.jscomp.CodeChangeHandler;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.CombinedCompilerPass;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.ControlFlowAnalysis;
import com.google.javascript.jscomp.ConvertToDottedProperties;
import com.google.javascript.jscomp.DefaultCodingConvention;
import com.google.javascript.jscomp.GatherRawExports;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSModuleGraph;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.MoveFunctionDeclarations;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.NodeUtil;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.PeepholeFoldConstants;
import com.google.javascript.jscomp.PeepholeFoldWithTypes;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.Result;
import com.google.javascript.jscomp.RuntimeTypeCheck;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.jscomp.SuspiciousPropertiesCheck;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.io.File;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Logger;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeUtil_ESTest extends NodeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NodeUtil.MatchNodeType nodeUtil_MatchNodeType0 = new NodeUtil.MatchNodeType((-3000));
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

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = Node.newString("", 0, 0);
      // Undeclared exception!
      try { 
        NodeUtil.getOpFromAssignmentOp(node0);
      } catch(IllegalArgumentException e) {
         //
         // Not an assiment op
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "";
      DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
      Node node0 = Node.newString(29, "");
      Node node1 = ControlFlowAnalysis.computeFollowNode(node0);
      // Undeclared exception!
      try { 
        NodeUtil.newName(defaultCodingConvention0, "WWDtzz", (Node) null, "nh{pMnK[~}cz Hik4(J");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      int int0 = 102;
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(102);
      } catch(Error e) {
         //
         // Unknown op 102: INC
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node node0 = null;
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
  public void test06()  throws Throwable  {
      Node node0 = Node.newString(1291, "}zow0iGgdfrC>,.a");
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
  public void test07()  throws Throwable  {
      int int0 = 44;
      String string0 = "msg.jsdoc.function.thisnotobject";
      Node node0 = Node.newString("msg.jsdoc.function.thisnotobject");
      Node node1 = NodeUtil.newExpr(node0);
      // Undeclared exception!
      try { 
        NodeUtil.getRootOfQualifiedName(node1);
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = NodeUtil.isSimpleOperatorType((-1431));
      Node node0 = Node.newNumber((double) (-1431));
      Node node1 = null;
      try {
        node1 = new Node((-1431), node0, (Node) null, (-682), 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "";
      Node node0 = Node.newString("");
      Node node1 = node0.getAncestor(0);
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
  public void test10()  throws Throwable  {
      boolean boolean0 = NodeUtil.isValidPropertyName("-8t!Eew");
      String string0 = "";
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream("", "-8t!Eew");
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node[] nodeArray0 = new Node[9];
      nodeArray0[0] = null;
      nodeArray0[1] = null;
      nodeArray0[2] = null;
      nodeArray0[3] = null;
      nodeArray0[4] = null;
      nodeArray0[5] = null;
      nodeArray0[6] = null;
      nodeArray0[7] = null;
      nodeArray0[8] = null;
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
  public void test12()  throws Throwable  {
      Node node0 = Node.newNumber((double) (-5719));
      Node node1 = new Node((-5719), node0, 33, 4);
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForFunction(node1, 0);
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = null;
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
  public void test14()  throws Throwable  {
      Node node0 = new Node(114, 114, 114);
      Node node1 = NodeUtil.getConditionExpression(node0);
      int int0 = 153;
      // Undeclared exception!
      try { 
        node0.addChildrenToBack((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "3=},f";
      // Undeclared exception!
      try { 
        NodeUtil.isNameReferenced((Node) null, "3=},f");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil$MatchNameNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
      Node node0 = NodeUtil.newQualifiedNameNode(defaultCodingConvention0, "*QS]*^~q9^A9", (-4190), 2303);
      Node[] nodeArray0 = new Node[2];
      nodeArray0[0] = node0;
      nodeArray0[1] = node0;
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
  public void test17()  throws Throwable  {
      Node node0 = null;
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
      boolean boolean0 = NodeUtil.isValidPropertyName("strictModuleDepCheck");
      Node node0 = Node.newString("", 127, 40);
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
  public void test19()  throws Throwable  {
      Node node0 = null;
      // Undeclared exception!
      try { 
        NodeUtil.isStatement((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = (-2076);
      Node node0 = new Node((-2076), (-1418), (-1178));
      boolean boolean0 = NodeUtil.isEmptyFunctionExpression(node0);
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
  public void test21()  throws Throwable  {
      Node node0 = null;
      // Undeclared exception!
      try { 
        NodeUtil.getArgumentForFunction((Node) null, 8199);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NodeUtil.MatchNotFunction nodeUtil_MatchNotFunction0 = new NodeUtil.MatchNotFunction();
      Integer integer0 = Level.OFF_INTEGER;
      boolean boolean0 = nodeUtil_MatchNotFunction0.equals(integer0);
      boolean boolean1 = nodeUtil_MatchNotFunction0.equals("");
      Object object0 = new Object();
      boolean boolean2 = nodeUtil_MatchNotFunction0.equals(object0);
      String string0 = ">>=";
      boolean boolean3 = nodeUtil_MatchNotFunction0.equals(">>=");
      Object object1 = new Object();
      boolean boolean4 = nodeUtil_MatchNotFunction0.equals(object1);
      Node node0 = null;
      // Undeclared exception!
      try { 
        nodeUtil_MatchNotFunction0.apply((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NodeUtil.MatchDeclaration nodeUtil_MatchDeclaration0 = new NodeUtil.MatchDeclaration();
      boolean boolean0 = NodeUtil.isAssociative((-278));
      String string0 = "";
      String string1 = "k`BK[s E!";
      MockFile mockFile0 = new MockFile("", "k`BK[s E!");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Compiler compiler0 = null;
      try {
        compiler0 = new Compiler(mockPrintStream0);
      } catch(NoSuchMethodError e) {
         //
         // com.google.common.collect.ImmutableSet.of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/common/collect/ImmutableSet;
         //
         verifyException("com.google.javascript.jscomp.ClosureCodingConvention", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultCodingConvention defaultCodingConvention0 = new DefaultCodingConvention();
      Node node0 = new Node(0);
      Node node1 = ControlFlowAnalysis.computeFollowNode(node0);
      Node node2 = AbstractPeepholeOptimization.validateResult((Node) null);
      // Undeclared exception!
      try { 
        NodeUtil.newQualifiedNameNode((CodingConvention) defaultCodingConvention0, "", (Node) null, "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Node node0 = null;
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
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.precedence(766);
      } catch(Error e) {
         //
         // Unknown precedence for <unknown=766> (type 766)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Node node0 = Node.newString((-5218), "");
      Node node1 = NodeUtil.getPrototypeClassName(node0);
      Node.SideEffectFlags node_SideEffectFlags0 = new Node.SideEffectFlags();
      node_SideEffectFlags0.setAllFlags();
      node_SideEffectFlags0.setMutatesGlobalState();
      node_SideEffectFlags0.setThrows();
      // Undeclared exception!
      try { 
        node0.setSideEffectFlags(node_SideEffectFlags0);
      } catch(IllegalStateException e) {
         //
         // -5218
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Node node0 = Node.newString(0, "poQzYA=L&mc&U");
      String string0 = "JSC_READ_ERROR";
      Node node1 = Node.newString("JSC_READ_ERROR");
      boolean boolean0 = NodeUtil.isGetProp(node0);
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
  public void test29()  throws Throwable  {
      String string0 = "<PaPT^6~Xv3V)%";
      Node node0 = Node.newString("<PaPT^6~Xv3V)%");
      Iterable<Node> iterable0 = node0.children();
      Node node1 = Node.newNumber((-1.0));
      Node node2 = Node.newNumber((-1.0));
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
  public void test30()  throws Throwable  {
      NodeUtil.MatchDeclaration nodeUtil_MatchDeclaration0 = new NodeUtil.MatchDeclaration();
      NodeUtil.MatchNotFunction nodeUtil_MatchNotFunction0 = new NodeUtil.MatchNotFunction();
      Node node0 = new Node((-1710));
      Node node1 = new Node(0, node0, node0, node0, node0);
      // Undeclared exception!
      try { 
        NodeUtil.functionCallHasSideEffects(node1);
      } catch(IllegalStateException e) {
         //
         // Expected CALL node, got EOF
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      Vector<JSType> vector0 = new Vector<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) vector0);
      Node node1 = new Node((-1274), node0, node0, (-419), 12);
      // Undeclared exception!
      try { 
        NodeUtil.callHasLocalResult(node1);
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Node node0 = new Node((-788), (-788), 42);
      node0.setCharno(42);
      // Undeclared exception!
      try { 
        NodeUtil.newFunctionNode("dmLQTZ%:7[OEO;vn", (List<Node>) null, node0, 39, 20);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      Object object0 = new Object();
      boolean boolean0 = nodeUtil_MatchShallowStatement0.equals("\"9p/umD|f.4%AJ+%!B9");
      boolean boolean1 = nodeUtil_MatchShallowStatement0.equals(object0);
      String string0 = null;
      Node node0 = null;
      Integer integer0 = Level.ALL_INTEGER;
      boolean boolean2 = nodeUtil_MatchShallowStatement0.equals(integer0);
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
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement0 = new NodeUtil.MatchShallowStatement();
      NodeUtil.MatchShallowStatement nodeUtil_MatchShallowStatement1 = new NodeUtil.MatchShallowStatement();
      NodeUtil.MatchNodeType nodeUtil_MatchNodeType0 = new NodeUtil.MatchNodeType((-92));
      Node node0 = null;
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
  public void test35()  throws Throwable  {
      Node node0 = null;
      // Undeclared exception!
      try { 
        NodeUtil.isReferenceName((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Node node0 = Node.newString(20, "com.google.javascript.jscomp.DefaultPassConfig$78");
      Node node1 = new Node(1297, node0, node0, node0, 0, 16);
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      boolean boolean0 = NodeUtil.isNameReferenced(node1, "plume.UtilMDE$RemoveFirstAndLastIterator", sourceMap_DetailLevel0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = 2499;
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      Node node0 = null;
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
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(1761);
      } catch(IllegalStateException e) {
         //
         // 1761
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = 1838;
      String string0 = "XVlt!vDjMN{H=\\w";
      Node node0 = null;
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
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        NodeUtil.opToStrNoFail(35);
      } catch(Error e) {
         //
         // Unknown op 35: GETELEM
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Node node0 = null;
      // Undeclared exception!
      try { 
        NodeUtil.isEmptyBlock((Node) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }
}
